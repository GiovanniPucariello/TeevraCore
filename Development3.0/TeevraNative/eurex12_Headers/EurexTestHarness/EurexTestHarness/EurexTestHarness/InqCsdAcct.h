#include <InqCsdAcct.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCsdAcctRequestT getBscInqCsdAcctRequestT(char* testCaseNum , const char *root) {
	bscInqCsdAcctRequestT vbscInqCsdAcctRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqCsdAcctRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqCsdAcct.bscInqCsdAcctRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqCsdAcctRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqCsdAcctRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCsdAcct.bscInqCsdAcctRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqCsdAcctRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqCsdAcctRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCsdAcctRequestT getInqCsdAcctRequestT(char* testCaseNum , const char *root) {
	inqCsdAcctRequestT vinqCsdAcctRequestT;
	int i;

	vinqCsdAcctRequestT.header = getDataHeaderT(testCaseNum, "inqCsdAcctRequestT");
	vinqCsdAcctRequestT.basic = getBscInqCsdAcctRequestT(testCaseNum, "inqCsdAcctRequestT");	return vinqCsdAcctRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCsdAcctRecT getBscInqCsdAcctRecT(char* testCaseNum , const char *root) {
	bscInqCsdAcctRecT vbscInqCsdAcctRecT;
	int i;

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vbscInqCsdAcctRecT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("InqCsdAcct.bscInqCsdAcctRecT.csdId", lcsdId);
	memcpy(vbscInqCsdAcctRecT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	char lasstPurpCod[1] = {""};
	getStrProperty("InqCsdAcct.bscInqCsdAcctRecT.asstPurpCod", lasstPurpCod);
	vbscInqCsdAcctRecT.asstPurpCod = lasstPurpCod[0];

	for(i=0;i<CSD_ACCT_NO_LEN;i++) {
		vbscInqCsdAcctRecT.csdPldgAcctNo[i]= ' ';
	}
	char lcsdPldgAcctNo[CSD_ACCT_NO_LEN] = {""};
	getStrProperty("InqCsdAcct.bscInqCsdAcctRecT.csdPldgAcctNo", lcsdPldgAcctNo);
	memcpy(vbscInqCsdAcctRecT.csdPldgAcctNo, lcsdPldgAcctNo, CSD_ACCT_NO_LEN);

	for(i=0;i<CSD_ACCT_NO_LEN;i++) {
		vbscInqCsdAcctRecT.csdCtrAcctNo[i]= ' ';
	}
	char lcsdCtrAcctNo[CSD_ACCT_NO_LEN] = {""};
	getStrProperty("InqCsdAcct.bscInqCsdAcctRecT.csdCtrAcctNo", lcsdCtrAcctNo);
	memcpy(vbscInqCsdAcctRecT.csdCtrAcctNo, lcsdCtrAcctNo, CSD_ACCT_NO_LEN);

	for(i=0;i<DRIV_CSD_CUST_ID_LEN;i++) {
		vbscInqCsdAcctRecT.csdCustId[i]= ' ';
	}
	char lcsdCustId[DRIV_CSD_CUST_ID_LEN] = {""};
	getStrProperty("InqCsdAcct.bscInqCsdAcctRecT.csdCustId", lcsdCustId);
	memcpy(vbscInqCsdAcctRecT.csdCustId, lcsdCustId, DRIV_CSD_CUST_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqCsdAcctRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqCsdAcct.bscInqCsdAcctRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqCsdAcctRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqCsdAcctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCsdAcctResponseT getBscInqCsdAcctResponseT(char* testCaseNum , const char *root) {
	bscInqCsdAcctResponseT vbscInqCsdAcctResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqCsdAcctResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCsdAcct.bscInqCsdAcctResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqCsdAcctResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqCsdAcctResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCsdAcct.bscInqCsdAcctResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqCsdAcctResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqCsdAcctResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCsdAcctResponseT getInqCsdAcctResponseT(char* testCaseNum , const char *root) {
	inqCsdAcctResponseT vinqCsdAcctResponseT;
	int i;

	vinqCsdAcctResponseT.header = getDataHeaderT(testCaseNum, "inqCsdAcctResponseT");
	vinqCsdAcctResponseT.basic = getBscInqCsdAcctResponseT(testCaseNum, "inqCsdAcctResponseT");	return vinqCsdAcctResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCsdAcctRequestT(bscInqCsdAcctRequestT actual, bscInqCsdAcctRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdAcctRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdAcctRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCsdAcctRequestT(inqCsdAcctRequestT actual, inqCsdAcctRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCsdAcctRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCsdAcctRecT(bscInqCsdAcctRecT actual, bscInqCsdAcctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdAcctRecT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asstPurpCod!= expected.asstPurpCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdAcctRecT, asstPurpCodnot matching. Actual %d but Expected %d", actual.asstPurpCod, expected.asstPurpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdPldgAcctNo, expected.csdPldgAcctNo, CSD_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdAcctRecT, csdPldgAcctNo not matching. Actual %s but Expected %s", actual.csdPldgAcctNo, expected.csdPldgAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdCtrAcctNo, expected.csdCtrAcctNo, CSD_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdAcctRecT, csdCtrAcctNo not matching. Actual %s but Expected %s", actual.csdCtrAcctNo, expected.csdCtrAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdCustId, expected.csdCustId, DRIV_CSD_CUST_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdAcctRecT, csdCustId not matching. Actual %s but Expected %s", actual.csdCustId, expected.csdCustId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdAcctRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCsdAcctResponseT(bscInqCsdAcctResponseT actual, bscInqCsdAcctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdAcctResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdAcctResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_CSD_ACCT_REC_MAX;i++) {
		compareBscInqCsdAcctRecT (actual.bscInqCsdAcctRec[i],expected.bscInqCsdAcctRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCsdAcctResponseT(inqCsdAcctResponseT actual, inqCsdAcctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCsdAcctResponseT (actual.basic,expected.basic, logMsg);
}

