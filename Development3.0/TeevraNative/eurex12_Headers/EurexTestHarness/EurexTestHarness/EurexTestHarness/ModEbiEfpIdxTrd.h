#include <ModEbiEfpIdxTrd.hxx>
#define BUFFER_SIZE 1000

futModEbiEfpIdxTrdRequestT *vfutModEbiEfpIdxTrdRequestT;
futModEbiEfpIdxTrdResponseT *vfutModEbiEfpIdxTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEbiEfpIdxTrdRequestT getFutBscModEbiEfpIdxTrdRequestT(char* testCaseNum , const char *root) {
	futBscModEbiEfpIdxTrdRequestT vfutBscModEbiEfpIdxTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscModEbiEfpIdxTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("ModEbiEfpIdxTrd.futBscModEbiEfpIdxTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscModEbiEfpIdxTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	vfutBscModEbiEfpIdxTrdRequestT.ebiTrdReqGrp = getEbiTrdReqGrpT(testCaseNum, "futBscModEbiEfpIdxTrdRequestT");
	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscModEbiEfpIdxTrdRequestT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("ModEbiEfpIdxTrd.futBscModEbiEfpIdxTrdRequestT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscModEbiEfpIdxTrdRequestT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscModEbiEfpIdxTrdRequestT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("ModEbiEfpIdxTrd.futBscModEbiEfpIdxTrdRequestT.setlInst", lsetlInst);
	memcpy(vfutBscModEbiEfpIdxTrdRequestT.setlInst, lsetlInst, SETL_INST_LEN);

	for(i=0;i<CSH_BSKT_REF_ID_LEN;i++) {
		vfutBscModEbiEfpIdxTrdRequestT.cshBsktRefId[i]= ' ';
	}
	char lcshBsktRefId[CSH_BSKT_REF_ID_LEN] = {""};
	getStrProperty("ModEbiEfpIdxTrd.futBscModEbiEfpIdxTrdRequestT.cshBsktRefId", lcshBsktRefId);
	memcpy(vfutBscModEbiEfpIdxTrdRequestT.cshBsktRefId, lcshBsktRefId, CSH_BSKT_REF_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEbiEfpIdxTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiEfpIdxTrd.futBscModEbiEfpIdxTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEbiEfpIdxTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscModEbiEfpIdxTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiEfpIdxTrd.futBscModEbiEfpIdxTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscModEbiEfpIdxTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscModEbiEfpIdxTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEbiEfpIdxTrdResponseT getFutBscModEbiEfpIdxTrdResponseT(char* testCaseNum , const char *root) {
	futBscModEbiEfpIdxTrdResponseT vfutBscModEbiEfpIdxTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscModEbiEfpIdxTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("ModEbiEfpIdxTrd.futBscModEbiEfpIdxTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscModEbiEfpIdxTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscModEbiEfpIdxTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("ModEbiEfpIdxTrd.futBscModEbiEfpIdxTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscModEbiEfpIdxTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEbiEfpIdxTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiEfpIdxTrd.futBscModEbiEfpIdxTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEbiEfpIdxTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscModEbiEfpIdxTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiEfpIdxTrd.futBscModEbiEfpIdxTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscModEbiEfpIdxTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscModEbiEfpIdxTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEbiEfpIdxTrdRequestT* getFutModEbiEfpIdxTrdRequestT(char* testCaseNum) {
	vfutModEbiEfpIdxTrdRequestT = (futModEbiEfpIdxTrdRequestT*)malloc(sizeof(futModEbiEfpIdxTrdRequestT));
	int i;

	vfutModEbiEfpIdxTrdRequestT->header = getDataHeaderT(testCaseNum, "futModEbiEfpIdxTrdRequestT");
	vfutModEbiEfpIdxTrdRequestT->basic = getFutBscModEbiEfpIdxTrdRequestT(testCaseNum, "futModEbiEfpIdxTrdRequestT");
	return vfutModEbiEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEbiEfpIdxTrdResponseT* getFutModEbiEfpIdxTrdResponseT(char* testCaseNum) {
	vfutModEbiEfpIdxTrdResponseT = (futModEbiEfpIdxTrdResponseT*)malloc(sizeof(futModEbiEfpIdxTrdResponseT));
	int i;

	vfutModEbiEfpIdxTrdResponseT->header = getDataHeaderT(testCaseNum, "futModEbiEfpIdxTrdResponseT");
	vfutModEbiEfpIdxTrdResponseT->basic = getFutBscModEbiEfpIdxTrdResponseT(testCaseNum, "futModEbiEfpIdxTrdResponseT");
	return vfutModEbiEfpIdxTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEbiEfpIdxTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEbiEfpIdxTrdRequestT));
	futModEbiEfpIdxTrdRequestT *vfutModEbiEfpIdxTrdRequestT = getFutModEbiEfpIdxTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEbiEfpIdxTrdRequestT), (jbyte*) vfutModEbiEfpIdxTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEbiEfpIdxTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEbiEfpIdxTrdResponseT));
	futModEbiEfpIdxTrdResponseT *vfutModEbiEfpIdxTrdResponseT = getFutModEbiEfpIdxTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEbiEfpIdxTrdResponseT), (jbyte*) vfutModEbiEfpIdxTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEbiEfpIdxTrdRequestT(futBscModEbiEfpIdxTrdRequestT actual, futBscModEbiEfpIdxTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpIdxTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareEbiTrdReqGrpT (actual.ebiTrdReqGrp,expected.ebiTrdReqGrp, logMsg);
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpIdxTrdRequestT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpIdxTrdRequestT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshBsktRefId, expected.cshBsktRefId, CSH_BSKT_REF_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpIdxTrdRequestT, cshBsktRefId not matching. Actual %s but Expected %s", actual.cshBsktRefId, expected.cshBsktRefId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpIdxTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpIdxTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_EFP_IDX_TRD_REQ_GRP_MAX;i++) {
		compareBscModEbiTrdReqGrpT (actual.bscModEbiTrdReqGrp[i],expected.bscModEbiTrdReqGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEbiEfpIdxTrdResponseT(futBscModEbiEfpIdxTrdResponseT actual, futBscModEbiEfpIdxTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpIdxTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpIdxTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpIdxTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpIdxTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_EFP_IDX_TRD_RESP_REC_MAX;i++) {
		compareBscModEbiTrdRespRecT (actual.bscModEbiTrdRespRec[i],expected.bscModEbiTrdRespRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEbiEfpIdxTrdRequestT(futModEbiEfpIdxTrdRequestT actual, futModEbiEfpIdxTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEbiEfpIdxTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEbiEfpIdxTrdResponseT(futModEbiEfpIdxTrdResponseT actual, futModEbiEfpIdxTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEbiEfpIdxTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEbiEfpIdxTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEbiEfpIdxTrdRequestT *actualData = (futModEbiEfpIdxTrdRequestT *)msgStruct;
	futModEbiEfpIdxTrdRequestT* expectedData = getFutModEbiEfpIdxTrdRequestT(testCaseNum);
	compareFutModEbiEfpIdxTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEbiEfpIdxTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEbiEfpIdxTrdResponseT *actualData = (futModEbiEfpIdxTrdResponseT *)msgStruct;
	futModEbiEfpIdxTrdResponseT* expectedData = getFutModEbiEfpIdxTrdResponseT(testCaseNum);
	compareFutModEbiEfpIdxTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
