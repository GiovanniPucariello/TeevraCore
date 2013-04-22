#include <EntEbiEfsTrd.hxx>
#define BUFFER_SIZE 1000

futEntEbiEfsTrdRequestT *vfutEntEbiEfsTrdRequestT;
futEntEbiEfsTrdResponseT *vfutEntEbiEfsTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEbiEfsTrdRequestT getFutBscEntEbiEfsTrdRequestT(char* testCaseNum , const char *root) {
	futBscEntEbiEfsTrdRequestT vfutBscEntEbiEfsTrdRequestT;
	int i;

	vfutBscEntEbiEfsTrdRequestT.ebiTrdReqGrp = getEbiTrdReqGrpT(testCaseNum, "futBscEntEbiEfsTrdRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntEbiEfsTrdRequestT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntEbiEfsTrd.futBscEntEbiEfsTrdRequestT.setlDat", lsetlDat);
	memcpy(vfutBscEntEbiEfsTrdRequestT.setlDat, lsetlDat, DRIV_DATE_LEN);

	for(i=0;i<SWAP_CUST1_LEN;i++) {
		vfutBscEntEbiEfsTrdRequestT.swapCust1[i]= ' ';
	}
	char lswapCust1[SWAP_CUST1_LEN] = {""};
	getStrProperty("EntEbiEfsTrd.futBscEntEbiEfsTrdRequestT.swapCust1", lswapCust1);
	memcpy(vfutBscEntEbiEfsTrdRequestT.swapCust1, lswapCust1, SWAP_CUST1_LEN);

	for(i=0;i<SWAP_CUST2_LEN;i++) {
		vfutBscEntEbiEfsTrdRequestT.swapCust2[i]= ' ';
	}
	char lswapCust2[SWAP_CUST2_LEN] = {""};
	getStrProperty("EntEbiEfsTrd.futBscEntEbiEfsTrdRequestT.swapCust2", lswapCust2);
	memcpy(vfutBscEntEbiEfsTrdRequestT.swapCust2, lswapCust2, SWAP_CUST2_LEN);

	vfutBscEntEbiEfsTrdRequestT.cshLegEfsGrp = getCshLegEfsGrpT(testCaseNum, "futBscEntEbiEfsTrdRequestT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscEntEbiEfsTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiEfsTrd.futBscEntEbiEfsTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscEntEbiEfsTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscEntEbiEfsTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEbiEfsTrdResponseT getFutBscEntEbiEfsTrdResponseT(char* testCaseNum , const char *root) {
	futBscEntEbiEfsTrdResponseT vfutBscEntEbiEfsTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscEntEbiEfsTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("EntEbiEfsTrd.futBscEntEbiEfsTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscEntEbiEfsTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntEbiEfsTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntEbiEfsTrd.futBscEntEbiEfsTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntEbiEfsTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscEntEbiEfsTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("EntEbiEfsTrd.futBscEntEbiEfsTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscEntEbiEfsTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscEntEbiEfsTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiEfsTrd.futBscEntEbiEfsTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscEntEbiEfsTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscEntEbiEfsTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEbiEfsTrdRequestT* getFutEntEbiEfsTrdRequestT(char* testCaseNum) {
	vfutEntEbiEfsTrdRequestT = (futEntEbiEfsTrdRequestT*)malloc(sizeof(futEntEbiEfsTrdRequestT));
	int i;

	vfutEntEbiEfsTrdRequestT->header = getDataHeaderT(testCaseNum, "futEntEbiEfsTrdRequestT");
	vfutEntEbiEfsTrdRequestT->basic = getFutBscEntEbiEfsTrdRequestT(testCaseNum, "futEntEbiEfsTrdRequestT");
	return vfutEntEbiEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEbiEfsTrdResponseT* getFutEntEbiEfsTrdResponseT(char* testCaseNum) {
	vfutEntEbiEfsTrdResponseT = (futEntEbiEfsTrdResponseT*)malloc(sizeof(futEntEbiEfsTrdResponseT));
	int i;

	vfutEntEbiEfsTrdResponseT->header = getDataHeaderT(testCaseNum, "futEntEbiEfsTrdResponseT");
	vfutEntEbiEfsTrdResponseT->basic = getFutBscEntEbiEfsTrdResponseT(testCaseNum, "futEntEbiEfsTrdResponseT");
	return vfutEntEbiEfsTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEbiEfsTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEbiEfsTrdRequestT));
	futEntEbiEfsTrdRequestT *vfutEntEbiEfsTrdRequestT = getFutEntEbiEfsTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEbiEfsTrdRequestT), (jbyte*) vfutEntEbiEfsTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEbiEfsTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEbiEfsTrdResponseT));
	futEntEbiEfsTrdResponseT *vfutEntEbiEfsTrdResponseT = getFutEntEbiEfsTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEbiEfsTrdResponseT), (jbyte*) vfutEntEbiEfsTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEbiEfsTrdRequestT(futBscEntEbiEfsTrdRequestT actual, futBscEntEbiEfsTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareEbiTrdReqGrpT (actual.ebiTrdReqGrp,expected.ebiTrdReqGrp, logMsg);
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfsTrdRequestT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust1, expected.swapCust1, SWAP_CUST1_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfsTrdRequestT, swapCust1 not matching. Actual %s but Expected %s", actual.swapCust1, expected.swapCust1);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust2, expected.swapCust2, SWAP_CUST2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfsTrdRequestT, swapCust2 not matching. Actual %s but Expected %s", actual.swapCust2, expected.swapCust2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfsGrpT (actual.cshLegEfsGrp,expected.cshLegEfsGrp, logMsg);
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfsTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_EBI_EFS_TRD_REQ_GRP_MAX;i++) {
		compareBscEntEbiTrdReqGrpT (actual.bscEntEbiTrdReqGrp[i],expected.bscEntEbiTrdReqGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEbiEfsTrdResponseT(futBscEntEbiEfsTrdResponseT actual, futBscEntEbiEfsTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfsTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfsTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfsTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfsTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
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
void compareFutEntEbiEfsTrdRequestT(futEntEbiEfsTrdRequestT actual, futEntEbiEfsTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEbiEfsTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEbiEfsTrdResponseT(futEntEbiEfsTrdResponseT actual, futEntEbiEfsTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEbiEfsTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEbiEfsTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEbiEfsTrdRequestT *actualData = (futEntEbiEfsTrdRequestT *)msgStruct;
	futEntEbiEfsTrdRequestT* expectedData = getFutEntEbiEfsTrdRequestT(testCaseNum);
	compareFutEntEbiEfsTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEbiEfsTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEbiEfsTrdResponseT *actualData = (futEntEbiEfsTrdResponseT *)msgStruct;
	futEntEbiEfsTrdResponseT* expectedData = getFutEntEbiEfsTrdResponseT(testCaseNum);
	compareFutEntEbiEfsTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
