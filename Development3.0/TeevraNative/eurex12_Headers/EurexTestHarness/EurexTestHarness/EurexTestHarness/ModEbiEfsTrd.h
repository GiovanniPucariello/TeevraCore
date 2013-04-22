#include <ModEbiEfsTrd.hxx>
#define BUFFER_SIZE 1000

futModEbiEfsTrdRequestT *vfutModEbiEfsTrdRequestT;
futModEbiEfsTrdResponseT *vfutModEbiEfsTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEbiEfsTrdRequestT getFutBscModEbiEfsTrdRequestT(char* testCaseNum , const char *root) {
	futBscModEbiEfsTrdRequestT vfutBscModEbiEfsTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscModEbiEfsTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("ModEbiEfsTrd.futBscModEbiEfsTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscModEbiEfsTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	vfutBscModEbiEfsTrdRequestT.ebiTrdReqGrp = getEbiTrdReqGrpT(testCaseNum, "futBscModEbiEfsTrdRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscModEbiEfsTrdRequestT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModEbiEfsTrd.futBscModEbiEfsTrdRequestT.setlDat", lsetlDat);
	memcpy(vfutBscModEbiEfsTrdRequestT.setlDat, lsetlDat, DRIV_DATE_LEN);

	for(i=0;i<SWAP_CUST1_LEN;i++) {
		vfutBscModEbiEfsTrdRequestT.swapCust1[i]= ' ';
	}
	char lswapCust1[SWAP_CUST1_LEN] = {""};
	getStrProperty("ModEbiEfsTrd.futBscModEbiEfsTrdRequestT.swapCust1", lswapCust1);
	memcpy(vfutBscModEbiEfsTrdRequestT.swapCust1, lswapCust1, SWAP_CUST1_LEN);

	for(i=0;i<SWAP_CUST2_LEN;i++) {
		vfutBscModEbiEfsTrdRequestT.swapCust2[i]= ' ';
	}
	char lswapCust2[SWAP_CUST2_LEN] = {""};
	getStrProperty("ModEbiEfsTrd.futBscModEbiEfsTrdRequestT.swapCust2", lswapCust2);
	memcpy(vfutBscModEbiEfsTrdRequestT.swapCust2, lswapCust2, SWAP_CUST2_LEN);

	vfutBscModEbiEfsTrdRequestT.cshLegEfsGrp = getCshLegEfsGrpT(testCaseNum, "futBscModEbiEfsTrdRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEbiEfsTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiEfsTrd.futBscModEbiEfsTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEbiEfsTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscModEbiEfsTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiEfsTrd.futBscModEbiEfsTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscModEbiEfsTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscModEbiEfsTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEbiEfsTrdResponseT getFutBscModEbiEfsTrdResponseT(char* testCaseNum , const char *root) {
	futBscModEbiEfsTrdResponseT vfutBscModEbiEfsTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscModEbiEfsTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("ModEbiEfsTrd.futBscModEbiEfsTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscModEbiEfsTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEbiEfsTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiEfsTrd.futBscModEbiEfsTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEbiEfsTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscModEbiEfsTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("ModEbiEfsTrd.futBscModEbiEfsTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscModEbiEfsTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscModEbiEfsTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiEfsTrd.futBscModEbiEfsTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscModEbiEfsTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscModEbiEfsTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEbiEfsTrdRequestT* getFutModEbiEfsTrdRequestT(char* testCaseNum) {
	vfutModEbiEfsTrdRequestT = (futModEbiEfsTrdRequestT*)malloc(sizeof(futModEbiEfsTrdRequestT));
	int i;

	vfutModEbiEfsTrdRequestT->header = getDataHeaderT(testCaseNum, "futModEbiEfsTrdRequestT");
	vfutModEbiEfsTrdRequestT->basic = getFutBscModEbiEfsTrdRequestT(testCaseNum, "futModEbiEfsTrdRequestT");
	return vfutModEbiEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEbiEfsTrdResponseT* getFutModEbiEfsTrdResponseT(char* testCaseNum) {
	vfutModEbiEfsTrdResponseT = (futModEbiEfsTrdResponseT*)malloc(sizeof(futModEbiEfsTrdResponseT));
	int i;

	vfutModEbiEfsTrdResponseT->header = getDataHeaderT(testCaseNum, "futModEbiEfsTrdResponseT");
	vfutModEbiEfsTrdResponseT->basic = getFutBscModEbiEfsTrdResponseT(testCaseNum, "futModEbiEfsTrdResponseT");
	return vfutModEbiEfsTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEbiEfsTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEbiEfsTrdRequestT));
	futModEbiEfsTrdRequestT *vfutModEbiEfsTrdRequestT = getFutModEbiEfsTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEbiEfsTrdRequestT), (jbyte*) vfutModEbiEfsTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEbiEfsTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEbiEfsTrdResponseT));
	futModEbiEfsTrdResponseT *vfutModEbiEfsTrdResponseT = getFutModEbiEfsTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEbiEfsTrdResponseT), (jbyte*) vfutModEbiEfsTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEbiEfsTrdRequestT(futBscModEbiEfsTrdRequestT actual, futBscModEbiEfsTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfsTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareEbiTrdReqGrpT (actual.ebiTrdReqGrp,expected.ebiTrdReqGrp, logMsg);
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfsTrdRequestT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust1, expected.swapCust1, SWAP_CUST1_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfsTrdRequestT, swapCust1 not matching. Actual %s but Expected %s", actual.swapCust1, expected.swapCust1);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust2, expected.swapCust2, SWAP_CUST2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfsTrdRequestT, swapCust2 not matching. Actual %s but Expected %s", actual.swapCust2, expected.swapCust2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfsGrpT (actual.cshLegEfsGrp,expected.cshLegEfsGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfsTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfsTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_EFS_TRD_REQ_GRP_MAX;i++) {
		compareBscModEbiTrdReqGrpT (actual.bscModEbiTrdReqGrp[i],expected.bscModEbiTrdReqGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEbiEfsTrdResponseT(futBscModEbiEfsTrdResponseT actual, futBscModEbiEfsTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfsTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfsTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfsTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfsTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
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
void compareFutModEbiEfsTrdRequestT(futModEbiEfsTrdRequestT actual, futModEbiEfsTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEbiEfsTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEbiEfsTrdResponseT(futModEbiEfsTrdResponseT actual, futModEbiEfsTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEbiEfsTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEbiEfsTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEbiEfsTrdRequestT *actualData = (futModEbiEfsTrdRequestT *)msgStruct;
	futModEbiEfsTrdRequestT* expectedData = getFutModEbiEfsTrdRequestT(testCaseNum);
	compareFutModEbiEfsTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEbiEfsTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEbiEfsTrdResponseT *actualData = (futModEbiEfsTrdResponseT *)msgStruct;
	futModEbiEfsTrdResponseT* expectedData = getFutModEbiEfsTrdResponseT(testCaseNum);
	compareFutModEbiEfsTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
