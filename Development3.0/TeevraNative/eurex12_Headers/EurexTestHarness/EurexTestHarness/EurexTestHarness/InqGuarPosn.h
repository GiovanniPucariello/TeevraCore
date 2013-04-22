#include <InqGuarPosn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqGuarPosnRequestT getBscInqGuarPosnRequestT(char* testCaseNum , const char *root) {
	bscInqGuarPosnRequestT vbscInqGuarPosnRequestT;
	int i;

	for(i=0;i<DRIV_GUA_ID_LEN;i++) {
		vbscInqGuarPosnRequestT.guaId[i]= ' ';
	}
	char lguaId[DRIV_GUA_ID_LEN] = {""};
	getStrProperty("InqGuarPosn.bscInqGuarPosnRequestT.guaId", lguaId);
	memcpy(vbscInqGuarPosnRequestT.guaId, lguaId, DRIV_GUA_ID_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqGuarPosnRequestT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqGuarPosn.bscInqGuarPosnRequestT.currTypCod", lcurrTypCod);
	memcpy(vbscInqGuarPosnRequestT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqGuarPosnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqGuarPosn.bscInqGuarPosnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqGuarPosnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	char lasstPurpCod[1] = {""};
	getStrProperty("InqGuarPosn.bscInqGuarPosnRequestT.asstPurpCod", lasstPurpCod);
	vbscInqGuarPosnRequestT.asstPurpCod = lasstPurpCod[0];
	return vbscInqGuarPosnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqGuarPosnRequestT getInqGuarPosnRequestT(char* testCaseNum , const char *root) {
	inqGuarPosnRequestT vinqGuarPosnRequestT;
	int i;

	vinqGuarPosnRequestT.header = getDataHeaderT(testCaseNum, "inqGuarPosnRequestT");
	vinqGuarPosnRequestT.basic = getBscInqGuarPosnRequestT(testCaseNum, "inqGuarPosnRequestT");	return vinqGuarPosnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqGuarPosnResponseT getBscInqGuarPosnResponseT(char* testCaseNum , const char *root) {
	bscInqGuarPosnResponseT vbscInqGuarPosnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqGuarPosnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqGuarPosn.bscInqGuarPosnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqGuarPosnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqGuarPosnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqGuarPosn.bscInqGuarPosnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqGuarPosnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqGuarPosnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqGuarPosnRecT getExtInqGuarPosnRecT(char* testCaseNum , const char *root) {
	extInqGuarPosnRecT vextInqGuarPosnRecT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vextInqGuarPosnRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vextInqGuarPosnRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_GUAR_NO_LEN;i++) {
		vextInqGuarPosnRecT.guarNo[i]= ' ';
	}
	char lguarNo[DRIV_GUAR_NO_LEN] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.guarNo", lguarNo);
	memcpy(vextInqGuarPosnRecT.guarNo, lguarNo, DRIV_GUAR_NO_LEN);

	for(i=0;i<DRIV_GUA_ID_LEN;i++) {
		vextInqGuarPosnRecT.guaId[i]= ' ';
	}
	char lguaId[DRIV_GUA_ID_LEN] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.guaId", lguaId);
	memcpy(vextInqGuarPosnRecT.guaId, lguaId, DRIV_GUA_ID_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextInqGuarPosnRecT.guarBegDat[i]= ' ';
	}
	char lguarBegDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.guarBegDat", lguarBegDat);
	memcpy(vextInqGuarPosnRecT.guarBegDat, lguarBegDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextInqGuarPosnRecT.guarExpDat[i]= ' ';
	}
	char lguarExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.guarExpDat", lguarExpDat);
	memcpy(vextInqGuarPosnRecT.guarExpDat, lguarExpDat, DRIV_DATE_LEN);

	for(i=0;i<GUAR_GRS_AMNT;i++) {
		vextInqGuarPosnRecT.guarGrsAmnt[i]= ' ';
	}
	char lguarGrsAmnt[GUAR_GRS_AMNT] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.guarGrsAmnt", lguarGrsAmnt);
	memcpy(vextInqGuarPosnRecT.guarGrsAmnt, lguarGrsAmnt, GUAR_GRS_AMNT);

	for(i=0;i<GUAR_COLL_AMNT;i++) {
		vextInqGuarPosnRecT.guarCollAmnt[i]= ' ';
	}
	char lguarCollAmnt[GUAR_COLL_AMNT] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.guarCollAmnt", lguarCollAmnt);
	memcpy(vextInqGuarPosnRecT.guarCollAmnt, lguarCollAmnt, GUAR_COLL_AMNT);

	for(i=0;i<GUAR_TEXT_LEN;i++) {
		vextInqGuarPosnRecT.guarText[i]= ' ';
	}
	char lguarText[GUAR_TEXT_LEN] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.guarText", lguarText);
	memcpy(vextInqGuarPosnRecT.guarText, lguarText, GUAR_TEXT_LEN);

	for(i=0;i<GTOR_EVAL_PCNT_LEN;i++) {
		vextInqGuarPosnRecT.gtorEvalPcnt[i]= ' ';
	}
	char lgtorEvalPcnt[GTOR_EVAL_PCNT_LEN] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.gtorEvalPcnt", lgtorEvalPcnt);
	memcpy(vextInqGuarPosnRecT.gtorEvalPcnt, lgtorEvalPcnt, GTOR_EVAL_PCNT_LEN);

	char lasstPurpCod[1] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.asstPurpCod", lasstPurpCod);
	vextInqGuarPosnRecT.asstPurpCod = lasstPurpCod[0];

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vextInqGuarPosnRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.currTypCod", lcurrTypCod);
	memcpy(vextInqGuarPosnRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vextInqGuarPosnRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqGuarPosn.extInqGuarPosnRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vextInqGuarPosnRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vextInqGuarPosnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqGuarPosnResponseT getExtInqGuarPosnResponseT(char* testCaseNum , const char *root) {
	extInqGuarPosnResponseT vextInqGuarPosnResponseT;
	int i;
	return vextInqGuarPosnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqGuarPosnResponseT getInqGuarPosnResponseT(char* testCaseNum , const char *root) {
	inqGuarPosnResponseT vinqGuarPosnResponseT;
	int i;

	vinqGuarPosnResponseT.header = getDataHeaderT(testCaseNum, "inqGuarPosnResponseT");
	vinqGuarPosnResponseT.basic = getBscInqGuarPosnResponseT(testCaseNum, "inqGuarPosnResponseT");
	vinqGuarPosnResponseT.extension = getExtInqGuarPosnResponseT(testCaseNum, "inqGuarPosnResponseT");	return vinqGuarPosnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqGuarPosnRequestT(bscInqGuarPosnRequestT actual, bscInqGuarPosnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.guaId, expected.guaId, DRIV_GUA_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqGuarPosnRequestT, guaId not matching. Actual %s but Expected %s", actual.guaId, expected.guaId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqGuarPosnRequestT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqGuarPosnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asstPurpCod!= expected.asstPurpCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqGuarPosnRequestT, asstPurpCodnot matching. Actual %d but Expected %d", actual.asstPurpCod, expected.asstPurpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqGuarPosnRequestT(inqGuarPosnRequestT actual, inqGuarPosnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqGuarPosnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqGuarPosnResponseT(bscInqGuarPosnResponseT actual, bscInqGuarPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqGuarPosnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqGuarPosnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqGuarPosnRecT(extInqGuarPosnRecT actual, extInqGuarPosnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.guarNo, expected.guarNo, DRIV_GUAR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, guarNo not matching. Actual %s but Expected %s", actual.guarNo, expected.guarNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.guaId, expected.guaId, DRIV_GUA_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, guaId not matching. Actual %s but Expected %s", actual.guaId, expected.guaId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.guarBegDat, expected.guarBegDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, guarBegDat not matching. Actual %s but Expected %s", actual.guarBegDat, expected.guarBegDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.guarExpDat, expected.guarExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, guarExpDat not matching. Actual %s but Expected %s", actual.guarExpDat, expected.guarExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.guarGrsAmnt, expected.guarGrsAmnt, GUAR_GRS_AMNT)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, guarGrsAmnt not matching. Actual %s but Expected %s", actual.guarGrsAmnt, expected.guarGrsAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.guarCollAmnt, expected.guarCollAmnt, GUAR_COLL_AMNT)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, guarCollAmnt not matching. Actual %s but Expected %s", actual.guarCollAmnt, expected.guarCollAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.guarText, expected.guarText, GUAR_TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, guarText not matching. Actual %s but Expected %s", actual.guarText, expected.guarText);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.gtorEvalPcnt, expected.gtorEvalPcnt, GTOR_EVAL_PCNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, gtorEvalPcnt not matching. Actual %s but Expected %s", actual.gtorEvalPcnt, expected.gtorEvalPcnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asstPurpCod!= expected.asstPurpCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, asstPurpCodnot matching. Actual %d but Expected %d", actual.asstPurpCod, expected.asstPurpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqGuarPosnRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqGuarPosnResponseT(extInqGuarPosnResponseT actual, extInqGuarPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_GUAR_POSN_REC_MAX;i++) {
		compareExtInqGuarPosnRecT (actual.extInqGuarPosnRec[i],expected.extInqGuarPosnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqGuarPosnResponseT(inqGuarPosnResponseT actual, inqGuarPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqGuarPosnResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqGuarPosnResponseT (actual.extension,expected.extension, logMsg);
}

