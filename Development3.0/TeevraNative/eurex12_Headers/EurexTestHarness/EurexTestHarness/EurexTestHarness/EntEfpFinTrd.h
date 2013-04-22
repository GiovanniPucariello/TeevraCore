#include <EntEfpFinTrd.hxx>
#define BUFFER_SIZE 1000

futEntEfpFinTrdRequestT *vfutEntEfpFinTrdRequestT;
futEntEfpFinTrdResponseT *vfutEntEfpFinTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEfpFinTrdRequestT getFutBscEntEfpFinTrdRequestT(char* testCaseNum , const char *root) {
	futBscEntEfpFinTrdRequestT vfutBscEntEfpFinTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.buyCod", lbuyCod);
	vfutBscEntEfpFinTrdRequestT.buyCod = lbuyCod[0];

	vfutBscEntEfpFinTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntEfpFinTrdRequestT");
	vfutBscEntEfpFinTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntEfpFinTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscEntEfpFinTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscEntEfpFinTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscEntEfpFinTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vfutBscEntEfpFinTrdRequestT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.undrIsinCod", lundrIsinCod);
	memcpy(vfutBscEntEfpFinTrdRequestT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vfutBscEntEfpFinTrdRequestT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.nomVal", lnomVal);
	memcpy(vfutBscEntEfpFinTrdRequestT.nomVal, lnomVal, NOM_VAL_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntEfpFinTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vfutBscEntEfpFinTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntEfpFinTrdRequestT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.futPrc", lfutPrc);
	memcpy(vfutBscEntEfpFinTrdRequestT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscEntEfpFinTrdRequestT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscEntEfpFinTrdRequestT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntEfpFinTrdRequestT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.setlDat", lsetlDat);
	memcpy(vfutBscEntEfpFinTrdRequestT.setlDat, lsetlDat, DRIV_DATE_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscEntEfpFinTrdRequestT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.setlInst", lsetlInst);
	memcpy(vfutBscEntEfpFinTrdRequestT.setlInst, lsetlInst, SETL_INST_LEN);

	vfutBscEntEfpFinTrdRequestT.cshLegEfpFinGrp = getCshLegEfpFinGrpT(testCaseNum, "futBscEntEfpFinTrdRequestT");
	for(i=0;i<CSH_PRC_EFP_FIN_LEN;i++) {
		vfutBscEntEfpFinTrdRequestT.cshPrcEfpFin[i]= ' ';
	}
	char lcshPrcEfpFin[CSH_PRC_EFP_FIN_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.cshPrcEfpFin", lcshPrcEfpFin);
	memcpy(vfutBscEntEfpFinTrdRequestT.cshPrcEfpFin, lcshPrcEfpFin, CSH_PRC_EFP_FIN_LEN);

	vfutBscEntEfpFinTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscEntEfpFinTrdRequestT");
	vfutBscEntEfpFinTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futBscEntEfpFinTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscEntEfpFinTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscEntEfpFinTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutBscEntEfpFinTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEfpFinTrdResponseT getFutBscEntEfpFinTrdResponseT(char* testCaseNum , const char *root) {
	futBscEntEfpFinTrdResponseT vfutBscEntEfpFinTrdResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntEfpFinTrdResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntEfpFinTrdResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntEfpFinTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntEfpFinTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscEntEfpFinTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("EntEfpFinTrd.futBscEntEfpFinTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscEntEfpFinTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);

	vfutBscEntEfpFinTrdResponseT.cshLegEfpFinGrp = getCshLegEfpFinGrpT(testCaseNum, "futBscEntEfpFinTrdResponseT");	return vfutBscEntEfpFinTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEfpFinTrdRequestT* getFutEntEfpFinTrdRequestT(char* testCaseNum) {
	vfutEntEfpFinTrdRequestT = (futEntEfpFinTrdRequestT*)malloc(sizeof(futEntEfpFinTrdRequestT));
	int i;

	vfutEntEfpFinTrdRequestT->header = getDataHeaderT(testCaseNum, "futEntEfpFinTrdRequestT");
	vfutEntEfpFinTrdRequestT->basic = getFutBscEntEfpFinTrdRequestT(testCaseNum, "futEntEfpFinTrdRequestT");
	return vfutEntEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEfpFinTrdResponseT* getFutEntEfpFinTrdResponseT(char* testCaseNum) {
	vfutEntEfpFinTrdResponseT = (futEntEfpFinTrdResponseT*)malloc(sizeof(futEntEfpFinTrdResponseT));
	int i;

	vfutEntEfpFinTrdResponseT->header = getDataHeaderT(testCaseNum, "futEntEfpFinTrdResponseT");
	vfutEntEfpFinTrdResponseT->basic = getFutBscEntEfpFinTrdResponseT(testCaseNum, "futEntEfpFinTrdResponseT");
	return vfutEntEfpFinTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEfpFinTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEfpFinTrdRequestT));
	futEntEfpFinTrdRequestT *vfutEntEfpFinTrdRequestT = getFutEntEfpFinTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEfpFinTrdRequestT), (jbyte*) vfutEntEfpFinTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEfpFinTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEfpFinTrdResponseT));
	futEntEfpFinTrdResponseT *vfutEntEfpFinTrdResponseT = getFutEntEfpFinTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEfpFinTrdResponseT), (jbyte*) vfutEntEfpFinTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEfpFinTrdRequestT(futBscEntEfpFinTrdRequestT actual, futBscEntEfpFinTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfpFinGrpT (actual.cshLegEfpFinGrp,expected.cshLegEfpFinGrp, logMsg);
	if ( memcmp(actual.cshPrcEfpFin, expected.cshPrcEfpFin, CSH_PRC_EFP_FIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, cshPrcEfpFin not matching. Actual %s but Expected %s", actual.cshPrcEfpFin, expected.cshPrcEfpFin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEfpFinTrdResponseT(futBscEntEfpFinTrdResponseT actual, futBscEntEfpFinTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpFinTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfpFinGrpT (actual.cshLegEfpFinGrp,expected.cshLegEfpFinGrp, logMsg);
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEfpFinTrdRequestT(futEntEfpFinTrdRequestT actual, futEntEfpFinTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEfpFinTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEfpFinTrdResponseT(futEntEfpFinTrdResponseT actual, futEntEfpFinTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEfpFinTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEfpFinTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEfpFinTrdRequestT *actualData = (futEntEfpFinTrdRequestT *)msgStruct;
	futEntEfpFinTrdRequestT* expectedData = getFutEntEfpFinTrdRequestT(testCaseNum);
	compareFutEntEfpFinTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEfpFinTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEfpFinTrdResponseT *actualData = (futEntEfpFinTrdResponseT *)msgStruct;
	futEntEfpFinTrdResponseT* expectedData = getFutEntEfpFinTrdResponseT(testCaseNum);
	compareFutEntEfpFinTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
