#include <InqCshTrn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCshTrnRequestT getBscInqCshTrnRequestT(char* testCaseNum , const char *root) {
	bscInqCshTrnRequestT vbscInqCshTrnRequestT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqCshTrnRequestT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnRequestT.currTypCod", lcurrTypCod);
	memcpy(vbscInqCshTrnRequestT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqCshTrnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqCshTrnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqCshTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCshTrnRequestT getInqCshTrnRequestT(char* testCaseNum , const char *root) {
	inqCshTrnRequestT vinqCshTrnRequestT;
	int i;

	vinqCshTrnRequestT.header = getDataHeaderT(testCaseNum, "inqCshTrnRequestT");
	vinqCshTrnRequestT.basic = getBscInqCshTrnRequestT(testCaseNum, "inqCshTrnRequestT");	return vinqCshTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCshTrnRecT getBscInqCshTrnRecT(char* testCaseNum , const char *root) {
	bscInqCshTrnRecT vbscInqCshTrnRecT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqCshTrnRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnRecT.trnDat", ltrnDat);
	memcpy(vbscInqCshTrnRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqCshTrnRecT.valDat[i]= ' ';
	}
	char lvalDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnRecT.valDat", lvalDat);
	memcpy(vbscInqCshTrnRecT.valDat, lvalDat, DRIV_DATE_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscInqCshTrnRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnRecT.trnIdNo", ltrnIdNo);
	memcpy(vbscInqCshTrnRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_CSH_ACCT_TRN_TYP_LEN;i++) {
		vbscInqCshTrnRecT.cshAcctTrnTyp[i]= ' ';
	}
	char lcshAcctTrnTyp[DRIV_CSH_ACCT_TRN_TYP_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnRecT.cshAcctTrnTyp", lcshAcctTrnTyp);
	memcpy(vbscInqCshTrnRecT.cshAcctTrnTyp, lcshAcctTrnTyp, DRIV_CSH_ACCT_TRN_TYP_LEN);

	for(i=0;i<DRIV_TRN_TYP_DSCR_LEN;i++) {
		vbscInqCshTrnRecT.trnTypDscr[i]= ' ';
	}
	char ltrnTypDscr[DRIV_TRN_TYP_DSCR_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnRecT.trnTypDscr", ltrnTypDscr);
	memcpy(vbscInqCshTrnRecT.trnTypDscr, ltrnTypDscr, DRIV_TRN_TYP_DSCR_LEN);

	for(i=0;i<CSH_MVT_LEN;i++) {
		vbscInqCshTrnRecT.cshMvt[i]= ' ';
	}
	char lcshMvt[CSH_MVT_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnRecT.cshMvt", lcshMvt);
	memcpy(vbscInqCshTrnRecT.cshMvt, lcshMvt, CSH_MVT_LEN);

	for(i=0;i<TEXT_LEN;i++) {
		vbscInqCshTrnRecT.text[i]= ' ';
	}
	char ltext[TEXT_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnRecT.text", ltext);
	memcpy(vbscInqCshTrnRecT.text, ltext, TEXT_LEN);
	return vbscInqCshTrnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCshTrnResponseT getBscInqCshTrnResponseT(char* testCaseNum , const char *root) {
	bscInqCshTrnResponseT vbscInqCshTrnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqCshTrnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqCshTrnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqCshTrnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCshTrn.bscInqCshTrnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqCshTrnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqCshTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCshTrnResponseT getInqCshTrnResponseT(char* testCaseNum , const char *root) {
	inqCshTrnResponseT vinqCshTrnResponseT;
	int i;

	vinqCshTrnResponseT.header = getDataHeaderT(testCaseNum, "inqCshTrnResponseT");
	vinqCshTrnResponseT.basic = getBscInqCshTrnResponseT(testCaseNum, "inqCshTrnResponseT");	return vinqCshTrnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCshTrnRequestT(bscInqCshTrnRequestT actual, bscInqCshTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnRequestT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCshTrnRequestT(inqCshTrnRequestT actual, inqCshTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCshTrnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCshTrnRecT(bscInqCshTrnRecT actual, bscInqCshTrnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.valDat, expected.valDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnRecT, valDat not matching. Actual %s but Expected %s", actual.valDat, expected.valDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshAcctTrnTyp, expected.cshAcctTrnTyp, DRIV_CSH_ACCT_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnRecT, cshAcctTrnTyp not matching. Actual %s but Expected %s", actual.cshAcctTrnTyp, expected.cshAcctTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTypDscr, expected.trnTypDscr, DRIV_TRN_TYP_DSCR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnRecT, trnTypDscr not matching. Actual %s but Expected %s", actual.trnTypDscr, expected.trnTypDscr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshMvt, expected.cshMvt, CSH_MVT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnRecT, cshMvt not matching. Actual %s but Expected %s", actual.cshMvt, expected.cshMvt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.text, expected.text, TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnRecT, text not matching. Actual %s but Expected %s", actual.text, expected.text);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCshTrnResponseT(bscInqCshTrnResponseT actual, bscInqCshTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCshTrnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_CSH_TRN_REC_MAX;i++) {
		compareBscInqCshTrnRecT (actual.bscInqCshTrnRec[i],expected.bscInqCshTrnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCshTrnResponseT(inqCshTrnResponseT actual, inqCshTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCshTrnResponseT (actual.basic,expected.basic, logMsg);
}

