
package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;

import org.fixprotocol.fixml_5_0.*;

import com.headstrong.fusion.bo.java.BeanAccessor;

//This file was generated on Thu Feb 04 20:41:11 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Thu Feb 04 20:41:11 IST 2010")
public class BeanAccessorFactory {
	
	private BeanAccessorFactory(){
		//DefaultContstructor
	}
	
	public static BeanAccessor getBeanAccessor(Object obj){
		//for each java class registered with this generator, 
		//create a new Bean Accessor;
		BeanAccessor accessor = null;
		 if(obj instanceof JAXBElement){
			accessor = new JAXBElementBeanAccessor();
		}
		else if(obj instanceof AdjustedPositionReportMessageT){
			accessor = new AdjustedPositionReportMessageTBeanAccessor();
		}
		else if(obj instanceof AdvSideEnumT){
			accessor = new AdvSideEnumTBeanAccessor();
		}
		else if(obj instanceof AdvTransTypeEnumT){
			accessor = new AdvTransTypeEnumTBeanAccessor();
		}
		else if(obj instanceof AdvertisementMessageT){
			accessor = new AdvertisementMessageTBeanAccessor();
		}
		else if(obj instanceof AffectedOrdGrpBlockT){
			accessor = new AffectedOrdGrpBlockTBeanAccessor();
		}
		else if(obj instanceof AggregatedBookEnumT){
			accessor = new AggregatedBookEnumTBeanAccessor();
		}
		else if(obj instanceof AggressorIndicatorEnumT){
			accessor = new AggressorIndicatorEnumTBeanAccessor();
		}
		else if(obj instanceof AllocAckGrpBlockT){
			accessor = new AllocAckGrpBlockTBeanAccessor();
		}
		else if(obj instanceof AllocGrpBlockT){
			accessor = new AllocGrpBlockTBeanAccessor();
		}
		else if(obj instanceof AllocPositionEffectEnumT){
			accessor = new AllocPositionEffectEnumTBeanAccessor();
		}
		else if(obj instanceof AllocationInstructionAckMessageT){
			accessor = new AllocationInstructionAckMessageTBeanAccessor();
		}
		else if(obj instanceof AllocationInstructionAlertMessageT){
			accessor = new AllocationInstructionAlertMessageTBeanAccessor();
		}
		else if(obj instanceof AllocationInstructionMessageT){
			accessor = new AllocationInstructionMessageTBeanAccessor();
		}
		else if(obj instanceof AllocationReportAckMessageT){
			accessor = new AllocationReportAckMessageTBeanAccessor();
		}
		else if(obj instanceof AllocationReportMessageT){
			accessor = new AllocationReportMessageTBeanAccessor();
		}
		else if(obj instanceof AssignmentMethodEnumT){
			accessor = new AssignmentMethodEnumTBeanAccessor();
		}
		else if(obj instanceof AssignmentReportMessageT){
			accessor = new AssignmentReportMessageTBeanAccessor();
		}
		else if(obj instanceof AttrbGrpBlockT){
			accessor = new AttrbGrpBlockTBeanAccessor();
		}
		else if(obj instanceof BaseHeaderT){
			accessor = new BaseHeaderTBeanAccessor();
		}
		else if(obj instanceof BatchHeaderT){
			accessor = new BatchHeaderTBeanAccessor();
		}
		else if(obj instanceof BatchT){
			accessor = new BatchTBeanAccessor();
		}
		else if(obj instanceof BenchmarkCurveNameEnumT){
			accessor = new BenchmarkCurveNameEnumTBeanAccessor();
		}
		else if(obj instanceof BidCompReqGrpBlockT){
			accessor = new BidCompReqGrpBlockTBeanAccessor();
		}
		else if(obj instanceof BidCompRspGrpBlockT){
			accessor = new BidCompRspGrpBlockTBeanAccessor();
		}
		else if(obj instanceof BidDescReqGrpBlockT){
			accessor = new BidDescReqGrpBlockTBeanAccessor();
		}
		else if(obj instanceof BidRequestMessageT){
			accessor = new BidRequestMessageTBeanAccessor();
		}
		else if(obj instanceof BidRequestTransTypeEnumT){
			accessor = new BidRequestTransTypeEnumTBeanAccessor();
		}
		else if(obj instanceof BidResponseMessageT){
			accessor = new BidResponseMessageTBeanAccessor();
		}
		else if(obj instanceof BidTradeTypeEnumT){
			accessor = new BidTradeTypeEnumTBeanAccessor();
		}
		else if(obj instanceof BusinessMessageRejectMessageT){
			accessor = new BusinessMessageRejectMessageTBeanAccessor();
		}
		else if(obj instanceof CancellationRightsEnumT){
			accessor = new CancellationRightsEnumTBeanAccessor();
		}
		else if(obj instanceof ClrInstGrpBlockT){
			accessor = new ClrInstGrpBlockTBeanAccessor();
		}
		else if(obj instanceof CollInqQualGrpBlockT){
			accessor = new CollInqQualGrpBlockTBeanAccessor();
		}
		else if(obj instanceof CollateralAssignmentMessageT){
			accessor = new CollateralAssignmentMessageTBeanAccessor();
		}
		else if(obj instanceof CollateralInquiryAckMessageT){
			accessor = new CollateralInquiryAckMessageTBeanAccessor();
		}
		else if(obj instanceof CollateralInquiryMessageT){
			accessor = new CollateralInquiryMessageTBeanAccessor();
		}
		else if(obj instanceof CollateralReportMessageT){
			accessor = new CollateralReportMessageTBeanAccessor();
		}
		else if(obj instanceof CollateralRequestMessageT){
			accessor = new CollateralRequestMessageTBeanAccessor();
		}
		else if(obj instanceof CollateralResponseMessageT){
			accessor = new CollateralResponseMessageTBeanAccessor();
		}
		else if(obj instanceof CommissionDataBlockT){
			accessor = new CommissionDataBlockTBeanAccessor();
		}
		else if(obj instanceof CompIDReqGrpBlockT){
			accessor = new CompIDReqGrpBlockTBeanAccessor();
		}
		else if(obj instanceof CompIDStatGrpBlockT){
			accessor = new CompIDStatGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ConfirmationAckMessageT){
			accessor = new ConfirmationAckMessageTBeanAccessor();
		}
		else if(obj instanceof ConfirmationMessageT){
			accessor = new ConfirmationMessageTBeanAccessor();
		}
		else if(obj instanceof ConfirmationRequestMessageT){
			accessor = new ConfirmationRequestMessageTBeanAccessor();
		}
		else if(obj instanceof ContAmtGrpBlockT){
			accessor = new ContAmtGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ContraGrpBlockT){
			accessor = new ContraGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ContraryIntentionReportMessageT){
			accessor = new ContraryIntentionReportMessageTBeanAccessor();
		}
		else if(obj instanceof CorporateActionEnumT){
			accessor = new CorporateActionEnumTBeanAccessor();
		}
		else if(obj instanceof CpctyConfGrpBlockT){
			accessor = new CpctyConfGrpBlockTBeanAccessor();
		}
		else if(obj instanceof CrossOrderCancelReplaceRequestMessageT){
			accessor = new CrossOrderCancelReplaceRequestMessageTBeanAccessor();
		}
		else if(obj instanceof CrossOrderCancelRequestMessageT){
			accessor = new CrossOrderCancelRequestMessageTBeanAccessor();
		}
		else if(obj instanceof CustOrderHandlingInstEnumT){
			accessor = new CustOrderHandlingInstEnumTBeanAccessor();
		}
		else if(obj instanceof DKReasonEnumT){
			accessor = new DKReasonEnumTBeanAccessor();
		}
		else if(obj instanceof DerivativeSecurityListMessageT){
			accessor = new DerivativeSecurityListMessageTBeanAccessor();
		}
		else if(obj instanceof DerivativeSecurityListRequestMessageT){
			accessor = new DerivativeSecurityListRequestMessageTBeanAccessor();
		}
		else if(obj instanceof DeskOrderHandlingInstEnumT){
			accessor = new DeskOrderHandlingInstEnumTBeanAccessor();
		}
		else if(obj instanceof DeskTypeEnumT){
			accessor = new DeskTypeEnumTBeanAccessor();
		}
		else if(obj instanceof DiscretionInstructionsBlockT){
			accessor = new DiscretionInstructionsBlockTBeanAccessor();
		}
		else if(obj instanceof DisplayInstructionBlockT){
			accessor = new DisplayInstructionBlockTBeanAccessor();
		}
		else if(obj instanceof DlvyInstGrpBlockT){
			accessor = new DlvyInstGrpBlockTBeanAccessor();
		}
		else if(obj instanceof DlvyInstTypeEnumT){
			accessor = new DlvyInstTypeEnumTBeanAccessor();
		}
		else if(obj instanceof DontKnowTradeDKMessageT){
			accessor = new DontKnowTradeDKMessageTBeanAccessor();
		}
		else if(obj instanceof DueToRelatedEnumT){
			accessor = new DueToRelatedEnumTBeanAccessor();
		}
		else if(obj instanceof EmailMessageT){
			accessor = new EmailMessageTBeanAccessor();
		}
		else if(obj instanceof EvntGrpBlockT){
			accessor = new EvntGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ExDestinationIDSourceEnumT){
			accessor = new ExDestinationIDSourceEnumTBeanAccessor();
		}
		else if(obj instanceof ExchangeForPhysicalEnumT){
			accessor = new ExchangeForPhysicalEnumTBeanAccessor();
		}
		else if(obj instanceof ExecAllocGrpBlockT){
			accessor = new ExecAllocGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ExecCollGrpBlockT){
			accessor = new ExecCollGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ExecPriceTypeEnumT){
			accessor = new ExecPriceTypeEnumTBeanAccessor();
		}
		else if(obj instanceof ExecsGrpBlockT){
			accessor = new ExecsGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ExecutionAcknowledgementMessageT){
			accessor = new ExecutionAcknowledgementMessageTBeanAccessor();
		}
		else if(obj instanceof ExecutionReportMessageT){
			accessor = new ExecutionReportMessageTBeanAccessor();
		}
		else if(obj instanceof ExerciseMethodEnumT){
			accessor = new ExerciseMethodEnumTBeanAccessor();
		}
		else if(obj instanceof ExpirationQtyBlockT){
			accessor = new ExpirationQtyBlockTBeanAccessor();
		}
		else if(obj instanceof FIXML){
			accessor = new FIXMLBeanAccessor();
		}
		else if(obj instanceof FinancingDetailsBlockT){
			accessor = new FinancingDetailsBlockTBeanAccessor();
		}
		else if(obj instanceof ForexReqEnumT){
			accessor = new ForexReqEnumTBeanAccessor();
		}
		else if(obj instanceof FundRenewWaivEnumT){
			accessor = new FundRenewWaivEnumTBeanAccessor();
		}
		else if(obj instanceof HaltReasonEnumT){
			accessor = new HaltReasonEnumTBeanAccessor();
		}
		else if(obj instanceof HopGrpBlockT){
			accessor = new HopGrpBlockTBeanAccessor();
		}
		else if(obj instanceof HopT){
			accessor = new HopTBeanAccessor();
		}
		else if(obj instanceof IOIMessageT){
			accessor = new IOIMessageTBeanAccessor();
		}
		else if(obj instanceof IOINaturalFlagEnumT){
			accessor = new IOINaturalFlagEnumTBeanAccessor();
		}
		else if(obj instanceof IOIQltyIndEnumT){
			accessor = new IOIQltyIndEnumTBeanAccessor();
		}
		else if(obj instanceof IOIQualGrpBlockT){
			accessor = new IOIQualGrpBlockTBeanAccessor();
		}
		else if(obj instanceof IOIQualifierEnumT){
			accessor = new IOIQualifierEnumTBeanAccessor();
		}
		else if(obj instanceof IOITransTypeEnumT){
			accessor = new IOITransTypeEnumTBeanAccessor();
		}
		else if(obj instanceof InViewOfCommonEnumT){
			accessor = new InViewOfCommonEnumTBeanAccessor();
		}
		else if(obj instanceof InstrmtGrpBlockT){
			accessor = new InstrmtGrpBlockTBeanAccessor();
		}
		else if(obj instanceof InstrmtLegExecGrpBlockT){
			accessor = new InstrmtLegExecGrpBlockTBeanAccessor();
		}
		else if(obj instanceof InstrmtLegGrpBlockT){
			accessor = new InstrmtLegGrpBlockTBeanAccessor();
		}
		else if(obj instanceof InstrmtLegIOIGrpBlockT){
			accessor = new InstrmtLegIOIGrpBlockTBeanAccessor();
		}
		else if(obj instanceof InstrmtLegSecListGrpBlockT){
			accessor = new InstrmtLegSecListGrpBlockTBeanAccessor();
		}
		else if(obj instanceof InstrmtMDReqGrpBlockT){
			accessor = new InstrmtMDReqGrpBlockTBeanAccessor();
		}
		else if(obj instanceof InstrmtStrkPxGrpBlockT){
			accessor = new InstrmtStrkPxGrpBlockTBeanAccessor();
		}
		else if(obj instanceof InstrumentBlockT){
			accessor = new InstrumentBlockTBeanAccessor();
		}
		else if(obj instanceof InstrumentExtensionBlockT){
			accessor = new InstrumentExtensionBlockTBeanAccessor();
		}
		else if(obj instanceof InstrumentLegBlockT){
			accessor = new InstrumentLegBlockTBeanAccessor();
		}
		else if(obj instanceof InstrumentPartiesBlockT){
			accessor = new InstrumentPartiesBlockTBeanAccessor();
		}
		else if(obj instanceof InstrumentPtysSubGrpBlockT){
			accessor = new InstrumentPtysSubGrpBlockTBeanAccessor();
		}
		else if(obj instanceof LastFragmentEnumT){
			accessor = new LastFragmentEnumTBeanAccessor();
		}
		else if(obj instanceof LastRptRequestedEnumT){
			accessor = new LastRptRequestedEnumTBeanAccessor();
		}
		else if(obj instanceof LegBenchmarkCurveDataBlockT){
			accessor = new LegBenchmarkCurveDataBlockTBeanAccessor();
		}
		else if(obj instanceof LegOrdGrpBlockT){
			accessor = new LegOrdGrpBlockTBeanAccessor();
		}
		else if(obj instanceof LegPreAllocGrpBlockT){
			accessor = new LegPreAllocGrpBlockTBeanAccessor();
		}
		else if(obj instanceof LegQuotGrpBlockT){
			accessor = new LegQuotGrpBlockTBeanAccessor();
		}
		else if(obj instanceof LegQuotStatGrpBlockT){
			accessor = new LegQuotStatGrpBlockTBeanAccessor();
		}
		else if(obj instanceof LegSecAltIDGrpBlockT){
			accessor = new LegSecAltIDGrpBlockTBeanAccessor();
		}
		else if(obj instanceof LegStipulationsBlockT){
			accessor = new LegStipulationsBlockTBeanAccessor();
		}
		else if(obj instanceof LegalConfirmEnumT){
			accessor = new LegalConfirmEnumTBeanAccessor();
		}
		else if(obj instanceof LinesOfTextGrpBlockT){
			accessor = new LinesOfTextGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ListCancelRequestMessageT){
			accessor = new ListCancelRequestMessageTBeanAccessor();
		}
		else if(obj instanceof ListExecuteMessageT){
			accessor = new ListExecuteMessageTBeanAccessor();
		}
		else if(obj instanceof ListOrdGrpBlockT){
			accessor = new ListOrdGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ListStatusMessageT){
			accessor = new ListStatusMessageTBeanAccessor();
		}
		else if(obj instanceof ListStatusRequestMessageT){
			accessor = new ListStatusRequestMessageTBeanAccessor();
		}
		else if(obj instanceof ListStrikePriceMessageT){
			accessor = new ListStrikePriceMessageTBeanAccessor();
		}
		else if(obj instanceof LocateReqdEnumT){
			accessor = new LocateReqdEnumTBeanAccessor();
		}
		else if(obj instanceof MDFullGrpBlockT){
			accessor = new MDFullGrpBlockTBeanAccessor();
		}
		else if(obj instanceof MDImplicitDeleteEnumT){
			accessor = new MDImplicitDeleteEnumTBeanAccessor();
		}
		else if(obj instanceof MDIncGrpBlockT){
			accessor = new MDIncGrpBlockTBeanAccessor();
		}
		else if(obj instanceof MDReqGrpBlockT){
			accessor = new MDReqGrpBlockTBeanAccessor();
		}
		else if(obj instanceof MDRjctGrpBlockT){
			accessor = new MDRjctGrpBlockTBeanAccessor();
		}
		else if(obj instanceof MarketDataIncrementalRefreshMessageT){
			accessor = new MarketDataIncrementalRefreshMessageTBeanAccessor();
		}
		else if(obj instanceof MarketDataRequestRejectMessageT){
			accessor = new MarketDataRequestRejectMessageTBeanAccessor();
		}
		else if(obj instanceof MarketDataSnapshotFullRefreshMessageT){
			accessor = new MarketDataSnapshotFullRefreshMessageTBeanAccessor();
		}
		else if(obj instanceof MassQuoteAcknowledgementMessageT){
			accessor = new MassQuoteAcknowledgementMessageTBeanAccessor();
		}
		else if(obj instanceof MassQuoteMessageT){
			accessor = new MassQuoteMessageTBeanAccessor();
		}
		else if(obj instanceof MessageHeaderT){
			accessor = new MessageHeaderTBeanAccessor();
		}
		else if(obj instanceof MiscFeesGrpBlockT){
			accessor = new MiscFeesGrpBlockTBeanAccessor();
		}
		else if(obj instanceof MsgTypeGrpBlockT){
			accessor = new MsgTypeGrpBlockTBeanAccessor();
		}
		else if(obj instanceof MultilegOrderCancelReplaceMessageT){
			accessor = new MultilegOrderCancelReplaceMessageTBeanAccessor();
		}
		else if(obj instanceof NestedParties2BlockT){
			accessor = new NestedParties2BlockTBeanAccessor();
		}
		else if(obj instanceof NestedParties3BlockT){
			accessor = new NestedParties3BlockTBeanAccessor();
		}
		else if(obj instanceof NestedPartiesBlockT){
			accessor = new NestedPartiesBlockTBeanAccessor();
		}
		else if(obj instanceof NetworkCounterpartySystemStatusRequestMessageT){
			accessor = new NetworkCounterpartySystemStatusRequestMessageTBeanAccessor();
		}
		else if(obj instanceof NetworkCounterpartySystemStatusResponseMessageT){
			accessor = new NetworkCounterpartySystemStatusResponseMessageTBeanAccessor();
		}
		else if(obj instanceof NewOrderCrossMessageT){
			accessor = new NewOrderCrossMessageTBeanAccessor();
		}
		else if(obj instanceof NewOrderListMessageT){
			accessor = new NewOrderListMessageTBeanAccessor();
		}
		else if(obj instanceof NewOrderMultilegMessageT){
			accessor = new NewOrderMultilegMessageTBeanAccessor();
		}
		else if(obj instanceof NewOrderSingleMessageT){
			accessor = new NewOrderSingleMessageTBeanAccessor();
		}
		else if(obj instanceof NewsMessageT){
			accessor = new NewsMessageTBeanAccessor();
		}
		else if(obj instanceof NotifyBrokerOfCreditEnumT){
			accessor = new NotifyBrokerOfCreditEnumTBeanAccessor();
		}
		else if(obj instanceof NstdPtys2SubGrpBlockT){
			accessor = new NstdPtys2SubGrpBlockTBeanAccessor();
		}
		else if(obj instanceof NstdPtys3SubGrpBlockT){
			accessor = new NstdPtys3SubGrpBlockTBeanAccessor();
		}
		else if(obj instanceof NstdPtysSubGrpBlockT){
			accessor = new NstdPtysSubGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ObjectFactory){
			accessor = new ObjectFactoryBeanAccessor();
		}
		else if(obj instanceof OddLotEnumT){
			accessor = new OddLotEnumTBeanAccessor();
		}
		else if(obj instanceof OrdAllocGrpBlockT){
			accessor = new OrdAllocGrpBlockTBeanAccessor();
		}
		else if(obj instanceof OrdListStatGrpBlockT){
			accessor = new OrdListStatGrpBlockTBeanAccessor();
		}
		else if(obj instanceof OrderCancelRejectMessageT){
			accessor = new OrderCancelRejectMessageTBeanAccessor();
		}
		else if(obj instanceof OrderCancelReplaceRequestMessageT){
			accessor = new OrderCancelReplaceRequestMessageTBeanAccessor();
		}
		else if(obj instanceof OrderCancelRequestMessageT){
			accessor = new OrderCancelRequestMessageTBeanAccessor();
		}
		else if(obj instanceof OrderCapacityEnumT){
			accessor = new OrderCapacityEnumTBeanAccessor();
		}
		else if(obj instanceof OrderMassCancelReportMessageT){
			accessor = new OrderMassCancelReportMessageTBeanAccessor();
		}
		else if(obj instanceof OrderMassCancelRequestMessageT){
			accessor = new OrderMassCancelRequestMessageTBeanAccessor();
		}
		else if(obj instanceof OrderMassStatusRequestMessageT){
			accessor = new OrderMassStatusRequestMessageTBeanAccessor();
		}
		else if(obj instanceof OrderQtyDataBlockT){
			accessor = new OrderQtyDataBlockTBeanAccessor();
		}
		else if(obj instanceof OrderStatusRequestMessageT){
			accessor = new OrderStatusRequestMessageTBeanAccessor();
		}
		else if(obj instanceof PartiesBlockT){
			accessor = new PartiesBlockTBeanAccessor();
		}
		else if(obj instanceof PegInstructionsBlockT){
			accessor = new PegInstructionsBlockTBeanAccessor();
		}
		else if(obj instanceof PosAmtTypeEnumT){
			accessor = new PosAmtTypeEnumTBeanAccessor();
		}
		else if(obj instanceof PosTypeEnumT){
			accessor = new PosTypeEnumTBeanAccessor();
		}
		else if(obj instanceof PosUndInstrmtGrpBlockT){
			accessor = new PosUndInstrmtGrpBlockTBeanAccessor();
		}
		else if(obj instanceof PositionAmountDataBlockT){
			accessor = new PositionAmountDataBlockTBeanAccessor();
		}
		else if(obj instanceof PositionEffectEnumT){
			accessor = new PositionEffectEnumTBeanAccessor();
		}
		else if(obj instanceof PositionMaintenanceReportMessageT){
			accessor = new PositionMaintenanceReportMessageTBeanAccessor();
		}
		else if(obj instanceof PositionMaintenanceRequestMessageT){
			accessor = new PositionMaintenanceRequestMessageTBeanAccessor();
		}
		else if(obj instanceof PositionQtyBlockT){
			accessor = new PositionQtyBlockTBeanAccessor();
		}
		else if(obj instanceof PositionReportMessageT){
			accessor = new PositionReportMessageTBeanAccessor();
		}
		else if(obj instanceof PossDupFlagEnumT){
			accessor = new PossDupFlagEnumTBeanAccessor();
		}
		else if(obj instanceof PossResendEnumT){
			accessor = new PossResendEnumTBeanAccessor();
		}
		else if(obj instanceof PreAllocGrpBlockT){
			accessor = new PreAllocGrpBlockTBeanAccessor();
		}
		else if(obj instanceof PreAllocMlegGrpBlockT){
			accessor = new PreAllocMlegGrpBlockTBeanAccessor();
		}
		else if(obj instanceof PreviouslyReportedEnumT){
			accessor = new PreviouslyReportedEnumTBeanAccessor();
		}
		else if(obj instanceof PtysSubGrpBlockT){
			accessor = new PtysSubGrpBlockTBeanAccessor();
		}
		else if(obj instanceof PublishTrdIndicatorEnumT){
			accessor = new PublishTrdIndicatorEnumTBeanAccessor();
		}
		else if(obj instanceof QuotCxlEntriesGrpBlockT){
			accessor = new QuotCxlEntriesGrpBlockTBeanAccessor();
		}
		else if(obj instanceof QuotEntryAckGrpBlockT){
			accessor = new QuotEntryAckGrpBlockTBeanAccessor();
		}
		else if(obj instanceof QuotEntryGrpBlockT){
			accessor = new QuotEntryGrpBlockTBeanAccessor();
		}
		else if(obj instanceof QuotQualGrpBlockT){
			accessor = new QuotQualGrpBlockTBeanAccessor();
		}
		else if(obj instanceof QuotReqGrpBlockT){
			accessor = new QuotReqGrpBlockTBeanAccessor();
		}
		else if(obj instanceof QuotReqLegsGrpBlockT){
			accessor = new QuotReqLegsGrpBlockTBeanAccessor();
		}
		else if(obj instanceof QuotReqRjctGrpBlockT){
			accessor = new QuotReqRjctGrpBlockTBeanAccessor();
		}
		else if(obj instanceof QuotSetAckGrpBlockT){
			accessor = new QuotSetAckGrpBlockTBeanAccessor();
		}
		else if(obj instanceof QuotSetGrpBlockT){
			accessor = new QuotSetGrpBlockTBeanAccessor();
		}
		else if(obj instanceof QuoteCancelMessageT){
			accessor = new QuoteCancelMessageTBeanAccessor();
		}
		else if(obj instanceof QuoteMessageT){
			accessor = new QuoteMessageTBeanAccessor();
		}
		else if(obj instanceof QuoteRequestMessageT){
			accessor = new QuoteRequestMessageTBeanAccessor();
		}
		else if(obj instanceof QuoteRequestRejectMessageT){
			accessor = new QuoteRequestRejectMessageTBeanAccessor();
		}
		else if(obj instanceof QuoteResponseMessageT){
			accessor = new QuoteResponseMessageTBeanAccessor();
		}
		else if(obj instanceof QuoteStatusReportMessageT){
			accessor = new QuoteStatusReportMessageTBeanAccessor();
		}
		else if(obj instanceof QuoteStatusRequestMessageT){
			accessor = new QuoteStatusRequestMessageTBeanAccessor();
		}
		else if(obj instanceof RFQReqGrpBlockT){
			accessor = new RFQReqGrpBlockTBeanAccessor();
		}
		else if(obj instanceof RFQRequestMessageT){
			accessor = new RFQRequestMessageTBeanAccessor();
		}
		else if(obj instanceof RegistStatusEnumT){
			accessor = new RegistStatusEnumTBeanAccessor();
		}
		else if(obj instanceof RegistrationInstructionsMessageT){
			accessor = new RegistrationInstructionsMessageTBeanAccessor();
		}
		else if(obj instanceof RegistrationInstructionsResponseMessageT){
			accessor = new RegistrationInstructionsResponseMessageTBeanAccessor();
		}
		else if(obj instanceof RelSymDerivSecGrpBlockT){
			accessor = new RelSymDerivSecGrpBlockTBeanAccessor();
		}
		else if(obj instanceof ReportToExchEnumT){
			accessor = new ReportToExchEnumTBeanAccessor();
		}
		else if(obj instanceof RequestForPositionsAckMessageT){
			accessor = new RequestForPositionsAckMessageTBeanAccessor();
		}
		else if(obj instanceof RequestForPositionsMessageT){
			accessor = new RequestForPositionsMessageTBeanAccessor();
		}
		else if(obj instanceof RgstDistInstGrpBlockT){
			accessor = new RgstDistInstGrpBlockTBeanAccessor();
		}
		else if(obj instanceof RgstDtlsGrpBlockT){
			accessor = new RgstDtlsGrpBlockTBeanAccessor();
		}
		else if(obj instanceof RootPartiesBlockT){
			accessor = new RootPartiesBlockTBeanAccessor();
		}
		else if(obj instanceof RootSubPartiesBlockT){
			accessor = new RootSubPartiesBlockTBeanAccessor();
		}
		else if(obj instanceof RoutingGrpBlockT){
			accessor = new RoutingGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SecAltIDGrpBlockT){
			accessor = new SecAltIDGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SecListGrpBlockT){
			accessor = new SecListGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SecLstUpdRelSymGrpBlockT){
			accessor = new SecLstUpdRelSymGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SecLstUpdRelSymsLegGrpBlockT){
			accessor = new SecLstUpdRelSymsLegGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SecTypesGrpBlockT){
			accessor = new SecTypesGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SecurityDefinitionMessageT){
			accessor = new SecurityDefinitionMessageTBeanAccessor();
		}
		else if(obj instanceof SecurityDefinitionRequestMessageT){
			accessor = new SecurityDefinitionRequestMessageTBeanAccessor();
		}
		else if(obj instanceof SecurityDefinitionUpdateReportMessageT){
			accessor = new SecurityDefinitionUpdateReportMessageTBeanAccessor();
		}
		else if(obj instanceof SecurityListMessageT){
			accessor = new SecurityListMessageTBeanAccessor();
		}
		else if(obj instanceof SecurityListRequestMessageT){
			accessor = new SecurityListRequestMessageTBeanAccessor();
		}
		else if(obj instanceof SecurityListUpdateReportMessageT){
			accessor = new SecurityListUpdateReportMessageTBeanAccessor();
		}
		else if(obj instanceof SecurityStatusMessageT){
			accessor = new SecurityStatusMessageTBeanAccessor();
		}
		else if(obj instanceof SecurityStatusRequestMessageT){
			accessor = new SecurityStatusRequestMessageTBeanAccessor();
		}
		else if(obj instanceof SecurityTypeEnumT){
			accessor = new SecurityTypeEnumTBeanAccessor();
		}
		else if(obj instanceof SecurityTypeRequestMessageT){
			accessor = new SecurityTypeRequestMessageTBeanAccessor();
		}
		else if(obj instanceof SecurityTypesMessageT){
			accessor = new SecurityTypesMessageTBeanAccessor();
		}
		else if(obj instanceof SecurityUpdateActionEnumT){
			accessor = new SecurityUpdateActionEnumTBeanAccessor();
		}
		else if(obj instanceof SettlCurrFxRateCalcEnumT){
			accessor = new SettlCurrFxRateCalcEnumTBeanAccessor();
		}
		else if(obj instanceof SettlInstGrpBlockT){
			accessor = new SettlInstGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SettlInstTransTypeEnumT){
			accessor = new SettlInstTransTypeEnumTBeanAccessor();
		}
		else if(obj instanceof SettlInstructionsDataBlockT){
			accessor = new SettlInstructionsDataBlockTBeanAccessor();
		}
		else if(obj instanceof SettlPartiesBlockT){
			accessor = new SettlPartiesBlockTBeanAccessor();
		}
		else if(obj instanceof SettlPtysSubGrpBlockT){
			accessor = new SettlPtysSubGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SettlSessIDEnumT){
			accessor = new SettlSessIDEnumTBeanAccessor();
		}
		else if(obj instanceof SettlementInstructionRequestMessageT){
			accessor = new SettlementInstructionRequestMessageTBeanAccessor();
		}
		else if(obj instanceof SettlementInstructionsMessageT){
			accessor = new SettlementInstructionsMessageTBeanAccessor();
		}
		else if(obj instanceof SideCrossOrdCxlGrpBlockT){
			accessor = new SideCrossOrdCxlGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SideCrossOrdModGrpBlockT){
			accessor = new SideCrossOrdModGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SideTrdRegTSBlockT){
			accessor = new SideTrdRegTSBlockTBeanAccessor();
		}
		else if(obj instanceof SolicitedFlagEnumT){
			accessor = new SolicitedFlagEnumTBeanAccessor();
		}
		else if(obj instanceof SpreadOrBenchmarkCurveDataBlockT){
			accessor = new SpreadOrBenchmarkCurveDataBlockTBeanAccessor();
		}
		else if(obj instanceof StipulationTypeEnumT){
			accessor = new StipulationTypeEnumTBeanAccessor();
		}
		else if(obj instanceof StipulationsBlockT){
			accessor = new StipulationsBlockTBeanAccessor();
		}
		else if(obj instanceof StrategyParametersGrpBlockT){
			accessor = new StrategyParametersGrpBlockTBeanAccessor();
		}
		else if(obj instanceof SymbolSfxEnumT){
			accessor = new SymbolSfxEnumTBeanAccessor();
		}
		else if(obj instanceof TimeUnitEnumT){
			accessor = new TimeUnitEnumTBeanAccessor();
		}
		else if(obj instanceof TradeCaptureReportAckMessageT){
			accessor = new TradeCaptureReportAckMessageTBeanAccessor();
		}
		else if(obj instanceof TradeCaptureReportMessageT){
			accessor = new TradeCaptureReportMessageTBeanAccessor();
		}
		else if(obj instanceof TradeCaptureReportRequestAckMessageT){
			accessor = new TradeCaptureReportRequestAckMessageTBeanAccessor();
		}
		else if(obj instanceof TradeCaptureReportRequestMessageT){
			accessor = new TradeCaptureReportRequestMessageTBeanAccessor();
		}
		else if(obj instanceof TradedFlatSwitchEnumT){
			accessor = new TradedFlatSwitchEnumTBeanAccessor();
		}
		else if(obj instanceof TradingSessionListMessageT){
			accessor = new TradingSessionListMessageTBeanAccessor();
		}
		else if(obj instanceof TradingSessionListRequestMessageT){
			accessor = new TradingSessionListRequestMessageTBeanAccessor();
		}
		else if(obj instanceof TradingSessionStatusMessageT){
			accessor = new TradingSessionStatusMessageTBeanAccessor();
		}
		else if(obj instanceof TradingSessionStatusRequestMessageT){
			accessor = new TradingSessionStatusRequestMessageTBeanAccessor();
		}
		else if(obj instanceof TrdAllocGrpBlockT){
			accessor = new TrdAllocGrpBlockTBeanAccessor();
		}
		else if(obj instanceof TrdCapDtGrpBlockT){
			accessor = new TrdCapDtGrpBlockTBeanAccessor();
		}
		else if(obj instanceof TrdCapRptAckSideGrpBlockT){
			accessor = new TrdCapRptAckSideGrpBlockTBeanAccessor();
		}
		else if(obj instanceof TrdCapRptSideGrpBlockT){
			accessor = new TrdCapRptSideGrpBlockTBeanAccessor();
		}
		else if(obj instanceof TrdCollGrpBlockT){
			accessor = new TrdCollGrpBlockTBeanAccessor();
		}
		else if(obj instanceof TrdInstrmtLegGrpBlockT){
			accessor = new TrdInstrmtLegGrpBlockTBeanAccessor();
		}
		else if(obj instanceof TrdRegTimestampsBlockT){
			accessor = new TrdRegTimestampsBlockTBeanAccessor();
		}
		else if(obj instanceof TrdSessLstGrpBlockT){
			accessor = new TrdSessLstGrpBlockTBeanAccessor();
		}
		else if(obj instanceof TrdgSesGrpBlockT){
			accessor = new TrdgSesGrpBlockTBeanAccessor();
		}
		else if(obj instanceof TriggerPriceDirectionEnumT){
			accessor = new TriggerPriceDirectionEnumTBeanAccessor();
		}
		else if(obj instanceof TriggeringInstructionBlockT){
			accessor = new TriggeringInstructionBlockTBeanAccessor();
		}
		else if(obj instanceof UndInstrmtCollGrpBlockT){
			accessor = new UndInstrmtCollGrpBlockTBeanAccessor();
		}
		else if(obj instanceof UndInstrmtGrpBlockT){
			accessor = new UndInstrmtGrpBlockTBeanAccessor();
		}
		else if(obj instanceof UndInstrmtStrkPxGrpBlockT){
			accessor = new UndInstrmtStrkPxGrpBlockTBeanAccessor();
		}
		else if(obj instanceof UndSecAltIDGrpBlockT){
			accessor = new UndSecAltIDGrpBlockTBeanAccessor();
		}
		else if(obj instanceof UnderlyingAmountBlockT){
			accessor = new UnderlyingAmountBlockTBeanAccessor();
		}
		else if(obj instanceof UnderlyingCashTypeEnumT){
			accessor = new UnderlyingCashTypeEnumTBeanAccessor();
		}
		else if(obj instanceof UnderlyingFXRateCalcEnumT){
			accessor = new UnderlyingFXRateCalcEnumTBeanAccessor();
		}
		else if(obj instanceof UnderlyingInstrumentBlockT){
			accessor = new UnderlyingInstrumentBlockTBeanAccessor();
		}
		else if(obj instanceof UnderlyingStipulationsBlockT){
			accessor = new UnderlyingStipulationsBlockTBeanAccessor();
		}
		else if(obj instanceof UndlyInstrumentPartiesBlockT){
			accessor = new UndlyInstrumentPartiesBlockTBeanAccessor();
		}
		else if(obj instanceof UndlyInstrumentPtysSubGrpBlockT){
			accessor = new UndlyInstrumentPtysSubGrpBlockTBeanAccessor();
		}
		else if(obj instanceof UnitofMeasureEnumT){
			accessor = new UnitofMeasureEnumTBeanAccessor();
		}
		else if(obj instanceof UnsolicitedIndicatorEnumT){
			accessor = new UnsolicitedIndicatorEnumTBeanAccessor();
		}
		else if(obj instanceof UserRequestMessageT){
			accessor = new UserRequestMessageTBeanAccessor();
		}
		else if(obj instanceof UserResponseMessageT){
			accessor = new UserResponseMessageTBeanAccessor();
		}
		else if(obj instanceof WorkingIndicatorEnumT){
			accessor = new WorkingIndicatorEnumTBeanAccessor();
		}
		else if(obj instanceof YieldDataBlockT){
			accessor = new YieldDataBlockTBeanAccessor();
		}
		else if(obj instanceof YieldTypeEnumT){
			accessor = new YieldTypeEnumTBeanAccessor();
		}
		else if(obj instanceof AbstractMessageT){
			accessor = new AbstractMessageTBeanAccessor();
		}
		return accessor;
	}
	
}
