#include <InqEfsTrd.hxx>
#define BUFFER_SIZE 1000

futInqEfsTrdRequestT *vfutInqEfsTrdRequestT;
futInqEfsTrdResponseT *vfutInqEfsTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfsTrdRequestT getFutBscInqEfsTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqEfsTrdRequestT vfutBscInqEfsTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqEfsTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqEfsTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscInqEfsTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqEfsTrdRequestT");	return vfutBscInqEfsTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfsTrdRecT getFutBscInqEfsTrdRecT(char* testCaseNum , const char *root) {
	futBscInqEfsTrdRecT vfutBscInqEfsTrdRecT;
	int i;

	char lopnClsCod[1] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdRecT.opnClsCod", lopnClsCod);
	vfutBscInqEfsTrdRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscInqEfsTrdRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscInqEfsTrdRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	vfutBscInqEfsTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqEfsTrdRecT");
	vfutBscInqEfsTrdRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqEfsTrdRecT");
	vfutBscInqEfsTrdRecT.txtGrp = getTxtGrpT(testCaseNum, "futBscInqEfsTrdRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscInqEfsTrdRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscInqEfsTrdRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lwhsTrdStsCod[1] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdRecT.whsTrdStsCod", lwhsTrdStsCod);
	vfutBscInqEfsTrdRecT.whsTrdStsCod = lwhsTrdStsCod[0];
	return vfutBscInqEfsTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEfsTrdResponseT getFutBscInqEfsTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqEfsTrdResponseT vfutBscInqEfsTrdResponseT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.buyCod", lbuyCod);
	vfutBscInqEfsTrdResponseT.buyCod = lbuyCod[0];

	vfutBscInqEfsTrdResponseT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqEfsTrdResponseT");
	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscInqEfsTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscInqEfsTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vfutBscInqEfsTrdResponseT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.nomVal", lnomVal);
	memcpy(vfutBscInqEfsTrdResponseT.nomVal, lnomVal, NOM_VAL_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqEfsTrdResponseT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.trdXQty", ltrdXQty);
	memcpy(vfutBscInqEfsTrdResponseT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqEfsTrdResponseT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.futPrc", lfutPrc);
	memcpy(vfutBscInqEfsTrdResponseT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqEfsTrdResponseT.setlDat[i]= ' ';
	}
	char lsetlDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.setlDat", lsetlDat);
	memcpy(vfutBscInqEfsTrdResponseT.setlDat, lsetlDat, DRIV_DATE_LEN);

	vfutBscInqEfsTrdResponseT.cshLegEfsGrp = getCshLegEfsGrpT(testCaseNum, "futBscInqEfsTrdResponseT");
	for(i=0;i<EXCH_RAT_LEN;i++) {
		vfutBscInqEfsTrdResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.exchRat", lexchRat);
	memcpy(vfutBscInqEfsTrdResponseT.exchRat, lexchRat, EXCH_RAT_LEN);

	for(i=0;i<UNDR_CURR_COD_LEN;i++) {
		vfutBscInqEfsTrdResponseT.undrCurrCod[i]= ' ';
	}
	char lundrCurrCod[UNDR_CURR_COD_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.undrCurrCod", lundrCurrCod);
	memcpy(vfutBscInqEfsTrdResponseT.undrCurrCod, lundrCurrCod, UNDR_CURR_COD_LEN);

	for(i=0;i<SWAP_CUST1_LEN;i++) {
		vfutBscInqEfsTrdResponseT.swapCust1[i]= ' ';
	}
	char lswapCust1[SWAP_CUST1_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.swapCust1", lswapCust1);
	memcpy(vfutBscInqEfsTrdResponseT.swapCust1, lswapCust1, SWAP_CUST1_LEN);

	for(i=0;i<SWAP_CUST2_LEN;i++) {
		vfutBscInqEfsTrdResponseT.swapCust2[i]= ' ';
	}
	char lswapCust2[SWAP_CUST2_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.swapCust2", lswapCust2);
	memcpy(vfutBscInqEfsTrdResponseT.swapCust2, lswapCust2, SWAP_CUST2_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqEfsTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqEfsTrd.futBscInqEfsTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqEfsTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqEfsTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEfsTrdRequestT* getFutInqEfsTrdRequestT(char* testCaseNum) {
	vfutInqEfsTrdRequestT = (futInqEfsTrdRequestT*)malloc(sizeof(futInqEfsTrdRequestT));
	int i;

	vfutInqEfsTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqEfsTrdRequestT");
	vfutInqEfsTrdRequestT->basic = getFutBscInqEfsTrdRequestT(testCaseNum, "futInqEfsTrdRequestT");
	return vfutInqEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqEfsTrdResponseT* getFutInqEfsTrdResponseT(char* testCaseNum) {
	vfutInqEfsTrdResponseT = (futInqEfsTrdResponseT*)malloc(sizeof(futInqEfsTrdResponseT));
	int i;

	vfutInqEfsTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqEfsTrdResponseT");
	vfutInqEfsTrdResponseT->basic = getFutBscInqEfsTrdResponseT(testCaseNum, "futInqEfsTrdResponseT");
	return vfutInqEfsTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEfsTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEfsTrdRequestT));
	futInqEfsTrdRequestT *vfutInqEfsTrdRequestT = getFutInqEfsTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEfsTrdRequestT), (jbyte*) vfutInqEfsTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqEfsTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqEfsTrdResponseT));
	futInqEfsTrdResponseT *vfutInqEfsTrdResponseT = getFutInqEfsTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqEfsTrdResponseT), (jbyte*) vfutInqEfsTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfsTrdRequestT(futBscInqEfsTrdRequestT actual, futBscInqEfsTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfsTrdRecT(futBscInqEfsTrdRecT actual, futBscInqEfsTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.whsTrdStsCod!= expected.whsTrdStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdRecT, whsTrdStsCodnot matching. Actual %d but Expected %d", actual.whsTrdStsCod, expected.whsTrdStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEfsTrdResponseT(futBscInqEfsTrdResponseT actual, futBscInqEfsTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDat, expected.setlDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, setlDat not matching. Actual %s but Expected %s", actual.setlDat, expected.setlDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCshLegEfsGrpT (actual.cshLegEfsGrp,expected.cshLegEfsGrp, logMsg);
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrCurrCod, expected.undrCurrCod, UNDR_CURR_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, undrCurrCod not matching. Actual %s but Expected %s", actual.undrCurrCod, expected.undrCurrCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust1, expected.swapCust1, SWAP_CUST1_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, swapCust1 not matching. Actual %s but Expected %s", actual.swapCust1, expected.swapCust1);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapCust2, expected.swapCust2, SWAP_CUST2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, swapCust2 not matching. Actual %s but Expected %s", actual.swapCust2, expected.swapCust2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_EFS_TRD_REC_MAX;i++) {
		compareFutBscInqEfsTrdRecT (actual.futBscInqEfsTrdRec[i],expected.futBscInqEfsTrdRec[i], logMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEfsTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEfsTrdRequestT(futInqEfsTrdRequestT actual, futInqEfsTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEfsTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqEfsTrdResponseT(futInqEfsTrdResponseT actual, futInqEfsTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqEfsTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEfsTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEfsTrdRequestT *actualData = (futInqEfsTrdRequestT *)msgStruct;
	futInqEfsTrdRequestT* expectedData = getFutInqEfsTrdRequestT(testCaseNum);
	compareFutInqEfsTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqEfsTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqEfsTrdResponseT *actualData = (futInqEfsTrdResponseT *)msgStruct;
	futInqEfsTrdResponseT* expectedData = getFutInqEfsTrdResponseT(testCaseNum);
	compareFutInqEfsTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
