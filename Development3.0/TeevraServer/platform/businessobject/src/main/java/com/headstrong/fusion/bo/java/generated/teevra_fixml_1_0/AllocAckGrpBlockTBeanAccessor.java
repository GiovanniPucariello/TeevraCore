package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.AllocAckGrpBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.AllocPositionEffectEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class AllocAckGrpBlockTBeanAccessor implements BeanAccessor<AllocAckGrpBlockT> {
	
	private AllocAckGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("encAllocTextLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncAllocTextLen();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("indAllocRejCode".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocRejCode();
		}
		else if("encAllocText".equalsIgnoreCase(accessPath)){
			return this.bean.getEncAllocText();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("indAllocID2".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocID2();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getActIDSrc();
		}
		else if("allocPosEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocPosEfct();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocID();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("encAllocTextLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncAllocTextLen((BigInteger) obj);
			return;
		}
		else if("indAllocRejCode".equalsIgnoreCase(accessPath)){
			 this.bean.setIndAllocRejCode((BigInteger) obj);
			return;
		}
		else if("encAllocText".equalsIgnoreCase(accessPath)){
			 this.bean.setEncAllocText((String) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigDecimal) obj);
			return;
		}
		else if("indAllocID2".equalsIgnoreCase(accessPath)){
			 this.bean.setIndAllocID2((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setActIDSrc((BigInteger) obj);
			return;
		}
		else if("allocPosEfct".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setAllocPosEfct(AllocPositionEffectEnumT.valueOf(obj.toString()));
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((BigInteger) obj);
			return;
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			 this.bean.setIndAllocID((String) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			 this.bean.setCustCpcty((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(AllocAckGrpBlockT obj) {
		this.bean = obj; 
	}

}
