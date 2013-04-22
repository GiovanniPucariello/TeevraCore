#include <AcptBlkAuctReq.hxx>
#define BUFFER_SIZE 1000

futAcptBlkAuctReqRequestT *vfutAcptBlkAuctReqRequestT;
futAcptBlkAuctReqResponseT *vfutAcptBlkAuctReqResponseT;
optAcptBlkAuctReqRequestT *voptAcptBlkAuctReqRequestT;
optAcptBlkAuctReqResponseT *voptAcptBlkAuctReqResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAcptBlkAuctReqRequestT getFutBscAcptBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	futBscAcptBlkAuctReqRequestT vfutBscAcptBlkAuctReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqRequestT.buyCod", lbuyCod);
	vfutBscAcptBlkAuctReqRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscAcptBlkAuctReqRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqRequestT.ordrNo", lordrNo);
	memcpy(vfutBscAcptBlkAuctReqRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	vfutBscAcptBlkAuctReqRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscAcptBlkAuctReqRequestT");
	vfutBscAcptBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscAcptBlkAuctReqRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscAcptBlkAuctReqRequestT.acptExeQty[i]= ' ';
	}
	char lacptExeQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqRequestT.acptExeQty", lacptExeQty);
	memcpy(vfutBscAcptBlkAuctReqRequestT.acptExeQty, lacptExeQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscAcptBlkAuctReqRequestT.blkAuctOrdrExeQty[i]= ' ';
	}
	char lblkAuctOrdrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqRequestT.blkAuctOrdrExeQty", lblkAuctOrdrExeQty);
	memcpy(vfutBscAcptBlkAuctReqRequestT.blkAuctOrdrExeQty, lblkAuctOrdrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscAcptBlkAuctReqRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqRequestT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscAcptBlkAuctReqRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAcptBlkAuctReqRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAcptBlkAuctReqRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAcptBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAcptBlkAuctReqResponseT getFutBscAcptBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	futBscAcptBlkAuctReqResponseT vfutBscAcptBlkAuctReqResponseT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscAcptBlkAuctReqResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqResponseT.trdNo", ltrdNo);
	memcpy(vfutBscAcptBlkAuctReqResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscAcptBlkAuctReqResponseT.blkAuctOrdrExeQty[i]= ' ';
	}
	char lblkAuctOrdrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqResponseT.blkAuctOrdrExeQty", lblkAuctOrdrExeQty);
	memcpy(vfutBscAcptBlkAuctReqResponseT.blkAuctOrdrExeQty, lblkAuctOrdrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscAcptBlkAuctReqResponseT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqResponseT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscAcptBlkAuctReqResponseT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscAcptBlkAuctReqResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqResponseT.ordrNo", lordrNo);
	memcpy(vfutBscAcptBlkAuctReqResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAcptBlkAuctReqResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.futBscAcptBlkAuctReqResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAcptBlkAuctReqResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAcptBlkAuctReqResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscAcptBlkAuctReqRequestT getOptBscAcptBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	optBscAcptBlkAuctReqRequestT voptBscAcptBlkAuctReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqRequestT.buyCod", lbuyCod);
	voptBscAcptBlkAuctReqRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscAcptBlkAuctReqRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqRequestT.ordrNo", lordrNo);
	memcpy(voptBscAcptBlkAuctReqRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	voptBscAcptBlkAuctReqRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscAcptBlkAuctReqRequestT");
	voptBscAcptBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscAcptBlkAuctReqRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscAcptBlkAuctReqRequestT.acptExeQty[i]= ' ';
	}
	char lacptExeQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqRequestT.acptExeQty", lacptExeQty);
	memcpy(voptBscAcptBlkAuctReqRequestT.acptExeQty, lacptExeQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscAcptBlkAuctReqRequestT.blkAuctOrdrExeQty[i]= ' ';
	}
	char lblkAuctOrdrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqRequestT.blkAuctOrdrExeQty", lblkAuctOrdrExeQty);
	memcpy(voptBscAcptBlkAuctReqRequestT.blkAuctOrdrExeQty, lblkAuctOrdrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscAcptBlkAuctReqRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqRequestT.ordrExePrc", lordrExePrc);
	memcpy(voptBscAcptBlkAuctReqRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscAcptBlkAuctReqRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscAcptBlkAuctReqRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscAcptBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscAcptBlkAuctReqResponseT getOptBscAcptBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	optBscAcptBlkAuctReqResponseT voptBscAcptBlkAuctReqResponseT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		voptBscAcptBlkAuctReqResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqResponseT.trdNo", ltrdNo);
	memcpy(voptBscAcptBlkAuctReqResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscAcptBlkAuctReqResponseT.blkAuctOrdrExeQty[i]= ' ';
	}
	char lblkAuctOrdrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqResponseT.blkAuctOrdrExeQty", lblkAuctOrdrExeQty);
	memcpy(voptBscAcptBlkAuctReqResponseT.blkAuctOrdrExeQty, lblkAuctOrdrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscAcptBlkAuctReqResponseT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqResponseT.ordrExePrc", lordrExePrc);
	memcpy(voptBscAcptBlkAuctReqResponseT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscAcptBlkAuctReqResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqResponseT.ordrNo", lordrNo);
	memcpy(voptBscAcptBlkAuctReqResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscAcptBlkAuctReqResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptBlkAuctReq.optBscAcptBlkAuctReqResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscAcptBlkAuctReqResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscAcptBlkAuctReqResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAcptBlkAuctReqRequestT* getFutAcptBlkAuctReqRequestT(char* testCaseNum) {
	vfutAcptBlkAuctReqRequestT = (futAcptBlkAuctReqRequestT*)malloc(sizeof(futAcptBlkAuctReqRequestT));
	int i;

	vfutAcptBlkAuctReqRequestT->header = getDataHeaderT(testCaseNum, "futAcptBlkAuctReqRequestT");
	vfutAcptBlkAuctReqRequestT->basic = getFutBscAcptBlkAuctReqRequestT(testCaseNum, "futAcptBlkAuctReqRequestT");
	return vfutAcptBlkAuctReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAcptBlkAuctReqResponseT* getFutAcptBlkAuctReqResponseT(char* testCaseNum) {
	vfutAcptBlkAuctReqResponseT = (futAcptBlkAuctReqResponseT*)malloc(sizeof(futAcptBlkAuctReqResponseT));
	int i;

	vfutAcptBlkAuctReqResponseT->header = getDataHeaderT(testCaseNum, "futAcptBlkAuctReqResponseT");
	vfutAcptBlkAuctReqResponseT->basic = getFutBscAcptBlkAuctReqResponseT(testCaseNum, "futAcptBlkAuctReqResponseT");
	return vfutAcptBlkAuctReqResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAcptBlkAuctReqRequestT* getOptAcptBlkAuctReqRequestT(char* testCaseNum) {
	voptAcptBlkAuctReqRequestT = (optAcptBlkAuctReqRequestT*)malloc(sizeof(optAcptBlkAuctReqRequestT));
	int i;

	voptAcptBlkAuctReqRequestT->header = getDataHeaderT(testCaseNum, "optAcptBlkAuctReqRequestT");
	voptAcptBlkAuctReqRequestT->basic = getOptBscAcptBlkAuctReqRequestT(testCaseNum, "optAcptBlkAuctReqRequestT");
	return voptAcptBlkAuctReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAcptBlkAuctReqResponseT* getOptAcptBlkAuctReqResponseT(char* testCaseNum) {
	voptAcptBlkAuctReqResponseT = (optAcptBlkAuctReqResponseT*)malloc(sizeof(optAcptBlkAuctReqResponseT));
	int i;

	voptAcptBlkAuctReqResponseT->header = getDataHeaderT(testCaseNum, "optAcptBlkAuctReqResponseT");
	voptAcptBlkAuctReqResponseT->basic = getOptBscAcptBlkAuctReqResponseT(testCaseNum, "optAcptBlkAuctReqResponseT");
	return voptAcptBlkAuctReqResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAcptBlkAuctReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAcptBlkAuctReqRequestT));
	futAcptBlkAuctReqRequestT *vfutAcptBlkAuctReqRequestT = getFutAcptBlkAuctReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAcptBlkAuctReqRequestT), (jbyte*) vfutAcptBlkAuctReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAcptBlkAuctReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAcptBlkAuctReqResponseT));
	futAcptBlkAuctReqResponseT *vfutAcptBlkAuctReqResponseT = getFutAcptBlkAuctReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAcptBlkAuctReqResponseT), (jbyte*) vfutAcptBlkAuctReqResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAcptBlkAuctReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAcptBlkAuctReqRequestT));
	optAcptBlkAuctReqRequestT *voptAcptBlkAuctReqRequestT = getOptAcptBlkAuctReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAcptBlkAuctReqRequestT), (jbyte*) voptAcptBlkAuctReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAcptBlkAuctReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAcptBlkAuctReqResponseT));
	optAcptBlkAuctReqResponseT *voptAcptBlkAuctReqResponseT = getOptAcptBlkAuctReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAcptBlkAuctReqResponseT), (jbyte*) voptAcptBlkAuctReqResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAcptBlkAuctReqRequestT(futBscAcptBlkAuctReqRequestT actual, futBscAcptBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.acptExeQty, expected.acptExeQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqRequestT, acptExeQty not matching. Actual %s but Expected %s", actual.acptExeQty, expected.acptExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqRequestT, blkAuctOrdrExeQty not matching. Actual %s but Expected %s", actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAcptBlkAuctReqResponseT(futBscAcptBlkAuctReqResponseT actual, futBscAcptBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqResponseT, blkAuctOrdrExeQty not matching. Actual %s but Expected %s", actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqResponseT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptBlkAuctReqResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscAcptBlkAuctReqRequestT(optBscAcptBlkAuctReqRequestT actual, optBscAcptBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.acptExeQty, expected.acptExeQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqRequestT, acptExeQty not matching. Actual %s but Expected %s", actual.acptExeQty, expected.acptExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqRequestT, blkAuctOrdrExeQty not matching. Actual %s but Expected %s", actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscAcptBlkAuctReqResponseT(optBscAcptBlkAuctReqResponseT actual, optBscAcptBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqResponseT, blkAuctOrdrExeQty not matching. Actual %s but Expected %s", actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqResponseT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptBlkAuctReqResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAcptBlkAuctReqRequestT(futAcptBlkAuctReqRequestT actual, futAcptBlkAuctReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAcptBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAcptBlkAuctReqResponseT(futAcptBlkAuctReqResponseT actual, futAcptBlkAuctReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAcptBlkAuctReqResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptAcptBlkAuctReqRequestT(optAcptBlkAuctReqRequestT actual, optAcptBlkAuctReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscAcptBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptAcptBlkAuctReqResponseT(optAcptBlkAuctReqResponseT actual, optAcptBlkAuctReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscAcptBlkAuctReqResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAcptBlkAuctReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAcptBlkAuctReqRequestT *actualData = (futAcptBlkAuctReqRequestT *)msgStruct;
	futAcptBlkAuctReqRequestT* expectedData = getFutAcptBlkAuctReqRequestT(testCaseNum);
	compareFutAcptBlkAuctReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAcptBlkAuctReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAcptBlkAuctReqResponseT *actualData = (futAcptBlkAuctReqResponseT *)msgStruct;
	futAcptBlkAuctReqResponseT* expectedData = getFutAcptBlkAuctReqResponseT(testCaseNum);
	compareFutAcptBlkAuctReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAcptBlkAuctReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAcptBlkAuctReqRequestT *actualData = (optAcptBlkAuctReqRequestT *)msgStruct;
	optAcptBlkAuctReqRequestT* expectedData = getOptAcptBlkAuctReqRequestT(testCaseNum);
	compareOptAcptBlkAuctReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAcptBlkAuctReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAcptBlkAuctReqResponseT *actualData = (optAcptBlkAuctReqResponseT *)msgStruct;
	optAcptBlkAuctReqResponseT* expectedData = getOptAcptBlkAuctReqResponseT(testCaseNum);
	compareOptAcptBlkAuctReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
