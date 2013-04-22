#include <ModAutExerParm.hxx>
#define BUFFER_SIZE 1000

optModAutExerParmRequestT *voptModAutExerParmRequestT;
optModAutExerParmResponseT *voptModAutExerParmResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModAutExerParmRequestT getOptBscModAutExerParmRequestT(char* testCaseNum , const char *root) {
	optBscModAutExerParmRequestT voptBscModAutExerParmRequestT;
	int i;

	char lactnCod[1] = {""};
	getStrProperty("ModAutExerParm.optBscModAutExerParmRequestT.actnCod", lactnCod);
	voptBscModAutExerParmRequestT.actnCod = lactnCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscModAutExerParmRequestT.genProdId[i]= ' ';
	}
	char lgenProdId[PROD_ID_LEN] = {""};
	getStrProperty("ModAutExerParm.optBscModAutExerParmRequestT.genProdId", lgenProdId);
	memcpy(voptBscModAutExerParmRequestT.genProdId, lgenProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModAutExerParmRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModAutExerParm.optBscModAutExerParmRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModAutExerParmRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscModAutExerParmRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtModAutExerParmRequestT getOptExtModAutExerParmRequestT(char* testCaseNum , const char *root) {
	optExtModAutExerParmRequestT voptExtModAutExerParmRequestT;
	int i;

	voptExtModAutExerParmRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtModAutExerParmRequestT");
	for(i=0;i<DRIV_ITM_MIN_AMNT_LEN;i++) {
		voptExtModAutExerParmRequestT.itmMinAmnt[i]= ' ';
	}
	char litmMinAmnt[DRIV_ITM_MIN_AMNT_LEN] = {""};
	getStrProperty("ModAutExerParm.optExtModAutExerParmRequestT.itmMinAmnt", litmMinAmnt);
	memcpy(voptExtModAutExerParmRequestT.itmMinAmnt, litmMinAmnt, DRIV_ITM_MIN_AMNT_LEN);

	char litmMinAmntCod[1] = {""};
	getStrProperty("ModAutExerParm.optExtModAutExerParmRequestT.itmMinAmntCod", litmMinAmntCod);
	voptExtModAutExerParmRequestT.itmMinAmntCod = litmMinAmntCod[0];
	return voptExtModAutExerParmRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModAutExerParmResponseT getOptBscModAutExerParmResponseT(char* testCaseNum , const char *root) {
	optBscModAutExerParmResponseT voptBscModAutExerParmResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModAutExerParmResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModAutExerParm.optBscModAutExerParmResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModAutExerParmResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscModAutExerParmResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModAutExerParmRequestT* getOptModAutExerParmRequestT(char* testCaseNum) {
	voptModAutExerParmRequestT = (optModAutExerParmRequestT*)malloc(sizeof(optModAutExerParmRequestT));
	int i;

	voptModAutExerParmRequestT->header = getDataHeaderT(testCaseNum, "optModAutExerParmRequestT");
	voptModAutExerParmRequestT->basic = getOptBscModAutExerParmRequestT(testCaseNum, "optModAutExerParmRequestT");
	voptModAutExerParmRequestT->extension = getOptExtModAutExerParmRequestT(testCaseNum, "optModAutExerParmRequestT");
	return voptModAutExerParmRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModAutExerParmResponseT* getOptModAutExerParmResponseT(char* testCaseNum) {
	voptModAutExerParmResponseT = (optModAutExerParmResponseT*)malloc(sizeof(optModAutExerParmResponseT));
	int i;

	voptModAutExerParmResponseT->header = getDataHeaderT(testCaseNum, "optModAutExerParmResponseT");
	voptModAutExerParmResponseT->basic = getOptBscModAutExerParmResponseT(testCaseNum, "optModAutExerParmResponseT");
	return voptModAutExerParmResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModAutExerParmRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModAutExerParmRequestT));
	optModAutExerParmRequestT *voptModAutExerParmRequestT = getOptModAutExerParmRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModAutExerParmRequestT), (jbyte*) voptModAutExerParmRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModAutExerParmResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModAutExerParmResponseT));
	optModAutExerParmResponseT *voptModAutExerParmResponseT = getOptModAutExerParmResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModAutExerParmResponseT), (jbyte*) voptModAutExerParmResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModAutExerParmRequestT(optBscModAutExerParmRequestT actual, optBscModAutExerParmRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.actnCod!= expected.actnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModAutExerParmRequestT, actnCodnot matching. Actual %d but Expected %d", actual.actnCod, expected.actnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.genProdId, expected.genProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModAutExerParmRequestT, genProdId not matching. Actual %s but Expected %s", actual.genProdId, expected.genProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModAutExerParmRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtModAutExerParmRequestT(optExtModAutExerParmRequestT actual, optExtModAutExerParmRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.itmMinAmnt, expected.itmMinAmnt, DRIV_ITM_MIN_AMNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModAutExerParmRequestT, itmMinAmnt not matching. Actual %s but Expected %s", actual.itmMinAmnt, expected.itmMinAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.itmMinAmntCod!= expected.itmMinAmntCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModAutExerParmRequestT, itmMinAmntCodnot matching. Actual %d but Expected %d", actual.itmMinAmntCod, expected.itmMinAmntCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModAutExerParmResponseT(optBscModAutExerParmResponseT actual, optBscModAutExerParmResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModAutExerParmResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModAutExerParmRequestT(optModAutExerParmRequestT actual, optModAutExerParmRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModAutExerParmRequestT (actual.basic,expected.basic, logMsg);	compareOptExtModAutExerParmRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModAutExerParmResponseT(optModAutExerParmResponseT actual, optModAutExerParmResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModAutExerParmResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModAutExerParmRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModAutExerParmRequestT *actualData = (optModAutExerParmRequestT *)msgStruct;
	optModAutExerParmRequestT* expectedData = getOptModAutExerParmRequestT(testCaseNum);
	compareOptModAutExerParmRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModAutExerParmResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModAutExerParmResponseT *actualData = (optModAutExerParmResponseT *)msgStruct;
	optModAutExerParmResponseT* expectedData = getOptModAutExerParmResponseT(testCaseNum);
	compareOptModAutExerParmResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
