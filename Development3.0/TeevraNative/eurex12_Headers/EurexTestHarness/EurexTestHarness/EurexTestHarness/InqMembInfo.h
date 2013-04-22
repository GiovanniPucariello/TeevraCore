#include <InqMembInfo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembInfoRequestT getBscInqMembInfoRequestT(char* testCaseNum , const char *root) {
	bscInqMembInfoRequestT vbscInqMembInfoRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqMembInfoRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqMembInfo.bscInqMembInfoRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqMembInfoRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);
	return vbscInqMembInfoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMembInfoRequestT getInqMembInfoRequestT(char* testCaseNum , const char *root) {
	inqMembInfoRequestT vinqMembInfoRequestT;
	int i;

	vinqMembInfoRequestT.header = getDataHeaderT(testCaseNum, "inqMembInfoRequestT");
	vinqMembInfoRequestT.basic = getBscInqMembInfoRequestT(testCaseNum, "inqMembInfoRequestT");	return vinqMembInfoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembInfoResponseT getBscInqMembInfoResponseT(char* testCaseNum , const char *root) {
	bscInqMembInfoResponseT vbscInqMembInfoResponseT;
	int i;

	for(i=0;i<DRIV_CLG_MEMB_CURR_TYP_COD_LEN;i++) {
		vbscInqMembInfoResponseT.clgMembCurrTypCod[i]= ' ';
	}
	char lclgMembCurrTypCod[DRIV_CLG_MEMB_CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqMembInfo.bscInqMembInfoResponseT.clgMembCurrTypCod", lclgMembCurrTypCod);
	memcpy(vbscInqMembInfoResponseT.clgMembCurrTypCod, lclgMembCurrTypCod, DRIV_CLG_MEMB_CURR_TYP_COD_LEN);

	char lmembExchAffilTypCod[1] = {""};
	getStrProperty("InqMembInfo.bscInqMembInfoResponseT.membExchAffilTypCod", lmembExchAffilTypCod);
	vbscInqMembInfoResponseT.membExchAffilTypCod = lmembExchAffilTypCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqMembInfoResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqMembInfo.bscInqMembInfoResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqMembInfoResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	char liseTrdAlwdInd[1] = {""};
	getStrProperty("InqMembInfo.bscInqMembInfoResponseT.iseTrdAlwdInd", liseTrdAlwdInd);
	vbscInqMembInfoResponseT.iseTrdAlwdInd = liseTrdAlwdInd[0];

	char loccClgAlwdInd[1] = {""};
	getStrProperty("InqMembInfo.bscInqMembInfoResponseT.occClgAlwdInd", loccClgAlwdInd);
	vbscInqMembInfoResponseT.occClgAlwdInd = loccClgAlwdInd[0];
	return vbscInqMembInfoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqMembInfoResponseT getExtInqMembInfoResponseT(char* testCaseNum , const char *root) {
	extInqMembInfoResponseT vextInqMembInfoResponseT;
	int i;

	for(i=0;i<DRIV_MEMB_EXCH_LNG_NAM_LEN;i++) {
		vextInqMembInfoResponseT.membExchLngNam[i]= ' ';
	}
	char lmembExchLngNam[DRIV_MEMB_EXCH_LNG_NAM_LEN] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.membExchLngNam", lmembExchLngNam);
	memcpy(vextInqMembInfoResponseT.membExchLngNam, lmembExchLngNam, DRIV_MEMB_EXCH_LNG_NAM_LEN);

	char lclgMembTypCod[1] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.clgMembTypCod", lclgMembTypCod);
	vextInqMembInfoResponseT.clgMembTypCod = lclgMembTypCod[0];

	for(i=0;i<DRIV_MEMB_RSP_DPT_LEN;i++) {
		vextInqMembInfoResponseT.membRspDpt[i]= ' ';
	}
	char lmembRspDpt[DRIV_MEMB_RSP_DPT_LEN] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.membRspDpt", lmembRspDpt);
	memcpy(vextInqMembInfoResponseT.membRspDpt, lmembRspDpt, DRIV_MEMB_RSP_DPT_LEN);

	vextInqMembInfoResponseT.pstAddGrp = getPstAddGrpT(testCaseNum, "extInqMembInfoResponseT");
	for(i=0;i<DRIV_MEMB_AWV_CTRY_LEN;i++) {
		vextInqMembInfoResponseT.membAwvCtry[i]= ' ';
	}
	char lmembAwvCtry[DRIV_MEMB_AWV_CTRY_LEN] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.membAwvCtry", lmembAwvCtry);
	memcpy(vextInqMembInfoResponseT.membAwvCtry, lmembAwvCtry, DRIV_MEMB_AWV_CTRY_LEN);

	for(i=0;i<DRIV_CMPY_CAP_CURR_TYP_COD_LEN;i++) {
		vextInqMembInfoResponseT.cmpyCapCurrTypCod[i]= ' ';
	}
	char lcmpyCapCurrTypCod[DRIV_CMPY_CAP_CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.cmpyCapCurrTypCod", lcmpyCapCurrTypCod);
	memcpy(vextInqMembInfoResponseT.cmpyCapCurrTypCod, lcmpyCapCurrTypCod, DRIV_CMPY_CAP_CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextInqMembInfoResponseT.cmpyCapDat[i]= ' ';
	}
	char lcmpyCapDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.cmpyCapDat", lcmpyCapDat);
	memcpy(vextInqMembInfoResponseT.cmpyCapDat, lcmpyCapDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqMembInfoResponseT.cmpyCapAmnt[i]= ' ';
	}
	char lcmpyCapAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.cmpyCapAmnt", lcmpyCapAmnt);
	memcpy(vextInqMembInfoResponseT.cmpyCapAmnt, lcmpyCapAmnt, DRIV_AMOUNT_LEN);

	char lclgHseTypCod[1] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.clgHseTypCod", lclgHseTypCod);
	vextInqMembInfoResponseT.clgHseTypCod = lclgHseTypCod[0];

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqMembInfoResponseT.minCmpyCap[i]= ' ';
	}
	char lminCmpyCap[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.minCmpyCap", lminCmpyCap);
	memcpy(vextInqMembInfoResponseT.minCmpyCap, lminCmpyCap, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqMembInfoResponseT.minMgnColl[i]= ' ';
	}
	char lminMgnColl[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.minMgnColl", lminMgnColl);
	memcpy(vextInqMembInfoResponseT.minMgnColl, lminMgnColl, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqMembInfoResponseT.minClgFun[i]= ' ';
	}
	char lminClgFun[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.minClgFun", lminClgFun);
	memcpy(vextInqMembInfoResponseT.minClgFun, lminClgFun, DRIV_AMOUNT_LEN);

	char lwithStopCmpyCapInd[1] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.withStopCmpyCapInd", lwithStopCmpyCapInd);
	vextInqMembInfoResponseT.withStopCmpyCapInd = lwithStopCmpyCapInd[0];

	char lwithStopMgnCollInd[1] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.withStopMgnCollInd", lwithStopMgnCollInd);
	vextInqMembInfoResponseT.withStopMgnCollInd = lwithStopMgnCollInd[0];

	char lwithStopClgFunInd[1] = {""};
	getStrProperty("InqMembInfo.extInqMembInfoResponseT.withStopClgFunInd", lwithStopClgFunInd);
	vextInqMembInfoResponseT.withStopClgFunInd = lwithStopClgFunInd[0];
	return vextInqMembInfoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMembInfoResponseT getInqMembInfoResponseT(char* testCaseNum , const char *root) {
	inqMembInfoResponseT vinqMembInfoResponseT;
	int i;

	vinqMembInfoResponseT.header = getDataHeaderT(testCaseNum, "inqMembInfoResponseT");
	vinqMembInfoResponseT.basic = getBscInqMembInfoResponseT(testCaseNum, "inqMembInfoResponseT");
	vinqMembInfoResponseT.extension = getExtInqMembInfoResponseT(testCaseNum, "inqMembInfoResponseT");	return vinqMembInfoResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembInfoRequestT(bscInqMembInfoRequestT actual, bscInqMembInfoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembInfoRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMembInfoRequestT(inqMembInfoRequestT actual, inqMembInfoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMembInfoRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembInfoResponseT(bscInqMembInfoResponseT actual, bscInqMembInfoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.clgMembCurrTypCod, expected.clgMembCurrTypCod, DRIV_CLG_MEMB_CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembInfoResponseT, clgMembCurrTypCod not matching. Actual %s but Expected %s", actual.clgMembCurrTypCod, expected.clgMembCurrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.membExchAffilTypCod!= expected.membExchAffilTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembInfoResponseT, membExchAffilTypCodnot matching. Actual %d but Expected %d", actual.membExchAffilTypCod, expected.membExchAffilTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembInfoResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.iseTrdAlwdInd!= expected.iseTrdAlwdInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembInfoResponseT, iseTrdAlwdIndnot matching. Actual %d but Expected %d", actual.iseTrdAlwdInd, expected.iseTrdAlwdInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.occClgAlwdInd!= expected.occClgAlwdInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembInfoResponseT, occClgAlwdIndnot matching. Actual %d but Expected %d", actual.occClgAlwdInd, expected.occClgAlwdInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqMembInfoResponseT(extInqMembInfoResponseT actual, extInqMembInfoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchLngNam, expected.membExchLngNam, DRIV_MEMB_EXCH_LNG_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, membExchLngNam not matching. Actual %s but Expected %s", actual.membExchLngNam, expected.membExchLngNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.clgMembTypCod!= expected.clgMembTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, clgMembTypCodnot matching. Actual %d but Expected %d", actual.clgMembTypCod, expected.clgMembTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membRspDpt, expected.membRspDpt, DRIV_MEMB_RSP_DPT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, membRspDpt not matching. Actual %s but Expected %s", actual.membRspDpt, expected.membRspDpt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	comparePstAddGrpT (actual.pstAddGrp,expected.pstAddGrp, logMsg);
	if ( memcmp(actual.membAwvCtry, expected.membAwvCtry, DRIV_MEMB_AWV_CTRY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, membAwvCtry not matching. Actual %s but Expected %s", actual.membAwvCtry, expected.membAwvCtry);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_INQ_MEMB_INFO_CLG_REC_MAX;i++) {
		compareClgCtctGrpT (actual.clgCtctGrp[i],expected.clgCtctGrp[i], logMsg);
	}
	if ( memcmp(actual.cmpyCapCurrTypCod, expected.cmpyCapCurrTypCod, DRIV_CMPY_CAP_CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, cmpyCapCurrTypCod not matching. Actual %s but Expected %s", actual.cmpyCapCurrTypCod, expected.cmpyCapCurrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cmpyCapDat, expected.cmpyCapDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, cmpyCapDat not matching. Actual %s but Expected %s", actual.cmpyCapDat, expected.cmpyCapDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cmpyCapAmnt, expected.cmpyCapAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, cmpyCapAmnt not matching. Actual %s but Expected %s", actual.cmpyCapAmnt, expected.cmpyCapAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.clgHseTypCod!= expected.clgHseTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, clgHseTypCodnot matching. Actual %d but Expected %d", actual.clgHseTypCod, expected.clgHseTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.minCmpyCap, expected.minCmpyCap, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, minCmpyCap not matching. Actual %s but Expected %s", actual.minCmpyCap, expected.minCmpyCap);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.minMgnColl, expected.minMgnColl, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, minMgnColl not matching. Actual %s but Expected %s", actual.minMgnColl, expected.minMgnColl);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.minClgFun, expected.minClgFun, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, minClgFun not matching. Actual %s but Expected %s", actual.minClgFun, expected.minClgFun);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.withStopCmpyCapInd!= expected.withStopCmpyCapInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, withStopCmpyCapIndnot matching. Actual %d but Expected %d", actual.withStopCmpyCapInd, expected.withStopCmpyCapInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.withStopMgnCollInd!= expected.withStopMgnCollInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, withStopMgnCollIndnot matching. Actual %d but Expected %d", actual.withStopMgnCollInd, expected.withStopMgnCollInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.withStopClgFunInd!= expected.withStopClgFunInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembInfoResponseT, withStopClgFunIndnot matching. Actual %d but Expected %d", actual.withStopClgFunInd, expected.withStopClgFunInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_INQ_MEMB_INFO_GU_REC_MAX;i++) {
		compareGivUpCtctGrpT (actual.givUpCtctGrp[i],expected.givUpCtctGrp[i], logMsg);
	}
	for ( i = 0; i < EXT_INQ_MEMB_INFO_CSH_REC_MAX;i++) {
		compareCshLimGrpT (actual.cshLimGrp[i],expected.cshLimGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMembInfoResponseT(inqMembInfoResponseT actual, inqMembInfoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMembInfoResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqMembInfoResponseT (actual.extension,expected.extension, logMsg);
}

