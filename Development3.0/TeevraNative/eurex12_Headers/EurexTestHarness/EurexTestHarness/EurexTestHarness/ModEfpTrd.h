#include <ModEfpTrd.hxx>
#define BUFFER_SIZE 1000

futModEfpTrdRequestT *vfutModEfpTrdRequestT;
futModEfpTrdResponseT *vfutModEfpTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEfpTrdRequestT getFutBscModEfpTrdRequestT(char* testCaseNum , const char *root) {
	futBscModEfpTrdRequestT vfutBscModEfpTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModEfpTrd.futBscModEfpTrdRequestT.buyCod", lbuyCod);
	vfutBscModEfpTrdRequestT.buyCod = lbuyCod[0];

	vfutBscModEfpTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModEfpTrdRequestT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscModEfpTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModEfpTrd.futBscModEfpTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscModEfpTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscModEfpTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscModEfpTrdRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModEfpTrdRequestT.trdQty[i]= ' ';
	}
	char ltrdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModEfpTrd.futBscModEfpTrdRequestT.trdQty", ltrdQty);
	memcpy(vfutBscModEfpTrdRequestT.trdQty, ltrdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModEfpTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModEfpTrd.futBscModEfpTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscModEfpTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscModEfpTrdRequestT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("ModEfpTrd.futBscModEfpTrdRequestT.currTypCod", lcurrTypCod);
	memcpy(vfutBscModEfpTrdRequestT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModEfpTrd.futBscModEfpTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscModEfpTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscModEfpTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("ModEfpTrd.futBscModEfpTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscModEfpTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEfpTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEfpTrd.futBscModEfpTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEfpTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModEfpTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtModEfpTrdRequestT getFutExtModEfpTrdRequestT(char* testCaseNum , const char *root) {
	futExtModEfpTrdRequestT vfutExtModEfpTrdRequestT;
	int i;

	vfutExtModEfpTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtModEfpTrdRequestT");
	vfutExtModEfpTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtModEfpTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtModEfpTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModEfpTrd.futExtModEfpTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtModEfpTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutExtModEfpTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEfpTrdResponseT getFutBscModEfpTrdResponseT(char* testCaseNum , const char *root) {
	futBscModEfpTrdResponseT vfutBscModEfpTrdResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEfpTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEfpTrd.futBscModEfpTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEfpTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModEfpTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEfpTrdRequestT* getFutModEfpTrdRequestT(char* testCaseNum) {
	vfutModEfpTrdRequestT = (futModEfpTrdRequestT*)malloc(sizeof(futModEfpTrdRequestT));
	int i;

	vfutModEfpTrdRequestT->header = getDataHeaderT(testCaseNum, "futModEfpTrdRequestT");
	vfutModEfpTrdRequestT->basic = getFutBscModEfpTrdRequestT(testCaseNum, "futModEfpTrdRequestT");
	vfutModEfpTrdRequestT->extension = getFutExtModEfpTrdRequestT(testCaseNum, "futModEfpTrdRequestT");
	return vfutModEfpTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEfpTrdResponseT* getFutModEfpTrdResponseT(char* testCaseNum) {
	vfutModEfpTrdResponseT = (futModEfpTrdResponseT*)malloc(sizeof(futModEfpTrdResponseT));
	int i;

	vfutModEfpTrdResponseT->header = getDataHeaderT(testCaseNum, "futModEfpTrdResponseT");
	vfutModEfpTrdResponseT->basic = getFutBscModEfpTrdResponseT(testCaseNum, "futModEfpTrdResponseT");
	return vfutModEfpTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEfpTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEfpTrdRequestT));
	futModEfpTrdRequestT *vfutModEfpTrdRequestT = getFutModEfpTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEfpTrdRequestT), (jbyte*) vfutModEfpTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEfpTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEfpTrdResponseT));
	futModEfpTrdResponseT *vfutModEfpTrdResponseT = getFutModEfpTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEfpTrdResponseT), (jbyte*) vfutModEfpTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEfpTrdRequestT(futBscModEfpTrdRequestT actual, futBscModEfpTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdQty, expected.trdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpTrdRequestT, trdQty not matching. Actual %s but Expected %s", actual.trdQty, expected.trdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpTrdRequestT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtModEfpTrdRequestT(futExtModEfpTrdRequestT actual, futExtModEfpTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModEfpTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEfpTrdResponseT(futBscModEfpTrdResponseT actual, futBscModEfpTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfpTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEfpTrdRequestT(futModEfpTrdRequestT actual, futModEfpTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEfpTrdRequestT (actual.basic,expected.basic, logMsg);	compareFutExtModEfpTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEfpTrdResponseT(futModEfpTrdResponseT actual, futModEfpTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEfpTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEfpTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEfpTrdRequestT *actualData = (futModEfpTrdRequestT *)msgStruct;
	futModEfpTrdRequestT* expectedData = getFutModEfpTrdRequestT(testCaseNum);
	compareFutModEfpTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEfpTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEfpTrdResponseT *actualData = (futModEfpTrdResponseT *)msgStruct;
	futModEfpTrdResponseT* expectedData = getFutModEfpTrdResponseT(testCaseNum);
	compareFutModEfpTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
