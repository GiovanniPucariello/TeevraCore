package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.DisplayInstructionBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class DisplayInstructionBlockTBeanAccessor implements BeanAccessor<DisplayInstructionBlockT> {
	
	private DisplayInstructionBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("dspWhn".equalsIgnoreCase(accessPath)){
			return this.bean.getDspWhn();
		}
		else if("displayQty".equalsIgnoreCase(accessPath)){
			return this.bean.getDisplayQty();
		}
		else if("dsplLwQty".equalsIgnoreCase(accessPath)){
			return this.bean.getDsplLwQty();
		}
		else if("dspMthd".equalsIgnoreCase(accessPath)){
			return this.bean.getDspMthd();
		}
		else if("secDspQty".equalsIgnoreCase(accessPath)){
			return this.bean.getSecDspQty();
		}
		else if("rfrshQty".equalsIgnoreCase(accessPath)){
			return this.bean.getRfrshQty();
		}
		else if("displayHighQty".equalsIgnoreCase(accessPath)){
			return this.bean.getDisplayHighQty();
		}
		else if("dspMinIncr".equalsIgnoreCase(accessPath)){
			return this.bean.getDspMinIncr();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("dspWhn".equalsIgnoreCase(accessPath)){
			 this.bean.setDspWhn((String) obj);
			return;
		}
		else if("displayQty".equalsIgnoreCase(accessPath)){
			 this.bean.setDisplayQty((BigDecimal) obj);
			return;
		}
		else if("dsplLwQty".equalsIgnoreCase(accessPath)){
			 this.bean.setDsplLwQty((BigDecimal) obj);
			return;
		}
		else if("dspMthd".equalsIgnoreCase(accessPath)){
			 this.bean.setDspMthd((String) obj);
			return;
		}
		else if("secDspQty".equalsIgnoreCase(accessPath)){
			 this.bean.setSecDspQty((BigDecimal) obj);
			return;
		}
		else if("rfrshQty".equalsIgnoreCase(accessPath)){
			 this.bean.setRfrshQty((BigDecimal) obj);
			return;
		}
		else if("displayHighQty".equalsIgnoreCase(accessPath)){
			 this.bean.setDisplayHighQty((BigDecimal) obj);
			return;
		}
		else if("dspMinIncr".equalsIgnoreCase(accessPath)){
			 this.bean.setDspMinIncr((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(DisplayInstructionBlockT obj) {
		this.bean = obj; 
	}

}
