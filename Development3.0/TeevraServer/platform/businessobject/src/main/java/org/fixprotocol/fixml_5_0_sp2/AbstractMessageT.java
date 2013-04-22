
package org.fixprotocol.fixml_5_0_sp2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Abstract_message_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Abstract_message_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hdr" type="{http://www.fixprotocol.org/FIXML-5-0-SP2}MessageHeader_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Abstract_message_t", propOrder = {
    "hdr"
})
@XmlSeeAlso({
    CollateralInquiryAckMessageT.class,
    QuoteRequestMessageT.class,
    SettlementObligationReportMessageT.class,
    CollateralInquiryMessageT.class,
    QuoteCancelMessageT.class,
    NewOrderListMessageT.class,
    ConfirmationAckMessageT.class,
    PositionMaintenanceReportMessageT.class,
    SecurityStatusRequestMessageT.class,
    ApplicationMessageReportMessageT.class,
    MarketDataRequestRejectMessageT.class,
    DerivativeSecurityListRequestMessageT.class,
    MassQuoteAcknowledgementMessageT.class,
    BusinessMessageRejectMessageT.class,
    SettlementInstructionRequestMessageT.class,
    DontKnowTradeDKMessageT.class,
    BidResponseMessageT.class,
    MarketDefinitionUpdateReportMessageT.class,
    EmailMessageT.class,
    OrderMassCancelRequestMessageT.class,
    ListStrikePriceMessageT.class,
    NetworkCounterpartySystemStatusRequestMessageT.class,
    QuoteMessageT.class,
    AllocationReportAckMessageT.class,
    AllocationInstructionAlertMessageT.class,
    AllocationInstructionMessageT.class,
    MarketDataIncrementalRefreshMessageT.class,
    SecurityListRequestMessageT.class,
    QuoteRequestRejectMessageT.class,
    AllocationInstructionAckMessageT.class,
    NetworkCounterpartySystemStatusResponseMessageT.class,
    QuoteStatusReportMessageT.class,
    ApplicationMessageRequestAckMessageT.class,
    TradingSessionListRequestMessageT.class,
    OrderMassStatusRequestMessageT.class,
    ContraryIntentionReportMessageT.class,
    UserResponseMessageT.class,
    OrderMassActionReportMessageT.class,
    SettlementInstructionsMessageT.class,
    AssignmentReportMessageT.class,
    TradingSessionStatusMessageT.class,
    TradingSessionListMessageT.class,
    RegistrationInstructionsMessageT.class,
    CollateralReportMessageT.class,
    ConfirmationMessageT.class,
    TradeCaptureReportRequestMessageT.class,
    StreamAssignmentReportMessageT.class,
    ExecutionReportMessageT.class,
    OrderStatusRequestMessageT.class,
    PositionReportMessageT.class,
    NewOrderCrossMessageT.class,
    DerivativeSecurityListUpdateReportMessageT.class,
    ListStatusMessageT.class,
    IOIMessageT.class,
    ExecutionAcknowledgementMessageT.class,
    PositionMaintenanceRequestMessageT.class,
    SecurityListUpdateReportMessageT.class,
    QuoteStatusRequestMessageT.class,
    PartyDetailsListRequestMessageT.class,
    MarketDefinitionMessageT.class,
    RFQRequestMessageT.class,
    CollateralResponseMessageT.class,
    OrderMassCancelReportMessageT.class,
    AdvertisementMessageT.class,
    SecurityDefinitionRequestMessageT.class,
    NewsMessageT.class,
    SecurityDefinitionMessageT.class,
    OrderMassActionRequestMessageT.class,
    RequestForPositionsMessageT.class,
    CollateralAssignmentMessageT.class,
    RegistrationInstructionsResponseMessageT.class,
    ConfirmationRequestMessageT.class,
    TradingSessionListUpdateReportMessageT.class,
    RequestForPositionsAckMessageT.class,
    CrossOrderCancelReplaceRequestMessageT.class,
    SecurityListMessageT.class,
    MarketDataSnapshotFullRefreshMessageT.class,
    ApplicationMessageRequestMessageT.class,
    UserRequestMessageT.class,
    UserNotificationMessageT.class,
    SecurityTypesMessageT.class,
    AdjustedPositionReportMessageT.class,
    CrossOrderCancelRequestMessageT.class,
    ListStatusRequestMessageT.class,
    TradeCaptureReportRequestAckMessageT.class,
    TradeCaptureReportMessageT.class,
    MarketDefinitionRequestMessageT.class,
    NewOrderSingleMessageT.class,
    TradeCaptureReportAckMessageT.class,
    AllocationReportMessageT.class,
    SecurityTypeRequestMessageT.class,
    MultilegOrderCancelReplaceMessageT.class,
    OrderCancelReplaceRequestMessageT.class,
    SecurityDefinitionUpdateReportMessageT.class,
    NewOrderMultilegMessageT.class,
    StreamAssignmentReportACKMessageT.class,
    MarketDataRequestMessageT.class,
    OrderCancelRejectMessageT.class,
    SecurityStatusMessageT.class,
    OrderCancelRequestMessageT.class,
    PartyDetailsListReportMessageT.class,
    ErrorMessageT.class,
    StreamAssignmentRequestMessageT.class,
    DerivativeSecurityListMessageT.class,
    CollateralRequestMessageT.class,
    ListExecuteMessageT.class,
    BidRequestMessageT.class,
    TradingSessionStatusRequestMessageT.class,
    ListCancelRequestMessageT.class,
    MassQuoteMessageT.class,
    QuoteResponseMessageT.class,
    ErrorFieldsBlockT.class
})
public class AbstractMessageT {

    @XmlElement(name = "Hdr")
    protected MessageHeaderT hdr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeaderT }
     *     
     */
    public MessageHeaderT getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeaderT }
     *     
     */
    public void setHdr(MessageHeaderT value) {
        this.hdr = value;
    }

}
