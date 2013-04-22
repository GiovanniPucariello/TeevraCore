#include <EntEbiEfpIdxTrd.hxx>
#define BUFFER_SIZE 1000

futEntEbiEfpIdxTrdRequestT *vfutEntEbiEfpIdxTrdRequestT;
futEntEbiEfpIdxTrdResponseT *vfutEntEbiEfpIdxTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEbiEfpIdxTrdRequestT getFutBscEntEbiEfpIdxTrdRequestT(char* testCaseNum , const char *root) {
	futBscEntEbiEfpIdxTrdRequestT vfutBscEntEbiEfpIdxTrdRequestT;
	int i;

	vfutBscEntEbiEfpIdxTrdRequestT.ebiTrdReqGrp = getEbiTrdReqGrpT(testCaseNum, "futBscEntEbiEfpIdxTrdRequestT");
	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscEntEbiEfpIdxTrdRequestT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("EntEbiEfpIdxTrd.futBscEntEbiEfpIdxTrdRequestT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscEntEbiEfpIdxTrdRequestT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscEntEbiEfpIdxTrdRequestT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("EntEbiEfpIdxTrd.futBscEntEbiEfpIdxTrdRequestT.setlInst", lsetlInst);
	memcpy(vfutBscEntEbiEfpIdxTrdRequestT.setlInst, lsetlInst, SETL_INST_LEN);

	for(i=0;i<CSH_BSKT_REF_ID_LEN;i++) {
		vfutBscEntEbiEfpIdxTrdRequestT.cshBsktRefId[i]= ' ';
	}
	char lcshBsktRefId[CSH_BSKT_REF_ID_LEN] = {""};
	getStrProperty("EntEbiEfpIdxTrd.futBscEntEbiEfpIdxTrdRequestT.cshBsktRefId", lcshBsktRefId);
	memcpy(vfutBscEntEbiEfpIdxTrdRequestT.cshBsktRefId, lcshBsktRefId, CSH_BSKT_REF_ID_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscEntEbiEfpIdxTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiEfpIdxTrd.futBscEntEbiEfpIdxTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscEntEbiEfpIdxTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscEntEbiEfpIdxTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEbiEfpIdxTrdResponseT getFutBscEntEbiEfpIdxTrdResponseT(char* testCaseNum , const char *root) {
	futBscEntEbiEfpIdxTrdResponseT vfutBscEntEbiEfpIdxTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscEntEbiEfpIdxTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("EntEbiEfpIdxTrd.futBscEntEbiEfpIdxTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscEntEbiEfpIdxTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscEntEbiEfpIdxTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("EntEbiEfpIdxTrd.futBscEntEbiEfpIdxTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscEntEbiEfpIdxTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntEbiEfpIdxTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntEbiEfpIdxTrd.futBscEntEbiEfpIdxTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntEbiEfpIdxTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscEntEbiEfpIdxTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiEfpIdxTrd.futBscEntEbiEfpIdxTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscEntEbiEfpIdxTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscEntEbiEfpIdxTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEbiEfpIdxTrdRequestT* getFutEntEbiEfpIdxTrdRequestT(char* testCaseNum) {
	vfutEntEbiEfpIdxTrdRequestT = (futEntEbiEfpIdxTrdRequestT*)malloc(sizeof(futEntEbiEfpIdxTrdRequestT));
	int i;

	vfutEntEbiEfpIdxTrdRequestT->header = getDataHeaderT(testCaseNum, "futEntEbiEfpIdxTrdRequestT");
	vfutEntEbiEfpIdxTrdRequestT->basic = getFutBscEntEbiEfpIdxTrdRequestT(testCaseNum, "futEntEbiEfpIdxTrdRequestT");
	return vfutEntEbiEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEbiEfpIdxTrdResponseT* getFutEntEbiEfpIdxTrdResponseT(char* testCaseNum) {
	vfutEntEbiEfpIdxTrdResponseT = (futEntEbiEfpIdxTrdResponseT*)malloc(sizeof(futEntEbiEfpIdxTrdResponseT));
	int i;

	vfutEntEbiEfpIdxTrdResponseT->header = getDataHeaderT(testCaseNum, "futEntEbiEfpIdxTrdResponseT");
	vfutEntEbiEfpIdxTrdResponseT->basic = getFutBscEntEbiEfpIdxTrdResponseT(testCaseNum, "futEntEbiEfpIdxTrdResponseT");
	return vfutEntEbiEfpIdxTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEbiEfpIdxTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEbiEfpIdxTrdRequestT));
	futEntEbiEfpIdxTrdRequestT *vfutEntEbiEfpIdxTrdRequestT = getFutEntEbiEfpIdxTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEbiEfpIdxTrdRequestT), (jbyte*) vfutEntEbiEfpIdxTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEbiEfpIdxTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEbiEfpIdxTrdResponseT));
	futEntEbiEfpIdxTrdResponseT *vfutEntEbiEfpIdxTrdResponseT = getFutEntEbiEfpIdxTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEbiEfpIdxTrdResponseT), (jbyte*) vfutEntEbiEfpIdxTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEbiEfpIdxTrdRequestT(futBscEntEbiEfpIdxTrdRequestT actual, futBscEntEbiEfpIdxTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareEbiTrdReqGrpT (actual.ebiTrdReqGrp,expected.ebiTrdReqGrp, logMsg);
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpIdxTrdRequestT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpIdxTrdRequestT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshBsktRefId, expected.cshBsktRefId, CSH_BSKT_REF_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpIdxTrdRequestT, cshBsktRefId not matching. Actual %s but Expected %s", actual.cshBsktRefId, expected.cshBsktRefId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpIdxTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_EBI_EFP_FIN_TRD_REQ_GRP_MAX;i++) {
		compareBscEntEbiTrdReqGrpT (actual.bscEntEbiTrdReqGrp[i],expected.bscEntEbiTrdReqGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEbiEfpIdxTrdResponseT(futBscEntEbiEfpIdxTrdResponseT actual, futBscEntEbiEfpIdxTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpIdxTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpIdxTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpIdxTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpIdxTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_EBI_TRD_RESP_REC_MAX;i++) {
		compareBscEntEbiTrdRespRecT (actual.bscEntEbiTrdRespRec[i],expected.bscEntEbiTrdRespRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEbiEfpIdxTrdRequestT(futEntEbiEfpIdxTrdRequestT actual, futEntEbiEfpIdxTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEbiEfpIdxTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEbiEfpIdxTrdResponseT(futEntEbiEfpIdxTrdResponseT actual, futEntEbiEfpIdxTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEbiEfpIdxTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEbiEfpIdxTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEbiEfpIdxTrdRequestT *actualData = (futEntEbiEfpIdxTrdRequestT *)msgStruct;
	futEntEbiEfpIdxTrdRequestT* expectedData = getFutEntEbiEfpIdxTrdRequestT(testCaseNum);
	compareFutEntEbiEfpIdxTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEbiEfpIdxTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEbiEfpIdxTrdResponseT *actualData = (futEntEbiEfpIdxTrdResponseT *)msgStruct;
	futEntEbiEfpIdxTrdResponseT* expectedData = getFutEntEbiEfpIdxTrdResponseT(testCaseNum);
	compareFutEntEbiEfpIdxTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
