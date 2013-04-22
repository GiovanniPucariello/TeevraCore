package com.headstrong.fusion.messaging.model.endpoint.binding;

import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.Message;
import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.strategy.GenericFileExpressionRenamer;
import org.apache.camel.util.ObjectHelper;

public class MCHGenericFileExpressionRenamer<T> extends GenericFileExpressionRenamer<T> {

	private Expression expression;

    public MCHGenericFileExpressionRenamer() {
    }

    public MCHGenericFileExpressionRenamer(Expression expression) {
        this.expression = expression;
    }

    public GenericFile<T> renameFile(Exchange exchange, GenericFile<T> file) {
        ObjectHelper.notNull(expression, "expression");
        Message message = exchange.getIn();

        //Get the unique file name from header
        String newName = (String) message.getHeader("MCHCamelFileName");
        
        //Get the source end point directory path
		String path = file.getEndpointPath();
		
        GenericFile<T> result = file.copyFrom(file);
        result.changeFileName(path + "/" + ".camel" + "/" +newName);
        return result;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }  
	
	
	
}
