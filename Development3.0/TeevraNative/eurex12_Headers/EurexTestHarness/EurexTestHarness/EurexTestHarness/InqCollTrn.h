#include <InqCollTrn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCollTrnRequestT getBscInqCollTrnRequestT(char* testCaseNum , const char *root) {
	bscInqCollTrnRequestT vbscInqCollTrnRequestT;
	int i;

	for(i=0;i<DRIV_COLL_TRN_STS_LEN;i++) {
		vbscInqCollTrnRequestT.collTrnSts[i]= ' ';
	}
	char lcollTrnSts[DRIV_COLL_TRN_STS_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRequestT.collTrnSts", lcollTrnSts);
	memcpy(vbscInqCollTrnRequestT.collTrnSts, lcollTrnSts, DRIV_COLL_TRN_STS_LEN);

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vbscInqCollTrnRequestT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRequestT.csdId", lcsdId);
	memcpy(vbscInqCollTrnRequestT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	char lasstPurpCod[1] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRequestT.asstPurpCod", lasstPurpCod);
	vbscInqCollTrnRequestT.asstPurpCod = lasstPurpCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqCollTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRequestT.trnDat", ltrnDat);
	memcpy(vbscInqCollTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	char ltrnTypId[1] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRequestT.trnTypId", ltrnTypId);
	vbscInqCollTrnRequestT.trnTypId = ltrnTypId[0];

	for(i=0;i<COLL_TRN_ID_NO_LEN;i++) {
		vbscInqCollTrnRequestT.collTrnIdNo[i]= ' ';
	}
	char lcollTrnIdNo[COLL_TRN_ID_NO_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRequestT.collTrnIdNo", lcollTrnIdNo);
	memcpy(vbscInqCollTrnRequestT.collTrnIdNo, lcollTrnIdNo, COLL_TRN_ID_NO_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqCollTrnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqCollTrnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqCollTrnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqCollTrnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqCollTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCollTrnRequestT getInqCollTrnRequestT(char* testCaseNum , const char *root) {
	inqCollTrnRequestT vinqCollTrnRequestT;
	int i;

	vinqCollTrnRequestT.header = getDataHeaderT(testCaseNum, "inqCollTrnRequestT");
	vinqCollTrnRequestT.basic = getBscInqCollTrnRequestT(testCaseNum, "inqCollTrnRequestT");	return vinqCollTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCollTrnRecT getBscInqCollTrnRecT(char* testCaseNum , const char *root) {
	bscInqCollTrnRecT vbscInqCollTrnRecT;
	int i;

	for(i=0;i<COLL_TRN_ID_NO_LEN;i++) {
		vbscInqCollTrnRecT.collTrnIdNo[i]= ' ';
	}
	char lcollTrnIdNo[COLL_TRN_ID_NO_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.collTrnIdNo", lcollTrnIdNo);
	memcpy(vbscInqCollTrnRecT.collTrnIdNo, lcollTrnIdNo, COLL_TRN_ID_NO_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqCollTrnRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.trnDat", ltrnDat);
	memcpy(vbscInqCollTrnRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqCollTrnRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.trnTim", ltrnTim);
	memcpy(vbscInqCollTrnRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_SECU_MVT_TRN_TYP_ID_LEN;i++) {
		vbscInqCollTrnRecT.secuMvtTrnTypId[i]= ' ';
	}
	char lsecuMvtTrnTypId[DRIV_SECU_MVT_TRN_TYP_ID_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.secuMvtTrnTypId", lsecuMvtTrnTypId);
	memcpy(vbscInqCollTrnRecT.secuMvtTrnTypId, lsecuMvtTrnTypId, DRIV_SECU_MVT_TRN_TYP_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqCollTrnRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqCollTrnRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<PART_SUB_GRP_COD_LEN;i++) {
		vbscInqCollTrnRecT.partSubGrpCod[i]= ' ';
	}
	char lpartSubGrpCod[PART_SUB_GRP_COD_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.partSubGrpCod", lpartSubGrpCod);
	memcpy(vbscInqCollTrnRecT.partSubGrpCod, lpartSubGrpCod, PART_SUB_GRP_COD_LEN);

	for(i=0;i<PART_NO_LEN;i++) {
		vbscInqCollTrnRecT.partNo[i]= ' ';
	}
	char lpartNo[PART_NO_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.partNo", lpartNo);
	memcpy(vbscInqCollTrnRecT.partNo, lpartNo, PART_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqCollTrnRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqCollTrnRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscInqCollTrnRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.isinCod", lisinCod);
	memcpy(vbscInqCollTrnRecT.isinCod, lisinCod, ISIN_COD_LEN);

	char ltrnByMsInd[1] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.trnByMsInd", ltrnByMsInd);
	vbscInqCollTrnRecT.trnByMsInd = ltrnByMsInd[0];

	for(i=0;i<COLL_TRN_AMNT_LEN;i++) {
		vbscInqCollTrnRecT.collTrnAmnt[i]= ' ';
	}
	char lcollTrnAmnt[COLL_TRN_AMNT_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.collTrnAmnt", lcollTrnAmnt);
	memcpy(vbscInqCollTrnRecT.collTrnAmnt, lcollTrnAmnt, COLL_TRN_AMNT_LEN);

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vbscInqCollTrnRecT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.csdId", lcsdId);
	memcpy(vbscInqCollTrnRecT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	for(i=0;i<CSD_ACCT_NO_LEN;i++) {
		vbscInqCollTrnRecT.csdPldgAcctNo[i]= ' ';
	}
	char lcsdPldgAcctNo[CSD_ACCT_NO_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.csdPldgAcctNo", lcsdPldgAcctNo);
	memcpy(vbscInqCollTrnRecT.csdPldgAcctNo, lcsdPldgAcctNo, CSD_ACCT_NO_LEN);

	for(i=0;i<DRIV_CSD_MAIN_ACCT_NO_LEN;i++) {
		vbscInqCollTrnRecT.csdMainAcctNo[i]= ' ';
	}
	char lcsdMainAcctNo[DRIV_CSD_MAIN_ACCT_NO_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.csdMainAcctNo", lcsdMainAcctNo);
	memcpy(vbscInqCollTrnRecT.csdMainAcctNo, lcsdMainAcctNo, DRIV_CSD_MAIN_ACCT_NO_LEN);

	for(i=0;i<DRIV_COLL_TRN_STS_LEN;i++) {
		vbscInqCollTrnRecT.collTrnSts[i]= ' ';
	}
	char lcollTrnSts[DRIV_COLL_TRN_STS_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.collTrnSts", lcollTrnSts);
	memcpy(vbscInqCollTrnRecT.collTrnSts, lcollTrnSts, DRIV_COLL_TRN_STS_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqCollTrnRecT.trnValDat[i]= ' ';
	}
	char ltrnValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.trnValDat", ltrnValDat);
	memcpy(vbscInqCollTrnRecT.trnValDat, ltrnValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqCollTrnRecT.origTrnDat[i]= ' ';
	}
	char lorigTrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.origTrnDat", lorigTrnDat);
	memcpy(vbscInqCollTrnRecT.origTrnDat, lorigTrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqCollTrnRecT.origTrnTim[i]= ' ';
	}
	char lorigTrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.origTrnTim", lorigTrnTim);
	memcpy(vbscInqCollTrnRecT.origTrnTim, lorigTrnTim, DRIV_TIME_LEN);

	for(i=0;i<COLL_USR_TRN_ID_LEN;i++) {
		vbscInqCollTrnRecT.collUsrTrnId[i]= ' ';
	}
	char lcollUsrTrnId[COLL_USR_TRN_ID_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.collUsrTrnId", lcollUsrTrnId);
	memcpy(vbscInqCollTrnRecT.collUsrTrnId, lcollUsrTrnId, COLL_USR_TRN_ID_LEN);

	for(i=0;i<COLL_ERR_TXT_LEN;i++) {
		vbscInqCollTrnRecT.collTxt[i]= ' ';
	}
	char lcollTxt[COLL_ERR_TXT_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.collTxt", lcollTxt);
	memcpy(vbscInqCollTrnRecT.collTxt, lcollTxt, COLL_ERR_TXT_LEN);

	for(i=0;i<COLL_RSN_COD_LEN;i++) {
		vbscInqCollTrnRecT.collRsnCod[i]= ' ';
	}
	char lcollRsnCod[COLL_RSN_COD_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.collRsnCod", lcollRsnCod);
	memcpy(vbscInqCollTrnRecT.collRsnCod, lcollRsnCod, COLL_RSN_COD_LEN);

	char lasstPurpCod[1] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.asstPurpCod", lasstPurpCod);
	vbscInqCollTrnRecT.asstPurpCod = lasstPurpCod[0];

	for(i=0;i<ORIG_OF_TRN_LEN;i++) {
		vbscInqCollTrnRecT.origOfTrn[i]= ' ';
	}
	char lorigOfTrn[ORIG_OF_TRN_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.origOfTrn", lorigOfTrn);
	memcpy(vbscInqCollTrnRecT.origOfTrn, lorigOfTrn, ORIG_OF_TRN_LEN);

	for(i=0;i<ERR_COD_LEN;i++) {
		vbscInqCollTrnRecT.errCod[i]= ' ';
	}
	char lerrCod[ERR_COD_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.errCod", lerrCod);
	memcpy(vbscInqCollTrnRecT.errCod, lerrCod, ERR_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqCollTrnRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqCollTrnRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqCollTrnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCollTrnResponseT getBscInqCollTrnResponseT(char* testCaseNum , const char *root) {
	bscInqCollTrnResponseT vbscInqCollTrnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqCollTrnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqCollTrnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqCollTrnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCollTrn.bscInqCollTrnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqCollTrnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqCollTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCollTrnResponseT getInqCollTrnResponseT(char* testCaseNum , const char *root) {
	inqCollTrnResponseT vinqCollTrnResponseT;
	int i;

	vinqCollTrnResponseT.header = getDataHeaderT(testCaseNum, "inqCollTrnResponseT");
	vinqCollTrnResponseT.basic = getBscInqCollTrnResponseT(testCaseNum, "inqCollTrnResponseT");	return vinqCollTrnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCollTrnRequestT(bscInqCollTrnRequestT actual, bscInqCollTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.collTrnSts, expected.collTrnSts, DRIV_COLL_TRN_STS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRequestT, collTrnSts not matching. Actual %s but Expected %s", actual.collTrnSts, expected.collTrnSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRequestT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asstPurpCod!= expected.asstPurpCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRequestT, asstPurpCodnot matching. Actual %d but Expected %d", actual.asstPurpCod, expected.asstPurpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnTypId!= expected.trnTypId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRequestT, trnTypIdnot matching. Actual %d but Expected %d", actual.trnTypId, expected.trnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collTrnIdNo, expected.collTrnIdNo, COLL_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRequestT, collTrnIdNo not matching. Actual %s but Expected %s", actual.collTrnIdNo, expected.collTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCollTrnRequestT(inqCollTrnRequestT actual, inqCollTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCollTrnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCollTrnRecT(bscInqCollTrnRecT actual, bscInqCollTrnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.collTrnIdNo, expected.collTrnIdNo, COLL_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, collTrnIdNo not matching. Actual %s but Expected %s", actual.collTrnIdNo, expected.collTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuMvtTrnTypId, expected.secuMvtTrnTypId, DRIV_SECU_MVT_TRN_TYP_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, secuMvtTrnTypId not matching. Actual %s but Expected %s", actual.secuMvtTrnTypId, expected.secuMvtTrnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partSubGrpCod, expected.partSubGrpCod, PART_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, partSubGrpCod not matching. Actual %s but Expected %s", actual.partSubGrpCod, expected.partSubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partNo, expected.partNo, PART_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, partNo not matching. Actual %s but Expected %s", actual.partNo, expected.partNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnByMsInd!= expected.trnByMsInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, trnByMsIndnot matching. Actual %d but Expected %d", actual.trnByMsInd, expected.trnByMsInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collTrnAmnt, expected.collTrnAmnt, COLL_TRN_AMNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, collTrnAmnt not matching. Actual %s but Expected %s", actual.collTrnAmnt, expected.collTrnAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdPldgAcctNo, expected.csdPldgAcctNo, CSD_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, csdPldgAcctNo not matching. Actual %s but Expected %s", actual.csdPldgAcctNo, expected.csdPldgAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdMainAcctNo, expected.csdMainAcctNo, DRIV_CSD_MAIN_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, csdMainAcctNo not matching. Actual %s but Expected %s", actual.csdMainAcctNo, expected.csdMainAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collTrnSts, expected.collTrnSts, DRIV_COLL_TRN_STS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, collTrnSts not matching. Actual %s but Expected %s", actual.collTrnSts, expected.collTrnSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnValDat, expected.trnValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, trnValDat not matching. Actual %s but Expected %s", actual.trnValDat, expected.trnValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnDat, expected.origTrnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, origTrnDat not matching. Actual %s but Expected %s", actual.origTrnDat, expected.origTrnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnTim, expected.origTrnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, origTrnTim not matching. Actual %s but Expected %s", actual.origTrnTim, expected.origTrnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collUsrTrnId, expected.collUsrTrnId, COLL_USR_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, collUsrTrnId not matching. Actual %s but Expected %s", actual.collUsrTrnId, expected.collUsrTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collTxt, expected.collTxt, COLL_ERR_TXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, collTxt not matching. Actual %s but Expected %s", actual.collTxt, expected.collTxt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collRsnCod, expected.collRsnCod, COLL_RSN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, collRsnCod not matching. Actual %s but Expected %s", actual.collRsnCod, expected.collRsnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asstPurpCod!= expected.asstPurpCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, asstPurpCodnot matching. Actual %d but Expected %d", actual.asstPurpCod, expected.asstPurpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origOfTrn, expected.origOfTrn, ORIG_OF_TRN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, origOfTrn not matching. Actual %s but Expected %s", actual.origOfTrn, expected.origOfTrn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.errCod, expected.errCod, ERR_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, errCod not matching. Actual %s but Expected %s", actual.errCod, expected.errCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCollTrnResponseT(bscInqCollTrnResponseT actual, bscInqCollTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollTrnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_COLL_TRN_REC_MAX;i++) {
		compareBscInqCollTrnRecT (actual.bscInqCollTrnRec[i],expected.bscInqCollTrnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCollTrnResponseT(inqCollTrnResponseT actual, inqCollTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCollTrnResponseT (actual.basic,expected.basic, logMsg);
}

