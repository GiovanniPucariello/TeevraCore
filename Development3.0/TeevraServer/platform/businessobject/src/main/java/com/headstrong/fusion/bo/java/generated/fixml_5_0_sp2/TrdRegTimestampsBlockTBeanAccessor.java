package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.TrdRegTimestampsBlockT;
import org.fixprotocol.fixml_5_0_sp2.CustOrderHandlingInstEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.DeskTypeEnumT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:42 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:42 IST 2011")
public class TrdRegTimestampsBlockTBeanAccessor implements BeanAccessor<TrdRegTimestampsBlockT> {
	
	private TrdRegTimestampsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("dskTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getDskTyp();
		}
		else if("tS".equalsIgnoreCase(accessPath)){
			return this.bean.getTS();
		}
		else if("dskOrdHndlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getDskOrdHndlInst();
		}
		else if("src".equalsIgnoreCase(accessPath)){
			return this.bean.getSrc();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("dskTypSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getDskTypSrc();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("dskTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setDskTyp(DeskTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("tS".equalsIgnoreCase(accessPath)){
			 this.bean.setTS((XMLGregorianCalendar) obj);
			return;
		}
		else if("dskOrdHndlInst".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setDskOrdHndlInst(CustOrderHandlingInstEnumT.valueOf(obj.toString()));
			return;
		}
		else if("src".equalsIgnoreCase(accessPath)){
			 this.bean.setSrc((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((BigInteger) obj);
			return;
		}
		else if("dskTypSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setDskTypSrc((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TrdRegTimestampsBlockT obj) {
		this.bean = obj; 
	}

}
