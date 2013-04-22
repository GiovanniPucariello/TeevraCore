#include <EntEfpIdxTrd.hxx>
#define BUFFER_SIZE 1000

futEntEfpIdxTrdRequestT *vfutEntEfpIdxTrdRequestT;
futEntEfpIdxTrdResponseT *vfutEntEfpIdxTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEfpIdxTrdRequestT getFutBscEntEfpIdxTrdRequestT(char* testCaseNum , const char *root) {
	futBscEntEfpIdxTrdRequestT vfutBscEntEfpIdxTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdRequestT.buyCod", lbuyCod);
	vfutBscEntEfpIdxTrdRequestT.buyCod = lbuyCod[0];

	vfutBscEntEfpIdxTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntEfpIdxTrdRequestT");
	vfutBscEntEfpIdxTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntEfpIdxTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscEntEfpIdxTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscEntEfpIdxTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscEntEfpIdxTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vfutBscEntEfpIdxTrdRequestT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdRequestT.nomVal", lnomVal);
	memcpy(vfutBscEntEfpIdxTrdRequestT.nomVal, lnomVal, NOM_VAL_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntEfpIdxTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vfutBscEntEfpIdxTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntEfpIdxTrdRequestT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdRequestT.futPrc", lfutPrc);
	memcpy(vfutBscEntEfpIdxTrdRequestT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscEntEfpIdxTrdRequestT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdRequestT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscEntEfpIdxTrdRequestT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscEntEfpIdxTrdRequestT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdRequestT.setlInst", lsetlInst);
	memcpy(vfutBscEntEfpIdxTrdRequestT.setlInst, lsetlInst, SETL_INST_LEN);

	for(i=0;i<CSH_BSKT_REF_ID_LEN;i++) {
		vfutBscEntEfpIdxTrdRequestT.cshBsktRefId[i]= ' ';
	}
	char lcshBsktRefId[CSH_BSKT_REF_ID_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdRequestT.cshBsktRefId", lcshBsktRefId);
	memcpy(vfutBscEntEfpIdxTrdRequestT.cshBsktRefId, lcshBsktRefId, CSH_BSKT_REF_ID_LEN);

	vfutBscEntEfpIdxTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscEntEfpIdxTrdRequestT");
	vfutBscEntEfpIdxTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futBscEntEfpIdxTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscEntEfpIdxTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscEntEfpIdxTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutBscEntEfpIdxTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEfpIdxTrdResponseT getFutBscEntEfpIdxTrdResponseT(char* testCaseNum , const char *root) {
	futBscEntEfpIdxTrdResponseT vfutBscEntEfpIdxTrdResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntEfpIdxTrdResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntEfpIdxTrdResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscEntEfpIdxTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscEntEfpIdxTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntEfpIdxTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntEfpIdxTrd.futBscEntEfpIdxTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntEfpIdxTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntEfpIdxTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEfpIdxTrdRequestT* getFutEntEfpIdxTrdRequestT(char* testCaseNum) {
	vfutEntEfpIdxTrdRequestT = (futEntEfpIdxTrdRequestT*)malloc(sizeof(futEntEfpIdxTrdRequestT));
	int i;

	vfutEntEfpIdxTrdRequestT->header = getDataHeaderT(testCaseNum, "futEntEfpIdxTrdRequestT");
	vfutEntEfpIdxTrdRequestT->basic = getFutBscEntEfpIdxTrdRequestT(testCaseNum, "futEntEfpIdxTrdRequestT");
	return vfutEntEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEfpIdxTrdResponseT* getFutEntEfpIdxTrdResponseT(char* testCaseNum) {
	vfutEntEfpIdxTrdResponseT = (futEntEfpIdxTrdResponseT*)malloc(sizeof(futEntEfpIdxTrdResponseT));
	int i;

	vfutEntEfpIdxTrdResponseT->header = getDataHeaderT(testCaseNum, "futEntEfpIdxTrdResponseT");
	vfutEntEfpIdxTrdResponseT->basic = getFutBscEntEfpIdxTrdResponseT(testCaseNum, "futEntEfpIdxTrdResponseT");
	return vfutEntEfpIdxTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEfpIdxTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEfpIdxTrdRequestT));
	futEntEfpIdxTrdRequestT *vfutEntEfpIdxTrdRequestT = getFutEntEfpIdxTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEfpIdxTrdRequestT), (jbyte*) vfutEntEfpIdxTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEfpIdxTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEfpIdxTrdResponseT));
	futEntEfpIdxTrdResponseT *vfutEntEfpIdxTrdResponseT = getFutEntEfpIdxTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEfpIdxTrdResponseT), (jbyte*) vfutEntEfpIdxTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEfpIdxTrdRequestT(futBscEntEfpIdxTrdRequestT actual, futBscEntEfpIdxTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdRequestT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdRequestT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdRequestT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdRequestT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshBsktRefId, expected.cshBsktRefId, CSH_BSKT_REF_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdRequestT, cshBsktRefId not matching. Actual %s but Expected %s", actual.cshBsktRefId, expected.cshBsktRefId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEfpIdxTrdResponseT(futBscEntEfpIdxTrdResponseT actual, futBscEntEfpIdxTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpIdxTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEfpIdxTrdRequestT(futEntEfpIdxTrdRequestT actual, futEntEfpIdxTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEfpIdxTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEfpIdxTrdResponseT(futEntEfpIdxTrdResponseT actual, futEntEfpIdxTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEfpIdxTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEfpIdxTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEfpIdxTrdRequestT *actualData = (futEntEfpIdxTrdRequestT *)msgStruct;
	futEntEfpIdxTrdRequestT* expectedData = getFutEntEfpIdxTrdRequestT(testCaseNum);
	compareFutEntEfpIdxTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEfpIdxTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEfpIdxTrdResponseT *actualData = (futEntEfpIdxTrdResponseT *)msgStruct;
	futEntEfpIdxTrdResponseT* expectedData = getFutEntEfpIdxTrdResponseT(testCaseNum);
	compareFutEntEfpIdxTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
