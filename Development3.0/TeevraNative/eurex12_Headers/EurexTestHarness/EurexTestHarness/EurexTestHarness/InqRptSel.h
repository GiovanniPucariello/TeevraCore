#include <InqRptSel.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqRptSelPosnRequestT getBscInqRptSelPosnRequestT(char* testCaseNum , const char *root) {
	bscInqRptSelPosnRequestT vbscInqRptSelPosnRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqRptSelPosnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqRptSel.bscInqRptSelPosnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqRptSelPosnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqRptSelPosnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqRptSelRequestT getInqRptSelRequestT(char* testCaseNum , const char *root) {
	inqRptSelRequestT vinqRptSelRequestT;
	int i;

	vinqRptSelRequestT.header = getDataHeaderT(testCaseNum, "inqRptSelRequestT");
	vinqRptSelRequestT.basic = getBscInqRptSelPosnRequestT(testCaseNum, "inqRptSelRequestT");	return vinqRptSelRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqRptSelResponseT getBscInqRptSelResponseT(char* testCaseNum , const char *root) {
	bscInqRptSelResponseT vbscInqRptSelResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqRptSelResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqRptSel.bscInqRptSelResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqRptSelResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqRptSelResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqRptSel.bscInqRptSelResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqRptSelResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqRptSelResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqRptSelRecT getExtInqRptSelRecT(char* testCaseNum , const char *root) {
	extInqRptSelRecT vextInqRptSelRecT;
	int i;

	for(i=0;i<DRIV_RPT_ID_COD_LEN;i++) {
		vextInqRptSelRecT.rptIdCod[i]= ' ';
	}
	char lrptIdCod[DRIV_RPT_ID_COD_LEN] = {""};
	getStrProperty("InqRptSel.extInqRptSelRecT.rptIdCod", lrptIdCod);
	memcpy(vextInqRptSelRecT.rptIdCod, lrptIdCod, DRIV_RPT_ID_COD_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vextInqRptSelRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqRptSel.extInqRptSelRecT.prodId", lprodId);
	memcpy(vextInqRptSelRecT.prodId, lprodId, PROD_ID_LEN);

	char lfreqTypCod[1] = {""};
	getStrProperty("InqRptSel.extInqRptSelRecT.freqTypCod", lfreqTypCod);
	vextInqRptSelRecT.freqTypCod = lfreqTypCod[0];

	for(i=0;i<DRIV_RPT_NAM_LEN;i++) {
		vextInqRptSelRecT.rptNam[i]= ' ';
	}
	char lrptNam[DRIV_RPT_NAM_LEN] = {""};
	getStrProperty("InqRptSel.extInqRptSelRecT.rptNam", lrptNam);
	memcpy(vextInqRptSelRecT.rptNam, lrptNam, DRIV_RPT_NAM_LEN);

	char llocCod[1] = {""};
	getStrProperty("InqRptSel.extInqRptSelRecT.locCod", llocCod);
	vextInqRptSelRecT.locCod = llocCod[0];

	char lstdRptReqInd[1] = {""};
	getStrProperty("InqRptSel.extInqRptSelRecT.stdRptReqInd", lstdRptReqInd);
	vextInqRptSelRecT.stdRptReqInd = lstdRptReqInd[0];

	char lrawRptReqInd[1] = {""};
	getStrProperty("InqRptSel.extInqRptSelRecT.rawRptReqInd", lrawRptReqInd);
	vextInqRptSelRecT.rawRptReqInd = lrawRptReqInd[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vextInqRptSelRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqRptSel.extInqRptSelRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vextInqRptSelRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vextInqRptSelRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqRptSelResponseT getExtInqRptSelResponseT(char* testCaseNum , const char *root) {
	extInqRptSelResponseT vextInqRptSelResponseT;
	int i;
	return vextInqRptSelResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqRptSelResponseT getInqRptSelResponseT(char* testCaseNum , const char *root) {
	inqRptSelResponseT vinqRptSelResponseT;
	int i;

	vinqRptSelResponseT.header = getDataHeaderT(testCaseNum, "inqRptSelResponseT");
	vinqRptSelResponseT.basic = getBscInqRptSelResponseT(testCaseNum, "inqRptSelResponseT");
	vinqRptSelResponseT.extension = getExtInqRptSelResponseT(testCaseNum, "inqRptSelResponseT");	return vinqRptSelResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqRptSelPosnRequestT(bscInqRptSelPosnRequestT actual, bscInqRptSelPosnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqRptSelPosnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqRptSelRequestT(inqRptSelRequestT actual, inqRptSelRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqRptSelPosnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqRptSelResponseT(bscInqRptSelResponseT actual, bscInqRptSelResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqRptSelResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqRptSelResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqRptSelRecT(extInqRptSelRecT actual, extInqRptSelRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rptIdCod, expected.rptIdCod, DRIV_RPT_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqRptSelRecT, rptIdCod not matching. Actual %s but Expected %s", actual.rptIdCod, expected.rptIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqRptSelRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.freqTypCod!= expected.freqTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqRptSelRecT, freqTypCodnot matching. Actual %d but Expected %d", actual.freqTypCod, expected.freqTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.rptNam, expected.rptNam, DRIV_RPT_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqRptSelRecT, rptNam not matching. Actual %s but Expected %s", actual.rptNam, expected.rptNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.locCod!= expected.locCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqRptSelRecT, locCodnot matching. Actual %d but Expected %d", actual.locCod, expected.locCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.stdRptReqInd!= expected.stdRptReqInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqRptSelRecT, stdRptReqIndnot matching. Actual %d but Expected %d", actual.stdRptReqInd, expected.stdRptReqInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.rawRptReqInd!= expected.rawRptReqInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqRptSelRecT, rawRptReqIndnot matching. Actual %d but Expected %d", actual.rawRptReqInd, expected.rawRptReqInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqRptSelRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqRptSelResponseT(extInqRptSelResponseT actual, extInqRptSelResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_RPT_SEL_REC_MAX;i++) {
		compareExtInqRptSelRecT (actual.extInqRptSelRec[i],expected.extInqRptSelRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqRptSelResponseT(inqRptSelResponseT actual, inqRptSelResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqRptSelResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqRptSelResponseT (actual.extension,expected.extension, logMsg);
}

