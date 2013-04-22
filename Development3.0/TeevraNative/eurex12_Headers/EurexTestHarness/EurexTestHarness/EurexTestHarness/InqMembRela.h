#include <InqMembRela.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembRelaRequestT getBscInqMembRelaRequestT(char* testCaseNum , const char *root) {
	bscInqMembRelaRequestT vbscInqMembRelaRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqMembRelaRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMembRela.bscInqMembRelaRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqMembRelaRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqMembRelaRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMembRelaRequestT getInqMembRelaRequestT(char* testCaseNum , const char *root) {
	inqMembRelaRequestT vinqMembRelaRequestT;
	int i;

	vinqMembRelaRequestT.header = getDataHeaderT(testCaseNum, "inqMembRelaRequestT");
	vinqMembRelaRequestT.basic = getBscInqMembRelaRequestT(testCaseNum, "inqMembRelaRequestT");	return vinqMembRelaRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembRelaRecT getBscInqMembRelaRecT(char* testCaseNum , const char *root) {
	bscInqMembRelaRecT vbscInqMembRelaRecT;
	int i;

	char lrelaSts[1] = {""};
	getStrProperty("InqMembRela.bscInqMembRelaRecT.relaSts", lrelaSts);
	vbscInqMembRelaRecT.relaSts = lrelaSts[0];

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqMembRelaRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqMembRela.bscInqMembRelaRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqMembRelaRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqMembRelaRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqMembRela.bscInqMembRelaRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqMembRelaRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqMembRelaRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembRelaResponseT getBscInqMembRelaResponseT(char* testCaseNum , const char *root) {
	bscInqMembRelaResponseT vbscInqMembRelaResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqMembRelaResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMembRela.bscInqMembRelaResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqMembRelaResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqMembRelaResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqMembRela.bscInqMembRelaResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqMembRelaResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqMembRelaResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqMembRelaRecT getExtInqMembRelaRecT(char* testCaseNum , const char *root) {
	extInqMembRelaRecT vextInqMembRelaRecT;
	int i;

	char lprimClgMembInd[1] = {""};
	getStrProperty("InqMembRela.extInqMembRelaRecT.primClgMembInd", lprimClgMembInd);
	vextInqMembRelaRecT.primClgMembInd = lprimClgMembInd[0];

	char lgivUpAcptInd[1] = {""};
	getStrProperty("InqMembRela.extInqMembRelaRecT.givUpAcptInd", lgivUpAcptInd);
	vextInqMembRelaRecT.givUpAcptInd = lgivUpAcptInd[0];

	char ltakUpAcptInd[1] = {""};
	getStrProperty("InqMembRela.extInqMembRelaRecT.takUpAcptInd", ltakUpAcptInd);
	vextInqMembRelaRecT.takUpAcptInd = ltakUpAcptInd[0];

	char lnxtGivUpAcptInd[1] = {""};
	getStrProperty("InqMembRela.extInqMembRelaRecT.nxtGivUpAcptInd", lnxtGivUpAcptInd);
	vextInqMembRelaRecT.nxtGivUpAcptInd = lnxtGivUpAcptInd[0];

	char lnxtTakUpAcptInd[1] = {""};
	getStrProperty("InqMembRela.extInqMembRelaRecT.nxtTakUpAcptInd", lnxtTakUpAcptInd);
	vextInqMembRelaRecT.nxtTakUpAcptInd = lnxtTakUpAcptInd[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextInqMembRelaRecT.relaUpdDat[i]= ' ';
	}
	char lrelaUpdDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqMembRela.extInqMembRelaRecT.relaUpdDat", lrelaUpdDat);
	memcpy(vextInqMembRelaRecT.relaUpdDat, lrelaUpdDat, DRIV_DATE_LEN);
	return vextInqMembRelaRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqMembRelaResponseT getExtInqMembRelaResponseT(char* testCaseNum , const char *root) {
	extInqMembRelaResponseT vextInqMembRelaResponseT;
	int i;
	return vextInqMembRelaResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMembRelaResponseT getInqMembRelaResponseT(char* testCaseNum , const char *root) {
	inqMembRelaResponseT vinqMembRelaResponseT;
	int i;

	vinqMembRelaResponseT.header = getDataHeaderT(testCaseNum, "inqMembRelaResponseT");
	vinqMembRelaResponseT.basic = getBscInqMembRelaResponseT(testCaseNum, "inqMembRelaResponseT");
	vinqMembRelaResponseT.extension = getExtInqMembRelaResponseT(testCaseNum, "inqMembRelaResponseT");	return vinqMembRelaResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembRelaRequestT(bscInqMembRelaRequestT actual, bscInqMembRelaRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembRelaRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMembRelaRequestT(inqMembRelaRequestT actual, inqMembRelaRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMembRelaRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembRelaRecT(bscInqMembRelaRecT actual, bscInqMembRelaRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.relaSts!= expected.relaSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembRelaRecT, relaStsnot matching. Actual %d but Expected %d", actual.relaSts, expected.relaSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembRelaRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembRelaRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembRelaResponseT(bscInqMembRelaResponseT actual, bscInqMembRelaResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembRelaResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembRelaResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_MEMB_RELA_REC_MAX;i++) {
		compareBscInqMembRelaRecT (actual.bscInqMembRelaRec[i],expected.bscInqMembRelaRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqMembRelaRecT(extInqMembRelaRecT actual, extInqMembRelaRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.primClgMembInd!= expected.primClgMembInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembRelaRecT, primClgMembIndnot matching. Actual %d but Expected %d", actual.primClgMembInd, expected.primClgMembInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.givUpAcptInd!= expected.givUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembRelaRecT, givUpAcptIndnot matching. Actual %d but Expected %d", actual.givUpAcptInd, expected.givUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.takUpAcptInd!= expected.takUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembRelaRecT, takUpAcptIndnot matching. Actual %d but Expected %d", actual.takUpAcptInd, expected.takUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.nxtGivUpAcptInd!= expected.nxtGivUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembRelaRecT, nxtGivUpAcptIndnot matching. Actual %d but Expected %d", actual.nxtGivUpAcptInd, expected.nxtGivUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.nxtTakUpAcptInd!= expected.nxtTakUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembRelaRecT, nxtTakUpAcptIndnot matching. Actual %d but Expected %d", actual.nxtTakUpAcptInd, expected.nxtTakUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.relaUpdDat, expected.relaUpdDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembRelaRecT, relaUpdDat not matching. Actual %s but Expected %s", actual.relaUpdDat, expected.relaUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqMembRelaResponseT(extInqMembRelaResponseT actual, extInqMembRelaResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_MEMB_RELA_REC_MAX;i++) {
		compareExtInqMembRelaRecT (actual.extInqMembRelaRec[i],expected.extInqMembRelaRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMembRelaResponseT(inqMembRelaResponseT actual, inqMembRelaResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMembRelaResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqMembRelaResponseT (actual.extension,expected.extension, logMsg);
}

