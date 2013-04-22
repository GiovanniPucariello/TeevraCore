#include <InqOptMgnParm.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOptMgnParmGrpT getBscInqOptMgnParmGrpT(char* testCaseNum , const char *root) {
	bscInqOptMgnParmGrpT vbscInqOptMgnParmGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqOptMgnParmGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqOptMgnParm.bscInqOptMgnParmGrpT.prodId", lprodId);
	memcpy(vbscInqOptMgnParmGrpT.prodId, lprodId, PROD_ID_LEN);
	return vbscInqOptMgnParmGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOptMgnParmRequestT getBscInqOptMgnParmRequestT(char* testCaseNum , const char *root) {
	bscInqOptMgnParmRequestT vbscInqOptMgnParmRequestT;
	int i;

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqOptMgnParmRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOptMgnParm.bscInqOptMgnParmRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqOptMgnParmRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqOptMgnParmRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOptMgnParm.bscInqOptMgnParmRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqOptMgnParmRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqOptMgnParmRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqOptMgnParmRequestT getInqOptMgnParmRequestT(char* testCaseNum , const char *root) {
	inqOptMgnParmRequestT vinqOptMgnParmRequestT;
	int i;

	vinqOptMgnParmRequestT.header = getDataHeaderT(testCaseNum, "inqOptMgnParmRequestT");
	vinqOptMgnParmRequestT.basic = getBscInqOptMgnParmRequestT(testCaseNum, "inqOptMgnParmRequestT");	return vinqOptMgnParmRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOptMgnParmRecT getBscInqOptMgnParmRecT(char* testCaseNum , const char *root) {
	bscInqOptMgnParmRecT vbscInqOptMgnParmRecT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqOptMgnParmRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqOptMgnParm.bscInqOptMgnParmRecT.prodId", lprodId);
	memcpy(vbscInqOptMgnParmRecT.prodId, lprodId, PROD_ID_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("InqOptMgnParm.bscInqOptMgnParmRecT.cntrClasCod", lcntrClasCod);
	vbscInqOptMgnParmRecT.cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vbscInqOptMgnParmRecT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("InqOptMgnParm.bscInqOptMgnParmRecT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vbscInqOptMgnParmRecT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vbscInqOptMgnParmRecT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("InqOptMgnParm.bscInqOptMgnParmRecT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vbscInqOptMgnParmRecT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqOptMgnParmRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqOptMgnParm.bscInqOptMgnParmRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqOptMgnParmRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqOptMgnParmRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOptMgnParmResponseT getBscInqOptMgnParmResponseT(char* testCaseNum , const char *root) {
	bscInqOptMgnParmResponseT vbscInqOptMgnParmResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqOptMgnParmResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOptMgnParm.bscInqOptMgnParmResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqOptMgnParmResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqOptMgnParmResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOptMgnParm.bscInqOptMgnParmResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqOptMgnParmResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqOptMgnParmResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqOptMgnParmRecT getExtInqOptMgnParmRecT(char* testCaseNum , const char *root) {
	extInqOptMgnParmRecT vextInqOptMgnParmRecT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextInqOptMgnParmRecT.undrPrcOfst[i]= ' ';
	}
	char lundrPrcOfst[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOptMgnParm.extInqOptMgnParmRecT.undrPrcOfst", lundrPrcOfst);
	memcpy(vextInqOptMgnParmRecT.undrPrcOfst, lundrPrcOfst, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_UNDR_PRC_OFST_DCML_LEN;i++) {
		vextInqOptMgnParmRecT.undrPrcOfstDcml[i]= ' ';
	}
	char lundrPrcOfstDcml[DRIV_UNDR_PRC_OFST_DCML_LEN] = {""};
	getStrProperty("InqOptMgnParm.extInqOptMgnParmRecT.undrPrcOfstDcml", lundrPrcOfstDcml);
	memcpy(vextInqOptMgnParmRecT.undrPrcOfstDcml, lundrPrcOfstDcml, DRIV_UNDR_PRC_OFST_DCML_LEN);

	for(i=0;i<DRIV_DOM_RAT_LEN;i++) {
		vextInqOptMgnParmRecT.domRat[i]= ' ';
	}
	char ldomRat[DRIV_DOM_RAT_LEN] = {""};
	getStrProperty("InqOptMgnParm.extInqOptMgnParmRecT.domRat", ldomRat);
	memcpy(vextInqOptMgnParmRecT.domRat, ldomRat, DRIV_DOM_RAT_LEN);

	for(i=0;i<DRIV_FORGN_RAT_LEN;i++) {
		vextInqOptMgnParmRecT.forgnRat[i]= ' ';
	}
	char lforgnRat[DRIV_FORGN_RAT_LEN] = {""};
	getStrProperty("InqOptMgnParm.extInqOptMgnParmRecT.forgnRat", lforgnRat);
	memcpy(vextInqOptMgnParmRecT.forgnRat, lforgnRat, DRIV_FORGN_RAT_LEN);
	return vextInqOptMgnParmRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqOptMgnParmResponseT getExtInqOptMgnParmResponseT(char* testCaseNum , const char *root) {
	extInqOptMgnParmResponseT vextInqOptMgnParmResponseT;
	int i;
	return vextInqOptMgnParmResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqOptMgnParmResponseT getInqOptMgnParmResponseT(char* testCaseNum , const char *root) {
	inqOptMgnParmResponseT vinqOptMgnParmResponseT;
	int i;

	vinqOptMgnParmResponseT.header = getDataHeaderT(testCaseNum, "inqOptMgnParmResponseT");
	vinqOptMgnParmResponseT.basic = getBscInqOptMgnParmResponseT(testCaseNum, "inqOptMgnParmResponseT");
	vinqOptMgnParmResponseT.extension = getExtInqOptMgnParmResponseT(testCaseNum, "inqOptMgnParmResponseT");	return vinqOptMgnParmResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOptMgnParmGrpT(bscInqOptMgnParmGrpT actual, bscInqOptMgnParmGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOptMgnParmGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOptMgnParmRequestT(bscInqOptMgnParmRequestT actual, bscInqOptMgnParmRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_INQ_OPT_MGN_PARM_GRP_MAX;i++) {
		compareBscInqOptMgnParmGrpT (actual.bscInqOptMgnParmGrp[i],expected.bscInqOptMgnParmGrp[i], logMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOptMgnParmRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOptMgnParmRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqOptMgnParmRequestT(inqOptMgnParmRequestT actual, inqOptMgnParmRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqOptMgnParmRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOptMgnParmRecT(bscInqOptMgnParmRecT actual, bscInqOptMgnParmRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOptMgnParmRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOptMgnParmRecT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOptMgnParmRecT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOptMgnParmRecT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOptMgnParmRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOptMgnParmResponseT(bscInqOptMgnParmResponseT actual, bscInqOptMgnParmResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOptMgnParmResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOptMgnParmResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_OPT_MGN_PARM_REC_MAX;i++) {
		compareBscInqOptMgnParmRecT (actual.bscInqOptMgnParmRec[i],expected.bscInqOptMgnParmRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqOptMgnParmRecT(extInqOptMgnParmRecT actual, extInqOptMgnParmRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.undrPrcOfst, expected.undrPrcOfst, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOptMgnParmRecT, undrPrcOfst not matching. Actual %s but Expected %s", actual.undrPrcOfst, expected.undrPrcOfst);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrPrcOfstDcml, expected.undrPrcOfstDcml, DRIV_UNDR_PRC_OFST_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOptMgnParmRecT, undrPrcOfstDcml not matching. Actual %s but Expected %s", actual.undrPrcOfstDcml, expected.undrPrcOfstDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.domRat, expected.domRat, DRIV_DOM_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOptMgnParmRecT, domRat not matching. Actual %s but Expected %s", actual.domRat, expected.domRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.forgnRat, expected.forgnRat, DRIV_FORGN_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOptMgnParmRecT, forgnRat not matching. Actual %s but Expected %s", actual.forgnRat, expected.forgnRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqOptMgnParmResponseT(extInqOptMgnParmResponseT actual, extInqOptMgnParmResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_OPT_MGN_PARM_REC_MAX;i++) {
		compareExtInqOptMgnParmRecT (actual.extInqOptMgnParmRec[i],expected.extInqOptMgnParmRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqOptMgnParmResponseT(inqOptMgnParmResponseT actual, inqOptMgnParmResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqOptMgnParmResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqOptMgnParmResponseT (actual.extension,expected.extension, logMsg);
}

