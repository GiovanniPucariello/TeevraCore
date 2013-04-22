#include <EntFlxCntrClsOut.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxCntrClsOutGrpT getBscEntFlxCntrClsOutGrpT(char* testCaseNum , const char *root) {
	bscEntFlxCntrClsOutGrpT vbscEntFlxCntrClsOutGrpT;
	int i;

	for(i=0;i<TRN_ID_SFX_NO_LEN;i++) {
		vbscEntFlxCntrClsOutGrpT.trnIdSfxNo[i]= ' ';
	}
	char ltrnIdSfxNo[TRN_ID_SFX_NO_LEN] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutGrpT.trnIdSfxNo", ltrnIdSfxNo);
	memcpy(vbscEntFlxCntrClsOutGrpT.trnIdSfxNo, ltrnIdSfxNo, TRN_ID_SFX_NO_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutGrpT.buyCod", lbuyCod);
	vbscEntFlxCntrClsOutGrpT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntFlxCntrClsOutGrpT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutGrpT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntFlxCntrClsOutGrpT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntFlxCntrClsOutGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxCntrClsOutRequestT getBscEntFlxCntrClsOutRequestT(char* testCaseNum , const char *root) {
	bscEntFlxCntrClsOutRequestT vbscEntFlxCntrClsOutRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntFlxCntrClsOutRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutRequestT.prodId", lprodId);
	memcpy(vbscEntFlxCntrClsOutRequestT.prodId, lprodId, PROD_ID_LEN);

	vbscEntFlxCntrClsOutRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntFlxCntrClsOutRequestT");
	for(i=0;i<FLX_CNTR_TRN_ID_NO_LEN;i++) {
		vbscEntFlxCntrClsOutRequestT.flxCntrTrnIdNo[i]= ' ';
	}
	char lflxCntrTrnIdNo[FLX_CNTR_TRN_ID_NO_LEN] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutRequestT.flxCntrTrnIdNo", lflxCntrTrnIdNo);
	memcpy(vbscEntFlxCntrClsOutRequestT.flxCntrTrnIdNo, lflxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntFlxCntrClsOutRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutRequestT.trdXQty", ltrdXQty);
	memcpy(vbscEntFlxCntrClsOutRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	vbscEntFlxCntrClsOutRequestT.txtGrp = getTxtGrpT(testCaseNum, "bscEntFlxCntrClsOutRequestT");	return vbscEntFlxCntrClsOutRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entFlxCntrClsOutRequestT getEntFlxCntrClsOutRequestT(char* testCaseNum , const char *root) {
	entFlxCntrClsOutRequestT ventFlxCntrClsOutRequestT;
	int i;

	ventFlxCntrClsOutRequestT.header = getDataHeaderT(testCaseNum, "entFlxCntrClsOutRequestT");
	ventFlxCntrClsOutRequestT.basic = getBscEntFlxCntrClsOutRequestT(testCaseNum, "entFlxCntrClsOutRequestT");	return ventFlxCntrClsOutRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxCntrClsOutRecT getBscEntFlxCntrClsOutRecT(char* testCaseNum , const char *root) {
	bscEntFlxCntrClsOutRecT vbscEntFlxCntrClsOutRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutRecT.buyCod", lbuyCod);
	vbscEntFlxCntrClsOutRecT.buyCod = lbuyCod[0];

	for(i=0;i<TRN_ID_SFX_NO_LEN;i++) {
		vbscEntFlxCntrClsOutRecT.trnIdSfxNo[i]= ' ';
	}
	char ltrnIdSfxNo[TRN_ID_SFX_NO_LEN] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutRecT.trnIdSfxNo", ltrnIdSfxNo);
	memcpy(vbscEntFlxCntrClsOutRecT.trnIdSfxNo, ltrnIdSfxNo, TRN_ID_SFX_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntFlxCntrClsOutRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntFlxCntrClsOutRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntFlxCntrClsOutRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxCntrClsOutResponseT getBscEntFlxCntrClsOutResponseT(char* testCaseNum , const char *root) {
	bscEntFlxCntrClsOutResponseT vbscEntFlxCntrClsOutResponseT;
	int i;

	for(i=0;i<FLX_CNTR_TRN_ID_NO_LEN;i++) {
		vbscEntFlxCntrClsOutResponseT.flxCntrTrnIdNo[i]= ' ';
	}
	char lflxCntrTrnIdNo[FLX_CNTR_TRN_ID_NO_LEN] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutResponseT.flxCntrTrnIdNo", lflxCntrTrnIdNo);
	memcpy(vbscEntFlxCntrClsOutResponseT.flxCntrTrnIdNo, lflxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntFlxCntrClsOutResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("EntFlxCntrClsOut.bscEntFlxCntrClsOutResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscEntFlxCntrClsOutResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);
	return vbscEntFlxCntrClsOutResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entFlxCntrClsOutResponseT getEntFlxCntrClsOutResponseT(char* testCaseNum , const char *root) {
	entFlxCntrClsOutResponseT ventFlxCntrClsOutResponseT;
	int i;

	ventFlxCntrClsOutResponseT.header = getDataHeaderT(testCaseNum, "entFlxCntrClsOutResponseT");
	ventFlxCntrClsOutResponseT.basic = getBscEntFlxCntrClsOutResponseT(testCaseNum, "entFlxCntrClsOutResponseT");	return ventFlxCntrClsOutResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxCntrClsOutGrpT(bscEntFlxCntrClsOutGrpT actual, bscEntFlxCntrClsOutGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdSfxNo, expected.trnIdSfxNo, TRN_ID_SFX_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutGrpT, trnIdSfxNo not matching. Actual %s but Expected %s", actual.trnIdSfxNo, expected.trnIdSfxNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutGrpT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxCntrClsOutRequestT(bscEntFlxCntrClsOutRequestT actual, bscEntFlxCntrClsOutRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutRequestT, flxCntrTrnIdNo not matching. Actual %s but Expected %s", actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_FLX_CNTR_CLS_OUT_GRP_MAX;i++) {
		compareBscEntFlxCntrClsOutGrpT (actual.bscEntFlxCntrClsOutGrp[i],expected.bscEntFlxCntrClsOutGrp[i], logMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntFlxCntrClsOutRequestT(entFlxCntrClsOutRequestT actual, entFlxCntrClsOutRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntFlxCntrClsOutRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxCntrClsOutRecT(bscEntFlxCntrClsOutRecT actual, bscEntFlxCntrClsOutRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdSfxNo, expected.trnIdSfxNo, TRN_ID_SFX_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutRecT, trnIdSfxNo not matching. Actual %s but Expected %s", actual.trnIdSfxNo, expected.trnIdSfxNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxCntrClsOutResponseT(bscEntFlxCntrClsOutResponseT actual, bscEntFlxCntrClsOutResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutResponseT, flxCntrTrnIdNo not matching. Actual %s but Expected %s", actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_FLX_CNTR_CLS_OUT_REC_MAX;i++) {
		compareBscEntFlxCntrClsOutRecT (actual.bscEntFlxCntrClsOutRec[i],expected.bscEntFlxCntrClsOutRec[i], logMsg);
	}
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrClsOutResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntFlxCntrClsOutResponseT(entFlxCntrClsOutResponseT actual, entFlxCntrClsOutResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntFlxCntrClsOutResponseT (actual.basic,expected.basic, logMsg);
}

