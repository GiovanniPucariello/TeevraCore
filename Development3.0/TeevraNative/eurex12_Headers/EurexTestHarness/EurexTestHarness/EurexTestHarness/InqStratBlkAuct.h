#include <InqStratBlkAuct.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratBlkAuctGrpT getBscInqStratBlkAuctGrpT(char* testCaseNum , const char *root) {
	bscInqStratBlkAuctGrpT vbscInqStratBlkAuctGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqStratBlkAuctGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqStratBlkAuct.bscInqStratBlkAuctGrpT.prodId", lprodId);
	memcpy(vbscInqStratBlkAuctGrpT.prodId, lprodId, PROD_ID_LEN);
	return vbscInqStratBlkAuctGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratBlkAuctRequestT getBscInqStratBlkAuctRequestT(char* testCaseNum , const char *root) {
	bscInqStratBlkAuctRequestT vbscInqStratBlkAuctRequestT;
	int i;

	vbscInqStratBlkAuctRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqStratBlkAuctRequestT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqStratBlkAuctRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqStratBlkAuct.bscInqStratBlkAuctRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqStratBlkAuctRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqStratBlkAuctRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqStratBlkAuct.bscInqStratBlkAuctRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqStratBlkAuctRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqStratBlkAuctRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqStratBlkAuctRequestT getInqStratBlkAuctRequestT(char* testCaseNum , const char *root) {
	inqStratBlkAuctRequestT vinqStratBlkAuctRequestT;
	int i;

	vinqStratBlkAuctRequestT.header = getDataHeaderT(testCaseNum, "inqStratBlkAuctRequestT");
	vinqStratBlkAuctRequestT.basic = getBscInqStratBlkAuctRequestT(testCaseNum, "inqStratBlkAuctRequestT");	return vinqStratBlkAuctRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratBlkAuctRecT getBscInqStratBlkAuctRecT(char* testCaseNum , const char *root) {
	bscInqStratBlkAuctRecT vbscInqStratBlkAuctRecT;
	int i;

	vbscInqStratBlkAuctRecT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscInqStratBlkAuctRecT");
	char lblkAuctStsCod[1] = {""};
	getStrProperty("InqStratBlkAuct.bscInqStratBlkAuctRecT.blkAuctStsCod", lblkAuctStsCod);
	vbscInqStratBlkAuctRecT.blkAuctStsCod = lblkAuctStsCod[0];

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqStratBlkAuctRecT.blkAuctStrtTim[i]= ' ';
	}
	char lblkAuctStrtTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqStratBlkAuct.bscInqStratBlkAuctRecT.blkAuctStrtTim", lblkAuctStrtTim);
	memcpy(vbscInqStratBlkAuctRecT.blkAuctStrtTim, lblkAuctStrtTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqStratBlkAuctRecT.blkAuctQty[i]= ' ';
	}
	char lblkAuctQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqStratBlkAuct.bscInqStratBlkAuctRecT.blkAuctQty", lblkAuctQty);
	memcpy(vbscInqStratBlkAuctRecT.blkAuctQty, lblkAuctQty, DRIV_QUANTITY_LEN);

	vbscInqStratBlkAuctRecT.blkAuctPotPrcGrp = getBlkAuctPotPrcGrpT(testCaseNum, "bscInqStratBlkAuctRecT");
	for(i=0;i<MBR_RTNG_LEN;i++) {
		vbscInqStratBlkAuctRecT.membRtng[i]= ' ';
	}
	char lmembRtng[MBR_RTNG_LEN] = {""};
	getStrProperty("InqStratBlkAuct.bscInqStratBlkAuctRecT.membRtng", lmembRtng);
	memcpy(vbscInqStratBlkAuctRecT.membRtng, lmembRtng, MBR_RTNG_LEN);
	return vbscInqStratBlkAuctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratBlkAuctResponseT getBscInqStratBlkAuctResponseT(char* testCaseNum , const char *root) {
	bscInqStratBlkAuctResponseT vbscInqStratBlkAuctResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqStratBlkAuctResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqStratBlkAuct.bscInqStratBlkAuctResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqStratBlkAuctResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqStratBlkAuctResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqStratBlkAuct.bscInqStratBlkAuctResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqStratBlkAuctResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqStratBlkAuctResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqStratBlkAuctResponseT getInqStratBlkAuctResponseT(char* testCaseNum , const char *root) {
	inqStratBlkAuctResponseT vinqStratBlkAuctResponseT;
	int i;

	vinqStratBlkAuctResponseT.header = getDataHeaderT(testCaseNum, "inqStratBlkAuctResponseT");
	vinqStratBlkAuctResponseT.basic = getBscInqStratBlkAuctResponseT(testCaseNum, "inqStratBlkAuctResponseT");	return vinqStratBlkAuctResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratBlkAuctGrpT(bscInqStratBlkAuctGrpT actual, bscInqStratBlkAuctGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratBlkAuctGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratBlkAuctRequestT(bscInqStratBlkAuctRequestT actual, bscInqStratBlkAuctRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_INQ_STRAT_BLK_AUCT_GRP_MAX;i++) {
		compareBscInqStratBlkAuctGrpT (actual.bscInqStratBlkAuctGrp[i],expected.bscInqStratBlkAuctGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratBlkAuctRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratBlkAuctRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqStratBlkAuctRequestT(inqStratBlkAuctRequestT actual, inqStratBlkAuctRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqStratBlkAuctRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratBlkAuctRecT(bscInqStratBlkAuctRecT actual, bscInqStratBlkAuctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	if (actual.blkAuctStsCod!= expected.blkAuctStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratBlkAuctRecT, blkAuctStsCodnot matching. Actual %d but Expected %d", actual.blkAuctStsCod, expected.blkAuctStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctStrtTim, expected.blkAuctStrtTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratBlkAuctRecT, blkAuctStrtTim not matching. Actual %s but Expected %s", actual.blkAuctStrtTim, expected.blkAuctStrtTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQty, expected.blkAuctQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratBlkAuctRecT, blkAuctQty not matching. Actual %s but Expected %s", actual.blkAuctQty, expected.blkAuctQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareBlkAuctPotPrcGrpT (actual.blkAuctPotPrcGrp,expected.blkAuctPotPrcGrp, logMsg);
	if ( memcmp(actual.membRtng, expected.membRtng, MBR_RTNG_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratBlkAuctRecT, membRtng not matching. Actual %s but Expected %s", actual.membRtng, expected.membRtng);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratBlkAuctResponseT(bscInqStratBlkAuctResponseT actual, bscInqStratBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratBlkAuctResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratBlkAuctResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < INQ_STRAT_BLK_AUCT_REC_MAX;i++) {
		compareBscInqStratBlkAuctRecT (actual.bscInqStratBlkAuctRec[i],expected.bscInqStratBlkAuctRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqStratBlkAuctResponseT(inqStratBlkAuctResponseT actual, inqStratBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqStratBlkAuctResponseT (actual.basic,expected.basic, logMsg);
}

