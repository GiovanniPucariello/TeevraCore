#include <ModEfpIdxTrd.hxx>
#define BUFFER_SIZE 1000

futModEfpIdxTrdRequestT *vfutModEfpIdxTrdRequestT;
futModEfpIdxTrdResponseT *vfutModEfpIdxTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEfpIdxTrdRequestT getFutBscModEfpIdxTrdRequestT(char* testCaseNum , const char *root) {
	futBscModEfpIdxTrdRequestT vfutBscModEfpIdxTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.buyCod", lbuyCod);
	vfutBscModEfpIdxTrdRequestT.buyCod = lbuyCod[0];

	vfutBscModEfpIdxTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModEfpIdxTrdRequestT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscModEfpIdxTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscModEfpIdxTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscModEfpIdxTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscModEfpIdxTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscModEfpIdxTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscModEfpIdxTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscModEfpIdxTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vfutBscModEfpIdxTrdRequestT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.nomVal", lnomVal);
	memcpy(vfutBscModEfpIdxTrdRequestT.nomVal, lnomVal, NOM_VAL_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModEfpIdxTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vfutBscModEfpIdxTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModEfpIdxTrdRequestT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.futPrc", lfutPrc);
	memcpy(vfutBscModEfpIdxTrdRequestT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscModEfpIdxTrdRequestT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscModEfpIdxTrdRequestT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscModEfpIdxTrdRequestT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.setlInst", lsetlInst);
	memcpy(vfutBscModEfpIdxTrdRequestT.setlInst, lsetlInst, SETL_INST_LEN);

	for(i=0;i<CSH_BSKT_REF_ID_LEN;i++) {
		vfutBscModEfpIdxTrdRequestT.cshBsktRefId[i]= ' ';
	}
	char lcshBsktRefId[CSH_BSKT_REF_ID_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.cshBsktRefId", lcshBsktRefId);
	memcpy(vfutBscModEfpIdxTrdRequestT.cshBsktRefId, lcshBsktRefId, CSH_BSKT_REF_ID_LEN);

	vfutBscModEfpIdxTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscModEfpIdxTrdRequestT");
	vfutBscModEfpIdxTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futBscModEfpIdxTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscModEfpIdxTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscModEfpIdxTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEfpIdxTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEfpIdxTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModEfpIdxTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEfpIdxTrdResponseT getFutBscModEfpIdxTrdResponseT(char* testCaseNum , const char *root) {
	futBscModEfpIdxTrdResponseT vfutBscModEfpIdxTrdResponseT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscModEfpIdxTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscModEfpIdxTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEfpIdxTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEfpIdxTrd.futBscModEfpIdxTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEfpIdxTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModEfpIdxTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEfpIdxTrdRequestT* getFutModEfpIdxTrdRequestT(char* testCaseNum) {
	vfutModEfpIdxTrdRequestT = (futModEfpIdxTrdRequestT*)malloc(sizeof(futModEfpIdxTrdRequestT));
	int i;

	vfutModEfpIdxTrdRequestT->header = getDataHeaderT(testCaseNum, "futModEfpIdxTrdRequestT");
	vfutModEfpIdxTrdRequestT->basic = getFutBscModEfpIdxTrdRequestT(testCaseNum, "futModEfpIdxTrdRequestT");
	return vfutModEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEfpIdxTrdResponseT* getFutModEfpIdxTrdResponseT(char* testCaseNum) {
	vfutModEfpIdxTrdResponseT = (futModEfpIdxTrdResponseT*)malloc(sizeof(futModEfpIdxTrdResponseT));
	int i;

	vfutModEfpIdxTrdResponseT->header = getDataHeaderT(testCaseNum, "futModEfpIdxTrdResponseT");
	vfutModEfpIdxTrdResponseT->basic = getFutBscModEfpIdxTrdResponseT(testCaseNum, "futModEfpIdxTrdResponseT");
	return vfutModEfpIdxTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEfpIdxTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEfpIdxTrdRequestT));
	futModEfpIdxTrdRequestT *vfutModEfpIdxTrdRequestT = getFutModEfpIdxTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEfpIdxTrdRequestT), (jbyte*) vfutModEfpIdxTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEfpIdxTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEfpIdxTrdResponseT));
	futModEfpIdxTrdResponseT *vfutModEfpIdxTrdResponseT = getFutModEfpIdxTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEfpIdxTrdResponseT), (jbyte*) vfutModEfpIdxTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEfpIdxTrdRequestT(futBscModEfpIdxTrdRequestT actual, futBscModEfpIdxTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshBsktRefId, expected.cshBsktRefId, CSH_BSKT_REF_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, cshBsktRefId not matching. Actual %s but Expected %s", actual.cshBsktRefId, expected.cshBsktRefId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEfpIdxTrdResponseT(futBscModEfpIdxTrdResponseT actual, futBscModEfpIdxTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpIdxTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEfpIdxTrdRequestT(futModEfpIdxTrdRequestT actual, futModEfpIdxTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEfpIdxTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEfpIdxTrdResponseT(futModEfpIdxTrdResponseT actual, futModEfpIdxTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEfpIdxTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEfpIdxTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEfpIdxTrdRequestT *actualData = (futModEfpIdxTrdRequestT *)msgStruct;
	futModEfpIdxTrdRequestT* expectedData = getFutModEfpIdxTrdRequestT(testCaseNum);
	compareFutModEfpIdxTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEfpIdxTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEfpIdxTrdResponseT *actualData = (futModEfpIdxTrdResponseT *)msgStruct;
	futModEfpIdxTrdResponseT* expectedData = getFutModEfpIdxTrdResponseT(testCaseNum);
	compareFutModEfpIdxTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
