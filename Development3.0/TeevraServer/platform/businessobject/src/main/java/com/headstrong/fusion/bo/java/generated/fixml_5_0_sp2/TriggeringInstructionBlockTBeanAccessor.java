package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.TriggeringInstructionBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.TriggerPriceDirectionEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class TriggeringInstructionBlockTBeanAccessor implements BeanAccessor<TriggeringInstructionBlockT> {
	
	private TriggeringInstructionBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("trgrSym".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrSym();
		}
		else if("trgrTrdSessSubID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrTrdSessSubID();
		}
		else if("trgrSecDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrSecDesc();
		}
		else if("trgrPx".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrPx();
		}
		else if("trgrPxTypScp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrPxTypScp();
		}
		else if("trgrNewQty".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrNewQty();
		}
		else if("trgrNewPx".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrNewPx();
		}
		else if("trgrPxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrPxTyp();
		}
		else if("trgrActn".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrActn();
		}
		else if("trgrSecID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrSecID();
		}
		else if("trgrTrdSessID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrTrdSessID();
		}
		else if("trgrPxDir".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrPxDir();
		}
		else if("trgrSecIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrSecIDSrc();
		}
		else if("trgrTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrTyp();
		}
		else if("trgrOrdTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrOrdTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("trgrSym".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrSym((String) obj);
			return;
		}
		else if("trgrTrdSessSubID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrTrdSessSubID((String) obj);
			return;
		}
		else if("trgrSecDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrSecDesc((String) obj);
			return;
		}
		else if("trgrPx".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrPx((BigDecimal) obj);
			return;
		}
		else if("trgrPxTypScp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrPxTypScp((String) obj);
			return;
		}
		else if("trgrNewQty".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrNewQty((BigDecimal) obj);
			return;
		}
		else if("trgrNewPx".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrNewPx((BigDecimal) obj);
			return;
		}
		else if("trgrPxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrPxTyp((String) obj);
			return;
		}
		else if("trgrActn".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrActn((String) obj);
			return;
		}
		else if("trgrSecID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrSecID((String) obj);
			return;
		}
		else if("trgrTrdSessID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrTrdSessID((String) obj);
			return;
		}
		else if("trgrPxDir".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setTrgrPxDir(TriggerPriceDirectionEnumT.valueOf(obj.toString()));
			return;
		}
		else if("trgrSecIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrSecIDSrc((String) obj);
			return;
		}
		else if("trgrTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrTyp((String) obj);
			return;
		}
		else if("trgrOrdTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrOrdTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TriggeringInstructionBlockT obj) {
		this.bean = obj; 
	}

}
