#include <ModMembPermCsh.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembPermCshGrpT getBscModMembPermCshGrpT(char* testCaseNum , const char *root) {
	bscModMembPermCshGrpT vbscModMembPermCshGrpT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscModMembPermCshGrpT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("ModMembPermCsh.bscModMembPermCshGrpT.currTypCod", lcurrTypCod);
	memcpy(vbscModMembPermCshGrpT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscModMembPermCshGrpT.permCshAmnt[i]= ' ';
	}
	char lpermCshAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("ModMembPermCsh.bscModMembPermCshGrpT.permCshAmnt", lpermCshAmnt);
	memcpy(vbscModMembPermCshGrpT.permCshAmnt, lpermCshAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModMembPermCshGrpT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModMembPermCsh.bscModMembPermCshGrpT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModMembPermCshGrpT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModMembPermCshGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembPermCshRequestT getBscModMembPermCshRequestT(char* testCaseNum , const char *root) {
	bscModMembPermCshRequestT vbscModMembPermCshRequestT;
	int i;

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscModMembPermCshRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModMembPermCsh.bscModMembPermCshRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscModMembPermCshRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscModMembPermCshRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modMembPermCshRequestT getModMembPermCshRequestT(char* testCaseNum , const char *root) {
	modMembPermCshRequestT vmodMembPermCshRequestT;
	int i;

	vmodMembPermCshRequestT.header = getDataHeaderT(testCaseNum, "modMembPermCshRequestT");
	vmodMembPermCshRequestT.basic = getBscModMembPermCshRequestT(testCaseNum, "modMembPermCshRequestT");	return vmodMembPermCshRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembPermCshRecT getBscModMembPermCshRecT(char* testCaseNum , const char *root) {
	bscModMembPermCshRecT vbscModMembPermCshRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vbscModMembPermCshRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("ModMembPermCsh.bscModMembPermCshRecT.rtnCod", lrtnCod);
	memcpy(vbscModMembPermCshRecT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModMembPermCshRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModMembPermCsh.bscModMembPermCshRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModMembPermCshRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModMembPermCshRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembPermCshResponseT getBscModMembPermCshResponseT(char* testCaseNum , const char *root) {
	bscModMembPermCshResponseT vbscModMembPermCshResponseT;
	int i;

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscModMembPermCshResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModMembPermCsh.bscModMembPermCshResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscModMembPermCshResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscModMembPermCshResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modMembPermCshResponseT getModMembPermCshResponseT(char* testCaseNum , const char *root) {
	modMembPermCshResponseT vmodMembPermCshResponseT;
	int i;

	vmodMembPermCshResponseT.header = getDataHeaderT(testCaseNum, "modMembPermCshResponseT");
	vmodMembPermCshResponseT.basic = getBscModMembPermCshResponseT(testCaseNum, "modMembPermCshResponseT");	return vmodMembPermCshResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembPermCshGrpT(bscModMembPermCshGrpT actual, bscModMembPermCshGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembPermCshGrpT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.permCshAmnt, expected.permCshAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembPermCshGrpT, permCshAmnt not matching. Actual %s but Expected %s", actual.permCshAmnt, expected.permCshAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembPermCshGrpT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembPermCshRequestT(bscModMembPermCshRequestT actual, bscModMembPermCshRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembPermCshRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_MEMB_PERM_CSH_GRP_MAX;i++) {
		compareBscModMembPermCshGrpT (actual.bscModMembPermCshGrp[i],expected.bscModMembPermCshGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModMembPermCshRequestT(modMembPermCshRequestT actual, modMembPermCshRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModMembPermCshRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembPermCshRecT(bscModMembPermCshRecT actual, bscModMembPermCshRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembPermCshRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembPermCshRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembPermCshResponseT(bscModMembPermCshResponseT actual, bscModMembPermCshResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembPermCshResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_MEMB_PERM_CSH_REC_MAX;i++) {
		compareBscModMembPermCshRecT (actual.bscModMembPermCshRec[i],expected.bscModMembPermCshRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModMembPermCshResponseT(modMembPermCshResponseT actual, modMembPermCshResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModMembPermCshResponseT (actual.basic,expected.basic, logMsg);
}

