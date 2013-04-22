#include <InqZerCostQty.hxx>
#define BUFFER_SIZE 1000

futInqZerCostQtyRequestT *vfutInqZerCostQtyRequestT;
futInqZerCostQtyResponseT *vfutInqZerCostQtyResponseT;
optInqZerCostQtyRequestT *voptInqZerCostQtyRequestT;
optInqZerCostQtyResponseT *voptInqZerCostQtyResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqZerCostQtyRequestT getFutBscInqZerCostQtyRequestT(char* testCaseNum , const char *root) {
	futBscInqZerCostQtyRequestT vfutBscInqZerCostQtyRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscInqZerCostQtyRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqZerCostQty.futBscInqZerCostQtyRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscInqZerCostQtyRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscInqZerCostQtyRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqZerCostQty.futBscInqZerCostQtyRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscInqZerCostQtyRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscInqZerCostQtyRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqZerCostQtyRequestT");
	vfutBscInqZerCostQtyRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqZerCostQtyRequestT");	return vfutBscInqZerCostQtyRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqZerCostQtyResponseT getFutExtInqZerCostQtyResponseT(char* testCaseNum , const char *root) {
	futExtInqZerCostQtyResponseT vfutExtInqZerCostQtyResponseT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqZerCostQtyResponseT.crtZerCostQty[i]= ' ';
	}
	char lcrtZerCostQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqZerCostQty.futExtInqZerCostQtyResponseT.crtZerCostQty", lcrtZerCostQty);
	memcpy(vfutExtInqZerCostQtyResponseT.crtZerCostQty, lcrtZerCostQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqZerCostQtyResponseT.prvZerCostQty[i]= ' ';
	}
	char lprvZerCostQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqZerCostQty.futExtInqZerCostQtyResponseT.prvZerCostQty", lprvZerCostQty);
	memcpy(vfutExtInqZerCostQtyResponseT.prvZerCostQty, lprvZerCostQty, DRIV_QUANTITY_LEN);
	return vfutExtInqZerCostQtyResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqZerCostQtyRequestT getOptBscInqZerCostQtyRequestT(char* testCaseNum , const char *root) {
	optBscInqZerCostQtyRequestT voptBscInqZerCostQtyRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscInqZerCostQtyRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqZerCostQty.optBscInqZerCostQtyRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscInqZerCostQtyRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqZerCostQtyRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqZerCostQty.optBscInqZerCostQtyRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqZerCostQtyRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscInqZerCostQtyRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscInqZerCostQtyRequestT");
	voptBscInqZerCostQtyRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqZerCostQtyRequestT");	return voptBscInqZerCostQtyRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqZerCostQtyResponseT getOptExtInqZerCostQtyResponseT(char* testCaseNum , const char *root) {
	optExtInqZerCostQtyResponseT voptExtInqZerCostQtyResponseT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqZerCostQtyResponseT.crtZerCostQty[i]= ' ';
	}
	char lcrtZerCostQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqZerCostQty.optExtInqZerCostQtyResponseT.crtZerCostQty", lcrtZerCostQty);
	memcpy(voptExtInqZerCostQtyResponseT.crtZerCostQty, lcrtZerCostQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqZerCostQtyResponseT.prvZerCostQty[i]= ' ';
	}
	char lprvZerCostQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqZerCostQty.optExtInqZerCostQtyResponseT.prvZerCostQty", lprvZerCostQty);
	memcpy(voptExtInqZerCostQtyResponseT.prvZerCostQty, lprvZerCostQty, DRIV_QUANTITY_LEN);
	return voptExtInqZerCostQtyResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqZerCostQtyRequestT* getFutInqZerCostQtyRequestT(char* testCaseNum) {
	vfutInqZerCostQtyRequestT = (futInqZerCostQtyRequestT*)malloc(sizeof(futInqZerCostQtyRequestT));
	int i;

	vfutInqZerCostQtyRequestT->header = getDataHeaderT(testCaseNum, "futInqZerCostQtyRequestT");
	vfutInqZerCostQtyRequestT->basic = getFutBscInqZerCostQtyRequestT(testCaseNum, "futInqZerCostQtyRequestT");
	return vfutInqZerCostQtyRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqZerCostQtyResponseT* getFutInqZerCostQtyResponseT(char* testCaseNum) {
	vfutInqZerCostQtyResponseT = (futInqZerCostQtyResponseT*)malloc(sizeof(futInqZerCostQtyResponseT));
	int i;

	vfutInqZerCostQtyResponseT->header = getDataHeaderT(testCaseNum, "futInqZerCostQtyResponseT");
	vfutInqZerCostQtyResponseT->extension = getFutExtInqZerCostQtyResponseT(testCaseNum, "futInqZerCostQtyResponseT");
	return vfutInqZerCostQtyResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqZerCostQtyRequestT* getOptInqZerCostQtyRequestT(char* testCaseNum) {
	voptInqZerCostQtyRequestT = (optInqZerCostQtyRequestT*)malloc(sizeof(optInqZerCostQtyRequestT));
	int i;

	voptInqZerCostQtyRequestT->header = getDataHeaderT(testCaseNum, "optInqZerCostQtyRequestT");
	voptInqZerCostQtyRequestT->basic = getOptBscInqZerCostQtyRequestT(testCaseNum, "optInqZerCostQtyRequestT");
	return voptInqZerCostQtyRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqZerCostQtyResponseT* getOptInqZerCostQtyResponseT(char* testCaseNum) {
	voptInqZerCostQtyResponseT = (optInqZerCostQtyResponseT*)malloc(sizeof(optInqZerCostQtyResponseT));
	int i;

	voptInqZerCostQtyResponseT->header = getDataHeaderT(testCaseNum, "optInqZerCostQtyResponseT");
	voptInqZerCostQtyResponseT->extension = getOptExtInqZerCostQtyResponseT(testCaseNum, "optInqZerCostQtyResponseT");
	return voptInqZerCostQtyResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqZerCostQtyRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqZerCostQtyRequestT));
	futInqZerCostQtyRequestT *vfutInqZerCostQtyRequestT = getFutInqZerCostQtyRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqZerCostQtyRequestT), (jbyte*) vfutInqZerCostQtyRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqZerCostQtyResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqZerCostQtyResponseT));
	futInqZerCostQtyResponseT *vfutInqZerCostQtyResponseT = getFutInqZerCostQtyResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqZerCostQtyResponseT), (jbyte*) vfutInqZerCostQtyResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqZerCostQtyRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqZerCostQtyRequestT));
	optInqZerCostQtyRequestT *voptInqZerCostQtyRequestT = getOptInqZerCostQtyRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqZerCostQtyRequestT), (jbyte*) voptInqZerCostQtyRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqZerCostQtyResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqZerCostQtyResponseT));
	optInqZerCostQtyResponseT *voptInqZerCostQtyResponseT = getOptInqZerCostQtyResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqZerCostQtyResponseT), (jbyte*) voptInqZerCostQtyResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqZerCostQtyRequestT(futBscInqZerCostQtyRequestT actual, futBscInqZerCostQtyRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqZerCostQtyRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqZerCostQtyRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqZerCostQtyResponseT(futExtInqZerCostQtyResponseT actual, futExtInqZerCostQtyResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.crtZerCostQty, expected.crtZerCostQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqZerCostQtyResponseT, crtZerCostQty not matching. Actual %s but Expected %s", actual.crtZerCostQty, expected.crtZerCostQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvZerCostQty, expected.prvZerCostQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqZerCostQtyResponseT, prvZerCostQty not matching. Actual %s but Expected %s", actual.prvZerCostQty, expected.prvZerCostQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqZerCostQtyRequestT(optBscInqZerCostQtyRequestT actual, optBscInqZerCostQtyRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqZerCostQtyRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqZerCostQtyRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqZerCostQtyResponseT(optExtInqZerCostQtyResponseT actual, optExtInqZerCostQtyResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.crtZerCostQty, expected.crtZerCostQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqZerCostQtyResponseT, crtZerCostQty not matching. Actual %s but Expected %s", actual.crtZerCostQty, expected.crtZerCostQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvZerCostQty, expected.prvZerCostQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqZerCostQtyResponseT, prvZerCostQty not matching. Actual %s but Expected %s", actual.prvZerCostQty, expected.prvZerCostQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqZerCostQtyRequestT(futInqZerCostQtyRequestT actual, futInqZerCostQtyRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqZerCostQtyRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqZerCostQtyResponseT(futInqZerCostQtyResponseT actual, futInqZerCostQtyResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutExtInqZerCostQtyResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqZerCostQtyRequestT(optInqZerCostQtyRequestT actual, optInqZerCostQtyRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqZerCostQtyRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqZerCostQtyResponseT(optInqZerCostQtyResponseT actual, optInqZerCostQtyResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptExtInqZerCostQtyResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqZerCostQtyRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqZerCostQtyRequestT *actualData = (futInqZerCostQtyRequestT *)msgStruct;
	futInqZerCostQtyRequestT* expectedData = getFutInqZerCostQtyRequestT(testCaseNum);
	compareFutInqZerCostQtyRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqZerCostQtyResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqZerCostQtyResponseT *actualData = (futInqZerCostQtyResponseT *)msgStruct;
	futInqZerCostQtyResponseT* expectedData = getFutInqZerCostQtyResponseT(testCaseNum);
	compareFutInqZerCostQtyResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqZerCostQtyRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqZerCostQtyRequestT *actualData = (optInqZerCostQtyRequestT *)msgStruct;
	optInqZerCostQtyRequestT* expectedData = getOptInqZerCostQtyRequestT(testCaseNum);
	compareOptInqZerCostQtyRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqZerCostQtyResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqZerCostQtyResponseT *actualData = (optInqZerCostQtyResponseT *)msgStruct;
	optInqZerCostQtyResponseT* expectedData = getOptInqZerCostQtyResponseT(testCaseNum);
	compareOptInqZerCostQtyResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
