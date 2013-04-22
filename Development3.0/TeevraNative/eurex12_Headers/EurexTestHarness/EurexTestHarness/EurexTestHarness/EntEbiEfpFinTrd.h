#include <EntEbiEfpFinTrd.hxx>
#define BUFFER_SIZE 1000

futEntEbiEfpFinTrdRequestT *vfutEntEbiEfpFinTrdRequestT;
futEntEbiEfpFinTrdResponseT *vfutEntEbiEfpFinTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEbiEfpFinTrdRequestT getFutBscEntEbiEfpFinTrdRequestT(char* testCaseNum , const char *root) {
	futBscEntEbiEfpFinTrdRequestT vfutBscEntEbiEfpFinTrdRequestT;
	int i;

	vfutBscEntEbiEfpFinTrdRequestT.ebiTrdReqGrp = getEbiTrdReqGrpT(testCaseNum, "futBscEntEbiEfpFinTrdRequestT");
	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vfutBscEntEbiEfpFinTrdRequestT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("EntEbiEfpFinTrd.futBscEntEbiEfpFinTrdRequestT.undrIsinCod", lundrIsinCod);
	memcpy(vfutBscEntEbiEfpFinTrdRequestT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscEntEbiEfpFinTrdRequestT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("EntEbiEfpFinTrd.futBscEntEbiEfpFinTrdRequestT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscEntEbiEfpFinTrdRequestT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntEbiEfpFinTrdRequestT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntEbiEfpFinTrd.futBscEntEbiEfpFinTrdRequestT.setlDat", lsetlDat);
	memcpy(vfutBscEntEbiEfpFinTrdRequestT.setlDat, lsetlDat, DRIV_DATE_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscEntEbiEfpFinTrdRequestT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("EntEbiEfpFinTrd.futBscEntEbiEfpFinTrdRequestT.setlInst", lsetlInst);
	memcpy(vfutBscEntEbiEfpFinTrdRequestT.setlInst, lsetlInst, SETL_INST_LEN);

	vfutBscEntEbiEfpFinTrdRequestT.cshLegEfpFinGrp = getCshLegEfpFinGrpT(testCaseNum, "futBscEntEbiEfpFinTrdRequestT");
	for(i=0;i<CSH_PRC_EFP_FIN_LEN;i++) {
		vfutBscEntEbiEfpFinTrdRequestT.cshPrcEfpFin[i]= ' ';
	}
	char lcshPrcEfpFin[CSH_PRC_EFP_FIN_LEN] = {""};
	getStrProperty("EntEbiEfpFinTrd.futBscEntEbiEfpFinTrdRequestT.cshPrcEfpFin", lcshPrcEfpFin);
	memcpy(vfutBscEntEbiEfpFinTrdRequestT.cshPrcEfpFin, lcshPrcEfpFin, CSH_PRC_EFP_FIN_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscEntEbiEfpFinTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiEfpFinTrd.futBscEntEbiEfpFinTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscEntEbiEfpFinTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscEntEbiEfpFinTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEbiEfpFinTrdResponseT getFutBscEntEbiEfpFinTrdResponseT(char* testCaseNum , const char *root) {
	futBscEntEbiEfpFinTrdResponseT vfutBscEntEbiEfpFinTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscEntEbiEfpFinTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("EntEbiEfpFinTrd.futBscEntEbiEfpFinTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscEntEbiEfpFinTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntEbiEfpFinTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntEbiEfpFinTrd.futBscEntEbiEfpFinTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntEbiEfpFinTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscEntEbiEfpFinTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("EntEbiEfpFinTrd.futBscEntEbiEfpFinTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscEntEbiEfpFinTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);

	vfutBscEntEbiEfpFinTrdResponseT.cshLegEfpFinGrp = getCshLegEfpFinGrpT(testCaseNum, "futBscEntEbiEfpFinTrdResponseT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscEntEbiEfpFinTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiEfpFinTrd.futBscEntEbiEfpFinTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscEntEbiEfpFinTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscEntEbiEfpFinTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEbiEfpFinTrdRequestT* getFutEntEbiEfpFinTrdRequestT(char* testCaseNum) {
	vfutEntEbiEfpFinTrdRequestT = (futEntEbiEfpFinTrdRequestT*)malloc(sizeof(futEntEbiEfpFinTrdRequestT));
	int i;

	vfutEntEbiEfpFinTrdRequestT->header = getDataHeaderT(testCaseNum, "futEntEbiEfpFinTrdRequestT");
	vfutEntEbiEfpFinTrdRequestT->basic = getFutBscEntEbiEfpFinTrdRequestT(testCaseNum, "futEntEbiEfpFinTrdRequestT");
	return vfutEntEbiEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEbiEfpFinTrdResponseT* getFutEntEbiEfpFinTrdResponseT(char* testCaseNum) {
	vfutEntEbiEfpFinTrdResponseT = (futEntEbiEfpFinTrdResponseT*)malloc(sizeof(futEntEbiEfpFinTrdResponseT));
	int i;

	vfutEntEbiEfpFinTrdResponseT->header = getDataHeaderT(testCaseNum, "futEntEbiEfpFinTrdResponseT");
	vfutEntEbiEfpFinTrdResponseT->basic = getFutBscEntEbiEfpFinTrdResponseT(testCaseNum, "futEntEbiEfpFinTrdResponseT");
	return vfutEntEbiEfpFinTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEbiEfpFinTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEbiEfpFinTrdRequestT));
	futEntEbiEfpFinTrdRequestT *vfutEntEbiEfpFinTrdRequestT = getFutEntEbiEfpFinTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEbiEfpFinTrdRequestT), (jbyte*) vfutEntEbiEfpFinTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEbiEfpFinTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEbiEfpFinTrdResponseT));
	futEntEbiEfpFinTrdResponseT *vfutEntEbiEfpFinTrdResponseT = getFutEntEbiEfpFinTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEbiEfpFinTrdResponseT), (jbyte*) vfutEntEbiEfpFinTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEbiEfpFinTrdRequestT(futBscEntEbiEfpFinTrdRequestT actual, futBscEntEbiEfpFinTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareEbiTrdReqGrpT (actual.ebiTrdReqGrp,expected.ebiTrdReqGrp, logMsg);
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpFinTrdRequestT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpFinTrdRequestT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpFinTrdRequestT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpFinTrdRequestT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfpFinGrpT (actual.cshLegEfpFinGrp,expected.cshLegEfpFinGrp, logMsg);
	if ( memcmp(actual.cshPrcEfpFin, expected.cshPrcEfpFin, CSH_PRC_EFP_FIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpFinTrdRequestT, cshPrcEfpFin not matching. Actual %s but Expected %s", actual.cshPrcEfpFin, expected.cshPrcEfpFin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpFinTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
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
void compareFutBscEntEbiEfpFinTrdResponseT(futBscEntEbiEfpFinTrdResponseT actual, futBscEntEbiEfpFinTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpFinTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpFinTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpFinTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfpFinGrpT (actual.cshLegEfpFinGrp,expected.cshLegEfpFinGrp, logMsg);
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiEfpFinTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
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
void compareFutEntEbiEfpFinTrdRequestT(futEntEbiEfpFinTrdRequestT actual, futEntEbiEfpFinTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEbiEfpFinTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEbiEfpFinTrdResponseT(futEntEbiEfpFinTrdResponseT actual, futEntEbiEfpFinTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEbiEfpFinTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEbiEfpFinTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEbiEfpFinTrdRequestT *actualData = (futEntEbiEfpFinTrdRequestT *)msgStruct;
	futEntEbiEfpFinTrdRequestT* expectedData = getFutEntEbiEfpFinTrdRequestT(testCaseNum);
	compareFutEntEbiEfpFinTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEbiEfpFinTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEbiEfpFinTrdResponseT *actualData = (futEntEbiEfpFinTrdResponseT *)msgStruct;
	futEntEbiEfpFinTrdResponseT* expectedData = getFutEntEbiEfpFinTrdResponseT(testCaseNum);
	compareFutEntEbiEfpFinTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
