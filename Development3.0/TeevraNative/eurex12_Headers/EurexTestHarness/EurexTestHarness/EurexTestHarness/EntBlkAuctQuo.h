#include <EntBlkAuctQuo.hxx>
#define BUFFER_SIZE 1000

futEntBlkAuctQuoRequestT *vfutEntBlkAuctQuoRequestT;
futEntBlkAuctQuoResponseT *vfutEntBlkAuctQuoResponseT;
optEntBlkAuctQuoRequestT *voptEntBlkAuctQuoRequestT;
optEntBlkAuctQuoResponseT *voptEntBlkAuctQuoResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntBlkAuctQuoRequestT getFutBscEntBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	futBscEntBlkAuctQuoRequestT vfutBscEntBlkAuctQuoRequestT;
	int i;

	vfutBscEntBlkAuctQuoRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntBlkAuctQuoRequestT");
	vfutBscEntBlkAuctQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntBlkAuctQuoRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntBlkAuctQuoRequestT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.futBscEntBlkAuctQuoRequestT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vfutBscEntBlkAuctQuoRequestT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntBlkAuctQuoRequestT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.futBscEntBlkAuctQuoRequestT.quoExePrcSel", lquoExePrcSel);
	memcpy(vfutBscEntBlkAuctQuoRequestT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntBlkAuctQuoRequestT.blkAuctQuoQtyBuy[i]= ' ';
	}
	char lblkAuctQuoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.futBscEntBlkAuctQuoRequestT.blkAuctQuoQtyBuy", lblkAuctQuoQtyBuy);
	memcpy(vfutBscEntBlkAuctQuoRequestT.blkAuctQuoQtyBuy, lblkAuctQuoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntBlkAuctQuoRequestT.blkAuctQuoQtySel[i]= ' ';
	}
	char lblkAuctQuoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.futBscEntBlkAuctQuoRequestT.blkAuctQuoQtySel", lblkAuctQuoQtySel);
	memcpy(vfutBscEntBlkAuctQuoRequestT.blkAuctQuoQtySel, lblkAuctQuoQtySel, DRIV_VOLUME_LEN);
	return vfutBscEntBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntBlkAuctQuoRequestT getFutExtEntBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	futExtEntBlkAuctQuoRequestT vfutExtEntBlkAuctQuoRequestT;
	int i;

	vfutExtEntBlkAuctQuoRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtEntBlkAuctQuoRequestT");	return vfutExtEntBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntBlkAuctQuoResponseT getFutBscEntBlkAuctQuoResponseT(char* testCaseNum , const char *root) {
	futBscEntBlkAuctQuoResponseT vfutBscEntBlkAuctQuoResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntBlkAuctQuoResponseT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.futBscEntBlkAuctQuoResponseT.ordrNoBuy", lordrNoBuy);
	memcpy(vfutBscEntBlkAuctQuoResponseT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntBlkAuctQuoResponseT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.futBscEntBlkAuctQuoResponseT.ordrNoSel", lordrNoSel);
	memcpy(vfutBscEntBlkAuctQuoResponseT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);
	return vfutBscEntBlkAuctQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntBlkAuctQuoRequestT getOptBscEntBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	optBscEntBlkAuctQuoRequestT voptBscEntBlkAuctQuoRequestT;
	int i;

	voptBscEntBlkAuctQuoRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntBlkAuctQuoRequestT");
	voptBscEntBlkAuctQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscEntBlkAuctQuoRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscEntBlkAuctQuoRequestT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.optBscEntBlkAuctQuoRequestT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(voptBscEntBlkAuctQuoRequestT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscEntBlkAuctQuoRequestT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.optBscEntBlkAuctQuoRequestT.quoExePrcSel", lquoExePrcSel);
	memcpy(voptBscEntBlkAuctQuoRequestT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntBlkAuctQuoRequestT.blkAuctQuoQtyBuy[i]= ' ';
	}
	char lblkAuctQuoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.optBscEntBlkAuctQuoRequestT.blkAuctQuoQtyBuy", lblkAuctQuoQtyBuy);
	memcpy(voptBscEntBlkAuctQuoRequestT.blkAuctQuoQtyBuy, lblkAuctQuoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntBlkAuctQuoRequestT.blkAuctQuoQtySel[i]= ' ';
	}
	char lblkAuctQuoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.optBscEntBlkAuctQuoRequestT.blkAuctQuoQtySel", lblkAuctQuoQtySel);
	memcpy(voptBscEntBlkAuctQuoRequestT.blkAuctQuoQtySel, lblkAuctQuoQtySel, DRIV_VOLUME_LEN);
	return voptBscEntBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntBlkAuctQuoRequestT getOptExtEntBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	optExtEntBlkAuctQuoRequestT voptExtEntBlkAuctQuoRequestT;
	int i;

	voptExtEntBlkAuctQuoRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtEntBlkAuctQuoRequestT");	return voptExtEntBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntBlkAuctQuoResponseT getOptBscEntBlkAuctQuoResponseT(char* testCaseNum , const char *root) {
	optBscEntBlkAuctQuoResponseT voptBscEntBlkAuctQuoResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntBlkAuctQuoResponseT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.optBscEntBlkAuctQuoResponseT.ordrNoBuy", lordrNoBuy);
	memcpy(voptBscEntBlkAuctQuoResponseT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntBlkAuctQuoResponseT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntBlkAuctQuo.optBscEntBlkAuctQuoResponseT.ordrNoSel", lordrNoSel);
	memcpy(voptBscEntBlkAuctQuoResponseT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);
	return voptBscEntBlkAuctQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntBlkAuctQuoRequestT* getFutEntBlkAuctQuoRequestT(char* testCaseNum) {
	vfutEntBlkAuctQuoRequestT = (futEntBlkAuctQuoRequestT*)malloc(sizeof(futEntBlkAuctQuoRequestT));
	int i;

	vfutEntBlkAuctQuoRequestT->header = getDataHeaderT(testCaseNum, "futEntBlkAuctQuoRequestT");
	vfutEntBlkAuctQuoRequestT->basic = getFutBscEntBlkAuctQuoRequestT(testCaseNum, "futEntBlkAuctQuoRequestT");
	vfutEntBlkAuctQuoRequestT->extension = getFutExtEntBlkAuctQuoRequestT(testCaseNum, "futEntBlkAuctQuoRequestT");
	return vfutEntBlkAuctQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntBlkAuctQuoResponseT* getFutEntBlkAuctQuoResponseT(char* testCaseNum) {
	vfutEntBlkAuctQuoResponseT = (futEntBlkAuctQuoResponseT*)malloc(sizeof(futEntBlkAuctQuoResponseT));
	int i;

	vfutEntBlkAuctQuoResponseT->header = getDataHeaderT(testCaseNum, "futEntBlkAuctQuoResponseT");
	vfutEntBlkAuctQuoResponseT->basic = getFutBscEntBlkAuctQuoResponseT(testCaseNum, "futEntBlkAuctQuoResponseT");
	return vfutEntBlkAuctQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntBlkAuctQuoRequestT* getOptEntBlkAuctQuoRequestT(char* testCaseNum) {
	voptEntBlkAuctQuoRequestT = (optEntBlkAuctQuoRequestT*)malloc(sizeof(optEntBlkAuctQuoRequestT));
	int i;

	voptEntBlkAuctQuoRequestT->header = getDataHeaderT(testCaseNum, "optEntBlkAuctQuoRequestT");
	voptEntBlkAuctQuoRequestT->basic = getOptBscEntBlkAuctQuoRequestT(testCaseNum, "optEntBlkAuctQuoRequestT");
	voptEntBlkAuctQuoRequestT->extension = getOptExtEntBlkAuctQuoRequestT(testCaseNum, "optEntBlkAuctQuoRequestT");
	return voptEntBlkAuctQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntBlkAuctQuoResponseT* getOptEntBlkAuctQuoResponseT(char* testCaseNum) {
	voptEntBlkAuctQuoResponseT = (optEntBlkAuctQuoResponseT*)malloc(sizeof(optEntBlkAuctQuoResponseT));
	int i;

	voptEntBlkAuctQuoResponseT->header = getDataHeaderT(testCaseNum, "optEntBlkAuctQuoResponseT");
	voptEntBlkAuctQuoResponseT->basic = getOptBscEntBlkAuctQuoResponseT(testCaseNum, "optEntBlkAuctQuoResponseT");
	return voptEntBlkAuctQuoResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntBlkAuctQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntBlkAuctQuoRequestT));
	futEntBlkAuctQuoRequestT *vfutEntBlkAuctQuoRequestT = getFutEntBlkAuctQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntBlkAuctQuoRequestT), (jbyte*) vfutEntBlkAuctQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntBlkAuctQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntBlkAuctQuoResponseT));
	futEntBlkAuctQuoResponseT *vfutEntBlkAuctQuoResponseT = getFutEntBlkAuctQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntBlkAuctQuoResponseT), (jbyte*) vfutEntBlkAuctQuoResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntBlkAuctQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntBlkAuctQuoRequestT));
	optEntBlkAuctQuoRequestT *voptEntBlkAuctQuoRequestT = getOptEntBlkAuctQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntBlkAuctQuoRequestT), (jbyte*) voptEntBlkAuctQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntBlkAuctQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntBlkAuctQuoResponseT));
	optEntBlkAuctQuoResponseT *voptEntBlkAuctQuoResponseT = getOptEntBlkAuctQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntBlkAuctQuoResponseT), (jbyte*) voptEntBlkAuctQuoResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntBlkAuctQuoRequestT(futBscEntBlkAuctQuoRequestT actual, futBscEntBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctQuoRequestT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctQuoRequestT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctQuoRequestT, blkAuctQuoQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctQuoRequestT, blkAuctQuoQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntBlkAuctQuoRequestT(futExtEntBlkAuctQuoRequestT actual, futExtEntBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntBlkAuctQuoResponseT(futBscEntBlkAuctQuoResponseT actual, futBscEntBlkAuctQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctQuoResponseT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctQuoResponseT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntBlkAuctQuoRequestT(optBscEntBlkAuctQuoRequestT actual, optBscEntBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctQuoRequestT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctQuoRequestT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctQuoRequestT, blkAuctQuoQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctQuoRequestT, blkAuctQuoQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntBlkAuctQuoRequestT(optExtEntBlkAuctQuoRequestT actual, optExtEntBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntBlkAuctQuoResponseT(optBscEntBlkAuctQuoResponseT actual, optBscEntBlkAuctQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctQuoResponseT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctQuoResponseT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntBlkAuctQuoRequestT(futEntBlkAuctQuoRequestT actual, futEntBlkAuctQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntBlkAuctQuoRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntBlkAuctQuoRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntBlkAuctQuoResponseT(futEntBlkAuctQuoResponseT actual, futEntBlkAuctQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntBlkAuctQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntBlkAuctQuoRequestT(optEntBlkAuctQuoRequestT actual, optEntBlkAuctQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntBlkAuctQuoRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntBlkAuctQuoRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntBlkAuctQuoResponseT(optEntBlkAuctQuoResponseT actual, optEntBlkAuctQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntBlkAuctQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntBlkAuctQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntBlkAuctQuoRequestT *actualData = (futEntBlkAuctQuoRequestT *)msgStruct;
	futEntBlkAuctQuoRequestT* expectedData = getFutEntBlkAuctQuoRequestT(testCaseNum);
	compareFutEntBlkAuctQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntBlkAuctQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntBlkAuctQuoResponseT *actualData = (futEntBlkAuctQuoResponseT *)msgStruct;
	futEntBlkAuctQuoResponseT* expectedData = getFutEntBlkAuctQuoResponseT(testCaseNum);
	compareFutEntBlkAuctQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntBlkAuctQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntBlkAuctQuoRequestT *actualData = (optEntBlkAuctQuoRequestT *)msgStruct;
	optEntBlkAuctQuoRequestT* expectedData = getOptEntBlkAuctQuoRequestT(testCaseNum);
	compareOptEntBlkAuctQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntBlkAuctQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntBlkAuctQuoResponseT *actualData = (optEntBlkAuctQuoResponseT *)msgStruct;
	optEntBlkAuctQuoResponseT* expectedData = getOptEntBlkAuctQuoResponseT(testCaseNum);
	compareOptEntBlkAuctQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
