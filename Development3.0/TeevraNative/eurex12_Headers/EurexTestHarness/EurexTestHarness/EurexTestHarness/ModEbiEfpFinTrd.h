#include <ModEbiEfpFinTrd.hxx>
#define BUFFER_SIZE 1000

futModEbiEfpFinTrdRequestT *vfutModEbiEfpFinTrdRequestT;
futModEbiEfpFinTrdResponseT *vfutModEbiEfpFinTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEbiEfpFinTrdRequestT getFutBscModEbiEfpFinTrdRequestT(char* testCaseNum , const char *root) {
	futBscModEbiEfpFinTrdRequestT vfutBscModEbiEfpFinTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscModEbiEfpFinTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscModEbiEfpFinTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	vfutBscModEbiEfpFinTrdRequestT.ebiTrdReqGrp = getEbiTrdReqGrpT(testCaseNum, "futBscModEbiEfpFinTrdRequestT");
	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vfutBscModEbiEfpFinTrdRequestT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdRequestT.undrIsinCod", lundrIsinCod);
	memcpy(vfutBscModEbiEfpFinTrdRequestT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscModEbiEfpFinTrdRequestT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdRequestT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscModEbiEfpFinTrdRequestT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscModEbiEfpFinTrdRequestT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdRequestT.setlDat", lsetlDat);
	memcpy(vfutBscModEbiEfpFinTrdRequestT.setlDat, lsetlDat, DRIV_DATE_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscModEbiEfpFinTrdRequestT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdRequestT.setlInst", lsetlInst);
	memcpy(vfutBscModEbiEfpFinTrdRequestT.setlInst, lsetlInst, SETL_INST_LEN);

	vfutBscModEbiEfpFinTrdRequestT.cshLegEfpFinGrp = getCshLegEfpFinGrpT(testCaseNum, "futBscModEbiEfpFinTrdRequestT");
	for(i=0;i<CSH_PRC_EFP_FIN_LEN;i++) {
		vfutBscModEbiEfpFinTrdRequestT.cshPrcEfpFin[i]= ' ';
	}
	char lcshPrcEfpFin[CSH_PRC_EFP_FIN_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdRequestT.cshPrcEfpFin", lcshPrcEfpFin);
	memcpy(vfutBscModEbiEfpFinTrdRequestT.cshPrcEfpFin, lcshPrcEfpFin, CSH_PRC_EFP_FIN_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEbiEfpFinTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEbiEfpFinTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscModEbiEfpFinTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscModEbiEfpFinTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscModEbiEfpFinTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEbiEfpFinTrdResponseT getFutBscModEbiEfpFinTrdResponseT(char* testCaseNum , const char *root) {
	futBscModEbiEfpFinTrdResponseT vfutBscModEbiEfpFinTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscModEbiEfpFinTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscModEbiEfpFinTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEbiEfpFinTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEbiEfpFinTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscModEbiEfpFinTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscModEbiEfpFinTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);

	vfutBscModEbiEfpFinTrdResponseT.cshLegEfpFinGrp = getCshLegEfpFinGrpT(testCaseNum, "futBscModEbiEfpFinTrdResponseT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscModEbiEfpFinTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiEfpFinTrd.futBscModEbiEfpFinTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscModEbiEfpFinTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscModEbiEfpFinTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEbiEfpFinTrdRequestT* getFutModEbiEfpFinTrdRequestT(char* testCaseNum) {
	vfutModEbiEfpFinTrdRequestT = (futModEbiEfpFinTrdRequestT*)malloc(sizeof(futModEbiEfpFinTrdRequestT));
	int i;

	vfutModEbiEfpFinTrdRequestT->header = getDataHeaderT(testCaseNum, "futModEbiEfpFinTrdRequestT");
	vfutModEbiEfpFinTrdRequestT->basic = getFutBscModEbiEfpFinTrdRequestT(testCaseNum, "futModEbiEfpFinTrdRequestT");
	return vfutModEbiEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEbiEfpFinTrdResponseT* getFutModEbiEfpFinTrdResponseT(char* testCaseNum) {
	vfutModEbiEfpFinTrdResponseT = (futModEbiEfpFinTrdResponseT*)malloc(sizeof(futModEbiEfpFinTrdResponseT));
	int i;

	vfutModEbiEfpFinTrdResponseT->header = getDataHeaderT(testCaseNum, "futModEbiEfpFinTrdResponseT");
	vfutModEbiEfpFinTrdResponseT->basic = getFutBscModEbiEfpFinTrdResponseT(testCaseNum, "futModEbiEfpFinTrdResponseT");
	return vfutModEbiEfpFinTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEbiEfpFinTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEbiEfpFinTrdRequestT));
	futModEbiEfpFinTrdRequestT *vfutModEbiEfpFinTrdRequestT = getFutModEbiEfpFinTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEbiEfpFinTrdRequestT), (jbyte*) vfutModEbiEfpFinTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEbiEfpFinTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEbiEfpFinTrdResponseT));
	futModEbiEfpFinTrdResponseT *vfutModEbiEfpFinTrdResponseT = getFutModEbiEfpFinTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEbiEfpFinTrdResponseT), (jbyte*) vfutModEbiEfpFinTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEbiEfpFinTrdRequestT(futBscModEbiEfpFinTrdRequestT actual, futBscModEbiEfpFinTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareEbiTrdReqGrpT (actual.ebiTrdReqGrp,expected.ebiTrdReqGrp, logMsg);
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdRequestT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdRequestT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdRequestT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdRequestT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfpFinGrpT (actual.cshLegEfpFinGrp,expected.cshLegEfpFinGrp, logMsg);
	if ( memcmp(actual.cshPrcEfpFin, expected.cshPrcEfpFin, CSH_PRC_EFP_FIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdRequestT, cshPrcEfpFin not matching. Actual %s but Expected %s", actual.cshPrcEfpFin, expected.cshPrcEfpFin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_EFP_FIN_TRD_REQ_GRP_MAX;i++) {
		compareBscModEbiTrdReqGrpT (actual.bscModEbiTrdReqGrp[i],expected.bscModEbiTrdReqGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEbiEfpFinTrdResponseT(futBscModEbiEfpFinTrdResponseT actual, futBscModEbiEfpFinTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfpFinGrpT (actual.cshLegEfpFinGrp,expected.cshLegEfpFinGrp, logMsg);
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiEfpFinTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_EFP_FIN_TRD_RESP_REC_MAX;i++) {
		compareBscModEbiTrdRespRecT (actual.bscModEbiTrdRespRec[i],expected.bscModEbiTrdRespRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEbiEfpFinTrdRequestT(futModEbiEfpFinTrdRequestT actual, futModEbiEfpFinTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEbiEfpFinTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEbiEfpFinTrdResponseT(futModEbiEfpFinTrdResponseT actual, futModEbiEfpFinTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEbiEfpFinTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEbiEfpFinTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEbiEfpFinTrdRequestT *actualData = (futModEbiEfpFinTrdRequestT *)msgStruct;
	futModEbiEfpFinTrdRequestT* expectedData = getFutModEbiEfpFinTrdRequestT(testCaseNum);
	compareFutModEbiEfpFinTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEbiEfpFinTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEbiEfpFinTrdResponseT *actualData = (futModEbiEfpFinTrdResponseT *)msgStruct;
	futModEbiEfpFinTrdResponseT* expectedData = getFutModEbiEfpFinTrdResponseT(testCaseNum);
	compareFutModEbiEfpFinTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
