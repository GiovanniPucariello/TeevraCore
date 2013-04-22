package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.UserRequestMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class UserRequestMessageTBeanAccessor implements BeanAccessor<UserRequestMessageT> {
	
	private UserRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("username".equalsIgnoreCase(accessPath)){
			return this.bean.getUsername();
		}
		else if("encPwdMethod".equalsIgnoreCase(accessPath)){
			return this.bean.getEncPwdMethod();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("newPassword".equalsIgnoreCase(accessPath)){
			return this.bean.getNewPassword();
		}
		else if("rawData".equalsIgnoreCase(accessPath)){
			return this.bean.getRawData();
		}
		else if("rawDataLength".equalsIgnoreCase(accessPath)){
			return this.bean.getRawDataLength();
		}
		else if("userReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getUserReqTyp();
		}
		else if("encNewPwd".equalsIgnoreCase(accessPath)){
			return this.bean.getEncNewPwd();
		}
		else if("userReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getUserReqID();
		}
		else if("password".equalsIgnoreCase(accessPath)){
			return this.bean.getPassword();
		}
		else if("encPwd".equalsIgnoreCase(accessPath)){
			return this.bean.getEncPwd();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("username".equalsIgnoreCase(accessPath)){
			 this.bean.setUsername((String) obj);
			return;
		}
		else if("encPwdMethod".equalsIgnoreCase(accessPath)){
			 this.bean.setEncPwdMethod((BigInteger) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("newPassword".equalsIgnoreCase(accessPath)){
			 this.bean.setNewPassword((String) obj);
			return;
		}
		else if("rawData".equalsIgnoreCase(accessPath)){
			 this.bean.setRawData((String) obj);
			return;
		}
		else if("rawDataLength".equalsIgnoreCase(accessPath)){
			 this.bean.setRawDataLength((BigInteger) obj);
			return;
		}
		else if("userReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setUserReqTyp((BigInteger) obj);
			return;
		}
		else if("encNewPwd".equalsIgnoreCase(accessPath)){
			 this.bean.setEncNewPwd((String) obj);
			return;
		}
		else if("userReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setUserReqID((String) obj);
			return;
		}
		else if("encPwd".equalsIgnoreCase(accessPath)){
			 this.bean.setEncPwd((String) obj);
			return;
		}
		else if("password".equalsIgnoreCase(accessPath)){
			 this.bean.setPassword((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(UserRequestMessageT obj) {
		this.bean = obj; 
	}

}
