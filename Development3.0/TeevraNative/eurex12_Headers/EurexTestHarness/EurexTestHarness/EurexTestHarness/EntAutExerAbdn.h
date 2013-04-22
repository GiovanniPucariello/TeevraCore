#include <EntAutExerAbdn.hxx>
#define BUFFER_SIZE 1000

optEntAutExerAbdnRequestT *voptEntAutExerAbdnRequestT;
optEntAutExerAbdnResponseT *voptEntAutExerAbdnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntAutExerAbdnRequestT getOptBscEntAutExerAbdnRequestT(char* testCaseNum , const char *root) {
	optBscEntAutExerAbdnRequestT voptBscEntAutExerAbdnRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscEntAutExerAbdnRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntAutExerAbdn.optBscEntAutExerAbdnRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscEntAutExerAbdnRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscEntAutExerAbdnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntAutExerAbdn.optBscEntAutExerAbdnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscEntAutExerAbdnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscEntAutExerAbdnRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscEntAutExerAbdnRequestT");
	voptBscEntAutExerAbdnRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntAutExerAbdnRequestT");	return voptBscEntAutExerAbdnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntAutExerAbdnRequestT getOptExtEntAutExerAbdnRequestT(char* testCaseNum , const char *root) {
	optExtEntAutExerAbdnRequestT voptExtEntAutExerAbdnRequestT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtEntAutExerAbdnRequestT.abdnQtyAdj[i]= ' ';
	}
	char labdnQtyAdj[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntAutExerAbdn.optExtEntAutExerAbdnRequestT.abdnQtyAdj", labdnQtyAdj);
	memcpy(voptExtEntAutExerAbdnRequestT.abdnQtyAdj, labdnQtyAdj, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_LOGIN_MAX_PWDID;i++) {
		voptExtEntAutExerAbdnRequestT.password[i]= ' ';
	}
	char lpassword[DRIV_LOGIN_MAX_PWDID] = {""};
	getStrProperty("EntAutExerAbdn.optExtEntAutExerAbdnRequestT.password", lpassword);
	memcpy(voptExtEntAutExerAbdnRequestT.password, lpassword, DRIV_LOGIN_MAX_PWDID);

	voptExtEntAutExerAbdnRequestT.trdrIdGrpAppr = getTrdrIdGrpApprT(testCaseNum, "optExtEntAutExerAbdnRequestT");	return voptExtEntAutExerAbdnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntAutExerAbdnResponseT getOptExtEntAutExerAbdnResponseT(char* testCaseNum , const char *root) {
	optExtEntAutExerAbdnResponseT voptExtEntAutExerAbdnResponseT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtEntAutExerAbdnResponseT.abdnQty[i]= ' ';
	}
	char labdnQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntAutExerAbdn.optExtEntAutExerAbdnResponseT.abdnQty", labdnQty);
	memcpy(voptExtEntAutExerAbdnResponseT.abdnQty, labdnQty, DRIV_QUANTITY_LEN);
	return voptExtEntAutExerAbdnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntAutExerAbdnRequestT* getOptEntAutExerAbdnRequestT(char* testCaseNum) {
	voptEntAutExerAbdnRequestT = (optEntAutExerAbdnRequestT*)malloc(sizeof(optEntAutExerAbdnRequestT));
	int i;

	voptEntAutExerAbdnRequestT->header = getDataHeaderT(testCaseNum, "optEntAutExerAbdnRequestT");
	voptEntAutExerAbdnRequestT->basic = getOptBscEntAutExerAbdnRequestT(testCaseNum, "optEntAutExerAbdnRequestT");
	voptEntAutExerAbdnRequestT->extension = getOptExtEntAutExerAbdnRequestT(testCaseNum, "optEntAutExerAbdnRequestT");
	return voptEntAutExerAbdnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntAutExerAbdnResponseT* getOptEntAutExerAbdnResponseT(char* testCaseNum) {
	voptEntAutExerAbdnResponseT = (optEntAutExerAbdnResponseT*)malloc(sizeof(optEntAutExerAbdnResponseT));
	int i;

	voptEntAutExerAbdnResponseT->header = getDataHeaderT(testCaseNum, "optEntAutExerAbdnResponseT");
	voptEntAutExerAbdnResponseT->extension = getOptExtEntAutExerAbdnResponseT(testCaseNum, "optEntAutExerAbdnResponseT");
	return voptEntAutExerAbdnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntAutExerAbdnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntAutExerAbdnRequestT));
	optEntAutExerAbdnRequestT *voptEntAutExerAbdnRequestT = getOptEntAutExerAbdnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntAutExerAbdnRequestT), (jbyte*) voptEntAutExerAbdnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntAutExerAbdnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntAutExerAbdnResponseT));
	optEntAutExerAbdnResponseT *voptEntAutExerAbdnResponseT = getOptEntAutExerAbdnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntAutExerAbdnResponseT), (jbyte*) voptEntAutExerAbdnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntAutExerAbdnRequestT(optBscEntAutExerAbdnRequestT actual, optBscEntAutExerAbdnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntAutExerAbdnRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntAutExerAbdnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntAutExerAbdnRequestT(optExtEntAutExerAbdnRequestT actual, optExtEntAutExerAbdnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.abdnQtyAdj, expected.abdnQtyAdj, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntAutExerAbdnRequestT, abdnQtyAdj not matching. Actual %s but Expected %s", actual.abdnQtyAdj, expected.abdnQtyAdj);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.password, expected.password, DRIV_LOGIN_MAX_PWDID)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntAutExerAbdnRequestT, password not matching. Actual %s but Expected %s", actual.password, expected.password);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpApprT (actual.trdrIdGrpAppr,expected.trdrIdGrpAppr, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntAutExerAbdnResponseT(optExtEntAutExerAbdnResponseT actual, optExtEntAutExerAbdnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.abdnQty, expected.abdnQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntAutExerAbdnResponseT, abdnQty not matching. Actual %s but Expected %s", actual.abdnQty, expected.abdnQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntAutExerAbdnRequestT(optEntAutExerAbdnRequestT actual, optEntAutExerAbdnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntAutExerAbdnRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntAutExerAbdnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntAutExerAbdnResponseT(optEntAutExerAbdnResponseT actual, optEntAutExerAbdnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptExtEntAutExerAbdnResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntAutExerAbdnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntAutExerAbdnRequestT *actualData = (optEntAutExerAbdnRequestT *)msgStruct;
	optEntAutExerAbdnRequestT* expectedData = getOptEntAutExerAbdnRequestT(testCaseNum);
	compareOptEntAutExerAbdnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntAutExerAbdnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntAutExerAbdnResponseT *actualData = (optEntAutExerAbdnResponseT *)msgStruct;
	optEntAutExerAbdnResponseT* expectedData = getOptEntAutExerAbdnResponseT(testCaseNum);
	compareOptEntAutExerAbdnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
