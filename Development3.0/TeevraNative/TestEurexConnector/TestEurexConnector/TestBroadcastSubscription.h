#ifndef _TESTBROADCASTSUBSCRIPTION_H_
#define _TESTBROADCASTSUBSCRIPTION_H_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include "SubTrdConf.hxx"
#include "SubGivUpTakUp.hxx"

static futBscSubTrdConfSubjectT getfutSubTrdConfReq();
static optBscSubTrdConfSubjectT getoptSubTrdConfReq();
static futBscSubGivUpTakUpSubjectT getfutSubGivUpTakUpReq();
static optBscSubGivUpTakUpSubjectT getoptSubGivUpTakUpReq();
static futSubTrdConfPrivBcastT getfutSubTrdConfResp();
static optSubTrdConfPrivBcastT getoptSubTrdConfResp();
static futSubGivUpTakUpPrivBcastT getfutGivUpTakUpResp();
static optSubGivUpTakUpPrivBcastT getoptGivUpTakUpResp();

char* str;

/////////////////////////////////////////////////////////////////////////////////
// Subscription structures
/////////////////////////////////////////////////////////////////////////////////
char* compareTradeConfirmationSubscription(char prodLine, jbyte* MsgBodystr)
{
	//get test struct
	if(prodLine == 'F')
	{
		futBscSubTrdConfSubjectT rcvTrdConf = getfutSubTrdConfReq();
		//type cast input msg to sub trade confirmation
		futBscSubTrdConfSubjectT* tempStruct = (futBscSubTrdConfSubjectT*) MsgBodystr;
		if(memcmp(tempStruct, &rcvTrdConf, sizeof(rcvTrdConf)))
		{
			sprintf(str, "false"); /*memcmp(tempStruct2->cntrExpMthDat, &(rcvStruct2.cntrExpMthDat), CNTR_EXP_MTH_DAT_LEN),
						 memcmp(tempStruct2->cntrExpYrDat, &(rcvStruct2.cntrExpYrDat), CNTR_EXP_YR_DAT_LEN),
						 memcmp(tempStruct2->membId, &(rcvStruct2.membId), MEMB_ID_LEN),
						 memcmp(tempStruct2->prodId, &(rcvStruct2.prodId), PROD_ID_LEN),
						 memcmp(tempStruct2->subjFill, &(rcvStruct2.subjFill), SUBJ_FILL_LEN)");*/
		}
		else {
			sprintf(str, "true");
		}
	}
	else if(prodLine == 'O')
	{
		optBscSubTrdConfSubjectT rcvTrdConf = getoptSubTrdConfReq();
		//type cast input msg to sub trade confirmation
		optBscSubTrdConfSubjectT* tempStruct = (optBscSubTrdConfSubjectT*) MsgBodystr;
		if(memcmp(tempStruct, &rcvTrdConf, sizeof(rcvTrdConf)))
		{
			sprintf(str, "false");
		}
		else {
			sprintf(str, "true");
		}
	}
	else
	{
		sprintf(str, "Error in reading ProdLine");
	}

	return str;
}

char* compareGiveupTakeupSubscription(char prodLine, jbyte* MsgBodystr)
{
		//get test struct
	if(prodLine == 'F')
	{
		futBscSubGivUpTakUpSubjectT rcvTrdConf = getfutSubGivUpTakUpReq();
		//type cast input msg to sub trade confirmation
		futBscSubGivUpTakUpSubjectT* tempStruct = (futBscSubGivUpTakUpSubjectT*) MsgBodystr;
		if(memcmp(tempStruct, &rcvTrdConf, sizeof(rcvTrdConf)))
		{
			sprintf(str, "false");
		}
		else {
			sprintf(str, "true");
		}
	}
	else if(prodLine == 'O')
	{
		optBscSubGivUpTakUpSubjectTag rcvTrdConf = getoptSubGivUpTakUpReq();
		//type cast input msg to sub trade confirmation
		optBscSubGivUpTakUpSubjectTag* tempStruct = (optBscSubGivUpTakUpSubjectTag*) MsgBodystr;
		if(memcmp(tempStruct, &rcvTrdConf, sizeof(rcvTrdConf)))
		{
			sprintf(str, "false");
		}
		else {
			sprintf(str, "true");
		}
	}
	else
	{
		sprintf(str, "Error in reading ProdLine");
	}

	return str;
}

futBscSubTrdConfSubjectT getfutSubTrdConfReq()
{
	futBscSubTrdConfSubjectT rcvStruct;
	memcpy(rcvStruct.cntrExpMthDat, "10", CNTR_EXP_MTH_DAT_LEN);
	memcpy(rcvStruct.cntrExpYrDat, "2009", CNTR_EXP_YR_DAT_LEN);
	memcpy(rcvStruct.membId, "EM500", MEMB_ID_LEN);
	memcpy(rcvStruct.prodId, "FESX", PROD_ID_LEN);
	memcpy(rcvStruct.subjFill, "        ", SUBJ_FILL_LEN);
	return rcvStruct;
}

optBscSubTrdConfSubjectT getoptSubTrdConfReq()
{
	optBscSubTrdConfSubjectT rcvStruct;
	rcvStruct.cntrClasCod = 'P';
	memcpy(rcvStruct.cntrExpMthDat, "11", CNTR_EXP_MTH_DAT_LEN);
	memcpy(rcvStruct.cntrExpYrDat, "2009", CNTR_EXP_YR_DAT_LEN);
	memcpy(rcvStruct.membId, "EM501", MEMB_ID_LEN);
	memcpy(rcvStruct.prodId, "OESX", PROD_ID_LEN);
	memcpy(rcvStruct.cntrExerPrc, "063434", CNTR_EXER_PRC_LEN);
	rcvStruct.cntrVersNo = '0';
	return rcvStruct;
}

futBscSubGivUpTakUpSubjectT getfutSubGivUpTakUpReq()
{
	futBscSubGivUpTakUpSubjectT rcvStruct;
    rcvStruct.givUpTakUpInd = 'G';
	memcpy(rcvStruct.cntrExpMthDat, "10", CNTR_EXP_MTH_DAT_LEN);
	memcpy(rcvStruct.cntrExpYrDat, "2009", CNTR_EXP_YR_DAT_LEN);
	memcpy(rcvStruct.membId, "EM500", MEMB_ID_LEN);
	memcpy(rcvStruct.prodId, "FESX", PROD_ID_LEN);
	memcpy(rcvStruct.subjFill, "        ", SUBJ_FILL_LEN);
	return rcvStruct;
}

optBscSubGivUpTakUpSubjectT getoptSubGivUpTakUpReq()
{
	optBscSubGivUpTakUpSubjectT rcvStruct;
	rcvStruct.cntrClasCod = 'C';
	memcpy(rcvStruct.cntrExpMthDat, "11", CNTR_EXP_MTH_DAT_LEN);
	memcpy(rcvStruct.cntrExpYrDat, "2009", CNTR_EXP_YR_DAT_LEN);
	memcpy(rcvStruct.membId, "EM501", MEMB_ID_LEN);
	memcpy(rcvStruct.prodId, "OESX", PROD_ID_LEN);
	memcpy(rcvStruct.cntrExerPrc, "773435", CNTR_EXER_PRC_LEN);
	rcvStruct.cntrVersNo = '0';
	rcvStruct.givUpTakUpInd = 'T';
	return rcvStruct;
}

/////////////////////////////////////////////////////////////////////////////////
// Broadcast structures
/////////////////////////////////////////////////////////////////////////////////
jbyteArray getTradeConfirmationBrodcast(JNIEnv* env, char prodLine)
{
	jbyteArray jdataresp;

	if(prodLine == 'F')
	{
		futSubTrdConfPrivBcastT sendTrdConf = getfutSubTrdConfResp();
		
		jdataresp = env->NewByteArray(sizeof(futSubTrdConfPrivBcastT));
		env->SetByteArrayRegion(jdataresp, 0, sizeof(futSubTrdConfPrivBcastT), (jbyte*) &sendTrdConf);
	}
	else if(prodLine == 'O')
	{
		optSubTrdConfPrivBcastT sendTrdConf = getoptSubTrdConfResp();

		jdataresp = env->NewByteArray(sizeof(optSubTrdConfPrivBcastT));
		env->SetByteArrayRegion(jdataresp, 0, sizeof(optSubTrdConfPrivBcastT), (jbyte*) &sendTrdConf);
	}

	return jdataresp;
}


jbyteArray getGivUpTakUpBrodcast(JNIEnv* env, char prodLine)
{
	jbyteArray jdataresp;

	if(prodLine == 'F')
	{
		futSubGivUpTakUpPrivBcastT sendGivUpTakUp = getfutGivUpTakUpResp();
		
		jdataresp = env->NewByteArray(sizeof(futSubGivUpTakUpPrivBcastT));
		env->SetByteArrayRegion(jdataresp, 0, sizeof(futSubGivUpTakUpPrivBcastT), (jbyte*) &sendGivUpTakUp);
	}
	else if(prodLine == 'O')
	{
		optSubGivUpTakUpPrivBcastT sendGivUpTakUp = getoptGivUpTakUpResp();

		jdataresp = env->NewByteArray(sizeof(optSubGivUpTakUpPrivBcastT));
		env->SetByteArrayRegion(jdataresp, 0, sizeof(optSubGivUpTakUpPrivBcastT), (jbyte*) &sendGivUpTakUp);
	}

	return jdataresp;
}

futSubTrdConfPrivBcastT getfutSubTrdConfResp()
{
	futSubTrdConfPrivBcastT sendStruct;
	memcpy(sendStruct.seqNo.cntrSeqNo, "987654321", CNTR_SEQ_NO_LEN);
	memcpy(sendStruct.seqNo.prodSeqNo, "147852369", PROD_SEQ_NO_LEN);
	memcpy(sendStruct.seqNo.stmSeqNo, "369852147", DRIV_STM_SEQ_NO_LEN);

	memcpy(sendStruct.header.exchApplId, EXCH_APPL_ID_EUREX, EXCH_APPL_ID_LEN);
	memcpy(sendStruct.header.prodLine, PROD_LINE_FUTURE, PROD_LINE_LEN);
	memcpy(sendStruct.header.membExchIdCodOboMs, "ASDFG", MEMB_EXCH_ID_COD_OBO_MS_LEN);

	sendStruct.basic.agrsrMtchInd = 'Y';
	sendStruct.basic.buyCod = 'B';
	memcpy(sendStruct.basic.currTypCod, "SAD", CURR_TYP_COD_LEN);
	memcpy(sendStruct.basic.dateLstUpdDat, "20090922          ", DRIV_TIMESTAMP_LEN);
	memcpy(sendStruct.basic.dblLegTyp, "SUB", DBL_LEG_TYP_LEN);
	sendStruct.basic.dcmlShft = '3';
	sendStruct.basic.exerPrcDcml = '5';
	memcpy(sendStruct.basic.futCntrIdGrp.cntrExpMthDat, "10", CNTR_EXP_MTH_DAT_LEN);
	memcpy(sendStruct.basic.futCntrIdGrp.cntrExpYrDat, "2009", CNTR_EXP_YR_DAT_LEN);
	memcpy(sendStruct.basic.futCntrIdGrp.prodId, "FESX", PROD_ID_LEN);
	memcpy(sendStruct.basic.lngQty, "+000000001000", DRIV_VOLUME_LEN);
	memcpy(sendStruct.basic.membExchIdCod, "AB123", MEMB_EXCH_ID_COD_LEN);
	sendStruct.basic.opnClsCod = OPN_CLS_COD_OPEN;
	memcpy(sendStruct.basic.ordrDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.basic.ordrNo, "123456789", DRIV_ORDR_NO_LEN);
	memcpy(sendStruct.basic.ordrQty, "+000000050000", DRIV_VOLUME_LEN);
	sendStruct.basic.ordrResCod = 'T';
	sendStruct.basic.ordrTypCod = 'F';
	memcpy(sendStruct.basic.posTrnTyp, "021", POS_TRN_TYP_LEN);
	memcpy(sendStruct.basic.prodDispDcml, "10", PROD_DISP_DCML_LEN);
	memcpy(sendStruct.basic.shtQty, "+000000050000", DRIV_VOLUME_LEN);
	memcpy(sendStruct.basic.stratTyp, "JKFGHLO", STRAT_TYP_LEN);
	memcpy(sendStruct.basic.trdMtchPrc, "+0000000012345", DRIV_PRICE_LEN);
	memcpy(sendStruct.basic.trdrIdGrp.partNo, "MNO", PART_NO_LEN);
	memcpy(sendStruct.basic.trdrIdGrp.partSubGrpCod, "BVN", PART_SUB_GRP_COD_LEN);
	sendStruct.basic.trdTyp = 'M';
	memcpy(sendStruct.basic.trnDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.basic.trnIdNo, "654321", TRN_ID_NO_LEN);
	sendStruct.basic.trnIdSfxGrp.trnAdjStsCod = 'R';
	sendStruct.basic.trnIdSfxGrp.trnHistAdjInd = 'Y';
	memcpy(sendStruct.basic.trnIdSfxGrp.trnIdSfxNo, "56489", TRN_ID_SFX_NO_LEN);
	memcpy(sendStruct.basic.trnIdSfxGrp.trnIdSfxNoPnt, "12345", DRIV_TRN_ID_SFX_NO_PNT_LEN);
	memcpy(sendStruct.basic.trnTim, "12000000", DRIV_TIME_LEN);

	sendStruct.extension.acctTypCodGrp.acctTypCod = 'A';
	sendStruct.extension.acctTypCodGrp.acctTypNo = '1';
	memcpy(sendStruct.extension.bonIsinCod, "ABCDEFGH1234", BON_ISIN_COD_LEN);
	memcpy(sendStruct.extension.cpnFixRat, "125463", CPN_FIX_RAT_LEN);
	memcpy(sendStruct.extension.cshValDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.dsgnOpnLng, "+000000000001000", DRIV_QUANTITY_LEN);
	memcpy(sendStruct.extension.dsgnOpnSht, "+000000000001000", DRIV_QUANTITY_LEN);
	memcpy(sendStruct.extension.grsBas, "RTY123", GRS_BAS_LEN);
	memcpy(sendStruct.extension.gutGrp.gutCtpy, "12345", GUT_CTPY_LEN);
	memcpy(sendStruct.extension.gutGrp.gutRefCust, "DASFDA124665", GUT_REF_CUST_LEN);
	memcpy(sendStruct.extension.gutGrp.gutRefText, "Free referen", GUT_REF_TEXT_LEN);
	memcpy(sendStruct.extension.gutGrp.gutRefUserOrdrNum, "123456789012", GUT_REF_USER_ORDR_NUM_LEN);
	sendStruct.extension.gutGrp.gutSts = 'P';
	memcpy(sendStruct.extension.isinCod, "ABCDEFGH1234", ISIN_COD_LEN);
	memcpy(sendStruct.extension.membClgIdCod, "DSA12", MEMB_CLG_ID_COD_LEN);
	sendStruct.extension.ordrPrtFilCod = 'F';
	memcpy(sendStruct.extension.origTrnGrp.origExchIdCod, "1234", DRIV_EXCH_ID_COD_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origOrdrNo, "123456789012", ORIG_ORDR_NO_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origTrnDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origTrnDatCet, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origTrnIdNo, "123456789", ORIG_TRN_ID_NO_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origTrnTim, "12000000", DRIV_TIME_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origTrnTimCet, "12000000", DRIV_TIME_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origCntrId, "                              ", DRIV_ORIG_CNTR_ID_LEN);
	memcpy(sendStruct.extension.prmAmnt, "+000000012000", DRIV_PRM_AMNT_LEN);
	memcpy(sendStruct.extension.secuValDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.swapEndDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.trnFeeAmnt, "+000000000500000", DRIV_AMOUNT_LEN);
	memcpy(sendStruct.extension.txtGrp.cust, "TestCustomer", CUST_LEN);
	memcpy(sendStruct.extension.txtGrp.text, "FreeFormText", TEXT_LEN);
	memcpy(sendStruct.extension.txtGrp.userOrdrNum, "123456789012", USER_ORDR_NUM_LEN);
	memcpy(sendStruct.extension.undrIsinCod, "ABCDEFGH1234", UNDR_ISIN_COD_LEN);

	return sendStruct;
}

optSubTrdConfPrivBcastT getoptSubTrdConfResp()
{
	optSubTrdConfPrivBcastT sendStruct;
	memcpy(sendStruct.seqNo.cntrSeqNo, "987654321", CNTR_SEQ_NO_LEN);
	memcpy(sendStruct.seqNo.prodSeqNo, "147852369", PROD_SEQ_NO_LEN);
	memcpy(sendStruct.seqNo.stmSeqNo, "369852147", DRIV_STM_SEQ_NO_LEN);

	memcpy(sendStruct.header.exchApplId, EXCH_APPL_ID_EUREX, EXCH_APPL_ID_LEN);
	memcpy(sendStruct.header.prodLine, PROD_LINE_FUTURE, PROD_LINE_LEN);
	memcpy(sendStruct.header.membExchIdCodOboMs, "ASDFG", MEMB_EXCH_ID_COD_OBO_MS_LEN);

	sendStruct.basic.agrsrMtchInd = 'Y';
	sendStruct.basic.buyCod = 'B';
	memcpy(sendStruct.basic.currTypCod, "SAD", CURR_TYP_COD_LEN);
	memcpy(sendStruct.basic.dateLstUpdDat, "20090922          ", DRIV_TIMESTAMP_LEN);
	memcpy(sendStruct.basic.dblLegTyp, "SUB", DBL_LEG_TYP_LEN);
	sendStruct.basic.dcmlShft = '3';
	sendStruct.basic.exerPrcDcml = '5';
	memcpy(sendStruct.basic.optCntrIdGrp.cntrExpMthDat, "10", CNTR_EXP_MTH_DAT_LEN);
	memcpy(sendStruct.basic.optCntrIdGrp.cntrExpYrDat, "2009", CNTR_EXP_YR_DAT_LEN);
	memcpy(sendStruct.basic.optCntrIdGrp.prodId, "FESX", PROD_ID_LEN);
	sendStruct.basic.optCntrIdGrp.cntrClasCod = 'P';
    memcpy(sendStruct.basic.optCntrIdGrp.cntrExerPrc, "773435", CNTR_EXER_PRC_LEN);
    sendStruct.basic.optCntrIdGrp.cntrVersNo = '0';
	memcpy(sendStruct.basic.lngQty, "+000000001000", DRIV_VOLUME_LEN);
	memcpy(sendStruct.basic.membExchIdCod, "AB123", MEMB_EXCH_ID_COD_LEN);
	sendStruct.basic.opnClsCod = OPN_CLS_COD_OPEN;
	memcpy(sendStruct.basic.ordrDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.basic.ordrNo, "123456789", DRIV_ORDR_NO_LEN);
	memcpy(sendStruct.basic.ordrQty, "+000000050000", DRIV_VOLUME_LEN);
	sendStruct.basic.ordrResCod = 'T';
	sendStruct.basic.ordrTypCod = 'F';
	memcpy(sendStruct.basic.posTrnTyp, "021", POS_TRN_TYP_LEN);
	memcpy(sendStruct.basic.prodDispDcml, "10", PROD_DISP_DCML_LEN);
	memcpy(sendStruct.basic.shtQty, "+000000050000", DRIV_VOLUME_LEN);
	memcpy(sendStruct.basic.stratTyp, "JKFGHLO", STRAT_TYP_LEN);
	memcpy(sendStruct.basic.trdMtchPrc, "+0000000012345", DRIV_PRICE_LEN);
	memcpy(sendStruct.basic.trdrIdGrp.partNo, "MNO", PART_NO_LEN);
	memcpy(sendStruct.basic.trdrIdGrp.partSubGrpCod, "BVN", PART_SUB_GRP_COD_LEN);
	sendStruct.basic.trdTyp = 'M';
	memcpy(sendStruct.basic.trnDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.basic.trnIdNo, "654321", TRN_ID_NO_LEN);
	sendStruct.basic.trnIdSfxGrp.trnAdjStsCod = 'R';
	sendStruct.basic.trnIdSfxGrp.trnHistAdjInd = 'Y';
	memcpy(sendStruct.basic.trnIdSfxGrp.trnIdSfxNo, "56489", TRN_ID_SFX_NO_LEN);
	memcpy(sendStruct.basic.trnIdSfxGrp.trnIdSfxNoPnt, "12345", DRIV_TRN_ID_SFX_NO_PNT_LEN);
	memcpy(sendStruct.basic.trnTim, "12000000", DRIV_TIME_LEN);

	sendStruct.extension.acctTypCodGrp.acctTypCod = 'A';
	sendStruct.extension.acctTypCodGrp.acctTypNo = '1';
	memcpy(sendStruct.extension.bonIsinCod, "ABCDEFGH1234", BON_ISIN_COD_LEN);
	memcpy(sendStruct.extension.cshValDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.dsgnOpnLng, "+000000000001000", DRIV_QUANTITY_LEN);
	memcpy(sendStruct.extension.dsgnOpnSht, "+000000000001000", DRIV_QUANTITY_LEN);
	memcpy(sendStruct.extension.gutGrp.gutCtpy, "12345", GUT_CTPY_LEN);
	memcpy(sendStruct.extension.gutGrp.gutRefCust, "DASFDA124665", GUT_REF_CUST_LEN);
	memcpy(sendStruct.extension.gutGrp.gutRefText, "Free referen", GUT_REF_TEXT_LEN);
	memcpy(sendStruct.extension.gutGrp.gutRefUserOrdrNum, "123456789012", GUT_REF_USER_ORDR_NUM_LEN);
	sendStruct.extension.gutGrp.gutSts = 'P';
	memcpy(sendStruct.extension.isinCod, "ABCDEFGH1234", ISIN_COD_LEN);
	memcpy(sendStruct.extension.membClgIdCod, "DSA12", MEMB_CLG_ID_COD_LEN);
	sendStruct.extension.ordrPrtFilCod = 'F';
	memcpy(sendStruct.extension.origTrnGrp.origExchIdCod, "1234", DRIV_EXCH_ID_COD_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origOrdrNo, "123456789012", ORIG_ORDR_NO_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origTrnDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origTrnDatCet, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origTrnIdNo, "123456789", ORIG_TRN_ID_NO_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origTrnTim, "12000000", DRIV_TIME_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origTrnTimCet, "12000000", DRIV_TIME_LEN);
	memcpy(sendStruct.extension.origTrnGrp.origCntrId, "                              ", DRIV_ORIG_CNTR_ID_LEN);
	memcpy(sendStruct.extension.prmAmnt, "+000000012000", DRIV_PRM_AMNT_LEN);
	memcpy(sendStruct.extension.secuValDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.trnFeeAmnt, "+000000000500000", DRIV_AMOUNT_LEN);
	memcpy(sendStruct.extension.txtGrp.cust, "TestCustomer", CUST_LEN);
	memcpy(sendStruct.extension.txtGrp.text, "FreeFormText", TEXT_LEN);
	memcpy(sendStruct.extension.txtGrp.userOrdrNum, "123456789012", USER_ORDR_NUM_LEN);

	return sendStruct;
}

futSubGivUpTakUpPrivBcastT getfutGivUpTakUpResp()
{
	futSubGivUpTakUpPrivBcastT sendStruct;
	memcpy(sendStruct.header.exchApplId, EXCH_APPL_ID_EUREX, EXCH_APPL_ID_LEN);
	memcpy(sendStruct.header.prodLine, PROD_LINE_FUTURE, PROD_LINE_LEN);
	memcpy(sendStruct.header.membExchIdCodOboMs, "ASDFG", MEMB_EXCH_ID_COD_OBO_MS_LEN);

	sendStruct.basic.acctTypCodFromGrp.acctTypCodFrom = 'A';
	sendStruct.basic.acctTypCodFromGrp.acctTypNoFrom = '1';
	sendStruct.basic.acctTypCodToGrp.acctTypCodTo = 'A';
	sendStruct.basic.acctTypCodToGrp.acctTypNoTo = '2';
	sendStruct.basic.buyCod = 'S';
	memcpy(sendStruct.basic.dateLstUpdDat, "200909220000000000", DRIV_TIMESTAMP_LEN);
	sendStruct.basic.givUpTakUpInd = 'T';
	sendStruct.basic.gutSts = 'P';
	sendStruct.basic.gutStsTrnsCod = 'm';
	memcpy(sendStruct.basic.lngQty, "+000000001000", DRIV_VOLUME_LEN);
	memcpy(sendStruct.basic.membClgIdCodFrom, "10000", DRIV_MEMB_CLG_ID_COD_FROM_LEN);
	memcpy(sendStruct.basic.membClgIdCodTo, "90000", DRIV_MEMB_CLG_ID_COD_TO_LEN);
	memcpy(sendStruct.basic.membExchIdCodFrom, "11111", DRIV_MEMB_EXCH_ID_COD_FROM_LEN);
	memcpy(sendStruct.basic.membExchIdCodTo, "99999", DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	sendStruct.basic.opnClsCod = OPN_CLS_COD_OPEN;
	memcpy(sendStruct.basic.futCntrIdGrp.cntrExpMthDat, "11", CNTR_EXP_MTH_DAT_LEN);
	memcpy(sendStruct.basic.futCntrIdGrp.cntrExpYrDat, "2009", CNTR_EXP_YR_DAT_LEN);
	memcpy(sendStruct.basic.futCntrIdGrp.prodId, "OESX", PROD_ID_LEN);
	memcpy(sendStruct.basic.ordrNo, "123456789", DRIV_ORDR_NO_LEN);
	memcpy(sendStruct.basic.shtQty, "+000000050000", DRIV_VOLUME_LEN);
	memcpy(sendStruct.basic.trdMtchPrc, "+0000000012345", DRIV_PRICE_LEN);
	memcpy(sendStruct.basic.trnDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.basic.trnFeeAmnt, "+000000000500000", DRIV_AMOUNT_LEN);
	memcpy(sendStruct.basic.trnIdNo, "654321", TRN_ID_NO_LEN);
	sendStruct.basic.trnIdSfxGrp.trnAdjStsCod = 'R';
	sendStruct.basic.trnIdSfxGrp.trnHistAdjInd = 'N';
	memcpy(sendStruct.basic.trnIdSfxGrp.trnIdSfxNo, "12345", TRN_ID_SFX_NO_LEN);
	memcpy(sendStruct.basic.trnIdSfxGrp.trnIdSfxNoPnt, "12345", DRIV_TRN_ID_SFX_NO_PNT_LEN);
	
	memcpy(sendStruct.extension.ordrExePrc, "+0000000012345", DRIV_PRICE_LEN);
	memcpy(sendStruct.extension.ordrQty, "+000000050000", DRIV_VOLUME_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origExchIdCod, "1234", DRIV_EXCH_ID_COD_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origOrdrNo, "123456789012", ORIG_ORDR_NO_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origTrnDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origTrnDatCet, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origTrnIdNo, "123456789", ORIG_TRN_ID_NO_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origCntrId, "                              ", DRIV_ORIG_CNTR_ID_LEN);
	memcpy(sendStruct.extension.trdrIdGrp.partNo, "MNO", PART_NO_LEN);
	memcpy(sendStruct.extension.trdrIdGrp.partSubGrpCod, "BVN", PART_SUB_GRP_COD_LEN);
	sendStruct.extension.trdTyp = 'M';
	memcpy(sendStruct.extension.txtGrpFrom.custFrom, "FreeTextCust", DRIV_CUST_FROM_LEN);
	memcpy(sendStruct.extension.txtGrpFrom.textFrom, "FreeTextCust", DRIV_TEXT_FROM_LEN);
	memcpy(sendStruct.extension.txtGrpFrom.userOrdrNumFrom, "123456789012", DRIV_USER_ORDR_NUM_FROM_LEN);
	memcpy(sendStruct.extension.txtGrpTo.custTo, "FreeTextCust", DRIV_CUST_TO_LEN);
	memcpy(sendStruct.extension.txtGrpTo.textTo, "FreeTextCust", DRIV_TEXT_TO_LEN);
	memcpy(sendStruct.extension.txtGrpTo.userOrdrNumTo, "FreeTextCust", DRIV_USER_ORDR_NUM_TO_LEN);

	return sendStruct;
}

optSubGivUpTakUpPrivBcastT getoptGivUpTakUpResp()
{
	optSubGivUpTakUpPrivBcastT sendStruct;

	memcpy(sendStruct.header.exchApplId, EXCH_APPL_ID_EUREX, EXCH_APPL_ID_LEN);
	memcpy(sendStruct.header.prodLine, PROD_LINE_OPTION, PROD_LINE_LEN);
	memcpy(sendStruct.header.membExchIdCodOboMs, "ASDFG", MEMB_EXCH_ID_COD_OBO_MS_LEN);

	sendStruct.basic.acctTypCodFromGrp.acctTypCodFrom = 'A';
	sendStruct.basic.acctTypCodFromGrp.acctTypNoFrom = '1';
	sendStruct.basic.acctTypCodToGrp.acctTypCodTo = 'A';
	sendStruct.basic.acctTypCodToGrp.acctTypNoTo = '2';
	sendStruct.basic.buyCod = 'S';
	memcpy(sendStruct.basic.dateLstUpdDat, "200909220000000000", DRIV_TIMESTAMP_LEN);
	sendStruct.basic.givUpTakUpInd = 'T';
	sendStruct.basic.gutSts = 'P';
	sendStruct.basic.gutStsTrnsCod = 'm';
	memcpy(sendStruct.basic.lngQty, "+000000001000", DRIV_VOLUME_LEN);
	memcpy(sendStruct.basic.membClgIdCodFrom, "10000", DRIV_MEMB_CLG_ID_COD_FROM_LEN);
	memcpy(sendStruct.basic.membClgIdCodTo, "90000", DRIV_MEMB_CLG_ID_COD_TO_LEN);
	memcpy(sendStruct.basic.membExchIdCodFrom, "11111", DRIV_MEMB_EXCH_ID_COD_FROM_LEN);
	memcpy(sendStruct.basic.membExchIdCodTo, "99999", DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	sendStruct.basic.opnClsCod = OPN_CLS_COD_OPEN;
	sendStruct.basic.optCntrIdGrp.cntrClasCod = CNTR_CLAS_COD_CALL;
	memcpy(sendStruct.basic.optCntrIdGrp.cntrExerPrc, "773435", CNTR_EXER_PRC_LEN);
	memcpy(sendStruct.basic.optCntrIdGrp.cntrExpMthDat, "11", CNTR_EXP_MTH_DAT_LEN);
	memcpy(sendStruct.basic.optCntrIdGrp.cntrExpYrDat, "2009", CNTR_EXP_YR_DAT_LEN);
	sendStruct.basic.optCntrIdGrp.cntrVersNo = '0';
	memcpy(sendStruct.basic.optCntrIdGrp.prodId, "OESX", PROD_ID_LEN);
	memcpy(sendStruct.basic.ordrNo, "123456789", DRIV_ORDR_NO_LEN);
	memcpy(sendStruct.basic.shtQty, "+000000050000", DRIV_VOLUME_LEN);
	memcpy(sendStruct.basic.trdMtchPrc, "+0000000012345", DRIV_PRICE_LEN);
	memcpy(sendStruct.basic.trnDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.basic.trnFeeAmnt, "+000000000500000", DRIV_AMOUNT_LEN);
	memcpy(sendStruct.basic.trnIdNo, "654321", TRN_ID_NO_LEN);
	sendStruct.basic.trnIdSfxGrp.trnAdjStsCod = 'R';
	sendStruct.basic.trnIdSfxGrp.trnHistAdjInd = 'N';
	memcpy(sendStruct.basic.trnIdSfxGrp.trnIdSfxNo, "12345", TRN_ID_SFX_NO_LEN);
	memcpy(sendStruct.basic.trnIdSfxGrp.trnIdSfxNoPnt, "12345", DRIV_TRN_ID_SFX_NO_PNT_LEN);
	memcpy(sendStruct.basic.trnPrmAmnt, "+000000000500000", DRIV_AMOUNT_LEN);

	memcpy(sendStruct.extension.ordrExePrc, "+0000000012345", DRIV_PRICE_LEN);
	memcpy(sendStruct.extension.ordrQty, "+000000050000", DRIV_VOLUME_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origExchIdCod, "1234", DRIV_EXCH_ID_COD_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origOrdrNo, "123456789012", ORIG_ORDR_NO_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origTrnDat, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origTrnDatCet, "20090922", DRIV_DATE_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origTrnIdNo, "123456789", ORIG_TRN_ID_NO_LEN);
	memcpy(sendStruct.extension.origGuTuTrnGrp.origCntrId, "                              ", DRIV_ORIG_CNTR_ID_LEN);
	memcpy(sendStruct.extension.trdrIdGrp.partNo, "MNO", PART_NO_LEN);
	memcpy(sendStruct.extension.trdrIdGrp.partSubGrpCod, "BVN", PART_SUB_GRP_COD_LEN);
	sendStruct.extension.trdTyp = 'M';
	memcpy(sendStruct.extension.txtGrpFrom.custFrom, "FreeTextCust", DRIV_CUST_FROM_LEN);
	memcpy(sendStruct.extension.txtGrpFrom.textFrom, "FreeTextCust", DRIV_TEXT_FROM_LEN);
	memcpy(sendStruct.extension.txtGrpFrom.userOrdrNumFrom, "123456789012", DRIV_USER_ORDR_NUM_FROM_LEN);
	memcpy(sendStruct.extension.txtGrpTo.custTo, "FreeTextCust", DRIV_CUST_TO_LEN);
	memcpy(sendStruct.extension.txtGrpTo.textTo, "FreeTextCust", DRIV_TEXT_TO_LEN);
	memcpy(sendStruct.extension.txtGrpTo.userOrdrNumTo, "FreeTextCust", DRIV_USER_ORDR_NUM_TO_LEN);

	return sendStruct;
}

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif