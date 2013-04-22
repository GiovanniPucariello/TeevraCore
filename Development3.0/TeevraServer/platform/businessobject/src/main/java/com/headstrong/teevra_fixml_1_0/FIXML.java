
package com.headstrong.teevra_fixml_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Message"/>
 *         &lt;element name="Batch" type="{http://www.headstrong.com/TEEVRA-FIXML-1-0}Batch_t" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.headstrong.com/TEEVRA-FIXML-1-0}FixmlAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "message",
    "batch"
})
@XmlRootElement(name = "FIXML")
public class FIXML {

    @XmlElementRef(name = "Message", namespace = "http://www.headstrong.com/TEEVRA-FIXML-1-0", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractMessageT> message;
    @XmlElement(name = "Batch")
    protected List<BatchT> batch;
    @XmlAttribute
    protected String v;
    @XmlAttribute
    protected String r;
    @XmlAttribute
    protected String xv;
    @XmlAttribute
    protected String xr;
    @XmlAttribute
    protected String ev;
    @XmlAttribute
    protected String s;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListCancelRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityTypeRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllocationInstructionMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllocationInstructionAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ListStrikePriceMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link IOIMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link DerivativeSecurityListRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SettlementInstructionRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradingSessionListMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link StreamAssignmentReportACKMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link PositionReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link PositionMaintenanceRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDataRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link BusinessMessageRejectMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdvertisementMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link PositionMaintenanceReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegistrationInstructionsMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityStatusMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ListStatusMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApplicationMessageRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link StreamAssignmentRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link DerivativeSecurityListUpdateReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdjustedPositionReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderCancelRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CrossOrderCancelReplaceRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllocationReportAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllocationInstructionAlertMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDataIncrementalRefreshMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteRequestRejectMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteCancelMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MassQuoteMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmailMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewOrderMultilegMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderMassActionRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradingSessionStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link PartyDetailsListRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SettlementObligationReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewsMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SettlementInstructionsMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link RFQRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralInquiryMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExecutionReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegistrationInstructionsResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApplicationMessageReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradingSessionListUpdateReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradeCaptureReportAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderMassStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderMassCancelReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConfirmationAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderCancelRejectMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CrossOrderCancelRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ListStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewOrderSingleMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewOrderListMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link BidResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link DerivativeSecurityListMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link StreamAssignmentReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDataSnapshotFullRefreshMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link PartyDetailsListReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderMassActionReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListUpdateReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityDefinitionUpdateReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderMassCancelRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequestForPositionsAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link DontKnowTradeDKMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradeCaptureReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralInquiryAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContraryIntentionReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link BidRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssignmentReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NetworkCounterpartySystemStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDefinitionMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityTypesMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradeCaptureReportRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NetworkCounterpartySystemStatusResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewOrderCrossMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradingSessionStatusMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityDefinitionRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ListExecuteMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteStatusReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MassQuoteAcknowledgementMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradingSessionListRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllocationReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDefinitionUpdateReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConfirmationMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityDefinitionMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequestForPositionsMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderCancelReplaceRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDefinitionRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradeCaptureReportRequestAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultilegOrderCancelReplaceMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConfirmationRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDataRequestRejectMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApplicationMessageRequestAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralAssignmentMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserNotificationMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExecutionAcknowledgementMessageT }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractMessageT> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListCancelRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityTypeRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllocationInstructionMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllocationInstructionAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ListStrikePriceMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link IOIMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link DerivativeSecurityListRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SettlementInstructionRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradingSessionListMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link StreamAssignmentReportACKMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link PositionReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link PositionMaintenanceRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ErrorMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDataRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link BusinessMessageRejectMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdvertisementMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link PositionMaintenanceReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegistrationInstructionsMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityStatusMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ListStatusMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApplicationMessageRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link StreamAssignmentRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link DerivativeSecurityListUpdateReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AdjustedPositionReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderCancelRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CrossOrderCancelReplaceRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllocationReportAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllocationInstructionAlertMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDataIncrementalRefreshMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteRequestRejectMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteCancelMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MassQuoteMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmailMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewOrderMultilegMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderMassActionRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradingSessionStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link PartyDetailsListRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SettlementObligationReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewsMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SettlementInstructionsMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link RFQRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralInquiryMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExecutionReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegistrationInstructionsResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApplicationMessageReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradingSessionListUpdateReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradeCaptureReportAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderMassStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderMassCancelReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConfirmationAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderCancelRejectMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CrossOrderCancelRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ListStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewOrderSingleMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewOrderListMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link BidResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link DerivativeSecurityListMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link StreamAssignmentReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDataSnapshotFullRefreshMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link PartyDetailsListReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderMassActionReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityListUpdateReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityDefinitionUpdateReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderMassCancelRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequestForPositionsAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link DontKnowTradeDKMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradeCaptureReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralInquiryAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContraryIntentionReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link BidRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssignmentReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NetworkCounterpartySystemStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDefinitionMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityTypesMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteStatusRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradeCaptureReportRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NetworkCounterpartySystemStatusResponseMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link NewOrderCrossMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradingSessionStatusMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityDefinitionRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ListExecuteMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link QuoteStatusReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MassQuoteAcknowledgementMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradingSessionListRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link AllocationReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDefinitionUpdateReportMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConfirmationMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link SecurityDefinitionMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequestForPositionsMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrderCancelReplaceRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDefinitionRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link TradeCaptureReportRequestAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MultilegOrderCancelReplaceMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ConfirmationRequestMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketDataRequestRejectMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ApplicationMessageRequestAckMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollateralAssignmentMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserNotificationMessageT }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExecutionAcknowledgementMessageT }{@code >}
     *     
     */
    public void setMessage(JAXBElement<? extends AbstractMessageT> value) {
        this.message = ((JAXBElement<? extends AbstractMessageT> ) value);
    }

    /**
     * Gets the value of the batch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchT }
     * 
     * 
     */
    public List<BatchT> getBatch() {
        if (batch == null) {
            batch = new ArrayList<BatchT>();
        }
        return this.batch;
    }

    /**
     * Gets the value of the v property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV() {
        if (v == null) {
            return "5.0";
        } else {
            return v;
        }
    }

    /**
     * Sets the value of the v property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV(String value) {
        this.v = value;
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR(String value) {
        this.r = value;
    }

    /**
     * Gets the value of the xv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXv() {
        return xv;
    }

    /**
     * Sets the value of the xv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXv(String value) {
        this.xv = value;
    }

    /**
     * Gets the value of the xr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXr() {
        return xr;
    }

    /**
     * Sets the value of the xr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXr(String value) {
        this.xr = value;
    }

    /**
     * Gets the value of the ev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEv() {
        return ev;
    }

    /**
     * Sets the value of the ev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEv(String value) {
        this.ev = value;
    }

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS() {
        if (s == null) {
            return "20080115";
        } else {
            return s;
        }
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS(String value) {
        this.s = value;
    }

}
