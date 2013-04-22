#include <InqEfpIdxTrd.hxx>
#define BUFFER_SIZE 1000

futInqEfpIdxTrdRequestT *vfutInqEfpIdxTrdRequestT;
futInqEfpIdxTrdResponseT *vfutInqEfpIdxTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfpIdxTrdRequestT getFutBscInqEfpIdxTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqEfpIdxTrdRequestT vfutBscInqEfpIdxTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqEfpIdxTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqEfpIdxTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscInqEfpIdxTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqEfpIdxTrdRequestT");	return vfutBscInqEfpIdxTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfpIdxTrdRecT getFutBscInqEfpIdxTrdRecT(char* testCaseNum , const char *root) {
	futBscInqEfpIdxTrdRecT vfutBscInqEfpIdxTrdRecT;
	int i;

	char lopnClsCod[1] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdRecT.opnClsCod", lopnClsCod);
	vfutBscInqEfpIdxTrdRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscInqEfpIdxTrdRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscInqEfpIdxTrdRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscInqEfpIdxTrdRecT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdRecT.setlInst", lsetlInst);
	memcpy(vfutBscInqEfpIdxTrdRecT.setlInst, lsetlInst, SETL_INST_LEN);

	vfutBscInqEfpIdxTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqEfpIdxTrdRecT");
	vfutBscInqEfpIdxTrdRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqEfpIdxTrdRecT");
	vfutBscInqEfpIdxTrdRecT.txtGrp = getTxtGrpT(testCaseNum, "futBscInqEfpIdxTrdRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscInqEfpIdxTrdRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscInqEfpIdxTrdRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lwhsTrdStsCod[1] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdRecT.whsTrdStsCod", lwhsTrdStsCod);
	vfutBscInqEfpIdxTrdRecT.whsTrdStsCod = lwhsTrdStsCod[0];
	return vfutBscInqEfpIdxTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfpIdxTrdResponseT getFutBscInqEfpIdxTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqEfpIdxTrdResponseT vfutBscInqEfpIdxTrdResponseT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdResponseT.buyCod", lbuyCod);
	vfutBscInqEfpIdxTrdResponseT.buyCod = lbuyCod[0];

	vfutBscInqEfpIdxTrdResponseT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqEfpIdxTrdResponseT");
	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscInqEfpIdxTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscInqEfpIdxTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vfutBscInqEfpIdxTrdResponseT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdResponseT.nomVal", lnomVal);
	memcpy(vfutBscInqEfpIdxTrdResponseT.nomVal, lnomVal, NOM_VAL_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqEfpIdxTrdResponseT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdResponseT.trdXQty", ltrdXQty);
	memcpy(vfutBscInqEfpIdxTrdResponseT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqEfpIdxTrdResponseT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdResponseT.futPrc", lfutPrc);
	memcpy(vfutBscInqEfpIdxTrdResponseT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscInqEfpIdxTrdResponseT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdResponseT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscInqEfpIdxTrdResponseT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscInqEfpIdxTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscInqEfpIdxTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<CSH_BSKT_REF_ID_LEN;i++) {
		vfutBscInqEfpIdxTrdResponseT.cshBsktRefId[i]= ' ';
	}
	char lcshBsktRefId[CSH_BSKT_REF_ID_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdResponseT.cshBsktRefId", lcshBsktRefId);
	memcpy(vfutBscInqEfpIdxTrdResponseT.cshBsktRefId, lcshBsktRefId, CSH_BSKT_REF_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqEfpIdxTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqEfpIdxTrd.futBscInqEfpIdxTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqEfpIdxTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqEfpIdxTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEfpIdxTrdRequestT* getFutInqEfpIdxTrdRequestT(char* testCaseNum) {
	vfutInqEfpIdxTrdRequestT = (futInqEfpIdxTrdRequestT*)malloc(sizeof(futInqEfpIdxTrdRequestT));
	int i;

	vfutInqEfpIdxTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqEfpIdxTrdRequestT");
	vfutInqEfpIdxTrdRequestT->basic = getFutBscInqEfpIdxTrdRequestT(testCaseNum, "futInqEfpIdxTrdRequestT");
	return vfutInqEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEfpIdxTrdResponseT* getFutInqEfpIdxTrdResponseT(char* testCaseNum) {
	vfutInqEfpIdxTrdResponseT = (futInqEfpIdxTrdResponseT*)malloc(sizeof(futInqEfpIdxTrdResponseT));
	int i;

	vfutInqEfpIdxTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqEfpIdxTrdResponseT");
	vfutInqEfpIdxTrdResponseT->basic = getFutBscInqEfpIdxTrdResponseT(testCaseNum, "futInqEfpIdxTrdResponseT");
	return vfutInqEfpIdxTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEfpIdxTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEfpIdxTrdRequestT));
	futInqEfpIdxTrdRequestT *vfutInqEfpIdxTrdRequestT = getFutInqEfpIdxTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEfpIdxTrdRequestT), (jbyte*) vfutInqEfpIdxTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEfpIdxTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEfpIdxTrdResponseT));
	futInqEfpIdxTrdResponseT *vfutInqEfpIdxTrdResponseT = getFutInqEfpIdxTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEfpIdxTrdResponseT), (jbyte*) vfutInqEfpIdxTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfpIdxTrdRequestT(futBscInqEfpIdxTrdRequestT actual, futBscInqEfpIdxTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfpIdxTrdRecT(futBscInqEfpIdxTrdRecT actual, futBscInqEfpIdxTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdRecT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.whsTrdStsCod!= expected.whsTrdStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdRecT, whsTrdStsCodnot matching. Actual %d but Expected %d", actual.whsTrdStsCod, expected.whsTrdStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfpIdxTrdResponseT(futBscInqEfpIdxTrdResponseT actual, futBscInqEfpIdxTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdResponseT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdResponseT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdResponseT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdResponseT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdResponseT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshBsktRefId, expected.cshBsktRefId, CSH_BSKT_REF_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdResponseT, cshBsktRefId not matching. Actual %s but Expected %s", actual.cshBsktRefId, expected.cshBsktRefId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_EFP_IDX_TRD_REC_MAX;i++) {
		compareFutBscInqEfpIdxTrdRecT (actual.futBscInqEfpIdxTrdRec[i],expected.futBscInqEfpIdxTrdRec[i], logMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfpIdxTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEfpIdxTrdRequestT(futInqEfpIdxTrdRequestT actual, futInqEfpIdxTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEfpIdxTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEfpIdxTrdResponseT(futInqEfpIdxTrdResponseT actual, futInqEfpIdxTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEfpIdxTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEfpIdxTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEfpIdxTrdRequestT *actualData = (futInqEfpIdxTrdRequestT *)msgStruct;
	futInqEfpIdxTrdRequestT* expectedData = getFutInqEfpIdxTrdRequestT(testCaseNum);
	compareFutInqEfpIdxTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEfpIdxTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEfpIdxTrdResponseT *actualData = (futInqEfpIdxTrdResponseT *)msgStruct;
	futInqEfpIdxTrdResponseT* expectedData = getFutInqEfpIdxTrdResponseT(testCaseNum);
	compareFutInqEfpIdxTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
