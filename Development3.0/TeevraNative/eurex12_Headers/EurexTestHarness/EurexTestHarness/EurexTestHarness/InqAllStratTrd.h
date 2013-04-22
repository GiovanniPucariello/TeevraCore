#include <InqAllStratTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqAllStratTrdRequestT getBscInqAllStratTrdRequestT(char* testCaseNum , const char *root) {
	bscInqAllStratTrdRequestT vbscInqAllStratTrdRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqAllStratTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRequestT.prodId", lprodId);
	memcpy(vbscInqAllStratTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<STRAT_TYP_LEN;i++) {
		vbscInqAllStratTrdRequestT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRequestT.stratTyp", lstratTyp);
	memcpy(vbscInqAllStratTrdRequestT.stratTyp, lstratTyp, STRAT_TYP_LEN);

	char ltrdOrigTyp[1] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRequestT.trdOrigTyp", ltrdOrigTyp);
	vbscInqAllStratTrdRequestT.trdOrigTyp = ltrdOrigTyp[0];

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRequestT.trdTyp", ltrdTyp);
	vbscInqAllStratTrdRequestT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqAllStratTrdRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRequestT.trnDat", ltrnDat);
	memcpy(vbscInqAllStratTrdRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqAllStratTrdRequestT.timMin[i]= ' ';
	}
	char ltimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRequestT.timMin", ltimMin);
	memcpy(vbscInqAllStratTrdRequestT.timMin, ltimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqAllStratTrdRequestT.timMax[i]= ' ';
	}
	char ltimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRequestT.timMax", ltimMax);
	memcpy(vbscInqAllStratTrdRequestT.timMax, ltimMax, DRIV_TIME_LEN);

	for(i=0;i<TRD_EVNT_TRN_ID_MIN_LEN;i++) {
		vbscInqAllStratTrdRequestT.trdEvntSeqNoMin[i]= ' ';
	}
	char ltrdEvntSeqNoMin[TRD_EVNT_TRN_ID_MIN_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRequestT.trdEvntSeqNoMin", ltrdEvntSeqNoMin);
	memcpy(vbscInqAllStratTrdRequestT.trdEvntSeqNoMin, ltrdEvntSeqNoMin, TRD_EVNT_TRN_ID_MIN_LEN);

	for(i=0;i<TRD_EVNT_TRN_ID_MAX_LEN;i++) {
		vbscInqAllStratTrdRequestT.trdEvntSeqNoMax[i]= ' ';
	}
	char ltrdEvntSeqNoMax[TRD_EVNT_TRN_ID_MAX_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRequestT.trdEvntSeqNoMax", ltrdEvntSeqNoMax);
	memcpy(vbscInqAllStratTrdRequestT.trdEvntSeqNoMax, ltrdEvntSeqNoMax, TRD_EVNT_TRN_ID_MAX_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqAllStratTrdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqAllStratTrdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqAllStratTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqAllStratTrdRequestT getInqAllStratTrdRequestT(char* testCaseNum , const char *root) {
	inqAllStratTrdRequestT vinqAllStratTrdRequestT;
	int i;

	vinqAllStratTrdRequestT.header = getDataHeaderT(testCaseNum, "inqAllStratTrdRequestT");
	vinqAllStratTrdRequestT.basic = getBscInqAllStratTrdRequestT(testCaseNum, "inqAllStratTrdRequestT");	return vinqAllStratTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqAllStratTrdRecT getBscInqAllStratTrdRecT(char* testCaseNum , const char *root) {
	bscInqAllStratTrdRecT vbscInqAllStratTrdRecT;
	int i;

	vbscInqAllStratTrdRecT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscInqAllStratTrdRecT");
	vbscInqAllStratTrdRecT.stratEquLegGrp = getStratEquLegGrpT(testCaseNum, "bscInqAllStratTrdRecT");
	for(i=0;i<TRD_EVNT_TRN_ID_LEN;i++) {
		vbscInqAllStratTrdRecT.trdEvntSeqNo[i]= ' ';
	}
	char ltrdEvntSeqNo[TRD_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trdEvntSeqNo", ltrdEvntSeqNo);
	memcpy(vbscInqAllStratTrdRecT.trdEvntSeqNo, ltrdEvntSeqNo, TRD_EVNT_TRN_ID_LEN);

	char ltrdPrcTyp[1] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trdPrcTyp", ltrdPrcTyp);
	vbscInqAllStratTrdRecT.trdPrcTyp = ltrdPrcTyp[0];

	char lrevsInd[1] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.revsInd", lrevsInd);
	vbscInqAllStratTrdRecT.revsInd = lrevsInd[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqAllStratTrdRecT.trdQty[i]= ' ';
	}
	char ltrdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trdQty", ltrdQty);
	memcpy(vbscInqAllStratTrdRecT.trdQty, ltrdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqAllStratTrdRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscInqAllStratTrdRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqAllStratTrdRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trnDat", ltrnDat);
	memcpy(vbscInqAllStratTrdRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqAllStratTrdRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trnTim", ltrnTim);
	memcpy(vbscInqAllStratTrdRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	for(i=0;i<NO_OF_BUY_LEN;i++) {
		vbscInqAllStratTrdRecT.noOfBuy[i]= ' ';
	}
	char lnoOfBuy[NO_OF_BUY_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.noOfBuy", lnoOfBuy);
	memcpy(vbscInqAllStratTrdRecT.noOfBuy, lnoOfBuy, NO_OF_BUY_LEN);

	for(i=0;i<NO_OF_SEL_LEN;i++) {
		vbscInqAllStratTrdRecT.noOfSel[i]= ' ';
	}
	char lnoOfSel[NO_OF_SEL_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.noOfSel", lnoOfSel);
	memcpy(vbscInqAllStratTrdRecT.noOfSel, lnoOfSel, NO_OF_SEL_LEN);

	char lagrsrSidCod[1] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.agrsrSidCod", lagrsrSidCod);
	vbscInqAllStratTrdRecT.agrsrSidCod = lagrsrSidCod[0];

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqAllStratTrdRecT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.totTrdQty", ltotTrdQty);
	memcpy(vbscInqAllStratTrdRecT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trdTyp", ltrdTyp);
	vbscInqAllStratTrdRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscInqAllStratTrdRecT.trnIdNo1[i]= ' ';
	}
	char ltrnIdNo1[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trnIdNo1", ltrnIdNo1);
	memcpy(vbscInqAllStratTrdRecT.trnIdNo1, ltrnIdNo1, TRN_ID_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscInqAllStratTrdRecT.trnIdNo2[i]= ' ';
	}
	char ltrnIdNo2[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trnIdNo2", ltrnIdNo2);
	memcpy(vbscInqAllStratTrdRecT.trnIdNo2, ltrnIdNo2, TRN_ID_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscInqAllStratTrdRecT.trnIdNo3[i]= ' ';
	}
	char ltrnIdNo3[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trnIdNo3", ltrnIdNo3);
	memcpy(vbscInqAllStratTrdRecT.trnIdNo3, ltrnIdNo3, TRN_ID_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscInqAllStratTrdRecT.trnIdNo4[i]= ' ';
	}
	char ltrnIdNo4[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdRecT.trnIdNo4", ltrnIdNo4);
	memcpy(vbscInqAllStratTrdRecT.trnIdNo4, ltrnIdNo4, TRN_ID_NO_LEN);
	return vbscInqAllStratTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqAllStratTrdResponseT getBscInqAllStratTrdResponseT(char* testCaseNum , const char *root) {
	bscInqAllStratTrdResponseT vbscInqAllStratTrdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqAllStratTrdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqAllStratTrdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqAllStratTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAllStratTrd.bscInqAllStratTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqAllStratTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqAllStratTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqAllStratTrdResponseT getInqAllStratTrdResponseT(char* testCaseNum , const char *root) {
	inqAllStratTrdResponseT vinqAllStratTrdResponseT;
	int i;

	vinqAllStratTrdResponseT.header = getDataHeaderT(testCaseNum, "inqAllStratTrdResponseT");
	vinqAllStratTrdResponseT.basic = getBscInqAllStratTrdResponseT(testCaseNum, "inqAllStratTrdResponseT");	return vinqAllStratTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqAllStratTrdRequestT(bscInqAllStratTrdRequestT actual, bscInqAllStratTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRequestT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdOrigTyp!= expected.trdOrigTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRequestT, trdOrigTypnot matching. Actual %d but Expected %d", actual.trdOrigTyp, expected.trdOrigTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMin, expected.timMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRequestT, timMin not matching. Actual %s but Expected %s", actual.timMin, expected.timMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMax, expected.timMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRequestT, timMax not matching. Actual %s but Expected %s", actual.timMax, expected.timMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdEvntSeqNoMin, expected.trdEvntSeqNoMin, TRD_EVNT_TRN_ID_MIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRequestT, trdEvntSeqNoMin not matching. Actual %s but Expected %s", actual.trdEvntSeqNoMin, expected.trdEvntSeqNoMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdEvntSeqNoMax, expected.trdEvntSeqNoMax, TRD_EVNT_TRN_ID_MAX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRequestT, trdEvntSeqNoMax not matching. Actual %s but Expected %s", actual.trdEvntSeqNoMax, expected.trdEvntSeqNoMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqAllStratTrdRequestT(inqAllStratTrdRequestT actual, inqAllStratTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqAllStratTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqAllStratTrdRecT(bscInqAllStratTrdRecT actual, bscInqAllStratTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareStratEquLegGrpT (actual.stratEquLegGrp,expected.stratEquLegGrp, logMsg);
	if ( memcmp(actual.trdEvntSeqNo, expected.trdEvntSeqNo, TRD_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trdEvntSeqNo not matching. Actual %s but Expected %s", actual.trdEvntSeqNo, expected.trdEvntSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdPrcTyp!= expected.trdPrcTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trdPrcTypnot matching. Actual %d but Expected %d", actual.trdPrcTyp, expected.trdPrcTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.revsInd!= expected.revsInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, revsIndnot matching. Actual %d but Expected %d", actual.revsInd, expected.revsInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdQty, expected.trdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trdQty not matching. Actual %s but Expected %s", actual.trdQty, expected.trdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfBuy, expected.noOfBuy, NO_OF_BUY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, noOfBuy not matching. Actual %s but Expected %s", actual.noOfBuy, expected.noOfBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfSel, expected.noOfSel, NO_OF_SEL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, noOfSel not matching. Actual %s but Expected %s", actual.noOfSel, expected.noOfSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.agrsrSidCod!= expected.agrsrSidCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, agrsrSidCodnot matching. Actual %d but Expected %d", actual.agrsrSidCod, expected.agrsrSidCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo1, expected.trnIdNo1, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trnIdNo1 not matching. Actual %s but Expected %s", actual.trnIdNo1, expected.trnIdNo1);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo2, expected.trnIdNo2, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trnIdNo2 not matching. Actual %s but Expected %s", actual.trnIdNo2, expected.trnIdNo2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo3, expected.trnIdNo3, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trnIdNo3 not matching. Actual %s but Expected %s", actual.trnIdNo3, expected.trnIdNo3);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo4, expected.trnIdNo4, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdRecT, trnIdNo4 not matching. Actual %s but Expected %s", actual.trnIdNo4, expected.trnIdNo4);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqAllStratTrdResponseT(bscInqAllStratTrdResponseT actual, bscInqAllStratTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllStratTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_ALL_STRAT_TRD_REC_MAX;i++) {
		compareBscInqAllStratTrdRecT (actual.bscInqAllStratTrdRec[i],expected.bscInqAllStratTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqAllStratTrdResponseT(inqAllStratTrdResponseT actual, inqAllStratTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqAllStratTrdResponseT (actual.basic,expected.basic, logMsg);
}

