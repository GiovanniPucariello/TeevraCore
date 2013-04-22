package com.izforge.izpack.util;

import org.jasypt.util.text.BasicTextEncryptor;
import com.izforge.izpack.panels.PasswordGroup;
import com.izforge.izpack.panels.ProcessingClient;
import com.izforge.izpack.panels.Validator;

public class JasyptPasswordValidator implements Validator {

	@Override
	public boolean validate(ProcessingClient client) {
        boolean returnValue = true;
        String encryptedPassword = null;
        String key = "teevra";      
        try
        {   
          
            	BasicTextEncryptor encrypter = new BasicTextEncryptor();
            	encrypter.setPassword(key);
            	encryptedPassword = encrypter.encrypt(client.getFieldContents(0)); 
                if (encryptedPassword != null)
                {                	
                    PasswordGroup group = (PasswordGroup) client;
                    group.setModifiedPassword(encryptedPassword);
                }
                else
                {
                    returnValue = false;
                }  
        }
        catch (Exception e)
        {
            Debug.trace("Password Encryption Failed: " + e);
            returnValue = false;
        }
        return (returnValue);
    }

	
}
