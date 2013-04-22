package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.file.FileConsumer;
import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileEndpoint;
import org.apache.camel.component.file.GenericFileExist;
import org.apache.camel.component.file.GenericFileOperations;
import org.apache.camel.component.file.GenericFileProcessStrategy;
import org.apache.camel.component.file.GenericFileProducer;
import org.apache.camel.processor.idempotent.MemoryIdempotentRepository;
import org.apache.camel.util.FileUtil;
import org.apache.camel.util.ObjectHelper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCHFileEndPoint<T> extends GenericFileEndpoint<File> {
	
	private static final Logger logger = LoggerFactory
	.getLogger(MCHFileEndPoint.class);

    private FusionFileOperations operations = new FusionFileOperations(this);
    private File file;
    private boolean copyAndDeleteOnRenameFail = true;
    
    /* * The delay.
	 */
	private long delay;
	
	private String fileType="string";
	
	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

    public MCHFileEndPoint() {
        // use marker file as default exclusive read locks
        this.readLock = "markerFile";
    }

    public MCHFileEndPoint(String endpointUri, Component component) {
        super(endpointUri, component);
        // use marker file as default exclusive read locks
        this.readLock = "markerFile";
    }

    public MCHFileConsumer createConsumer(Processor processor) throws Exception {
        ObjectHelper.notNull(operations, "operations");
        ObjectHelper.notNull(file, "file");

        // auto create starting directory if needed
        if (!file.exists() && !file.isDirectory()) {
            if (isAutoCreate()) {
                log.debug("Creating non existing starting directory: {}", file);
                boolean absolute = FileUtil.isAbsolute(file);
                boolean created = operations.buildDirectory(file.getPath(), absolute);
                if (!created) {
                    log.warn("Cannot auto create starting directory: {}", file);
                }
            } else if (isStartingDirectoryMustExist()) {
                throw new FileNotFoundException("Starting directory does not exist: " + file);
            }
        }

        MCHFileConsumer result = newFileConsumer(processor, operations);

        if (isDelete() && getMove() != null) {
            throw new IllegalArgumentException("You cannot set both delete=true and move options");
        }

        // if noop=true then idempotent should also be configured
        if (isNoop() && !(isIdempotent()!= null)) {
            log.info("Endpoint is configured with noop=true so forcing endpoint to be idempotent as well");
            setIdempotent(true);
        }

        // if idempotent and no repository set then create a default one
        if ((isIdempotent()!= null) && isIdempotent() && idempotentRepository == null) {
            log.info("Using default memory based idempotent repository with cache max size: " + DEFAULT_IDEMPOTENT_CACHE_SIZE);
            idempotentRepository = MemoryIdempotentRepository.memoryIdempotentRepository(DEFAULT_IDEMPOTENT_CACHE_SIZE);
        }

        // set max messages per poll
        result.setMaxMessagesPerPoll(getMaxMessagesPerPoll());

        configureConsumer(result);
        return result;
    }

    public GenericFileProducer<File> createProducer() throws Exception {
        ObjectHelper.notNull(operations, "operations");

        // you cannot use temp prefix and file exists append
        if (getFileExist() == GenericFileExist.Append && getTempPrefix() != null) {
            throw new IllegalArgumentException("You cannot set both fileExist=Append and tempPrefix options");
        }

        return new MCHFileProducer(this, operations);
    }

    public Exchange createExchange(GenericFile<File> file) {
        Exchange exchange =  createExchange();
        if (file != null) {
            file.bindToExchange(exchange);
        }
        return exchange;
    }

    
    public void configureMessage(GenericFile<File> file, Message message) {
    	
    	 message.setBody(file);

    	 String relativePath = file.getAbsoluteFilePath().substring(getFile().getPath().length());
//    	 String relativePath = file.getPath().substring(getFile().getPath().length());
         if (relativePath.startsWith(File.separator) || relativePath.startsWith("/")) {
             relativePath = relativePath.substring(1);
         }
         Random randomNumber = new Random();
         Calendar cal = Calendar.getInstance();
 		 SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
 		 String date = sdf.format(cal.getTime());
 		 sdf = new SimpleDateFormat("hh:mm:ss:SSS");
 		 String time = sdf.format(cal.getTime()).replace(":", "");
 		 String append = date + time + "_"+randomNumber.nextInt(10);
 		 
 		 String fileName = relativePath.split("\\.")[0];
	  	 String fileExtention = relativePath.split("\\.")[1];	
	  	 
	  	 String newFileName = fileName + "_" + append + "."+fileExtention;
		
	  	 String absolutePath = file.getEndpointPath();
 		 
 		 if (this.getFileType().toString().equalsIgnoreCase("camel file path")) {
 			 
 			message.setHeader("MCHCamelFileName", newFileName);
 			message.setHeader("CamelFileName", newFileName);

 			
	 		 } else {
	 			 
		 			message.setBody(file);
		 			// Use file separator to support all file systems.
			 			if(StringUtils.countMatches(relativePath, ".")>0){
				
						message.setHeader("fileReadTimestamp", append);
						message.setHeader("originalFileName", relativePath);
						//message.setHeader(Exchange.FILE_NAME,relativePath + "_" + append + "."+fileExtention);
						//relativePath=fileName + "_" + append + "."+fileExtention;
					
						message.setHeader("MCHCamelFileName", newFileName);
						message.setHeader("CamelFileName", newFileName);
					}else{
						message.setHeader("file",file);
						message.setHeader("fileReadTimestamp", append);
						message.setHeader("originalFileName", relativePath);
			
						message.setHeader("MCHCamelFileName", newFileName);
						message.setHeader("CamelFileName", newFileName);
						//relativePath=relativePath + "_" + append;
					}
		       // message.setHeader(Exchange.FILE_NAME, relativePath);
		        logger.info("File read timestamp" + message.getHeader("fileReadTimestamp"));
		        logger.info("File read timestamp" + message.getHeader("originalFileName"));
		      // logger.info("File read timestamp" + message.getHeader("org.apache.camel.file.name"));
		       
				
	
	 		}
    	 
    	 
    	 
         
    	 
    //	 String name = null;
    	 
    //	 message.setHeader(Exchange.FILE_NAME, name);
         
    	
    	
    }
    
    
    /**
     * Strategy to create a new {@link FileConsumer}
     *
     * @param processor  the given processor
     * @param operations file operations
     * @return the created consumer
     */
    protected MCHFileConsumer newFileConsumer(Processor processor, GenericFileOperations<File> operations) {
        return new MCHFileConsumer(this, processor, operations);
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
        // update configuration as well
        getConfiguration().setDirectory(file.getPath());
    }

    @Override
    public String getScheme() {
        return "file";
    }

    @Override
    protected String createEndpointUri() {
        return getFile().toURI().toString();
    }

    @Override
    public char getFileSeparator() {       
        return File.separatorChar;
    }

    @Override
    public boolean isAbsolute(String name) {
        // relative or absolute path?
        return FileUtil.isAbsolute(new File(name));
    }

    public boolean isCopyAndDeleteOnRenameFail() {
        return copyAndDeleteOnRenameFail;
    }

    public void setCopyAndDeleteOnRenameFail(boolean copyAndDeleteOnRenameFail) {
        this.copyAndDeleteOnRenameFail = copyAndDeleteOnRenameFail;
    }
    
    public long getDelay() {
		return delay;
	}
    
	public void setDelay(long delay) {
		this.delay = delay;
	}
	
	protected GenericFileProcessStrategy<File> createGenericFileStrategy() {
		return	 FusionFileProcessStrategyFactory.createGenericFileProcessStrategy(getCamelContext(),getParamsAsMap());

	}
}
