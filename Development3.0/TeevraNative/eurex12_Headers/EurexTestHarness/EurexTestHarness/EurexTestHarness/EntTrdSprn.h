#include <EntTrdSprn.hxx>
#define BUFFER_SIZE 1000

futEntTrdSprnRequestT *vfutEntTrdSprnRequestT;
futEntTrdSprnResponseT *vfutEntTrdSprnResponseT;
optEntTrdSprnRequestT *voptEntTrdSprnRequestT;
optEntTrdSprnResponseT *voptEntTrdSprnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdSprnRecT getFutBscEntTrdSprnRecT(char* testCaseNum , const char *root) {
	futBscEntTrdSprnRecT vfutBscEntTrdSprnRecT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntTrdSprnRecT.trnLngQty[i]= ' ';
	}
	char ltrnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRecT.trnLngQty", ltrnLngQty);
	memcpy(vfutBscEntTrdSprnRecT.trnLngQty, ltrnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntTrdSprnRecT.trnShtQty[i]= ' ';
	}
	char ltrnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRecT.trnShtQty", ltrnShtQty);
	memcpy(vfutBscEntTrdSprnRecT.trnShtQty, ltrnShtQty, DRIV_QUANTITY_LEN);
	return vfutBscEntTrdSprnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdSprnRequestT getFutBscEntTrdSprnRequestT(char* testCaseNum , const char *root) {
	futBscEntTrdSprnRequestT vfutBscEntTrdSprnRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscEntTrdSprnRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscEntTrdSprnRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscEntTrdSprnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscEntTrdSprnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscEntTrdSprnRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscEntTrdSprnRequestT");
	vfutBscEntTrdSprnRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntTrdSprnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntTrdSprnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRequestT.trnDat", ltrnDat);
	memcpy(vfutBscEntTrdSprnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntTrdSprnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRequestT.ordrNo", lordrNo);
	memcpy(vfutBscEntTrdSprnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntTrdSprnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntTrdSprnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscEntTrdSprnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscEntTrdSprnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRequestT.buyCod", lbuyCod);
	vfutBscEntTrdSprnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntTrdSprnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntTrdSprnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscEntTrdSprnRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscEntTrdSprnRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscEntTrdSprnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntTrdSprnRequestT getFutExtEntTrdSprnRequestT(char* testCaseNum , const char *root) {
	futExtEntTrdSprnRequestT vfutExtEntTrdSprnRequestT;
	int i;
	return vfutExtEntTrdSprnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdSprnRecResT getFutBscEntTrdSprnRecResT(char* testCaseNum , const char *root) {
	futBscEntTrdSprnRecResT vfutBscEntTrdSprnRecResT;
	int i;

	vfutBscEntTrdSprnRecResT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "futBscEntTrdSprnRecResT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntTrdSprnRecResT.trnVmarAmnt[i]= ' ';
	}
	char ltrnVmarAmnt[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRecResT.trnVmarAmnt", ltrnVmarAmnt);
	memcpy(vfutBscEntTrdSprnRecResT.trnVmarAmnt, ltrnVmarAmnt, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscEntTrdSprnRecResT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnRecResT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(vfutBscEntTrdSprnRecResT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);
	return vfutBscEntTrdSprnRecResT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdSprnResponseT getFutBscEntTrdSprnResponseT(char* testCaseNum , const char *root) {
	futBscEntTrdSprnResponseT vfutBscEntTrdSprnResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntTrdSprnResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntTrdSprnResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscEntTrdSprnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntTrdSprn.futBscEntTrdSprnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscEntTrdSprnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscEntTrdSprnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdSprnRecT getOptBscEntTrdSprnRecT(char* testCaseNum , const char *root) {
	optBscEntTrdSprnRecT voptBscEntTrdSprnRecT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntTrdSprnRecT.trnLngQty[i]= ' ';
	}
	char ltrnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRecT.trnLngQty", ltrnLngQty);
	memcpy(voptBscEntTrdSprnRecT.trnLngQty, ltrnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntTrdSprnRecT.trnShtQty[i]= ' ';
	}
	char ltrnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRecT.trnShtQty", ltrnShtQty);
	memcpy(voptBscEntTrdSprnRecT.trnShtQty, ltrnShtQty, DRIV_QUANTITY_LEN);
	return voptBscEntTrdSprnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdSprnRequestT getOptBscEntTrdSprnRequestT(char* testCaseNum , const char *root) {
	optBscEntTrdSprnRequestT voptBscEntTrdSprnRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscEntTrdSprnRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscEntTrdSprnRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscEntTrdSprnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscEntTrdSprnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscEntTrdSprnRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscEntTrdSprnRequestT");
	voptBscEntTrdSprnRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntTrdSprnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntTrdSprnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRequestT.trnDat", ltrnDat);
	memcpy(voptBscEntTrdSprnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntTrdSprnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRequestT.ordrNo", lordrNo);
	memcpy(voptBscEntTrdSprnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntTrdSprnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntTrdSprnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscEntTrdSprnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscEntTrdSprnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRequestT.buyCod", lbuyCod);
	voptBscEntTrdSprnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntTrdSprnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntTrdSprnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscEntTrdSprnRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRequestT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscEntTrdSprnRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscEntTrdSprnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntTrdSprnRequestT getOptExtEntTrdSprnRequestT(char* testCaseNum , const char *root) {
	optExtEntTrdSprnRequestT voptExtEntTrdSprnRequestT;
	int i;
	return voptExtEntTrdSprnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdSprnRecResT getOptBscEntTrdSprnRecResT(char* testCaseNum , const char *root) {
	optBscEntTrdSprnRecResT voptBscEntTrdSprnRecResT;
	int i;

	voptBscEntTrdSprnRecResT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "optBscEntTrdSprnRecResT");
	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscEntTrdSprnRecResT.trnPrmAmnt[i]= ' ';
	}
	char ltrnPrmAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRecResT.trnPrmAmnt", ltrnPrmAmnt);
	memcpy(voptBscEntTrdSprnRecResT.trnPrmAmnt, ltrnPrmAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscEntTrdSprnRecResT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnRecResT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(voptBscEntTrdSprnRecResT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);
	return voptBscEntTrdSprnRecResT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdSprnResponseT getOptBscEntTrdSprnResponseT(char* testCaseNum , const char *root) {
	optBscEntTrdSprnResponseT voptBscEntTrdSprnResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntTrdSprnResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnResponseT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntTrdSprnResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscEntTrdSprnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntTrdSprn.optBscEntTrdSprnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscEntTrdSprnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscEntTrdSprnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTrdSprnRequestT* getFutEntTrdSprnRequestT(char* testCaseNum) {
	vfutEntTrdSprnRequestT = (futEntTrdSprnRequestT*)malloc(sizeof(futEntTrdSprnRequestT));
	int i;

	vfutEntTrdSprnRequestT->header = getDataHeaderT(testCaseNum, "futEntTrdSprnRequestT");
	vfutEntTrdSprnRequestT->basic = getFutBscEntTrdSprnRequestT(testCaseNum, "futEntTrdSprnRequestT");
	vfutEntTrdSprnRequestT->extension = getFutExtEntTrdSprnRequestT(testCaseNum, "futEntTrdSprnRequestT");
	return vfutEntTrdSprnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTrdSprnResponseT* getFutEntTrdSprnResponseT(char* testCaseNum) {
	vfutEntTrdSprnResponseT = (futEntTrdSprnResponseT*)malloc(sizeof(futEntTrdSprnResponseT));
	int i;

	vfutEntTrdSprnResponseT->header = getDataHeaderT(testCaseNum, "futEntTrdSprnResponseT");
	vfutEntTrdSprnResponseT->basic = getFutBscEntTrdSprnResponseT(testCaseNum, "futEntTrdSprnResponseT");
	return vfutEntTrdSprnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTrdSprnRequestT* getOptEntTrdSprnRequestT(char* testCaseNum) {
	voptEntTrdSprnRequestT = (optEntTrdSprnRequestT*)malloc(sizeof(optEntTrdSprnRequestT));
	int i;

	voptEntTrdSprnRequestT->header = getDataHeaderT(testCaseNum, "optEntTrdSprnRequestT");
	voptEntTrdSprnRequestT->basic = getOptBscEntTrdSprnRequestT(testCaseNum, "optEntTrdSprnRequestT");
	voptEntTrdSprnRequestT->extension = getOptExtEntTrdSprnRequestT(testCaseNum, "optEntTrdSprnRequestT");
	return voptEntTrdSprnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTrdSprnResponseT* getOptEntTrdSprnResponseT(char* testCaseNum) {
	voptEntTrdSprnResponseT = (optEntTrdSprnResponseT*)malloc(sizeof(optEntTrdSprnResponseT));
	int i;

	voptEntTrdSprnResponseT->header = getDataHeaderT(testCaseNum, "optEntTrdSprnResponseT");
	voptEntTrdSprnResponseT->basic = getOptBscEntTrdSprnResponseT(testCaseNum, "optEntTrdSprnResponseT");
	return voptEntTrdSprnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTrdSprnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTrdSprnRequestT));
	futEntTrdSprnRequestT *vfutEntTrdSprnRequestT = getFutEntTrdSprnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTrdSprnRequestT), (jbyte*) vfutEntTrdSprnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTrdSprnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTrdSprnResponseT));
	futEntTrdSprnResponseT *vfutEntTrdSprnResponseT = getFutEntTrdSprnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTrdSprnResponseT), (jbyte*) vfutEntTrdSprnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTrdSprnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTrdSprnRequestT));
	optEntTrdSprnRequestT *voptEntTrdSprnRequestT = getOptEntTrdSprnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTrdSprnRequestT), (jbyte*) voptEntTrdSprnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTrdSprnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTrdSprnResponseT));
	optEntTrdSprnResponseT *voptEntTrdSprnResponseT = getOptEntTrdSprnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTrdSprnResponseT), (jbyte*) voptEntTrdSprnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdSprnRecT(futBscEntTrdSprnRecT actual, futBscEntTrdSprnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnLngQty, expected.trnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRecT, trnLngQty not matching. Actual %s but Expected %s", actual.trnLngQty, expected.trnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnShtQty, expected.trnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRecT, trnShtQty not matching. Actual %s but Expected %s", actual.trnShtQty, expected.trnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdSprnRequestT(futBscEntTrdSprnRequestT actual, futBscEntTrdSprnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_ENT_TRD_SPRN_REC_MAX;i++) {
		compareFutBscEntTrdSprnRecT (actual.futBscEntTrdSprnRec[i],expected.futBscEntTrdSprnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntTrdSprnRequestT(futExtEntTrdSprnRequestT actual, futExtEntTrdSprnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_ENT_TRD_SPRN_GRP_MAX;i++) {
		compareTxtGrpT (actual.txtGrp[i],expected.txtGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdSprnRecResT(futBscEntTrdSprnRecResT actual, futBscEntTrdSprnRecResT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.trnVmarAmnt, expected.trnVmarAmnt, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRecResT, trnVmarAmnt not matching. Actual %s but Expected %s", actual.trnVmarAmnt, expected.trnVmarAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnRecResT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdSprnResponseT(futBscEntTrdSprnResponseT actual, futBscEntTrdSprnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdSprnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_ENT_TRD_SPRN_REC_MAX;i++) {
		compareFutBscEntTrdSprnRecResT (actual.futBscEntTrdSprnRecRes[i],expected.futBscEntTrdSprnRecRes[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdSprnRecT(optBscEntTrdSprnRecT actual, optBscEntTrdSprnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnLngQty, expected.trnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRecT, trnLngQty not matching. Actual %s but Expected %s", actual.trnLngQty, expected.trnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnShtQty, expected.trnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRecT, trnShtQty not matching. Actual %s but Expected %s", actual.trnShtQty, expected.trnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdSprnRequestT(optBscEntTrdSprnRequestT actual, optBscEntTrdSprnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_ENT_TRD_SPRN_REC_MAX;i++) {
		compareOptBscEntTrdSprnRecT (actual.optBscEntTrdSprnRec[i],expected.optBscEntTrdSprnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntTrdSprnRequestT(optExtEntTrdSprnRequestT actual, optExtEntTrdSprnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_ENT_TRD_SPRN_GRP_MAX;i++) {
		compareTxtGrpT (actual.txtGrp[i],expected.txtGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdSprnRecResT(optBscEntTrdSprnRecResT actual, optBscEntTrdSprnRecResT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.trnPrmAmnt, expected.trnPrmAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRecResT, trnPrmAmnt not matching. Actual %s but Expected %s", actual.trnPrmAmnt, expected.trnPrmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnRecResT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdSprnResponseT(optBscEntTrdSprnResponseT actual, optBscEntTrdSprnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdSprnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_ENT_TRD_SPRN_REC_MAX;i++) {
		compareOptBscEntTrdSprnRecResT (actual.optBscEntTrdSprnRecRes[i],expected.optBscEntTrdSprnRecRes[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTrdSprnRequestT(futEntTrdSprnRequestT actual, futEntTrdSprnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTrdSprnRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntTrdSprnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTrdSprnResponseT(futEntTrdSprnResponseT actual, futEntTrdSprnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTrdSprnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTrdSprnRequestT(optEntTrdSprnRequestT actual, optEntTrdSprnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTrdSprnRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntTrdSprnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTrdSprnResponseT(optEntTrdSprnResponseT actual, optEntTrdSprnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTrdSprnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTrdSprnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTrdSprnRequestT *actualData = (futEntTrdSprnRequestT *)msgStruct;
	futEntTrdSprnRequestT* expectedData = getFutEntTrdSprnRequestT(testCaseNum);
	compareFutEntTrdSprnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTrdSprnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTrdSprnResponseT *actualData = (futEntTrdSprnResponseT *)msgStruct;
	futEntTrdSprnResponseT* expectedData = getFutEntTrdSprnResponseT(testCaseNum);
	compareFutEntTrdSprnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTrdSprnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTrdSprnRequestT *actualData = (optEntTrdSprnRequestT *)msgStruct;
	optEntTrdSprnRequestT* expectedData = getOptEntTrdSprnRequestT(testCaseNum);
	compareOptEntTrdSprnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTrdSprnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTrdSprnResponseT *actualData = (optEntTrdSprnResponseT *)msgStruct;
	optEntTrdSprnResponseT* expectedData = getOptEntTrdSprnResponseT(testCaseNum);
	compareOptEntTrdSprnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
