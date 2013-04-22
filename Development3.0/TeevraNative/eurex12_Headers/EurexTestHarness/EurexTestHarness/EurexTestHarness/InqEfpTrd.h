#include <InqEfpTrd.hxx>
#define BUFFER_SIZE 1000

futInqEfpTrdRequestT *vfutInqEfpTrdRequestT;
futInqEfpTrdResponseT *vfutInqEfpTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfpTrdRequestT getFutBscInqEfpTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqEfpTrdRequestT vfutBscInqEfpTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqEfpTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqEfpTrd.futBscInqEfpTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqEfpTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscInqEfpTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqEfpTrdRequestT");	return vfutBscInqEfpTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfpTrdRecT getFutBscInqEfpTrdRecT(char* testCaseNum , const char *root) {
	futBscInqEfpTrdRecT vfutBscInqEfpTrdRecT;
	int i;

	char lopnClsCod[1] = {""};
	getStrProperty("InqEfpTrd.futBscInqEfpTrdRecT.opnClsCod", lopnClsCod);
	vfutBscInqEfpTrdRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscInqEfpTrdRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqEfpTrd.futBscInqEfpTrdRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscInqEfpTrdRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	vfutBscInqEfpTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqEfpTrdRecT");	return vfutBscInqEfpTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfpTrdResponseT getFutBscInqEfpTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqEfpTrdResponseT vfutBscInqEfpTrdResponseT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqEfpTrd.futBscInqEfpTrdResponseT.buyCod", lbuyCod);
	vfutBscInqEfpTrdResponseT.buyCod = lbuyCod[0];

	vfutBscInqEfpTrdResponseT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqEfpTrdResponseT");
	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscInqEfpTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("InqEfpTrd.futBscInqEfpTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscInqEfpTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqEfpTrdResponseT.trdQty[i]= ' ';
	}
	char ltrdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqEfpTrd.futBscInqEfpTrdResponseT.trdQty", ltrdQty);
	memcpy(vfutBscInqEfpTrdResponseT.trdQty, ltrdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqEfpTrdResponseT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqEfpTrd.futBscInqEfpTrdResponseT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqEfpTrdResponseT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscInqEfpTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqEfpTrd.futBscInqEfpTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscInqEfpTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqEfpTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqEfpTrd.futBscInqEfpTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqEfpTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqEfpTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqEfpTrdRecT getFutExtInqEfpTrdRecT(char* testCaseNum , const char *root) {
	futExtInqEfpTrdRecT vfutExtInqEfpTrdRecT;
	int i;

	vfutExtInqEfpTrdRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqEfpTrdRecT");
	vfutExtInqEfpTrdRecT.txtGrp = getTxtGrpT(testCaseNum, "futExtInqEfpTrdRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtInqEfpTrdRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqEfpTrd.futExtInqEfpTrdRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtInqEfpTrdRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutExtInqEfpTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqEfpTrdResponseT getFutExtInqEfpTrdResponseT(char* testCaseNum , const char *root) {
	futExtInqEfpTrdResponseT vfutExtInqEfpTrdResponseT;
	int i;
	return vfutExtInqEfpTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEfpTrdRequestT* getFutInqEfpTrdRequestT(char* testCaseNum) {
	vfutInqEfpTrdRequestT = (futInqEfpTrdRequestT*)malloc(sizeof(futInqEfpTrdRequestT));
	int i;

	vfutInqEfpTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqEfpTrdRequestT");
	vfutInqEfpTrdRequestT->basic = getFutBscInqEfpTrdRequestT(testCaseNum, "futInqEfpTrdRequestT");
	return vfutInqEfpTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEfpTrdResponseT* getFutInqEfpTrdResponseT(char* testCaseNum) {
	vfutInqEfpTrdResponseT = (futInqEfpTrdResponseT*)malloc(sizeof(futInqEfpTrdResponseT));
	int i;

	vfutInqEfpTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqEfpTrdResponseT");
	vfutInqEfpTrdResponseT->basic = getFutBscInqEfpTrdResponseT(testCaseNum, "futInqEfpTrdResponseT");
	vfutInqEfpTrdResponseT->extension = getFutExtInqEfpTrdResponseT(testCaseNum, "futInqEfpTrdResponseT");
	return vfutInqEfpTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEfpTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEfpTrdRequestT));
	futInqEfpTrdRequestT *vfutInqEfpTrdRequestT = getFutInqEfpTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEfpTrdRequestT), (jbyte*) vfutInqEfpTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEfpTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEfpTrdResponseT));
	futInqEfpTrdResponseT *vfutInqEfpTrdResponseT = getFutInqEfpTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEfpTrdResponseT), (jbyte*) vfutInqEfpTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfpTrdRequestT(futBscInqEfpTrdRequestT actual, futBscInqEfpTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfpTrdRecT(futBscInqEfpTrdRecT actual, futBscInqEfpTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpTrdRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfpTrdResponseT(futBscInqEfpTrdResponseT actual, futBscInqEfpTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpTrdResponseT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdQty, expected.trdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpTrdResponseT, trdQty not matching. Actual %s but Expected %s", actual.trdQty, expected.trdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpTrdResponseT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_EFP_TRD_REC_MAX;i++) {
		compareFutBscInqEfpTrdRecT (actual.futBscInqEfpTrdRec[i],expected.futBscInqEfpTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqEfpTrdRecT(futExtInqEfpTrdRecT actual, futExtInqEfpTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqEfpTrdRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqEfpTrdResponseT(futExtInqEfpTrdResponseT actual, futExtInqEfpTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_EFP_TRD_REC_MAX;i++) {
		compareFutExtInqEfpTrdRecT (actual.futExtInqEfpTrdRec[i],expected.futExtInqEfpTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEfpTrdRequestT(futInqEfpTrdRequestT actual, futInqEfpTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEfpTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEfpTrdResponseT(futInqEfpTrdResponseT actual, futInqEfpTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEfpTrdResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqEfpTrdResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEfpTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEfpTrdRequestT *actualData = (futInqEfpTrdRequestT *)msgStruct;
	futInqEfpTrdRequestT* expectedData = getFutInqEfpTrdRequestT(testCaseNum);
	compareFutInqEfpTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEfpTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEfpTrdResponseT *actualData = (futInqEfpTrdResponseT *)msgStruct;
	futInqEfpTrdResponseT* expectedData = getFutInqEfpTrdResponseT(testCaseNum);
	compareFutInqEfpTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
