#include <AppEfpIdxTrd.hxx>
#define BUFFER_SIZE 1000

futAppEfpIdxTrdRequestT *vfutAppEfpIdxTrdRequestT;
futAppEfpIdxTrdResponseT *vfutAppEfpIdxTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppEfpIdxTrdRequestT getFutBscAppEfpIdxTrdRequestT(char* testCaseNum , const char *root) {
	futBscAppEfpIdxTrdRequestT vfutBscAppEfpIdxTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AppEfpIdxTrd.futBscAppEfpIdxTrdRequestT.buyCod", lbuyCod);
	vfutBscAppEfpIdxTrdRequestT.buyCod = lbuyCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscAppEfpIdxTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("AppEfpIdxTrd.futBscAppEfpIdxTrdRequestT.prodId", lprodId);
	memcpy(vfutBscAppEfpIdxTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscAppEfpIdxTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AppEfpIdxTrd.futBscAppEfpIdxTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscAppEfpIdxTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscAppEfpIdxTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscAppEfpIdxTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("AppEfpIdxTrd.futBscAppEfpIdxTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscAppEfpIdxTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscAppEfpIdxTrdRequestT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("AppEfpIdxTrd.futBscAppEfpIdxTrdRequestT.setlInst", lsetlInst);
	memcpy(vfutBscAppEfpIdxTrdRequestT.setlInst, lsetlInst, SETL_INST_LEN);

	vfutBscAppEfpIdxTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscAppEfpIdxTrdRequestT");
	vfutBscAppEfpIdxTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futBscAppEfpIdxTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscAppEfpIdxTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AppEfpIdxTrd.futBscAppEfpIdxTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscAppEfpIdxTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppEfpIdxTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppEfpIdxTrd.futBscAppEfpIdxTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppEfpIdxTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppEfpIdxTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppEfpIdxTrdResponseT getFutBscAppEfpIdxTrdResponseT(char* testCaseNum , const char *root) {
	futBscAppEfpIdxTrdResponseT vfutBscAppEfpIdxTrdResponseT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscAppEfpIdxTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("AppEfpIdxTrd.futBscAppEfpIdxTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscAppEfpIdxTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppEfpIdxTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppEfpIdxTrd.futBscAppEfpIdxTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppEfpIdxTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppEfpIdxTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppEfpIdxTrdRequestT* getFutAppEfpIdxTrdRequestT(char* testCaseNum) {
	vfutAppEfpIdxTrdRequestT = (futAppEfpIdxTrdRequestT*)malloc(sizeof(futAppEfpIdxTrdRequestT));
	int i;

	vfutAppEfpIdxTrdRequestT->header = getDataHeaderT(testCaseNum, "futAppEfpIdxTrdRequestT");
	vfutAppEfpIdxTrdRequestT->basic = getFutBscAppEfpIdxTrdRequestT(testCaseNum, "futAppEfpIdxTrdRequestT");
	return vfutAppEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppEfpIdxTrdResponseT* getFutAppEfpIdxTrdResponseT(char* testCaseNum) {
	vfutAppEfpIdxTrdResponseT = (futAppEfpIdxTrdResponseT*)malloc(sizeof(futAppEfpIdxTrdResponseT));
	int i;

	vfutAppEfpIdxTrdResponseT->header = getDataHeaderT(testCaseNum, "futAppEfpIdxTrdResponseT");
	vfutAppEfpIdxTrdResponseT->basic = getFutBscAppEfpIdxTrdResponseT(testCaseNum, "futAppEfpIdxTrdResponseT");
	return vfutAppEfpIdxTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppEfpIdxTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppEfpIdxTrdRequestT));
	futAppEfpIdxTrdRequestT *vfutAppEfpIdxTrdRequestT = getFutAppEfpIdxTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppEfpIdxTrdRequestT), (jbyte*) vfutAppEfpIdxTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppEfpIdxTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppEfpIdxTrdResponseT));
	futAppEfpIdxTrdResponseT *vfutAppEfpIdxTrdResponseT = getFutAppEfpIdxTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppEfpIdxTrdResponseT), (jbyte*) vfutAppEfpIdxTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppEfpIdxTrdRequestT(futBscAppEfpIdxTrdRequestT actual, futBscAppEfpIdxTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpIdxTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpIdxTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpIdxTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpIdxTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpIdxTrdRequestT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpIdxTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpIdxTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppEfpIdxTrdResponseT(futBscAppEfpIdxTrdResponseT actual, futBscAppEfpIdxTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpIdxTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpIdxTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppEfpIdxTrdRequestT(futAppEfpIdxTrdRequestT actual, futAppEfpIdxTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppEfpIdxTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppEfpIdxTrdResponseT(futAppEfpIdxTrdResponseT actual, futAppEfpIdxTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppEfpIdxTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppEfpIdxTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppEfpIdxTrdRequestT *actualData = (futAppEfpIdxTrdRequestT *)msgStruct;
	futAppEfpIdxTrdRequestT* expectedData = getFutAppEfpIdxTrdRequestT(testCaseNum);
	compareFutAppEfpIdxTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppEfpIdxTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppEfpIdxTrdResponseT *actualData = (futAppEfpIdxTrdResponseT *)msgStruct;
	futAppEfpIdxTrdResponseT* expectedData = getFutAppEfpIdxTrdResponseT(testCaseNum);
	compareFutAppEfpIdxTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
