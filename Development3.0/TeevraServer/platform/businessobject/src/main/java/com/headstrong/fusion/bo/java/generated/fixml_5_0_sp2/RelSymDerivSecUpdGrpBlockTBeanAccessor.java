package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.RelSymDerivSecUpdGrpBlockT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentExtensionBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.InstrmtLegGrpBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.SecurityUpdateActionEnumT;
import org.fixprotocol.fixml_5_0_sp2.CorporateActionEnumT;
import org.fixprotocol.fixml_5_0_sp2.SecondaryPriceLimitsBlockT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:50 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:50 IST 2011")
public class RelSymDerivSecUpdGrpBlockTBeanAccessor implements BeanAccessor<RelSymDerivSecUpdGrpBlockT> {
	
	private RelSymDerivSecUpdGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("pxLmts2".equalsIgnoreCase(accessPath)){
			return this.bean.getPxLmts2();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("listUpdActn".equalsIgnoreCase(accessPath)){
			return this.bean.getListUpdActn();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmtExt();
		}
		else if("corpActn".equalsIgnoreCase(accessPath)){
			return this.bean.getCorpActn();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("leg".equalsIgnoreCase(accessPath)){
			 this.bean.setLeg((InstrmtLegGrpBlockT) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("pxLmts2".equalsIgnoreCase(accessPath)){
			 this.bean.setPxLmts2((SecondaryPriceLimitsBlockT) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("listUpdActn".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setListUpdActn(SecurityUpdateActionEnumT.valueOf(obj.toString()));
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmtExt((InstrumentExtensionBlockT) obj);
			return;
		}
		else if("corpActn".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCorpActn(CorporateActionEnumT.valueOf(obj.toString()));
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
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RelSymDerivSecUpdGrpBlockT obj) {
		this.bean = obj; 
	}

}
