#include <InqCollSecu.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCollSecuRequestT getBscInqCollSecuRequestT(char* testCaseNum , const char *root) {
	bscInqCollSecuRequestT vbscInqCollSecuRequestT;
	int i;

	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscInqCollSecuRequestT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuRequestT.isinCod", lisinCod);
	memcpy(vbscInqCollSecuRequestT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_SECU_ID_LEN;i++) {
		vbscInqCollSecuRequestT.secuId[i]= ' ';
	}
	char lsecuId[DRIV_SECU_ID_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuRequestT.secuId", lsecuId);
	memcpy(vbscInqCollSecuRequestT.secuId, lsecuId, DRIV_SECU_ID_LEN);
	return vbscInqCollSecuRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCollSecuRequestT getInqCollSecuRequestT(char* testCaseNum , const char *root) {
	inqCollSecuRequestT vinqCollSecuRequestT;
	int i;

	vinqCollSecuRequestT.header = getDataHeaderT(testCaseNum, "inqCollSecuRequestT");
	vinqCollSecuRequestT.basic = getBscInqCollSecuRequestT(testCaseNum, "inqCollSecuRequestT");	return vinqCollSecuRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCollSecuResponseT getBscInqCollSecuResponseT(char* testCaseNum , const char *root) {
	bscInqCollSecuResponseT vbscInqCollSecuResponseT;
	int i;

	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscInqCollSecuResponseT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.isinCod", lisinCod);
	memcpy(vbscInqCollSecuResponseT.isinCod, lisinCod, ISIN_COD_LEN);

	char lsecuTypPfx[1] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.secuTypPfx", lsecuTypPfx);
	vbscInqCollSecuResponseT.secuTypPfx = lsecuTypPfx[0];

	for(i=0;i<SECU_ID_SFX_LEN;i++) {
		vbscInqCollSecuResponseT.secuTypSfx[i]= ' ';
	}
	char lsecuTypSfx[SECU_ID_SFX_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.secuTypSfx", lsecuTypSfx);
	memcpy(vbscInqCollSecuResponseT.secuTypSfx, lsecuTypSfx, SECU_ID_SFX_LEN);

	for(i=0;i<SECU_TYP_NAM_LEN;i++) {
		vbscInqCollSecuResponseT.secuTypNam[i]= ' ';
	}
	char lsecuTypNam[SECU_TYP_NAM_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.secuTypNam", lsecuTypNam);
	memcpy(vbscInqCollSecuResponseT.secuTypNam, lsecuTypNam, SECU_TYP_NAM_LEN);

	for(i=0;i<DRIV_SECU_ID_LEN;i++) {
		vbscInqCollSecuResponseT.secuId[i]= ' ';
	}
	char lsecuId[DRIV_SECU_ID_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.secuId", lsecuId);
	memcpy(vbscInqCollSecuResponseT.secuId, lsecuId, DRIV_SECU_ID_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqCollSecuResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.currTypCod", lcurrTypCod);
	memcpy(vbscInqCollSecuResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqCollSecuResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqCollSecuResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_SECU_NAM_LEN;i++) {
		vbscInqCollSecuResponseT.secuNam[i]= ' ';
	}
	char lsecuNam[DRIV_SECU_NAM_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.secuNam", lsecuNam);
	memcpy(vbscInqCollSecuResponseT.secuNam, lsecuNam, DRIV_SECU_NAM_LEN);

	for(i=0;i<DRIV_SECU_LNG_NAM_LEN;i++) {
		vbscInqCollSecuResponseT.secuLngNam[i]= ' ';
	}
	char lsecuLngNam[DRIV_SECU_LNG_NAM_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.secuLngNam", lsecuLngNam);
	memcpy(vbscInqCollSecuResponseT.secuLngNam, lsecuLngNam, DRIV_SECU_LNG_NAM_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqCollSecuResponseT.secuExpDat[i]= ' ';
	}
	char lsecuExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.secuExpDat", lsecuExpDat);
	memcpy(vbscInqCollSecuResponseT.secuExpDat, lsecuExpDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_COLL_EXCH_ID_COD_LEN;i++) {
		vbscInqCollSecuResponseT.collExchIdCod[i]= ' ';
	}
	char lcollExchIdCod[DRIV_COLL_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.collExchIdCod", lcollExchIdCod);
	memcpy(vbscInqCollSecuResponseT.collExchIdCod, lcollExchIdCod, DRIV_COLL_EXCH_ID_COD_LEN);

	char lcollInd[1] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.collInd", lcollInd);
	vbscInqCollSecuResponseT.collInd = lcollInd[0];

	for(i=0;i<DRIV_COLL_ALWD_PCNT_LEN;i++) {
		vbscInqCollSecuResponseT.collAlwdPcnt[i]= ' ';
	}
	char lcollAlwdPcnt[DRIV_COLL_ALWD_PCNT_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.collAlwdPcnt", lcollAlwdPcnt);
	memcpy(vbscInqCollSecuResponseT.collAlwdPcnt, lcollAlwdPcnt, DRIV_COLL_ALWD_PCNT_LEN);

	char lcalcCollEvalPcntInd[1] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.calcCollEvalPcntInd", lcalcCollEvalPcntInd);
	vbscInqCollSecuResponseT.calcCollEvalPcntInd = lcalcCollEvalPcntInd[0];

	for(i=0;i<COLL_EVAL_PCNT_LEN;i++) {
		vbscInqCollSecuResponseT.collEvalPcnt[i]= ' ';
	}
	char lcollEvalPcnt[COLL_EVAL_PCNT_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.collEvalPcnt", lcollEvalPcnt);
	memcpy(vbscInqCollSecuResponseT.collEvalPcnt, lcollEvalPcnt, COLL_EVAL_PCNT_LEN);

	char ldepAlwdInd[1] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.depAlwdInd", ldepAlwdInd);
	vbscInqCollSecuResponseT.depAlwdInd = ldepAlwdInd[0];

	for(i=0;i<PREF_PRC_SRC_LEN;i++) {
		vbscInqCollSecuResponseT.prefPrcSrc[i]= ' ';
	}
	char lprefPrcSrc[PREF_PRC_SRC_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.prefPrcSrc", lprefPrcSrc);
	memcpy(vbscInqCollSecuResponseT.prefPrcSrc, lprefPrcSrc, PREF_PRC_SRC_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqCollSecuResponseT.collClsPrc[i]= ' ';
	}
	char lcollClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.collClsPrc", lcollClsPrc);
	memcpy(vbscInqCollSecuResponseT.collClsPrc, lcollClsPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqCollSecuResponseT.collClsPrcDat[i]= ' ';
	}
	char lcollClsPrcDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.collClsPrcDat", lcollClsPrcDat);
	memcpy(vbscInqCollSecuResponseT.collClsPrcDat, lcollClsPrcDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqCollSecuResponseT.prvCollClsPrc[i]= ' ';
	}
	char lprvCollClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.prvCollClsPrc", lprvCollClsPrc);
	memcpy(vbscInqCollSecuResponseT.prvCollClsPrc, lprvCollClsPrc, DRIV_PRICE_LEN);

	char lcollPrcTypCod[1] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.collPrcTypCod", lcollPrcTypCod);
	vbscInqCollSecuResponseT.collPrcTypCod = lcollPrcTypCod[0];

	for(i=0;i<DRIV_COLL_DISP_DCML_LEN;i++) {
		vbscInqCollSecuResponseT.collDispDcml[i]= ' ';
	}
	char lcollDispDcml[DRIV_COLL_DISP_DCML_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.collDispDcml", lcollDispDcml);
	memcpy(vbscInqCollSecuResponseT.collDispDcml, lcollDispDcml, DRIV_COLL_DISP_DCML_LEN);

	for(i=0;i<DRIV_ALRT_PCNT_LEN;i++) {
		vbscInqCollSecuResponseT.alrtPcnt[i]= ' ';
	}
	char lalrtPcnt[DRIV_ALRT_PCNT_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.alrtPcnt", lalrtPcnt);
	memcpy(vbscInqCollSecuResponseT.alrtPcnt, lalrtPcnt, DRIV_ALRT_PCNT_LEN);

	for(i=0;i<DRIV_ISD_COLL_QTY_LEN;i++) {
		vbscInqCollSecuResponseT.isdCollQty[i]= ' ';
	}
	char lisdCollQty[DRIV_ISD_COLL_QTY_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.isdCollQty", lisdCollQty);
	memcpy(vbscInqCollSecuResponseT.isdCollQty, lisdCollQty, DRIV_ISD_COLL_QTY_LEN);

	for(i=0;i<DRIV_COLL_TOT_DEP_QTY_LEN;i++) {
		vbscInqCollSecuResponseT.collTotDepQty[i]= ' ';
	}
	char lcollTotDepQty[DRIV_COLL_TOT_DEP_QTY_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.collTotDepQty", lcollTotDepQty);
	memcpy(vbscInqCollSecuResponseT.collTotDepQty, lcollTotDepQty, DRIV_COLL_TOT_DEP_QTY_LEN);

	for(i=0;i<COLL_INT_RAT_METH_LEN;i++) {
		vbscInqCollSecuResponseT.collIntRatMeth[i]= ' ';
	}
	char lcollIntRatMeth[COLL_INT_RAT_METH_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.collIntRatMeth", lcollIntRatMeth);
	memcpy(vbscInqCollSecuResponseT.collIntRatMeth, lcollIntRatMeth, COLL_INT_RAT_METH_LEN);

	for(i=0;i<CPN_FREQ_LEN;i++) {
		vbscInqCollSecuResponseT.cpnFreq[i]= ' ';
	}
	char lcpnFreq[CPN_FREQ_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.cpnFreq", lcpnFreq);
	memcpy(vbscInqCollSecuResponseT.cpnFreq, lcpnFreq, CPN_FREQ_LEN);

	for(i=0;i<DRIV_CPN_RAT_LEN;i++) {
		vbscInqCollSecuResponseT.cpnRat[i]= ' ';
	}
	char lcpnRat[DRIV_CPN_RAT_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.cpnRat", lcpnRat);
	memcpy(vbscInqCollSecuResponseT.cpnRat, lcpnRat, DRIV_CPN_RAT_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqCollSecuResponseT.lstPayDat[i]= ' ';
	}
	char llstPayDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.lstPayDat", llstPayDat);
	memcpy(vbscInqCollSecuResponseT.lstPayDat, llstPayDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqCollSecuResponseT.nxtPayDat[i]= ' ';
	}
	char lnxtPayDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.nxtPayDat", lnxtPayDat);
	memcpy(vbscInqCollSecuResponseT.nxtPayDat, lnxtPayDat, DRIV_DATE_LEN);

	char lmanUpdInd[1] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.manUpdInd", lmanUpdInd);
	vbscInqCollSecuResponseT.manUpdInd = lmanUpdInd[0];

	char ldelInd[1] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.delInd", ldelInd);
	vbscInqCollSecuResponseT.delInd = ldelInd[0];

	for(i=0;i<DRIV_SECU_ISSR_LEN;i++) {
		vbscInqCollSecuResponseT.secuIssr[i]= ' ';
	}
	char lsecuIssr[DRIV_SECU_ISSR_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.secuIssr", lsecuIssr);
	memcpy(vbscInqCollSecuResponseT.secuIssr, lsecuIssr, DRIV_SECU_ISSR_LEN);

	for(i=0;i<ADJ_DAYS_LEN;i++) {
		vbscInqCollSecuResponseT.adjDays[i]= ' ';
	}
	char ladjDays[ADJ_DAYS_LEN] = {""};
	getStrProperty("InqCollSecu.bscInqCollSecuResponseT.adjDays", ladjDays);
	memcpy(vbscInqCollSecuResponseT.adjDays, ladjDays, ADJ_DAYS_LEN);
	return vbscInqCollSecuResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCollSecuResponseT getInqCollSecuResponseT(char* testCaseNum , const char *root) {
	inqCollSecuResponseT vinqCollSecuResponseT;
	int i;

	vinqCollSecuResponseT.header = getDataHeaderT(testCaseNum, "inqCollSecuResponseT");
	vinqCollSecuResponseT.basic = getBscInqCollSecuResponseT(testCaseNum, "inqCollSecuResponseT");	return vinqCollSecuResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCollSecuRequestT(bscInqCollSecuRequestT actual, bscInqCollSecuRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuRequestT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuId, expected.secuId, DRIV_SECU_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuRequestT, secuId not matching. Actual %s but Expected %s", actual.secuId, expected.secuId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCollSecuRequestT(inqCollSecuRequestT actual, inqCollSecuRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCollSecuRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCollSecuResponseT(bscInqCollSecuResponseT actual, bscInqCollSecuResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.secuTypPfx!= expected.secuTypPfx) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, secuTypPfxnot matching. Actual %d but Expected %d", actual.secuTypPfx, expected.secuTypPfx);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuTypSfx, expected.secuTypSfx, SECU_ID_SFX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, secuTypSfx not matching. Actual %s but Expected %s", actual.secuTypSfx, expected.secuTypSfx);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuTypNam, expected.secuTypNam, SECU_TYP_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, secuTypNam not matching. Actual %s but Expected %s", actual.secuTypNam, expected.secuTypNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuId, expected.secuId, DRIV_SECU_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, secuId not matching. Actual %s but Expected %s", actual.secuId, expected.secuId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuNam, expected.secuNam, DRIV_SECU_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, secuNam not matching. Actual %s but Expected %s", actual.secuNam, expected.secuNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuLngNam, expected.secuLngNam, DRIV_SECU_LNG_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, secuLngNam not matching. Actual %s but Expected %s", actual.secuLngNam, expected.secuLngNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuExpDat, expected.secuExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, secuExpDat not matching. Actual %s but Expected %s", actual.secuExpDat, expected.secuExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collExchIdCod, expected.collExchIdCod, DRIV_COLL_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, collExchIdCod not matching. Actual %s but Expected %s", actual.collExchIdCod, expected.collExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.collInd!= expected.collInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, collIndnot matching. Actual %d but Expected %d", actual.collInd, expected.collInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collAlwdPcnt, expected.collAlwdPcnt, DRIV_COLL_ALWD_PCNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, collAlwdPcnt not matching. Actual %s but Expected %s", actual.collAlwdPcnt, expected.collAlwdPcnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.calcCollEvalPcntInd!= expected.calcCollEvalPcntInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, calcCollEvalPcntIndnot matching. Actual %d but Expected %d", actual.calcCollEvalPcntInd, expected.calcCollEvalPcntInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collEvalPcnt, expected.collEvalPcnt, COLL_EVAL_PCNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, collEvalPcnt not matching. Actual %s but Expected %s", actual.collEvalPcnt, expected.collEvalPcnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.depAlwdInd!= expected.depAlwdInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, depAlwdIndnot matching. Actual %d but Expected %d", actual.depAlwdInd, expected.depAlwdInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prefPrcSrc, expected.prefPrcSrc, PREF_PRC_SRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, prefPrcSrc not matching. Actual %s but Expected %s", actual.prefPrcSrc, expected.prefPrcSrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collClsPrc, expected.collClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, collClsPrc not matching. Actual %s but Expected %s", actual.collClsPrc, expected.collClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collClsPrcDat, expected.collClsPrcDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, collClsPrcDat not matching. Actual %s but Expected %s", actual.collClsPrcDat, expected.collClsPrcDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvCollClsPrc, expected.prvCollClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, prvCollClsPrc not matching. Actual %s but Expected %s", actual.prvCollClsPrc, expected.prvCollClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.collPrcTypCod!= expected.collPrcTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, collPrcTypCodnot matching. Actual %d but Expected %d", actual.collPrcTypCod, expected.collPrcTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collDispDcml, expected.collDispDcml, DRIV_COLL_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, collDispDcml not matching. Actual %s but Expected %s", actual.collDispDcml, expected.collDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.alrtPcnt, expected.alrtPcnt, DRIV_ALRT_PCNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, alrtPcnt not matching. Actual %s but Expected %s", actual.alrtPcnt, expected.alrtPcnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isdCollQty, expected.isdCollQty, DRIV_ISD_COLL_QTY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, isdCollQty not matching. Actual %s but Expected %s", actual.isdCollQty, expected.isdCollQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collTotDepQty, expected.collTotDepQty, DRIV_COLL_TOT_DEP_QTY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, collTotDepQty not matching. Actual %s but Expected %s", actual.collTotDepQty, expected.collTotDepQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collIntRatMeth, expected.collIntRatMeth, COLL_INT_RAT_METH_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, collIntRatMeth not matching. Actual %s but Expected %s", actual.collIntRatMeth, expected.collIntRatMeth);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnFreq, expected.cpnFreq, CPN_FREQ_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, cpnFreq not matching. Actual %s but Expected %s", actual.cpnFreq, expected.cpnFreq);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnRat, expected.cpnRat, DRIV_CPN_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, cpnRat not matching. Actual %s but Expected %s", actual.cpnRat, expected.cpnRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstPayDat, expected.lstPayDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, lstPayDat not matching. Actual %s but Expected %s", actual.lstPayDat, expected.lstPayDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nxtPayDat, expected.nxtPayDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, nxtPayDat not matching. Actual %s but Expected %s", actual.nxtPayDat, expected.nxtPayDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.manUpdInd!= expected.manUpdInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, manUpdIndnot matching. Actual %d but Expected %d", actual.manUpdInd, expected.manUpdInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.delInd!= expected.delInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, delIndnot matching. Actual %d but Expected %d", actual.delInd, expected.delInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuIssr, expected.secuIssr, DRIV_SECU_ISSR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, secuIssr not matching. Actual %s but Expected %s", actual.secuIssr, expected.secuIssr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.adjDays, expected.adjDays, ADJ_DAYS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCollSecuResponseT, adjDays not matching. Actual %s but Expected %s", actual.adjDays, expected.adjDays);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCollSecuResponseT(inqCollSecuResponseT actual, inqCollSecuResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCollSecuResponseT (actual.basic,expected.basic, logMsg);
}

