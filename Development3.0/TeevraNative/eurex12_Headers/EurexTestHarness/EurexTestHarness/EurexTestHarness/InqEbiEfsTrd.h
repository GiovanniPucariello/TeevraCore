#include <InqEbiEfsTrd.hxx>
#define BUFFER_SIZE 1000

futInqEbiEfsTrdRequestT *vfutInqEbiEfsTrdRequestT;
futInqEbiEfsTrdResponseT *vfutInqEbiEfsTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEbiEfsTrdRequestT getFutBscInqEbiEfsTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqEbiEfsTrdRequestT vfutBscInqEbiEfsTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscInqEbiEfsTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("InqEbiEfsTrd.futBscInqEbiEfsTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscInqEbiEfsTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);
	return vfutBscInqEbiEfsTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEbiEfsTrdResponseT getFutBscInqEbiEfsTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqEbiEfsTrdResponseT vfutBscInqEbiEfsTrdResponseT;
	int i;

	vfutBscInqEbiEfsTrdResponseT.ebiTrdInqRespGrp = getEbiTrdInqRespGrpT(testCaseNum, "futBscInqEbiEfsTrdResponseT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqEbiEfsTrdResponseT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqEbiEfsTrd.futBscInqEbiEfsTrdResponseT.setlDat", lsetlDat);
	memcpy(vfutBscInqEbiEfsTrdResponseT.setlDat, lsetlDat, DRIV_DATE_LEN);

	for(i=0;i<SWAP_CUST1_LEN;i++) {
		vfutBscInqEbiEfsTrdResponseT.swapCust1[i]= ' ';
	}
	char lswapCust1[SWAP_CUST1_LEN] = {""};
	getStrProperty("InqEbiEfsTrd.futBscInqEbiEfsTrdResponseT.swapCust1", lswapCust1);
	memcpy(vfutBscInqEbiEfsTrdResponseT.swapCust1, lswapCust1, SWAP_CUST1_LEN);

	for(i=0;i<SWAP_CUST2_LEN;i++) {
		vfutBscInqEbiEfsTrdResponseT.swapCust2[i]= ' ';
	}
	char lswapCust2[SWAP_CUST2_LEN] = {""};
	getStrProperty("InqEbiEfsTrd.futBscInqEbiEfsTrdResponseT.swapCust2", lswapCust2);
	memcpy(vfutBscInqEbiEfsTrdResponseT.swapCust2, lswapCust2, SWAP_CUST2_LEN);

	vfutBscInqEbiEfsTrdResponseT.cshLegEfsGrp = getCshLegEfsGrpT(testCaseNum, "futBscInqEbiEfsTrdResponseT");
	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscInqEbiEfsTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("InqEbiEfsTrd.futBscInqEbiEfsTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscInqEbiEfsTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqEbiEfsTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqEbiEfsTrd.futBscInqEbiEfsTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqEbiEfsTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqEbiEfsTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEbiEfsTrdRequestT* getFutInqEbiEfsTrdRequestT(char* testCaseNum) {
	vfutInqEbiEfsTrdRequestT = (futInqEbiEfsTrdRequestT*)malloc(sizeof(futInqEbiEfsTrdRequestT));
	int i;

	vfutInqEbiEfsTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqEbiEfsTrdRequestT");
	vfutInqEbiEfsTrdRequestT->basic = getFutBscInqEbiEfsTrdRequestT(testCaseNum, "futInqEbiEfsTrdRequestT");
	return vfutInqEbiEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEbiEfsTrdResponseT* getFutInqEbiEfsTrdResponseT(char* testCaseNum) {
	vfutInqEbiEfsTrdResponseT = (futInqEbiEfsTrdResponseT*)malloc(sizeof(futInqEbiEfsTrdResponseT));
	int i;

	vfutInqEbiEfsTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqEbiEfsTrdResponseT");
	vfutInqEbiEfsTrdResponseT->basic = getFutBscInqEbiEfsTrdResponseT(testCaseNum, "futInqEbiEfsTrdResponseT");
	return vfutInqEbiEfsTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEbiEfsTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEbiEfsTrdRequestT));
	futInqEbiEfsTrdRequestT *vfutInqEbiEfsTrdRequestT = getFutInqEbiEfsTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEbiEfsTrdRequestT), (jbyte*) vfutInqEbiEfsTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEbiEfsTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEbiEfsTrdResponseT));
	futInqEbiEfsTrdResponseT *vfutInqEbiEfsTrdResponseT = getFutInqEbiEfsTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEbiEfsTrdResponseT), (jbyte*) vfutInqEbiEfsTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEbiEfsTrdRequestT(futBscInqEbiEfsTrdRequestT actual, futBscInqEbiEfsTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfsTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEbiEfsTrdResponseT(futBscInqEbiEfsTrdResponseT actual, futBscInqEbiEfsTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareEbiTrdInqRespGrpT (actual.ebiTrdInqRespGrp,expected.ebiTrdInqRespGrp, logMsg);
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfsTrdResponseT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust1, expected.swapCust1, SWAP_CUST1_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfsTrdResponseT, swapCust1 not matching. Actual %s but Expected %s", actual.swapCust1, expected.swapCust1);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust2, expected.swapCust2, SWAP_CUST2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfsTrdResponseT, swapCust2 not matching. Actual %s but Expected %s", actual.swapCust2, expected.swapCust2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfsGrpT (actual.cshLegEfsGrp,expected.cshLegEfsGrp, logMsg);
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfsTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiEfsTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_EBI_EFS_TRD_RESP_REC_MAX;i++) {
		compareBscInqEbiTrdRespRecT (actual.bscInqEbiTrdRespRec[i],expected.bscInqEbiTrdRespRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEbiEfsTrdRequestT(futInqEbiEfsTrdRequestT actual, futInqEbiEfsTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEbiEfsTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEbiEfsTrdResponseT(futInqEbiEfsTrdResponseT actual, futInqEbiEfsTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEbiEfsTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEbiEfsTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEbiEfsTrdRequestT *actualData = (futInqEbiEfsTrdRequestT *)msgStruct;
	futInqEbiEfsTrdRequestT* expectedData = getFutInqEbiEfsTrdRequestT(testCaseNum);
	compareFutInqEbiEfsTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEbiEfsTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEbiEfsTrdResponseT *actualData = (futInqEbiEfsTrdResponseT *)msgStruct;
	futInqEbiEfsTrdResponseT* expectedData = getFutInqEbiEfsTrdResponseT(testCaseNum);
	compareFutInqEbiEfsTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
