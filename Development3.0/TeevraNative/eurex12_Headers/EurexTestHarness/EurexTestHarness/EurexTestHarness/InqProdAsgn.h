#include <InqProdAsgn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdAsgnRequestT getBscInqProdAsgnRequestT(char* testCaseNum , const char *root) {
	bscInqProdAsgnRequestT vbscInqProdAsgnRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqProdAsgnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqProdAsgn.bscInqProdAsgnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqProdAsgnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqProdAsgnRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqProdAsgnRequestT");
	vbscInqProdAsgnRequestT.prodGrpIdGrp = getProdGrpIdGrpT(testCaseNum, "bscInqProdAsgnRequestT");
	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdAsgnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdAsgn.bscInqProdAsgnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdAsgnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqProdAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdAsgnRequestT getInqProdAsgnRequestT(char* testCaseNum , const char *root) {
	inqProdAsgnRequestT vinqProdAsgnRequestT;
	int i;

	vinqProdAsgnRequestT.header = getDataHeaderT(testCaseNum, "inqProdAsgnRequestT");
	vinqProdAsgnRequestT.basic = getBscInqProdAsgnRequestT(testCaseNum, "inqProdAsgnRequestT");	return vinqProdAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdAsgnRecT getBscInqProdAsgnRecT(char* testCaseNum , const char *root) {
	bscInqProdAsgnRecT vbscInqProdAsgnRecT;
	int i;

	vbscInqProdAsgnRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqProdAsgnRecT");
	vbscInqProdAsgnRecT.prodGrpIdGrp = getProdGrpIdGrpT(testCaseNum, "bscInqProdAsgnRecT");
	char lmktMkrLicInd[1] = {""};
	getStrProperty("InqProdAsgn.bscInqProdAsgnRecT.mktMkrLicInd", lmktMkrLicInd);
	vbscInqProdAsgnRecT.mktMkrLicInd = lmktMkrLicInd[0];

	vbscInqProdAsgnRecT.prodAsgnGrp = getProdAsgnGrpT(testCaseNum, "bscInqProdAsgnRecT");	return vbscInqProdAsgnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdAsgnResponseT getBscInqProdAsgnResponseT(char* testCaseNum , const char *root) {
	bscInqProdAsgnResponseT vbscInqProdAsgnResponseT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqProdAsgnResponseT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqProdAsgn.bscInqProdAsgnResponseT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqProdAsgnResponseT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdAsgnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdAsgn.bscInqProdAsgnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdAsgnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqProdAsgnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqProdAsgn.bscInqProdAsgnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqProdAsgnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqProdAsgnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdAsgnResponseT getInqProdAsgnResponseT(char* testCaseNum , const char *root) {
	inqProdAsgnResponseT vinqProdAsgnResponseT;
	int i;

	vinqProdAsgnResponseT.header = getDataHeaderT(testCaseNum, "inqProdAsgnResponseT");
	vinqProdAsgnResponseT.basic = getBscInqProdAsgnResponseT(testCaseNum, "inqProdAsgnResponseT");	return vinqProdAsgnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdAsgnRequestT(bscInqProdAsgnRequestT actual, bscInqProdAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdAsgnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareProdGrpIdGrpT (actual.prodGrpIdGrp,expected.prodGrpIdGrp, logMsg);
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdAsgnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdAsgnRequestT(inqProdAsgnRequestT actual, inqProdAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdAsgnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdAsgnRecT(bscInqProdAsgnRecT actual, bscInqProdAsgnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareProdGrpIdGrpT (actual.prodGrpIdGrp,expected.prodGrpIdGrp, logMsg);
	if (actual.mktMkrLicInd!= expected.mktMkrLicInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdAsgnRecT, mktMkrLicIndnot matching. Actual %d but Expected %d", actual.mktMkrLicInd, expected.mktMkrLicInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareProdAsgnGrpT (actual.prodAsgnGrp,expected.prodAsgnGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdAsgnResponseT(bscInqProdAsgnResponseT actual, bscInqProdAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdAsgnResponseT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdAsgnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdAsgnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_PROD_ASGN_REC_MAX;i++) {
		compareBscInqProdAsgnRecT (actual.bscInqProdAsgnRec[i],expected.bscInqProdAsgnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdAsgnResponseT(inqProdAsgnResponseT actual, inqProdAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdAsgnResponseT (actual.basic,expected.basic, logMsg);
}

