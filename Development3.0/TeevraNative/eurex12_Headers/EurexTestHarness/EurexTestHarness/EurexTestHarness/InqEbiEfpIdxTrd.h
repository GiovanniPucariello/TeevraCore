#include <InqEbiEfpIdxTrd.hxx>
#define BUFFER_SIZE 1000

futInqEbiEfpIdxTrdRequestT *vfutInqEbiEfpIdxTrdRequestT;
futInqEbiEfpIdxTrdResponseT *vfutInqEbiEfpIdxTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEbiEfpIdxTrdRequestT getFutBscInqEbiEfpIdxTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqEbiEfpIdxTrdRequestT vfutBscInqEbiEfpIdxTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscInqEbiEfpIdxTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("InqEbiEfpIdxTrd.futBscInqEbiEfpIdxTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscInqEbiEfpIdxTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);
	return vfutBscInqEbiEfpIdxTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEbiEfpIdxTrdResponseT getFutBscInqEbiEfpIdxTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqEbiEfpIdxTrdResponseT vfutBscInqEbiEfpIdxTrdResponseT;
	int i;

	vfutBscInqEbiEfpIdxTrdResponseT.ebiTrdInqRespGrp = getEbiTrdInqRespGrpT(testCaseNum, "futBscInqEbiEfpIdxTrdResponseT");
	for(i=0;i<HDGE_TYP_LEN;i++) {
		vfutBscInqEbiEfpIdxTrdResponseT.hdgeTyp[i]= ' ';
	}
	char lhdgeTyp[HDGE_TYP_LEN] = {""};
	getStrProperty("InqEbiEfpIdxTrd.futBscInqEbiEfpIdxTrdResponseT.hdgeTyp", lhdgeTyp);
	memcpy(vfutBscInqEbiEfpIdxTrdResponseT.hdgeTyp, lhdgeTyp, HDGE_TYP_LEN);

	for(i=0;i<SETL_INST_LEN;i++) {
		vfutBscInqEbiEfpIdxTrdResponseT.setlInst[i]= ' ';
	}
	char lsetlInst[SETL_INST_LEN] = {""};
	getStrProperty("InqEbiEfpIdxTrd.futBscInqEbiEfpIdxTrdResponseT.setlInst", lsetlInst);
	memcpy(vfutBscInqEbiEfpIdxTrdResponseT.setlInst, lsetlInst, SETL_INST_LEN);

	for(i=0;i<CSH_BSKT_REF_ID_LEN;i++) {
		vfutBscInqEbiEfpIdxTrdResponseT.cshBsktRefId[i]= ' ';
	}
	char lcshBsktRefId[CSH_BSKT_REF_ID_LEN] = {""};
	getStrProperty("InqEbiEfpIdxTrd.futBscInqEbiEfpIdxTrdResponseT.cshBsktRefId", lcshBsktRefId);
	memcpy(vfutBscInqEbiEfpIdxTrdResponseT.cshBsktRefId, lcshBsktRefId, CSH_BSKT_REF_ID_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscInqEbiEfpIdxTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqEbiEfpIdxTrd.futBscInqEbiEfpIdxTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscInqEbiEfpIdxTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqEbiEfpIdxTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqEbiEfpIdxTrd.futBscInqEbiEfpIdxTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqEbiEfpIdxTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqEbiEfpIdxTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEbiEfpIdxTrdRequestT* getFutInqEbiEfpIdxTrdRequestT(char* testCaseNum) {
	vfutInqEbiEfpIdxTrdRequestT = (futInqEbiEfpIdxTrdRequestT*)malloc(sizeof(futInqEbiEfpIdxTrdRequestT));
	int i;

	vfutInqEbiEfpIdxTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqEbiEfpIdxTrdRequestT");
	vfutInqEbiEfpIdxTrdRequestT->basic = getFutBscInqEbiEfpIdxTrdRequestT(testCaseNum, "futInqEbiEfpIdxTrdRequestT");
	return vfutInqEbiEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEbiEfpIdxTrdResponseT* getFutInqEbiEfpIdxTrdResponseT(char* testCaseNum) {
	vfutInqEbiEfpIdxTrdResponseT = (futInqEbiEfpIdxTrdResponseT*)malloc(sizeof(futInqEbiEfpIdxTrdResponseT));
	int i;

	vfutInqEbiEfpIdxTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqEbiEfpIdxTrdResponseT");
	vfutInqEbiEfpIdxTrdResponseT->basic = getFutBscInqEbiEfpIdxTrdResponseT(testCaseNum, "futInqEbiEfpIdxTrdResponseT");
	return vfutInqEbiEfpIdxTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEbiEfpIdxTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEbiEfpIdxTrdRequestT));
	futInqEbiEfpIdxTrdRequestT *vfutInqEbiEfpIdxTrdRequestT = getFutInqEbiEfpIdxTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEbiEfpIdxTrdRequestT), (jbyte*) vfutInqEbiEfpIdxTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEbiEfpIdxTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEbiEfpIdxTrdResponseT));
	futInqEbiEfpIdxTrdResponseT *vfutInqEbiEfpIdxTrdResponseT = getFutInqEbiEfpIdxTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEbiEfpIdxTrdResponseT), (jbyte*) vfutInqEbiEfpIdxTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEbiEfpIdxTrdRequestT(futBscInqEbiEfpIdxTrdRequestT actual, futBscInqEbiEfpIdxTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpIdxTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEbiEfpIdxTrdResponseT(futBscInqEbiEfpIdxTrdResponseT actual, futBscInqEbiEfpIdxTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareEbiTrdInqRespGrpT (actual.ebiTrdInqRespGrp,expected.ebiTrdInqRespGrp, logMsg);
	if ( memcmp(actual.hdgeTyp, expected.hdgeTyp, HDGE_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpIdxTrdResponseT, hdgeTyp not matching. Actual %s but Expected %s", actual.hdgeTyp, expected.hdgeTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlInst, expected.setlInst, SETL_INST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpIdxTrdResponseT, setlInst not matching. Actual %s but Expected %s", actual.setlInst, expected.setlInst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshBsktRefId, expected.cshBsktRefId, CSH_BSKT_REF_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpIdxTrdResponseT, cshBsktRefId not matching. Actual %s but Expected %s", actual.cshBsktRefId, expected.cshBsktRefId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpIdxTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfpIdxTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
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
void compareFutInqEbiEfpIdxTrdRequestT(futInqEbiEfpIdxTrdRequestT actual, futInqEbiEfpIdxTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEbiEfpIdxTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEbiEfpIdxTrdResponseT(futInqEbiEfpIdxTrdResponseT actual, futInqEbiEfpIdxTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEbiEfpIdxTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEbiEfpIdxTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEbiEfpIdxTrdRequestT *actualData = (futInqEbiEfpIdxTrdRequestT *)msgStruct;
	futInqEbiEfpIdxTrdRequestT* expectedData = getFutInqEbiEfpIdxTrdRequestT(testCaseNum);
	compareFutInqEbiEfpIdxTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEbiEfpIdxTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEbiEfpIdxTrdResponseT *actualData = (futInqEbiEfpIdxTrdResponseT *)msgStruct;
	futInqEbiEfpIdxTrdResponseT* expectedData = getFutInqEbiEfpIdxTrdResponseT(testCaseNum);
	compareFutInqEbiEfpIdxTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
