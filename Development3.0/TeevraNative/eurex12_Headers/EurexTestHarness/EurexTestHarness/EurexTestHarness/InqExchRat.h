#include <InqExchRat.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqExchRatRequestT getBscInqExchRatRequestT(char* testCaseNum , const char *root) {
	bscInqExchRatRequestT vbscInqExchRatRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqExchRatRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqExchRat.bscInqExchRatRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqExchRatRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqExchRatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqExchRatRequestT getInqExchRatRequestT(char* testCaseNum , const char *root) {
	inqExchRatRequestT vinqExchRatRequestT;
	int i;

	vinqExchRatRequestT.header = getDataHeaderT(testCaseNum, "inqExchRatRequestT");
	vinqExchRatRequestT.basic = getBscInqExchRatRequestT(testCaseNum, "inqExchRatRequestT");	return vinqExchRatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqExchRatRecT getBscInqExchRatRecT(char* testCaseNum , const char *root) {
	bscInqExchRatRecT vbscInqExchRatRecT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqExchRatRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqExchRat.bscInqExchRatRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqExchRatRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vbscInqExchRatRecT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("InqExchRat.bscInqExchRatRecT.exchRat", lexchRat);
	memcpy(vbscInqExchRatRecT.exchRat, lexchRat, EXCH_RAT_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqExchRatRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqExchRat.bscInqExchRatRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqExchRatRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqExchRatRecT.maxCshAmntPosnTsf[i]= ' ';
	}
	char lmaxCshAmntPosnTsf[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqExchRat.bscInqExchRatRecT.maxCshAmntPosnTsf", lmaxCshAmntPosnTsf);
	memcpy(vbscInqExchRatRecT.maxCshAmntPosnTsf, lmaxCshAmntPosnTsf, DRIV_AMOUNT_LEN);
	return vbscInqExchRatRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqExchRatResponseT getBscInqExchRatResponseT(char* testCaseNum , const char *root) {
	bscInqExchRatResponseT vbscInqExchRatResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqExchRatResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqExchRat.bscInqExchRatResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqExchRatResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqExchRatResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqExchRat.bscInqExchRatResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqExchRatResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<CURR_TYP_COD_TO_LEN;i++) {
		vbscInqExchRatResponseT.currTypCodTo[i]= ' ';
	}
	char lcurrTypCodTo[CURR_TYP_COD_TO_LEN] = {""};
	getStrProperty("InqExchRat.bscInqExchRatResponseT.currTypCodTo", lcurrTypCodTo);
	memcpy(vbscInqExchRatResponseT.currTypCodTo, lcurrTypCodTo, CURR_TYP_COD_TO_LEN);
	return vbscInqExchRatResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqExchRatHrctRecT getExtInqExchRatHrctRecT(char* testCaseNum , const char *root) {
	extInqExchRatHrctRecT vextInqExchRatHrctRecT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vextInqExchRatHrctRecT.eurexCurrTypCod[i]= ' ';
	}
	char leurexCurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqExchRat.extInqExchRatHrctRecT.eurexCurrTypCod", leurexCurrTypCod);
	memcpy(vextInqExchRatHrctRecT.eurexCurrTypCod, leurexCurrTypCod, CURR_TYP_COD_LEN);

	vextInqExchRatHrctRecT.crsCurrHrctGrp = getCrsCurrHrctGrpT(testCaseNum, "extInqExchRatHrctRecT");
	vextInqExchRatHrctRecT.prvCrsCurrHrctGrp = getPrvCrsCurrHrctGrpT(testCaseNum, "extInqExchRatHrctRecT");	return vextInqExchRatHrctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqExchRatRecT getExtInqExchRatRecT(char* testCaseNum , const char *root) {
	extInqExchRatRecT vextInqExchRatRecT;
	int i;

	for(i=0;i<PRV_EXCH_RAT_LEN;i++) {
		vextInqExchRatRecT.prvExchRat[i]= ' ';
	}
	char lprvExchRat[PRV_EXCH_RAT_LEN] = {""};
	getStrProperty("InqExchRat.extInqExchRatRecT.prvExchRat", lprvExchRat);
	memcpy(vextInqExchRatRecT.prvExchRat, lprvExchRat, PRV_EXCH_RAT_LEN);

	for(i=0;i<DRIV_SETL_PERD_LEN;i++) {
		vextInqExchRatRecT.setlPerd[i]= ' ';
	}
	char lsetlPerd[DRIV_SETL_PERD_LEN] = {""};
	getStrProperty("InqExchRat.extInqExchRatRecT.setlPerd", lsetlPerd);
	memcpy(vextInqExchRatRecT.setlPerd, lsetlPerd, DRIV_SETL_PERD_LEN);

	for(i=0;i<DRIV_SHT_CLDR_NAM_LEN;i++) {
		vextInqExchRatRecT.shtCldrNam[i]= ' ';
	}
	char lshtCldrNam[DRIV_SHT_CLDR_NAM_LEN] = {""};
	getStrProperty("InqExchRat.extInqExchRatRecT.shtCldrNam", lshtCldrNam);
	memcpy(vextInqExchRatRecT.shtCldrNam, lshtCldrNam, DRIV_SHT_CLDR_NAM_LEN);

	for(i=0;i<DRIV_SHT_CURR_TEXT_LEN;i++) {
		vextInqExchRatRecT.shtCurrText[i]= ' ';
	}
	char lshtCurrText[DRIV_SHT_CURR_TEXT_LEN] = {""};
	getStrProperty("InqExchRat.extInqExchRatRecT.shtCurrText", lshtCurrText);
	memcpy(vextInqExchRatRecT.shtCurrText, lshtCurrText, DRIV_SHT_CURR_TEXT_LEN);

	for(i=0;i<DRIV_CSH_CLCT_CURR_LEN;i++) {
		vextInqExchRatRecT.cshClctCurr[i]= ' ';
	}
	char lcshClctCurr[DRIV_CSH_CLCT_CURR_LEN] = {""};
	getStrProperty("InqExchRat.extInqExchRatRecT.cshClctCurr", lcshClctCurr);
	memcpy(vextInqExchRatRecT.cshClctCurr, lcshClctCurr, DRIV_CSH_CLCT_CURR_LEN);

	char lcntlBnkCurrInd[1] = {""};
	getStrProperty("InqExchRat.extInqExchRatRecT.cntlBnkCurrInd", lcntlBnkCurrInd);
	vextInqExchRatRecT.cntlBnkCurrInd = lcntlBnkCurrInd[0];

	char lpermCshInd[1] = {""};
	getStrProperty("InqExchRat.extInqExchRatRecT.permCshInd", lpermCshInd);
	vextInqExchRatRecT.permCshInd = lpermCshInd[0];

	for(i=0;i<MJR_CURR_LEN;i++) {
		vextInqExchRatRecT.mjrCurr[i]= ' ';
	}
	char lmjrCurr[MJR_CURR_LEN] = {""};
	getStrProperty("InqExchRat.extInqExchRatRecT.mjrCurr", lmjrCurr);
	memcpy(vextInqExchRatRecT.mjrCurr, lmjrCurr, MJR_CURR_LEN);
	return vextInqExchRatRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqExchRatResponseT getExtInqExchRatResponseT(char* testCaseNum , const char *root) {
	extInqExchRatResponseT vextInqExchRatResponseT;
	int i;
	return vextInqExchRatResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqExchRatResponseT getInqExchRatResponseT(char* testCaseNum , const char *root) {
	inqExchRatResponseT vinqExchRatResponseT;
	int i;

	vinqExchRatResponseT.header = getDataHeaderT(testCaseNum, "inqExchRatResponseT");
	vinqExchRatResponseT.basic = getBscInqExchRatResponseT(testCaseNum, "inqExchRatResponseT");
	vinqExchRatResponseT.extension = getExtInqExchRatResponseT(testCaseNum, "inqExchRatResponseT");	return vinqExchRatResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqExchRatRequestT(bscInqExchRatRequestT actual, bscInqExchRatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchRatRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqExchRatRequestT(inqExchRatRequestT actual, inqExchRatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqExchRatRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqExchRatRecT(bscInqExchRatRecT actual, bscInqExchRatRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchRatRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchRatRecT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchRatRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxCshAmntPosnTsf, expected.maxCshAmntPosnTsf, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchRatRecT, maxCshAmntPosnTsf not matching. Actual %s but Expected %s", actual.maxCshAmntPosnTsf, expected.maxCshAmntPosnTsf);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqExchRatResponseT(bscInqExchRatResponseT actual, bscInqExchRatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchRatResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchRatResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCodTo, expected.currTypCodTo, CURR_TYP_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchRatResponseT, currTypCodTo not matching. Actual %s but Expected %s", actual.currTypCodTo, expected.currTypCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_EXCH_RAT_REC_MAX;i++) {
		compareBscInqExchRatRecT (actual.bscInqExchRatRec[i],expected.bscInqExchRatRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqExchRatHrctRecT(extInqExchRatHrctRecT actual, extInqExchRatHrctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.eurexCurrTypCod, expected.eurexCurrTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqExchRatHrctRecT, eurexCurrTypCod not matching. Actual %s but Expected %s", actual.eurexCurrTypCod, expected.eurexCurrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareCrsCurrHrctGrpT (actual.crsCurrHrctGrp,expected.crsCurrHrctGrp, logMsg);
	comparePrvCrsCurrHrctGrpT (actual.prvCrsCurrHrctGrp,expected.prvCrsCurrHrctGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqExchRatRecT(extInqExchRatRecT actual, extInqExchRatRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prvExchRat, expected.prvExchRat, PRV_EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqExchRatRecT, prvExchRat not matching. Actual %s but Expected %s", actual.prvExchRat, expected.prvExchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlPerd, expected.setlPerd, DRIV_SETL_PERD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqExchRatRecT, setlPerd not matching. Actual %s but Expected %s", actual.setlPerd, expected.setlPerd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtCldrNam, expected.shtCldrNam, DRIV_SHT_CLDR_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqExchRatRecT, shtCldrNam not matching. Actual %s but Expected %s", actual.shtCldrNam, expected.shtCldrNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtCurrText, expected.shtCurrText, DRIV_SHT_CURR_TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqExchRatRecT, shtCurrText not matching. Actual %s but Expected %s", actual.shtCurrText, expected.shtCurrText);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshClctCurr, expected.cshClctCurr, DRIV_CSH_CLCT_CURR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqExchRatRecT, cshClctCurr not matching. Actual %s but Expected %s", actual.cshClctCurr, expected.cshClctCurr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntlBnkCurrInd!= expected.cntlBnkCurrInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqExchRatRecT, cntlBnkCurrIndnot matching. Actual %d but Expected %d", actual.cntlBnkCurrInd, expected.cntlBnkCurrInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.permCshInd!= expected.permCshInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqExchRatRecT, permCshIndnot matching. Actual %d but Expected %d", actual.permCshInd, expected.permCshInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mjrCurr, expected.mjrCurr, MJR_CURR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqExchRatRecT, mjrCurr not matching. Actual %s but Expected %s", actual.mjrCurr, expected.mjrCurr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_INQ_EXCH_RAT_HRCT_REC_MAX;i++) {
		compareExtInqExchRatHrctRecT (actual.extInqExchRatHrctRec[i],expected.extInqExchRatHrctRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqExchRatResponseT(extInqExchRatResponseT actual, extInqExchRatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_EXCH_RAT_REC_MAX;i++) {
		compareExtInqExchRatRecT (actual.extInqExchRatRec[i],expected.extInqExchRatRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqExchRatResponseT(inqExchRatResponseT actual, inqExchRatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqExchRatResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqExchRatResponseT (actual.extension,expected.extension, logMsg);
}

