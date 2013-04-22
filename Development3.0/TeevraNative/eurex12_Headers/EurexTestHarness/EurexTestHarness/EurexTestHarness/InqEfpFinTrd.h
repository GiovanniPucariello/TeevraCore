#include <InqEfpFinTrd.hxx>
#define BUFFER_SIZE 1000

futInqEfpFinTrdRequestT *vfutInqEfpFinTrdRequestT;
futInqEfpFinTrdResponseT *vfutInqEfpFinTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfpFinTrdRequestT getFutBscInqEfpFinTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqEfpFinTrdRequestT vfutBscInqEfpFinTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqEfpFinTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqEfpFinTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscInqEfpFinTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqEfpFinTrdRequestT");	return vfutBscInqEfpFinTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfpFinTrdRecT getFutBscInqEfpFinTrdRecT(char* testCaseNum , const char *root) {
	futBscInqEfpFinTrdRecT vfutBscInqEfpFinTrdRecT;
	int i;

	char lopnClsCod[1] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdRecT.opnClsCod", lopnClsCod);
	vfutBscInqEfpFinTrdRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscInqEfpFinTrdRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscInqEfpFinTrdRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscInqEfpFinTrdRecT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdRecT.setlInst", lsetlInst);
	memcpy(vfutBscInqEfpFinTrdRecT.setlInst, lsetlInst, SETL_INST_LEN);

	vfutBscInqEfpFinTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqEfpFinTrdRecT");
	vfutBscInqEfpFinTrdRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqEfpFinTrdRecT");
	vfutBscInqEfpFinTrdRecT.txtGrp = getTxtGrpT(testCaseNum, "futBscInqEfpFinTrdRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscInqEfpFinTrdRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscInqEfpFinTrdRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lwhsTrdStsCod[1] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdRecT.whsTrdStsCod", lwhsTrdStsCod);
	vfutBscInqEfpFinTrdRecT.whsTrdStsCod = lwhsTrdStsCod[0];
	return vfutBscInqEfpFinTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfpFinTrdResponseT getFutBscInqEfpFinTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqEfpFinTrdResponseT vfutBscInqEfpFinTrdResponseT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.buyCod", lbuyCod);
	vfutBscInqEfpFinTrdResponseT.buyCod = lbuyCod[0];

	vfutBscInqEfpFinTrdResponseT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqEfpFinTrdResponseT");
	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscInqEfpFinTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.undrIsinCod", lundrIsinCod);
	memcpy(vfutBscInqEfpFinTrdResponseT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.nomVal", lnomVal);
	memcpy(vfutBscInqEfpFinTrdResponseT.nomVal, lnomVal, NOM_VAL_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.trdXQty", ltrdXQty);
	memcpy(vfutBscInqEfpFinTrdResponseT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.futPrc", lfutPrc);
	memcpy(vfutBscInqEfpFinTrdResponseT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscInqEfpFinTrdResponseT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.setlDat", lsetlDat);
	memcpy(vfutBscInqEfpFinTrdResponseT.setlDat, lsetlDat, DRIV_DATE_LEN);

	vfutBscInqEfpFinTrdResponseT.cshLegEfpFinGrp = getCshLegEfpFinGrpT(testCaseNum, "futBscInqEfpFinTrdResponseT");
	for(i=0;i<CSH_PRC_EFP_FIN_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.cshPrcEfpFin[i]= ' ';
	}
	char lcshPrcEfpFin[CSH_PRC_EFP_FIN_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.cshPrcEfpFin", lcshPrcEfpFin);
	memcpy(vfutBscInqEfpFinTrdResponseT.cshPrcEfpFin, lcshPrcEfpFin, CSH_PRC_EFP_FIN_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscInqEfpFinTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);

	for(i=0;i<UNDR_CURR_COD_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.undrCurrCod[i]= ' ';
	}
	char lundrCurrCod[UNDR_CURR_COD_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.undrCurrCod", lundrCurrCod);
	memcpy(vfutBscInqEfpFinTrdResponseT.undrCurrCod, lundrCurrCod, UNDR_CURR_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqEfpFinTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqEfpFinTrd.futBscInqEfpFinTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqEfpFinTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqEfpFinTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEfpFinTrdRequestT* getFutInqEfpFinTrdRequestT(char* testCaseNum) {
	vfutInqEfpFinTrdRequestT = (futInqEfpFinTrdRequestT*)malloc(sizeof(futInqEfpFinTrdRequestT));
	int i;

	vfutInqEfpFinTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqEfpFinTrdRequestT");
	vfutInqEfpFinTrdRequestT->basic = getFutBscInqEfpFinTrdRequestT(testCaseNum, "futInqEfpFinTrdRequestT");
	return vfutInqEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEfpFinTrdResponseT* getFutInqEfpFinTrdResponseT(char* testCaseNum) {
	vfutInqEfpFinTrdResponseT = (futInqEfpFinTrdResponseT*)malloc(sizeof(futInqEfpFinTrdResponseT));
	int i;

	vfutInqEfpFinTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqEfpFinTrdResponseT");
	vfutInqEfpFinTrdResponseT->basic = getFutBscInqEfpFinTrdResponseT(testCaseNum, "futInqEfpFinTrdResponseT");
	return vfutInqEfpFinTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEfpFinTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEfpFinTrdRequestT));
	futInqEfpFinTrdRequestT *vfutInqEfpFinTrdRequestT = getFutInqEfpFinTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEfpFinTrdRequestT), (jbyte*) vfutInqEfpFinTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEfpFinTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEfpFinTrdResponseT));
	futInqEfpFinTrdResponseT *vfutInqEfpFinTrdResponseT = getFutInqEfpFinTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEfpFinTrdResponseT), (jbyte*) vfutInqEfpFinTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfpFinTrdRequestT(futBscInqEfpFinTrdRequestT actual, futBscInqEfpFinTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfpFinTrdRecT(futBscInqEfpFinTrdRecT actual, futBscInqEfpFinTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdRecT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.whsTrdStsCod!= expected.whsTrdStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdRecT, whsTrdStsCodnot matching. Actual %d but Expected %d", actual.whsTrdStsCod, expected.whsTrdStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfpFinTrdResponseT(futBscInqEfpFinTrdResponseT actual, futBscInqEfpFinTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfpFinGrpT (actual.cshLegEfpFinGrp,expected.cshLegEfpFinGrp, logMsg);
	if ( memcmp(actual.cshPrcEfpFin, expected.cshPrcEfpFin, CSH_PRC_EFP_FIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, cshPrcEfpFin not matching. Actual %s but Expected %s", actual.cshPrcEfpFin, expected.cshPrcEfpFin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrCurrCod, expected.undrCurrCod, UNDR_CURR_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, undrCurrCod not matching. Actual %s but Expected %s", actual.undrCurrCod, expected.undrCurrCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_EFP_FIN_TRD_REC_MAX;i++) {
		compareFutBscInqEfpFinTrdRecT (actual.futBscInqEfpFinTrdRec[i],expected.futBscInqEfpFinTrdRec[i], logMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpFinTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEfpFinTrdRequestT(futInqEfpFinTrdRequestT actual, futInqEfpFinTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEfpFinTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEfpFinTrdResponseT(futInqEfpFinTrdResponseT actual, futInqEfpFinTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEfpFinTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEfpFinTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEfpFinTrdRequestT *actualData = (futInqEfpFinTrdRequestT *)msgStruct;
	futInqEfpFinTrdRequestT* expectedData = getFutInqEfpFinTrdRequestT(testCaseNum);
	compareFutInqEfpFinTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEfpFinTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEfpFinTrdResponseT *actualData = (futInqEfpFinTrdResponseT *)msgStruct;
	futInqEfpFinTrdResponseT* expectedData = getFutInqEfpFinTrdResponseT(testCaseNum);
	compareFutInqEfpFinTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
