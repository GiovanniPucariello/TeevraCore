#include <ModMktMkrQuoLim.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMktMkrQuoLimRequestT getBscModMktMkrQuoLimRequestT(char* testCaseNum , const char *root) {
	bscModMktMkrQuoLimRequestT vbscModMktMkrQuoLimRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscModMktMkrQuoLimRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("ModMktMkrQuoLim.bscModMktMkrQuoLimRequestT.prodId", lprodId);
	memcpy(vbscModMktMkrQuoLimRequestT.prodId, lprodId, PROD_ID_LEN);

	vbscModMktMkrQuoLimRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscModMktMkrQuoLimRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscModMktMkrQuoLimRequestT.volLimQty[i]= ' ';
	}
	char lvolLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("ModMktMkrQuoLim.bscModMktMkrQuoLimRequestT.volLimQty", lvolLimQty);
	memcpy(vbscModMktMkrQuoLimRequestT.volLimQty, lvolLimQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscModMktMkrQuoLimRequestT.deltaLimQty[i]= ' ';
	}
	char ldeltaLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("ModMktMkrQuoLim.bscModMktMkrQuoLimRequestT.deltaLimQty", ldeltaLimQty);
	memcpy(vbscModMktMkrQuoLimRequestT.deltaLimQty, ldeltaLimQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscModMktMkrQuoLimRequestT.vegaLimQty[i]= ' ';
	}
	char lvegaLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("ModMktMkrQuoLim.bscModMktMkrQuoLimRequestT.vegaLimQty", lvegaLimQty);
	memcpy(vbscModMktMkrQuoLimRequestT.vegaLimQty, lvegaLimQty, DRIV_QUANTITY_LEN);

	for(i=0;i<TIM_INTVL_SEC_LEN;i++) {
		vbscModMktMkrQuoLimRequestT.timIntvlSec[i]= ' ';
	}
	char ltimIntvlSec[TIM_INTVL_SEC_LEN] = {""};
	getStrProperty("ModMktMkrQuoLim.bscModMktMkrQuoLimRequestT.timIntvlSec", ltimIntvlSec);
	memcpy(vbscModMktMkrQuoLimRequestT.timIntvlSec, ltimIntvlSec, TIM_INTVL_SEC_LEN);
	return vbscModMktMkrQuoLimRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modMktMkrQuoLimRequestT getModMktMkrQuoLimRequestT(char* testCaseNum , const char *root) {
	modMktMkrQuoLimRequestT vmodMktMkrQuoLimRequestT;
	int i;

	vmodMktMkrQuoLimRequestT.header = getDataHeaderT(testCaseNum, "modMktMkrQuoLimRequestT");
	vmodMktMkrQuoLimRequestT.basic = getBscModMktMkrQuoLimRequestT(testCaseNum, "modMktMkrQuoLimRequestT");	return vmodMktMkrQuoLimRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modMktMkrQuoLimResponseT getModMktMkrQuoLimResponseT(char* testCaseNum , const char *root) {
	modMktMkrQuoLimResponseT vmodMktMkrQuoLimResponseT;
	int i;

	vmodMktMkrQuoLimResponseT.header = getDataHeaderT(testCaseNum, "modMktMkrQuoLimResponseT");	return vmodMktMkrQuoLimResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMktMkrQuoLimRequestT(bscModMktMkrQuoLimRequestT actual, bscModMktMkrQuoLimRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMktMkrQuoLimRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.volLimQty, expected.volLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMktMkrQuoLimRequestT, volLimQty not matching. Actual %s but Expected %s", actual.volLimQty, expected.volLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.deltaLimQty, expected.deltaLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMktMkrQuoLimRequestT, deltaLimQty not matching. Actual %s but Expected %s", actual.deltaLimQty, expected.deltaLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.vegaLimQty, expected.vegaLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMktMkrQuoLimRequestT, vegaLimQty not matching. Actual %s but Expected %s", actual.vegaLimQty, expected.vegaLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timIntvlSec, expected.timIntvlSec, TIM_INTVL_SEC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMktMkrQuoLimRequestT, timIntvlSec not matching. Actual %s but Expected %s", actual.timIntvlSec, expected.timIntvlSec);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModMktMkrQuoLimRequestT(modMktMkrQuoLimRequestT actual, modMktMkrQuoLimRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModMktMkrQuoLimRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModMktMkrQuoLimResponseT(modMktMkrQuoLimResponseT actual, modMktMkrQuoLimResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

