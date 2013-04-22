#include <AppBlkTrd.hxx>
#define BUFFER_SIZE 1000

futAppBlkTrdRequestT *vfutAppBlkTrdRequestT;
futAppBlkTrdResponseT *vfutAppBlkTrdResponseT;
optAppBlkTrdRequestT *voptAppBlkTrdRequestT;
optAppBlkTrdResponseT *voptAppBlkTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppBlkTrdRequestT getFutBscAppBlkTrdRequestT(char* testCaseNum , const char *root) {
	futBscAppBlkTrdRequestT vfutBscAppBlkTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AppBlkTrd.futBscAppBlkTrdRequestT.buyCod", lbuyCod);
	vfutBscAppBlkTrdRequestT.buyCod = lbuyCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscAppBlkTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("AppBlkTrd.futBscAppBlkTrdRequestT.prodId", lprodId);
	memcpy(vfutBscAppBlkTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscAppBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AppBlkTrd.futBscAppBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscAppBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscAppBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscAppBlkTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("AppBlkTrd.futBscAppBlkTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscAppBlkTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppBlkTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppBlkTrd.futBscAppBlkTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppBlkTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtAppBlkTrdRequestT getFutExtAppBlkTrdRequestT(char* testCaseNum , const char *root) {
	futExtAppBlkTrdRequestT vfutExtAppBlkTrdRequestT;
	int i;

	vfutExtAppBlkTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtAppBlkTrdRequestT");
	vfutExtAppBlkTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtAppBlkTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtAppBlkTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AppBlkTrd.futExtAppBlkTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtAppBlkTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutExtAppBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAppBlkTrdResponseT getFutBscAppBlkTrdResponseT(char* testCaseNum , const char *root) {
	futBscAppBlkTrdResponseT vfutBscAppBlkTrdResponseT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscAppBlkTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("AppBlkTrd.futBscAppBlkTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscAppBlkTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAppBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppBlkTrd.futBscAppBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAppBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAppBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscAppBlkTrdRequestT getOptBscAppBlkTrdRequestT(char* testCaseNum , const char *root) {
	optBscAppBlkTrdRequestT voptBscAppBlkTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AppBlkTrd.optBscAppBlkTrdRequestT.buyCod", lbuyCod);
	voptBscAppBlkTrdRequestT.buyCod = lbuyCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscAppBlkTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("AppBlkTrd.optBscAppBlkTrdRequestT.prodId", lprodId);
	memcpy(voptBscAppBlkTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscAppBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AppBlkTrd.optBscAppBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscAppBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscAppBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscAppBlkTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("AppBlkTrd.optBscAppBlkTrdRequestT.opnClsCod", lopnClsCod);
	voptBscAppBlkTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscAppBlkTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppBlkTrd.optBscAppBlkTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscAppBlkTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscAppBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtAppBlkTrdRequestT getOptExtAppBlkTrdRequestT(char* testCaseNum , const char *root) {
	optExtAppBlkTrdRequestT voptExtAppBlkTrdRequestT;
	int i;

	voptExtAppBlkTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtAppBlkTrdRequestT");
	voptExtAppBlkTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtAppBlkTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptExtAppBlkTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AppBlkTrd.optExtAppBlkTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptExtAppBlkTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return voptExtAppBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscAppBlkTrdResponseT getOptBscAppBlkTrdResponseT(char* testCaseNum , const char *root) {
	optBscAppBlkTrdResponseT voptBscAppBlkTrdResponseT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		voptBscAppBlkTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("AppBlkTrd.optBscAppBlkTrdResponseT.trdNo", ltrdNo);
	memcpy(voptBscAppBlkTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscAppBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppBlkTrd.optBscAppBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscAppBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscAppBlkTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppBlkTrdRequestT* getFutAppBlkTrdRequestT(char* testCaseNum) {
	vfutAppBlkTrdRequestT = (futAppBlkTrdRequestT*)malloc(sizeof(futAppBlkTrdRequestT));
	int i;

	vfutAppBlkTrdRequestT->header = getDataHeaderT(testCaseNum, "futAppBlkTrdRequestT");
	vfutAppBlkTrdRequestT->basic = getFutBscAppBlkTrdRequestT(testCaseNum, "futAppBlkTrdRequestT");
	vfutAppBlkTrdRequestT->extension = getFutExtAppBlkTrdRequestT(testCaseNum, "futAppBlkTrdRequestT");
	return vfutAppBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAppBlkTrdResponseT* getFutAppBlkTrdResponseT(char* testCaseNum) {
	vfutAppBlkTrdResponseT = (futAppBlkTrdResponseT*)malloc(sizeof(futAppBlkTrdResponseT));
	int i;

	vfutAppBlkTrdResponseT->header = getDataHeaderT(testCaseNum, "futAppBlkTrdResponseT");
	vfutAppBlkTrdResponseT->basic = getFutBscAppBlkTrdResponseT(testCaseNum, "futAppBlkTrdResponseT");
	return vfutAppBlkTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAppBlkTrdRequestT* getOptAppBlkTrdRequestT(char* testCaseNum) {
	voptAppBlkTrdRequestT = (optAppBlkTrdRequestT*)malloc(sizeof(optAppBlkTrdRequestT));
	int i;

	voptAppBlkTrdRequestT->header = getDataHeaderT(testCaseNum, "optAppBlkTrdRequestT");
	voptAppBlkTrdRequestT->basic = getOptBscAppBlkTrdRequestT(testCaseNum, "optAppBlkTrdRequestT");
	voptAppBlkTrdRequestT->extension = getOptExtAppBlkTrdRequestT(testCaseNum, "optAppBlkTrdRequestT");
	return voptAppBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAppBlkTrdResponseT* getOptAppBlkTrdResponseT(char* testCaseNum) {
	voptAppBlkTrdResponseT = (optAppBlkTrdResponseT*)malloc(sizeof(optAppBlkTrdResponseT));
	int i;

	voptAppBlkTrdResponseT->header = getDataHeaderT(testCaseNum, "optAppBlkTrdResponseT");
	voptAppBlkTrdResponseT->basic = getOptBscAppBlkTrdResponseT(testCaseNum, "optAppBlkTrdResponseT");
	return voptAppBlkTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppBlkTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppBlkTrdRequestT));
	futAppBlkTrdRequestT *vfutAppBlkTrdRequestT = getFutAppBlkTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppBlkTrdRequestT), (jbyte*) vfutAppBlkTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAppBlkTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAppBlkTrdResponseT));
	futAppBlkTrdResponseT *vfutAppBlkTrdResponseT = getFutAppBlkTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAppBlkTrdResponseT), (jbyte*) vfutAppBlkTrdResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAppBlkTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAppBlkTrdRequestT));
	optAppBlkTrdRequestT *voptAppBlkTrdRequestT = getOptAppBlkTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAppBlkTrdRequestT), (jbyte*) voptAppBlkTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAppBlkTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAppBlkTrdResponseT));
	optAppBlkTrdResponseT *voptAppBlkTrdResponseT = getOptAppBlkTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAppBlkTrdResponseT), (jbyte*) voptAppBlkTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppBlkTrdRequestT(futBscAppBlkTrdRequestT actual, futBscAppBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppBlkTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppBlkTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppBlkTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppBlkTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtAppBlkTrdRequestT(futExtAppBlkTrdRequestT actual, futExtAppBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtAppBlkTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAppBlkTrdResponseT(futBscAppBlkTrdResponseT actual, futBscAppBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppBlkTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAppBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscAppBlkTrdRequestT(optBscAppBlkTrdRequestT actual, optBscAppBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAppBlkTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAppBlkTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAppBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAppBlkTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAppBlkTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtAppBlkTrdRequestT(optExtAppBlkTrdRequestT actual, optExtAppBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtAppBlkTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscAppBlkTrdResponseT(optBscAppBlkTrdResponseT actual, optBscAppBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAppBlkTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAppBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppBlkTrdRequestT(futAppBlkTrdRequestT actual, futAppBlkTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppBlkTrdRequestT (actual.basic,expected.basic, logMsg);	compareFutExtAppBlkTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAppBlkTrdResponseT(futAppBlkTrdResponseT actual, futAppBlkTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAppBlkTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptAppBlkTrdRequestT(optAppBlkTrdRequestT actual, optAppBlkTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscAppBlkTrdRequestT (actual.basic,expected.basic, logMsg);	compareOptExtAppBlkTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptAppBlkTrdResponseT(optAppBlkTrdResponseT actual, optAppBlkTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscAppBlkTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppBlkTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppBlkTrdRequestT *actualData = (futAppBlkTrdRequestT *)msgStruct;
	futAppBlkTrdRequestT* expectedData = getFutAppBlkTrdRequestT(testCaseNum);
	compareFutAppBlkTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAppBlkTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAppBlkTrdResponseT *actualData = (futAppBlkTrdResponseT *)msgStruct;
	futAppBlkTrdResponseT* expectedData = getFutAppBlkTrdResponseT(testCaseNum);
	compareFutAppBlkTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAppBlkTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAppBlkTrdRequestT *actualData = (optAppBlkTrdRequestT *)msgStruct;
	optAppBlkTrdRequestT* expectedData = getOptAppBlkTrdRequestT(testCaseNum);
	compareOptAppBlkTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAppBlkTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAppBlkTrdResponseT *actualData = (optAppBlkTrdResponseT *)msgStruct;
	optAppBlkTrdResponseT* expectedData = getOptAppBlkTrdResponseT(testCaseNum);
	compareOptAppBlkTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
