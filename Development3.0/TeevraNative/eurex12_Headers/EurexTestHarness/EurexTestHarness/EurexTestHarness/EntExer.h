#include <EntExer.hxx>
#define BUFFER_SIZE 1000

optEntExerRequestT *voptEntExerRequestT;
optEntExerResponseT *voptEntExerResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntExerRequestT getOptBscEntExerRequestT(char* testCaseNum , const char *root) {
	optBscEntExerRequestT voptBscEntExerRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscEntExerRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntExer.optBscEntExerRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscEntExerRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscEntExerRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntExer.optBscEntExerRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscEntExerRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscEntExerRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscEntExerRequestT");
	voptBscEntExerRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntExerRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntExerRequestT.exerQty[i]= ' ';
	}
	char lexerQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntExer.optBscEntExerRequestT.exerQty", lexerQty);
	memcpy(voptBscEntExerRequestT.exerQty, lexerQty, DRIV_QUANTITY_LEN);
	return voptBscEntExerRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntExerRequestT getOptExtEntExerRequestT(char* testCaseNum , const char *root) {
	optExtEntExerRequestT voptExtEntExerRequestT;
	int i;

	char lexerAllInd[1] = {""};
	getStrProperty("EntExer.optExtEntExerRequestT.exerAllInd", lexerAllInd);
	voptExtEntExerRequestT.exerAllInd = lexerAllInd[0];

	char lexerOtmWrnInd[1] = {""};
	getStrProperty("EntExer.optExtEntExerRequestT.exerOtmWrnInd", lexerOtmWrnInd);
	voptExtEntExerRequestT.exerOtmWrnInd = lexerOtmWrnInd[0];

	voptExtEntExerRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtEntExerRequestT");
	for(i=0;i<DRIV_LOGIN_MAX_PWDID;i++) {
		voptExtEntExerRequestT.password[i]= ' ';
	}
	char lpassword[DRIV_LOGIN_MAX_PWDID] = {""};
	getStrProperty("EntExer.optExtEntExerRequestT.password", lpassword);
	memcpy(voptExtEntExerRequestT.password, lpassword, DRIV_LOGIN_MAX_PWDID);

	voptExtEntExerRequestT.trdrIdGrpAppr = getTrdrIdGrpApprT(testCaseNum, "optExtEntExerRequestT");	return voptExtEntExerRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntExerResponseT getOptBscEntExerResponseT(char* testCaseNum , const char *root) {
	optBscEntExerResponseT voptBscEntExerResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntExerResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntExer.optBscEntExerResponseT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntExerResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntExerResponseT.crtLngQty[i]= ' ';
	}
	char lcrtLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntExer.optBscEntExerResponseT.crtLngQty", lcrtLngQty);
	memcpy(voptBscEntExerResponseT.crtLngQty, lcrtLngQty, DRIV_QUANTITY_LEN);
	return voptBscEntExerResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntExerRequestT* getOptEntExerRequestT(char* testCaseNum) {
	voptEntExerRequestT = (optEntExerRequestT*)malloc(sizeof(optEntExerRequestT));
	int i;

	voptEntExerRequestT->header = getDataHeaderT(testCaseNum, "optEntExerRequestT");
	voptEntExerRequestT->basic = getOptBscEntExerRequestT(testCaseNum, "optEntExerRequestT");
	voptEntExerRequestT->extension = getOptExtEntExerRequestT(testCaseNum, "optEntExerRequestT");
	return voptEntExerRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntExerResponseT* getOptEntExerResponseT(char* testCaseNum) {
	voptEntExerResponseT = (optEntExerResponseT*)malloc(sizeof(optEntExerResponseT));
	int i;

	voptEntExerResponseT->header = getDataHeaderT(testCaseNum, "optEntExerResponseT");
	voptEntExerResponseT->basic = getOptBscEntExerResponseT(testCaseNum, "optEntExerResponseT");
	return voptEntExerResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntExerRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntExerRequestT));
	optEntExerRequestT *voptEntExerRequestT = getOptEntExerRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntExerRequestT), (jbyte*) voptEntExerRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntExerResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntExerResponseT));
	optEntExerResponseT *voptEntExerResponseT = getOptEntExerResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntExerResponseT), (jbyte*) voptEntExerResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntExerRequestT(optBscEntExerRequestT actual, optBscEntExerRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntExerRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntExerRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.exerQty, expected.exerQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntExerRequestT, exerQty not matching. Actual %s but Expected %s", actual.exerQty, expected.exerQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntExerRequestT(optExtEntExerRequestT actual, optExtEntExerRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.exerAllInd!= expected.exerAllInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntExerRequestT, exerAllIndnot matching. Actual %d but Expected %d", actual.exerAllInd, expected.exerAllInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerOtmWrnInd!= expected.exerOtmWrnInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntExerRequestT, exerOtmWrnIndnot matching. Actual %d but Expected %d", actual.exerOtmWrnInd, expected.exerOtmWrnInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.password, expected.password, DRIV_LOGIN_MAX_PWDID)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntExerRequestT, password not matching. Actual %s but Expected %s", actual.password, expected.password);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpApprT (actual.trdrIdGrpAppr,expected.trdrIdGrpAppr, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntExerResponseT(optBscEntExerResponseT actual, optBscEntExerResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntExerResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtLngQty, expected.crtLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntExerResponseT, crtLngQty not matching. Actual %s but Expected %s", actual.crtLngQty, expected.crtLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntExerRequestT(optEntExerRequestT actual, optEntExerRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntExerRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntExerRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntExerResponseT(optEntExerResponseT actual, optEntExerResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntExerResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntExerRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntExerRequestT *actualData = (optEntExerRequestT *)msgStruct;
	optEntExerRequestT* expectedData = getOptEntExerRequestT(testCaseNum);
	compareOptEntExerRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntExerResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntExerResponseT *actualData = (optEntExerResponseT *)msgStruct;
	optEntExerResponseT* expectedData = getOptEntExerResponseT(testCaseNum);
	compareOptEntExerResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
