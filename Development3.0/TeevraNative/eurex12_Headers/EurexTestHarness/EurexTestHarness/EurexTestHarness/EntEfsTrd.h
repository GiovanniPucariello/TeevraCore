#include <EntEfsTrd.hxx>
#define BUFFER_SIZE 1000

futEntEfsTrdRequestT *vfutEntEfsTrdRequestT;
futEntEfsTrdResponseT *vfutEntEfsTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEfsTrdRequestT getFutBscEntEfsTrdRequestT(char* testCaseNum , const char *root) {
	futBscEntEfsTrdRequestT vfutBscEntEfsTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdRequestT.buyCod", lbuyCod);
	vfutBscEntEfsTrdRequestT.buyCod = lbuyCod[0];

	vfutBscEntEfsTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntEfsTrdRequestT");
	vfutBscEntEfsTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntEfsTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscEntEfsTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscEntEfsTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscEntEfsTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<SWAP_CUST1_LEN;i++) {
		vfutBscEntEfsTrdRequestT.swapCust1[i]= ' ';
	}
	char lswapCust1[SWAP_CUST1_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdRequestT.swapCust1", lswapCust1);
	memcpy(vfutBscEntEfsTrdRequestT.swapCust1, lswapCust1, SWAP_CUST1_LEN);

	for(i=0;i<SWAP_CUST2_LEN;i++) {
		vfutBscEntEfsTrdRequestT.swapCust2[i]= ' ';
	}
	char lswapCust2[SWAP_CUST2_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdRequestT.swapCust2", lswapCust2);
	memcpy(vfutBscEntEfsTrdRequestT.swapCust2, lswapCust2, SWAP_CUST2_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vfutBscEntEfsTrdRequestT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdRequestT.nomVal", lnomVal);
	memcpy(vfutBscEntEfsTrdRequestT.nomVal, lnomVal, NOM_VAL_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntEfsTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vfutBscEntEfsTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntEfsTrdRequestT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdRequestT.futPrc", lfutPrc);
	memcpy(vfutBscEntEfsTrdRequestT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntEfsTrdRequestT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdRequestT.setlDat", lsetlDat);
	memcpy(vfutBscEntEfsTrdRequestT.setlDat, lsetlDat, DRIV_DATE_LEN);

	vfutBscEntEfsTrdRequestT.cshLegEfsGrp = getCshLegEfsGrpT(testCaseNum, "futBscEntEfsTrdRequestT");
	vfutBscEntEfsTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscEntEfsTrdRequestT");
	vfutBscEntEfsTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futBscEntEfsTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscEntEfsTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscEntEfsTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutBscEntEfsTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEfsTrdResponseT getFutBscEntEfsTrdResponseT(char* testCaseNum , const char *root) {
	futBscEntEfsTrdResponseT vfutBscEntEfsTrdResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntEfsTrdResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntEfsTrdResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntEfsTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntEfsTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscEntEfsTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("EntEfsTrd.futBscEntEfsTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscEntEfsTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);
	return vfutBscEntEfsTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEfsTrdRequestT* getFutEntEfsTrdRequestT(char* testCaseNum) {
	vfutEntEfsTrdRequestT = (futEntEfsTrdRequestT*)malloc(sizeof(futEntEfsTrdRequestT));
	int i;

	vfutEntEfsTrdRequestT->header = getDataHeaderT(testCaseNum, "futEntEfsTrdRequestT");
	vfutEntEfsTrdRequestT->basic = getFutBscEntEfsTrdRequestT(testCaseNum, "futEntEfsTrdRequestT");
	return vfutEntEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntEfsTrdResponseT* getFutEntEfsTrdResponseT(char* testCaseNum) {
	vfutEntEfsTrdResponseT = (futEntEfsTrdResponseT*)malloc(sizeof(futEntEfsTrdResponseT));
	int i;

	vfutEntEfsTrdResponseT->header = getDataHeaderT(testCaseNum, "futEntEfsTrdResponseT");
	vfutEntEfsTrdResponseT->basic = getFutBscEntEfsTrdResponseT(testCaseNum, "futEntEfsTrdResponseT");
	return vfutEntEfsTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEfsTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEfsTrdRequestT));
	futEntEfsTrdRequestT *vfutEntEfsTrdRequestT = getFutEntEfsTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEfsTrdRequestT), (jbyte*) vfutEntEfsTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntEfsTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntEfsTrdResponseT));
	futEntEfsTrdResponseT *vfutEntEfsTrdResponseT = getFutEntEfsTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntEfsTrdResponseT), (jbyte*) vfutEntEfsTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEfsTrdRequestT(futBscEntEfsTrdRequestT actual, futBscEntEfsTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust1, expected.swapCust1, SWAP_CUST1_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdRequestT, swapCust1 not matching. Actual %s but Expected %s", actual.swapCust1, expected.swapCust1);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust2, expected.swapCust2, SWAP_CUST2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdRequestT, swapCust2 not matching. Actual %s but Expected %s", actual.swapCust2, expected.swapCust2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdRequestT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdRequestT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdRequestT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfsGrpT (actual.cshLegEfsGrp,expected.cshLegEfsGrp, logMsg);
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEfsTrdResponseT(futBscEntEfsTrdResponseT actual, futBscEntEfsTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEfsTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEfsTrdRequestT(futEntEfsTrdRequestT actual, futEntEfsTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEfsTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntEfsTrdResponseT(futEntEfsTrdResponseT actual, futEntEfsTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntEfsTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEfsTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEfsTrdRequestT *actualData = (futEntEfsTrdRequestT *)msgStruct;
	futEntEfsTrdRequestT* expectedData = getFutEntEfsTrdRequestT(testCaseNum);
	compareFutEntEfsTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntEfsTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntEfsTrdResponseT *actualData = (futEntEfsTrdResponseT *)msgStruct;
	futEntEfsTrdResponseT* expectedData = getFutEntEfsTrdResponseT(testCaseNum);
	compareFutEntEfsTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
