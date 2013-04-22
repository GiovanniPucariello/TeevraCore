package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.TrdRegTimestampsBlockT;
import org.fixprotocol.fixml_5_0.DeskTypeEnumT;
import org.fixprotocol.fixml_5_0.DeskOrderHandlingInstEnumT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
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
			this.bean.setDskTyp(DeskTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("tS".equalsIgnoreCase(accessPath)){
			this.bean.setTS((XMLGregorianCalendar) obj);
			return;
		}
		else if("dskOrdHndlInst".equalsIgnoreCase(accessPath)){
			this.bean.setDskOrdHndlInst(DeskOrderHandlingInstEnumT.valueOf(obj.toString()));
			return;
		}
		else if("src".equalsIgnoreCase(accessPath)){
			this.bean.setSrc((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			this.bean.setTyp((Integer) obj);
			return;
		}
		else if("dskTypSrc".equalsIgnoreCase(accessPath)){
			this.bean.setDskTypSrc((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TrdRegTimestampsBlockT obj) {
		this.bean = obj; 
	}

}
