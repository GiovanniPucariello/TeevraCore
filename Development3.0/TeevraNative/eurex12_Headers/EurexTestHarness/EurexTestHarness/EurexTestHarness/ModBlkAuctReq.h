#include <ModBlkAuctReq.hxx>
#define BUFFER_SIZE 1000

futModBlkAuctReqRequestT *vfutModBlkAuctReqRequestT;
futModBlkAuctReqResponseT *vfutModBlkAuctReqResponseT;
optModBlkAuctReqRequestT *voptModBlkAuctReqRequestT;
optModBlkAuctReqResponseT *voptModBlkAuctReqResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModBlkAuctReqRequestT getFutBscModBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	futBscModBlkAuctReqRequestT vfutBscModBlkAuctReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModBlkAuctReq.futBscModBlkAuctReqRequestT.buyCod", lbuyCod);
	vfutBscModBlkAuctReqRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscModBlkAuctReqRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModBlkAuctReq.futBscModBlkAuctReqRequestT.ordrNo", lordrNo);
	memcpy(vfutBscModBlkAuctReqRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	vfutBscModBlkAuctReqRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModBlkAuctReqRequestT");
	vfutBscModBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscModBlkAuctReqRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModBlkAuctReqRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModBlkAuctReq.futBscModBlkAuctReqRequestT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscModBlkAuctReqRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModBlkAuctReq.futBscModBlkAuctReqRequestT.opnClsCod", lopnClsCod);
	vfutBscModBlkAuctReqRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModBlkAuctReqRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModBlkAuctReq.futBscModBlkAuctReqRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModBlkAuctReqRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtModBlkAuctReqRequestT getFutExtModBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	futExtModBlkAuctReqRequestT vfutExtModBlkAuctReqRequestT;
	int i;

	vfutExtModBlkAuctReqRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtModBlkAuctReqRequestT");
	vfutExtModBlkAuctReqRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtModBlkAuctReqRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtModBlkAuctReqRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModBlkAuctReq.futExtModBlkAuctReqRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtModBlkAuctReqRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutExtModBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModBlkAuctReqResponseT getFutBscModBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	futBscModBlkAuctReqResponseT vfutBscModBlkAuctReqResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscModBlkAuctReqResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModBlkAuctReq.futBscModBlkAuctReqResponseT.ordrNo", lordrNo);
	memcpy(vfutBscModBlkAuctReqResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModBlkAuctReqResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModBlkAuctReq.futBscModBlkAuctReqResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModBlkAuctReqResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModBlkAuctReqResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModBlkAuctReqRequestT getOptBscModBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	optBscModBlkAuctReqRequestT voptBscModBlkAuctReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModBlkAuctReq.optBscModBlkAuctReqRequestT.buyCod", lbuyCod);
	voptBscModBlkAuctReqRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscModBlkAuctReqRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModBlkAuctReq.optBscModBlkAuctReqRequestT.ordrNo", lordrNo);
	memcpy(voptBscModBlkAuctReqRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	voptBscModBlkAuctReqRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscModBlkAuctReqRequestT");
	voptBscModBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscModBlkAuctReqRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscModBlkAuctReqRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModBlkAuctReq.optBscModBlkAuctReqRequestT.ordrExePrc", lordrExePrc);
	memcpy(voptBscModBlkAuctReqRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModBlkAuctReq.optBscModBlkAuctReqRequestT.opnClsCod", lopnClsCod);
	voptBscModBlkAuctReqRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModBlkAuctReqRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModBlkAuctReq.optBscModBlkAuctReqRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModBlkAuctReqRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscModBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtModBlkAuctReqRequestT getOptExtModBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	optExtModBlkAuctReqRequestT voptExtModBlkAuctReqRequestT;
	int i;

	voptExtModBlkAuctReqRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtModBlkAuctReqRequestT");
	voptExtModBlkAuctReqRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtModBlkAuctReqRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptExtModBlkAuctReqRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModBlkAuctReq.optExtModBlkAuctReqRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptExtModBlkAuctReqRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return voptExtModBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModBlkAuctReqResponseT getOptBscModBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	optBscModBlkAuctReqResponseT voptBscModBlkAuctReqResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscModBlkAuctReqResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModBlkAuctReq.optBscModBlkAuctReqResponseT.ordrNo", lordrNo);
	memcpy(voptBscModBlkAuctReqResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModBlkAuctReqResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModBlkAuctReq.optBscModBlkAuctReqResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModBlkAuctReqResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscModBlkAuctReqResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModBlkAuctReqRequestT* getFutModBlkAuctReqRequestT(char* testCaseNum) {
	vfutModBlkAuctReqRequestT = (futModBlkAuctReqRequestT*)malloc(sizeof(futModBlkAuctReqRequestT));
	int i;

	vfutModBlkAuctReqRequestT->header = getDataHeaderT(testCaseNum, "futModBlkAuctReqRequestT");
	vfutModBlkAuctReqRequestT->basic = getFutBscModBlkAuctReqRequestT(testCaseNum, "futModBlkAuctReqRequestT");
	vfutModBlkAuctReqRequestT->extension = getFutExtModBlkAuctReqRequestT(testCaseNum, "futModBlkAuctReqRequestT");
	return vfutModBlkAuctReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModBlkAuctReqResponseT* getFutModBlkAuctReqResponseT(char* testCaseNum) {
	vfutModBlkAuctReqResponseT = (futModBlkAuctReqResponseT*)malloc(sizeof(futModBlkAuctReqResponseT));
	int i;

	vfutModBlkAuctReqResponseT->header = getDataHeaderT(testCaseNum, "futModBlkAuctReqResponseT");
	vfutModBlkAuctReqResponseT->basic = getFutBscModBlkAuctReqResponseT(testCaseNum, "futModBlkAuctReqResponseT");
	return vfutModBlkAuctReqResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModBlkAuctReqRequestT* getOptModBlkAuctReqRequestT(char* testCaseNum) {
	voptModBlkAuctReqRequestT = (optModBlkAuctReqRequestT*)malloc(sizeof(optModBlkAuctReqRequestT));
	int i;

	voptModBlkAuctReqRequestT->header = getDataHeaderT(testCaseNum, "optModBlkAuctReqRequestT");
	voptModBlkAuctReqRequestT->basic = getOptBscModBlkAuctReqRequestT(testCaseNum, "optModBlkAuctReqRequestT");
	voptModBlkAuctReqRequestT->extension = getOptExtModBlkAuctReqRequestT(testCaseNum, "optModBlkAuctReqRequestT");
	return voptModBlkAuctReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModBlkAuctReqResponseT* getOptModBlkAuctReqResponseT(char* testCaseNum) {
	voptModBlkAuctReqResponseT = (optModBlkAuctReqResponseT*)malloc(sizeof(optModBlkAuctReqResponseT));
	int i;

	voptModBlkAuctReqResponseT->header = getDataHeaderT(testCaseNum, "optModBlkAuctReqResponseT");
	voptModBlkAuctReqResponseT->basic = getOptBscModBlkAuctReqResponseT(testCaseNum, "optModBlkAuctReqResponseT");
	return voptModBlkAuctReqResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModBlkAuctReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModBlkAuctReqRequestT));
	futModBlkAuctReqRequestT *vfutModBlkAuctReqRequestT = getFutModBlkAuctReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModBlkAuctReqRequestT), (jbyte*) vfutModBlkAuctReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModBlkAuctReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModBlkAuctReqResponseT));
	futModBlkAuctReqResponseT *vfutModBlkAuctReqResponseT = getFutModBlkAuctReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModBlkAuctReqResponseT), (jbyte*) vfutModBlkAuctReqResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModBlkAuctReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModBlkAuctReqRequestT));
	optModBlkAuctReqRequestT *voptModBlkAuctReqRequestT = getOptModBlkAuctReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModBlkAuctReqRequestT), (jbyte*) voptModBlkAuctReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModBlkAuctReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModBlkAuctReqResponseT));
	optModBlkAuctReqResponseT *voptModBlkAuctReqResponseT = getOptModBlkAuctReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModBlkAuctReqResponseT), (jbyte*) voptModBlkAuctReqResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModBlkAuctReqRequestT(futBscModBlkAuctReqRequestT actual, futBscModBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkAuctReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkAuctReqRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkAuctReqRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkAuctReqRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkAuctReqRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtModBlkAuctReqRequestT(futExtModBlkAuctReqRequestT actual, futExtModBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModBlkAuctReqRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModBlkAuctReqResponseT(futBscModBlkAuctReqResponseT actual, futBscModBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkAuctReqResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkAuctReqResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModBlkAuctReqRequestT(optBscModBlkAuctReqRequestT actual, optBscModBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkAuctReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkAuctReqRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkAuctReqRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkAuctReqRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkAuctReqRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtModBlkAuctReqRequestT(optExtModBlkAuctReqRequestT actual, optExtModBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModBlkAuctReqRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModBlkAuctReqResponseT(optBscModBlkAuctReqResponseT actual, optBscModBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkAuctReqResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkAuctReqResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModBlkAuctReqRequestT(futModBlkAuctReqRequestT actual, futModBlkAuctReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);	compareFutExtModBlkAuctReqRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModBlkAuctReqResponseT(futModBlkAuctReqResponseT actual, futModBlkAuctReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModBlkAuctReqResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModBlkAuctReqRequestT(optModBlkAuctReqRequestT actual, optModBlkAuctReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);	compareOptExtModBlkAuctReqRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModBlkAuctReqResponseT(optModBlkAuctReqResponseT actual, optModBlkAuctReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModBlkAuctReqResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModBlkAuctReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModBlkAuctReqRequestT *actualData = (futModBlkAuctReqRequestT *)msgStruct;
	futModBlkAuctReqRequestT* expectedData = getFutModBlkAuctReqRequestT(testCaseNum);
	compareFutModBlkAuctReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModBlkAuctReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModBlkAuctReqResponseT *actualData = (futModBlkAuctReqResponseT *)msgStruct;
	futModBlkAuctReqResponseT* expectedData = getFutModBlkAuctReqResponseT(testCaseNum);
	compareFutModBlkAuctReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModBlkAuctReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModBlkAuctReqRequestT *actualData = (optModBlkAuctReqRequestT *)msgStruct;
	optModBlkAuctReqRequestT* expectedData = getOptModBlkAuctReqRequestT(testCaseNum);
	compareOptModBlkAuctReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModBlkAuctReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModBlkAuctReqResponseT *actualData = (optModBlkAuctReqResponseT *)msgStruct;
	optModBlkAuctReqResponseT* expectedData = getOptModBlkAuctReqResponseT(testCaseNum);
	compareOptModBlkAuctReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
