#include <SubStratBlkAuctConf.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubStratBlkAuctConfPrivBcastT getBscSubStratBlkAuctConfPrivBcastT(char* testCaseNum , const char *root) {
	bscSubStratBlkAuctConfPrivBcastT vbscSubStratBlkAuctConfPrivBcastT;
	int i;

	vbscSubStratBlkAuctConfPrivBcastT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscSubStratBlkAuctConfPrivBcastT");
	vbscSubStratBlkAuctConfPrivBcastT.blkAuctPotPrcGrp = getBlkAuctPotPrcGrpT(testCaseNum, "bscSubStratBlkAuctConfPrivBcastT");	return vbscSubStratBlkAuctConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extSubStratBlkAuctConfPrivBcastT getExtSubStratBlkAuctConfPrivBcastT(char* testCaseNum , const char *root) {
	extSubStratBlkAuctConfPrivBcastT vextSubStratBlkAuctConfPrivBcastT;
	int i;

	vextSubStratBlkAuctConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "extSubStratBlkAuctConfPrivBcastT");
	char lbuyCod[1] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.buyCod", lbuyCod);
	vextSubStratBlkAuctConfPrivBcastT.buyCod = lbuyCod[0];

	char lordrTypCod[1] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.ordrTypCod", lordrTypCod);
	vextSubStratBlkAuctConfPrivBcastT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.ordrNoBuy", lordrNoBuy);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.ordrNoSel", lordrNoSel);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.quoPrcBuy[i]= ' ';
	}
	char lquoPrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.quoPrcBuy", lquoPrcBuy);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.quoPrcBuy, lquoPrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.quoPrcSel[i]= ' ';
	}
	char lquoPrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.quoPrcSel", lquoPrcSel);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.quoPrcSel, lquoPrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.blkAuctQuoQtyBuy[i]= ' ';
	}
	char lblkAuctQuoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.blkAuctQuoQtyBuy", lblkAuctQuoQtyBuy);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.blkAuctQuoQtyBuy, lblkAuctQuoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.blkAuctQuoQtySel[i]= ' ';
	}
	char lblkAuctQuoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.blkAuctQuoQtySel", lblkAuctQuoQtySel);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.blkAuctQuoQtySel, lblkAuctQuoQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.blkAuctQuoExeQtyBuy[i]= ' ';
	}
	char lblkAuctQuoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.blkAuctQuoExeQtyBuy", lblkAuctQuoExeQtyBuy);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.blkAuctQuoExeQtyBuy, lblkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.blkAuctQuoExeQtySel[i]= ' ';
	}
	char lblkAuctQuoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.blkAuctQuoExeQtySel", lblkAuctQuoExeQtySel);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.blkAuctQuoExeQtySel, lblkAuctQuoExeQtySel, DRIV_VOLUME_LEN);

	char ltrnTypId[1] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.trnTypId", ltrnTypId);
	vextSubStratBlkAuctConfPrivBcastT.trnTypId = ltrnTypId[0];

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.quoTrnTimBuy[i]= ' ';
	}
	char lquoTrnTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.quoTrnTimBuy", lquoTrnTimBuy);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.quoTrnTimBuy, lquoTrnTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.quoTrnTimSel[i]= ' ';
	}
	char lquoTrnTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.quoTrnTimSel", lquoTrnTimSel);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.quoTrnTimSel, lquoTrnTimSel, DRIV_TIME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.opnClsCod", lopnClsCod);
	vextSubStratBlkAuctConfPrivBcastT.opnClsCod = lopnClsCod[0];

	vextSubStratBlkAuctConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extSubStratBlkAuctConfPrivBcastT");
	vextSubStratBlkAuctConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "extSubStratBlkAuctConfPrivBcastT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vextSubStratBlkAuctConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.extSubStratBlkAuctConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vextSubStratBlkAuctConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vextSubStratBlkAuctConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subStratBlkAuctConfPrivBcastT getSubStratBlkAuctConfPrivBcastT(char* testCaseNum , const char *root) {
	subStratBlkAuctConfPrivBcastT vsubStratBlkAuctConfPrivBcastT;
	int i;

	vsubStratBlkAuctConfPrivBcastT.header = getDataHeaderT(testCaseNum, "subStratBlkAuctConfPrivBcastT");
	vsubStratBlkAuctConfPrivBcastT.basic = getBscSubStratBlkAuctConfPrivBcastT(testCaseNum, "subStratBlkAuctConfPrivBcastT");
	vsubStratBlkAuctConfPrivBcastT.extension = getExtSubStratBlkAuctConfPrivBcastT(testCaseNum, "subStratBlkAuctConfPrivBcastT");	return vsubStratBlkAuctConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subStratBlkAuctConfSubjectT getSubStratBlkAuctConfSubjectT(char* testCaseNum , const char *root) {
	subStratBlkAuctConfSubjectT vsubStratBlkAuctConfSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vsubStratBlkAuctConfSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.subStratBlkAuctConfSubjectT.membId", lmembId);
	memcpy(vsubStratBlkAuctConfSubjectT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vsubStratBlkAuctConfSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubStratBlkAuctConf.subStratBlkAuctConfSubjectT.prodId", lprodId);
	memcpy(vsubStratBlkAuctConfSubjectT.prodId, lprodId, PROD_ID_LEN);
	return vsubStratBlkAuctConfSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubStratBlkAuctConfPrivBcastT(bscSubStratBlkAuctConfPrivBcastT actual, bscSubStratBlkAuctConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareBlkAuctPotPrcGrpT (actual.blkAuctPotPrcGrp,expected.blkAuctPotPrcGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtSubStratBlkAuctConfPrivBcastT(extSubStratBlkAuctConfPrivBcastT actual, extSubStratBlkAuctConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcBuy, expected.quoPrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, quoPrcBuy not matching. Actual %s but Expected %s", actual.quoPrcBuy, expected.quoPrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcSel, expected.quoPrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, quoPrcSel not matching. Actual %s but Expected %s", actual.quoPrcSel, expected.quoPrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, blkAuctQuoQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, blkAuctQuoQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, blkAuctQuoExeQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, blkAuctQuoExeQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnTypId!= expected.trnTypId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, trnTypIdnot matching. Actual %d but Expected %d", actual.trnTypId, expected.trnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimBuy, expected.quoTrnTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, quoTrnTimBuy not matching. Actual %s but Expected %s", actual.quoTrnTimBuy, expected.quoTrnTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimSel, expected.quoTrnTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, quoTrnTimSel not matching. Actual %s but Expected %s", actual.quoTrnTimSel, expected.quoTrnTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratBlkAuctConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubStratBlkAuctConfPrivBcastT(subStratBlkAuctConfPrivBcastT actual, subStratBlkAuctConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubStratBlkAuctConfPrivBcastT (actual.basic,expected.basic, logMsg);
	compareExtSubStratBlkAuctConfPrivBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubStratBlkAuctConfSubjectT(subStratBlkAuctConfSubjectT actual, subStratBlkAuctConfSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In subStratBlkAuctConfSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In subStratBlkAuctConfSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

