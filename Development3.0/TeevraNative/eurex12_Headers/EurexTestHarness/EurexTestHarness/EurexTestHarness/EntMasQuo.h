#include <EntMasQuo.hxx>
#define BUFFER_SIZE 1000

optEntMasQuoRequestT *voptEntMasQuoRequestT;
optEntMasQuoResponseT *voptEntMasQuoResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntMasQuoGrpT getOptBscEntMasQuoGrpT(char* testCaseNum , const char *root) {
	optBscEntMasQuoGrpT voptBscEntMasQuoGrpT;
	int i;

	voptBscEntMasQuoGrpT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntMasQuoGrpT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscEntMasQuoGrpT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoGrpT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(voptBscEntMasQuoGrpT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscEntMasQuoGrpT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoGrpT.quoExePrcSel", lquoExePrcSel);
	memcpy(voptBscEntMasQuoGrpT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntMasQuoGrpT.quoQtyBuy[i]= ' ';
	}
	char lquoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoGrpT.quoQtyBuy", lquoQtyBuy);
	memcpy(voptBscEntMasQuoGrpT.quoQtyBuy, lquoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntMasQuoGrpT.quoQtySel[i]= ' ';
	}
	char lquoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoGrpT.quoQtySel", lquoQtySel);
	memcpy(voptBscEntMasQuoGrpT.quoQtySel, lquoQtySel, DRIV_VOLUME_LEN);
	return voptBscEntMasQuoGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntMasQuoRequestT getOptBscEntMasQuoRequestT(char* testCaseNum , const char *root) {
	optBscEntMasQuoRequestT voptBscEntMasQuoRequestT;
	int i;

	voptBscEntMasQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscEntMasQuoRequestT");
	voptBscEntMasQuoRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscEntMasQuoRequestT");
	char lprcRsblChkInd[1] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoRequestT.prcRsblChkInd", lprcRsblChkInd);
	voptBscEntMasQuoRequestT.prcRsblChkInd = lprcRsblChkInd[0];

	char lsuppQuoConfInd[1] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoRequestT.suppQuoConfInd", lsuppQuoConfInd);
	voptBscEntMasQuoRequestT.suppQuoConfInd = lsuppQuoConfInd[0];

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscEntMasQuoRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscEntMasQuoRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);
	return voptBscEntMasQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntMasQuoRecT getOptBscEntMasQuoRecT(char* testCaseNum , const char *root) {
	optBscEntMasQuoRecT voptBscEntMasQuoRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		voptBscEntMasQuoRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoRecT.rtnCod", lrtnCod);
	memcpy(voptBscEntMasQuoRecT.rtnCod, lrtnCod, RTN_COD_LEN);

	voptBscEntMasQuoRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntMasQuoRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntMasQuoRecT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoRecT.ordrNoBuy", lordrNoBuy);
	memcpy(voptBscEntMasQuoRecT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntMasQuoRecT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoRecT.ordrNoSel", lordrNoSel);
	memcpy(voptBscEntMasQuoRecT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntMasQuoRecT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoRecT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(voptBscEntMasQuoRecT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntMasQuoRecT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoRecT.quoExeQtySel", lquoExeQtySel);
	memcpy(voptBscEntMasQuoRecT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscEntMasQuoRecT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoRecT.lstEvntTrnId", llstEvntTrnId);
	memcpy(voptBscEntMasQuoRecT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return voptBscEntMasQuoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntMasQuoResponseT getOptBscEntMasQuoResponseT(char* testCaseNum , const char *root) {
	optBscEntMasQuoResponseT voptBscEntMasQuoResponseT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntMasQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(voptBscEntMasQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscEntMasQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(voptBscEntMasQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscEntMasQuoResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntMasQuo.optBscEntMasQuoResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscEntMasQuoResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscEntMasQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntMasQuoRequestT* getOptEntMasQuoRequestT(char* testCaseNum) {
	voptEntMasQuoRequestT = (optEntMasQuoRequestT*)malloc(sizeof(optEntMasQuoRequestT));
	int i;

	voptEntMasQuoRequestT->header = getDataHeaderT(testCaseNum, "optEntMasQuoRequestT");
	voptEntMasQuoRequestT->basic = getOptBscEntMasQuoRequestT(testCaseNum, "optEntMasQuoRequestT");
	return voptEntMasQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntMasQuoResponseT* getOptEntMasQuoResponseT(char* testCaseNum) {
	voptEntMasQuoResponseT = (optEntMasQuoResponseT*)malloc(sizeof(optEntMasQuoResponseT));
	int i;

	voptEntMasQuoResponseT->header = getDataHeaderT(testCaseNum, "optEntMasQuoResponseT");
	voptEntMasQuoResponseT->basic = getOptBscEntMasQuoResponseT(testCaseNum, "optEntMasQuoResponseT");
	return voptEntMasQuoResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntMasQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntMasQuoRequestT));
	optEntMasQuoRequestT *voptEntMasQuoRequestT = getOptEntMasQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntMasQuoRequestT), (jbyte*) voptEntMasQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntMasQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntMasQuoResponseT));
	optEntMasQuoResponseT *voptEntMasQuoResponseT = getOptEntMasQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntMasQuoResponseT), (jbyte*) voptEntMasQuoResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntMasQuoGrpT(optBscEntMasQuoGrpT actual, optBscEntMasQuoGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoGrpT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoGrpT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoQtyBuy, expected.quoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoGrpT, quoQtyBuy not matching. Actual %s but Expected %s", actual.quoQtyBuy, expected.quoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoQtySel, expected.quoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoGrpT, quoQtySel not matching. Actual %s but Expected %s", actual.quoQtySel, expected.quoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntMasQuoRequestT(optBscEntMasQuoRequestT actual, optBscEntMasQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.suppQuoConfInd!= expected.suppQuoConfInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoRequestT, suppQuoConfIndnot matching. Actual %d but Expected %d", actual.suppQuoConfInd, expected.suppQuoConfInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_ENT_MAS_QUO_GRP_MAX;i++) {
		compareOptBscEntMasQuoGrpT (actual.optBscEntMasQuoGrp[i],expected.optBscEntMasQuoGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntMasQuoRecT(optBscEntMasQuoRecT actual, optBscEntMasQuoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoRecT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoRecT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoRecT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoRecT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoRecT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntMasQuoResponseT(optBscEntMasQuoResponseT actual, optBscEntMasQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntMasQuoResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_ENT_MAS_QUO_REC_MAX;i++) {
		compareOptBscEntMasQuoRecT (actual.optBscEntMasQuoRec[i],expected.optBscEntMasQuoRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntMasQuoRequestT(optEntMasQuoRequestT actual, optEntMasQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntMasQuoRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntMasQuoResponseT(optEntMasQuoResponseT actual, optEntMasQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntMasQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntMasQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntMasQuoRequestT *actualData = (optEntMasQuoRequestT *)msgStruct;
	optEntMasQuoRequestT* expectedData = getOptEntMasQuoRequestT(testCaseNum);
	compareOptEntMasQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntMasQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntMasQuoResponseT *actualData = (optEntMasQuoResponseT *)msgStruct;
	optEntMasQuoResponseT* expectedData = getOptEntMasQuoResponseT(testCaseNum);
	compareOptEntMasQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
