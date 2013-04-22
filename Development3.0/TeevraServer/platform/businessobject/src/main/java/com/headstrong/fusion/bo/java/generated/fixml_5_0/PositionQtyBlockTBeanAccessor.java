package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.PositionQtyBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.PosTypeEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:40 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:40 IST 2010")
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
			this.bean.setTyp(PosTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("long".equalsIgnoreCase(accessPath)){
			this.bean.setLong((BigDecimal) obj);
			return;
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			this.bean.setStat((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PositionQtyBlockT obj) {
		this.bean = obj; 
	}

}
