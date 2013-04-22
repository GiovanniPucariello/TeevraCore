#include <InqEbiEfpFinTrd.hxx>
#define BUFFER_SIZE 1000

futInqEbiEfpFinTrdRequestT *vfutInqEbiEfpFinTrdRequestT;
futInqEbiEfpFinTrdResponseT *vfutInqEbiEfpFinTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEbiEfpFinTrdRequestT getFutBscInqEbiEfpFinTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqEbiEfpFinTrdRequestT vfutBscInqEbiEfpFinTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscInqEbiEfpFinTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("InqEbiEfpFinTrd.futBscInqEbiEfpFinTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscInqEbiEfpFinTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);
	return vfutBscInqEbiEfpFinTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEbiEfpFinTrdResponseT getFutBscInqEbiEfpFinTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqEbiEfpFinTrdResponseT vfutBscInqEbiEfpFinTrdResponseT;
	int i;

	vfutBscInqEbiEfpFinTrdResponseT.ebiTrdInqRespGrp = getEbiTrdInqRespGrpT(testCaseNum, "futBscInqEbiEfpFinTrdResponseT");
	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vfutBscInqEbiEfpFinTrdResponseT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("InqEbiEfpFinTrd.futBscInqEbiEfpFinTrdResponseT.undrIsinCod", lundrIsinCod);
	memcpy(vfutBscInqEbiEfpFinTrdResponseT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscInqEbiEfpFinTrdResponseT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("InqEbiEfpFinTrd.futBscInqEbiEfpFinTrdResponseT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscInqEbiEfpFinTrdResponseT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqEbiEfpFinTrdResponseT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqEbiEfpFinTrd.futBscInqEbiEfpFinTrdResponseT.setlDat", lsetlDat);
	memcpy(vfutBscInqEbiEfpFinTrdResponseT.setlDat, lsetlDat, DRIV_DATE_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscInqEbiEfpFinTrdResponseT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("InqEbiEfpFinTrd.futBscInqEbiEfpFinTrdResponseT.setlInst", lsetlInst);
	memcpy(vfutBscInqEbiEfpFinTrdResponseT.setlInst, lsetlInst, SETL_INST_LEN);

	vfutBscInqEbiEfpFinTrdResponseT.cshLegEfpFinGrp = getCshLegEfpFinGrpT(testCaseNum, "futBscInqEbiEfpFinTrdResponseT");
	for(i=0;i<CSH_PRC_EFP_FIN_LEN;i++) {
		vfutBscInqEbiEfpFinTrdResponseT.cshPrcEfpFin[i]= ' ';
	}
	char lcshPrcEfpFin[CSH_PRC_EFP_FIN_LEN] = {""};
	getStrProperty("InqEbiEfpFinTrd.futBscInqEbiEfpFinTrdResponseT.cshPrcEfpFin", lcshPrcEfpFin);
	memcpy(vfutBscInqEbiEfpFinTrdResponseT.cshPrcEfpFin, lcshPrcEfpFin, CSH_PRC_EFP_FIN_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqEbiEfpFinTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqEbiEfpFinTrd.futBscInqEbiEfpFinTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqEbiEfpFinTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqEbiEfpFinTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEbiEfpFinTrdRequestT* getFutInqEbiEfpFinTrdRequestT(char* testCaseNum) {
	vfutInqEbiEfpFinTrdRequestT = (futInqEbiEfpFinTrdRequestT*)malloc(sizeof(futInqEbiEfpFinTrdRequestT));
	int i;

	vfutInqEbiEfpFinTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqEbiEfpFinTrdRequestT");
	vfutInqEbiEfpFinTrdRequestT->basic = getFutBscInqEbiEfpFinTrdRequestT(testCaseNum, "futInqEbiEfpFinTrdRequestT");
	return vfutInqEbiEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEbiEfpFinTrdResponseT* getFutInqEbiEfpFinTrdResponseT(char* testCaseNum) {
	vfutInqEbiEfpFinTrdResponseT = (futInqEbiEfpFinTrdResponseT*)malloc(sizeof(futInqEbiEfpFinTrdResponseT));
	int i;

	vfutInqEbiEfpFinTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqEbiEfpFinTrdResponseT");
	vfutInqEbiEfpFinTrdResponseT->basic = getFutBscInqEbiEfpFinTrdResponseT(testCaseNum, "futInqEbiEfpFinTrdResponseT");
	return vfutInqEbiEfpFinTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEbiEfpFinTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEbiEfpFinTrdRequestT));
	futInqEbiEfpFinTrdRequestT *vfutInqEbiEfpFinTrdRequestT = getFutInqEbiEfpFinTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEbiEfpFinTrdRequestT), (jbyte*) vfutInqEbiEfpFinTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEbiEfpFinTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEbiEfpFinTrdResponseT));
	futInqEbiEfpFinTrdResponseT *vfutInqEbiEfpFinTrdResponseT = getFutInqEbiEfpFinTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEbiEfpFinTrdResponseT), (jbyte*) vfutInqEbiEfpFinTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEbiEfpFinTrdRequestT(futBscInqEbiEfpFinTrdRequestT actual, futBscInqEbiEfpFinTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpFinTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEbiEfpFinTrdResponseT(futBscInqEbiEfpFinTrdResponseT actual, futBscInqEbiEfpFinTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareEbiTrdInqRespGrpT (actual.ebiTrdInqRespGrp,expected.ebiTrdInqRespGrp, logMsg);
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpFinTrdResponseT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpFinTrdResponseT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpFinTrdResponseT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpFinTrdResponseT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfpFinGrpT (actual.cshLegEfpFinGrp,expected.cshLegEfpFinGrp, logMsg);
	if ( memcmp(actual.cshPrcEfpFin, expected.cshPrcEfpFin, CSH_PRC_EFP_FIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpFinTrdResponseT, cshPrcEfpFin not matching. Actual %s but Expected %s", actual.cshPrcEfpFin, expected.cshPrcEfpFin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpFinTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_EBI_EFP_FIN_TRD_RESP_REC_MAX;i++) {
		compareBscInqEbiTrdRespRecT (actual.bscInqEbiTrdRespRec[i],expected.bscInqEbiTrdRespRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEbiEfpFinTrdRequestT(futInqEbiEfpFinTrdRequestT actual, futInqEbiEfpFinTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEbiEfpFinTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEbiEfpFinTrdResponseT(futInqEbiEfpFinTrdResponseT actual, futInqEbiEfpFinTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEbiEfpFinTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEbiEfpFinTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEbiEfpFinTrdRequestT *actualData = (futInqEbiEfpFinTrdRequestT *)msgStruct;
	futInqEbiEfpFinTrdRequestT* expectedData = getFutInqEbiEfpFinTrdRequestT(testCaseNum);
	compareFutInqEbiEfpFinTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEbiEfpFinTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEbiEfpFinTrdResponseT *actualData = (futInqEbiEfpFinTrdResponseT *)msgStruct;
	futInqEbiEfpFinTrdResponseT* expectedData = getFutInqEbiEfpFinTrdResponseT(testCaseNum);
	compareFutInqEbiEfpFinTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
