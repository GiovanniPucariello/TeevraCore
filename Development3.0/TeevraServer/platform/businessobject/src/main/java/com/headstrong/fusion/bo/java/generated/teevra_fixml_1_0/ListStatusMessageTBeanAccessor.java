package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ListStatusMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.LastFragmentEnumT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class ListStatusMessageTBeanAccessor implements BeanAccessor<ListStatusMessageT> {
	
	private ListStatusMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("listRejectReason".equalsIgnoreCase(accessPath)){
			return this.bean.getListRejectReason();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("noRpts".equalsIgnoreCase(accessPath)){
			return this.bean.getNoRpts();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("listStat".equalsIgnoreCase(accessPath)){
			return this.bean.getListStat();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("listStatText".equalsIgnoreCase(accessPath)){
			return this.bean.getListStatText();
		}
		else if("encListStatTextLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncListStatTextLen();
		}
		else if("encListStatText".equalsIgnoreCase(accessPath)){
			return this.bean.getEncListStatText();
		}
		else if("contingencyType".equalsIgnoreCase(accessPath)){
			return this.bean.getContingencyType();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("listOrdStat".equalsIgnoreCase(accessPath)){
			return this.bean.getListOrdStat();
		}
		else if("totNoOrds".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoOrds();
		}
		else if("rptSeq".equalsIgnoreCase(accessPath)){
			return this.bean.getRptSeq();
		}
		else if("listStatTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getListStatTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("listRejectReason".equalsIgnoreCase(accessPath)){
			 this.bean.setListRejectReason((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("noRpts".equalsIgnoreCase(accessPath)){
			 this.bean.setNoRpts((BigInteger) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("listStatText".equalsIgnoreCase(accessPath)){
			 this.bean.setListStatText((String) obj);
			return;
		}
		else if("encListStatTextLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncListStatTextLen((BigInteger) obj);
			return;
		}
		else if("encListStatText".equalsIgnoreCase(accessPath)){
			 this.bean.setEncListStatText((String) obj);
			return;
		}
		else if("contingencyType".equalsIgnoreCase(accessPath)){
			 this.bean.setContingencyType((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("listOrdStat".equalsIgnoreCase(accessPath)){
			 this.bean.setListOrdStat((BigInteger) obj);
			return;
		}
		else if("totNoOrds".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoOrds((BigInteger) obj);
			return;
		}
		else if("rptSeq".equalsIgnoreCase(accessPath)){
			 this.bean.setRptSeq((BigInteger) obj);
			return;
		}
		else if("listStatTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setListStatTyp((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ListStatusMessageT obj) {
		this.bean = obj; 
	}

}
