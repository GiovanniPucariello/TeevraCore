#include <SubStratQuoConf.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubStratQuoConfPrivBcastT getBscSubStratQuoConfPrivBcastT(char* testCaseNum , const char *root) {
	bscSubStratQuoConfPrivBcastT vbscSubStratQuoConfPrivBcastT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.buyCod", lbuyCod);
	vbscSubStratQuoConfPrivBcastT.buyCod = lbuyCod[0];

	vbscSubStratQuoConfPrivBcastT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscSubStratQuoConfPrivBcastT");
	vbscSubStratQuoConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscSubStratQuoConfPrivBcastT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.ordrNoBuy", lordrNoBuy);
	memcpy(vbscSubStratQuoConfPrivBcastT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.ordrNoSel", lordrNoSel);
	memcpy(vbscSubStratQuoConfPrivBcastT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(vbscSubStratQuoConfPrivBcastT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.quoBkQtySel", lquoBkQtySel);
	memcpy(vbscSubStratQuoConfPrivBcastT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(vbscSubStratQuoConfPrivBcastT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.quoExeQtySel", lquoExeQtySel);
	memcpy(vbscSubStratQuoConfPrivBcastT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vbscSubStratQuoConfPrivBcastT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.quoExePrcSel", lquoExePrcSel);
	memcpy(vbscSubStratQuoConfPrivBcastT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.quoPrioTimBuy[i]= ' ';
	}
	char lquoPrioTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.quoPrioTimBuy", lquoPrioTimBuy);
	memcpy(vbscSubStratQuoConfPrivBcastT.quoPrioTimBuy, lquoPrioTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.quoPrioTimSel[i]= ' ';
	}
	char lquoPrioTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.quoPrioTimSel", lquoPrioTimSel);
	memcpy(vbscSubStratQuoConfPrivBcastT.quoPrioTimSel, lquoPrioTimSel, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.quoPrioDatBuy[i]= ' ';
	}
	char lquoPrioDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.quoPrioDatBuy", lquoPrioDatBuy);
	memcpy(vbscSubStratQuoConfPrivBcastT.quoPrioDatBuy, lquoPrioDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.quoPrioDatSel[i]= ' ';
	}
	char lquoPrioDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.quoPrioDatSel", lquoPrioDatSel);
	memcpy(vbscSubStratQuoConfPrivBcastT.quoPrioDatSel, lquoPrioDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.lstEvntDatBuy[i]= ' ';
	}
	char llstEvntDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.lstEvntDatBuy", llstEvntDatBuy);
	memcpy(vbscSubStratQuoConfPrivBcastT.lstEvntDatBuy, llstEvntDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.lstEvntTimBuy[i]= ' ';
	}
	char llstEvntTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.lstEvntTimBuy", llstEvntTimBuy);
	memcpy(vbscSubStratQuoConfPrivBcastT.lstEvntTimBuy, llstEvntTimBuy, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.lstEvntTrnIdBuy[i]= ' ';
	}
	char llstEvntTrnIdBuy[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.lstEvntTrnIdBuy", llstEvntTrnIdBuy);
	memcpy(vbscSubStratQuoConfPrivBcastT.lstEvntTrnIdBuy, llstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.lstEvntDatSel[i]= ' ';
	}
	char llstEvntDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.lstEvntDatSel", llstEvntDatSel);
	memcpy(vbscSubStratQuoConfPrivBcastT.lstEvntDatSel, llstEvntDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.lstEvntTimSel[i]= ' ';
	}
	char llstEvntTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.lstEvntTimSel", llstEvntTimSel);
	memcpy(vbscSubStratQuoConfPrivBcastT.lstEvntTimSel, llstEvntTimSel, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscSubStratQuoConfPrivBcastT.lstEvntTrnIdSel[i]= ' ';
	}
	char llstEvntTrnIdSel[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.lstEvntTrnIdSel", llstEvntTrnIdSel);
	memcpy(vbscSubStratQuoConfPrivBcastT.lstEvntTrnIdSel, llstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN);

	char ltrnTypId[1] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfPrivBcastT.trnTypId", ltrnTypId);
	vbscSubStratQuoConfPrivBcastT.trnTypId = ltrnTypId[0];
	return vbscSubStratQuoConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extSubStratQuoConfPrivBcastT getExtSubStratQuoConfPrivBcastT(char* testCaseNum , const char *root) {
	extSubStratQuoConfPrivBcastT vextSubStratQuoConfPrivBcastT;
	int i;

	vextSubStratQuoConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extSubStratQuoConfPrivBcastT");	return vextSubStratQuoConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subStratQuoConfPrivBcastT getSubStratQuoConfPrivBcastT(char* testCaseNum , const char *root) {
	subStratQuoConfPrivBcastT vsubStratQuoConfPrivBcastT;
	int i;

	vsubStratQuoConfPrivBcastT.header = getDataHeaderT(testCaseNum, "subStratQuoConfPrivBcastT");
	vsubStratQuoConfPrivBcastT.basic = getBscSubStratQuoConfPrivBcastT(testCaseNum, "subStratQuoConfPrivBcastT");
	vsubStratQuoConfPrivBcastT.extension = getExtSubStratQuoConfPrivBcastT(testCaseNum, "subStratQuoConfPrivBcastT");	return vsubStratQuoConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubStratQuoConfSubjectT getBscSubStratQuoConfSubjectT(char* testCaseNum , const char *root) {
	bscSubStratQuoConfSubjectT vbscSubStratQuoConfSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vbscSubStratQuoConfSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfSubjectT.membId", lmembId);
	memcpy(vbscSubStratQuoConfSubjectT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscSubStratQuoConfSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubStratQuoConf.bscSubStratQuoConfSubjectT.prodId", lprodId);
	memcpy(vbscSubStratQuoConfSubjectT.prodId, lprodId, PROD_ID_LEN);
	return vbscSubStratQuoConfSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubStratQuoConfPrivBcastT(bscSubStratQuoConfPrivBcastT actual, bscSubStratQuoConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimBuy, expected.quoPrioTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, quoPrioTimBuy not matching. Actual %s but Expected %s", actual.quoPrioTimBuy, expected.quoPrioTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimSel, expected.quoPrioTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, quoPrioTimSel not matching. Actual %s but Expected %s", actual.quoPrioTimSel, expected.quoPrioTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatBuy, expected.quoPrioDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, quoPrioDatBuy not matching. Actual %s but Expected %s", actual.quoPrioDatBuy, expected.quoPrioDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatSel, expected.quoPrioDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, quoPrioDatSel not matching. Actual %s but Expected %s", actual.quoPrioDatSel, expected.quoPrioDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatBuy, expected.lstEvntDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, lstEvntDatBuy not matching. Actual %s but Expected %s", actual.lstEvntDatBuy, expected.lstEvntDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimBuy, expected.lstEvntTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, lstEvntTimBuy not matching. Actual %s but Expected %s", actual.lstEvntTimBuy, expected.lstEvntTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, lstEvntTrnIdBuy not matching. Actual %s but Expected %s", actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatSel, expected.lstEvntDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, lstEvntDatSel not matching. Actual %s but Expected %s", actual.lstEvntDatSel, expected.lstEvntDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimSel, expected.lstEvntTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, lstEvntTimSel not matching. Actual %s but Expected %s", actual.lstEvntTimSel, expected.lstEvntTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, lstEvntTrnIdSel not matching. Actual %s but Expected %s", actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnTypId!= expected.trnTypId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfPrivBcastT, trnTypIdnot matching. Actual %d but Expected %d", actual.trnTypId, expected.trnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtSubStratQuoConfPrivBcastT(extSubStratQuoConfPrivBcastT actual, extSubStratQuoConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubStratQuoConfPrivBcastT(subStratQuoConfPrivBcastT actual, subStratQuoConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubStratQuoConfPrivBcastT (actual.basic,expected.basic, logMsg);
	compareExtSubStratQuoConfPrivBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubStratQuoConfSubjectT(bscSubStratQuoConfSubjectT actual, bscSubStratQuoConfSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratQuoConfSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

