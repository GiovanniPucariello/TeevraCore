#include <SubPrivMembMsg.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubPrivMembMsgBcastT getBscSubPrivMembMsgBcastT(char* testCaseNum , const char *root) {
	bscSubPrivMembMsgBcastT vbscSubPrivMembMsgBcastT;
	int i;

	char lprivMembMsgTypCod[1] = {""};
	getStrProperty("SubPrivMembMsg.bscSubPrivMembMsgBcastT.privMembMsgTypCod", lprivMembMsgTypCod);
	vbscSubPrivMembMsgBcastT.privMembMsgTypCod = lprivMembMsgTypCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscSubPrivMembMsgBcastT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubPrivMembMsg.bscSubPrivMembMsgBcastT.prodId", lprodId);
	memcpy(vbscSubPrivMembMsgBcastT.prodId, lprodId, PROD_ID_LEN);

	char levntTypCod[1] = {""};
	getStrProperty("SubPrivMembMsg.bscSubPrivMembMsgBcastT.evntTypCod", levntTypCod);
	vbscSubPrivMembMsgBcastT.evntTypCod = levntTypCod[0];

	vbscSubPrivMembMsgBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscSubPrivMembMsgBcastT");
	for(i=0;i<MSG_TEXT_LEN;i++) {
		vbscSubPrivMembMsgBcastT.msgText[i]= ' ';
	}
	char lmsgText[MSG_TEXT_LEN] = {""};
	getStrProperty("SubPrivMembMsg.bscSubPrivMembMsgBcastT.msgText", lmsgText);
	memcpy(vbscSubPrivMembMsgBcastT.msgText, lmsgText, MSG_TEXT_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscSubPrivMembMsgBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubPrivMembMsg.bscSubPrivMembMsgBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscSubPrivMembMsgBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscSubPrivMembMsgBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscSubPrivMembMsgBcastT");
	for(i=0;i<PRCS_STS_VAL_COD_LEN;i++) {
		vbscSubPrivMembMsgBcastT.prcsStsValCod[i]= ' ';
	}
	char lprcsStsValCod[PRCS_STS_VAL_COD_LEN] = {""};
	getStrProperty("SubPrivMembMsg.bscSubPrivMembMsgBcastT.prcsStsValCod", lprcsStsValCod);
	memcpy(vbscSubPrivMembMsgBcastT.prcsStsValCod, lprcsStsValCod, PRCS_STS_VAL_COD_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubPrivMembMsgBcastT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubPrivMembMsg.bscSubPrivMembMsgBcastT.trnDat", ltrnDat);
	memcpy(vbscSubPrivMembMsgBcastT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubPrivMembMsgBcastT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubPrivMembMsg.bscSubPrivMembMsgBcastT.trnTim", ltrnTim);
	memcpy(vbscSubPrivMembMsgBcastT.trnTim, ltrnTim, DRIV_TIME_LEN);
	return vbscSubPrivMembMsgBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subPrivMembMsgBcastT getSubPrivMembMsgBcastT(char* testCaseNum , const char *root) {
	subPrivMembMsgBcastT vsubPrivMembMsgBcastT;
	int i;

	for(i=0;i<DRIV_STM_SEQ_NO_LEN;i++) {
		vsubPrivMembMsgBcastT.stmSeqNo[i]= ' ';
	}
	char lstmSeqNo[DRIV_STM_SEQ_NO_LEN] = {""};
	getStrProperty("SubPrivMembMsg.subPrivMembMsgBcastT.stmSeqNo", lstmSeqNo);
	memcpy(vsubPrivMembMsgBcastT.stmSeqNo, lstmSeqNo, DRIV_STM_SEQ_NO_LEN);

	vsubPrivMembMsgBcastT.header = getDataHeaderT(testCaseNum, "subPrivMembMsgBcastT");
	vsubPrivMembMsgBcastT.basic = getBscSubPrivMembMsgBcastT(testCaseNum, "subPrivMembMsgBcastT");	return vsubPrivMembMsgBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subPrivMembMsgSubjectT getSubPrivMembMsgSubjectT(char* testCaseNum , const char *root) {
	subPrivMembMsgSubjectT vsubPrivMembMsgSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vsubPrivMembMsgSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubPrivMembMsg.subPrivMembMsgSubjectT.membId", lmembId);
	memcpy(vsubPrivMembMsgSubjectT.membId, lmembId, MEMB_ID_LEN);
	return vsubPrivMembMsgSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubPrivMembMsgBcastT(bscSubPrivMembMsgBcastT actual, bscSubPrivMembMsgBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.privMembMsgTypCod!= expected.privMembMsgTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubPrivMembMsgBcastT, privMembMsgTypCodnot matching. Actual %d but Expected %d", actual.privMembMsgTypCod, expected.privMembMsgTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubPrivMembMsgBcastT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.evntTypCod!= expected.evntTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubPrivMembMsgBcastT, evntTypCodnot matching. Actual %d but Expected %d", actual.evntTypCod, expected.evntTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.msgText, expected.msgText, MSG_TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubPrivMembMsgBcastT, msgText not matching. Actual %s but Expected %s", actual.msgText, expected.msgText);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubPrivMembMsgBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.prcsStsValCod, expected.prcsStsValCod, PRCS_STS_VAL_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubPrivMembMsgBcastT, prcsStsValCod not matching. Actual %s but Expected %s", actual.prcsStsValCod, expected.prcsStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubPrivMembMsgBcastT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubPrivMembMsgBcastT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubPrivMembMsgBcastT(subPrivMembMsgBcastT actual, subPrivMembMsgBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.stmSeqNo, expected.stmSeqNo, DRIV_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In subPrivMembMsgBcastT, stmSeqNo not matching. Actual %s but Expected %s", actual.stmSeqNo, expected.stmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubPrivMembMsgBcastT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubPrivMembMsgSubjectT(subPrivMembMsgSubjectT actual, subPrivMembMsgSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In subPrivMembMsgSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

