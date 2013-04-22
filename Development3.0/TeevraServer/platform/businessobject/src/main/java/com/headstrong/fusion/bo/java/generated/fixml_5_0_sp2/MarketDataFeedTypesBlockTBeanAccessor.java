package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.MarketDataFeedTypesBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:42 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:42 IST 2011")
public class MarketDataFeedTypesBlockTBeanAccessor implements BeanAccessor<MarketDataFeedTypesBlockT> {
	
	private MarketDataFeedTypesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mktDepth".equalsIgnoreCase(accessPath)){
			return this.bean.getMktDepth();
		}
		else if("mDBkTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDBkTyp();
		}
		else if("mDFeedTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDFeedTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mktDepth".equalsIgnoreCase(accessPath)){
			 this.bean.setMktDepth((BigInteger) obj);
			return;
		}
		else if("mDBkTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMDBkTyp((BigInteger) obj);
			return;
		}
		else if("mDFeedTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMDFeedTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MarketDataFeedTypesBlockT obj) {
		this.bean = obj; 
	}

}
