#include <InqMembPermCsh.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembPermCshRequestT getBscInqMembPermCshRequestT(char* testCaseNum , const char *root) {
	bscInqMembPermCshRequestT vbscInqMembPermCshRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqMembPermCshRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMembPermCsh.bscInqMembPermCshRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqMembPermCshRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqMembPermCshRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMembPermCshRequestT getInqMembPermCshRequestT(char* testCaseNum , const char *root) {
	inqMembPermCshRequestT vinqMembPermCshRequestT;
	int i;

	vinqMembPermCshRequestT.header = getDataHeaderT(testCaseNum, "inqMembPermCshRequestT");
	vinqMembPermCshRequestT.basic = getBscInqMembPermCshRequestT(testCaseNum, "inqMembPermCshRequestT");	return vinqMembPermCshRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembPermCshRecT getBscInqMembPermCshRecT(char* testCaseNum , const char *root) {
	bscInqMembPermCshRecT vbscInqMembPermCshRecT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqMembPermCshRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqMembPermCsh.bscInqMembPermCshRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqMembPermCshRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqMembPermCshRecT.permCshAmnt[i]= ' ';
	}
	char lpermCshAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqMembPermCsh.bscInqMembPermCshRecT.permCshAmnt", lpermCshAmnt);
	memcpy(vbscInqMembPermCshRecT.permCshAmnt, lpermCshAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqMembPermCshRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqMembPermCsh.bscInqMembPermCshRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqMembPermCshRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqMembPermCshRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembPermCshResponseT getBscInqMembPermCshResponseT(char* testCaseNum , const char *root) {
	bscInqMembPermCshResponseT vbscInqMembPermCshResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqMembPermCshResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMembPermCsh.bscInqMembPermCshResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqMembPermCshResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqMembPermCshResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqMembPermCsh.bscInqMembPermCshResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqMembPermCshResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqMembPermCshResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMembPermCshResponseT getInqMembPermCshResponseT(char* testCaseNum , const char *root) {
	inqMembPermCshResponseT vinqMembPermCshResponseT;
	int i;

	vinqMembPermCshResponseT.header = getDataHeaderT(testCaseNum, "inqMembPermCshResponseT");
	vinqMembPermCshResponseT.basic = getBscInqMembPermCshResponseT(testCaseNum, "inqMembPermCshResponseT");	return vinqMembPermCshResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembPermCshRequestT(bscInqMembPermCshRequestT actual, bscInqMembPermCshRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembPermCshRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMembPermCshRequestT(inqMembPermCshRequestT actual, inqMembPermCshRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMembPermCshRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembPermCshRecT(bscInqMembPermCshRecT actual, bscInqMembPermCshRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembPermCshRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.permCshAmnt, expected.permCshAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembPermCshRecT, permCshAmnt not matching. Actual %s but Expected %s", actual.permCshAmnt, expected.permCshAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembPermCshRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembPermCshResponseT(bscInqMembPermCshResponseT actual, bscInqMembPermCshResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembPermCshResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembPermCshResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_MEMB_PERM_CSH_REC_MAX;i++) {
		compareBscInqMembPermCshRecT (actual.bscInqMembPermCshRec[i],expected.bscInqMembPermCshRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMembPermCshResponseT(inqMembPermCshResponseT actual, inqMembPermCshResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMembPermCshResponseT (actual.basic,expected.basic, logMsg);
}

