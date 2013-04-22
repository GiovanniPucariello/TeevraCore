package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.RiskInstrumentScopeBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class RiskInstrumentScopeBlockTBeanAccessor implements BeanAccessor<RiskInstrumentScopeBlockT> {
	
	private RiskInstrumentScopeBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mult".equalsIgnoreCase(accessPath)){
			return this.bean.getMult();
		}
		else if("desc".equalsIgnoreCase(accessPath)){
			return this.bean.getDesc();
		}
		else if("secGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecGrp();
		}
		else if("cpnRt".equalsIgnoreCase(accessPath)){
			return this.bean.getCpnRt();
		}
		else if("secSubTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecSubTyp();
		}
		else if("flexInd".equalsIgnoreCase(accessPath)){
			return this.bean.getFlexInd();
		}
		else if("mMY".equalsIgnoreCase(accessPath)){
			return this.bean.getMMY();
		}
		else if("putCall".equalsIgnoreCase(accessPath)){
			return this.bean.getPutCall();
		}
		else if("sym".equalsIgnoreCase(accessPath)){
			return this.bean.getSym();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("sfx".equalsIgnoreCase(accessPath)){
			return this.bean.getSfx();
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			return this.bean.getCFI();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("rstrctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRstrctTyp();
		}
		else if("aID".equalsIgnoreCase(accessPath)){
			return this.bean.getAID();
		}
		else if("oper".equalsIgnoreCase(accessPath)){
			return this.bean.getOper();
		}
		else if("snrty".equalsIgnoreCase(accessPath)){
			return this.bean.getSnrty();
		}
		else if("matTm".equalsIgnoreCase(accessPath)){
			return this.bean.getMatTm();
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecTyp();
		}
		else if("src".equalsIgnoreCase(accessPath)){
			return this.bean.getSrc();
		}
		else if("prodCmplx".equalsIgnoreCase(accessPath)){
			return this.bean.getProdCmplx();
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			return this.bean.getExch();
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			return this.bean.getProd();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mult".equalsIgnoreCase(accessPath)){
			 this.bean.setMult((BigDecimal) obj);
			return;
		}
		else if("desc".equalsIgnoreCase(accessPath)){
			 this.bean.setDesc((String) obj);
			return;
		}
		else if("secGrp".equalsIgnoreCase(accessPath)){
			 this.bean.setSecGrp((String) obj);
			return;
		}
		else if("cpnRt".equalsIgnoreCase(accessPath)){
			 this.bean.setCpnRt((BigDecimal) obj);
			return;
		}
		else if("secSubTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSecSubTyp((String) obj);
			return;
		}
		else if("flexInd".equalsIgnoreCase(accessPath)){
			 this.bean.setFlexInd((String) obj);
			return;
		}
		else if("mMY".equalsIgnoreCase(accessPath)){
			 this.bean.setMMY((String) obj);
			return;
		}
		else if("putCall".equalsIgnoreCase(accessPath)){
			 this.bean.setPutCall((BigInteger) obj);
			return;
		}
		else if("sym".equalsIgnoreCase(accessPath)){
			 this.bean.setSym((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("sfx".equalsIgnoreCase(accessPath)){
			 this.bean.setSfx((String) obj);
			return;
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			 this.bean.setCFI((String) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("rstrctTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRstrctTyp((String) obj);
			return;
		}
		else if("oper".equalsIgnoreCase(accessPath)){
			 this.bean.setOper((BigInteger) obj);
			return;
		}
		else if("snrty".equalsIgnoreCase(accessPath)){
			 this.bean.setSnrty((String) obj);
			return;
		}
		else if("matTm".equalsIgnoreCase(accessPath)){
			 this.bean.setMatTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSecTyp((String) obj);
			return;
		}
		else if("src".equalsIgnoreCase(accessPath)){
			 this.bean.setSrc((String) obj);
			return;
		}
		else if("prodCmplx".equalsIgnoreCase(accessPath)){
			 this.bean.setProdCmplx((String) obj);
			return;
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			 this.bean.setExch((String) obj);
			return;
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			 this.bean.setProd((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RiskInstrumentScopeBlockT obj) {
		this.bean = obj; 
	}

}
