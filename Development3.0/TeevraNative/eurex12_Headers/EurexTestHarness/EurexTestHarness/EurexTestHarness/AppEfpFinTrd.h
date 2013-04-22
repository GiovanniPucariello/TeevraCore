#include <AppEfpFinTrd.hxx>
#define BUFFER_SIZE 1000

futAppEfpFinTrdRequestT *vfutAppEfpFinTrdRequestT;
futAppEfpFinTrdResponseT *vfutAppEfpFinTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppEfpFinTrdRequestT getFutBscAppEfpFinTrdRequestT(char* testCaseNum , const char *root) {
	futBscAppEfpFinTrdRequestT vfutBscAppEfpFinTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AppEfpFinTrd.futBscAppEfpFinTrdRequestT.buyCod", lbuyCod);
	vfutBscAppEfpFinTrdRequestT.buyCod = lbuyCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscAppEfpFinTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("AppEfpFinTrd.futBscAppEfpFinTrdRequestT.prodId", lprodId);
	memcpy(vfutBscAppEfpFinTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscAppEfpFinTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AppEfpFinTrd.futBscAppEfpFinTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscAppEfpFinTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscAppEfpFinTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscAppEfpFinTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("AppEfpFinTrd.futBscAppEfpFinTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscAppEfpFinTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscAppEfpFinTrdRequestT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("AppEfpFinTrd.futBscAppEfpFinTrdRequestT.setlInst", lsetlInst);
	memcpy(vfutBscAppEfpFinTrdRequestT.setlInst, lsetlInst, SETL_INST_LEN);

	vfutBscAppEfpFinTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscAppEfpFinTrdRequestT");
	vfutBscAppEfpFinTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futBscAppEfpFinTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscAppEfpFinTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AppEfpFinTrd.futBscAppEfpFinTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscAppEfpFinTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppEfpFinTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppEfpFinTrd.futBscAppEfpFinTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppEfpFinTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppEfpFinTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppEfpFinTrdResponseT getFutBscAppEfpFinTrdResponseT(char* testCaseNum , const char *root) {
	futBscAppEfpFinTrdResponseT vfutBscAppEfpFinTrdResponseT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscAppEfpFinTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("AppEfpFinTrd.futBscAppEfpFinTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscAppEfpFinTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppEfpFinTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppEfpFinTrd.futBscAppEfpFinTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppEfpFinTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppEfpFinTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppEfpFinTrdRequestT* getFutAppEfpFinTrdRequestT(char* testCaseNum) {
	vfutAppEfpFinTrdRequestT = (futAppEfpFinTrdRequestT*)malloc(sizeof(futAppEfpFinTrdRequestT));
	int i;

	vfutAppEfpFinTrdRequestT->header = getDataHeaderT(testCaseNum, "futAppEfpFinTrdRequestT");
	vfutAppEfpFinTrdRequestT->basic = getFutBscAppEfpFinTrdRequestT(testCaseNum, "futAppEfpFinTrdRequestT");
	return vfutAppEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppEfpFinTrdResponseT* getFutAppEfpFinTrdResponseT(char* testCaseNum) {
	vfutAppEfpFinTrdResponseT = (futAppEfpFinTrdResponseT*)malloc(sizeof(futAppEfpFinTrdResponseT));
	int i;

	vfutAppEfpFinTrdResponseT->header = getDataHeaderT(testCaseNum, "futAppEfpFinTrdResponseT");
	vfutAppEfpFinTrdResponseT->basic = getFutBscAppEfpFinTrdResponseT(testCaseNum, "futAppEfpFinTrdResponseT");
	return vfutAppEfpFinTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppEfpFinTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppEfpFinTrdRequestT));
	futAppEfpFinTrdRequestT *vfutAppEfpFinTrdRequestT = getFutAppEfpFinTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppEfpFinTrdRequestT), (jbyte*) vfutAppEfpFinTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppEfpFinTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppEfpFinTrdResponseT));
	futAppEfpFinTrdResponseT *vfutAppEfpFinTrdResponseT = getFutAppEfpFinTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppEfpFinTrdResponseT), (jbyte*) vfutAppEfpFinTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppEfpFinTrdRequestT(futBscAppEfpFinTrdRequestT actual, futBscAppEfpFinTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpFinTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpFinTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpFinTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpFinTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpFinTrdRequestT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpFinTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpFinTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppEfpFinTrdResponseT(futBscAppEfpFinTrdResponseT actual, futBscAppEfpFinTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpFinTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpFinTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppEfpFinTrdRequestT(futAppEfpFinTrdRequestT actual, futAppEfpFinTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppEfpFinTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppEfpFinTrdResponseT(futAppEfpFinTrdResponseT actual, futAppEfpFinTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppEfpFinTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppEfpFinTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppEfpFinTrdRequestT *actualData = (futAppEfpFinTrdRequestT *)msgStruct;
	futAppEfpFinTrdRequestT* expectedData = getFutAppEfpFinTrdRequestT(testCaseNum);
	compareFutAppEfpFinTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppEfpFinTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppEfpFinTrdResponseT *actualData = (futAppEfpFinTrdResponseT *)msgStruct;
	futAppEfpFinTrdResponseT* expectedData = getFutAppEfpFinTrdResponseT(testCaseNum);
	compareFutAppEfpFinTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
