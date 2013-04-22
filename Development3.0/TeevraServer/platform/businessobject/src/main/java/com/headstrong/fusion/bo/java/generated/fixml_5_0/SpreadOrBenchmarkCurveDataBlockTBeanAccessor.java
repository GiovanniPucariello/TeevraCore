package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.SpreadOrBenchmarkCurveDataBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.BenchmarkCurveNameEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class SpreadOrBenchmarkCurveDataBlockTBeanAccessor implements BeanAccessor<SpreadOrBenchmarkCurveDataBlockT> {
	
	private SpreadOrBenchmarkCurveDataBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("point".equalsIgnoreCase(accessPath)){
			return this.bean.getPoint();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("secID".equalsIgnoreCase(accessPath)){
			return this.bean.getSecID();
		}
		else if("name".equalsIgnoreCase(accessPath)){
			return this.bean.getName();
		}
		else if("secIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getSecIDSrc();
		}
		else if("spread".equalsIgnoreCase(accessPath)){
			return this.bean.getSpread();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("point".equalsIgnoreCase(accessPath)){
			this.bean.setPoint((String) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			this.bean.setCcy((String) obj);
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			this.bean.setPxTyp((Integer) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("secID".equalsIgnoreCase(accessPath)){
			this.bean.setSecID((String) obj);
			return;
		}
		else if("name".equalsIgnoreCase(accessPath)){
			this.bean.setName(BenchmarkCurveNameEnumT.valueOf(obj.toString()));
			return;
		}
		else if("secIDSrc".equalsIgnoreCase(accessPath)){
			this.bean.setSecIDSrc((String) obj);
			return;
		}
		else if("spread".equalsIgnoreCase(accessPath)){
			this.bean.setSpread((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SpreadOrBenchmarkCurveDataBlockT obj) {
		this.bean = obj; 
	}

}
