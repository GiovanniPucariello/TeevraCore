#include <SubStratInsMkt.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubStratInsMktPubBcastT getBscSubStratInsMktPubBcastT(char* testCaseNum , const char *root) {
	bscSubStratInsMktPubBcastT vbscSubStratInsMktPubBcastT;
	int i;

	vbscSubStratInsMktPubBcastT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscSubStratInsMktPubBcastT");
	vbscSubStratInsMktPubBcastT.bstOrdrGrp = getBstOrdrGrpT(testCaseNum, "bscSubStratInsMktPubBcastT");	return vbscSubStratInsMktPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extSubStratInsMktPubBcastT getExtSubStratInsMktPubBcastT(char* testCaseNum , const char *root) {
	extSubStratInsMktPubBcastT vextSubStratInsMktPubBcastT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSubStratInsMktPubBcastT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.lstTrdPrc", llstTrdPrc);
	memcpy(vextSubStratInsMktPubBcastT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextSubStratInsMktPubBcastT.lstTrdQty[i]= ' ';
	}
	char llstTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.lstTrdQty", llstTrdQty);
	memcpy(vextSubStratInsMktPubBcastT.lstTrdQty, llstTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vextSubStratInsMktPubBcastT.trdTim[i]= ' ';
	}
	char ltrdTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.trdTim", ltrdTim);
	memcpy(vextSubStratInsMktPubBcastT.trdTim, ltrdTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vextSubStratInsMktPubBcastT.stratReqTim[i]= ' ';
	}
	char lstratReqTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.stratReqTim", lstratReqTim);
	memcpy(vextSubStratInsMktPubBcastT.stratReqTim, lstratReqTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextSubStratInsMktPubBcastT.stratReqBidQty[i]= ' ';
	}
	char lstratReqBidQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.stratReqBidQty", lstratReqBidQty);
	memcpy(vextSubStratInsMktPubBcastT.stratReqBidQty, lstratReqBidQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextSubStratInsMktPubBcastT.stratReqAskQty[i]= ' ';
	}
	char lstratReqAskQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.stratReqAskQty", lstratReqAskQty);
	memcpy(vextSubStratInsMktPubBcastT.stratReqAskQty, lstratReqAskQty, DRIV_QUANTITY_LEN);

	char ltrnTypId[1] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.trnTypId", ltrnTypId);
	vextSubStratInsMktPubBcastT.trnTypId = ltrnTypId[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vextSubStratInsMktPubBcastT.crBidQty[i]= ' ';
	}
	char lcrBidQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.crBidQty", lcrBidQty);
	memcpy(vextSubStratInsMktPubBcastT.crBidQty, lcrBidQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vextSubStratInsMktPubBcastT.crAskQty[i]= ' ';
	}
	char lcrAskQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.crAskQty", lcrAskQty);
	memcpy(vextSubStratInsMktPubBcastT.crAskQty, lcrAskQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vextSubStratInsMktPubBcastT.crTim[i]= ' ';
	}
	char lcrTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.crTim", lcrTim);
	memcpy(vextSubStratInsMktPubBcastT.crTim, lcrTim, DRIV_TIME_LEN);

	char lblkAuctStsCod[1] = {""};
	getStrProperty("SubStratInsMkt.extSubStratInsMktPubBcastT.blkAuctStsCod", lblkAuctStsCod);
	vextSubStratInsMktPubBcastT.blkAuctStsCod = lblkAuctStsCod[0];
	return vextSubStratInsMktPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subStratInsMktPubBcastT getSubStratInsMktPubBcastT(char* testCaseNum , const char *root) {
	subStratInsMktPubBcastT vsubStratInsMktPubBcastT;
	int i;

	vsubStratInsMktPubBcastT.header = getDataHeaderT(testCaseNum, "subStratInsMktPubBcastT");
	vsubStratInsMktPubBcastT.basic = getBscSubStratInsMktPubBcastT(testCaseNum, "subStratInsMktPubBcastT");
	vsubStratInsMktPubBcastT.extension = getExtSubStratInsMktPubBcastT(testCaseNum, "subStratInsMktPubBcastT");	return vsubStratInsMktPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubStratInsMktSubjectT getBscSubStratInsMktSubjectT(char* testCaseNum , const char *root) {
	bscSubStratInsMktSubjectT vbscSubStratInsMktSubjectT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscSubStratInsMktSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubStratInsMkt.bscSubStratInsMktSubjectT.prodId", lprodId);
	memcpy(vbscSubStratInsMktSubjectT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<STRAT_TYP_LEN;i++) {
		vbscSubStratInsMktSubjectT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("SubStratInsMkt.bscSubStratInsMktSubjectT.stratTyp", lstratTyp);
	memcpy(vbscSubStratInsMktSubjectT.stratTyp, lstratTyp, STRAT_TYP_LEN);
	return vbscSubStratInsMktSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubStratInsMktPubBcastT(bscSubStratInsMktPubBcastT actual, bscSubStratInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareBstOrdrGrpT (actual.bstOrdrGrp,expected.bstOrdrGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtSubStratInsMktPubBcastT(extSubStratInsMktPubBcastT actual, extSubStratInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdQty, expected.lstTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, lstTrdQty not matching. Actual %s but Expected %s", actual.lstTrdQty, expected.lstTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdTim, expected.trdTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, trdTim not matching. Actual %s but Expected %s", actual.trdTim, expected.trdTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratReqTim, expected.stratReqTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, stratReqTim not matching. Actual %s but Expected %s", actual.stratReqTim, expected.stratReqTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratReqBidQty, expected.stratReqBidQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, stratReqBidQty not matching. Actual %s but Expected %s", actual.stratReqBidQty, expected.stratReqBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratReqAskQty, expected.stratReqAskQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, stratReqAskQty not matching. Actual %s but Expected %s", actual.stratReqAskQty, expected.stratReqAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnTypId!= expected.trnTypId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, trnTypIdnot matching. Actual %d but Expected %d", actual.trnTypId, expected.trnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crBidQty, expected.crBidQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, crBidQty not matching. Actual %s but Expected %s", actual.crBidQty, expected.crBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crAskQty, expected.crAskQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, crAskQty not matching. Actual %s but Expected %s", actual.crAskQty, expected.crAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crTim, expected.crTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, crTim not matching. Actual %s but Expected %s", actual.crTim, expected.crTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.blkAuctStsCod!= expected.blkAuctStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratInsMktPubBcastT, blkAuctStsCodnot matching. Actual %d but Expected %d", actual.blkAuctStsCod, expected.blkAuctStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubStratInsMktPubBcastT(subStratInsMktPubBcastT actual, subStratInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubStratInsMktPubBcastT (actual.basic,expected.basic, logMsg);
	compareExtSubStratInsMktPubBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubStratInsMktSubjectT(bscSubStratInsMktSubjectT actual, bscSubStratInsMktSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratInsMktSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratInsMktSubjectT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

