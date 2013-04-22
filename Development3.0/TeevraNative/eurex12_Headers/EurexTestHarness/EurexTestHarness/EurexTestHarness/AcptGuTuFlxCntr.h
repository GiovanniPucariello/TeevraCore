#include <AcptGuTuFlxCntr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscAcptGuTuFlxCntrRequestT getBscAcptGuTuFlxCntrRequestT(char* testCaseNum , const char *root) {
	bscAcptGuTuFlxCntrRequestT vbscAcptGuTuFlxCntrRequestT;
	int i;

	vbscAcptGuTuFlxCntrRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscAcptGuTuFlxCntrRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("AcptGuTuFlxCntr.bscAcptGuTuFlxCntrRequestT.buyCod", lbuyCod);
	vbscAcptGuTuFlxCntrRequestT.buyCod = lbuyCod[0];

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscAcptGuTuFlxCntrRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("AcptGuTuFlxCntr.bscAcptGuTuFlxCntrRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscAcptGuTuFlxCntrRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscAcptGuTuFlxCntrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscAcptGuTuFlxCntrRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAcptGuTuFlxCntrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptGuTuFlxCntr.bscAcptGuTuFlxCntrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAcptGuTuFlxCntrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAcptGuTuFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
acptGuTuFlxCntrRequestT getAcptGuTuFlxCntrRequestT(char* testCaseNum , const char *root) {
	acptGuTuFlxCntrRequestT vacptGuTuFlxCntrRequestT;
	int i;

	vacptGuTuFlxCntrRequestT.header = getDataHeaderT(testCaseNum, "acptGuTuFlxCntrRequestT");
	vacptGuTuFlxCntrRequestT.basic = getBscAcptGuTuFlxCntrRequestT(testCaseNum, "acptGuTuFlxCntrRequestT");	return vacptGuTuFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscAcptGuTuFlxCntrResponseT getBscAcptGuTuFlxCntrResponseT(char* testCaseNum , const char *root) {
	bscAcptGuTuFlxCntrResponseT vbscAcptGuTuFlxCntrResponseT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscAcptGuTuFlxCntrResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("AcptGuTuFlxCntr.bscAcptGuTuFlxCntrResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscAcptGuTuFlxCntrResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAcptGuTuFlxCntrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptGuTuFlxCntr.bscAcptGuTuFlxCntrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAcptGuTuFlxCntrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAcptGuTuFlxCntrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
acptGuTuFlxCntrResponseT getAcptGuTuFlxCntrResponseT(char* testCaseNum , const char *root) {
	acptGuTuFlxCntrResponseT vacptGuTuFlxCntrResponseT;
	int i;

	vacptGuTuFlxCntrResponseT.header = getDataHeaderT(testCaseNum, "acptGuTuFlxCntrResponseT");
	vacptGuTuFlxCntrResponseT.basic = getBscAcptGuTuFlxCntrResponseT(testCaseNum, "acptGuTuFlxCntrResponseT");	return vacptGuTuFlxCntrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAcptGuTuFlxCntrRequestT(bscAcptGuTuFlxCntrRequestT actual, bscAcptGuTuFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptGuTuFlxCntrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptGuTuFlxCntrRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptGuTuFlxCntrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcptGuTuFlxCntrRequestT(acptGuTuFlxCntrRequestT actual, acptGuTuFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAcptGuTuFlxCntrRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAcptGuTuFlxCntrResponseT(bscAcptGuTuFlxCntrResponseT actual, bscAcptGuTuFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptGuTuFlxCntrResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptGuTuFlxCntrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcptGuTuFlxCntrResponseT(acptGuTuFlxCntrResponseT actual, acptGuTuFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAcptGuTuFlxCntrResponseT (actual.basic,expected.basic, logMsg);
}

