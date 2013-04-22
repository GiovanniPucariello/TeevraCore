package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.PositionQtyBlockT;
import org.fixprotocol.fixml_5_0_sp2.PosTypeEnumT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:42 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:42 IST 2011")
public class PositionQtyBlockTBeanAccessor implements BeanAccessor<PositionQtyBlockT> {
	
	private PositionQtyBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("short".equalsIgnoreCase(accessPath)){
			return this.bean.getShort();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("qtyDt".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyDt();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("long".equalsIgnoreCase(accessPath)){
			return this.bean.getLong();
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			return this.bean.getStat();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("short".equalsIgnoreCase(accessPath)){
			 this.bean.setShort((BigDecimal) obj);
			return;
		}
		else if("qtyDt".equalsIgnoreCase(accessPath)){
			 this.bean.setQtyDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setTyp(PosTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("long".equalsIgnoreCase(accessPath)){
			 this.bean.setLong((BigDecimal) obj);
			return;
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			 this.bean.setStat((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PositionQtyBlockT obj) {
		this.bean = obj; 
	}

}
