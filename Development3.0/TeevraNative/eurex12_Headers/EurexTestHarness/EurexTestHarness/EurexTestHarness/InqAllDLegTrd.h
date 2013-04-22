#include <InqAllDLegTrd.hxx>
#define BUFFER_SIZE 1000

futInqAllDLegTrdRequestT *vfutInqAllDLegTrdRequestT;
futInqAllDLegTrdResponseT *vfutInqAllDLegTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllDLegTrdRequestT getFutBscInqAllDLegTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqAllDLegTrdRequestT vfutBscInqAllDLegTrdRequestT;
	int i;

	vfutBscInqAllDLegTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqAllDLegTrdRequestT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqAllDLegTrdRequestT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRequestT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqAllDLegTrdRequestT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscInqAllDLegTrdRequestT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscInqAllDLegTrdRequestT");
	char ltrdOrigTyp[1] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRequestT.trdOrigTyp", ltrdOrigTyp);
	vfutBscInqAllDLegTrdRequestT.trdOrigTyp = ltrdOrigTyp[0];

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRequestT.trdTyp", ltrdTyp);
	vfutBscInqAllDLegTrdRequestT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqAllDLegTrdRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRequestT.trnDat", ltrnDat);
	memcpy(vfutBscInqAllDLegTrdRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqAllDLegTrdRequestT.timMin[i]= ' ';
	}
	char ltimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRequestT.timMin", ltimMin);
	memcpy(vfutBscInqAllDLegTrdRequestT.timMin, ltimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqAllDLegTrdRequestT.timMax[i]= ' ';
	}
	char ltimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRequestT.timMax", ltimMax);
	memcpy(vfutBscInqAllDLegTrdRequestT.timMax, ltimMax, DRIV_TIME_LEN);

	for(i=0;i<TRD_EVNT_TRN_ID_MIN_LEN;i++) {
		vfutBscInqAllDLegTrdRequestT.trdEvntSeqNoMin[i]= ' ';
	}
	char ltrdEvntSeqNoMin[TRD_EVNT_TRN_ID_MIN_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRequestT.trdEvntSeqNoMin", ltrdEvntSeqNoMin);
	memcpy(vfutBscInqAllDLegTrdRequestT.trdEvntSeqNoMin, ltrdEvntSeqNoMin, TRD_EVNT_TRN_ID_MIN_LEN);

	for(i=0;i<TRD_EVNT_TRN_ID_MAX_LEN;i++) {
		vfutBscInqAllDLegTrdRequestT.trdEvntSeqNoMax[i]= ' ';
	}
	char ltrdEvntSeqNoMax[TRD_EVNT_TRN_ID_MAX_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRequestT.trdEvntSeqNoMax", ltrdEvntSeqNoMax);
	memcpy(vfutBscInqAllDLegTrdRequestT.trdEvntSeqNoMax, ltrdEvntSeqNoMax, TRD_EVNT_TRN_ID_MAX_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqAllDLegTrdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqAllDLegTrdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqAllDLegTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllDLegTrdRecT getFutBscInqAllDLegTrdRecT(char* testCaseNum , const char *root) {
	futBscInqAllDLegTrdRecT vfutBscInqAllDLegTrdRecT;
	int i;

	vfutBscInqAllDLegTrdRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqAllDLegTrdRecT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqAllDLegTrdRecT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscInqAllDLegTrdRecT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscInqAllDLegTrdRecT");
	for(i=0;i<TRD_EVNT_TRN_ID_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.trdEvntSeqNo[i]= ' ';
	}
	char ltrdEvntSeqNo[TRD_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.trdEvntSeqNo", ltrdEvntSeqNo);
	memcpy(vfutBscInqAllDLegTrdRecT.trdEvntSeqNo, ltrdEvntSeqNo, TRD_EVNT_TRN_ID_LEN);

	char ltrdPrcTyp[1] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.trdPrcTyp", ltrdPrcTyp);
	vfutBscInqAllDLegTrdRecT.trdPrcTyp = ltrdPrcTyp[0];

	char lrevsInd[1] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.revsInd", lrevsInd);
	vfutBscInqAllDLegTrdRecT.revsInd = lrevsInd[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.trdQty[i]= ' ';
	}
	char ltrdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.trdQty", ltrdQty);
	memcpy(vfutBscInqAllDLegTrdRecT.trdQty, ltrdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqAllDLegTrdRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.trnDat", ltrnDat);
	memcpy(vfutBscInqAllDLegTrdRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.trnTim", ltrnTim);
	memcpy(vfutBscInqAllDLegTrdRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	for(i=0;i<NO_OF_BUY_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.noOfBuy[i]= ' ';
	}
	char lnoOfBuy[NO_OF_BUY_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.noOfBuy", lnoOfBuy);
	memcpy(vfutBscInqAllDLegTrdRecT.noOfBuy, lnoOfBuy, NO_OF_BUY_LEN);

	for(i=0;i<NO_OF_SEL_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.noOfSel[i]= ' ';
	}
	char lnoOfSel[NO_OF_SEL_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.noOfSel", lnoOfSel);
	memcpy(vfutBscInqAllDLegTrdRecT.noOfSel, lnoOfSel, NO_OF_SEL_LEN);

	char lagrsrSidCod[1] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.agrsrSidCod", lagrsrSidCod);
	vfutBscInqAllDLegTrdRecT.agrsrSidCod = lagrsrSidCod[0];

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.totTrdQty", ltotTrdQty);
	memcpy(vfutBscInqAllDLegTrdRecT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.trdTyp", ltrdTyp);
	vfutBscInqAllDLegTrdRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.trnIdNo1[i]= ' ';
	}
	char ltrnIdNo1[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.trnIdNo1", ltrnIdNo1);
	memcpy(vfutBscInqAllDLegTrdRecT.trnIdNo1, ltrnIdNo1, TRN_ID_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqAllDLegTrdRecT.trnIdNo2[i]= ' ';
	}
	char ltrnIdNo2[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdRecT.trnIdNo2", ltrnIdNo2);
	memcpy(vfutBscInqAllDLegTrdRecT.trnIdNo2, ltrnIdNo2, TRN_ID_NO_LEN);
	return vfutBscInqAllDLegTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllDLegTrdResponseT getFutBscInqAllDLegTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqAllDLegTrdResponseT vfutBscInqAllDLegTrdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqAllDLegTrdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqAllDLegTrdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqAllDLegTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAllDLegTrd.futBscInqAllDLegTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqAllDLegTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqAllDLegTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqAllDLegTrdRequestT* getFutInqAllDLegTrdRequestT(char* testCaseNum) {
	vfutInqAllDLegTrdRequestT = (futInqAllDLegTrdRequestT*)malloc(sizeof(futInqAllDLegTrdRequestT));
	int i;

	vfutInqAllDLegTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqAllDLegTrdRequestT");
	vfutInqAllDLegTrdRequestT->basic = getFutBscInqAllDLegTrdRequestT(testCaseNum, "futInqAllDLegTrdRequestT");
	return vfutInqAllDLegTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqAllDLegTrdResponseT* getFutInqAllDLegTrdResponseT(char* testCaseNum) {
	vfutInqAllDLegTrdResponseT = (futInqAllDLegTrdResponseT*)malloc(sizeof(futInqAllDLegTrdResponseT));
	int i;

	vfutInqAllDLegTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqAllDLegTrdResponseT");
	vfutInqAllDLegTrdResponseT->basic = getFutBscInqAllDLegTrdResponseT(testCaseNum, "futInqAllDLegTrdResponseT");
	return vfutInqAllDLegTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqAllDLegTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqAllDLegTrdRequestT));
	futInqAllDLegTrdRequestT *vfutInqAllDLegTrdRequestT = getFutInqAllDLegTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqAllDLegTrdRequestT), (jbyte*) vfutInqAllDLegTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqAllDLegTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqAllDLegTrdResponseT));
	futInqAllDLegTrdResponseT *vfutInqAllDLegTrdResponseT = getFutInqAllDLegTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqAllDLegTrdResponseT), (jbyte*) vfutInqAllDLegTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllDLegTrdRequestT(futBscInqAllDLegTrdRequestT actual, futBscInqAllDLegTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRequestT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	if (actual.trdOrigTyp!= expected.trdOrigTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRequestT, trdOrigTypnot matching. Actual %d but Expected %d", actual.trdOrigTyp, expected.trdOrigTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMin, expected.timMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRequestT, timMin not matching. Actual %s but Expected %s", actual.timMin, expected.timMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMax, expected.timMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRequestT, timMax not matching. Actual %s but Expected %s", actual.timMax, expected.timMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdEvntSeqNoMin, expected.trdEvntSeqNoMin, TRD_EVNT_TRN_ID_MIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRequestT, trdEvntSeqNoMin not matching. Actual %s but Expected %s", actual.trdEvntSeqNoMin, expected.trdEvntSeqNoMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdEvntSeqNoMax, expected.trdEvntSeqNoMax, TRD_EVNT_TRN_ID_MAX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRequestT, trdEvntSeqNoMax not matching. Actual %s but Expected %s", actual.trdEvntSeqNoMax, expected.trdEvntSeqNoMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllDLegTrdRecT(futBscInqAllDLegTrdRecT actual, futBscInqAllDLegTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	if ( memcmp(actual.trdEvntSeqNo, expected.trdEvntSeqNo, TRD_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, trdEvntSeqNo not matching. Actual %s but Expected %s", actual.trdEvntSeqNo, expected.trdEvntSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdPrcTyp!= expected.trdPrcTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, trdPrcTypnot matching. Actual %d but Expected %d", actual.trdPrcTyp, expected.trdPrcTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.revsInd!= expected.revsInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, revsIndnot matching. Actual %d but Expected %d", actual.revsInd, expected.revsInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdQty, expected.trdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, trdQty not matching. Actual %s but Expected %s", actual.trdQty, expected.trdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfBuy, expected.noOfBuy, NO_OF_BUY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, noOfBuy not matching. Actual %s but Expected %s", actual.noOfBuy, expected.noOfBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfSel, expected.noOfSel, NO_OF_SEL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, noOfSel not matching. Actual %s but Expected %s", actual.noOfSel, expected.noOfSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.agrsrSidCod!= expected.agrsrSidCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, agrsrSidCodnot matching. Actual %d but Expected %d", actual.agrsrSidCod, expected.agrsrSidCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo1, expected.trnIdNo1, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, trnIdNo1 not matching. Actual %s but Expected %s", actual.trnIdNo1, expected.trnIdNo1);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo2, expected.trnIdNo2, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdRecT, trnIdNo2 not matching. Actual %s but Expected %s", actual.trnIdNo2, expected.trnIdNo2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllDLegTrdResponseT(futBscInqAllDLegTrdResponseT actual, futBscInqAllDLegTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllDLegTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_ALL_DLEG_TRD_REC_MAX;i++) {
		compareFutBscInqAllDLegTrdRecT (actual.futBscInqAllDLegTrdRec[i],expected.futBscInqAllDLegTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqAllDLegTrdRequestT(futInqAllDLegTrdRequestT actual, futInqAllDLegTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqAllDLegTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqAllDLegTrdResponseT(futInqAllDLegTrdResponseT actual, futInqAllDLegTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqAllDLegTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqAllDLegTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqAllDLegTrdRequestT *actualData = (futInqAllDLegTrdRequestT *)msgStruct;
	futInqAllDLegTrdRequestT* expectedData = getFutInqAllDLegTrdRequestT(testCaseNum);
	compareFutInqAllDLegTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqAllDLegTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqAllDLegTrdResponseT *actualData = (futInqAllDLegTrdResponseT *)msgStruct;
	futInqAllDLegTrdResponseT* expectedData = getFutInqAllDLegTrdResponseT(testCaseNum);
	compareFutInqAllDLegTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
