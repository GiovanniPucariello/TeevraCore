#include <InqCollSts.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCollStsRequestT getBscInqCollStsRequestT(char* testCaseNum , const char *root) {
	bscInqCollStsRequestT vbscInqCollStsRequestT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqCollStsRequestT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsRequestT.currTypCod", lcurrTypCod);
	memcpy(vbscInqCollStsRequestT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char lasstPurpCod[1] = {""};
	getStrProperty("InqCollSts.bscInqCollStsRequestT.asstPurpCod", lasstPurpCod);
	vbscInqCollStsRequestT.asstPurpCod = lasstPurpCod[0];
	return vbscInqCollStsRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCollStsRequestT getInqCollStsRequestT(char* testCaseNum , const char *root) {
	inqCollStsRequestT vinqCollStsRequestT;
	int i;

	vinqCollStsRequestT.header = getDataHeaderT(testCaseNum, "inqCollStsRequestT");
	vinqCollStsRequestT.basic = getBscInqCollStsRequestT(testCaseNum, "inqCollStsRequestT");	return vinqCollStsRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCollStsRecT getBscInqCollStsRecT(char* testCaseNum , const char *root) {
	bscInqCollStsRecT vbscInqCollStsRecT;
	int i;

	char lvalUnknownInd[1] = {""};
	getStrProperty("InqCollSts.bscInqCollStsRecT.valUnknownInd", lvalUnknownInd);
	vbscInqCollStsRecT.valUnknownInd = lvalUnknownInd[0];

	for(i=0;i<BAL_ACTN_COD_LEN;i++) {
		vbscInqCollStsRecT.balActnCod[i]= ' ';
	}
	char lbalActnCod[BAL_ACTN_COD_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsRecT.balActnCod", lbalActnCod);
	memcpy(vbscInqCollStsRecT.balActnCod, lbalActnCod, BAL_ACTN_COD_LEN);

	for(i=0;i<DRIV_BAL_ACT_LEN;i++) {
		vbscInqCollStsRecT.balAct[i]= ' ';
	}
	char lbalAct[DRIV_BAL_ACT_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsRecT.balAct", lbalAct);
	memcpy(vbscInqCollStsRecT.balAct, lbalAct, DRIV_BAL_ACT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqCollStsRecT.cshBalAmnt[i]= ' ';
	}
	char lcshBalAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsRecT.cshBalAmnt", lcshBalAmnt);
	memcpy(vbscInqCollStsRecT.cshBalAmnt, lcshBalAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqCollStsRecT.secuBalAmnt[i]= ' ';
	}
	char lsecuBalAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsRecT.secuBalAmnt", lsecuBalAmnt);
	memcpy(vbscInqCollStsRecT.secuBalAmnt, lsecuBalAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqCollStsRecT.guarBalAmnt[i]= ' ';
	}
	char lguarBalAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsRecT.guarBalAmnt", lguarBalAmnt);
	memcpy(vbscInqCollStsRecT.guarBalAmnt, lguarBalAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqCollStsRecT.clrCurrBalAmnt[i]= ' ';
	}
	char lclrCurrBalAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsRecT.clrCurrBalAmnt", lclrCurrBalAmnt);
	memcpy(vbscInqCollStsRecT.clrCurrBalAmnt, lclrCurrBalAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqCollStsRecT.totBalAmnt[i]= ' ';
	}
	char ltotBalAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsRecT.totBalAmnt", ltotBalAmnt);
	memcpy(vbscInqCollStsRecT.totBalAmnt, ltotBalAmnt, DRIV_AMOUNT_LEN);
	return vbscInqCollStsRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCollStsResponseT getBscInqCollStsResponseT(char* testCaseNum , const char *root) {
	bscInqCollStsResponseT vbscInqCollStsResponseT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqCollStsResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsResponseT.currTypCod", lcurrTypCod);
	memcpy(vbscInqCollStsResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_CLG_MEMB_CURR_TYP_COD_LEN;i++) {
		vbscInqCollStsResponseT.clgMembCurrTypCod[i]= ' ';
	}
	char lclgMembCurrTypCod[DRIV_CLG_MEMB_CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsResponseT.clgMembCurrTypCod", lclgMembCurrTypCod);
	memcpy(vbscInqCollStsResponseT.clgMembCurrTypCod, lclgMembCurrTypCod, DRIV_CLG_MEMB_CURR_TYP_COD_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vbscInqCollStsResponseT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsResponseT.exchRat", lexchRat);
	memcpy(vbscInqCollStsResponseT.exchRat, lexchRat, EXCH_RAT_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqCollStsResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCollSts.bscInqCollStsResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqCollStsResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqCollStsResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCollStsResponseT getInqCollStsResponseT(char* testCaseNum , const char *root) {
	inqCollStsResponseT vinqCollStsResponseT;
	int i;

	vinqCollStsResponseT.header = getDataHeaderT(testCaseNum, "inqCollStsResponseT");
	vinqCollStsResponseT.basic = getBscInqCollStsResponseT(testCaseNum, "inqCollStsResponseT");	return vinqCollStsResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCollStsRequestT(bscInqCollStsRequestT actual, bscInqCollStsRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsRequestT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asstPurpCod!= expected.asstPurpCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsRequestT, asstPurpCodnot matching. Actual %d but Expected %d", actual.asstPurpCod, expected.asstPurpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCollStsRequestT(inqCollStsRequestT actual, inqCollStsRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCollStsRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCollStsRecT(bscInqCollStsRecT actual, bscInqCollStsRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.valUnknownInd!= expected.valUnknownInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsRecT, valUnknownIndnot matching. Actual %d but Expected %d", actual.valUnknownInd, expected.valUnknownInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.balActnCod, expected.balActnCod, BAL_ACTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsRecT, balActnCod not matching. Actual %s but Expected %s", actual.balActnCod, expected.balActnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.balAct, expected.balAct, DRIV_BAL_ACT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsRecT, balAct not matching. Actual %s but Expected %s", actual.balAct, expected.balAct);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshBalAmnt, expected.cshBalAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsRecT, cshBalAmnt not matching. Actual %s but Expected %s", actual.cshBalAmnt, expected.cshBalAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuBalAmnt, expected.secuBalAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsRecT, secuBalAmnt not matching. Actual %s but Expected %s", actual.secuBalAmnt, expected.secuBalAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.guarBalAmnt, expected.guarBalAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsRecT, guarBalAmnt not matching. Actual %s but Expected %s", actual.guarBalAmnt, expected.guarBalAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.clrCurrBalAmnt, expected.clrCurrBalAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsRecT, clrCurrBalAmnt not matching. Actual %s but Expected %s", actual.clrCurrBalAmnt, expected.clrCurrBalAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totBalAmnt, expected.totBalAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsRecT, totBalAmnt not matching. Actual %s but Expected %s", actual.totBalAmnt, expected.totBalAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCollStsResponseT(bscInqCollStsResponseT actual, bscInqCollStsResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.clgMembCurrTypCod, expected.clgMembCurrTypCod, DRIV_CLG_MEMB_CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsResponseT, clgMembCurrTypCod not matching. Actual %s but Expected %s", actual.clgMembCurrTypCod, expected.clgMembCurrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsResponseT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollStsResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_COLL_STS_REC_MAX;i++) {
		compareBscInqCollStsRecT (actual.bscInqCollStsRec[i],expected.bscInqCollStsRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCollStsResponseT(inqCollStsResponseT actual, inqCollStsResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCollStsResponseT (actual.basic,expected.basic, logMsg);
}

