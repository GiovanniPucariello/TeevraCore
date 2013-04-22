#include <EntVolTrd.hxx>
#define BUFFER_SIZE 1000

futEntVolTrdRequestT *vfutEntVolTrdRequestT;
futEntVolTrdResponseT *vfutEntVolTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntVolTrdRequestT getFutBscEntVolTrdRequestT(char* testCaseNum , const char *root) {
	futBscEntVolTrdRequestT vfutBscEntVolTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntVolTrd.futBscEntVolTrdRequestT.buyCod", lbuyCod);
	vfutBscEntVolTrdRequestT.buyCod = lbuyCod[0];

	vfutBscEntVolTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntVolTrdRequestT");
	vfutBscEntVolTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntVolTrdRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntVolTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntVolTrd.futBscEntVolTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vfutBscEntVolTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntVolTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntVolTrd.futBscEntVolTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscEntVolTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntVolTrd.futBscEntVolTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscEntVolTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscEntVolTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntVolTrd.futBscEntVolTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscEntVolTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);
	return vfutBscEntVolTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntVolTrdRequestT getFutExtEntVolTrdRequestT(char* testCaseNum , const char *root) {
	futExtEntVolTrdRequestT vfutExtEntVolTrdRequestT;
	int i;

	vfutExtEntVolTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtEntVolTrdRequestT");
	vfutExtEntVolTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtEntVolTrdRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtEntVolTrdRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntVolTrd.futExtEntVolTrdRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtEntVolTrdRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutExtEntVolTrdRequestT.trnIdNoOpt[i]= ' ';
	}
	char ltrnIdNoOpt[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntVolTrd.futExtEntVolTrdRequestT.trnIdNoOpt", ltrnIdNoOpt);
	memcpy(vfutExtEntVolTrdRequestT.trnIdNoOpt, ltrnIdNoOpt, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtEntVolTrdRequestT.usedQtyOpt[i]= ' ';
	}
	char lusedQtyOpt[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntVolTrd.futExtEntVolTrdRequestT.usedQtyOpt", lusedQtyOpt);
	memcpy(vfutExtEntVolTrdRequestT.usedQtyOpt, lusedQtyOpt, DRIV_VOLUME_LEN);
	return vfutExtEntVolTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntVolTrdResponseT getFutBscEntVolTrdResponseT(char* testCaseNum , const char *root) {
	futBscEntVolTrdResponseT vfutBscEntVolTrdResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntVolTrdResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntVolTrd.futBscEntVolTrdResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntVolTrdResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntVolTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntVolTrd.futBscEntVolTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntVolTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntVolTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntVolTrdRequestT* getFutEntVolTrdRequestT(char* testCaseNum) {
	vfutEntVolTrdRequestT = (futEntVolTrdRequestT*)malloc(sizeof(futEntVolTrdRequestT));
	int i;

	vfutEntVolTrdRequestT->header = getDataHeaderT(testCaseNum, "futEntVolTrdRequestT");
	vfutEntVolTrdRequestT->basic = getFutBscEntVolTrdRequestT(testCaseNum, "futEntVolTrdRequestT");
	vfutEntVolTrdRequestT->extension = getFutExtEntVolTrdRequestT(testCaseNum, "futEntVolTrdRequestT");
	return vfutEntVolTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntVolTrdResponseT* getFutEntVolTrdResponseT(char* testCaseNum) {
	vfutEntVolTrdResponseT = (futEntVolTrdResponseT*)malloc(sizeof(futEntVolTrdResponseT));
	int i;

	vfutEntVolTrdResponseT->header = getDataHeaderT(testCaseNum, "futEntVolTrdResponseT");
	vfutEntVolTrdResponseT->basic = getFutBscEntVolTrdResponseT(testCaseNum, "futEntVolTrdResponseT");
	return vfutEntVolTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntVolTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntVolTrdRequestT));
	futEntVolTrdRequestT *vfutEntVolTrdRequestT = getFutEntVolTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntVolTrdRequestT), (jbyte*) vfutEntVolTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntVolTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntVolTrdResponseT));
	futEntVolTrdResponseT *vfutEntVolTrdResponseT = getFutEntVolTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntVolTrdResponseT), (jbyte*) vfutEntVolTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntVolTrdRequestT(futBscEntVolTrdRequestT actual, futBscEntVolTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntVolTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntVolTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntVolTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntVolTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntVolTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntVolTrdRequestT(futExtEntVolTrdRequestT actual, futExtEntVolTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntVolTrdRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNoOpt, expected.trnIdNoOpt, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntVolTrdRequestT, trnIdNoOpt not matching. Actual %s but Expected %s", actual.trnIdNoOpt, expected.trnIdNoOpt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.usedQtyOpt, expected.usedQtyOpt, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntVolTrdRequestT, usedQtyOpt not matching. Actual %s but Expected %s", actual.usedQtyOpt, expected.usedQtyOpt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntVolTrdResponseT(futBscEntVolTrdResponseT actual, futBscEntVolTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntVolTrdResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntVolTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntVolTrdRequestT(futEntVolTrdRequestT actual, futEntVolTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntVolTrdRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntVolTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntVolTrdResponseT(futEntVolTrdResponseT actual, futEntVolTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntVolTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntVolTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntVolTrdRequestT *actualData = (futEntVolTrdRequestT *)msgStruct;
	futEntVolTrdRequestT* expectedData = getFutEntVolTrdRequestT(testCaseNum);
	compareFutEntVolTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntVolTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntVolTrdResponseT *actualData = (futEntVolTrdResponseT *)msgStruct;
	futEntVolTrdResponseT* expectedData = getFutEntVolTrdResponseT(testCaseNum);
	compareFutEntVolTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
