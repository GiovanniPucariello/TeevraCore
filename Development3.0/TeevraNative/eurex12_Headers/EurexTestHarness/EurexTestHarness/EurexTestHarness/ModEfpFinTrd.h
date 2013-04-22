#include <ModEfpFinTrd.hxx>
#define BUFFER_SIZE 1000

futModEfpFinTrdRequestT *vfutModEfpFinTrdRequestT;
futModEfpFinTrdResponseT *vfutModEfpFinTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEfpFinTrdRequestT getFutBscModEfpFinTrdRequestT(char* testCaseNum , const char *root) {
	futBscModEfpFinTrdRequestT vfutBscModEfpFinTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.buyCod", lbuyCod);
	vfutBscModEfpFinTrdRequestT.buyCod = lbuyCod[0];

	vfutBscModEfpFinTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModEfpFinTrdRequestT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscModEfpFinTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscModEfpFinTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscModEfpFinTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscModEfpFinTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscModEfpFinTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.undrIsinCod", lundrIsinCod);
	memcpy(vfutBscModEfpFinTrdRequestT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.nomVal", lnomVal);
	memcpy(vfutBscModEfpFinTrdRequestT.nomVal, lnomVal, NOM_VAL_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vfutBscModEfpFinTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.futPrc", lfutPrc);
	memcpy(vfutBscModEfpFinTrdRequestT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscModEfpFinTrdRequestT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.setlDat", lsetlDat);
	memcpy(vfutBscModEfpFinTrdRequestT.setlDat, lsetlDat, DRIV_DATE_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.setlInst", lsetlInst);
	memcpy(vfutBscModEfpFinTrdRequestT.setlInst, lsetlInst, SETL_INST_LEN);

	vfutBscModEfpFinTrdRequestT.cshLegEfpFinGrp = getCshLegEfpFinGrpT(testCaseNum, "futBscModEfpFinTrdRequestT");
	for(i=0;i<CSH_PRC_EFP_FIN_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.cshPrcEfpFin[i]= ' ';
	}
	char lcshPrcEfpFin[CSH_PRC_EFP_FIN_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.cshPrcEfpFin", lcshPrcEfpFin);
	memcpy(vfutBscModEfpFinTrdRequestT.cshPrcEfpFin, lcshPrcEfpFin, CSH_PRC_EFP_FIN_LEN);

	vfutBscModEfpFinTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscModEfpFinTrdRequestT");
	vfutBscModEfpFinTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futBscModEfpFinTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscModEfpFinTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEfpFinTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEfpFinTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModEfpFinTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEfpFinTrdResponseT getFutBscModEfpFinTrdResponseT(char* testCaseNum , const char *root) {
	futBscModEfpFinTrdResponseT vfutBscModEfpFinTrdResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEfpFinTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEfpFinTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscModEfpFinTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("ModEfpFinTrd.futBscModEfpFinTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscModEfpFinTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);

	vfutBscModEfpFinTrdResponseT.cshLegEfpFinGrp = getCshLegEfpFinGrpT(testCaseNum, "futBscModEfpFinTrdResponseT");	return vfutBscModEfpFinTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEfpFinTrdRequestT* getFutModEfpFinTrdRequestT(char* testCaseNum) {
	vfutModEfpFinTrdRequestT = (futModEfpFinTrdRequestT*)malloc(sizeof(futModEfpFinTrdRequestT));
	int i;

	vfutModEfpFinTrdRequestT->header = getDataHeaderT(testCaseNum, "futModEfpFinTrdRequestT");
	vfutModEfpFinTrdRequestT->basic = getFutBscModEfpFinTrdRequestT(testCaseNum, "futModEfpFinTrdRequestT");
	return vfutModEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEfpFinTrdResponseT* getFutModEfpFinTrdResponseT(char* testCaseNum) {
	vfutModEfpFinTrdResponseT = (futModEfpFinTrdResponseT*)malloc(sizeof(futModEfpFinTrdResponseT));
	int i;

	vfutModEfpFinTrdResponseT->header = getDataHeaderT(testCaseNum, "futModEfpFinTrdResponseT");
	vfutModEfpFinTrdResponseT->basic = getFutBscModEfpFinTrdResponseT(testCaseNum, "futModEfpFinTrdResponseT");
	return vfutModEfpFinTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEfpFinTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEfpFinTrdRequestT));
	futModEfpFinTrdRequestT *vfutModEfpFinTrdRequestT = getFutModEfpFinTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEfpFinTrdRequestT), (jbyte*) vfutModEfpFinTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEfpFinTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEfpFinTrdResponseT));
	futModEfpFinTrdResponseT *vfutModEfpFinTrdResponseT = getFutModEfpFinTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEfpFinTrdResponseT), (jbyte*) vfutModEfpFinTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEfpFinTrdRequestT(futBscModEfpFinTrdRequestT actual, futBscModEfpFinTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfpFinGrpT (actual.cshLegEfpFinGrp,expected.cshLegEfpFinGrp, logMsg);
	if ( memcmp(actual.cshPrcEfpFin, expected.cshPrcEfpFin, CSH_PRC_EFP_FIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, cshPrcEfpFin not matching. Actual %s but Expected %s", actual.cshPrcEfpFin, expected.cshPrcEfpFin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEfpFinTrdResponseT(futBscModEfpFinTrdResponseT actual, futBscModEfpFinTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpFinTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfpFinGrpT (actual.cshLegEfpFinGrp,expected.cshLegEfpFinGrp, logMsg);
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEfpFinTrdRequestT(futModEfpFinTrdRequestT actual, futModEfpFinTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEfpFinTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEfpFinTrdResponseT(futModEfpFinTrdResponseT actual, futModEfpFinTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEfpFinTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEfpFinTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEfpFinTrdRequestT *actualData = (futModEfpFinTrdRequestT *)msgStruct;
	futModEfpFinTrdRequestT* expectedData = getFutModEfpFinTrdRequestT(testCaseNum);
	compareFutModEfpFinTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEfpFinTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEfpFinTrdResponseT *actualData = (futModEfpFinTrdResponseT *)msgStruct;
	futModEfpFinTrdResponseT* expectedData = getFutModEfpFinTrdResponseT(testCaseNum);
	compareFutModEfpFinTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
