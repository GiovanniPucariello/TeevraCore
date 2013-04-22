package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.MarketDataFeedTypesBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
