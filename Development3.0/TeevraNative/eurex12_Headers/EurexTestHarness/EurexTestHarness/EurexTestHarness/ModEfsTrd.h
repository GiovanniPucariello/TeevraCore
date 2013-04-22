#include <ModEfsTrd.hxx>
#define BUFFER_SIZE 1000

futModEfsTrdRequestT *vfutModEfsTrdRequestT;
futModEfsTrdResponseT *vfutModEfsTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEfsTrdRequestT getFutBscModEfsTrdRequestT(char* testCaseNum , const char *root) {
	futBscModEfsTrdRequestT vfutBscModEfsTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.buyCod", lbuyCod);
	vfutBscModEfsTrdRequestT.buyCod = lbuyCod[0];

	vfutBscModEfsTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModEfsTrdRequestT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscModEfsTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscModEfsTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscModEfsTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscModEfsTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscModEfsTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscModEfsTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscModEfsTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<SWAP_CUST1_LEN;i++) {
		vfutBscModEfsTrdRequestT.swapCust1[i]= ' ';
	}
	char lswapCust1[SWAP_CUST1_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.swapCust1", lswapCust1);
	memcpy(vfutBscModEfsTrdRequestT.swapCust1, lswapCust1, SWAP_CUST1_LEN);

	for(i=0;i<SWAP_CUST2_LEN;i++) {
		vfutBscModEfsTrdRequestT.swapCust2[i]= ' ';
	}
	char lswapCust2[SWAP_CUST2_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.swapCust2", lswapCust2);
	memcpy(vfutBscModEfsTrdRequestT.swapCust2, lswapCust2, SWAP_CUST2_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vfutBscModEfsTrdRequestT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.nomVal", lnomVal);
	memcpy(vfutBscModEfsTrdRequestT.nomVal, lnomVal, NOM_VAL_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModEfsTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vfutBscModEfsTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModEfsTrdRequestT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.futPrc", lfutPrc);
	memcpy(vfutBscModEfsTrdRequestT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscModEfsTrdRequestT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.setlDat", lsetlDat);
	memcpy(vfutBscModEfsTrdRequestT.setlDat, lsetlDat, DRIV_DATE_LEN);

	vfutBscModEfsTrdRequestT.cshLegEfsGrp = getCshLegEfsGrpT(testCaseNum, "futBscModEfsTrdRequestT");
	vfutBscModEfsTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscModEfsTrdRequestT");
	vfutBscModEfsTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futBscModEfsTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscModEfsTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscModEfsTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEfsTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEfsTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModEfsTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEfsTrdResponseT getFutBscModEfsTrdResponseT(char* testCaseNum , const char *root) {
	futBscModEfsTrdResponseT vfutBscModEfsTrdResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEfsTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEfsTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscModEfsTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("ModEfsTrd.futBscModEfsTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscModEfsTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);
	return vfutBscModEfsTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEfsTrdRequestT* getFutModEfsTrdRequestT(char* testCaseNum) {
	vfutModEfsTrdRequestT = (futModEfsTrdRequestT*)malloc(sizeof(futModEfsTrdRequestT));
	int i;

	vfutModEfsTrdRequestT->header = getDataHeaderT(testCaseNum, "futModEfsTrdRequestT");
	vfutModEfsTrdRequestT->basic = getFutBscModEfsTrdRequestT(testCaseNum, "futModEfsTrdRequestT");
	return vfutModEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModEfsTrdResponseT* getFutModEfsTrdResponseT(char* testCaseNum) {
	vfutModEfsTrdResponseT = (futModEfsTrdResponseT*)malloc(sizeof(futModEfsTrdResponseT));
	int i;

	vfutModEfsTrdResponseT->header = getDataHeaderT(testCaseNum, "futModEfsTrdResponseT");
	vfutModEfsTrdResponseT->basic = getFutBscModEfsTrdResponseT(testCaseNum, "futModEfsTrdResponseT");
	return vfutModEfsTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEfsTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEfsTrdRequestT));
	futModEfsTrdRequestT *vfutModEfsTrdRequestT = getFutModEfsTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEfsTrdRequestT), (jbyte*) vfutModEfsTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModEfsTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModEfsTrdResponseT));
	futModEfsTrdResponseT *vfutModEfsTrdResponseT = getFutModEfsTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModEfsTrdResponseT), (jbyte*) vfutModEfsTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEfsTrdRequestT(futBscModEfsTrdRequestT actual, futBscModEfsTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust1, expected.swapCust1, SWAP_CUST1_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, swapCust1 not matching. Actual %s but Expected %s", actual.swapCust1, expected.swapCust1);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust2, expected.swapCust2, SWAP_CUST2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, swapCust2 not matching. Actual %s but Expected %s", actual.swapCust2, expected.swapCust2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfsGrpT (actual.cshLegEfsGrp,expected.cshLegEfsGrp, logMsg);
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEfsTrdResponseT(futBscModEfsTrdResponseT actual, futBscModEfsTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEfsTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEfsTrdRequestT(futModEfsTrdRequestT actual, futModEfsTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEfsTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModEfsTrdResponseT(futModEfsTrdResponseT actual, futModEfsTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModEfsTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEfsTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEfsTrdRequestT *actualData = (futModEfsTrdRequestT *)msgStruct;
	futModEfsTrdRequestT* expectedData = getFutModEfsTrdRequestT(testCaseNum);
	compareFutModEfsTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModEfsTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModEfsTrdResponseT *actualData = (futModEfsTrdResponseT *)msgStruct;
	futModEfsTrdResponseT* expectedData = getFutModEfsTrdResponseT(testCaseNum);
	compareFutModEfsTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
