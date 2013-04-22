#include <EntBlkAuctReq.hxx>
#define BUFFER_SIZE 1000

futEntBlkAuctReqRequestT *vfutEntBlkAuctReqRequestT;
futEntBlkAuctReqResponseT *vfutEntBlkAuctReqResponseT;
optEntBlkAuctReqRequestT *voptEntBlkAuctReqRequestT;
optEntBlkAuctReqResponseT *voptEntBlkAuctReqResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntBlkAuctReqRequestT getFutBscEntBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	futBscEntBlkAuctReqRequestT vfutBscEntBlkAuctReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntBlkAuctReq.futBscEntBlkAuctReqRequestT.buyCod", lbuyCod);
	vfutBscEntBlkAuctReqRequestT.buyCod = lbuyCod[0];

	vfutBscEntBlkAuctReqRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntBlkAuctReqRequestT");
	vfutBscEntBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntBlkAuctReqRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntBlkAuctReqRequestT.blkAuctQty[i]= ' ';
	}
	char lblkAuctQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntBlkAuctReq.futBscEntBlkAuctReqRequestT.blkAuctQty", lblkAuctQty);
	memcpy(vfutBscEntBlkAuctReqRequestT.blkAuctQty, lblkAuctQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntBlkAuctReqRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntBlkAuctReq.futBscEntBlkAuctReqRequestT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscEntBlkAuctReqRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntBlkAuctReq.futBscEntBlkAuctReqRequestT.opnClsCod", lopnClsCod);
	vfutBscEntBlkAuctReqRequestT.opnClsCod = lopnClsCod[0];
	return vfutBscEntBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntBlkAuctReqRequestT getFutExtEntBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	futExtEntBlkAuctReqRequestT vfutExtEntBlkAuctReqRequestT;
	int i;

	vfutExtEntBlkAuctReqRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtEntBlkAuctReqRequestT");
	vfutExtEntBlkAuctReqRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtEntBlkAuctReqRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtEntBlkAuctReqRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntBlkAuctReq.futExtEntBlkAuctReqRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtEntBlkAuctReqRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutExtEntBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntBlkAuctReqResponseT getFutBscEntBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	futBscEntBlkAuctReqResponseT vfutBscEntBlkAuctReqResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntBlkAuctReqResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntBlkAuctReq.futBscEntBlkAuctReqResponseT.ordrNo", lordrNo);
	memcpy(vfutBscEntBlkAuctReqResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscEntBlkAuctReqResponseT.blkAuctStrtTim[i]= ' ';
	}
	char lblkAuctStrtTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntBlkAuctReq.futBscEntBlkAuctReqResponseT.blkAuctStrtTim", lblkAuctStrtTim);
	memcpy(vfutBscEntBlkAuctReqResponseT.blkAuctStrtTim, lblkAuctStrtTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntBlkAuctReqResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntBlkAuctReq.futBscEntBlkAuctReqResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntBlkAuctReqResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntBlkAuctReqResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntBlkAuctReqRequestT getOptBscEntBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	optBscEntBlkAuctReqRequestT voptBscEntBlkAuctReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntBlkAuctReq.optBscEntBlkAuctReqRequestT.buyCod", lbuyCod);
	voptBscEntBlkAuctReqRequestT.buyCod = lbuyCod[0];

	voptBscEntBlkAuctReqRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntBlkAuctReqRequestT");
	voptBscEntBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscEntBlkAuctReqRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntBlkAuctReqRequestT.blkAuctQty[i]= ' ';
	}
	char lblkAuctQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntBlkAuctReq.optBscEntBlkAuctReqRequestT.blkAuctQty", lblkAuctQty);
	memcpy(voptBscEntBlkAuctReqRequestT.blkAuctQty, lblkAuctQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscEntBlkAuctReqRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntBlkAuctReq.optBscEntBlkAuctReqRequestT.ordrExePrc", lordrExePrc);
	memcpy(voptBscEntBlkAuctReqRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntBlkAuctReq.optBscEntBlkAuctReqRequestT.opnClsCod", lopnClsCod);
	voptBscEntBlkAuctReqRequestT.opnClsCod = lopnClsCod[0];
	return voptBscEntBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntBlkAuctReqRequestT getOptExtEntBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	optExtEntBlkAuctReqRequestT voptExtEntBlkAuctReqRequestT;
	int i;

	voptExtEntBlkAuctReqRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtEntBlkAuctReqRequestT");
	voptExtEntBlkAuctReqRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtEntBlkAuctReqRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptExtEntBlkAuctReqRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntBlkAuctReq.optExtEntBlkAuctReqRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptExtEntBlkAuctReqRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return voptExtEntBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntBlkAuctReqResponseT getOptBscEntBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	optBscEntBlkAuctReqResponseT voptBscEntBlkAuctReqResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntBlkAuctReqResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntBlkAuctReq.optBscEntBlkAuctReqResponseT.ordrNo", lordrNo);
	memcpy(voptBscEntBlkAuctReqResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscEntBlkAuctReqResponseT.blkAuctStrtTim[i]= ' ';
	}
	char lblkAuctStrtTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntBlkAuctReq.optBscEntBlkAuctReqResponseT.blkAuctStrtTim", lblkAuctStrtTim);
	memcpy(voptBscEntBlkAuctReqResponseT.blkAuctStrtTim, lblkAuctStrtTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntBlkAuctReqResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntBlkAuctReq.optBscEntBlkAuctReqResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntBlkAuctReqResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscEntBlkAuctReqResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntBlkAuctReqRequestT* getFutEntBlkAuctReqRequestT(char* testCaseNum) {
	vfutEntBlkAuctReqRequestT = (futEntBlkAuctReqRequestT*)malloc(sizeof(futEntBlkAuctReqRequestT));
	int i;

	vfutEntBlkAuctReqRequestT->header = getDataHeaderT(testCaseNum, "futEntBlkAuctReqRequestT");
	vfutEntBlkAuctReqRequestT->basic = getFutBscEntBlkAuctReqRequestT(testCaseNum, "futEntBlkAuctReqRequestT");
	vfutEntBlkAuctReqRequestT->extension = getFutExtEntBlkAuctReqRequestT(testCaseNum, "futEntBlkAuctReqRequestT");
	return vfutEntBlkAuctReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntBlkAuctReqResponseT* getFutEntBlkAuctReqResponseT(char* testCaseNum) {
	vfutEntBlkAuctReqResponseT = (futEntBlkAuctReqResponseT*)malloc(sizeof(futEntBlkAuctReqResponseT));
	int i;

	vfutEntBlkAuctReqResponseT->header = getDataHeaderT(testCaseNum, "futEntBlkAuctReqResponseT");
	vfutEntBlkAuctReqResponseT->basic = getFutBscEntBlkAuctReqResponseT(testCaseNum, "futEntBlkAuctReqResponseT");
	return vfutEntBlkAuctReqResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntBlkAuctReqRequestT* getOptEntBlkAuctReqRequestT(char* testCaseNum) {
	voptEntBlkAuctReqRequestT = (optEntBlkAuctReqRequestT*)malloc(sizeof(optEntBlkAuctReqRequestT));
	int i;

	voptEntBlkAuctReqRequestT->header = getDataHeaderT(testCaseNum, "optEntBlkAuctReqRequestT");
	voptEntBlkAuctReqRequestT->basic = getOptBscEntBlkAuctReqRequestT(testCaseNum, "optEntBlkAuctReqRequestT");
	voptEntBlkAuctReqRequestT->extension = getOptExtEntBlkAuctReqRequestT(testCaseNum, "optEntBlkAuctReqRequestT");
	return voptEntBlkAuctReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntBlkAuctReqResponseT* getOptEntBlkAuctReqResponseT(char* testCaseNum) {
	voptEntBlkAuctReqResponseT = (optEntBlkAuctReqResponseT*)malloc(sizeof(optEntBlkAuctReqResponseT));
	int i;

	voptEntBlkAuctReqResponseT->header = getDataHeaderT(testCaseNum, "optEntBlkAuctReqResponseT");
	voptEntBlkAuctReqResponseT->basic = getOptBscEntBlkAuctReqResponseT(testCaseNum, "optEntBlkAuctReqResponseT");
	return voptEntBlkAuctReqResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntBlkAuctReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntBlkAuctReqRequestT));
	futEntBlkAuctReqRequestT *vfutEntBlkAuctReqRequestT = getFutEntBlkAuctReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntBlkAuctReqRequestT), (jbyte*) vfutEntBlkAuctReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntBlkAuctReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntBlkAuctReqResponseT));
	futEntBlkAuctReqResponseT *vfutEntBlkAuctReqResponseT = getFutEntBlkAuctReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntBlkAuctReqResponseT), (jbyte*) vfutEntBlkAuctReqResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntBlkAuctReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntBlkAuctReqRequestT));
	optEntBlkAuctReqRequestT *voptEntBlkAuctReqRequestT = getOptEntBlkAuctReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntBlkAuctReqRequestT), (jbyte*) voptEntBlkAuctReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntBlkAuctReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntBlkAuctReqResponseT));
	optEntBlkAuctReqResponseT *voptEntBlkAuctReqResponseT = getOptEntBlkAuctReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntBlkAuctReqResponseT), (jbyte*) voptEntBlkAuctReqResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntBlkAuctReqRequestT(futBscEntBlkAuctReqRequestT actual, futBscEntBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.blkAuctQty, expected.blkAuctQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctReqRequestT, blkAuctQty not matching. Actual %s but Expected %s", actual.blkAuctQty, expected.blkAuctQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctReqRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctReqRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntBlkAuctReqRequestT(futExtEntBlkAuctReqRequestT actual, futExtEntBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntBlkAuctReqRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntBlkAuctReqResponseT(futBscEntBlkAuctReqResponseT actual, futBscEntBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctReqResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctStrtTim, expected.blkAuctStrtTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctReqResponseT, blkAuctStrtTim not matching. Actual %s but Expected %s", actual.blkAuctStrtTim, expected.blkAuctStrtTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkAuctReqResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntBlkAuctReqRequestT(optBscEntBlkAuctReqRequestT actual, optBscEntBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.blkAuctQty, expected.blkAuctQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctReqRequestT, blkAuctQty not matching. Actual %s but Expected %s", actual.blkAuctQty, expected.blkAuctQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctReqRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctReqRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntBlkAuctReqRequestT(optExtEntBlkAuctReqRequestT actual, optExtEntBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntBlkAuctReqRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntBlkAuctReqResponseT(optBscEntBlkAuctReqResponseT actual, optBscEntBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctReqResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctStrtTim, expected.blkAuctStrtTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctReqResponseT, blkAuctStrtTim not matching. Actual %s but Expected %s", actual.blkAuctStrtTim, expected.blkAuctStrtTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkAuctReqResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntBlkAuctReqRequestT(futEntBlkAuctReqRequestT actual, futEntBlkAuctReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntBlkAuctReqRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntBlkAuctReqResponseT(futEntBlkAuctReqResponseT actual, futEntBlkAuctReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntBlkAuctReqResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntBlkAuctReqRequestT(optEntBlkAuctReqRequestT actual, optEntBlkAuctReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntBlkAuctReqRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntBlkAuctReqResponseT(optEntBlkAuctReqResponseT actual, optEntBlkAuctReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntBlkAuctReqResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntBlkAuctReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntBlkAuctReqRequestT *actualData = (futEntBlkAuctReqRequestT *)msgStruct;
	futEntBlkAuctReqRequestT* expectedData = getFutEntBlkAuctReqRequestT(testCaseNum);
	compareFutEntBlkAuctReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntBlkAuctReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntBlkAuctReqResponseT *actualData = (futEntBlkAuctReqResponseT *)msgStruct;
	futEntBlkAuctReqResponseT* expectedData = getFutEntBlkAuctReqResponseT(testCaseNum);
	compareFutEntBlkAuctReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntBlkAuctReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntBlkAuctReqRequestT *actualData = (optEntBlkAuctReqRequestT *)msgStruct;
	optEntBlkAuctReqRequestT* expectedData = getOptEntBlkAuctReqRequestT(testCaseNum);
	compareOptEntBlkAuctReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntBlkAuctReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntBlkAuctReqResponseT *actualData = (optEntBlkAuctReqResponseT *)msgStruct;
	optEntBlkAuctReqResponseT* expectedData = getOptEntBlkAuctReqResponseT(testCaseNum);
	compareOptEntBlkAuctReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
