#include <EntEfpTrd.hxx>
#define BUFFER_SIZE 1000

futEntEfpTrdRequestT *vfutEntEfpTrdRequestT;
futEntEfpTrdResponseT *vfutEntEfpTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEfpTrdRequestT getFutBscEntEfpTrdRequestT(char* testCaseNum , const char *root) {
	futBscEntEfpTrdRequestT vfutBscEntEfpTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntEfpTrd.futBscEntEfpTrdRequestT.buyCod", lbuyCod);
	vfutBscEntEfpTrdRequestT.buyCod = lbuyCod[0];

	vfutBscEntEfpTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntEfpTrdRequestT");
	vfutBscEntEfpTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntEfpTrdRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntEfpTrdRequestT.trdQty[i]= ' ';
	}
	char ltrdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntEfpTrd.futBscEntEfpTrdRequestT.trdQty", ltrdQty);
	memcpy(vfutBscEntEfpTrdRequestT.trdQty, ltrdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntEfpTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntEfpTrd.futBscEntEfpTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscEntEfpTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntEfpTrd.futBscEntEfpTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscEntEfpTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscEntEfpTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntEfpTrd.futBscEntEfpTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscEntEfpTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);
	return vfutBscEntEfpTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntEfpTrdRequestT getFutExtEntEfpTrdRequestT(char* testCaseNum , const char *root) {
	futExtEntEfpTrdRequestT vfutExtEntEfpTrdRequestT;
	int i;

	vfutExtEntEfpTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtEntEfpTrdRequestT");
	vfutExtEntEfpTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtEntEfpTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtEntEfpTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntEfpTrd.futExtEntEfpTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtEntEfpTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutExtEntEfpTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEfpTrdResponseT getFutBscEntEfpTrdResponseT(char* testCaseNum , const char *root) {
	futBscEntEfpTrdResponseT vfutBscEntEfpTrdResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntEfpTrdResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntEfpTrd.futBscEntEfpTrdResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntEfpTrdResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscEntEfpTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("EntEfpTrd.futBscEntEfpTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscEntEfpTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntEfpTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntEfpTrd.futBscEntEfpTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntEfpTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntEfpTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEfpTrdRequestT* getFutEntEfpTrdRequestT(char* testCaseNum) {
	vfutEntEfpTrdRequestT = (futEntEfpTrdRequestT*)malloc(sizeof(futEntEfpTrdRequestT));
	int i;

	vfutEntEfpTrdRequestT->header = getDataHeaderT(testCaseNum, "futEntEfpTrdRequestT");
	vfutEntEfpTrdRequestT->basic = getFutBscEntEfpTrdRequestT(testCaseNum, "futEntEfpTrdRequestT");
	vfutEntEfpTrdRequestT->extension = getFutExtEntEfpTrdRequestT(testCaseNum, "futEntEfpTrdRequestT");
	return vfutEntEfpTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEfpTrdResponseT* getFutEntEfpTrdResponseT(char* testCaseNum) {
	vfutEntEfpTrdResponseT = (futEntEfpTrdResponseT*)malloc(sizeof(futEntEfpTrdResponseT));
	int i;

	vfutEntEfpTrdResponseT->header = getDataHeaderT(testCaseNum, "futEntEfpTrdResponseT");
	vfutEntEfpTrdResponseT->basic = getFutBscEntEfpTrdResponseT(testCaseNum, "futEntEfpTrdResponseT");
	return vfutEntEfpTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEfpTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEfpTrdRequestT));
	futEntEfpTrdRequestT *vfutEntEfpTrdRequestT = getFutEntEfpTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEfpTrdRequestT), (jbyte*) vfutEntEfpTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEfpTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEfpTrdResponseT));
	futEntEfpTrdResponseT *vfutEntEfpTrdResponseT = getFutEntEfpTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEfpTrdResponseT), (jbyte*) vfutEntEfpTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEfpTrdRequestT(futBscEntEfpTrdRequestT actual, futBscEntEfpTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdQty, expected.trdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpTrdRequestT, trdQty not matching. Actual %s but Expected %s", actual.trdQty, expected.trdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntEfpTrdRequestT(futExtEntEfpTrdRequestT actual, futExtEntEfpTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntEfpTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEfpTrdResponseT(futBscEntEfpTrdResponseT actual, futBscEntEfpTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpTrdResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfpTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEfpTrdRequestT(futEntEfpTrdRequestT actual, futEntEfpTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEfpTrdRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntEfpTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEfpTrdResponseT(futEntEfpTrdResponseT actual, futEntEfpTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEfpTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEfpTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEfpTrdRequestT *actualData = (futEntEfpTrdRequestT *)msgStruct;
	futEntEfpTrdRequestT* expectedData = getFutEntEfpTrdRequestT(testCaseNum);
	compareFutEntEfpTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEfpTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEfpTrdResponseT *actualData = (futEntEfpTrdResponseT *)msgStruct;
	futEntEfpTrdResponseT* expectedData = getFutEntEfpTrdResponseT(testCaseNum);
	compareFutEntEfpTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
