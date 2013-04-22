#include <EntFlxCntrTrdSprn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxCntrTrdSprnGrpT getBscEntFlxCntrTrdSprnGrpT(char* testCaseNum , const char *root) {
	bscEntFlxCntrTrdSprnGrpT vbscEntFlxCntrTrdSprnGrpT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscEntFlxCntrTrdSprnGrpT.trnLngQty[i]= ' ';
	}
	char ltrnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnGrpT.trnLngQty", ltrnLngQty);
	memcpy(vbscEntFlxCntrTrdSprnGrpT.trnLngQty, ltrnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscEntFlxCntrTrdSprnGrpT.trnShtQty[i]= ' ';
	}
	char ltrnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnGrpT.trnShtQty", ltrnShtQty);
	memcpy(vbscEntFlxCntrTrdSprnGrpT.trnShtQty, ltrnShtQty, DRIV_QUANTITY_LEN);

	vbscEntFlxCntrTrdSprnGrpT.txtGrp = getTxtGrpT(testCaseNum, "bscEntFlxCntrTrdSprnGrpT");	return vbscEntFlxCntrTrdSprnGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxCntrTrdSprnRequestT getBscEntFlxCntrTrdSprnRequestT(char* testCaseNum , const char *root) {
	bscEntFlxCntrTrdSprnRequestT vbscEntFlxCntrTrdSprnRequestT;
	int i;

	vbscEntFlxCntrTrdSprnRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntFlxCntrTrdSprnRequestT");
	vbscEntFlxCntrTrdSprnRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscEntFlxCntrTrdSprnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnRequestT.buyCod", lbuyCod);
	vbscEntFlxCntrTrdSprnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntFlxCntrTrdSprnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntFlxCntrTrdSprnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscEntFlxCntrTrdSprnRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscEntFlxCntrTrdSprnRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscEntFlxCntrTrdSprnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entFlxCntrTrdSprnRequestT getEntFlxCntrTrdSprnRequestT(char* testCaseNum , const char *root) {
	entFlxCntrTrdSprnRequestT ventFlxCntrTrdSprnRequestT;
	int i;

	ventFlxCntrTrdSprnRequestT.header = getDataHeaderT(testCaseNum, "entFlxCntrTrdSprnRequestT");
	ventFlxCntrTrdSprnRequestT.basic = getBscEntFlxCntrTrdSprnRequestT(testCaseNum, "entFlxCntrTrdSprnRequestT");	return ventFlxCntrTrdSprnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxCntrTrdSprnRecT getBscEntFlxCntrTrdSprnRecT(char* testCaseNum , const char *root) {
	bscEntFlxCntrTrdSprnRecT vbscEntFlxCntrTrdSprnRecT;
	int i;

	for(i=0;i<TRN_ID_SFX_NO_LEN;i++) {
		vbscEntFlxCntrTrdSprnRecT.trnIdSfxNo[i]= ' ';
	}
	char ltrnIdSfxNo[TRN_ID_SFX_NO_LEN] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnRecT.trnIdSfxNo", ltrnIdSfxNo);
	memcpy(vbscEntFlxCntrTrdSprnRecT.trnIdSfxNo, ltrnIdSfxNo, TRN_ID_SFX_NO_LEN);
	return vbscEntFlxCntrTrdSprnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxCntrTrdSprnResponseT getBscEntFlxCntrTrdSprnResponseT(char* testCaseNum , const char *root) {
	bscEntFlxCntrTrdSprnResponseT vbscEntFlxCntrTrdSprnResponseT;
	int i;

	for(i=0;i<FLX_CNTR_TRN_ID_NO_LEN;i++) {
		vbscEntFlxCntrTrdSprnResponseT.flxCntrTrnIdNo[i]= ' ';
	}
	char lflxCntrTrnIdNo[FLX_CNTR_TRN_ID_NO_LEN] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnResponseT.flxCntrTrnIdNo", lflxCntrTrnIdNo);
	memcpy(vbscEntFlxCntrTrdSprnResponseT.flxCntrTrnIdNo, lflxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnResponseT.buyCod", lbuyCod);
	vbscEntFlxCntrTrdSprnResponseT.buyCod = lbuyCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntFlxCntrTrdSprnResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscEntFlxCntrTrdSprnResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntFlxCntrTrdSprnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntFlxCntrTrdSprnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscEntFlxCntrTrdSprnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntFlxCntrTrdSprn.bscEntFlxCntrTrdSprnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscEntFlxCntrTrdSprnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscEntFlxCntrTrdSprnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entFlxCntrTrdSprnResponseT getEntFlxCntrTrdSprnResponseT(char* testCaseNum , const char *root) {
	entFlxCntrTrdSprnResponseT ventFlxCntrTrdSprnResponseT;
	int i;

	ventFlxCntrTrdSprnResponseT.header = getDataHeaderT(testCaseNum, "entFlxCntrTrdSprnResponseT");
	ventFlxCntrTrdSprnResponseT.basic = getBscEntFlxCntrTrdSprnResponseT(testCaseNum, "entFlxCntrTrdSprnResponseT");	return ventFlxCntrTrdSprnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxCntrTrdSprnGrpT(bscEntFlxCntrTrdSprnGrpT actual, bscEntFlxCntrTrdSprnGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnLngQty, expected.trnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnGrpT, trnLngQty not matching. Actual %s but Expected %s", actual.trnLngQty, expected.trnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnShtQty, expected.trnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnGrpT, trnShtQty not matching. Actual %s but Expected %s", actual.trnShtQty, expected.trnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxCntrTrdSprnRequestT(bscEntFlxCntrTrdSprnRequestT actual, bscEntFlxCntrTrdSprnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_FLX_CNTR_TRD_SPRN_GRP_MAX;i++) {
		compareBscEntFlxCntrTrdSprnGrpT (actual.bscEntFlxCntrTrdSprnGrp[i],expected.bscEntFlxCntrTrdSprnGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntFlxCntrTrdSprnRequestT(entFlxCntrTrdSprnRequestT actual, entFlxCntrTrdSprnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntFlxCntrTrdSprnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxCntrTrdSprnRecT(bscEntFlxCntrTrdSprnRecT actual, bscEntFlxCntrTrdSprnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdSfxNo, expected.trnIdSfxNo, TRN_ID_SFX_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnRecT, trnIdSfxNo not matching. Actual %s but Expected %s", actual.trnIdSfxNo, expected.trnIdSfxNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxCntrTrdSprnResponseT(bscEntFlxCntrTrdSprnResponseT actual, bscEntFlxCntrTrdSprnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnResponseT, flxCntrTrnIdNo not matching. Actual %s but Expected %s", actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnResponseT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxCntrTrdSprnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_FLX_CNTR_TRD_SPRN_REC_MAX;i++) {
		compareBscEntFlxCntrTrdSprnRecT (actual.bscEntFlxCntrTrdSprnRec[i],expected.bscEntFlxCntrTrdSprnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntFlxCntrTrdSprnResponseT(entFlxCntrTrdSprnResponseT actual, entFlxCntrTrdSprnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntFlxCntrTrdSprnResponseT (actual.basic,expected.basic, logMsg);
}

