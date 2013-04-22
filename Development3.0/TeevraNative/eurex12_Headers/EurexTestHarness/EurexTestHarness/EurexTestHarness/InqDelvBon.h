#include <InqDelvBon.hxx>
#define BUFFER_SIZE 1000

futInqDelvBonRequestT *vfutInqDelvBonRequestT;
futInqDelvBonResponseT *vfutInqDelvBonResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDelvBonRequestT getFutBscInqDelvBonRequestT(char* testCaseNum , const char *root) {
	futBscInqDelvBonRequestT vfutBscInqDelvBonRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqDelvBonRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqDelvBon.futBscInqDelvBonRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqDelvBonRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqDelvBonRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqDelvBon.futBscInqDelvBonRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqDelvBonRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqDelvBonRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDelvBonRecT getFutBscInqDelvBonRecT(char* testCaseNum , const char *root) {
	futBscInqDelvBonRecT vfutBscInqDelvBonRecT;
	int i;

	vfutBscInqDelvBonRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqDelvBonRecT");
	for(i=0;i<ISIN_COD_LEN;i++) {
		vfutBscInqDelvBonRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqDelvBon.futBscInqDelvBonRecT.isinCod", lisinCod);
	memcpy(vfutBscInqDelvBonRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqDelvBonRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqDelvBon.futBscInqDelvBonRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqDelvBonRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqDelvBonRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDelvBonResponseT getFutBscInqDelvBonResponseT(char* testCaseNum , const char *root) {
	futBscInqDelvBonResponseT vfutBscInqDelvBonResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqDelvBonResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqDelvBon.futBscInqDelvBonResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqDelvBonResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqDelvBonResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqDelvBon.futBscInqDelvBonResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqDelvBonResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqDelvBonResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqDelvBonRecT getFutExtInqDelvBonRecT(char* testCaseNum , const char *root) {
	futExtInqDelvBonRecT vfutExtInqDelvBonRecT;
	int i;

	for(i=0;i<DRIV_SECU_NAM_LEN;i++) {
		vfutExtInqDelvBonRecT.secuNam[i]= ' ';
	}
	char lsecuNam[DRIV_SECU_NAM_LEN] = {""};
	getStrProperty("InqDelvBon.futExtInqDelvBonRecT.secuNam", lsecuNam);
	memcpy(vfutExtInqDelvBonRecT.secuNam, lsecuNam, DRIV_SECU_NAM_LEN);

	for(i=0;i<DRIV_CPN_RAT_LEN;i++) {
		vfutExtInqDelvBonRecT.cpnRat[i]= ' ';
	}
	char lcpnRat[DRIV_CPN_RAT_LEN] = {""};
	getStrProperty("InqDelvBon.futExtInqDelvBonRecT.cpnRat", lcpnRat);
	memcpy(vfutExtInqDelvBonRecT.cpnRat, lcpnRat, DRIV_CPN_RAT_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtInqDelvBonRecT.matuDat[i]= ' ';
	}
	char lmatuDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqDelvBon.futExtInqDelvBonRecT.matuDat", lmatuDat);
	memcpy(vfutExtInqDelvBonRecT.matuDat, lmatuDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtInqDelvBonRecT.lstCpnDat[i]= ' ';
	}
	char llstCpnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqDelvBon.futExtInqDelvBonRecT.lstCpnDat", llstCpnDat);
	memcpy(vfutExtInqDelvBonRecT.lstCpnDat, llstCpnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtInqDelvBonRecT.nxtCpnDat[i]= ' ';
	}
	char lnxtCpnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqDelvBon.futExtInqDelvBonRecT.nxtCpnDat", lnxtCpnDat);
	memcpy(vfutExtInqDelvBonRecT.nxtCpnDat, lnxtCpnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_CONV_FCTR_MTD_LEN;i++) {
		vfutExtInqDelvBonRecT.convFctrMtd[i]= ' ';
	}
	char lconvFctrMtd[DRIV_CONV_FCTR_MTD_LEN] = {""};
	getStrProperty("InqDelvBon.futExtInqDelvBonRecT.convFctrMtd", lconvFctrMtd);
	memcpy(vfutExtInqDelvBonRecT.convFctrMtd, lconvFctrMtd, DRIV_CONV_FCTR_MTD_LEN);

	for(i=0;i<CONV_FACT_LEN;i++) {
		vfutExtInqDelvBonRecT.convFact[i]= ' ';
	}
	char lconvFact[CONV_FACT_LEN] = {""};
	getStrProperty("InqDelvBon.futExtInqDelvBonRecT.convFact", lconvFact);
	memcpy(vfutExtInqDelvBonRecT.convFact, lconvFact, CONV_FACT_LEN);

	char lctdInd[1] = {""};
	getStrProperty("InqDelvBon.futExtInqDelvBonRecT.ctdInd", lctdInd);
	vfutExtInqDelvBonRecT.ctdInd = lctdInd[0];
	return vfutExtInqDelvBonRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqDelvBonResponseT getFutExtInqDelvBonResponseT(char* testCaseNum , const char *root) {
	futExtInqDelvBonResponseT vfutExtInqDelvBonResponseT;
	int i;
	return vfutExtInqDelvBonResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqDelvBonRequestT* getFutInqDelvBonRequestT(char* testCaseNum) {
	vfutInqDelvBonRequestT = (futInqDelvBonRequestT*)malloc(sizeof(futInqDelvBonRequestT));
	int i;

	vfutInqDelvBonRequestT->header = getDataHeaderT(testCaseNum, "futInqDelvBonRequestT");
	vfutInqDelvBonRequestT->basic = getFutBscInqDelvBonRequestT(testCaseNum, "futInqDelvBonRequestT");
	return vfutInqDelvBonRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqDelvBonResponseT* getFutInqDelvBonResponseT(char* testCaseNum) {
	vfutInqDelvBonResponseT = (futInqDelvBonResponseT*)malloc(sizeof(futInqDelvBonResponseT));
	int i;

	vfutInqDelvBonResponseT->header = getDataHeaderT(testCaseNum, "futInqDelvBonResponseT");
	vfutInqDelvBonResponseT->basic = getFutBscInqDelvBonResponseT(testCaseNum, "futInqDelvBonResponseT");
	vfutInqDelvBonResponseT->extension = getFutExtInqDelvBonResponseT(testCaseNum, "futInqDelvBonResponseT");
	return vfutInqDelvBonResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqDelvBonRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqDelvBonRequestT));
	futInqDelvBonRequestT *vfutInqDelvBonRequestT = getFutInqDelvBonRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqDelvBonRequestT), (jbyte*) vfutInqDelvBonRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqDelvBonResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqDelvBonResponseT));
	futInqDelvBonResponseT *vfutInqDelvBonResponseT = getFutInqDelvBonResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqDelvBonResponseT), (jbyte*) vfutInqDelvBonResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDelvBonRequestT(futBscInqDelvBonRequestT actual, futBscInqDelvBonRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_DELV_BON_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDelvBonRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDelvBonRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDelvBonRecT(futBscInqDelvBonRecT actual, futBscInqDelvBonRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDelvBonRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDelvBonRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDelvBonResponseT(futBscInqDelvBonResponseT actual, futBscInqDelvBonResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDelvBonResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDelvBonResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_DELV_BON_REC_MAX;i++) {
		compareFutBscInqDelvBonRecT (actual.futBscInqDelvBonRec[i],expected.futBscInqDelvBonRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqDelvBonRecT(futExtInqDelvBonRecT actual, futExtInqDelvBonRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.secuNam, expected.secuNam, DRIV_SECU_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvBonRecT, secuNam not matching. Actual %s but Expected %s", actual.secuNam, expected.secuNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnRat, expected.cpnRat, DRIV_CPN_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvBonRecT, cpnRat not matching. Actual %s but Expected %s", actual.cpnRat, expected.cpnRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.matuDat, expected.matuDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvBonRecT, matuDat not matching. Actual %s but Expected %s", actual.matuDat, expected.matuDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstCpnDat, expected.lstCpnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvBonRecT, lstCpnDat not matching. Actual %s but Expected %s", actual.lstCpnDat, expected.lstCpnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nxtCpnDat, expected.nxtCpnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvBonRecT, nxtCpnDat not matching. Actual %s but Expected %s", actual.nxtCpnDat, expected.nxtCpnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.convFctrMtd, expected.convFctrMtd, DRIV_CONV_FCTR_MTD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvBonRecT, convFctrMtd not matching. Actual %s but Expected %s", actual.convFctrMtd, expected.convFctrMtd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.convFact, expected.convFact, CONV_FACT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvBonRecT, convFact not matching. Actual %s but Expected %s", actual.convFact, expected.convFact);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ctdInd!= expected.ctdInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvBonRecT, ctdIndnot matching. Actual %d but Expected %d", actual.ctdInd, expected.ctdInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqDelvBonResponseT(futExtInqDelvBonResponseT actual, futExtInqDelvBonResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_DELV_BON_REC_MAX;i++) {
		compareFutExtInqDelvBonRecT (actual.futExtInqDelvBonRec[i],expected.futExtInqDelvBonRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqDelvBonRequestT(futInqDelvBonRequestT actual, futInqDelvBonRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqDelvBonRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqDelvBonResponseT(futInqDelvBonResponseT actual, futInqDelvBonResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqDelvBonResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqDelvBonResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqDelvBonRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqDelvBonRequestT *actualData = (futInqDelvBonRequestT *)msgStruct;
	futInqDelvBonRequestT* expectedData = getFutInqDelvBonRequestT(testCaseNum);
	compareFutInqDelvBonRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqDelvBonResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqDelvBonResponseT *actualData = (futInqDelvBonResponseT *)msgStruct;
	futInqDelvBonResponseT* expectedData = getFutInqDelvBonResponseT(testCaseNum);
	compareFutInqDelvBonResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
