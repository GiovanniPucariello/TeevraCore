#include <ModVolTrd.hxx>
#define BUFFER_SIZE 1000

futModVolTrdRequestT *vfutModVolTrdRequestT;
futModVolTrdResponseT *vfutModVolTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModVolTrdRequestT getFutBscModVolTrdRequestT(char* testCaseNum , const char *root) {
	futBscModVolTrdRequestT vfutBscModVolTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModVolTrd.futBscModVolTrdRequestT.buyCod", lbuyCod);
	vfutBscModVolTrdRequestT.buyCod = lbuyCod[0];

	vfutBscModVolTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModVolTrdRequestT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscModVolTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModVolTrd.futBscModVolTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscModVolTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscModVolTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscModVolTrdRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModVolTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModVolTrd.futBscModVolTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vfutBscModVolTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModVolTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModVolTrd.futBscModVolTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscModVolTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModVolTrd.futBscModVolTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscModVolTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscModVolTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("ModVolTrd.futBscModVolTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscModVolTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModVolTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModVolTrd.futBscModVolTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModVolTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModVolTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtModVolTrdRequestT getFutExtModVolTrdRequestT(char* testCaseNum , const char *root) {
	futExtModVolTrdRequestT vfutExtModVolTrdRequestT;
	int i;

	vfutExtModVolTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtModVolTrdRequestT");
	vfutExtModVolTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtModVolTrdRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtModVolTrdRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("ModVolTrd.futExtModVolTrdRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtModVolTrdRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutExtModVolTrdRequestT.trnIdNoOpt[i]= ' ';
	}
	char ltrnIdNoOpt[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModVolTrd.futExtModVolTrdRequestT.trnIdNoOpt", ltrnIdNoOpt);
	memcpy(vfutExtModVolTrdRequestT.trnIdNoOpt, ltrnIdNoOpt, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtModVolTrdRequestT.usedQtyOpt[i]= ' ';
	}
	char lusedQtyOpt[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModVolTrd.futExtModVolTrdRequestT.usedQtyOpt", lusedQtyOpt);
	memcpy(vfutExtModVolTrdRequestT.usedQtyOpt, lusedQtyOpt, DRIV_VOLUME_LEN);
	return vfutExtModVolTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModVolTrdResponseT getFutBscModVolTrdResponseT(char* testCaseNum , const char *root) {
	futBscModVolTrdResponseT vfutBscModVolTrdResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModVolTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModVolTrd.futBscModVolTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModVolTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModVolTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModVolTrdRequestT* getFutModVolTrdRequestT(char* testCaseNum) {
	vfutModVolTrdRequestT = (futModVolTrdRequestT*)malloc(sizeof(futModVolTrdRequestT));
	int i;

	vfutModVolTrdRequestT->header = getDataHeaderT(testCaseNum, "futModVolTrdRequestT");
	vfutModVolTrdRequestT->basic = getFutBscModVolTrdRequestT(testCaseNum, "futModVolTrdRequestT");
	vfutModVolTrdRequestT->extension = getFutExtModVolTrdRequestT(testCaseNum, "futModVolTrdRequestT");
	return vfutModVolTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModVolTrdResponseT* getFutModVolTrdResponseT(char* testCaseNum) {
	vfutModVolTrdResponseT = (futModVolTrdResponseT*)malloc(sizeof(futModVolTrdResponseT));
	int i;

	vfutModVolTrdResponseT->header = getDataHeaderT(testCaseNum, "futModVolTrdResponseT");
	vfutModVolTrdResponseT->basic = getFutBscModVolTrdResponseT(testCaseNum, "futModVolTrdResponseT");
	return vfutModVolTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModVolTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModVolTrdRequestT));
	futModVolTrdRequestT *vfutModVolTrdRequestT = getFutModVolTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModVolTrdRequestT), (jbyte*) vfutModVolTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModVolTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModVolTrdResponseT));
	futModVolTrdResponseT *vfutModVolTrdResponseT = getFutModVolTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModVolTrdResponseT), (jbyte*) vfutModVolTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModVolTrdRequestT(futBscModVolTrdRequestT actual, futBscModVolTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModVolTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModVolTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModVolTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModVolTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModVolTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModVolTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModVolTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtModVolTrdRequestT(futExtModVolTrdRequestT actual, futExtModVolTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModVolTrdRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNoOpt, expected.trnIdNoOpt, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModVolTrdRequestT, trnIdNoOpt not matching. Actual %s but Expected %s", actual.trnIdNoOpt, expected.trnIdNoOpt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.usedQtyOpt, expected.usedQtyOpt, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModVolTrdRequestT, usedQtyOpt not matching. Actual %s but Expected %s", actual.usedQtyOpt, expected.usedQtyOpt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModVolTrdResponseT(futBscModVolTrdResponseT actual, futBscModVolTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModVolTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModVolTrdRequestT(futModVolTrdRequestT actual, futModVolTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModVolTrdRequestT (actual.basic,expected.basic, logMsg);	compareFutExtModVolTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModVolTrdResponseT(futModVolTrdResponseT actual, futModVolTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModVolTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModVolTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModVolTrdRequestT *actualData = (futModVolTrdRequestT *)msgStruct;
	futModVolTrdRequestT* expectedData = getFutModVolTrdRequestT(testCaseNum);
	compareFutModVolTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModVolTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModVolTrdResponseT *actualData = (futModVolTrdResponseT *)msgStruct;
	futModVolTrdResponseT* expectedData = getFutModVolTrdResponseT(testCaseNum);
	compareFutModVolTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
