#include <SubEbiTrdApp.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubEbiTrdAppPrivBcastT getBscSubEbiTrdAppPrivBcastT(char* testCaseNum , const char *root) {
	bscSubEbiTrdAppPrivBcastT vbscSubEbiTrdAppPrivBcastT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscSubEbiTrdAppPrivBcastT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppPrivBcastT.prodId", lprodId);
	memcpy(vbscSubEbiTrdAppPrivBcastT.prodId, lprodId, PROD_ID_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppPrivBcastT.buyCod", lbuyCod);
	vbscSubEbiTrdAppPrivBcastT.buyCod = lbuyCod[0];

	char ltrdTyp[1] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppPrivBcastT.trdTyp", ltrdTyp);
	vbscSubEbiTrdAppPrivBcastT.trdTyp = ltrdTyp[0];

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscSubEbiTrdAppPrivBcastT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppPrivBcastT.trnIdNo", ltrnIdNo);
	memcpy(vbscSubEbiTrdAppPrivBcastT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubEbiTrdAppPrivBcastT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppPrivBcastT.trdXQty", ltrdXQty);
	memcpy(vbscSubEbiTrdAppPrivBcastT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscSubEbiTrdAppPrivBcastT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppPrivBcastT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscSubEbiTrdAppPrivBcastT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscSubEbiTrdAppPrivBcastT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppPrivBcastT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscSubEbiTrdAppPrivBcastT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscSubEbiTrdAppPrivBcastT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppPrivBcastT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscSubEbiTrdAppPrivBcastT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscSubEbiTrdAppPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscSubEbiTrdAppPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscSubEbiTrdAppPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subEbiTrdAppPrivBcastT getSubEbiTrdAppPrivBcastT(char* testCaseNum , const char *root) {
	subEbiTrdAppPrivBcastT vsubEbiTrdAppPrivBcastT;
	int i;

	vsubEbiTrdAppPrivBcastT.header = getDataHeaderT(testCaseNum, "subEbiTrdAppPrivBcastT");
	vsubEbiTrdAppPrivBcastT.basic = getBscSubEbiTrdAppPrivBcastT(testCaseNum, "subEbiTrdAppPrivBcastT");	return vsubEbiTrdAppPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubEbiTrdAppSubjectT getBscSubEbiTrdAppSubjectT(char* testCaseNum , const char *root) {
	bscSubEbiTrdAppSubjectT vbscSubEbiTrdAppSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vbscSubEbiTrdAppSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppSubjectT.membId", lmembId);
	memcpy(vbscSubEbiTrdAppSubjectT.membId, lmembId, MEMB_ID_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppSubjectT.trdTyp", ltrdTyp);
	vbscSubEbiTrdAppSubjectT.trdTyp = ltrdTyp[0];

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscSubEbiTrdAppSubjectT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("SubEbiTrdApp.bscSubEbiTrdAppSubjectT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscSubEbiTrdAppSubjectT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);
	return vbscSubEbiTrdAppSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubEbiTrdAppPrivBcastT(bscSubEbiTrdAppPrivBcastT actual, bscSubEbiTrdAppPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppPrivBcastT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppPrivBcastT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppPrivBcastT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppPrivBcastT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppPrivBcastT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppPrivBcastT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppPrivBcastT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubEbiTrdAppPrivBcastT(subEbiTrdAppPrivBcastT actual, subEbiTrdAppPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubEbiTrdAppPrivBcastT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubEbiTrdAppSubjectT(bscSubEbiTrdAppSubjectT actual, bscSubEbiTrdAppSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppSubjectT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubEbiTrdAppSubjectT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

