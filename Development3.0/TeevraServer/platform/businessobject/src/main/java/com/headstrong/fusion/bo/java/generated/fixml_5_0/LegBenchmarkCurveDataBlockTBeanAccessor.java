package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.LegBenchmarkCurveDataBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.BenchmarkCurveNameEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class LegBenchmarkCurveDataBlockTBeanAccessor implements BeanAccessor<LegBenchmarkCurveDataBlockT> {
	
	private LegBenchmarkCurveDataBlockT bean;
	
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
		else if("name".equalsIgnoreCase(accessPath)){
			return this.bean.getName();
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
		else if("name".equalsIgnoreCase(accessPath)){
			this.bean.setName(BenchmarkCurveNameEnumT.valueOf(obj.toString()));
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(LegBenchmarkCurveDataBlockT obj) {
		this.bean = obj; 
	}

}
