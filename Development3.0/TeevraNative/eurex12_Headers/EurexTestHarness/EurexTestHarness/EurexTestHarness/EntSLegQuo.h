#include <EntSLegQuo.hxx>
#define BUFFER_SIZE 1000

futEntSLegQuoRequestT *vfutEntSLegQuoRequestT;
futEntSLegQuoResponseT *vfutEntSLegQuoResponseT;
optEntSLegQuoRequestT *voptEntSLegQuoRequestT;
optEntSLegQuoResponseT *voptEntSLegQuoResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntSLegQuoRequestT getFutBscEntSLegQuoRequestT(char* testCaseNum , const char *root) {
	futBscEntSLegQuoRequestT vfutBscEntSLegQuoRequestT;
	int i;

	vfutBscEntSLegQuoRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntSLegQuoRequestT");
	vfutBscEntSLegQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntSLegQuoRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntSLegQuoRequestT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoRequestT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vfutBscEntSLegQuoRequestT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntSLegQuoRequestT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoRequestT.quoExePrcSel", lquoExePrcSel);
	memcpy(vfutBscEntSLegQuoRequestT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntSLegQuoRequestT.quoQtyBuy[i]= ' ';
	}
	char lquoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoRequestT.quoQtyBuy", lquoQtyBuy);
	memcpy(vfutBscEntSLegQuoRequestT.quoQtyBuy, lquoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntSLegQuoRequestT.quoQtySel[i]= ' ';
	}
	char lquoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoRequestT.quoQtySel", lquoQtySel);
	memcpy(vfutBscEntSLegQuoRequestT.quoQtySel, lquoQtySel, DRIV_VOLUME_LEN);
	return vfutBscEntSLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntSLegQuoRequestT getFutExtEntSLegQuoRequestT(char* testCaseNum , const char *root) {
	futExtEntSLegQuoRequestT vfutExtEntSLegQuoRequestT;
	int i;

	vfutExtEntSLegQuoRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtEntSLegQuoRequestT");
	char lprcRsblChkInd[1] = {""};
	getStrProperty("EntSLegQuo.futExtEntSLegQuoRequestT.prcRsblChkInd", lprcRsblChkInd);
	vfutExtEntSLegQuoRequestT.prcRsblChkInd = lprcRsblChkInd[0];
	return vfutExtEntSLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntSLegQuoResponseT getFutBscEntSLegQuoResponseT(char* testCaseNum , const char *root) {
	futBscEntSLegQuoResponseT vfutBscEntSLegQuoResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntSLegQuoResponseT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoResponseT.ordrNoBuy", lordrNoBuy);
	memcpy(vfutBscEntSLegQuoResponseT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntSLegQuoResponseT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoResponseT.ordrNoSel", lordrNoSel);
	memcpy(vfutBscEntSLegQuoResponseT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntSLegQuoResponseT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoResponseT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(vfutBscEntSLegQuoResponseT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntSLegQuoResponseT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoResponseT.quoBkQtySel", lquoBkQtySel);
	memcpy(vfutBscEntSLegQuoResponseT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntSLegQuoResponseT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoResponseT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(vfutBscEntSLegQuoResponseT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntSLegQuoResponseT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoResponseT.quoExeQtySel", lquoExeQtySel);
	memcpy(vfutBscEntSLegQuoResponseT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntSLegQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscEntSLegQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscEntSLegQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscEntSLegQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscEntSLegQuoResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("EntSLegQuo.futBscEntSLegQuoResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscEntSLegQuoResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutBscEntSLegQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntSLegQuoRequestT getOptBscEntSLegQuoRequestT(char* testCaseNum , const char *root) {
	optBscEntSLegQuoRequestT voptBscEntSLegQuoRequestT;
	int i;

	voptBscEntSLegQuoRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntSLegQuoRequestT");
	voptBscEntSLegQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscEntSLegQuoRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscEntSLegQuoRequestT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoRequestT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(voptBscEntSLegQuoRequestT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscEntSLegQuoRequestT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoRequestT.quoExePrcSel", lquoExePrcSel);
	memcpy(voptBscEntSLegQuoRequestT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntSLegQuoRequestT.quoQtyBuy[i]= ' ';
	}
	char lquoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoRequestT.quoQtyBuy", lquoQtyBuy);
	memcpy(voptBscEntSLegQuoRequestT.quoQtyBuy, lquoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntSLegQuoRequestT.quoQtySel[i]= ' ';
	}
	char lquoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoRequestT.quoQtySel", lquoQtySel);
	memcpy(voptBscEntSLegQuoRequestT.quoQtySel, lquoQtySel, DRIV_VOLUME_LEN);
	return voptBscEntSLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntSLegQuoRequestT getOptExtEntSLegQuoRequestT(char* testCaseNum , const char *root) {
	optExtEntSLegQuoRequestT voptExtEntSLegQuoRequestT;
	int i;

	voptExtEntSLegQuoRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtEntSLegQuoRequestT");
	char lprcRsblChkInd[1] = {""};
	getStrProperty("EntSLegQuo.optExtEntSLegQuoRequestT.prcRsblChkInd", lprcRsblChkInd);
	voptExtEntSLegQuoRequestT.prcRsblChkInd = lprcRsblChkInd[0];
	return voptExtEntSLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntSLegQuoResponseT getOptBscEntSLegQuoResponseT(char* testCaseNum , const char *root) {
	optBscEntSLegQuoResponseT voptBscEntSLegQuoResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntSLegQuoResponseT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoResponseT.ordrNoBuy", lordrNoBuy);
	memcpy(voptBscEntSLegQuoResponseT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntSLegQuoResponseT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoResponseT.ordrNoSel", lordrNoSel);
	memcpy(voptBscEntSLegQuoResponseT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntSLegQuoResponseT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoResponseT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(voptBscEntSLegQuoResponseT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntSLegQuoResponseT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoResponseT.quoBkQtySel", lquoBkQtySel);
	memcpy(voptBscEntSLegQuoResponseT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntSLegQuoResponseT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoResponseT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(voptBscEntSLegQuoResponseT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntSLegQuoResponseT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoResponseT.quoExeQtySel", lquoExeQtySel);
	memcpy(voptBscEntSLegQuoResponseT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntSLegQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(voptBscEntSLegQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscEntSLegQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(voptBscEntSLegQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscEntSLegQuoResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("EntSLegQuo.optBscEntSLegQuoResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(voptBscEntSLegQuoResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return voptBscEntSLegQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntSLegQuoRequestT* getFutEntSLegQuoRequestT(char* testCaseNum) {
	vfutEntSLegQuoRequestT = (futEntSLegQuoRequestT*)malloc(sizeof(futEntSLegQuoRequestT));
	int i;

	vfutEntSLegQuoRequestT->header = getDataHeaderT(testCaseNum, "futEntSLegQuoRequestT");
	vfutEntSLegQuoRequestT->basic = getFutBscEntSLegQuoRequestT(testCaseNum, "futEntSLegQuoRequestT");
	vfutEntSLegQuoRequestT->extension = getFutExtEntSLegQuoRequestT(testCaseNum, "futEntSLegQuoRequestT");
	return vfutEntSLegQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntSLegQuoResponseT* getFutEntSLegQuoResponseT(char* testCaseNum) {
	vfutEntSLegQuoResponseT = (futEntSLegQuoResponseT*)malloc(sizeof(futEntSLegQuoResponseT));
	int i;

	vfutEntSLegQuoResponseT->header = getDataHeaderT(testCaseNum, "futEntSLegQuoResponseT");
	vfutEntSLegQuoResponseT->basic = getFutBscEntSLegQuoResponseT(testCaseNum, "futEntSLegQuoResponseT");
	return vfutEntSLegQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntSLegQuoRequestT* getOptEntSLegQuoRequestT(char* testCaseNum) {
	voptEntSLegQuoRequestT = (optEntSLegQuoRequestT*)malloc(sizeof(optEntSLegQuoRequestT));
	int i;

	voptEntSLegQuoRequestT->header = getDataHeaderT(testCaseNum, "optEntSLegQuoRequestT");
	voptEntSLegQuoRequestT->basic = getOptBscEntSLegQuoRequestT(testCaseNum, "optEntSLegQuoRequestT");
	voptEntSLegQuoRequestT->extension = getOptExtEntSLegQuoRequestT(testCaseNum, "optEntSLegQuoRequestT");
	return voptEntSLegQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntSLegQuoResponseT* getOptEntSLegQuoResponseT(char* testCaseNum) {
	voptEntSLegQuoResponseT = (optEntSLegQuoResponseT*)malloc(sizeof(optEntSLegQuoResponseT));
	int i;

	voptEntSLegQuoResponseT->header = getDataHeaderT(testCaseNum, "optEntSLegQuoResponseT");
	voptEntSLegQuoResponseT->basic = getOptBscEntSLegQuoResponseT(testCaseNum, "optEntSLegQuoResponseT");
	return voptEntSLegQuoResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntSLegQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntSLegQuoRequestT));
	futEntSLegQuoRequestT *vfutEntSLegQuoRequestT = getFutEntSLegQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntSLegQuoRequestT), (jbyte*) vfutEntSLegQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntSLegQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntSLegQuoResponseT));
	futEntSLegQuoResponseT *vfutEntSLegQuoResponseT = getFutEntSLegQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntSLegQuoResponseT), (jbyte*) vfutEntSLegQuoResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntSLegQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntSLegQuoRequestT));
	optEntSLegQuoRequestT *voptEntSLegQuoRequestT = getOptEntSLegQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntSLegQuoRequestT), (jbyte*) voptEntSLegQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntSLegQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntSLegQuoResponseT));
	optEntSLegQuoResponseT *voptEntSLegQuoResponseT = getOptEntSLegQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntSLegQuoResponseT), (jbyte*) voptEntSLegQuoResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntSLegQuoRequestT(futBscEntSLegQuoRequestT actual, futBscEntSLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoRequestT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoRequestT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoQtyBuy, expected.quoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoRequestT, quoQtyBuy not matching. Actual %s but Expected %s", actual.quoQtyBuy, expected.quoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoQtySel, expected.quoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoRequestT, quoQtySel not matching. Actual %s but Expected %s", actual.quoQtySel, expected.quoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntSLegQuoRequestT(futExtEntSLegQuoRequestT actual, futExtEntSLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegQuoRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntSLegQuoResponseT(futBscEntSLegQuoResponseT actual, futBscEntSLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoResponseT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoResponseT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoResponseT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoResponseT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoResponseT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoResponseT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntSLegQuoRequestT(optBscEntSLegQuoRequestT actual, optBscEntSLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoRequestT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoRequestT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoQtyBuy, expected.quoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoRequestT, quoQtyBuy not matching. Actual %s but Expected %s", actual.quoQtyBuy, expected.quoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoQtySel, expected.quoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoRequestT, quoQtySel not matching. Actual %s but Expected %s", actual.quoQtySel, expected.quoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntSLegQuoRequestT(optExtEntSLegQuoRequestT actual, optExtEntSLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegQuoRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntSLegQuoResponseT(optBscEntSLegQuoResponseT actual, optBscEntSLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoResponseT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoResponseT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoResponseT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoResponseT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoResponseT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoResponseT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntSLegQuoRequestT(futEntSLegQuoRequestT actual, futEntSLegQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntSLegQuoRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntSLegQuoRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntSLegQuoResponseT(futEntSLegQuoResponseT actual, futEntSLegQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntSLegQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntSLegQuoRequestT(optEntSLegQuoRequestT actual, optEntSLegQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntSLegQuoRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntSLegQuoRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntSLegQuoResponseT(optEntSLegQuoResponseT actual, optEntSLegQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntSLegQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntSLegQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntSLegQuoRequestT *actualData = (futEntSLegQuoRequestT *)msgStruct;
	futEntSLegQuoRequestT* expectedData = getFutEntSLegQuoRequestT(testCaseNum);
	compareFutEntSLegQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntSLegQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntSLegQuoResponseT *actualData = (futEntSLegQuoResponseT *)msgStruct;
	futEntSLegQuoResponseT* expectedData = getFutEntSLegQuoResponseT(testCaseNum);
	compareFutEntSLegQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntSLegQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntSLegQuoRequestT *actualData = (optEntSLegQuoRequestT *)msgStruct;
	optEntSLegQuoRequestT* expectedData = getOptEntSLegQuoRequestT(testCaseNum);
	compareOptEntSLegQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntSLegQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntSLegQuoResponseT *actualData = (optEntSLegQuoResponseT *)msgStruct;
	optEntSLegQuoResponseT* expectedData = getOptEntSLegQuoResponseT(testCaseNum);
	compareOptEntSLegQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
