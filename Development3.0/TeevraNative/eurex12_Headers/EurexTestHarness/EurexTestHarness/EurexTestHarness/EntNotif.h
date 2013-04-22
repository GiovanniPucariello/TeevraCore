#include <EntNotif.hxx>
#define BUFFER_SIZE 1000

futEntNotifRequestT *vfutEntNotifRequestT;
futEntNotifResponseT *vfutEntNotifResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntNotifRequestT getFutBscEntNotifRequestT(char* testCaseNum , const char *root) {
	futBscEntNotifRequestT vfutBscEntNotifRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscEntNotifRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntNotif.futBscEntNotifRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscEntNotifRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscEntNotifRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntNotif.futBscEntNotifRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscEntNotifRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscEntNotifRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscEntNotifRequestT");
	vfutBscEntNotifRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntNotifRequestT");
	for(i=0;i<ISIN_COD_LEN;i++) {
		vfutBscEntNotifRequestT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("EntNotif.futBscEntNotifRequestT.isinCod", lisinCod);
	memcpy(vfutBscEntNotifRequestT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntNotifRequestT.notifQty[i]= ' ';
	}
	char lnotifQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntNotif.futBscEntNotifRequestT.notifQty", lnotifQty);
	memcpy(vfutBscEntNotifRequestT.notifQty, lnotifQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntNotifRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntNotif.futBscEntNotifRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntNotifRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntNotifRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntNotifRequestT getFutExtEntNotifRequestT(char* testCaseNum , const char *root) {
	futExtEntNotifRequestT vfutExtEntNotifRequestT;
	int i;

	vfutExtEntNotifRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtEntNotifRequestT");	return vfutExtEntNotifRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntNotifResponseT getFutBscEntNotifResponseT(char* testCaseNum , const char *root) {
	futBscEntNotifResponseT vfutBscEntNotifResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntNotifResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntNotif.futBscEntNotifResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntNotifResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntNotifResponseT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntNotif.futBscEntNotifResponseT.crtShtQty", lcrtShtQty);
	memcpy(vfutBscEntNotifResponseT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntNotifResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntNotif.futBscEntNotifResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntNotifResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntNotifResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntNotifRequestT* getFutEntNotifRequestT(char* testCaseNum) {
	vfutEntNotifRequestT = (futEntNotifRequestT*)malloc(sizeof(futEntNotifRequestT));
	int i;

	vfutEntNotifRequestT->header = getDataHeaderT(testCaseNum, "futEntNotifRequestT");
	vfutEntNotifRequestT->basic = getFutBscEntNotifRequestT(testCaseNum, "futEntNotifRequestT");
	vfutEntNotifRequestT->extension = getFutExtEntNotifRequestT(testCaseNum, "futEntNotifRequestT");
	return vfutEntNotifRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntNotifResponseT* getFutEntNotifResponseT(char* testCaseNum) {
	vfutEntNotifResponseT = (futEntNotifResponseT*)malloc(sizeof(futEntNotifResponseT));
	int i;

	vfutEntNotifResponseT->header = getDataHeaderT(testCaseNum, "futEntNotifResponseT");
	vfutEntNotifResponseT->basic = getFutBscEntNotifResponseT(testCaseNum, "futEntNotifResponseT");
	return vfutEntNotifResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntNotifRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntNotifRequestT));
	futEntNotifRequestT *vfutEntNotifRequestT = getFutEntNotifRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntNotifRequestT), (jbyte*) vfutEntNotifRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntNotifResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntNotifResponseT));
	futEntNotifResponseT *vfutEntNotifResponseT = getFutEntNotifResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntNotifResponseT), (jbyte*) vfutEntNotifResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntNotifRequestT(futBscEntNotifRequestT actual, futBscEntNotifRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntNotifRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntNotifRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntNotifRequestT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.notifQty, expected.notifQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntNotifRequestT, notifQty not matching. Actual %s but Expected %s", actual.notifQty, expected.notifQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntNotifRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntNotifRequestT(futExtEntNotifRequestT actual, futExtEntNotifRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntNotifResponseT(futBscEntNotifResponseT actual, futBscEntNotifResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntNotifResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntNotifResponseT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntNotifResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntNotifRequestT(futEntNotifRequestT actual, futEntNotifRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntNotifRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntNotifRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntNotifResponseT(futEntNotifResponseT actual, futEntNotifResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntNotifResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntNotifRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntNotifRequestT *actualData = (futEntNotifRequestT *)msgStruct;
	futEntNotifRequestT* expectedData = getFutEntNotifRequestT(testCaseNum);
	compareFutEntNotifRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntNotifResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntNotifResponseT *actualData = (futEntNotifResponseT *)msgStruct;
	futEntNotifResponseT* expectedData = getFutEntNotifResponseT(testCaseNum);
	compareFutEntNotifResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
