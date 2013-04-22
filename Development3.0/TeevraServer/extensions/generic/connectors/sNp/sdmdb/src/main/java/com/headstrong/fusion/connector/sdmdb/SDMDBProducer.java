/*
 * The information in this document is subject to change without notice and
 * does not represent a commitment by Headstrong Corporation. The software
 * and/or databases described in this document are furnished under a license
 * agreement and may be used or copied only in accordance with the terms of
 * the agreement.
 *
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 *
 * $Id: SDMDBProducer.java
 * $Revision:
 * $Author:
 * $DateTime:
 */

package com.headstrong.fusion.connector.sdmdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;

/**
 * 
 * 
 */
public class SDMDBProducer implements FusionProducer<MessageExchange> {
	private static Logger logger = LoggerFactory.getLogger(SDMDBProducer.class);

	// private SDMDBEndpoint sdmDBEndpoint;
	private SDMDBConfiguration sdmDBBinding;
	public static final String UPDATE_COUNT = "org.apache.camel.sql.update-count";
	public static final int  MAX_SIZE=100; 
	public static final String DELIMITER = ":";
	public static final int BATCH_SIZE = 50000;
	private static final int RECORD_LENGTH = 80;
	private static final char FILL_CHAR = ' ';
	private static final String QS = "QS";
	private static final String CS = "CS";
	private static final String ID = "ID";
	private static final String IN = "IN";
	private static final String PT = "PT";
	private static final String TA = "TA";
	private static final String IS = "IS";
	private static final String UN = "UN";
	private static final String CO = "CO";
	private static final String PR = "PR";
	private static final String OF = "OF";
	private static final String AM = "AM";
	private static final String CA = "CA";
	private static final String PU = "PU";
	private static final String PS = "PS";
	private static final String VR = "VR";
	private static final String VS = "VS";
	private static final String SI = "SI";
	private static final String SS = "SS";
	private static final String SP = "SP";
	private static final String SX = "SX";
	private static final String TE = "TE";
	private static final String RA = "RA";
	private static final String CR = "CR";
	private static final String AG = "AG";
	private static final String AD = "AD";
	private static final String NO = "NO";
	private static final String RE = "RE";
	private static final String RC = "RC";
	private static final String ZZ = "ZZ";

	private Statement stat = null;
	private Connection con = null;
	private DriverManagerDataSource dataSource=null;

	FusionServiceSupport serviceSupport;

	public SDMDBProducer(SDMDBEndpoint sdmDBEndpoint) throws Exception {
		this.sdmDBBinding = sdmDBEndpoint.getSDMDBBinding();
		dataSource = new DriverManagerDataSource();
		dataSource.setUrl(sdmDBBinding.getUrl());
		dataSource.setUsername(sdmDBBinding.getUserName());
		dataSource.setPassword(sdmDBBinding.getPassword());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionProducer#process(com.headstrong.fusion.commons.MessageExchange)
	 */
	public void process(final MessageExchange exchange) throws Exception {
		
		String inputMessage = (String) exchange.getIn().getBody();
		stat = con.createStatement();
		int totalCount = 0;
		try {
			processRecords(inputMessage);
			int[] updateCounts = stat.executeBatch();
			for (int updateCount : updateCounts) {
				totalCount = totalCount + updateCount;
			}
			logger.debug("Inserted successfully into SDM with records = " + totalCount);
			exchange.getIn().setHeader(UPDATE_COUNT, totalCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Exception " + e);
		}
		finally{
			stat.close();
		}
	}

	public static String appendString(String str) {

		int needed = RECORD_LENGTH - str.length();
		if (needed <= 0) {
			return str;
		}
		StringBuffer strBuffer = new StringBuffer(RECORD_LENGTH);
		strBuffer.append(str);
		for (int i = 0; i < needed; i++) {
			strBuffer.append(FILL_CHAR);
		}
		return (strBuffer.toString());
	}
	//For creating/returning array of records for each groupType
	public ArrayList processMultipleGrp(String[] inputRecords, int recNum, String grpType,
			String recordType, String line) {
		String temp="";
		String nextGrpType = "";
		String nextRecordType = "";
		grpType = line.substring(2, 4);

		int j = 1;
		ArrayList<String> grpLines = new ArrayList();
		//adding the 1st record
		grpLines.add(line);
		
		for (;;) {
			temp=appendString(inputRecords[recNum + j]);
			nextGrpType = temp.substring(2, 4);
			nextRecordType =temp.substring(0, 2);
			if (grpType.equals(nextGrpType)
					&& recordType.equals(nextRecordType)) {
					grpLines.add(temp);
				j++;
				continue;
			}
			/* If new group or new recordType then process for  new	 group or recordType*/
			else {
				break;
			}
		}

		return grpLines;
	}
	public void processRecords(String inputMessage) throws Exception {

		String inputRecords[] = inputMessage.split("\n");
		try {
			String recordType = "";
			String cusipId = "";
			String grpFmtType = "";
			String line = "";
			String grpType="";
			int n = 0;
			int tempRecNum=0;
			for (int recNum = 0; recNum < inputRecords.length; recNum++) {
				n++;
				line = appendString(inputRecords[recNum]);
				if (line.substring(0, 6).equals("QS0101")) {
					cusipId = line.substring(6, 15);
					logger.debug("Processing Cusip Record= " + cusipId);
				}
				recordType = line.substring(0, 2);
				if (recordType.equals(ZZ)) {
					continue;
				}
				if (recordType.equals(QS)) {
					processQS(line, cusipId);
				} else if (recordType.equals(CS)) {
					processCS(line, cusipId);
				} else if (recordType.equals(ID)) {
					processID(line, cusipId);
				} else if (recordType.equals(IN)) {
					processIN(line, cusipId);
				} else if (recordType.equals(PT)) {
					processPT(line, cusipId);
				} else if (recordType.equals(TA)) {
					processTA(line, cusipId);
				} else if (recordType.equals(IS)) {
					processIS(line, cusipId);
				} else if (recordType.equals(UN)) {
					processUN(line, cusipId);
				} else if (recordType.equals(CO)) {
					processCO(line, cusipId);
				} else if (recordType.equals(PR)) {
					processPR(line, cusipId);
				} else if (recordType.equals(OF)) {
					processOF(line, cusipId);
				} else if (recordType.equals(AM)) {
					processAM(line, cusipId);
				} else if (recordType.equals(CA)) {
					processCA(line, cusipId);
				} else if (recordType.equals(PU)) {
					//Mulitple groups and more than one format records
					tempRecNum=processPU(inputRecords,recNum,grpType,recordType,line, cusipId);
					recNum=recNum + tempRecNum - 1;
				} else if (recordType.equals(PS)) {
					processPS(line, cusipId);
				} else if (recordType.equals(VR)) {
					//Mulitple groups and more than one format records
					tempRecNum=processVR(inputRecords,recNum,grpType,recordType,line, cusipId);
					recNum=recNum + tempRecNum - 1;
				} else if (recordType.equals(VS)) {
					processVS(line, cusipId);
				} else if (recordType.equals(SI)) {
					processSI(line, cusipId);
				} else if (recordType.equals(SS)) {
					//Mulitple groups and more than one format records
					tempRecNum=processSS(inputRecords,recNum,grpType,recordType,line, cusipId);
					recNum=recNum + tempRecNum - 1;
				} else if (recordType.equals(SP)) {
					processSP(line, cusipId);
				} else if (recordType.equals(SX)) {
					processSX(line, cusipId);
				} else if (recordType.equals(TE)) {
					processTE(line, cusipId);
				} else if (recordType.equals(RA)) {
					processRA(line, cusipId);
				} else if (recordType.equals(CR)) {
					//Mulitple groups and more than one format records
					tempRecNum=processCR(inputRecords,recNum,grpType,recordType,line, cusipId);
					recNum=recNum + tempRecNum-1;
				} else if (recordType.equals(AG)) {
					//Mulitple groups and more than one format records
					tempRecNum=processAG(inputRecords,recNum,grpType,recordType,line, cusipId);
					recNum=recNum +tempRecNum - 1;
				} else if (recordType.equals(AD)) {
					//Mulitple groups and more than one format records
					tempRecNum=processAD(inputRecords,recNum,grpType,recordType,line, cusipId);
					recNum=recNum +tempRecNum - 1;
				} else if (recordType.equals(NO)) {
					processNO(line, cusipId);
				} else if (recordType.equals(RE)) {
					processRE(line, cusipId);
				} else if (recordType.equals(RC)) {
					processRC(line, cusipId);
				}
			}
		} catch (Exception e) {
			logger.debug("Exception while processing the inputRecords : " + e);

		} 

	}

	void processQS(String line, String cusip) throws Exception {
		String grpFmtType = "";
		grpFmtType = line.substring(4, 6);
		String sqlQS = "";
		String issuerNumber = "";
		String issueAlphaNumber = "";
		String issueCheckDigit = "";
		String transactionTypeCode = "";
		String transactionAsOfDate = "";
		String invalidCUSIPFlag = "";
		String CUSIPNotFound = "";
		String issuerStateCode = "";
		String issuerDescription = "";
		String datedDate = "";
		String couponRate = "";
		String compoundingYield = "";
		String maturityDate = "";
		String termSerialIndicator = "";
		String calculatedCouponIndicator = "";
		String additionalIssuerDescription1 = "";
		String additionalIssuerDescription2 = "";
		String issuingDescription = "";
		String interestTypeIndicatorCode = "";
		String guarantorIndicator = "";
		String letterOfCreditIndicator = "";
		String insuranceIndicator = "";
		String defaultIndicator = "";
		String partialCallIndicator = "";
		String completeCallIndicator = "";
		String mandatoryTenderIndicator = "";
		String specialRedemptionExtraordinaryCallIndicator = "";
		Double couponRate_d;
		Double compoundingYield_d;

		int length = line.length();
		if (grpFmtType.equals("01")) {
			// insert into QS??01 table
			issuerNumber = line.substring(6, 12).trim();
			issueAlphaNumber = line.substring(12, 14).trim();
			// issueCheckDigit = line.substring(14, 15).trim();
			transactionTypeCode = line.substring(15, 16).trim();
			transactionAsOfDate = line.substring(16, 26).trim();
			invalidCUSIPFlag = line.substring(26, 27).trim();
			CUSIPNotFound = line.substring(27, 28).trim();
			issuerStateCode = line.substring(30, 32).trim();
			issuerDescription = line.substring(32, length).trim().replace("'", "''");
			int totalCount = 0;

			sqlQS = "INSERT INTO SDMCUSIP(CUSIP ,IssuerNum,TransactionTypeCode ,TransactionAsOfDate ,InvalidCUSIPFlag "
					+ ",CUSIPNotFound ,IssuerStateCode ,IssuerDescription) "
					+ "VALUES('"
					+ cusip
					+ "','"
					+ issuerNumber
					+ "','"
					+ transactionTypeCode
					+ "','"
					+ transactionAsOfDate
					+ "','"
					+ invalidCUSIPFlag
					+ "','"
					+ CUSIPNotFound
					+ "','"
					+ issuerStateCode + "','" + issuerDescription + "')";
			// delete CUSIP records from SDM Tables.
			try {
				stat.addBatch("DELETE SDMCUSIP WHERE CUSIP ='" + cusip + "'");
				stat.addBatch("DELETE SDMCall WHERE CUSIP ='" + cusip + "'");
				stat.addBatch("DELETE SDMCallScheduleService WHERE CUSIP ='"
						+ cusip + "'");
				stat.addBatch("DELETE SDMPut WHERE CUSIP ='" + cusip + "'");
				stat.addBatch("DELETE SDMPutScheduleService WHERE CUSIP ='"
						+ cusip + "'");
				stat.addBatch("DELETE SDMVariableRate WHERE CUSIP ='" + cusip
						+ "'");
				stat.addBatch("DELETE SDMVariableRateSchedule WHERE CUSIP ='"
						+ cusip + "'");
				stat.addBatch("DELETE SDMSinkingFund WHERE CUSIP ='" + cusip
						+ "'");
				stat.addBatch("DELETE SDMSinkingFundSchedule WHERE CUSIP ='"
						+ cusip + "'");
				stat.addBatch("DELETE SDMSpecial WHERE CUSIP ='" + cusip + "'");
				stat
						.addBatch("DELETE SDMSpecialRedemptionOrExtraordinaryCallSchedule WHERE CUSIP ='"
								+ cusip + "'");
				stat.addBatch("DELETE SDMCommentText WHERE CUSIP ='" + cusip
						+ "'");
				stat.addBatch("DELETE SDMRating WHERE CUSIP ='" + cusip + "'");
				stat.addBatch("DELETE SDMCreditEnhancement WHERE CUSIP ='"
						+ cusip + "'");
				stat.addBatch("DELETE SDMAgent WHERE CUSIP ='" + cusip + "'");
				stat.addBatch("DELETE SDMAdvisorAgent WHERE CUSIP ='" + cusip
						+ "'");
				stat.addBatch("DELETE SDMNotificationService WHERE CUSIP ='"
						+ cusip + "'");
				stat.addBatch("DELETE SDMRelatedCUSIP WHERE CUSIP ='" + cusip
						+ "'");
				stat.addBatch("DELETE SDMRepositoryCatalog WHERE CUSIP ='"
						+ cusip + "'");
				int[] updateCounts = stat.executeBatch();
				for (int updateCount : updateCounts) {
					totalCount = totalCount + updateCount;
				}
				logger.debug("Deleted the CUSIP " + cusip + " records = "
						+ totalCount);
			} catch (Exception e) {
				logger.debug("Exception while processing SDM records....  " + e);
			}

		} else if (grpFmtType.equals("02")) {
			// insert into QS??02 table
			datedDate = line.substring(13, 23).trim();
			couponRate = line.substring(23, 29).trim();
			compoundingYield = line.substring(29, 35).trim();
			maturityDate = line.substring(35, 45).trim();
			termSerialIndicator = line.substring(45, 46).trim();
			calculatedCouponIndicator = line.substring(46, 47).trim();
			additionalIssuerDescription1 = line.substring(49, length).trim().replace("'", "''");;

			couponRate_d = couponRate.trim().length() == 0 ? 0.00 : Double
					.parseDouble(couponRate);
			compoundingYield_d = compoundingYield.trim().length() == 0 ? 0.00
					: Double.parseDouble(compoundingYield);

			sqlQS = "UPDATE SDMCUSIP SET " + "DatedDate='" + datedDate
					+ "',CouponRate =" + couponRate_d + ",CompoundingYield="
					+ compoundingYield_d + ",MaturityDate='" + maturityDate
					+ "',TermSerialIndicator='" + termSerialIndicator
					+ "',CalculatedCouponIndicator ='"
					+ calculatedCouponIndicator
					+ "',AdditionalIssuerDescription1='"
					+ additionalIssuerDescription1 + "' WHERE CUSIP='" + cusip
					+ "'";

		} else if (grpFmtType.equals("03")) {
			// insert into QS??03 table
			additionalIssuerDescription2 = line.substring(6, length).trim().replace("'", "''");;
			sqlQS = "UPDATE SDMCUSIP SET AdditionalIssuerDescription2='"
					+ additionalIssuerDescription2 + "' WHERE CUSIP='" + cusip
					+ "'";
		} else if (grpFmtType.equals("04")) {
			// insert into QS??04 table
			issuingDescription = line.substring(6, length).trim().replace("'", "''");;
			sqlQS = "UPDATE SDMCUSIP SET IssuingDescription ='"
					+ issuingDescription + "' WHERE CUSIP='" + cusip + "'";
		}

		stat.addBatch(sqlQS);
	}

	void processID(String line, String cusip) throws Exception {
		int length = line.length();
		String sqlID = "";
		String interestTypeIndicatorCode = "";
		String guarantorIndicator = "";
		String letterOfCreditIndicator = "";
		String insuranceIndicator = "";
		String defaultIndicator = "";
		String partialCallIndicator = "";
		String completeCallIndicator = "";
		String mandatoryTenderIndicator = "";
		String specialRedemptionExtraordinaryCallIndicator = "";
		interestTypeIndicatorCode = line.substring(6, 10).trim();
		guarantorIndicator = line.substring(10, 11).trim();
		letterOfCreditIndicator = line.substring(11, 12).trim();
		insuranceIndicator = line.substring(12, 13).trim();
		defaultIndicator = line.substring(13, 14).trim();
		partialCallIndicator = line.substring(14, 15).trim();
		completeCallIndicator = line.substring(15, 16).trim();
		mandatoryTenderIndicator = line.substring(16, 17).trim();
		specialRedemptionExtraordinaryCallIndicator = line.substring(17, 18)
				.trim();
		sqlID = "UPDATE SDMCUSIP SET " + "InterestTypeIndicatorCode='"
				+ interestTypeIndicatorCode + "',GuarantorIndicator='"
				+ guarantorIndicator + "',LetterOfCreditIndicator='"
				+ letterOfCreditIndicator + "',InsuranceIndicator='"
				+ insuranceIndicator + "',DefaultIndicator='"
				+ defaultIndicator + "',PartialCallIndicator='"
				+ partialCallIndicator + "',CompleteCallIndicator='"
				+ completeCallIndicator + "',MandatoryTenderIndicator='"
				+ mandatoryTenderIndicator
				+ "',SpecialRedemptionExtraordinaryCallIndicator='"
				+ specialRedemptionExtraordinaryCallIndicator
				+ "' WHERE CUSIP='" + cusip + "'";
		stat.addBatch(sqlID);
	}

	//Interest Pay Record - Type 'IN'  - SDMCUSIP
	void processIN(String line, String cusip) throws Exception {
		
		String grpFmtType = "";
		String sqlIN = "";
		String paymentType = "";
		String interestAccrualOrAccretionDate = "";
		String firstCouponDate = "";
		String nextOrLastCoupon = "";
		String interestPayFrequencyStandardPeriod = "";
		String interestPayFrequencyIrregularPeriod = "";
		String interestPayFrequencyNumericDayOfPeriod = "";
		String interestPayFrequencyDayCode = "";
		String accrualCount = "";
		String currentInterestDate = "";
		String currentInterestIndicator = "";
		String currencyofOriginalOffering="";
		String paymentForm="";
		String currencyOfInterestPay="";
		grpFmtType = line.substring(4, 6);
		if (grpFmtType.equals("01")) {
			paymentType = line.substring(6, 8).trim();
			interestAccrualOrAccretionDate = line.substring(8, 18).trim();
			firstCouponDate = line.substring(18, 28).trim();
			nextOrLastCoupon = line.substring(28, 38).trim();
			interestPayFrequencyStandardPeriod = line.substring(38, 41).trim();
			interestPayFrequencyIrregularPeriod = line.substring(41, 44).trim();
			interestPayFrequencyNumericDayOfPeriod = line.substring(44, 47).trim();
			interestPayFrequencyDayCode = line.substring(47, 50).trim();
			accrualCount = line.substring(50, 60).trim();
			currentInterestDate = line.substring(60, 70).trim();
			currentInterestIndicator = line.substring(70, 71).trim();
			Integer interestPayFrequencyIrregularPeriod_i;
			interestPayFrequencyIrregularPeriod_i = interestPayFrequencyIrregularPeriod
				.trim().length() == 0 ? 0 : Integer
				.parseInt(interestPayFrequencyIrregularPeriod);
			sqlIN = "UPDATE SDMCUSIP SET " + "PaymentType='" + paymentType
				+ "',InterestAccrualOrAccretionDate='"
				+ interestAccrualOrAccretionDate + "',FirstCouponDate='"
				+ firstCouponDate + "',NextOrLastCoupon='" + nextOrLastCoupon
				+ "',InterestPayFrequencyStandardPeriod='"
				+ interestPayFrequencyStandardPeriod
				+ "',InterestPayFrequencyIrregularPeriod="
				+ interestPayFrequencyIrregularPeriod_i
				+ ",InterestPayFrequencyNumericDayOfPeriod='"
				+ interestPayFrequencyNumericDayOfPeriod
				+ "',InterestPayFrequencyDayCode='"
				+ interestPayFrequencyDayCode + "',AccrualCount='"
				+ accrualCount + "',CurrentInterestDate='"
				+ currentInterestDate + "',CurrentInterestIndicator='"
				+ currentInterestIndicator + "' WHERE CUSIP='" + cusip + "'";
		}
		else if (grpFmtType.equals("02")) {
			currencyofOriginalOffering = line.substring(6, 10).trim();
			paymentForm =line.substring(12, 16).trim();
			currencyOfInterestPay=line.substring(26, 30).trim();
			sqlIN="UPDATE SDMCUSIP SET " +
			"CurrencyofOriginalOffering='" +  currencyofOriginalOffering +
			"',PaymentForm='" + paymentForm +
			"',CurrencyOfInterestPay='" + currencyOfInterestPay + "' WHERE CUSIP='" + cusip + "'";

		}
		stat.addBatch(sqlIN);
	}

	void processPT(String line, String cusip) throws Exception {
		int length = line.length();
		String sqlPT = "";
		String purposeTypeCode = "";
		String purposeClassCode = "";
		String purposeSubClassCode = "";
		purposeTypeCode = line.substring(6, 10).trim();
		purposeClassCode = line.substring(10, 14).trim();
		purposeSubClassCode = line.substring(14, 18).trim();
		sqlPT = "UPDATE SDMCUSIP SET " + "PurposeTypeCode='" + purposeTypeCode
				+ "',PurposeClassCode='" + purposeClassCode
				+ "',PurposeSubClassCode='" + purposeSubClassCode
				+ "' WHERE CUSIP='" + cusip + "'";

		stat.addBatch(sqlPT);
	}

	void processTA(String line, String cusip) throws Exception {
		int length = line.length();
		String sqlTA = "";

		String alternativeMinimumTaxAMTStatus = "";
		String bankQualifiedStatus = "";
		String taxableStatus = "";
		String adValoremTaxStatus = "";
		String securedStatusCode = "";
		String assetClaimCode = "";
		String depositoryTrustCompanyEligibilityCode = "";
		String midwestSecurityTrustCompanyEligibilityCode = "";
		String philadelphiaDepositoryEligibilityCode = "";
		String superSinkerIndicator = "";
		String stateTaxIndicator = "";
		String additionalStateCode = "";
		String secondAdditionalStateCode = "";
		alternativeMinimumTaxAMTStatus = line.substring(6, 7).trim();
		bankQualifiedStatus = line.substring(7, 8).trim();
		taxableStatus = line.substring(8, 9).trim();
		adValoremTaxStatus = line.substring(9, 10).trim();
		securedStatusCode = line.substring(10, 12).trim();
		assetClaimCode = line.substring(12, 14).trim();
		depositoryTrustCompanyEligibilityCode = line.substring(14, 15).trim();
		midwestSecurityTrustCompanyEligibilityCode = line.substring(15, 16)
				.trim();
		philadelphiaDepositoryEligibilityCode = line.substring(16, 17).trim();
		superSinkerIndicator = line.substring(17, 18).trim();
		stateTaxIndicator = line.substring(18, 19).trim();
		additionalStateCode = line.substring(19, 21).trim();
		secondAdditionalStateCode = line.substring(21, 23).trim();
		sqlTA = "UPDATE SDMCUSIP SET " + "AlternativeMinimumTaxAMTStatus='"
				+ alternativeMinimumTaxAMTStatus + "',BankQualifiedStatus='"
				+ bankQualifiedStatus + "',TaxableStatus='" + taxableStatus
				+ "',AdValoremTaxStatus='" + adValoremTaxStatus
				+ "',SecuredStatusCode='" + securedStatusCode
				+ "',AssetClaimCode='" + assetClaimCode
				+ "',DepositoryTrustCompanyEligibilityCode='"
				+ depositoryTrustCompanyEligibilityCode
				+ "',MidwestSecurityTrustCompanyEligibilityCode='"
				+ midwestSecurityTrustCompanyEligibilityCode
				+ "',PhiladelphiaDepositoryEligibilityCode='"
				+ philadelphiaDepositoryEligibilityCode
				+ "',SuperSinkerIndicator='" + superSinkerIndicator
				+ "',StateTaxIndicator='" + stateTaxIndicator
				+ "',AdditionalStateCode='" + additionalStateCode
				+ "',SecondAdditionalStateCode='" + secondAdditionalStateCode
				+ "' WHERE CUSIP='" + cusip + "'";

		stat.addBatch(sqlTA);
	}

	void processIS(String line, String cusip) throws Exception {
		int length = line.length();
		String sqlIS = "";

		String originalIssueDiscountIndicator = "";
		String reofferingPriceAtIssuance = "";
		String reofferingYieldAtIssuance = "";
		String reofferedStatusIndicator = "";
		String zeroCouponBondType = "";
		String initialCouponRate = "";
		String nominalRate = "";
		String fixedCouponRate = "";
		String installmentPaymentRate = "";
		String currentInterestConversionRate = "";
		String pricedToCallDollarPrice = "";
		String pricedToCallYield = "";

		originalIssueDiscountIndicator = line.substring(6, 7).trim();
		reofferingPriceAtIssuance = line.substring(7, 15).trim();
		reofferingYieldAtIssuance = line.substring(15, 21).trim();
		reofferedStatusIndicator = line.substring(21, 22).trim();
		zeroCouponBondType = line.substring(22, 26).trim();
		initialCouponRate = line.substring(29, 35).trim();
		nominalRate = line.substring(35, 41).trim();
		fixedCouponRate = line.substring(41, 47).trim();
		installmentPaymentRate = line.substring(47, 54).trim();
		currentInterestConversionRate = line.substring(55, 60).trim();
		pricedToCallDollarPrice = line.substring(60, 68).trim();
		pricedToCallYield = line.substring(68, 74).trim();
		Double reofferingPriceAtIssuance_d;
		Double reofferingYieldAtIssuance_d;
		Double initialCouponRate_d;
		Double nominalRate_d;
		Double fixedCouponRate_d;
		Double installmentPaymentRate_d;
		Double currentInterestConversionRate_d;
		Double pricedToCallDollarPrice_d;
		Double pricedToCallYield_d;

		reofferingPriceAtIssuance_d = reofferingPriceAtIssuance.trim().length() == 0 ? 0.00
				: Double.parseDouble(reofferingPriceAtIssuance);
		reofferingYieldAtIssuance_d = reofferingYieldAtIssuance.trim().length() == 0 ? 0.00
				: Double.parseDouble(reofferingYieldAtIssuance);
		initialCouponRate_d = initialCouponRate.trim().length() == 0 ? 0.00
				: Double.parseDouble(initialCouponRate);
		nominalRate_d = nominalRate.trim().length() == 0 ? 0.00 : Double
				.parseDouble(nominalRate);
		fixedCouponRate_d = fixedCouponRate.trim().length() == 0 ? 0.00
				: Double.parseDouble(fixedCouponRate);
		installmentPaymentRate_d = installmentPaymentRate.trim().length() == 0 ? 0.00
				: Double.parseDouble(installmentPaymentRate);
		currentInterestConversionRate_d = currentInterestConversionRate.trim()
				.length() == 0 ? 0.00 : Double
				.parseDouble(currentInterestConversionRate);
		pricedToCallDollarPrice_d = pricedToCallDollarPrice.trim().length() == 0 ? 0.00
				: Double.parseDouble(pricedToCallDollarPrice);
		pricedToCallYield_d = pricedToCallYield.trim().length() == 0 ? 0.00
				: Double.parseDouble(pricedToCallYield);

		sqlIS = "UPDATE SDMCUSIP SET " + "OriginalIssueDiscountIndicator='"
				+ originalIssueDiscountIndicator
				+ "',ReofferingPriceAtIssuance=" + reofferingPriceAtIssuance_d
				+ ",ReofferingYieldAtIssuance=" + reofferingYieldAtIssuance_d
				+ ",ReofferedStatusIndicator='" + reofferedStatusIndicator
				+ "',ZeroCouponBondType='" + zeroCouponBondType
				+ "',InitialCouponRate=" + initialCouponRate_d
				+ ",NominalRate =" + nominalRate_d + ",FixedCouponRate="
				+ fixedCouponRate_d + ",InstallmentPaymentRate="
				+ installmentPaymentRate_d + ",CurrentInterestConversionRate="
				+ currentInterestConversionRate_d + ",PricedToCallDollarPrice="
				+ pricedToCallDollarPrice_d + ",PricedToCallYield="
				+ pricedToCallYield_d + " WHERE CUSIP='" + cusip + "'";
		stat.addBatch(sqlIS);
	}

	void processUN(String line, String cusip) throws Exception {

		int length = line.length();
		String sqlUN = "";
		StringBuffer test = new StringBuffer();
		PreparedStatement ps=null;
		String underwriterType = "";
		String underwriterName = "";
		underwriterType = line.substring(6, 10).trim();
		underwriterName = line.substring(10, 70).trim().replace("'", "''");
		sqlUN = "UPDATE SDMCUSIP SET " + "UnderwriterType='" + underwriterType
				+ "',UnderwriterName='" + underwriterName + "' WHERE CUSIP='"
				+ cusip + "'";
		stat.addBatch(sqlUN);
	}

	void processCO(String line, String cusip) throws Exception {

		int length = line.length();
		String sqlCO = "";

		String convertibleBeginDate = "";
		String convertibleEndDate = "";
		String convertibleOptionPeriod = "";
		String convertiblePrice = "";
		String convertibleRatio = "";
		String convertibleType = "";
		String specialRedemptionType = "";

		convertibleBeginDate = line.substring(6, 16).trim();
		convertibleEndDate = line.substring(16, 26).trim();
		convertibleOptionPeriod = line.substring(26, 27).trim();
		convertiblePrice = line.substring(27, 37).trim();
		convertibleRatio = line.substring(37, 47).trim();
		convertibleType = line.substring(47, 51).trim();
		specialRedemptionType = line.substring(51, 52).trim();
		Double convertiblePrice_d;
		Double convertibleRatio_d;
		convertiblePrice_d = convertiblePrice.trim().length() == 0 ? 0.00
				: Double.parseDouble(convertiblePrice);
		convertibleRatio_d = convertibleRatio.trim().length() == 0 ? 0.00
				: Double.parseDouble(convertibleRatio);

		sqlCO = "UPDATE SDMCUSIP SET " + "ConvertibleBeginDate='"
				+ convertibleBeginDate + "',ConvertibleEndDate='"
				+ convertibleEndDate + "',ConvertibleOptionPeriod='"
				+ convertibleOptionPeriod + "',ConvertiblePrice="
				+ convertiblePrice_d + ",ConvertibleRatio="
				+ convertibleRatio_d + ",ConvertibleType='" + convertibleType
				+ "',SpecialRedemptionType='" + specialRedemptionType
				+ "' WHERE CUSIP='" + cusip + "'";
		stat.addBatch(sqlCO);
	}

	void processPR(String line, String cusip) throws Exception {
		String grpFmtType = "";
		grpFmtType = line.substring(4, 6);
		String sqlPR = "";

		String preRefundedType = "";
		String preRefundedDate = "";
		String preRefundedPrice = "";
		String refundingIssueDatedDate = "";
		String methodOfRefunding = "";
		String optionalRedemptionDefeasanceStatusIndicator = "";
		String legalDefeasanceStatusIndicator = "";
		String economicDefeasanceStatusIndicator = "";
		String escrowType = "";
		String escrowPercentage = "";
		String escrowType1 = "";
		String escrowPercentage1 = "";

		if (grpFmtType.equals("01")) {
			preRefundedType = line.substring(6, 10).trim();
			preRefundedDate = line.substring(10, 20).trim();
			preRefundedPrice = line.substring(20, 29).trim();
			refundingIssueDatedDate = line.substring(29, 39).trim();
			methodOfRefunding = line.substring(39, 40).trim();
			optionalRedemptionDefeasanceStatusIndicator = line
					.substring(40, 41).trim();
			legalDefeasanceStatusIndicator = line.substring(41, 42).trim();
			economicDefeasanceStatusIndicator = line.substring(42, 43).trim();
			Double preRefundedPrice_d;
			preRefundedPrice_d = preRefundedPrice.trim().length() == 0 ? 0.00
					: Double.parseDouble(preRefundedPrice);
			sqlPR = "UPDATE SDMCUSIP SET " + "PreRefundedType='"
					+ preRefundedType + "',PreRefundedDate='" + preRefundedDate
					+ "',PreRefundedPrice=" + preRefundedPrice_d
					+ ",RefundingIssueDatedDate='" + refundingIssueDatedDate
					+ "',MethodOfRefunding='" + methodOfRefunding
					+ "',OptionalRedemptionDefeasanceStatusIndicator='"
					+ optionalRedemptionDefeasanceStatusIndicator
					+ "',LegalDefeasanceStatusIndicator='"
					+ legalDefeasanceStatusIndicator
					+ "',EconomicDefeasanceStatusIndicator='"
					+ economicDefeasanceStatusIndicator + "' WHERE CUSIP='"
					+ cusip + "'";

		} else if (grpFmtType.equals("02")) {
			escrowType = line.substring(6, 10).trim();
			escrowPercentage = line.substring(10, 17).trim();
			escrowType1 = line.substring(44, 48).trim();
			escrowPercentage1 = line.substring(48, 55).trim();
			Double escrowPercentage_d;
			Double escrowPercentage1_d;
			escrowPercentage_d = escrowPercentage.trim().length() == 0 ? 0.00
					: Double.parseDouble(escrowPercentage);
			escrowPercentage1_d = escrowPercentage1.trim().length() == 0 ? 0.00
					: Double.parseDouble(escrowPercentage1);

			sqlPR = "UPDATE SDMCUSIP SET " + "EscrowType='" + escrowType
					+ "',EscrowPercentage=" + escrowPercentage_d
					+ ",EscrowType1='" + escrowType1 + "',EscrowPercentage1="
					+ escrowPercentage1_d + " WHERE CUSIP='" + cusip + "'";
		}
		stat.addBatch(sqlPR);
	}

	void processOF(String line, String cusip) throws Exception {
		String grpFmtType = "";
		grpFmtType = line.substring(4, 6);
		String sqlOF = "";

		String offeringType = "";
		String securityType = "";
		String registrationType = "";
		String institutionType = "";
		String institutionSubType = "";
		String CUSIPOrKISAssignedIndicatorCode = "";
		String awardDate = "";
		String awardDateStatus = "";
		String settlementDate = "";
		String settlementDateStatus = "";
		String whenIssuedIndicator = "";
		String OSRepositoryIndicator = "";
		String awardTime = "";
		String awardTimeZone = "";
		String KENNYQUOTEIndicator = "";
		String offeringLinkIdentifier = "";
		String preliminaryFlag = "";
		String institutionSubClass = "";
		String firstExecutionDate = "";
		String firstExecutionDateTime = "";
		String firstExecutionDateTimeZone = "";

		if (grpFmtType.equals("01")) {
			offeringType = line.substring(6, 8).trim();
			securityType = line.substring(8, 12).trim();
			registrationType = line.substring(12, 16).trim();
			institutionType = line.substring(16, 20).trim();
			institutionSubType = line.substring(20, 24).trim();
			CUSIPOrKISAssignedIndicatorCode = line.substring(24, 25).trim();
			awardDate = line.substring(25, 35).trim();
			awardDateStatus = line.substring(35, 37).trim();
			settlementDate = line.substring(37, 47).trim();
			settlementDateStatus = line.substring(47, 49).trim();
			whenIssuedIndicator = line.substring(49, 50).trim();
			OSRepositoryIndicator = line.substring(50, 51).trim();
			awardTime = line.substring(51, 55).trim();
			awardTimeZone = line.substring(55, 59).trim();
			KENNYQUOTEIndicator = line.substring(60, 61).trim();
			offeringLinkIdentifier = line.substring(61, 70).trim();
			preliminaryFlag = line.substring(70, 71).trim();
			institutionSubClass = line.substring(71, 75).trim();
			Integer awardTime_i;

			awardTime_i = awardTime.trim().length() == 0 ? 0 : Integer
					.parseInt(awardTime);

			sqlOF = "UPDATE SDMCUSIP SET " + "OfferingType='" + offeringType
					+ "',SecurityType='" + securityType
					+ "',RegistrationType='" + registrationType
					+ "',InstitutionType='" + institutionType
					+ "',InstitutionSubType='" + institutionSubType
					+ "',CUSIPOrKISAssignedIndicatorCode='"
					+ CUSIPOrKISAssignedIndicatorCode + "',AwardDate='"
					+ awardDate + "',AwardDateStatus='" + awardDateStatus
					+ "',SettlementDate='" + settlementDate
					+ "',SettlementDateStatus='" + settlementDateStatus
					+ "',WhenIssuedIndicator='" + whenIssuedIndicator
					+ "',OSRepositoryIndicator='" + OSRepositoryIndicator
					+ "',AwardTime=" + awardTime_i + ",AwardTimeZone='"
					+ awardTimeZone + "',KENNYQUOTEIndicator='"
					+ KENNYQUOTEIndicator + "',OfferingLinkIdentifier='"
					+ offeringLinkIdentifier + "',PreliminaryFlag ='"
					+ preliminaryFlag + "',InstitutionSubClass='"
					+ institutionSubClass + "' WHERE CUSIP='" + cusip + "'";

		} else if (grpFmtType.equals("02")) {
			Integer firstExecutionDateTime_i;
			firstExecutionDate = line.substring(6, 16).trim();
			firstExecutionDateTime = line.substring(16, 20).trim();
			firstExecutionDateTimeZone = line.substring(20, 24).trim();
			firstExecutionDateTime_i = firstExecutionDateTime.trim().length() == 0 ? 0
					: Integer.parseInt(firstExecutionDateTime);
			sqlOF = "UPDATE SDMCUSIP SET " + "FirstExecutionDate='"
					+ firstExecutionDate + "',FirstExecutionDateTime="
					+ firstExecutionDateTime_i
					+ ",FirstExecutionDateTimeZone='"
					+ firstExecutionDateTimeZone + "' WHERE CUSIP='" + cusip
					+ "'";
		}
		stat.addBatch(sqlOF);
	}

	// Offering Amount Record - Type 'AM'-SDMCUSIP
	void processAM(String line, String cusip) throws Exception {

		String offeringOriginalAmount = "";
		String offeringOriginalAmountTypeIndicator = "";
		String maturityOriginalAmount = "";
		String maturityOriginalAmountTypeIndicator = "";
		String minimumTradingPiece = "";
		String maturityDenomination = "";
		String integralMultiple = "";
		String additionalDenomination = "";

		String grpFmtType = "";
		String sqlAM = "";
		grpFmtType = line.substring(4, 6);
		Double offeringOriginalAmount_d;
		Double maturityOriginalAmount_d;
		Double minimumTradingPiece_d;
		Double maturityDenomination_d;
		Double integralMultiple_d;
		Double additionalDenomination_d;

		if (grpFmtType.equals("01")) {
			offeringOriginalAmount = line.substring(6, 22).trim();
			offeringOriginalAmountTypeIndicator = line.substring(22, 23).trim();
			maturityOriginalAmount = line.substring(48, 64).trim();
			maturityOriginalAmountTypeIndicator = line.substring(64, 65).trim();

			offeringOriginalAmount_d = offeringOriginalAmount.trim().length() == 0 ? 0.00
					: Double.parseDouble(offeringOriginalAmount);
			maturityOriginalAmount_d = maturityOriginalAmount.trim().length() == 0 ? 0.00
					: Double.parseDouble(maturityOriginalAmount);
			sqlAM = "UPDATE SDMCUSIP SET " + "OfferingOriginalAmount="
					+ offeringOriginalAmount_d
					+ ",OfferingOriginalAmountTypeIndicator='"
					+ offeringOriginalAmountTypeIndicator
					+ "',MaturityOriginalAmount=" + maturityOriginalAmount_d
					+ ",MaturityOriginalAmountTypeIndicator='"
					+ maturityOriginalAmountTypeIndicator + "' WHERE CUSIP='"
					+ cusip + "'";

		} else if (grpFmtType.equals("02")) {
			minimumTradingPiece = line.substring(6, 22).trim();
			maturityDenomination = line.substring(32, 48).trim();
			integralMultiple = line.substring(48, 64).trim();
			additionalDenomination = line.substring(64, 80).trim();

			minimumTradingPiece_d = minimumTradingPiece.trim().length() == 0 ? 0.00
					: Double.parseDouble(minimumTradingPiece);
			maturityDenomination_d = maturityDenomination.trim().length() == 0 ? 0.00
					: Double.parseDouble(maturityDenomination);
			integralMultiple_d = integralMultiple.trim().length() == 0 ? 0.00
					: Double.parseDouble(integralMultiple);
			additionalDenomination_d = additionalDenomination.trim().length() == 0 ? 0.00
					: Double.parseDouble(additionalDenomination);

			sqlAM = "UPDATE SDMCUSIP SET " + "MinimumTradingPiece="
					+ minimumTradingPiece_d + ",MaturityDenomination="
					+ maturityDenomination_d + ",IntegralMultiple="
					+ integralMultiple_d + ",AdditionalDenomination="
					+ additionalDenomination_d + " WHERE CUSIP='" + cusip + "'";
		}
		stat.addBatch(sqlAM);
	}

	// Call Record - Type 'CA'-SDMCall
	void processCA(String line, String cusip) throws Exception {

		String callType = "";
		String firstCallDate = "";
		String firstCallPrice = "";
		String nextPremiumCallDate = "";
		String nextPremiumCallPrice = "";
		String nextParCallDate = "";
		String nextParCallPrice = "";
		String callFrequencyCode = "";
		String inWholeInPartIndicator = "";
		String callNotificationMinimumDays = "";
		String callNotificationMaximumDays = "";
		String redemptionRestrictionFlag = "";

		String grpFmtType = "";
		String sqlCA = "";
		grpFmtType = line.substring(4, 6);
		Double firstCallPrice_d;
		Double nextPremiumCallPrice_d;
		Double nextParCallPrice_d;

		if (grpFmtType.equals("01")) {

			callType = line.substring(6, 10).trim();
			firstCallDate = line.substring(10, 20).trim();
			firstCallPrice = line.substring(20, 29).trim();
			nextPremiumCallDate = line.substring(29, 39).trim();
			nextPremiumCallPrice = line.substring(39, 48).trim();
			nextParCallDate = line.substring(48, 58).trim();
			nextParCallPrice = line.substring(58, 67).trim();
			callFrequencyCode = line.substring(67, 70).trim();
			inWholeInPartIndicator = line.substring(70, 71).trim();
			callNotificationMinimumDays = line.substring(71, 74).trim();
			callNotificationMaximumDays = line.substring(74, 77).trim();

			firstCallPrice_d = firstCallPrice.trim().length() == 0 ? 0.00
					: Double.parseDouble(firstCallPrice);
			nextPremiumCallPrice_d = nextPremiumCallPrice.trim().length() == 0 ? 0.00
					: Double.parseDouble(nextPremiumCallPrice);
			nextParCallPrice_d = nextParCallPrice.trim().length() == 0 ? 0.00
					: Double.parseDouble(nextParCallPrice);

			sqlCA = "INSERT INTO SDMCall(CUSIP,CallType,FirstCallDate,FirstCallPrice,NextPremiumCallDate,NextPremiumCallPrice,"
					+ "NextParCallDate,NextParCallPrice,CallFrequencyCode,InWholeInPartIndicator,CallNotificationMinimumDays,CallNotificationMaximumDays) "
					+ "VALUES('"
					+ cusip
					+ "','"
					+ callType
					+ "','"
					+ firstCallDate
					+ "',"
					+ firstCallPrice_d
					+ ",'"
					+ nextPremiumCallDate
					+ "',"
					+ nextPremiumCallPrice_d
					+ ",'"
					+ nextParCallDate
					+ "',"
					+ nextParCallPrice_d
					+ ",'"
					+ callFrequencyCode
					+ "','"
					+ inWholeInPartIndicator
					+ "','"
					+ callNotificationMinimumDays
					+ "','"
					+ callNotificationMaximumDays + "')";
		} else if (grpFmtType.equals("02")) {
			redemptionRestrictionFlag = line.substring(11, 12).trim();
			sqlCA = "UPDATE SDMCall SET RedemptionRestrictionFlag ='" +redemptionRestrictionFlag 
			+ "' WHERE CUSIP='" + cusip + "'";
		}
		stat.addBatch(sqlCA);
	}

	// Call Schedule Service Record - Type 'CS'-SDMCallScheduleService
	void processCS(String line, String cusip) throws Exception {

		String callType = "";
		String CUSIPorKISAssignedNumber = "";
		String callDate = "";
		String callBeginDate = "";
		String callEndDate = "";
		String callFrequencyCode = "";
		String callPrice = "";
		String inWholeInPartIndicator = "";
		String callSchedulePrice = "";
		String redemptionRestrictionflag = "";
		String sqlCS = "";
		callType = line.substring(6, 10).trim();
		CUSIPorKISAssignedNumber = line.substring(10, 19).trim();
		callDate = line.substring(19, 29).trim();
		callBeginDate = line.substring(29, 39).trim();
		callEndDate = line.substring(39, 49).trim();
		callFrequencyCode = line.substring(49, 52).trim();
		callPrice = line.substring(52, 61).trim();
		inWholeInPartIndicator = line.substring(61, 62).trim();
		callSchedulePrice = line.substring(62, 71).trim();
		redemptionRestrictionflag = line.substring(71, 72).trim();
		Double callPrice_d;
		Double callSchedulePrice_d;
		callPrice_d = callPrice.trim().length() == 0 ? 0.00 : Double
				.parseDouble(callPrice);
		callSchedulePrice_d = callSchedulePrice.trim().length() == 0 ? 0.00
				: Double.parseDouble(callSchedulePrice);

		sqlCS = "INSERT INTO SDMCallScheduleService(CUSIP,callType,CUSIPorKISAssignedNumber ,callDate ,"
				+ "callBeginDate,callEndDate ,callFrequencyCode ,callPrice ,inWholeInPartIndicator ,"
				+ "callSchedulePrice ,redemptionRestrictionflag) VALUES('"
				+ cusip
				+ "','"
				+ callType
				+ "','"
				+ CUSIPorKISAssignedNumber
				+ "','"
				+ callDate
				+ "','"
				+ callBeginDate
				+ "','"
				+ callEndDate
				+ "','"
				+ callFrequencyCode
				+ "',"
				+ callPrice_d
				+ ",'"
				+ inWholeInPartIndicator
				+ "',"
				+ callSchedulePrice_d
				+ ",'" + redemptionRestrictionflag + "')";
		stat.addBatch(sqlCS);
	}

	// Put Record - Type 'PU'-SDMPut
	int processPU(String []inputRecords, int recNum, String grpType, String recType, String line, String cusip) throws Exception {
		
		//String grpLines[]=processMultipleGrp(inputRecords,recNum,grpType,recType,line);
		ArrayList grpLines =processMultipleGrp(inputRecords,recNum,grpType,recType,line);
		String putType = "";
		String nextPutDate = "";
		String nextPutPrice = "";
		String putFrequencyCode = "";
		String putNotificationMinimumDays = "";
		String putNotificationMaximumDays = "";
		String putNotificationStatus = "";
		String putNotificationBindingStatus = "";
		String numberofDaysNotificationMayBeWithdrawn = "";
		String expiredPutFlag = "";
		String conditionalPutReason = "";
		String conditionalPutType = "";
		String conditionalPutReason2 = "";
		String conditionalPutType2 = "";
		String conditionalPutReason3 = "";
		String conditionalPutType3 = "";
		String limitPutReason = "";
		String limitPutAmount = "";
		String limitPutReason2 = "";
		String limitPutAmount2 = "";
		String limitPutReason3 = "";
		String limitPutAmount3 = "";
		String sqlPU = "";
		String grpFmtType = "";
		Boolean isRecExist =false;

		Double nextPutPrice_d=0.00;
		Double limitPutAmount_d=0.00;
		Double limitPutAmount2_d=0.00;
		Double limitPutAmount3_d=0.00;
		Integer numberofDaysNotificationMayBeWithdrawn_i=0;
		for (int i = 0; i < grpLines.size(); i++) {
		
			line =  grpLines.get(i).toString();
			grpFmtType = line.substring(4, 6);
			// 01
			if (grpFmtType.equals("01")) {
				//if new record of same groupFormat then add it to batch.
				if (isRecExist.equals(true)){
					sqlPU = "INSERT INTO SDMPut(cusip,putType,nextPutDate, nextPutPrice, putFrequencyCode, putNotificationMinimumDays, "
						+ "putNotificationMaximumDays,putNotificationStatus,putNotificationBindingStatus,"
						+ "numberofDaysNotificationMayBeWithdrawn,expiredPutFlag,conditionalPutReason,conditionalPutType,conditionalPutReason2" +
								",conditionalPutType2,conditionalPutReason3,conditionalPutType3,limitPutReason,limitPutAmount,limitPutReason2" +
								",limitPutAmount2,limitPutReason3,limitPutAmount3) VALUES ('"
						+ cusip
						+ "','"
						+ putType
						+ "','"
						+ nextPutDate
						+ "',"
						+ nextPutPrice_d
						+ ",'"
						+ putFrequencyCode
						+ "','"
						+ putNotificationMinimumDays
						+ "','"
						+ putNotificationMaximumDays
						+ "','"
						+ putNotificationStatus
						+ "','"
						+ putNotificationBindingStatus
						+ "',"
						+ numberofDaysNotificationMayBeWithdrawn_i
						+ ",'"
						+ expiredPutFlag 
						+ "','"
						+ conditionalPutReason
						+ "','"
						+ conditionalPutType
						+ "','"
						+ conditionalPutReason2
						+ "','"
						+ conditionalPutType2
						+ "','"
						+ conditionalPutReason3
						+ "','"
						+ conditionalPutType3
						+ "','"
						+ limitPutReason
						+ "',"
						+ limitPutAmount_d
						+ ",'"
						+ limitPutReason2
						+ "',"
						+ limitPutAmount2_d
						+ ",'"
						+ limitPutReason3
						+ "',"
						+ limitPutAmount3_d + " )";
					stat.addBatch(sqlPU);
				}
				isRecExist=true;
				putType = line.substring(6, 10).trim();
				nextPutDate = line.substring(10, 20).trim();
				nextPutPrice = line.substring(20, 29).trim();
				putFrequencyCode = line.substring(29, 32).trim();
				putNotificationMinimumDays = line.substring(32, 36).trim();
				putNotificationMaximumDays = line.substring(36, 40).trim();
				putNotificationStatus = line.substring(40, 41).trim();
				putNotificationBindingStatus = line.substring(41, 42).trim();
				numberofDaysNotificationMayBeWithdrawn = line.substring(42, 45)
						.trim();
				expiredPutFlag = line.substring(45, 46).trim();
				nextPutPrice_d = nextPutPrice.trim().length() == 0 ? 0.00
						: Double.parseDouble(nextPutPrice);
				numberofDaysNotificationMayBeWithdrawn_i = numberofDaysNotificationMayBeWithdrawn
						.trim().length() == 0 ? 0 : Integer
						.parseInt(numberofDaysNotificationMayBeWithdrawn);

			
			} else if (grpFmtType.equals("02")) {
				// 02
				conditionalPutReason = line.substring(6, 8).trim();
				conditionalPutType = line.substring(8, 10).trim();
				conditionalPutReason2 = line.substring(10, 12).trim();
				conditionalPutType2 = line.substring(12, 14).trim();
				conditionalPutReason3 = line.substring(14, 16).trim();
				conditionalPutType3 = line.substring(16, 18).trim();
				limitPutReason = line.substring(18, 20).trim();
				limitPutAmount = line.substring(20, 29).trim();
				limitPutReason2 = line.substring(29, 31).trim();
				limitPutAmount2 = line.substring(31, 40).trim();
				limitPutReason3 = line.substring(40, 42).trim();
				limitPutAmount3 = line.substring(42, 51).trim();

				limitPutAmount_d = limitPutAmount.trim().length() == 0 ? 0.00
						: Double.parseDouble(limitPutAmount);
				limitPutAmount2_d = limitPutAmount2.trim().length() == 0 ? 0.00
						: Double.parseDouble(limitPutAmount2);
				limitPutAmount3_d = limitPutAmount3.trim().length() == 0 ? 0.00
						: Double.parseDouble(limitPutAmount3);
				
			}
		}
		sqlPU = "INSERT INTO SDMPut(cusip,putType,nextPutDate, nextPutPrice, putFrequencyCode, putNotificationMinimumDays, "
			+ "putNotificationMaximumDays,putNotificationStatus,putNotificationBindingStatus,"
			+ "numberofDaysNotificationMayBeWithdrawn,expiredPutFlag,conditionalPutReason,conditionalPutType,conditionalPutReason2" +
					",conditionalPutType2,conditionalPutReason3,conditionalPutType3,limitPutReason,limitPutAmount,limitPutReason2" +
					",limitPutAmount2,limitPutReason3,limitPutAmount3) VALUES ('"
			+ cusip
			+ "','"
			+ putType
			+ "','"
			+ nextPutDate
			+ "',"
			+ nextPutPrice_d
			+ ",'"
			+ putFrequencyCode
			+ "','"
			+ putNotificationMinimumDays
			+ "','"
			+ putNotificationMaximumDays
			+ "','"
			+ putNotificationStatus
			+ "','"
			+ putNotificationBindingStatus
			+ "',"
			+ numberofDaysNotificationMayBeWithdrawn_i
			+ ",'"
			+ expiredPutFlag 
			+ "','"
			+ conditionalPutReason
			+ "','"
			+ conditionalPutType
			+ "','"
			+ conditionalPutReason2
			+ "','"
			+ conditionalPutType2
			+ "','"
			+ conditionalPutReason3
			+ "','"
			+ conditionalPutType3
			+ "','"
			+ limitPutReason
			+ "',"
			+ limitPutAmount_d
			+ ",'"
			+ limitPutReason2
			+ "',"
			+ limitPutAmount2_d
			+ ",'"
			+ limitPutReason3
			+ "',"
			+ limitPutAmount3_d + " )";
		stat.addBatch(sqlPU);
		//returning the number records processed
		return grpLines.size();
	}

	// Put Schedule Service Record - Type 'PS'-SDMPutScheduleService
	void processPS(String line, String cusip) throws Exception {

		String putType = "";
		String cUSIPorKISAssignedNumber = "";
		String putDate = "";
		String putBeginDate = "";
		String putEndDate = "";
		String putFrequencyCode = "";
		String putPrice = "";
		String putExpirationDate = "";
		String putNotificationMinimumDays = "";
		String putNotificationMaximumDays = "";
		String sqlPS = "";

		putType = line.substring(6, 10).trim();
		cUSIPorKISAssignedNumber = line.substring(10, 19).trim();
		putDate = line.substring(19, 29).trim();
		putBeginDate = line.substring(29, 39).trim();
		putEndDate = line.substring(39, 49).trim();
		putFrequencyCode = line.substring(49, 52).trim();
		putPrice = line.substring(52, 61).trim();
		putExpirationDate = line.substring(61, 71).trim();
		putNotificationMinimumDays = line.substring(71, 75).trim();
		putNotificationMaximumDays = line.substring(75, 79).trim();
		Double putPrice_d;
		putPrice_d = putPrice.trim().length() == 0 ? 0.00 : Double
				.parseDouble(putPrice);

		sqlPS = "INSERT INTO SDMPutScheduleService(cusip,putType,CUSIPorKISAssignedNumber,putDate,putBeginDate,putEndDate,"
				+ "putFrequencyCode,putPrice,putExpirationDate,putNotificationMinimumDays,putNotificationMaximumDays) VALUES('"
				+ cusip
				+ "','"
				+ putType
				+ "','"
				+ cUSIPorKISAssignedNumber
				+ "','"
				+ putDate
				+ "','"
				+ putBeginDate
				+ "','"
				+ putEndDate
				+ "','"
				+ putFrequencyCode
				+ "',"
				+ putPrice_d
				+ ",'"
				+ putExpirationDate
				+ "','"
				+ putNotificationMinimumDays
				+ "','" + putNotificationMaximumDays + "')";

		stat.addBatch(sqlPS);
	}

	// Variable Rate Record - Type 'VR' -SDMVariableRate
	int processVR(String []inputRecords, int recNum, String grpType, String recType, String line, String cusip) throws Exception {
		
		//String grpLines[]=processMultipleGrp(inputRecords,recNum,grpType,recType,line);
		ArrayList grpLines=processMultipleGrp(inputRecords,recNum,grpType,recType,line);
		String variableType = "";
		String varyingInterestBeginDate = "";
		String variableFrequency = "";
		String variableFrequencyAdjustmentDay = "";
		String variableFrequencyIrregularPeriod = "";
		String nextVariableAdjustmentDate = "";
		String mandatoryPutUponConversionFlag = "";
		String conversionFactor = "";
		String variableRateFrequencyQualifierNumericDayOfPeriod = "";
		String fixedRateConversionDate = "";
		String variableRateFrequencyDayCode = "";

		String multipleIndexIndicator = "";
		String effectiveSpread = "";
		String highLowIndicator = "";
		String indexEffectiveBeginDate = "";
		String indexEffectiveEndDate = "";
		String interestRateCutOffDayCodeandTimeZone = "";
		String interestRateCutOffNumericAndStandardFrequency = "";
		String indexType = "";
		String indexNumericQualifierOrFrequency = "";
		String indexTypeOrAverage = "";
		String indexFormulaType = "";
		String indexMultiplier = "";
		String indexPercentage = "";
		String spreadRateAdjustment = "";
		String indexPercentageOrBasisPointsSpreadIndicator = "";
		String rateOrBasisPoint = "";
		String minimumRate = "";
		String maximumRate = "";
		String noCapIndicator = "";
		String interestRateMethodology = "";
		String fixOrFloatIndicator = "";

		String startingBaseRate = "";
		String startingBaseIndexType = "";
		String startingBaseIndexNumericQualifierOrFrequency = "";
		String startingBaseIndexTypeOrAverage = "";
		String immediatelyPrecedingInterestRate = "";
		String indexText = "";
		Double indexMultiplier_d=0.0;
		Double indexPercentage_d=0.0;
		Double rateOrBasisPoint_d=0.0;
		Double minimumRate_d=0.0;
		Double maximumRate_d=0.0;
		Double startingBaseRate_d=0.0;
		Double immediatelyPrecedingInterestRate_d=0.0;
		Integer variableFrequencyIrregularPeriod_i=0;
		Integer variableRateFrequencyQualifierNumericDayOfPeriod_i=0;
		String sqlVR = "";
		String grpFmtType ="";
		Boolean isRecExist =false;
		// 01
		for (int i = 0; i < grpLines.size(); i++) {
			line = grpLines.get(i).toString();
			grpFmtType = line.substring(4, 6);
			if (grpFmtType.equals("01")) {
				
				//if new record of same groupFormat then add it to batch.
				if (isRecExist.equals(true)){
					sqlVR = "INSERT INTO SDMVariableRate(cusip,variableType,varyingInterestBeginDate,variableFrequency,"
						+ "variableFrequencyAdjustmentDay,variableFrequencyIrregularPeriod ,nextVariableAdjustmentDate,"
						+ "mandatoryPutUponConversionFlag,conversionFactor,variableRateFrequencyQualifierNumericDayOfPeriod,"
						+ "fixedRateConversionDate,variableRateFrequencyDayCode,multipleIndexIndicator,effectiveSpread,"
						+ "highLowIndicator,indexEffectiveBeginDate,indexEffectiveEndDate,interestRateCutOffDayCodeandTimeZone,"
						+ "interestRateCutOffNumericAndStandardFrequency,indexType,indexNumericQualifierOrFrequency,indexTypeOrAverage,"
						+ "indexFormulaType,indexMultiplier,indexPercentage,spreadRateAdjustment,"
						+ "indexPercentageOrBasisPointsSpreadIndicator,rateOrBasisPoint,minimumRate,maximumRate,noCapIndicator,"
						+ "interestRateMethodology,fixOrFloatIndicator ,startingBaseRate ,startingBaseIndexType,"
						+ "startingBaseIndexNumericQualifierOrFrequency,startingBaseIndexTypeOrAverage,"
						+ "immediatelyPrecedingInterestRate ,indexText) VALUES('"
						+ cusip
						+ "','"
						+ variableType
						+ "','"
						+ varyingInterestBeginDate
						+ "','"
						+ variableFrequency
						+ "','"
						+ variableFrequencyAdjustmentDay
						+ "',"
						+ variableFrequencyIrregularPeriod_i
						+ ",'"
						+ nextVariableAdjustmentDate
						+ "','"
						+ mandatoryPutUponConversionFlag
						+ "','"
						+ conversionFactor
						+ "',"
						+ variableRateFrequencyQualifierNumericDayOfPeriod_i
						+ ",'"
						+ fixedRateConversionDate
						+ "','"
						+ variableRateFrequencyDayCode
						+ "','"
						+ multipleIndexIndicator
						+ "','"
						+ effectiveSpread
						+ "','"
						+ highLowIndicator
						+ "','"
						+ indexEffectiveBeginDate
						+ "','"
						+ indexEffectiveEndDate
						+ "','"
						+ interestRateCutOffDayCodeandTimeZone
						+ "','"
						+ interestRateCutOffNumericAndStandardFrequency
						+ "','"
						+ indexType
						+ "','"
						+ indexNumericQualifierOrFrequency
						+ "','"
						+ indexTypeOrAverage
						+ "','"
						+ indexFormulaType
						+ "',"
						+ indexMultiplier_d
						+ ","
						+ indexPercentage_d
						+ ",'"
						+ spreadRateAdjustment
						+ "','"
						+ indexPercentageOrBasisPointsSpreadIndicator
						+ "',"
						+ rateOrBasisPoint_d
						+ ","
						+ minimumRate_d
						+ ","
						+ maximumRate_d
						+ ",'"
						+ noCapIndicator
						+ "','"
						+ interestRateMethodology
						+ "','"
						+ fixOrFloatIndicator
						+ "',"
						+ startingBaseRate_d
						+ ",'"
						+ startingBaseIndexType
						+ "','"
						+ startingBaseIndexNumericQualifierOrFrequency
						+ "','"
						+ startingBaseIndexTypeOrAverage
						+ "',"
						+ immediatelyPrecedingInterestRate_d + ",'" + indexText + "')";
				stat.addBatch(sqlVR);
				}
				variableType = line.substring(6, 10).trim();
				varyingInterestBeginDate = line.substring(10, 20).trim();
				variableFrequency = line.substring(20, 23).trim();
				variableFrequencyAdjustmentDay = line.substring(23, 26).trim();
				variableFrequencyIrregularPeriod = line.substring(26, 29)
						.trim();
				nextVariableAdjustmentDate = line.substring(29, 39).trim();
				mandatoryPutUponConversionFlag = line.substring(39, 40).trim();
				conversionFactor = line.substring(40, 43).trim();
				variableRateFrequencyQualifierNumericDayOfPeriod = line
						.substring(43, 46).trim();
				fixedRateConversionDate = line.substring(46, 56).trim();
				variableRateFrequencyDayCode = line.substring(56, 59).trim();

				variableFrequencyIrregularPeriod_i = variableFrequencyIrregularPeriod
						.trim().length() == 0 ? 0 : Integer
						.parseInt(variableFrequencyIrregularPeriod);
				variableRateFrequencyQualifierNumericDayOfPeriod_i = variableRateFrequencyQualifierNumericDayOfPeriod
						.trim().length() == 0 ? 0
						: Integer
								.parseInt(variableRateFrequencyQualifierNumericDayOfPeriod);
				isRecExist =true;

			} else if (grpFmtType.equals("02")) {
				// 02
				multipleIndexIndicator = line.substring(6, 7).trim();
				effectiveSpread = line.substring(7, 8).trim();
				highLowIndicator = line.substring(8, 9).trim();
				indexEffectiveBeginDate = line.substring(9, 19).trim();
				indexEffectiveEndDate = line.substring(19, 29).trim();
				interestRateCutOffDayCodeandTimeZone = line.substring(29, 30)
						.trim();
				interestRateCutOffNumericAndStandardFrequency = line.substring(
						30, 34).trim();
				indexType = line.substring(34, 38).trim();
				indexNumericQualifierOrFrequency = line.substring(38, 42)
						.trim();
				indexTypeOrAverage = line.substring(42, 43).trim();
				indexFormulaType = line.substring(43, 44).trim();
				indexMultiplier = line.substring(44, 49).trim();
				indexPercentage = line.substring(49, 56).trim();
				spreadRateAdjustment = line.substring(56, 57).trim();
				indexPercentageOrBasisPointsSpreadIndicator = line.substring(
						57, 58).trim();
				rateOrBasisPoint = line.substring(59, 65).trim();
				minimumRate = line.substring(65, 71).trim();
				maximumRate = line.substring(71, 77).trim();
				noCapIndicator = line.substring(77, 78).trim();
				interestRateMethodology = line.substring(78, 79).trim();
				fixOrFloatIndicator = line.substring(79, 80).trim();

				indexMultiplier_d = indexMultiplier.trim().length() == 0 ? 0.00
						: Double.parseDouble(indexMultiplier);
				indexPercentage_d = indexPercentage.trim().length() == 0 ? 0.00
						: Double.parseDouble(indexPercentage);
				rateOrBasisPoint_d = rateOrBasisPoint.trim().length() == 0 ? 0.00
						: Double.parseDouble(rateOrBasisPoint);
				minimumRate_d = minimumRate.trim().length() == 0 ? 0.00
						: Double.parseDouble(minimumRate);
				maximumRate_d = maximumRate.trim().length() == 0 ? 0.00
						: Double.parseDouble(maximumRate);
			}
			// 03
			else if (grpFmtType.equals("03")) {
				startingBaseRate = line.substring(6, 12).trim();
				startingBaseIndexType = line.substring(12, 16).trim();
				startingBaseIndexNumericQualifierOrFrequency = line.substring(
						16, 20).trim();
				startingBaseIndexTypeOrAverage = line.substring(20, 21).trim();
				immediatelyPrecedingInterestRate = line.substring(21, 27)
						.trim();
				indexText = line.substring(27, 57).trim().replace("'", "''");
				;

				startingBaseRate_d = startingBaseRate.trim().length() == 0 ? 0.00
						: Double.parseDouble(startingBaseRate);
				immediatelyPrecedingInterestRate_d = immediatelyPrecedingInterestRate
						.trim().length() == 0 ? 0.00 : Double
						.parseDouble(immediatelyPrecedingInterestRate);
			}
		}
		sqlVR = "INSERT INTO SDMVariableRate(cusip,variableType,varyingInterestBeginDate,variableFrequency,"
				+ "variableFrequencyAdjustmentDay,variableFrequencyIrregularPeriod ,nextVariableAdjustmentDate,"
				+ "mandatoryPutUponConversionFlag,conversionFactor,variableRateFrequencyQualifierNumericDayOfPeriod,"
				+ "fixedRateConversionDate,variableRateFrequencyDayCode,multipleIndexIndicator,effectiveSpread,"
				+ "highLowIndicator,indexEffectiveBeginDate,indexEffectiveEndDate,interestRateCutOffDayCodeandTimeZone,"
				+ "interestRateCutOffNumericAndStandardFrequency,indexType,indexNumericQualifierOrFrequency,indexTypeOrAverage,"
				+ "indexFormulaType,indexMultiplier,indexPercentage,spreadRateAdjustment,"
				+ "indexPercentageOrBasisPointsSpreadIndicator,rateOrBasisPoint,minimumRate,maximumRate,noCapIndicator,"
				+ "interestRateMethodology,fixOrFloatIndicator ,startingBaseRate ,startingBaseIndexType,"
				+ "startingBaseIndexNumericQualifierOrFrequency,startingBaseIndexTypeOrAverage,"
				+ "immediatelyPrecedingInterestRate ,indexText) VALUES('"
				+ cusip
				+ "','"
				+ variableType
				+ "','"
				+ varyingInterestBeginDate
				+ "','"
				+ variableFrequency
				+ "','"
				+ variableFrequencyAdjustmentDay
				+ "',"
				+ variableFrequencyIrregularPeriod_i
				+ ",'"
				+ nextVariableAdjustmentDate
				+ "','"
				+ mandatoryPutUponConversionFlag
				+ "','"
				+ conversionFactor
				+ "',"
				+ variableRateFrequencyQualifierNumericDayOfPeriod_i
				+ ",'"
				+ fixedRateConversionDate
				+ "','"
				+ variableRateFrequencyDayCode
				+ "','"
				+ multipleIndexIndicator
				+ "','"
				+ effectiveSpread
				+ "','"
				+ highLowIndicator
				+ "','"
				+ indexEffectiveBeginDate
				+ "','"
				+ indexEffectiveEndDate
				+ "','"
				+ interestRateCutOffDayCodeandTimeZone
				+ "','"
				+ interestRateCutOffNumericAndStandardFrequency
				+ "','"
				+ indexType
				+ "','"
				+ indexNumericQualifierOrFrequency
				+ "','"
				+ indexTypeOrAverage
				+ "','"
				+ indexFormulaType
				+ "',"
				+ indexMultiplier_d
				+ ","
				+ indexPercentage_d
				+ ",'"
				+ spreadRateAdjustment
				+ "','"
				+ indexPercentageOrBasisPointsSpreadIndicator
				+ "',"
				+ rateOrBasisPoint_d
				+ ","
				+ minimumRate_d
				+ ","
				+ maximumRate_d
				+ ",'"
				+ noCapIndicator
				+ "','"
				+ interestRateMethodology
				+ "','"
				+ fixOrFloatIndicator
				+ "',"
				+ startingBaseRate_d
				+ ",'"
				+ startingBaseIndexType
				+ "','"
				+ startingBaseIndexNumericQualifierOrFrequency
				+ "','"
				+ startingBaseIndexTypeOrAverage
				+ "',"
				+ immediatelyPrecedingInterestRate_d + ",'" + indexText + "')";
		stat.addBatch(sqlVR);
		return grpLines.size();
	}

	// Variable Rate Schedule Record - Type 'VS'-SDMVariableRateSchedule
	void processVS(String line, String cusip) throws Exception {

		String variableType = "";
		String adjustmentDate = "";
		String rateOrBasisPoint = "";
		String nextAdjustmentBeginDate = "";
		String nextAdjustmentEndDate = "";
		String sqlVS = "";

		variableType = line.substring(6, 10).trim();
		adjustmentDate = line.substring(10, 20).trim();
		rateOrBasisPoint = line.substring(20, 27).trim();
		nextAdjustmentBeginDate = line.substring(27, 37).trim();
		nextAdjustmentEndDate = line.substring(37, 47).trim();
		Double rateOrBasisPoint_d;

		rateOrBasisPoint_d = rateOrBasisPoint.trim().length() == 0 ? 0.00
				: Double.parseDouble(rateOrBasisPoint);
		sqlVS = "INSERT INTO SDMVariableRateSchedule(cusip,variableType,adjustmentDate,rateOrBasisPoint,nextAdjustmentBeginDate,nextAdjustmentEndDate)"
				+ "VALUES('"
				+ cusip
				+ "','"
				+ variableType
				+ "','"
				+ adjustmentDate
				+ "',"
				+ rateOrBasisPoint_d
				+ ",'"
				+ nextAdjustmentBeginDate
				+ "','"
				+ nextAdjustmentEndDate
				+ "')";
		stat.addBatch(sqlVS);
	}

	// Sinking Fund Record - Type 'SI'- SDMSinkingFund
	void processSI(String line, String cusip) throws Exception {

		String sinkingFundType = "";
		String nextSinkingFundDate = "";
		String nextSinkingFundPrice = "";
		String priceCodeCalculation = "";
		String sinkingFundRedemptionMethod = "";
		String sinkingFundAmountParOrLowAmount = "";
		String sinkingFundAmountAccretedValueOrHighAmount = "";
		String sinkingFundTypeIndicator = "";
		String expiredSinkingFundFlag = "";

		String sinkingFundNotificationMinimumDays = "";
		String sinkingFundNotificationMaximumDays = "";
		String doubleUpOptionFactor = "";
		String funnelPercentage = "";

		String sqlSI = "";
		String grpFmtType = line.substring(4, 6);
		// 01
		if (grpFmtType.equals("01")) {

			sinkingFundType = line.substring(6, 10).trim();
			nextSinkingFundDate = line.substring(10, 20).trim();
			nextSinkingFundPrice = line.substring(20, 29).trim();
			priceCodeCalculation = line.substring(29, 33).trim();
			sinkingFundRedemptionMethod = line.substring(33, 37).trim();
			sinkingFundAmountParOrLowAmount = line.substring(37, 53).trim();
			sinkingFundAmountAccretedValueOrHighAmount = line.substring(53, 69)
					.trim();
			sinkingFundTypeIndicator = line.substring(69, 70).trim();
			expiredSinkingFundFlag = line.substring(70, 71).trim();
			Double nextSinkingFundPrice_d;
			Double sinkingFundAmountParOrLowAmount_d;
			Double sinkingFundAmountAccretedValueOrHighAmount_d;

			nextSinkingFundPrice_d = nextSinkingFundPrice.trim().length() == 0 ? 0.00
					: Double.parseDouble(nextSinkingFundPrice);
			sinkingFundAmountParOrLowAmount_d = sinkingFundAmountParOrLowAmount
					.trim().length() == 0 ? 0.00 : Double
					.parseDouble(sinkingFundAmountParOrLowAmount);
			sinkingFundAmountAccretedValueOrHighAmount_d = sinkingFundAmountAccretedValueOrHighAmount
					.trim().length() == 0 ? 0.00 : Double
					.parseDouble(sinkingFundAmountAccretedValueOrHighAmount);

			sqlSI = "INSERT INTO SDMSinkingFund(cusip,sinkingFundType,nextSinkingFundDate ,nextSinkingFundPrice ,priceCodeCalculation ,"
					+ "sinkingFundRedemptionMethod ,sinkingFundAmountParOrLowAmount ,sinkingFundAmountAccretedValueOrHighAmount ,"
					+ "sinkingFundTypeIndicator ,expiredSinkingFundFlag) VALUES('"
					+ cusip
					+ "','"
					+ sinkingFundType
					+ "','"
					+ nextSinkingFundDate
					+ "',"
					+ nextSinkingFundPrice_d
					+ ",'"
					+ priceCodeCalculation
					+ "','"
					+ sinkingFundRedemptionMethod
					+ "',"
					+ sinkingFundAmountParOrLowAmount_d
					+ ","
					+ sinkingFundAmountAccretedValueOrHighAmount_d
					+ ",'"
					+ sinkingFundTypeIndicator
					+ "','"
					+ expiredSinkingFundFlag
					+ "')";

		} else if (grpFmtType.equals("02")) {
			// 02
			sinkingFundNotificationMinimumDays = line.substring(6, 9).trim();
			sinkingFundNotificationMaximumDays = line.substring(9, 12).trim();
			doubleUpOptionFactor = line.substring(14, 19).trim();
			funnelPercentage = line.substring(19, 26).trim();

			Double doubleUpOptionFactor_d;
			Double funnelPercentage_d;
			Integer sinkingFundNotificationMinimumDays_d;
			Integer sinkingFundNotificationMaximumDays_d;

			doubleUpOptionFactor_d = doubleUpOptionFactor.trim().length() == 0 ? 0.00
					: Double.parseDouble(doubleUpOptionFactor);
			funnelPercentage_d = funnelPercentage.trim().length() == 0 ? 0.00
					: Double.parseDouble(funnelPercentage);

			sinkingFundNotificationMinimumDays_d = sinkingFundNotificationMinimumDays
					.trim().length() == 0 ? 0 : Integer
					.parseInt(sinkingFundNotificationMinimumDays);
			sinkingFundNotificationMaximumDays_d = sinkingFundNotificationMaximumDays
					.trim().length() == 0 ? 0 : Integer
					.parseInt(sinkingFundNotificationMaximumDays);

			sqlSI = "UPDATE SDMSinkingFund SET "
					+ "sinkingFundNotificationMinimumDays="
					+ sinkingFundNotificationMinimumDays_d
					+ ",sinkingFundNotificationMaximumDays="
					+ sinkingFundNotificationMaximumDays_d
					+ ",doubleUpOptionFactor=" + doubleUpOptionFactor_d
					+ ",funnelPercentage=" + funnelPercentage_d
					+ " WHERE CUSIP='" + cusip + "'";
		}
		stat.addBatch(sqlSI);
	}

	// Sinking Fund Schedule Service - Type 'SS' -SDMSinkingFundSchedule
	int processSS(String []inputRecords, int recNum, String grpType, String recType, String line, String cusip) throws Exception {

		//String grpLines[]=processMultipleGrp(inputRecords,recNum,grpType,recType,line);
		ArrayList grpLines=processMultipleGrp(inputRecords,recNum,grpType,recType,line);
		String sinkingFundType = "";
		String CUSIPorKISAssignedNumber = "";
		String sinkingFundDate = "";
		String sinkingFundBeginDate = "";
		String sinkingFundEndDate = "";
		String sinkingFundFrequency = "";
		String sinkingFundPrice = "";
		String priceCodeCalculation = "";
		String sinkingFundExpirationDate = "";
		String sinkingFundRedemptionMethod = "";
		String sinkingFundTypeIndicator = "";
		String sinkingFundAmount1 = "";
		String sinkingFundAmount2 = "";
		String sinkingFundSchedulePrice = "";
		Double sinkingFundAmount1_d=0.0;
		Double sinkingFundAmount2_d=0.0;
		Double sinkingFundSchedulePrice_d=0.0;
		Double sinkingFundPrice_d=0.0;
		Boolean isRecExist =false;
		String grpFmtType = "";
		String sqlSS = "";
		for (int i = 0; i < grpLines.size(); i++) {
			line = grpLines.get(i).toString();
			grpFmtType = line.substring(4, 6);
			// 01
			if (grpFmtType.equals("01")) {
				
				//if new record of same groupFormat then add it to batch.
				if (isRecExist.equals(true)){
					sqlSS = "INSERT INTO SDMSinkingFundSchedule(cusip,sinkingFundType,CUSIPorKISAssignedNumber,sinkingFundDate,"
						+ "sinkingFundBeginDate,sinkingFundEndDate,sinkingFundFrequency,sinkingFundPrice,priceCodeCalculation,"
						+ "sinkingFundExpirationDate,sinkingFundRedemptionMethod,sinkingFundTypeIndicator,sinkingFundAmount1,sinkingFundAmount2" +
								",sinkingFundSchedulePrice)VALUES('"
						+ cusip
						+ "','"
						+ sinkingFundType
						+ "','"
						+ CUSIPorKISAssignedNumber
						+ "','"
						+ sinkingFundDate
						+ "','"
						+ sinkingFundBeginDate
						+ "','"
						+ sinkingFundEndDate
						+ "','"
						+ sinkingFundFrequency
						+ "',"
						+ sinkingFundPrice_d
						+ ",'"
						+ priceCodeCalculation
						+ "','"
						+ sinkingFundExpirationDate
						+ "','"
						+ sinkingFundRedemptionMethod
						+ "','"
						+ sinkingFundTypeIndicator 
						+ "',"
						+ sinkingFundAmount1_d
						+ ","
						+ sinkingFundAmount2_d
						+ ","
						+  sinkingFundSchedulePrice_d
						+ ")";
					stat.addBatch(sqlSS);
					
				}
				isRecExist=true;
				sinkingFundType = line.substring(6, 10).trim();
				CUSIPorKISAssignedNumber = line.substring(10, 19).trim();
				sinkingFundDate = line.substring(19, 29).trim();
				sinkingFundBeginDate = line.substring(29, 39).trim();
				sinkingFundEndDate = line.substring(39, 49).trim();
				sinkingFundFrequency = line.substring(49, 52).trim();
				sinkingFundPrice = line.substring(52, 61).trim();
				priceCodeCalculation = line.substring(61, 65).trim();
				sinkingFundExpirationDate = line.substring(65, 75).trim();
				sinkingFundRedemptionMethod = line.substring(75, 79).trim();
				sinkingFundTypeIndicator = line.substring(79, 80).trim();

				sinkingFundPrice_d = sinkingFundPrice.trim().length() == 0 ? 0.00
						: Double.parseDouble(sinkingFundPrice);
			} else if (grpFmtType.equals("02")) {
				// 02
				sinkingFundAmount1 = line.substring(6, 22).trim();
				sinkingFundAmount2 = line.substring(22, 38).trim();
				sinkingFundSchedulePrice = line.substring(38, 47).trim();

				
				sinkingFundAmount1_d = sinkingFundAmount1.trim().length() == 0 ? 0.00
						: Double.parseDouble(sinkingFundAmount1);
				sinkingFundAmount2_d = sinkingFundAmount2.trim().length() == 0 ? 0.00
						: Double.parseDouble(sinkingFundAmount2);
				sinkingFundSchedulePrice_d = sinkingFundSchedulePrice.trim()
						.length() == 0 ? 0.00 : Double
						.parseDouble(sinkingFundSchedulePrice);
			}
		}
		sqlSS = "INSERT INTO SDMSinkingFundSchedule(cusip,sinkingFundType,CUSIPorKISAssignedNumber,sinkingFundDate,"
			+ "sinkingFundBeginDate,sinkingFundEndDate,sinkingFundFrequency,sinkingFundPrice,priceCodeCalculation,"
			+ "sinkingFundExpirationDate,sinkingFundRedemptionMethod,sinkingFundTypeIndicator,sinkingFundAmount1,sinkingFundAmount2" +
					",sinkingFundSchedulePrice)VALUES('"
			+ cusip
			+ "','"
			+ sinkingFundType
			+ "','"
			+ CUSIPorKISAssignedNumber
			+ "','"
			+ sinkingFundDate
			+ "','"
			+ sinkingFundBeginDate
			+ "','"
			+ sinkingFundEndDate
			+ "','"
			+ sinkingFundFrequency
			+ "',"
			+ sinkingFundPrice_d
			+ ",'"
			+ priceCodeCalculation
			+ "','"
			+ sinkingFundExpirationDate
			+ "','"
			+ sinkingFundRedemptionMethod
			+ "','"
			+ sinkingFundTypeIndicator 
			+ "',"
			+ sinkingFundAmount1_d
			+ ","
			+ sinkingFundAmount2_d
			+ ","
			+  sinkingFundSchedulePrice_d
			+ ")";
		stat.addBatch(sqlSS);
		return grpLines.size();
	}

	// Special Redemption/Extraordinary Call Record - Type 'SP'- SDMSpecial
	void processSP(String line, String cusip) throws Exception {

		String specialRedemptionOrExtraordinaryCallType = "";
		String priceCodeCalculation = "";
		String nextSpecialOrExtraordinaryRedemptionDate = "";
		String nextSpecialOrExtraordinaryPrice = "";
		String specialRedemptionFrequency = "";
		String specialRedemptionFrequencyIrregularPeriod = "";
		String specialRedemptionFrequencyNumericDayOfPeriod = "";
		String specialRedemptionFrequencyDayCode = "";
		String specialRedemptionPreviousOrNextDayIndicator = "";
		String specialRedemptionMinimumNotification = "";
		String specialRedemptionMaximumNotification = "";
		String specialRedemptionNotificationStatus = "";
		String specialRedemptionInWholeOrPartIndicator = "";
		String specialRedemptionMethod = "";
		String specialRedemptionInPartFrequency = "";
		String specialOrExtraordinaryRedemptionActiveOrInactiveFlag = "";
		String specialOrExtraordinaryRedemptionDefeasanceCode = "";
		String specialRedemptionReasonOrSource = "";
		String specialRedemptionReasonOrSource2 = "";
		String specialRedemptionReasonOrSource3 = "";
		String specialRedemptionReasonOrSource4 = "";
		String sqlSP = "";
		specialRedemptionOrExtraordinaryCallType = line.substring(6, 10).trim();
		priceCodeCalculation = line.substring(10, 14).trim();
		nextSpecialOrExtraordinaryRedemptionDate = line.substring(14, 24)
				.trim();
		nextSpecialOrExtraordinaryPrice = line.substring(24, 33).trim();
		specialRedemptionFrequency = line.substring(33, 36).trim();
		specialRedemptionFrequencyIrregularPeriod = line.substring(36, 39)
				.trim();
		specialRedemptionFrequencyNumericDayOfPeriod = line.substring(39, 42)
				.trim();
		specialRedemptionFrequencyDayCode = line.substring(42, 45).trim();
		specialRedemptionPreviousOrNextDayIndicator = line.substring(45, 46)
				.trim();
		specialRedemptionMinimumNotification = line.substring(46, 49).trim();
		specialRedemptionMaximumNotification = line.substring(49, 52).trim();
		specialRedemptionNotificationStatus = line.substring(52, 53).trim();
		specialRedemptionInWholeOrPartIndicator = line.substring(53, 54).trim();
		specialRedemptionMethod = line.substring(54, 58).trim();
		specialRedemptionInPartFrequency = line.substring(58, 61).trim();
		specialOrExtraordinaryRedemptionActiveOrInactiveFlag = line.substring(
				61, 62).trim();
		specialOrExtraordinaryRedemptionDefeasanceCode = line.substring(62, 63)
				.trim();
		specialRedemptionReasonOrSource = line.substring(63, 67).trim();
		specialRedemptionReasonOrSource2 = line.substring(67, 71).trim();
		specialRedemptionReasonOrSource3 = line.substring(71, 75).trim();
		specialRedemptionReasonOrSource4 = line.substring(75, 79).trim();
		Double nextSpecialOrExtraordinaryPrice_d;
		nextSpecialOrExtraordinaryPrice_d = nextSpecialOrExtraordinaryPrice
				.trim().length() == 0 ? 0.00 : Double
				.parseDouble(nextSpecialOrExtraordinaryPrice);

		sqlSP = "INSERT INTO SDMSpecial(cusip,specialRedemptionOrExtraordinaryCallType,priceCodeCalculation,"
				+ "nextSpecialOrExtraordinaryRedemptionDate,nextSpecialOrExtraordinaryPrice,specialRedemptionFrequency,"
				+ "specialRedemptionFrequencyIrregularPeriod,specialRedemptionFrequencyNumericDayOfPeriod,"
				+ "specialRedemptionFrequencyDayCode,specialRedemptionPreviousOrNextDayIndicator,specialRedemptionMinimumNotification,"
				+ "specialRedemptionMaximumNotification,specialRedemptionNotificationStatus,specialRedemptionInWholeOrPartIndicator,"
				+ "specialRedemptionMethod,specialRedemptionInPartFrequency,specialOrExtraordinaryRedemptionActiveOrInactiveFlag,"
				+ "specialOrExtraordinaryRedemptionDefeasanceCode,specialRedemptionReasonOrSource,specialRedemptionReasonOrSource2,"
				+ "specialRedemptionReasonOrSource3,specialRedemptionReasonOrSource4) VALUES('"
				+ cusip
				+ "','"
				+ specialRedemptionOrExtraordinaryCallType
				+ "','"
				+ priceCodeCalculation
				+ "','"
				+ nextSpecialOrExtraordinaryRedemptionDate
				+ "',"
				+ nextSpecialOrExtraordinaryPrice_d
				+ ",'"
				+ specialRedemptionFrequency
				+ "','"
				+ specialRedemptionFrequencyIrregularPeriod
				+ "','"
				+ specialRedemptionFrequencyNumericDayOfPeriod
				+ "','"
				+ specialRedemptionFrequencyDayCode
				+ "','"
				+ specialRedemptionPreviousOrNextDayIndicator
				+ "','"
				+ specialRedemptionMinimumNotification
				+ "','"
				+ specialRedemptionMaximumNotification
				+ "','"
				+ specialRedemptionNotificationStatus
				+ "','"
				+ specialRedemptionInWholeOrPartIndicator
				+ "','"
				+ specialRedemptionMethod
				+ "','"
				+ specialRedemptionInPartFrequency
				+ "','"
				+ specialOrExtraordinaryRedemptionActiveOrInactiveFlag
				+ "','"
				+ specialOrExtraordinaryRedemptionDefeasanceCode
				+ "','"
				+ specialRedemptionReasonOrSource
				+ "','"
				+ specialRedemptionReasonOrSource2
				+ "','"
				+ specialRedemptionReasonOrSource3
				+ "','"
				+ specialRedemptionReasonOrSource4 + "')";

		stat.addBatch(sqlSP);
	}

	// Special Redemption- Extraordinary Call Schedule Record - Type SX -
	// SDMSpecialRedemptionOrExtraordinaryCallSchedule
	void processSX(String line, String cusip) throws Exception {
		String specialRedemptionOrExtraordinaryCallType = "";
		String specialOrExtraordinaryRedemptionScheduleDate = "";
		String specialOrExtraordinaryRedemptionBeginDate = "";
		String specialOrExtraordinaryRedemptionEndDate = "";
		String specialRedemptionInPartFrequency = "";
		String specialRedemptionFrequencyIrregularPeriod = "";
		String specialRedemptionPrice = "";
		String specialRedemptionSchedulePrice = "";
		String specialRedemptionMinimumNotification = "";
		String specialRedemptionMaximumNotification = "";
		String specialRedemptionExpirationDate = "";

		String sqlSX = "";

		specialRedemptionOrExtraordinaryCallType = line.substring(6, 10).trim();
		specialOrExtraordinaryRedemptionScheduleDate = line.substring(10, 20)
				.trim();
		specialOrExtraordinaryRedemptionBeginDate = line.substring(20, 30)
				.trim();
		specialOrExtraordinaryRedemptionEndDate = line.substring(30, 40).trim();
		specialRedemptionInPartFrequency = line.substring(40, 43).trim();
		specialRedemptionFrequencyIrregularPeriod = line.substring(43, 46)
				.trim();
		specialRedemptionPrice = line.substring(46, 55).trim();
		specialRedemptionSchedulePrice = line.substring(55, 64).trim();
		specialRedemptionMinimumNotification = line.substring(64, 67).trim();
		specialRedemptionMaximumNotification = line.substring(67, 70).trim();
		specialRedemptionExpirationDate = line.substring(70, 80).trim();
		Double specialRedemptionPrice_d;
		Double specialRedemptionSchedulePrice_d;

		specialRedemptionPrice_d = specialRedemptionPrice.trim().length() == 0 ? 0.00
				: Double.parseDouble(specialRedemptionPrice);
		specialRedemptionSchedulePrice_d = specialRedemptionSchedulePrice
				.trim().length() == 0 ? 0.00 : Double
				.parseDouble(specialRedemptionSchedulePrice);

		sqlSX = "INSERT INTO SDMSpecialRedemptionOrExtraordinaryCallSchedule (cusip,specialRedemptionOrExtraordinaryCallType,specialOrExtraordinaryRedemptionScheduleDate,"
				+ "specialOrExtraordinaryRedemptionBeginDate,specialOrExtraordinaryRedemptionEndDate,specialRedemptionInPartFrequency,"
				+ "specialRedemptionFrequencyIrregularPeriod,specialRedemptionPrice,specialRedemptionSchedulePrice,specialRedemptionMinimumNotification,"
				+ "specialRedemptionMaximumNotification,specialRedemptionExpirationDate) VALUES('"
				+ cusip
				+ "','"
				+ specialRedemptionOrExtraordinaryCallType
				+ "','"
				+ specialOrExtraordinaryRedemptionScheduleDate
				+ "','"
				+ specialOrExtraordinaryRedemptionBeginDate
				+ "','"
				+ specialOrExtraordinaryRedemptionEndDate
				+ "','"
				+ specialRedemptionInPartFrequency
				+ "','"
				+ specialRedemptionFrequencyIrregularPeriod
				+ "',"
				+ specialRedemptionPrice_d
				+ ","
				+ specialRedemptionSchedulePrice_d
				+ ",'"
				+ specialRedemptionMinimumNotification
				+ "','"
				+ specialRedemptionMaximumNotification
				+ "','"
				+ specialRedemptionExpirationDate + "')";
		stat.addBatch(sqlSX);
	}

	// Comment Text Record - Type 'TE'- SDMCommentText
	void processTE(String line, String cusip) throws Exception {
		String commentTextIndicatorCode = "";
		String commentText = "";
		String sqlTE = "";
		commentTextIndicatorCode = line.substring(6, 7).trim();
		commentText = line.substring(7, 80).trim().replace("'", "''");

		sqlTE = "INSERT INTO SDMCommentText(CUSIP,commentTextIndicatorCode,commentText) VALUES('"
				+ cusip
				+ "','"
				+ commentTextIndicatorCode
				+ "','"
				+ commentText + "')";
		stat.addBatch(sqlTE);
	}

	// Rating Record - Type 'RA'-SDMRating
	void processRA(String line, String cusip) throws Exception {
		String ratingAgencyType = "";
		String rating = "";
		String ratingType = "";
		String ratingStatus = "";
		String ratingExtension = "";
		String underlyingRatingIndicator = "";
		String sqlRA = "";
		ratingAgencyType = line.substring(6, 10).trim();
		rating = line.substring(10, 16).trim();
		ratingType = line.substring(16, 18).trim();
		ratingStatus = line.substring(18, 21).trim();
		ratingExtension = line.substring(21, 24).trim();
		underlyingRatingIndicator = line.substring(24, 25).trim();
		sqlRA = "INSERT INTO  SDMRating (cusip,ratingAgencyType,rating,ratingType,ratingStatus,ratingExtension,underlyingRatingIndicator)VALUES('"
				+ cusip
				+ "','"
				+ ratingAgencyType
				+ "','"
				+ rating
				+ "','"
				+ ratingType
				+ "','"
				+ ratingStatus
				+ "','"
				+ ratingExtension
				+ "','" + underlyingRatingIndicator + "')";

		stat.addBatch(sqlRA);
	}

	// Credit Enhancement Record - Type 'CR'-SDMCreditEnhancement
	int processCR(String[] inputRecords, int recNum, String grpType,
			String recType, String line, String cusip) throws Exception {
		/*String grpLines[] = processMultipleGrp(inputRecords, recNum, grpType,
				recType, line);*/
		ArrayList grpLines=processMultipleGrp(inputRecords,recNum,grpType,recType,line);
		String creditEnhancementType = "";
		String creditEnhancerName = "";
		String insuranceTypeIndicator = "";
		String fullSecondaryMarketInsuranceIndicator = "";
		String creditEnhancerCity = "";
		String creditEnhancerStateCode = "";
		String insuranceCodeforLOC = "";
		String amtPctIndicator = "";
		String creditEnhancementExpirationDate = "";
		String creditEnhancementExpirationCode = "";
		String amtPct = "";
		Double amtPct_d = 0.0;
		Boolean isRecExist =false;
		String sqlCR = "";
		String grpFmtType = "";
		for (int i = 0; i < grpLines.size(); i++) {
			line = grpLines.get(i).toString();
			grpFmtType = line.substring(4, 6);
			if (grpFmtType.equals("01")) {
				// 01
				//if new record of same groupFormat then add it to batch.
				if (isRecExist.equals(true)){
					sqlCR = "INSERT INTO SDMCreditEnhancement(cusip,creditEnhancementType,creditEnhancerName,insuranceTypeIndicator,"
						+ "fullSecondaryMarketInsuranceIndicator,creditEnhancerCity,creditEnhancerStateCode,insuranceCodeforLOC,"
						+ "amtPctIndicator,creditEnhancementExpirationDate,creditEnhancementExpirationCode,amtPct) VALUES('"
						+ cusip
						+ "','"
						+ creditEnhancementType
						+ "','"
						+ creditEnhancerName
						+ "','"
						+ insuranceTypeIndicator
						+ "','"
						+ fullSecondaryMarketInsuranceIndicator
						+ "','"
						+ creditEnhancerCity
						+ "','"
						+ creditEnhancerStateCode
						+ "','"
						+ insuranceCodeforLOC
						+ "','"
						+ amtPctIndicator
						+ "','"
						+ creditEnhancementExpirationDate
						+ "','"
						+ creditEnhancementExpirationCode + "'," + amtPct_d + ")";
				stat.addBatch(sqlCR);
					
				}
				creditEnhancementType = line.substring(6, 10).trim();
				creditEnhancerName = line.substring(10, 70).trim().replace("'",
						"''");
				;
				insuranceTypeIndicator = line.substring(70, 72).trim();
				fullSecondaryMarketInsuranceIndicator = line.substring(72, 73)
						.trim();
				isRecExist=true;
			} else if (grpFmtType.equals("02")) {
				// 02
				creditEnhancerCity = line.substring(6, 36).trim().replace("'",
						"''");
				;
				creditEnhancerStateCode = line.substring(36, 38).trim();
				insuranceCodeforLOC = line.substring(38, 40).trim();
				amtPctIndicator = line.substring(49, 50).trim();
				creditEnhancementExpirationDate = line.substring(50, 60).trim();
				creditEnhancementExpirationCode = line.substring(60, 66).trim();
				amtPct = line.substring(66, 80).trim();

				amtPct_d = amtPct.trim().length() == 0 ? 0.00 : Double
						.parseDouble(amtPct);
			}
		}
		sqlCR = "INSERT INTO SDMCreditEnhancement(cusip,creditEnhancementType,creditEnhancerName,insuranceTypeIndicator,"
				+ "fullSecondaryMarketInsuranceIndicator,creditEnhancerCity,creditEnhancerStateCode,insuranceCodeforLOC,"
				+ "amtPctIndicator,creditEnhancementExpirationDate,creditEnhancementExpirationCode,amtPct) VALUES('"
				+ cusip
				+ "','"
				+ creditEnhancementType
				+ "','"
				+ creditEnhancerName
				+ "','"
				+ insuranceTypeIndicator
				+ "','"
				+ fullSecondaryMarketInsuranceIndicator
				+ "','"
				+ creditEnhancerCity
				+ "','"
				+ creditEnhancerStateCode
				+ "','"
				+ insuranceCodeforLOC
				+ "','"
				+ amtPctIndicator
				+ "','"
				+ creditEnhancementExpirationDate
				+ "','"
				+ creditEnhancementExpirationCode + "'," + amtPct_d + ")";
		stat.addBatch(sqlCR);
		return grpLines.size();
	}

	// Agent Record - Type 'AG' - SDMAgent
	int processAG(String[] inputRecords, int recNum, String grpType,
			String recType, String line, String cusip) throws Exception {
		ArrayList grpLines=processMultipleGrp(inputRecords,recNum,grpType,recType,line);
		String grpFmtType="";
		String agentType = "";
		String agentName = "";
		String aBAMICRRoutingNumber = "";
		String agentCity = "";
		String agentStateCode = "";
		String agentFormerName = "";
		Boolean isRecExist =false;
		String sqlAG = "";
		// 01
		for (int i = 0; i < grpLines.size(); i++) {
			line = grpLines.get(i).toString();
			grpFmtType = line.substring(4, 6);
			if (grpFmtType.equals("01")) {
				
				//if new record of same groupFormat then add it to batch.
				if (isRecExist.equals(true)){
					sqlAG = "INSERT INTO SDMAgent(cusip,agentType,agentName,aBAMICRRoutingNumber,agentCity,agentStateCode,agentFormerName)"
						+"VALUES('" + cusip+ "','"+agentType+"','"+agentName+"','"+aBAMICRRoutingNumber+"','"+agentCity+"','"+
								agentStateCode+"','"+agentFormerName + "')";
					stat.addBatch(sqlAG);
				}
				agentType = line.substring(6, 10).trim();
				agentName = line.substring(10, 70).trim().replace("'", "''");
				aBAMICRRoutingNumber = line.substring(70, 79).trim();
				isRecExist=true;
			} else if (grpFmtType.equals("02")) {
				// 02
				agentCity = line.substring(6, 36).trim().replace("'", "''");
				agentStateCode = line.substring(36, 38).trim();
			} else if (grpFmtType.equals("03")) {
				// 03
				agentFormerName = line.substring(6, 66).trim().replace("'","''");
			}
		}
		sqlAG = "INSERT INTO SDMAgent(cusip,agentType,agentName,aBAMICRRoutingNumber,agentCity,agentStateCode,agentFormerName)"
			+"VALUES('" + cusip+ "','"+agentType+"','"+agentName+"','"+aBAMICRRoutingNumber+"','"+agentCity+"','"+
					agentStateCode+"','"+agentFormerName + "')";
		stat.addBatch(sqlAG);
		return grpLines.size();

	}

	// Advisor Agent Record - Type 'AD' - SDMAdvisorAgent
	int processAD(String[] inputRecords, int recNum, String grpType,
			String recType, String line, String cusip) throws Exception {

		/*String grpLines[] = processMultipleGrp(inputRecords, recNum, grpType,
				recType, line);*/
		ArrayList grpLines=processMultipleGrp(inputRecords,recNum,grpType,recType,line);
		String advisorAgentType = "";
		String advisorAgentName = "";
		String advisorAgentCity = "";
		String advisorAgentStateCode = "";
		String grpFmtType="";
		String sqlAD = "";
		Boolean isRecExist =false;
		for (int i = 0; i < grpLines.size(); i++) {
			line = grpLines.get(i).toString();
			grpFmtType = line.substring(4, 6);
			// 01
			if (grpFmtType.equals("01")) {
				
				//if new record of same groupFormat then add it to batch.
				if (isRecExist.equals(true)){
					sqlAD = "INSERT INTO SDMAdvisorAgent(cusip,advisorAgentType,advisorAgentName,advisorAgentCity,advisorAgentStateCode) VALUES('"
						+ cusip
						+ "','"
						+ advisorAgentType
						+ "','"
						+ advisorAgentName
						+ "','"
						+advisorAgentCity
						+ "','"
						+advisorAgentStateCode
						+ "')";
					stat.addBatch(sqlAD);
				}
				advisorAgentType = line.substring(6, 10).trim();
				advisorAgentName = line.substring(10, 70).trim().replace("'","''");
				isRecExist=true;
			} else if (grpFmtType.equals("02")) {
				// 02
				advisorAgentCity = line.substring(6, 36).trim().replace("'","''");
				advisorAgentStateCode = line.substring(36, 38).trim();
			}
		}
		sqlAD = "INSERT INTO SDMAdvisorAgent(cusip,advisorAgentType,advisorAgentName,advisorAgentCity,advisorAgentStateCode) VALUES('"
			+ cusip
			+ "','"
			+ advisorAgentType
			+ "','"
			+ advisorAgentName
			+ "','"
			+advisorAgentCity
			+ "','"
			+advisorAgentStateCode
			+ "')";
		stat.addBatch(sqlAD);
		return grpLines.size();
	}

	// Notification Service Record - Type 'NO' - SDMNotificationService
	void processNO(String line, String cusip) throws Exception {

		String eventType = "";
		String eventDate = "";
		String eventPrice = "";
		String missedPaymentDistributionCode = "";
		String missedPaymentDistributionDate = "";
		String militaryTimeofTender = "";
		String timeZoneOfTenderCode = "";
		String callAmountTenderOfferAmount = "";
		String sqlNO = "";

		eventType = line.substring(6, 10).trim();
		eventDate = line.substring(10, 20).trim();
		eventPrice = line.substring(20, 29).trim();
		missedPaymentDistributionCode = line.substring(29, 30).trim();
		missedPaymentDistributionDate = line.substring(30, 40).trim();
		militaryTimeofTender = line.substring(40, 44).trim();
		timeZoneOfTenderCode = line.substring(44, 48).trim();
		callAmountTenderOfferAmount = line.substring(48, 61).trim();
		Double callAmountTenderOfferAmount_d;
		Double eventPrice_d;
		eventPrice_d = eventPrice.trim().length() == 0 ? 0.00 : Double
				.parseDouble(eventPrice);
		callAmountTenderOfferAmount_d = callAmountTenderOfferAmount.trim()
				.length() == 0 ? 0.00 : Double
				.parseDouble(callAmountTenderOfferAmount);

		sqlNO = "INSERT INTO  SDMNotificationService(cusip,eventType,eventDate,eventPrice,missedPaymentDistributionCode,missedPaymentDistributionDate,"
				+ "militaryTimeofTender,timeZoneOfTenderCode,callAmountTenderOfferAmount) VALUES ('"
				+ cusip
				+ "','"
				+ eventType
				+ "','"
				+ eventDate
				+ "',"
				+ eventPrice_d
				+ ",'"
				+ missedPaymentDistributionCode
				+ "','"
				+ missedPaymentDistributionDate
				+ "','"
				+ militaryTimeofTender
				+ "','"
				+ timeZoneOfTenderCode
				+ "',"
				+ callAmountTenderOfferAmount_d + ")";

		stat.addBatch(sqlNO);
	}

	//Related CUSIP Record - Type 'RE'  - SDMRelatedCUSIP
	void processRE(String line, String cusip) throws Exception {

		String relationshipType = "";
		String relatedCUSIPIssuerNumber = "";
		String relatedCUSIPIssueAlphaLetters = "";
		String issueCheckDigit = "";
		String sqlRE = "";

		relationshipType = line.substring(6, 10).trim();
		relatedCUSIPIssuerNumber = line.substring(10, 16).trim();
		relatedCUSIPIssueAlphaLetters = line.substring(16, 18).trim();
		issueCheckDigit = line.substring(18, 19).trim();

		sqlRE = "INSERT INTO  SDMRelatedCUSIP(cusip,relationshipType,relatedCUSIPIssuerNumber,relatedCUSIPIssueAlphaLetters,issueCheckDigit)"
				+ " VALUES ('"
				+ cusip
				+ "','"
				+ relationshipType
				+ "','"
				+ relatedCUSIPIssuerNumber
				+ "','"
				+ relatedCUSIPIssueAlphaLetters
				+ "','"
				+ issueCheckDigit
				+ "')";

		stat.addBatch(sqlRE);
	}

	//Repository Catalog Record - Type 'RC'- SDMRepositoryCatalog
	void processRC(String line, String cusip) throws Exception {

		String disclosureFilingType = "";
		String kennyAlertIDPrefix = "";
		String documentID = "";
		String onFileDate = "";
		String timeReceived = "";
		String timeReceivedExtension = "";

		String sqlRC = "";

		disclosureFilingType = line.substring(6, 10).trim();
		kennyAlertIDPrefix = line.substring(10, 11).trim();
		documentID = line.substring(11, 26).trim();
		onFileDate = line.substring(26, 36).trim();
		timeReceived = line.substring(36, 44).trim();
		timeReceivedExtension = line.substring(44, 46).trim();

		sqlRC = "INSERT INTO  SDMRepositoryCatalog(cusip,disclosureFilingType,kennyAlertIDPrefix,documentID,onFileDate,timeReceived,"
				+ "timeReceivedExtension) VALUES ('"
				+ cusip
				+ "','"
				+ disclosureFilingType
				+ "','"
				+ kennyAlertIDPrefix
				+ "','"
				+ documentID
				+ "','"
				+ onFileDate
				+ "','"
				+ timeReceived
				+ "','" + timeReceivedExtension + "')";

		stat.addBatch(sqlRC);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.headstrong.fusion.commons.component.FusionService#start()
	 */
	public void start() throws Exception {
		con = dataSource.getConnection();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	public void stop() throws Exception {
			if (con != null) {
			con.close();
		}
			

	}

	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport = serviceSupport;

	}
}
