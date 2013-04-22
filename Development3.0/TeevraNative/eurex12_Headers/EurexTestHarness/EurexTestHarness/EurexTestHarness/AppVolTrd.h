#include <AppVolTrd.hxx>
#define BUFFER_SIZE 1000

futAppVolTrdRequestT *vfutAppVolTrdRequestT;
futAppVolTrdResponseT *vfutAppVolTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppVolTrdRequestT getFutBscAppVolTrdRequestT(char* testCaseNum , const char *root) {
	futBscAppVolTrdRequestT vfutBscAppVolTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AppVolTrd.futBscAppVolTrdRequestT.buyCod", lbuyCod);
	vfutBscAppVolTrdRequestT.buyCod = lbuyCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscAppVolTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("AppVolTrd.futBscAppVolTrdRequestT.prodId", lprodId);
	memcpy(vfutBscAppVolTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscAppVolTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AppVolTrd.futBscAppVolTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscAppVolTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscAppVolTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscAppVolTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("AppVolTrd.futBscAppVolTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscAppVolTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppVolTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppVolTrd.futBscAppVolTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppVolTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppVolTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtAppVolTrdRequestT getFutExtAppVolTrdRequestT(char* testCaseNum , const char *root) {
	futExtAppVolTrdRequestT vfutExtAppVolTrdRequestT;
	int i;

	vfutExtAppVolTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtAppVolTrdRequestT");
	vfutExtAppVolTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtAppVolTrdRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtAppVolTrdRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("AppVolTrd.futExtAppVolTrdRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtAppVolTrdRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);
	return vfutExtAppVolTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppVolTrdResponseT getFutBscAppVolTrdResponseT(char* testCaseNum , const char *root) {
	futBscAppVolTrdResponseT vfutBscAppVolTrdResponseT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscAppVolTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("AppVolTrd.futBscAppVolTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscAppVolTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppVolTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppVolTrd.futBscAppVolTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppVolTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppVolTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppVolTrdRequestT* getFutAppVolTrdRequestT(char* testCaseNum) {
	vfutAppVolTrdRequestT = (futAppVolTrdRequestT*)malloc(sizeof(futAppVolTrdRequestT));
	int i;

	vfutAppVolTrdRequestT->header = getDataHeaderT(testCaseNum, "futAppVolTrdRequestT");
	vfutAppVolTrdRequestT->basic = getFutBscAppVolTrdRequestT(testCaseNum, "futAppVolTrdRequestT");
	vfutAppVolTrdRequestT->extension = getFutExtAppVolTrdRequestT(testCaseNum, "futAppVolTrdRequestT");
	return vfutAppVolTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppVolTrdResponseT* getFutAppVolTrdResponseT(char* testCaseNum) {
	vfutAppVolTrdResponseT = (futAppVolTrdResponseT*)malloc(sizeof(futAppVolTrdResponseT));
	int i;

	vfutAppVolTrdResponseT->header = getDataHeaderT(testCaseNum, "futAppVolTrdResponseT");
	vfutAppVolTrdResponseT->basic = getFutBscAppVolTrdResponseT(testCaseNum, "futAppVolTrdResponseT");
	return vfutAppVolTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppVolTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppVolTrdRequestT));
	futAppVolTrdRequestT *vfutAppVolTrdRequestT = getFutAppVolTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppVolTrdRequestT), (jbyte*) vfutAppVolTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppVolTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppVolTrdResponseT));
	futAppVolTrdResponseT *vfutAppVolTrdResponseT = getFutAppVolTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppVolTrdResponseT), (jbyte*) vfutAppVolTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppVolTrdRequestT(futBscAppVolTrdRequestT actual, futBscAppVolTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppVolTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppVolTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppVolTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppVolTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppVolTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtAppVolTrdRequestT(futExtAppVolTrdRequestT actual, futExtAppVolTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtAppVolTrdRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppVolTrdResponseT(futBscAppVolTrdResponseT actual, futBscAppVolTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppVolTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppVolTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppVolTrdRequestT(futAppVolTrdRequestT actual, futAppVolTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppVolTrdRequestT (actual.basic,expected.basic, logMsg);	compareFutExtAppVolTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppVolTrdResponseT(futAppVolTrdResponseT actual, futAppVolTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppVolTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppVolTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppVolTrdRequestT *actualData = (futAppVolTrdRequestT *)msgStruct;
	futAppVolTrdRequestT* expectedData = getFutAppVolTrdRequestT(testCaseNum);
	compareFutAppVolTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppVolTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppVolTrdResponseT *actualData = (futAppVolTrdResponseT *)msgStruct;
	futAppVolTrdResponseT* expectedData = getFutAppVolTrdResponseT(testCaseNum);
	compareFutAppVolTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
