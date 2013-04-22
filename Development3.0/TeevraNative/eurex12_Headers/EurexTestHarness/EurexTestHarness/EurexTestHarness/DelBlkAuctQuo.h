#include <DelBlkAuctQuo.hxx>
#define BUFFER_SIZE 1000

futDelBlkAuctQuoRequestT *vfutDelBlkAuctQuoRequestT;
futDelBlkAuctQuoResponseT *vfutDelBlkAuctQuoResponseT;
optDelBlkAuctQuoRequestT *voptDelBlkAuctQuoRequestT;
optDelBlkAuctQuoResponseT *voptDelBlkAuctQuoResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelBlkAuctQuoRequestT getFutBscDelBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	futBscDelBlkAuctQuoRequestT vfutBscDelBlkAuctQuoRequestT;
	int i;

	vfutBscDelBlkAuctQuoRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscDelBlkAuctQuoRequestT");
	vfutBscDelBlkAuctQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelBlkAuctQuoRequestT");	return vfutBscDelBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelBlkAuctQuoResponseT getFutBscDelBlkAuctQuoResponseT(char* testCaseNum , const char *root) {
	futBscDelBlkAuctQuoResponseT vfutBscDelBlkAuctQuoResponseT;
	int i;

	char lbidSidDel[1] = {""};
	getStrProperty("DelBlkAuctQuo.futBscDelBlkAuctQuoResponseT.bidSidDel", lbidSidDel);
	vfutBscDelBlkAuctQuoResponseT.bidSidDel = lbidSidDel[0];

	char laskSidDel[1] = {""};
	getStrProperty("DelBlkAuctQuo.futBscDelBlkAuctQuoResponseT.askSidDel", laskSidDel);
	vfutBscDelBlkAuctQuoResponseT.askSidDel = laskSidDel[0];
	return vfutBscDelBlkAuctQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelBlkAuctQuoRequestT getOptBscDelBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	optBscDelBlkAuctQuoRequestT voptBscDelBlkAuctQuoRequestT;
	int i;

	voptBscDelBlkAuctQuoRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscDelBlkAuctQuoRequestT");
	voptBscDelBlkAuctQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscDelBlkAuctQuoRequestT");	return voptBscDelBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelBlkAuctQuoResponseT getOptBscDelBlkAuctQuoResponseT(char* testCaseNum , const char *root) {
	optBscDelBlkAuctQuoResponseT voptBscDelBlkAuctQuoResponseT;
	int i;

	char lbidSidDel[1] = {""};
	getStrProperty("DelBlkAuctQuo.optBscDelBlkAuctQuoResponseT.bidSidDel", lbidSidDel);
	voptBscDelBlkAuctQuoResponseT.bidSidDel = lbidSidDel[0];

	char laskSidDel[1] = {""};
	getStrProperty("DelBlkAuctQuo.optBscDelBlkAuctQuoResponseT.askSidDel", laskSidDel);
	voptBscDelBlkAuctQuoResponseT.askSidDel = laskSidDel[0];
	return voptBscDelBlkAuctQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelBlkAuctQuoRequestT* getFutDelBlkAuctQuoRequestT(char* testCaseNum) {
	vfutDelBlkAuctQuoRequestT = (futDelBlkAuctQuoRequestT*)malloc(sizeof(futDelBlkAuctQuoRequestT));
	int i;

	vfutDelBlkAuctQuoRequestT->header = getDataHeaderT(testCaseNum, "futDelBlkAuctQuoRequestT");
	vfutDelBlkAuctQuoRequestT->basic = getFutBscDelBlkAuctQuoRequestT(testCaseNum, "futDelBlkAuctQuoRequestT");
	return vfutDelBlkAuctQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelBlkAuctQuoResponseT* getFutDelBlkAuctQuoResponseT(char* testCaseNum) {
	vfutDelBlkAuctQuoResponseT = (futDelBlkAuctQuoResponseT*)malloc(sizeof(futDelBlkAuctQuoResponseT));
	int i;

	vfutDelBlkAuctQuoResponseT->header = getDataHeaderT(testCaseNum, "futDelBlkAuctQuoResponseT");
	vfutDelBlkAuctQuoResponseT->basic = getFutBscDelBlkAuctQuoResponseT(testCaseNum, "futDelBlkAuctQuoResponseT");
	return vfutDelBlkAuctQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelBlkAuctQuoRequestT* getOptDelBlkAuctQuoRequestT(char* testCaseNum) {
	voptDelBlkAuctQuoRequestT = (optDelBlkAuctQuoRequestT*)malloc(sizeof(optDelBlkAuctQuoRequestT));
	int i;

	voptDelBlkAuctQuoRequestT->header = getDataHeaderT(testCaseNum, "optDelBlkAuctQuoRequestT");
	voptDelBlkAuctQuoRequestT->basic = getOptBscDelBlkAuctQuoRequestT(testCaseNum, "optDelBlkAuctQuoRequestT");
	return voptDelBlkAuctQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelBlkAuctQuoResponseT* getOptDelBlkAuctQuoResponseT(char* testCaseNum) {
	voptDelBlkAuctQuoResponseT = (optDelBlkAuctQuoResponseT*)malloc(sizeof(optDelBlkAuctQuoResponseT));
	int i;

	voptDelBlkAuctQuoResponseT->header = getDataHeaderT(testCaseNum, "optDelBlkAuctQuoResponseT");
	voptDelBlkAuctQuoResponseT->basic = getOptBscDelBlkAuctQuoResponseT(testCaseNum, "optDelBlkAuctQuoResponseT");
	return voptDelBlkAuctQuoResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelBlkAuctQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelBlkAuctQuoRequestT));
	futDelBlkAuctQuoRequestT *vfutDelBlkAuctQuoRequestT = getFutDelBlkAuctQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelBlkAuctQuoRequestT), (jbyte*) vfutDelBlkAuctQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelBlkAuctQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelBlkAuctQuoResponseT));
	futDelBlkAuctQuoResponseT *vfutDelBlkAuctQuoResponseT = getFutDelBlkAuctQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelBlkAuctQuoResponseT), (jbyte*) vfutDelBlkAuctQuoResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelBlkAuctQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelBlkAuctQuoRequestT));
	optDelBlkAuctQuoRequestT *voptDelBlkAuctQuoRequestT = getOptDelBlkAuctQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelBlkAuctQuoRequestT), (jbyte*) voptDelBlkAuctQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelBlkAuctQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelBlkAuctQuoResponseT));
	optDelBlkAuctQuoResponseT *voptDelBlkAuctQuoResponseT = getOptDelBlkAuctQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelBlkAuctQuoResponseT), (jbyte*) voptDelBlkAuctQuoResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelBlkAuctQuoRequestT(futBscDelBlkAuctQuoRequestT actual, futBscDelBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelBlkAuctQuoResponseT(futBscDelBlkAuctQuoResponseT actual, futBscDelBlkAuctQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.bidSidDel!= expected.bidSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelBlkAuctQuoResponseT, bidSidDelnot matching. Actual %d but Expected %d", actual.bidSidDel, expected.bidSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.askSidDel!= expected.askSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelBlkAuctQuoResponseT, askSidDelnot matching. Actual %d but Expected %d", actual.askSidDel, expected.askSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelBlkAuctQuoRequestT(optBscDelBlkAuctQuoRequestT actual, optBscDelBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelBlkAuctQuoResponseT(optBscDelBlkAuctQuoResponseT actual, optBscDelBlkAuctQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.bidSidDel!= expected.bidSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelBlkAuctQuoResponseT, bidSidDelnot matching. Actual %d but Expected %d", actual.bidSidDel, expected.bidSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.askSidDel!= expected.askSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelBlkAuctQuoResponseT, askSidDelnot matching. Actual %d but Expected %d", actual.askSidDel, expected.askSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelBlkAuctQuoRequestT(futDelBlkAuctQuoRequestT actual, futDelBlkAuctQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelBlkAuctQuoRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelBlkAuctQuoResponseT(futDelBlkAuctQuoResponseT actual, futDelBlkAuctQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelBlkAuctQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelBlkAuctQuoRequestT(optDelBlkAuctQuoRequestT actual, optDelBlkAuctQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelBlkAuctQuoRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelBlkAuctQuoResponseT(optDelBlkAuctQuoResponseT actual, optDelBlkAuctQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelBlkAuctQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelBlkAuctQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelBlkAuctQuoRequestT *actualData = (futDelBlkAuctQuoRequestT *)msgStruct;
	futDelBlkAuctQuoRequestT* expectedData = getFutDelBlkAuctQuoRequestT(testCaseNum);
	compareFutDelBlkAuctQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelBlkAuctQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelBlkAuctQuoResponseT *actualData = (futDelBlkAuctQuoResponseT *)msgStruct;
	futDelBlkAuctQuoResponseT* expectedData = getFutDelBlkAuctQuoResponseT(testCaseNum);
	compareFutDelBlkAuctQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelBlkAuctQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelBlkAuctQuoRequestT *actualData = (optDelBlkAuctQuoRequestT *)msgStruct;
	optDelBlkAuctQuoRequestT* expectedData = getOptDelBlkAuctQuoRequestT(testCaseNum);
	compareOptDelBlkAuctQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelBlkAuctQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelBlkAuctQuoResponseT *actualData = (optDelBlkAuctQuoResponseT *)msgStruct;
	optDelBlkAuctQuoResponseT* expectedData = getOptDelBlkAuctQuoResponseT(testCaseNum);
	compareOptDelBlkAuctQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
