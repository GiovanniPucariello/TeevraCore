package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.AdvertisementMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.AdvTransTypeEnumT;
import com.headstrong.teevra_fixml_1_0.AdvSideEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class AdvertisementMessageTBeanAccessor implements BeanAccessor<AdvertisementMessageT> {
	
	private AdvertisementMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("lastMkt".equalsIgnoreCase(accessPath)){
			return this.bean.getLastMkt();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("uRL".equalsIgnoreCase(accessPath)){
			return this.bean.getURL();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("advSide".equalsIgnoreCase(accessPath)){
			return this.bean.getAdvSide();
		}
		else if("advId".equalsIgnoreCase(accessPath)){
			return this.bean.getAdvId();
		}
		else if("advTransTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAdvTransTyp();
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("advRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getAdvRefID();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("lastMkt".equalsIgnoreCase(accessPath)){
			 this.bean.setLastMkt((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("uRL".equalsIgnoreCase(accessPath)){
			 this.bean.setURL((String) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigDecimal) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("advSide".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setAdvSide(AdvSideEnumT.valueOf(obj.toString()));
			return;
		}
		else if("advId".equalsIgnoreCase(accessPath)){
			 this.bean.setAdvId((String) obj);
			return;
		}
		else if("advTransTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setAdvTransTyp(AdvTransTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setQtyTyp((BigInteger) obj);
			return;
		}
		else if("advRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setAdvRefID((String) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(AdvertisementMessageT obj) {
		this.bean = obj; 
	}

}
