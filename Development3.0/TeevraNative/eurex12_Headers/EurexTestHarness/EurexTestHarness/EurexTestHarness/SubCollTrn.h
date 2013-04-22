#include <SubCollTrn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubCollTrnBcastT getBscSubCollTrnBcastT(char* testCaseNum , const char *root) {
	bscSubCollTrnBcastT vbscSubCollTrnBcastT;
	int i;

	for(i=0;i<COLL_TRN_ID_NO_LEN;i++) {
		vbscSubCollTrnBcastT.collTrnIdNo[i]= ' ';
	}
	char lcollTrnIdNo[COLL_TRN_ID_NO_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.collTrnIdNo", lcollTrnIdNo);
	memcpy(vbscSubCollTrnBcastT.collTrnIdNo, lcollTrnIdNo, COLL_TRN_ID_NO_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubCollTrnBcastT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.trnDat", ltrnDat);
	memcpy(vbscSubCollTrnBcastT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubCollTrnBcastT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.trnTim", ltrnTim);
	memcpy(vbscSubCollTrnBcastT.trnTim, ltrnTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_SECU_MVT_TRN_TYP_ID_LEN;i++) {
		vbscSubCollTrnBcastT.secuMvtTrnTypId[i]= ' ';
	}
	char lsecuMvtTrnTypId[DRIV_SECU_MVT_TRN_TYP_ID_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.secuMvtTrnTypId", lsecuMvtTrnTypId);
	memcpy(vbscSubCollTrnBcastT.secuMvtTrnTypId, lsecuMvtTrnTypId, DRIV_SECU_MVT_TRN_TYP_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscSubCollTrnBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscSubCollTrnBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<PART_SUB_GRP_COD_LEN;i++) {
		vbscSubCollTrnBcastT.partSubGrpCod[i]= ' ';
	}
	char lpartSubGrpCod[PART_SUB_GRP_COD_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.partSubGrpCod", lpartSubGrpCod);
	memcpy(vbscSubCollTrnBcastT.partSubGrpCod, lpartSubGrpCod, PART_SUB_GRP_COD_LEN);

	for(i=0;i<PART_NO_LEN;i++) {
		vbscSubCollTrnBcastT.partNo[i]= ' ';
	}
	char lpartNo[PART_NO_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.partNo", lpartNo);
	memcpy(vbscSubCollTrnBcastT.partNo, lpartNo, PART_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscSubCollTrnBcastT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.currTypCod", lcurrTypCod);
	memcpy(vbscSubCollTrnBcastT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscSubCollTrnBcastT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.isinCod", lisinCod);
	memcpy(vbscSubCollTrnBcastT.isinCod, lisinCod, ISIN_COD_LEN);

	char ltrnByMsInd[1] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.trnByMsInd", ltrnByMsInd);
	vbscSubCollTrnBcastT.trnByMsInd = ltrnByMsInd[0];

	for(i=0;i<COLL_TRN_AMNT_LEN;i++) {
		vbscSubCollTrnBcastT.collTrnAmnt[i]= ' ';
	}
	char lcollTrnAmnt[COLL_TRN_AMNT_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.collTrnAmnt", lcollTrnAmnt);
	memcpy(vbscSubCollTrnBcastT.collTrnAmnt, lcollTrnAmnt, COLL_TRN_AMNT_LEN);

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vbscSubCollTrnBcastT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.csdId", lcsdId);
	memcpy(vbscSubCollTrnBcastT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	for(i=0;i<CSD_ACCT_NO_LEN;i++) {
		vbscSubCollTrnBcastT.csdPldgAcctNo[i]= ' ';
	}
	char lcsdPldgAcctNo[CSD_ACCT_NO_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.csdPldgAcctNo", lcsdPldgAcctNo);
	memcpy(vbscSubCollTrnBcastT.csdPldgAcctNo, lcsdPldgAcctNo, CSD_ACCT_NO_LEN);

	for(i=0;i<DRIV_CSD_MAIN_ACCT_NO_LEN;i++) {
		vbscSubCollTrnBcastT.csdMainAcctNo[i]= ' ';
	}
	char lcsdMainAcctNo[DRIV_CSD_MAIN_ACCT_NO_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.csdMainAcctNo", lcsdMainAcctNo);
	memcpy(vbscSubCollTrnBcastT.csdMainAcctNo, lcsdMainAcctNo, DRIV_CSD_MAIN_ACCT_NO_LEN);

	for(i=0;i<DRIV_COLL_TRN_STS_LEN;i++) {
		vbscSubCollTrnBcastT.collTrnSts[i]= ' ';
	}
	char lcollTrnSts[DRIV_COLL_TRN_STS_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.collTrnSts", lcollTrnSts);
	memcpy(vbscSubCollTrnBcastT.collTrnSts, lcollTrnSts, DRIV_COLL_TRN_STS_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubCollTrnBcastT.trnValDat[i]= ' ';
	}
	char ltrnValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.trnValDat", ltrnValDat);
	memcpy(vbscSubCollTrnBcastT.trnValDat, ltrnValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubCollTrnBcastT.origTrnDat[i]= ' ';
	}
	char lorigTrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.origTrnDat", lorigTrnDat);
	memcpy(vbscSubCollTrnBcastT.origTrnDat, lorigTrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubCollTrnBcastT.origTrnTim[i]= ' ';
	}
	char lorigTrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.origTrnTim", lorigTrnTim);
	memcpy(vbscSubCollTrnBcastT.origTrnTim, lorigTrnTim, DRIV_TIME_LEN);

	for(i=0;i<COLL_USR_TRN_ID_LEN;i++) {
		vbscSubCollTrnBcastT.collUsrTrnId[i]= ' ';
	}
	char lcollUsrTrnId[COLL_USR_TRN_ID_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.collUsrTrnId", lcollUsrTrnId);
	memcpy(vbscSubCollTrnBcastT.collUsrTrnId, lcollUsrTrnId, COLL_USR_TRN_ID_LEN);

	for(i=0;i<COLL_ERR_TXT_LEN;i++) {
		vbscSubCollTrnBcastT.collTxt[i]= ' ';
	}
	char lcollTxt[COLL_ERR_TXT_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.collTxt", lcollTxt);
	memcpy(vbscSubCollTrnBcastT.collTxt, lcollTxt, COLL_ERR_TXT_LEN);

	for(i=0;i<COLL_RSN_COD_LEN;i++) {
		vbscSubCollTrnBcastT.collRsnCod[i]= ' ';
	}
	char lcollRsnCod[COLL_RSN_COD_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.collRsnCod", lcollRsnCod);
	memcpy(vbscSubCollTrnBcastT.collRsnCod, lcollRsnCod, COLL_RSN_COD_LEN);

	char lasstPurpCod[1] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.asstPurpCod", lasstPurpCod);
	vbscSubCollTrnBcastT.asstPurpCod = lasstPurpCod[0];

	for(i=0;i<ORIG_OF_TRN_LEN;i++) {
		vbscSubCollTrnBcastT.origOfTrn[i]= ' ';
	}
	char lorigOfTrn[ORIG_OF_TRN_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.origOfTrn", lorigOfTrn);
	memcpy(vbscSubCollTrnBcastT.origOfTrn, lorigOfTrn, ORIG_OF_TRN_LEN);

	for(i=0;i<ERR_COD_LEN;i++) {
		vbscSubCollTrnBcastT.errCod[i]= ' ';
	}
	char lerrCod[ERR_COD_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.errCod", lerrCod);
	memcpy(vbscSubCollTrnBcastT.errCod, lerrCod, ERR_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscSubCollTrnBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubCollTrn.bscSubCollTrnBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscSubCollTrnBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscSubCollTrnBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subCollTrnBcastT getSubCollTrnBcastT(char* testCaseNum , const char *root) {
	subCollTrnBcastT vsubCollTrnBcastT;
	int i;

	vsubCollTrnBcastT.header = getDataHeaderT(testCaseNum, "subCollTrnBcastT");
	vsubCollTrnBcastT.basic = getBscSubCollTrnBcastT(testCaseNum, "subCollTrnBcastT");	return vsubCollTrnBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subCollTrnSubjectT getSubCollTrnSubjectT(char* testCaseNum , const char *root) {
	subCollTrnSubjectT vsubCollTrnSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vsubCollTrnSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubCollTrn.subCollTrnSubjectT.membId", lmembId);
	memcpy(vsubCollTrnSubjectT.membId, lmembId, MEMB_ID_LEN);
	return vsubCollTrnSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubCollTrnBcastT(bscSubCollTrnBcastT actual, bscSubCollTrnBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.collTrnIdNo, expected.collTrnIdNo, COLL_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, collTrnIdNo not matching. Actual %s but Expected %s", actual.collTrnIdNo, expected.collTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuMvtTrnTypId, expected.secuMvtTrnTypId, DRIV_SECU_MVT_TRN_TYP_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, secuMvtTrnTypId not matching. Actual %s but Expected %s", actual.secuMvtTrnTypId, expected.secuMvtTrnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partSubGrpCod, expected.partSubGrpCod, PART_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, partSubGrpCod not matching. Actual %s but Expected %s", actual.partSubGrpCod, expected.partSubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partNo, expected.partNo, PART_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, partNo not matching. Actual %s but Expected %s", actual.partNo, expected.partNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnByMsInd!= expected.trnByMsInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, trnByMsIndnot matching. Actual %d but Expected %d", actual.trnByMsInd, expected.trnByMsInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collTrnAmnt, expected.collTrnAmnt, COLL_TRN_AMNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, collTrnAmnt not matching. Actual %s but Expected %s", actual.collTrnAmnt, expected.collTrnAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdPldgAcctNo, expected.csdPldgAcctNo, CSD_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, csdPldgAcctNo not matching. Actual %s but Expected %s", actual.csdPldgAcctNo, expected.csdPldgAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdMainAcctNo, expected.csdMainAcctNo, DRIV_CSD_MAIN_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, csdMainAcctNo not matching. Actual %s but Expected %s", actual.csdMainAcctNo, expected.csdMainAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collTrnSts, expected.collTrnSts, DRIV_COLL_TRN_STS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, collTrnSts not matching. Actual %s but Expected %s", actual.collTrnSts, expected.collTrnSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnValDat, expected.trnValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, trnValDat not matching. Actual %s but Expected %s", actual.trnValDat, expected.trnValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnDat, expected.origTrnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, origTrnDat not matching. Actual %s but Expected %s", actual.origTrnDat, expected.origTrnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnTim, expected.origTrnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, origTrnTim not matching. Actual %s but Expected %s", actual.origTrnTim, expected.origTrnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collUsrTrnId, expected.collUsrTrnId, COLL_USR_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, collUsrTrnId not matching. Actual %s but Expected %s", actual.collUsrTrnId, expected.collUsrTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collTxt, expected.collTxt, COLL_ERR_TXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, collTxt not matching. Actual %s but Expected %s", actual.collTxt, expected.collTxt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collRsnCod, expected.collRsnCod, COLL_RSN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, collRsnCod not matching. Actual %s but Expected %s", actual.collRsnCod, expected.collRsnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asstPurpCod!= expected.asstPurpCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, asstPurpCodnot matching. Actual %d but Expected %d", actual.asstPurpCod, expected.asstPurpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origOfTrn, expected.origOfTrn, ORIG_OF_TRN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, origOfTrn not matching. Actual %s but Expected %s", actual.origOfTrn, expected.origOfTrn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.errCod, expected.errCod, ERR_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, errCod not matching. Actual %s but Expected %s", actual.errCod, expected.errCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubCollTrnBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubCollTrnBcastT(subCollTrnBcastT actual, subCollTrnBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubCollTrnBcastT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubCollTrnSubjectT(subCollTrnSubjectT actual, subCollTrnSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In subCollTrnSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

