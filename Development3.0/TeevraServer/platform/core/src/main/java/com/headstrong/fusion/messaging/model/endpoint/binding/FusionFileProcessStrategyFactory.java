package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.io.File;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Expression;
import org.apache.camel.component.file.GenericFileExclusiveReadLockStrategy;
import org.apache.camel.component.file.GenericFileProcessStrategy;
import org.apache.camel.component.file.strategy.FileChangedExclusiveReadLockStrategy;
import org.apache.camel.component.file.strategy.FileLockExclusiveReadLockStrategy;
import org.apache.camel.component.file.strategy.GenericFileDeleteProcessStrategy;
import org.apache.camel.component.file.strategy.GenericFileExpressionRenamer;
import org.apache.camel.component.file.strategy.GenericFileRenameExclusiveReadLockStrategy;
import org.apache.camel.component.file.strategy.GenericFileRenameProcessStrategy;
import org.apache.camel.component.file.strategy.MarkerFileExclusiveReadLockStrategy;
import org.apache.camel.spi.Language;
import org.apache.camel.util.ObjectHelper;

public final class FusionFileProcessStrategyFactory {

    private FusionFileProcessStrategyFactory() {
    }

    public static GenericFileProcessStrategy<File> createGenericFileProcessStrategy(CamelContext context, Map<String, Object> params) {

        // We assume a value is present only if its value not null for String and 'true' for boolean
        Expression moveExpression = (Expression) params.get("move");
        Expression moveFailedExpression = (Expression) params.get("moveFailed");
        Expression preMoveExpression = (Expression) params.get("preMove");
        boolean isNoop = params.get("noop") != null;
        boolean isDelete = params.get("delete") != null;
        boolean isMove = moveExpression != null || preMoveExpression != null || moveFailedExpression != null;

        if (isDelete) {
            GenericFileDeleteProcessStrategy<File> strategy = new GenericFileDeleteProcessStrategy<File>();
            strategy.setExclusiveReadLockStrategy(getExclusiveReadLockStrategy(params));
            if (preMoveExpression != null) {
            	MCHGenericFileExpressionRenamer<File> renamer = new MCHGenericFileExpressionRenamer<File>();
                renamer.setExpression(preMoveExpression);
                strategy.setBeginRenamer(renamer);
            }
            if (moveFailedExpression != null) {
            	MCHGenericFileExpressionRenamer<File> renamer = new MCHGenericFileExpressionRenamer<File>();
                renamer.setExpression(moveFailedExpression);
                strategy.setFailureRenamer(renamer);
            }
            return strategy;
        } else if (isMove || isNoop) {
            GenericFileRenameProcessStrategy<File> strategy = new GenericFileRenameProcessStrategy<File>();
            strategy.setExclusiveReadLockStrategy(getExclusiveReadLockStrategy(params));
            if (!isNoop) {
                // move on commit is only possible if not noop
                if (moveExpression != null) {
                	MCHGenericFileExpressionRenamer<File> renamer = new MCHGenericFileExpressionRenamer<File>();
                    renamer.setExpression(moveExpression);
                    strategy.setCommitRenamer(renamer);
                } else {
                    strategy.setCommitRenamer(getDefaultCommitRenamer(context));
                }
            }
            // both move and noop supports pre move
            if (preMoveExpression != null) {
            	MCHGenericFileExpressionRenamer<File> renamer = new MCHGenericFileExpressionRenamer<File>();
                renamer.setExpression(preMoveExpression);
                strategy.setBeginRenamer(renamer);
            }
            // both move and noop supports move failed
            if (moveFailedExpression != null) {
                MCHGenericFileExpressionRenamer<File> renamer = new MCHGenericFileExpressionRenamer<File>();
                renamer.setExpression(moveFailedExpression);
                strategy.setFailureRenamer(renamer);
            }
            return strategy;
        } else {
            // default strategy will move files in a .camel/ subfolder where the file was consumed
            GenericFileRenameProcessStrategy<File> strategy = new GenericFileRenameProcessStrategy<File>();
            strategy.setExclusiveReadLockStrategy(getExclusiveReadLockStrategy(params));
            strategy.setCommitRenamer(getDefaultCommitRenamer(context));
            return strategy;
        }
    }

    private static GenericFileExpressionRenamer<File> getDefaultCommitRenamer(CamelContext context) {
        // use context to lookup language to let it be loose coupled
        Language language = context.resolveLanguage("file");
//        Expression expression = language.createExpression("${file:parent}/.camel/${file:onlyname}");
        Expression expression = language.createExpression("${file:parent}/.camel/${file:onlyname}");
        return new MCHGenericFileExpressionRenamer<File>(expression);
    }

    @SuppressWarnings("unchecked")
    private static GenericFileExclusiveReadLockStrategy<File> getExclusiveReadLockStrategy(Map<String, Object> params) {
        GenericFileExclusiveReadLockStrategy<File> strategy = (GenericFileExclusiveReadLockStrategy<File>) params.get("exclusiveReadLockStrategy");
        if (strategy != null) {
            return strategy;
        }

        // no explicit strategy set then fallback to readLock option
        String readLock = (String) params.get("readLock");
        if (ObjectHelper.isNotEmpty(readLock)) {
            if ("none".equals(readLock) || "false".equals(readLock)) {
                return null;
            } else if ("fileLock".equals(readLock)) {
                GenericFileExclusiveReadLockStrategy<File> readLockStrategy = new FileLockExclusiveReadLockStrategy();
                Long timeout = (Long) params.get("readLockTimeout");
                if (timeout != null) {
                    readLockStrategy.setTimeout(timeout);
                }
                Long checkInterval = (Long) params.get("readLockCheckInterval");
                if (checkInterval != null) {
                    readLockStrategy.setCheckInterval(checkInterval);
                }
                return readLockStrategy;
            } else if ("rename".equals(readLock)) {
                GenericFileExclusiveReadLockStrategy<File> readLockStrategy = new GenericFileRenameExclusiveReadLockStrategy<File>();
                Long timeout = (Long) params.get("readLockTimeout");
                if (timeout != null) {
                    readLockStrategy.setTimeout(timeout);
                }
                Long checkInterval = (Long) params.get("readLockCheckInterval");
                if (checkInterval != null) {
                    readLockStrategy.setCheckInterval(checkInterval);
                }
                return readLockStrategy;
            } else if ("changed".equals(readLock)) {
                GenericFileExclusiveReadLockStrategy<File> readLockStrategy = new FileChangedExclusiveReadLockStrategy();
                Long timeout = (Long) params.get("readLockTimeout");
                if (timeout != null) {
                    readLockStrategy.setTimeout(timeout);
                }
                Long checkInterval = (Long) params.get("readLockCheckInterval");
                if (checkInterval != null) {
                    readLockStrategy.setCheckInterval(checkInterval);
                }
                return readLockStrategy;
            } else if ("markerFile".equals(readLock)) {
                return new MarkerFileExclusiveReadLockStrategy();
            }
        }

        return null;
    }
}
