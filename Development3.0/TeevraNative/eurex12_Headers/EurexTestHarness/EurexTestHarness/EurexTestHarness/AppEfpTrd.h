#include <AppEfpTrd.hxx>
#define BUFFER_SIZE 1000

futAppEfpTrdRequestT *vfutAppEfpTrdRequestT;
futAppEfpTrdResponseT *vfutAppEfpTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppEfpTrdRequestT getFutBscAppEfpTrdRequestT(char* testCaseNum , const char *root) {
	futBscAppEfpTrdRequestT vfutBscAppEfpTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AppEfpTrd.futBscAppEfpTrdRequestT.buyCod", lbuyCod);
	vfutBscAppEfpTrdRequestT.buyCod = lbuyCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscAppEfpTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("AppEfpTrd.futBscAppEfpTrdRequestT.prodId", lprodId);
	memcpy(vfutBscAppEfpTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscAppEfpTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AppEfpTrd.futBscAppEfpTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscAppEfpTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscAppEfpTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscAppEfpTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("AppEfpTrd.futBscAppEfpTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscAppEfpTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppEfpTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppEfpTrd.futBscAppEfpTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppEfpTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppEfpTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtAppEfpTrdRequestT getFutExtAppEfpTrdRequestT(char* testCaseNum , const char *root) {
	futExtAppEfpTrdRequestT vfutExtAppEfpTrdRequestT;
	int i;

	vfutExtAppEfpTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtAppEfpTrdRequestT");
	vfutExtAppEfpTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtAppEfpTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtAppEfpTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AppEfpTrd.futExtAppEfpTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtAppEfpTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutExtAppEfpTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppEfpTrdResponseT getFutBscAppEfpTrdResponseT(char* testCaseNum , const char *root) {
	futBscAppEfpTrdResponseT vfutBscAppEfpTrdResponseT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscAppEfpTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("AppEfpTrd.futBscAppEfpTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscAppEfpTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppEfpTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppEfpTrd.futBscAppEfpTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppEfpTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppEfpTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppEfpTrdRequestT* getFutAppEfpTrdRequestT(char* testCaseNum) {
	vfutAppEfpTrdRequestT = (futAppEfpTrdRequestT*)malloc(sizeof(futAppEfpTrdRequestT));
	int i;

	vfutAppEfpTrdRequestT->header = getDataHeaderT(testCaseNum, "futAppEfpTrdRequestT");
	vfutAppEfpTrdRequestT->basic = getFutBscAppEfpTrdRequestT(testCaseNum, "futAppEfpTrdRequestT");
	vfutAppEfpTrdRequestT->extension = getFutExtAppEfpTrdRequestT(testCaseNum, "futAppEfpTrdRequestT");
	return vfutAppEfpTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppEfpTrdResponseT* getFutAppEfpTrdResponseT(char* testCaseNum) {
	vfutAppEfpTrdResponseT = (futAppEfpTrdResponseT*)malloc(sizeof(futAppEfpTrdResponseT));
	int i;

	vfutAppEfpTrdResponseT->header = getDataHeaderT(testCaseNum, "futAppEfpTrdResponseT");
	vfutAppEfpTrdResponseT->basic = getFutBscAppEfpTrdResponseT(testCaseNum, "futAppEfpTrdResponseT");
	return vfutAppEfpTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppEfpTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppEfpTrdRequestT));
	futAppEfpTrdRequestT *vfutAppEfpTrdRequestT = getFutAppEfpTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppEfpTrdRequestT), (jbyte*) vfutAppEfpTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppEfpTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppEfpTrdResponseT));
	futAppEfpTrdResponseT *vfutAppEfpTrdResponseT = getFutAppEfpTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppEfpTrdResponseT), (jbyte*) vfutAppEfpTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppEfpTrdRequestT(futBscAppEfpTrdRequestT actual, futBscAppEfpTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtAppEfpTrdRequestT(futExtAppEfpTrdRequestT actual, futExtAppEfpTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtAppEfpTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppEfpTrdResponseT(futBscAppEfpTrdResponseT actual, futBscAppEfpTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppEfpTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppEfpTrdRequestT(futAppEfpTrdRequestT actual, futAppEfpTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppEfpTrdRequestT (actual.basic,expected.basic, logMsg);	compareFutExtAppEfpTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppEfpTrdResponseT(futAppEfpTrdResponseT actual, futAppEfpTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppEfpTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppEfpTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppEfpTrdRequestT *actualData = (futAppEfpTrdRequestT *)msgStruct;
	futAppEfpTrdRequestT* expectedData = getFutAppEfpTrdRequestT(testCaseNum);
	compareFutAppEfpTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppEfpTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppEfpTrdResponseT *actualData = (futAppEfpTrdResponseT *)msgStruct;
	futAppEfpTrdResponseT* expectedData = getFutAppEfpTrdResponseT(testCaseNum);
	compareFutAppEfpTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
