#include <ReqBcastRTrm.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscReqBcastRTrmRequestT getBscReqBcastRTrmRequestT(char* testCaseNum , const char *root) {
	bscReqBcastRTrmRequestT vbscReqBcastRTrmRequestT;
	int i;

	char lreCovBcastTyp[1] = {""};
	getStrProperty("ReqBcastRTrm.bscReqBcastRTrmRequestT.reCovBcastTyp", lreCovBcastTyp);
	vbscReqBcastRTrmRequestT.reCovBcastTyp = lreCovBcastTyp[0];

	for(i=0;i<MEMB_ID_LEN;i++) {
		vbscReqBcastRTrmRequestT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("ReqBcastRTrm.bscReqBcastRTrmRequestT.membId", lmembId);
	memcpy(vbscReqBcastRTrmRequestT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<DRIV_STRT_STM_SEQ_NO_LEN;i++) {
		vbscReqBcastRTrmRequestT.strtStmSeqNo[i]= ' ';
	}
	char lstrtStmSeqNo[DRIV_STRT_STM_SEQ_NO_LEN] = {""};
	getStrProperty("ReqBcastRTrm.bscReqBcastRTrmRequestT.strtStmSeqNo", lstrtStmSeqNo);
	memcpy(vbscReqBcastRTrmRequestT.strtStmSeqNo, lstrtStmSeqNo, DRIV_STRT_STM_SEQ_NO_LEN);

	for(i=0;i<DRIV_STOP_STM_SEQ_NO_LEN;i++) {
		vbscReqBcastRTrmRequestT.stopStmSeqNo[i]= ' ';
	}
	char lstopStmSeqNo[DRIV_STOP_STM_SEQ_NO_LEN] = {""};
	getStrProperty("ReqBcastRTrm.bscReqBcastRTrmRequestT.stopStmSeqNo", lstopStmSeqNo);
	memcpy(vbscReqBcastRTrmRequestT.stopStmSeqNo, lstopStmSeqNo, DRIV_STOP_STM_SEQ_NO_LEN);

	char lbcastIntnGapSkipInd[1] = {""};
	getStrProperty("ReqBcastRTrm.bscReqBcastRTrmRequestT.bcastIntnGapSkipInd", lbcastIntnGapSkipInd);
	vbscReqBcastRTrmRequestT.bcastIntnGapSkipInd = lbcastIntnGapSkipInd[0];

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscReqBcastRTrmRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("ReqBcastRTrm.bscReqBcastRTrmRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscReqBcastRTrmRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscReqBcastRTrmRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
reqBcastRTrmRequestT getReqBcastRTrmRequestT(char* testCaseNum , const char *root) {
	reqBcastRTrmRequestT vreqBcastRTrmRequestT;
	int i;

	vreqBcastRTrmRequestT.basic = getBscReqBcastRTrmRequestT(testCaseNum, "reqBcastRTrmRequestT");	return vreqBcastRTrmRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscReqBcastRTrmResponseT getBscReqBcastRTrmResponseT(char* testCaseNum , const char *root) {
	bscReqBcastRTrmResponseT vbscReqBcastRTrmResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscReqBcastRTrmResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("ReqBcastRTrm.bscReqBcastRTrmResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscReqBcastRTrmResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<R_TRM_DATA_LEN;i++) {
		vbscReqBcastRTrmResponseT.rTrmData[i]= ' ';
	}
	char lrTrmData[R_TRM_DATA_LEN] = {""};
	getStrProperty("ReqBcastRTrm.bscReqBcastRTrmResponseT.rTrmData", lrTrmData);
	memcpy(vbscReqBcastRTrmResponseT.rTrmData, lrTrmData, R_TRM_DATA_LEN);
	return vbscReqBcastRTrmResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
reqBcastRTrmResponseT getReqBcastRTrmResponseT(char* testCaseNum , const char *root) {
	reqBcastRTrmResponseT vreqBcastRTrmResponseT;
	int i;

	vreqBcastRTrmResponseT.basic = getBscReqBcastRTrmResponseT(testCaseNum, "reqBcastRTrmResponseT");	return vreqBcastRTrmResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscReqBcastRTrmRequestT(bscReqBcastRTrmRequestT actual, bscReqBcastRTrmRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.reCovBcastTyp!= expected.reCovBcastTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscReqBcastRTrmRequestT, reCovBcastTypnot matching. Actual %d but Expected %d", actual.reCovBcastTyp, expected.reCovBcastTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscReqBcastRTrmRequestT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.strtStmSeqNo, expected.strtStmSeqNo, DRIV_STRT_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscReqBcastRTrmRequestT, strtStmSeqNo not matching. Actual %s but Expected %s", actual.strtStmSeqNo, expected.strtStmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stopStmSeqNo, expected.stopStmSeqNo, DRIV_STOP_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscReqBcastRTrmRequestT, stopStmSeqNo not matching. Actual %s but Expected %s", actual.stopStmSeqNo, expected.stopStmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.bcastIntnGapSkipInd!= expected.bcastIntnGapSkipInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscReqBcastRTrmRequestT, bcastIntnGapSkipIndnot matching. Actual %d but Expected %d", actual.bcastIntnGapSkipInd, expected.bcastIntnGapSkipInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscReqBcastRTrmRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareReqBcastRTrmRequestT(reqBcastRTrmRequestT actual, reqBcastRTrmRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBscReqBcastRTrmRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscReqBcastRTrmResponseT(bscReqBcastRTrmResponseT actual, bscReqBcastRTrmResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscReqBcastRTrmResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.rTrmData, expected.rTrmData, R_TRM_DATA_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscReqBcastRTrmResponseT, rTrmData not matching. Actual %s but Expected %s", actual.rTrmData, expected.rTrmData);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareReqBcastRTrmResponseT(reqBcastRTrmResponseT actual, reqBcastRTrmResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBscReqBcastRTrmResponseT (actual.basic,expected.basic, logMsg);
}

