#include <InqDlyMgn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqDlyMgnRequestT getBscInqDlyMgnRequestT(char* testCaseNum , const char *root) {
	bscInqDlyMgnRequestT vbscInqDlyMgnRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vbscInqDlyMgnRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqDlyMgn.bscInqDlyMgnRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vbscInqDlyMgnRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqDlyMgnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqDlyMgn.bscInqDlyMgnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqDlyMgnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqDlyMgnRequestT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqDlyMgn.bscInqDlyMgnRequestT.currTypCod", lcurrTypCod);
	memcpy(vbscInqDlyMgnRequestT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqDlyMgnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqDlyMgn.bscInqDlyMgnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqDlyMgnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqDlyMgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqDlyMgnRequestT getInqDlyMgnRequestT(char* testCaseNum , const char *root) {
	inqDlyMgnRequestT vinqDlyMgnRequestT;
	int i;

	vinqDlyMgnRequestT.header = getDataHeaderT(testCaseNum, "inqDlyMgnRequestT");
	vinqDlyMgnRequestT.basic = getBscInqDlyMgnRequestT(testCaseNum, "inqDlyMgnRequestT");	return vinqDlyMgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqDlyMgnResponseT getBscInqDlyMgnResponseT(char* testCaseNum , const char *root) {
	bscInqDlyMgnResponseT vbscInqDlyMgnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqDlyMgnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqDlyMgn.bscInqDlyMgnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqDlyMgnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqDlyMgnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqDlyMgn.bscInqDlyMgnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqDlyMgnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqDlyMgnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqDlyMgnRecT getExtInqDlyMgnRecT(char* testCaseNum , const char *root) {
	extInqDlyMgnRecT vextInqDlyMgnRecT;
	int i;

	vextInqDlyMgnRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqDlyMgnRecT");
	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqDlyMgnRecT.optPrmMgn[i]= ' ';
	}
	char loptPrmMgn[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqDlyMgn.extInqDlyMgnRecT.optPrmMgn", loptPrmMgn);
	memcpy(vextInqDlyMgnRecT.optPrmMgn, loptPrmMgn, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqDlyMgnRecT.futSprdMgn[i]= ' ';
	}
	char lfutSprdMgn[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqDlyMgn.extInqDlyMgnRecT.futSprdMgn", lfutSprdMgn);
	memcpy(vextInqDlyMgnRecT.futSprdMgn, lfutSprdMgn, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqDlyMgnRecT.addlMgn[i]= ' ';
	}
	char laddlMgn[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqDlyMgn.extInqDlyMgnRecT.addlMgn", laddlMgn);
	memcpy(vextInqDlyMgnRecT.addlMgn, laddlMgn, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqDlyMgnRecT.dlvMgn[i]= ' ';
	}
	char ldlvMgn[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqDlyMgn.extInqDlyMgnRecT.dlvMgn", ldlvMgn);
	memcpy(vextInqDlyMgnRecT.dlvMgn, ldlvMgn, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqDlyMgnRecT.mgnReqrAmnt[i]= ' ';
	}
	char lmgnReqrAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqDlyMgn.extInqDlyMgnRecT.mgnReqrAmnt", lmgnReqrAmnt);
	memcpy(vextInqDlyMgnRecT.mgnReqrAmnt, lmgnReqrAmnt, DRIV_AMOUNT_LEN);
	return vextInqDlyMgnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqDlyMgnResponseT getExtInqDlyMgnResponseT(char* testCaseNum , const char *root) {
	extInqDlyMgnResponseT vextInqDlyMgnResponseT;
	int i;

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqDlyMgnResponseT.clgMembMgnReqr[i]= ' ';
	}
	char lclgMembMgnReqr[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqDlyMgn.extInqDlyMgnResponseT.clgMembMgnReqr", lclgMembMgnReqr);
	memcpy(vextInqDlyMgnResponseT.clgMembMgnReqr, lclgMembMgnReqr, DRIV_AMOUNT_LEN);

	char lvalUnknownInd[1] = {""};
	getStrProperty("InqDlyMgn.extInqDlyMgnResponseT.valUnknownInd", lvalUnknownInd);
	vextInqDlyMgnResponseT.valUnknownInd = lvalUnknownInd[0];
	return vextInqDlyMgnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqDlyMgnResponseT getInqDlyMgnResponseT(char* testCaseNum , const char *root) {
	inqDlyMgnResponseT vinqDlyMgnResponseT;
	int i;

	vinqDlyMgnResponseT.header = getDataHeaderT(testCaseNum, "inqDlyMgnResponseT");
	vinqDlyMgnResponseT.basic = getBscInqDlyMgnResponseT(testCaseNum, "inqDlyMgnResponseT");
	vinqDlyMgnResponseT.extension = getExtInqDlyMgnResponseT(testCaseNum, "inqDlyMgnResponseT");	return vinqDlyMgnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqDlyMgnRequestT(bscInqDlyMgnRequestT actual, bscInqDlyMgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqDlyMgnRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqDlyMgnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqDlyMgnRequestT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqDlyMgnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqDlyMgnRequestT(inqDlyMgnRequestT actual, inqDlyMgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqDlyMgnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqDlyMgnResponseT(bscInqDlyMgnResponseT actual, bscInqDlyMgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqDlyMgnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqDlyMgnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqDlyMgnRecT(extInqDlyMgnRecT actual, extInqDlyMgnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.optPrmMgn, expected.optPrmMgn, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqDlyMgnRecT, optPrmMgn not matching. Actual %s but Expected %s", actual.optPrmMgn, expected.optPrmMgn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futSprdMgn, expected.futSprdMgn, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqDlyMgnRecT, futSprdMgn not matching. Actual %s but Expected %s", actual.futSprdMgn, expected.futSprdMgn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.addlMgn, expected.addlMgn, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqDlyMgnRecT, addlMgn not matching. Actual %s but Expected %s", actual.addlMgn, expected.addlMgn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlvMgn, expected.dlvMgn, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqDlyMgnRecT, dlvMgn not matching. Actual %s but Expected %s", actual.dlvMgn, expected.dlvMgn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mgnReqrAmnt, expected.mgnReqrAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqDlyMgnRecT, mgnReqrAmnt not matching. Actual %s but Expected %s", actual.mgnReqrAmnt, expected.mgnReqrAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqDlyMgnResponseT(extInqDlyMgnResponseT actual, extInqDlyMgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.clgMembMgnReqr, expected.clgMembMgnReqr, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqDlyMgnResponseT, clgMembMgnReqr not matching. Actual %s but Expected %s", actual.clgMembMgnReqr, expected.clgMembMgnReqr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.valUnknownInd!= expected.valUnknownInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqDlyMgnResponseT, valUnknownIndnot matching. Actual %d but Expected %d", actual.valUnknownInd, expected.valUnknownInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_INQ_DLY_MGN_REC_MAX;i++) {
		compareExtInqDlyMgnRecT (actual.extInqDlyMgnRec[i],expected.extInqDlyMgnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqDlyMgnResponseT(inqDlyMgnResponseT actual, inqDlyMgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqDlyMgnResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqDlyMgnResponseT (actual.extension,expected.extension, logMsg);
}

