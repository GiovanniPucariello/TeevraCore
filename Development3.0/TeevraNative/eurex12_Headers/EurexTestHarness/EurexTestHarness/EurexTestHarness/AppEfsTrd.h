#include <AppEfsTrd.hxx>
#define BUFFER_SIZE 1000

futAppEfsTrdRequestT *vfutAppEfsTrdRequestT;
futAppEfsTrdResponseT *vfutAppEfsTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppEfsTrdRequestT getFutBscAppEfsTrdRequestT(char* testCaseNum , const char *root) {
	futBscAppEfsTrdRequestT vfutBscAppEfsTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AppEfsTrd.futBscAppEfsTrdRequestT.buyCod", lbuyCod);
	vfutBscAppEfsTrdRequestT.buyCod = lbuyCod[0];

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscAppEfsTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AppEfsTrd.futBscAppEfsTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscAppEfsTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscAppEfsTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("AppEfsTrd.futBscAppEfsTrdRequestT.prodId", lprodId);
	memcpy(vfutBscAppEfsTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	vfutBscAppEfsTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscAppEfsTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("AppEfsTrd.futBscAppEfsTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscAppEfsTrdRequestT.opnClsCod = lopnClsCod[0];

	vfutBscAppEfsTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscAppEfsTrdRequestT");
	vfutBscAppEfsTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futBscAppEfsTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscAppEfsTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AppEfsTrd.futBscAppEfsTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscAppEfsTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppEfsTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppEfsTrd.futBscAppEfsTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppEfsTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppEfsTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppEfsTrdResponseT getFutBscAppEfsTrdResponseT(char* testCaseNum , const char *root) {
	futBscAppEfsTrdResponseT vfutBscAppEfsTrdResponseT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscAppEfsTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("AppEfsTrd.futBscAppEfsTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscAppEfsTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppEfsTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppEfsTrd.futBscAppEfsTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppEfsTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppEfsTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppEfsTrdRequestT* getFutAppEfsTrdRequestT(char* testCaseNum) {
	vfutAppEfsTrdRequestT = (futAppEfsTrdRequestT*)malloc(sizeof(futAppEfsTrdRequestT));
	int i;

	vfutAppEfsTrdRequestT->header = getDataHeaderT(testCaseNum, "futAppEfsTrdRequestT");
	vfutAppEfsTrdRequestT->basic = getFutBscAppEfsTrdRequestT(testCaseNum, "futAppEfsTrdRequestT");
	return vfutAppEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppEfsTrdResponseT* getFutAppEfsTrdResponseT(char* testCaseNum) {
	vfutAppEfsTrdResponseT = (futAppEfsTrdResponseT*)malloc(sizeof(futAppEfsTrdResponseT));
	int i;

	vfutAppEfsTrdResponseT->header = getDataHeaderT(testCaseNum, "futAppEfsTrdResponseT");
	vfutAppEfsTrdResponseT->basic = getFutBscAppEfsTrdResponseT(testCaseNum, "futAppEfsTrdResponseT");
	return vfutAppEfsTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppEfsTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppEfsTrdRequestT));
	futAppEfsTrdRequestT *vfutAppEfsTrdRequestT = getFutAppEfsTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppEfsTrdRequestT), (jbyte*) vfutAppEfsTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppEfsTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppEfsTrdResponseT));
	futAppEfsTrdResponseT *vfutAppEfsTrdResponseT = getFutAppEfsTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppEfsTrdResponseT), (jbyte*) vfutAppEfsTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppEfsTrdRequestT(futBscAppEfsTrdRequestT actual, futBscAppEfsTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfsTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfsTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfsTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfsTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfsTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfsTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppEfsTrdResponseT(futBscAppEfsTrdResponseT actual, futBscAppEfsTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfsTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfsTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppEfsTrdRequestT(futAppEfsTrdRequestT actual, futAppEfsTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppEfsTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppEfsTrdResponseT(futAppEfsTrdResponseT actual, futAppEfsTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppEfsTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppEfsTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppEfsTrdRequestT *actualData = (futAppEfsTrdRequestT *)msgStruct;
	futAppEfsTrdRequestT* expectedData = getFutAppEfsTrdRequestT(testCaseNum);
	compareFutAppEfsTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppEfsTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppEfsTrdResponseT *actualData = (futAppEfsTrdResponseT *)msgStruct;
	futAppEfsTrdResponseT* expectedData = getFutAppEfsTrdResponseT(testCaseNum);
	compareFutAppEfsTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
