package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.MarketDataRequestMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.MDImplicitDeleteEnumT;
import org.fixprotocol.fixml_5_0_sp2.AggregatedBookEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:40 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:40 IST 2011")
public class MarketDataRequestMessageTBeanAccessor implements BeanAccessor<MarketDataRequestMessageT> {
	
	private MarketDataRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("aggBook".equalsIgnoreCase(accessPath)){
			return this.bean.getAggBook();
		}
		else if("scope".equalsIgnoreCase(accessPath)){
			return this.bean.getScope();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("implctDel".equalsIgnoreCase(accessPath)){
			return this.bean.getImplctDel();
		}
		else if("trdSes".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSes();
		}
		else if("updtTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getUpdtTyp();
		}
		else if("applQuActn".equalsIgnoreCase(accessPath)){
			return this.bean.getApplQuActn();
		}
		else if("instReq".equalsIgnoreCase(accessPath)){
			return this.bean.getInstReq();
		}
		else if("mDQteTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDQteTyp();
		}
		else if("mktDepth".equalsIgnoreCase(accessPath)){
			return this.bean.getMktDepth();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		else if("applQuMax".equalsIgnoreCase(accessPath)){
			return this.bean.getApplQuMax();
		}
		else if("req".equalsIgnoreCase(accessPath)){
			return this.bean.getReq();
		}
		else if("openClsSettlFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getOpenClsSettlFlag();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("applQuActn".equalsIgnoreCase(accessPath)){
			 this.bean.setApplQuActn((BigInteger) obj);
			return;
		}
		else if("aggBook".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setAggBook(AggregatedBookEnumT.valueOf(obj.toString()));
			return;
		}
		else if("mDQteTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMDQteTyp((BigInteger) obj);
			return;
		}
		else if("mktDepth".equalsIgnoreCase(accessPath)){
			 this.bean.setMktDepth((BigInteger) obj);
			return;
		}
		else if("scope".equalsIgnoreCase(accessPath)){
			 this.bean.setScope((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("implctDel".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setImplctDel(MDImplicitDeleteEnumT.valueOf(obj.toString()));
			return;
		}
		else if("applQuMax".equalsIgnoreCase(accessPath)){
			 this.bean.setApplQuMax((BigInteger) obj);
			return;
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSubReqTyp((String) obj);
			return;
		}
		else if("updtTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setUpdtTyp((BigInteger) obj);
			return;
		}
		else if("openClsSettlFlag".equalsIgnoreCase(accessPath)){
			 this.bean.setOpenClsSettlFlag((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MarketDataRequestMessageT obj) {
		this.bean = obj; 
	}

}
