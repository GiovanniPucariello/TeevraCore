#include <EntPosnMembTsf.hxx>
#define BUFFER_SIZE 1000

futEntPosnMembTsfRequestT *vfutEntPosnMembTsfRequestT;
futEntPosnMembTsfResponseT *vfutEntPosnMembTsfResponseT;
optEntPosnMembTsfRequestT *voptEntPosnMembTsfRequestT;
optEntPosnMembTsfResponseT *voptEntPosnMembTsfResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntPosnMembTsfRequestT getFutBscEntPosnMembTsfRequestT(char* testCaseNum , const char *root) {
	futBscEntPosnMembTsfRequestT vfutBscEntPosnMembTsfRequestT;
	int i;

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		vfutBscEntPosnMembTsfRequestT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("EntPosnMembTsf.futBscEntPosnMembTsfRequestT.posTrnTyp", lposTrnTyp);
	memcpy(vfutBscEntPosnMembTsfRequestT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscEntPosnMembTsfRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntPosnMembTsf.futBscEntPosnMembTsfRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscEntPosnMembTsfRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscEntPosnMembTsfRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntPosnMembTsf.futBscEntPosnMembTsfRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscEntPosnMembTsfRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscEntPosnMembTsfRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("EntPosnMembTsf.futBscEntPosnMembTsfRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscEntPosnMembTsfRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscEntPosnMembTsfRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntPosnMembTsf.futBscEntPosnMembTsfRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscEntPosnMembTsfRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscEntPosnMembTsfRequestT.acctTypCodFromGrp = getAcctTypCodFromGrpT(testCaseNum, "futBscEntPosnMembTsfRequestT");
	vfutBscEntPosnMembTsfRequestT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "futBscEntPosnMembTsfRequestT");
	vfutBscEntPosnMembTsfRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntPosnMembTsfRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntPosnMembTsfRequestT.trnLngQty[i]= ' ';
	}
	char ltrnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnMembTsf.futBscEntPosnMembTsfRequestT.trnLngQty", ltrnLngQty);
	memcpy(vfutBscEntPosnMembTsfRequestT.trnLngQty, ltrnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntPosnMembTsfRequestT.trnShtQty[i]= ' ';
	}
	char ltrnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnMembTsf.futBscEntPosnMembTsfRequestT.trnShtQty", ltrnShtQty);
	memcpy(vfutBscEntPosnMembTsfRequestT.trnShtQty, ltrnShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscEntPosnMembTsfRequestT.cshAmntPosnTsf[i]= ' ';
	}
	char lcshAmntPosnTsf[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntPosnMembTsf.futBscEntPosnMembTsfRequestT.cshAmntPosnTsf", lcshAmntPosnTsf);
	memcpy(vfutBscEntPosnMembTsfRequestT.cshAmntPosnTsf, lcshAmntPosnTsf, DRIV_AMOUNT_LEN);

	vfutBscEntPosnMembTsfRequestT.txtGrp = getTxtGrpT(testCaseNum, "futBscEntPosnMembTsfRequestT");	return vfutBscEntPosnMembTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntPosnMembTsfResponseT getFutBscEntPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	futBscEntPosnMembTsfResponseT vfutBscEntPosnMembTsfResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntPosnMembTsfResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntPosnMembTsf.futBscEntPosnMembTsfResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntPosnMembTsfResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return vfutBscEntPosnMembTsfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntPosnMembTsfRequestT getOptBscEntPosnMembTsfRequestT(char* testCaseNum , const char *root) {
	optBscEntPosnMembTsfRequestT voptBscEntPosnMembTsfRequestT;
	int i;

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		voptBscEntPosnMembTsfRequestT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("EntPosnMembTsf.optBscEntPosnMembTsfRequestT.posTrnTyp", lposTrnTyp);
	memcpy(voptBscEntPosnMembTsfRequestT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscEntPosnMembTsfRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntPosnMembTsf.optBscEntPosnMembTsfRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscEntPosnMembTsfRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscEntPosnMembTsfRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntPosnMembTsf.optBscEntPosnMembTsfRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscEntPosnMembTsfRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscEntPosnMembTsfRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("EntPosnMembTsf.optBscEntPosnMembTsfRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscEntPosnMembTsfRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscEntPosnMembTsfRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntPosnMembTsf.optBscEntPosnMembTsfRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscEntPosnMembTsfRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscEntPosnMembTsfRequestT.acctTypCodFromGrp = getAcctTypCodFromGrpT(testCaseNum, "optBscEntPosnMembTsfRequestT");
	voptBscEntPosnMembTsfRequestT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "optBscEntPosnMembTsfRequestT");
	voptBscEntPosnMembTsfRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntPosnMembTsfRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntPosnMembTsfRequestT.trnLngQty[i]= ' ';
	}
	char ltrnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnMembTsf.optBscEntPosnMembTsfRequestT.trnLngQty", ltrnLngQty);
	memcpy(voptBscEntPosnMembTsfRequestT.trnLngQty, ltrnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntPosnMembTsfRequestT.trnShtQty[i]= ' ';
	}
	char ltrnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnMembTsf.optBscEntPosnMembTsfRequestT.trnShtQty", ltrnShtQty);
	memcpy(voptBscEntPosnMembTsfRequestT.trnShtQty, ltrnShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscEntPosnMembTsfRequestT.cshAmntPosnTsf[i]= ' ';
	}
	char lcshAmntPosnTsf[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntPosnMembTsf.optBscEntPosnMembTsfRequestT.cshAmntPosnTsf", lcshAmntPosnTsf);
	memcpy(voptBscEntPosnMembTsfRequestT.cshAmntPosnTsf, lcshAmntPosnTsf, DRIV_AMOUNT_LEN);

	voptBscEntPosnMembTsfRequestT.txtGrp = getTxtGrpT(testCaseNum, "optBscEntPosnMembTsfRequestT");	return voptBscEntPosnMembTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntPosnMembTsfResponseT getOptBscEntPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	optBscEntPosnMembTsfResponseT voptBscEntPosnMembTsfResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntPosnMembTsfResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntPosnMembTsf.optBscEntPosnMembTsfResponseT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntPosnMembTsfResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return voptBscEntPosnMembTsfResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntPosnMembTsfRequestT* getFutEntPosnMembTsfRequestT(char* testCaseNum) {
	vfutEntPosnMembTsfRequestT = (futEntPosnMembTsfRequestT*)malloc(sizeof(futEntPosnMembTsfRequestT));
	int i;

	vfutEntPosnMembTsfRequestT->header = getDataHeaderT(testCaseNum, "futEntPosnMembTsfRequestT");
	vfutEntPosnMembTsfRequestT->basic = getFutBscEntPosnMembTsfRequestT(testCaseNum, "futEntPosnMembTsfRequestT");
	return vfutEntPosnMembTsfRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntPosnMembTsfResponseT* getFutEntPosnMembTsfResponseT(char* testCaseNum) {
	vfutEntPosnMembTsfResponseT = (futEntPosnMembTsfResponseT*)malloc(sizeof(futEntPosnMembTsfResponseT));
	int i;

	vfutEntPosnMembTsfResponseT->header = getDataHeaderT(testCaseNum, "futEntPosnMembTsfResponseT");
	vfutEntPosnMembTsfResponseT->basic = getFutBscEntPosnMembTsfResponseT(testCaseNum, "futEntPosnMembTsfResponseT");
	return vfutEntPosnMembTsfResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntPosnMembTsfRequestT* getOptEntPosnMembTsfRequestT(char* testCaseNum) {
	voptEntPosnMembTsfRequestT = (optEntPosnMembTsfRequestT*)malloc(sizeof(optEntPosnMembTsfRequestT));
	int i;

	voptEntPosnMembTsfRequestT->header = getDataHeaderT(testCaseNum, "optEntPosnMembTsfRequestT");
	voptEntPosnMembTsfRequestT->basic = getOptBscEntPosnMembTsfRequestT(testCaseNum, "optEntPosnMembTsfRequestT");
	return voptEntPosnMembTsfRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntPosnMembTsfResponseT* getOptEntPosnMembTsfResponseT(char* testCaseNum) {
	voptEntPosnMembTsfResponseT = (optEntPosnMembTsfResponseT*)malloc(sizeof(optEntPosnMembTsfResponseT));
	int i;

	voptEntPosnMembTsfResponseT->header = getDataHeaderT(testCaseNum, "optEntPosnMembTsfResponseT");
	voptEntPosnMembTsfResponseT->basic = getOptBscEntPosnMembTsfResponseT(testCaseNum, "optEntPosnMembTsfResponseT");
	return voptEntPosnMembTsfResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntPosnMembTsfRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntPosnMembTsfRequestT));
	futEntPosnMembTsfRequestT *vfutEntPosnMembTsfRequestT = getFutEntPosnMembTsfRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntPosnMembTsfRequestT), (jbyte*) vfutEntPosnMembTsfRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntPosnMembTsfResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntPosnMembTsfResponseT));
	futEntPosnMembTsfResponseT *vfutEntPosnMembTsfResponseT = getFutEntPosnMembTsfResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntPosnMembTsfResponseT), (jbyte*) vfutEntPosnMembTsfResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntPosnMembTsfRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntPosnMembTsfRequestT));
	optEntPosnMembTsfRequestT *voptEntPosnMembTsfRequestT = getOptEntPosnMembTsfRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntPosnMembTsfRequestT), (jbyte*) voptEntPosnMembTsfRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntPosnMembTsfResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntPosnMembTsfResponseT));
	optEntPosnMembTsfResponseT *voptEntPosnMembTsfResponseT = getOptEntPosnMembTsfResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntPosnMembTsfResponseT), (jbyte*) voptEntPosnMembTsfResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntPosnMembTsfRequestT(futBscEntPosnMembTsfRequestT actual, futBscEntPosnMembTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnMembTsfRequestT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnMembTsfRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnMembTsfRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnMembTsfRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnMembTsfRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodFromGrpT (actual.acctTypCodFromGrp,expected.acctTypCodFromGrp, logMsg);
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnLngQty, expected.trnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnMembTsfRequestT, trnLngQty not matching. Actual %s but Expected %s", actual.trnLngQty, expected.trnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnShtQty, expected.trnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnMembTsfRequestT, trnShtQty not matching. Actual %s but Expected %s", actual.trnShtQty, expected.trnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshAmntPosnTsf, expected.cshAmntPosnTsf, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnMembTsfRequestT, cshAmntPosnTsf not matching. Actual %s but Expected %s", actual.cshAmntPosnTsf, expected.cshAmntPosnTsf);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntPosnMembTsfResponseT(futBscEntPosnMembTsfResponseT actual, futBscEntPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnMembTsfResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntPosnMembTsfRequestT(optBscEntPosnMembTsfRequestT actual, optBscEntPosnMembTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnMembTsfRequestT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnMembTsfRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnMembTsfRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnMembTsfRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnMembTsfRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodFromGrpT (actual.acctTypCodFromGrp,expected.acctTypCodFromGrp, logMsg);
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnLngQty, expected.trnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnMembTsfRequestT, trnLngQty not matching. Actual %s but Expected %s", actual.trnLngQty, expected.trnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnShtQty, expected.trnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnMembTsfRequestT, trnShtQty not matching. Actual %s but Expected %s", actual.trnShtQty, expected.trnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshAmntPosnTsf, expected.cshAmntPosnTsf, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnMembTsfRequestT, cshAmntPosnTsf not matching. Actual %s but Expected %s", actual.cshAmntPosnTsf, expected.cshAmntPosnTsf);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntPosnMembTsfResponseT(optBscEntPosnMembTsfResponseT actual, optBscEntPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnMembTsfResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntPosnMembTsfRequestT(futEntPosnMembTsfRequestT actual, futEntPosnMembTsfRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntPosnMembTsfRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntPosnMembTsfResponseT(futEntPosnMembTsfResponseT actual, futEntPosnMembTsfResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntPosnMembTsfResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntPosnMembTsfRequestT(optEntPosnMembTsfRequestT actual, optEntPosnMembTsfRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntPosnMembTsfRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntPosnMembTsfResponseT(optEntPosnMembTsfResponseT actual, optEntPosnMembTsfResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntPosnMembTsfResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntPosnMembTsfRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntPosnMembTsfRequestT *actualData = (futEntPosnMembTsfRequestT *)msgStruct;
	futEntPosnMembTsfRequestT* expectedData = getFutEntPosnMembTsfRequestT(testCaseNum);
	compareFutEntPosnMembTsfRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntPosnMembTsfResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntPosnMembTsfResponseT *actualData = (futEntPosnMembTsfResponseT *)msgStruct;
	futEntPosnMembTsfResponseT* expectedData = getFutEntPosnMembTsfResponseT(testCaseNum);
	compareFutEntPosnMembTsfResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntPosnMembTsfRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntPosnMembTsfRequestT *actualData = (optEntPosnMembTsfRequestT *)msgStruct;
	optEntPosnMembTsfRequestT* expectedData = getOptEntPosnMembTsfRequestT(testCaseNum);
	compareOptEntPosnMembTsfRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntPosnMembTsfResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntPosnMembTsfResponseT *actualData = (optEntPosnMembTsfResponseT *)msgStruct;
	optEntPosnMembTsfResponseT* expectedData = getOptEntPosnMembTsfResponseT(testCaseNum);
	compareOptEntPosnMembTsfResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
