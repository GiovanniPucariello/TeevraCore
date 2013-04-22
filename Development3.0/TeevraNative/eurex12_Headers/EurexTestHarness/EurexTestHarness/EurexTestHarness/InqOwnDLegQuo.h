#include <InqOwnDLegQuo.hxx>
#define BUFFER_SIZE 1000

futInqOwnDLegQuoRequestT *vfutInqOwnDLegQuoRequestT;
futInqOwnDLegQuoResponseT *vfutInqOwnDLegQuoResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnDLegQuoGrpT getFutBscInqOwnDLegQuoGrpT(char* testCaseNum , const char *root) {
	futBscInqOwnDLegQuoGrpT vfutBscInqOwnDLegQuoGrpT;
	int i;

	vfutBscInqOwnDLegQuoGrpT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqOwnDLegQuoGrpT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqOwnDLegQuoGrpT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoGrpT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqOwnDLegQuoGrpT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscInqOwnDLegQuoGrpT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscInqOwnDLegQuoGrpT");	return vfutBscInqOwnDLegQuoGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnDLegQuoRequestT getFutBscInqOwnDLegQuoRequestT(char* testCaseNum , const char *root) {
	futBscInqOwnDLegQuoRequestT vfutBscInqOwnDLegQuoRequestT;
	int i;

	vfutBscInqOwnDLegQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnDLegQuoRequestT");
	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnDLegQuoRequestT.quoTimMin[i]= ' ';
	}
	char lquoTimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRequestT.quoTimMin", lquoTimMin);
	memcpy(vfutBscInqOwnDLegQuoRequestT.quoTimMin, lquoTimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnDLegQuoRequestT.quoTimMax[i]= ' ';
	}
	char lquoTimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRequestT.quoTimMax", lquoTimMax);
	memcpy(vfutBscInqOwnDLegQuoRequestT.quoTimMax, lquoTimMax, DRIV_TIME_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqOwnDLegQuoRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqOwnDLegQuoRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnDLegQuoRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnDLegQuoRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqOwnDLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnDLegQuoRecT getFutBscInqOwnDLegQuoRecT(char* testCaseNum , const char *root) {
	futBscInqOwnDLegQuoRecT vfutBscInqOwnDLegQuoRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.buyCod", lbuyCod);
	vfutBscInqOwnDLegQuoRecT.buyCod = lbuyCod[0];

	vfutBscInqOwnDLegQuoRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqOwnDLegQuoRecT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqOwnDLegQuoRecT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscInqOwnDLegQuoRecT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscInqOwnDLegQuoRecT");
	vfutBscInqOwnDLegQuoRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnDLegQuoRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.ordrNoBuy", lordrNoBuy);
	memcpy(vfutBscInqOwnDLegQuoRecT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.ordrNoSel", lordrNoSel);
	memcpy(vfutBscInqOwnDLegQuoRecT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(vfutBscInqOwnDLegQuoRecT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.quoBkQtySel", lquoBkQtySel);
	memcpy(vfutBscInqOwnDLegQuoRecT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(vfutBscInqOwnDLegQuoRecT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.quoExeQtySel", lquoExeQtySel);
	memcpy(vfutBscInqOwnDLegQuoRecT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vfutBscInqOwnDLegQuoRecT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.quoExePrcSel", lquoExePrcSel);
	memcpy(vfutBscInqOwnDLegQuoRecT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.quoPrioTimBuy[i]= ' ';
	}
	char lquoPrioTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.quoPrioTimBuy", lquoPrioTimBuy);
	memcpy(vfutBscInqOwnDLegQuoRecT.quoPrioTimBuy, lquoPrioTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.quoPrioTimSel[i]= ' ';
	}
	char lquoPrioTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.quoPrioTimSel", lquoPrioTimSel);
	memcpy(vfutBscInqOwnDLegQuoRecT.quoPrioTimSel, lquoPrioTimSel, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.quoPrioDatBuy[i]= ' ';
	}
	char lquoPrioDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.quoPrioDatBuy", lquoPrioDatBuy);
	memcpy(vfutBscInqOwnDLegQuoRecT.quoPrioDatBuy, lquoPrioDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.quoPrioDatSel[i]= ' ';
	}
	char lquoPrioDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.quoPrioDatSel", lquoPrioDatSel);
	memcpy(vfutBscInqOwnDLegQuoRecT.quoPrioDatSel, lquoPrioDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.lstEvntDatBuy[i]= ' ';
	}
	char llstEvntDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.lstEvntDatBuy", llstEvntDatBuy);
	memcpy(vfutBscInqOwnDLegQuoRecT.lstEvntDatBuy, llstEvntDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.lstEvntTimBuy[i]= ' ';
	}
	char llstEvntTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.lstEvntTimBuy", llstEvntTimBuy);
	memcpy(vfutBscInqOwnDLegQuoRecT.lstEvntTimBuy, llstEvntTimBuy, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.lstEvntTrnIdBuy[i]= ' ';
	}
	char llstEvntTrnIdBuy[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.lstEvntTrnIdBuy", llstEvntTrnIdBuy);
	memcpy(vfutBscInqOwnDLegQuoRecT.lstEvntTrnIdBuy, llstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.lstEvntDatSel[i]= ' ';
	}
	char llstEvntDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.lstEvntDatSel", llstEvntDatSel);
	memcpy(vfutBscInqOwnDLegQuoRecT.lstEvntDatSel, llstEvntDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.lstEvntTimSel[i]= ' ';
	}
	char llstEvntTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.lstEvntTimSel", llstEvntTimSel);
	memcpy(vfutBscInqOwnDLegQuoRecT.lstEvntTimSel, llstEvntTimSel, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscInqOwnDLegQuoRecT.lstEvntTrnIdSel[i]= ' ';
	}
	char llstEvntTrnIdSel[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoRecT.lstEvntTrnIdSel", llstEvntTrnIdSel);
	memcpy(vfutBscInqOwnDLegQuoRecT.lstEvntTrnIdSel, llstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN);
	return vfutBscInqOwnDLegQuoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnDLegQuoResponseT getFutBscInqOwnDLegQuoResponseT(char* testCaseNum , const char *root) {
	futBscInqOwnDLegQuoResponseT vfutBscInqOwnDLegQuoResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnDLegQuoResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnDLegQuoResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqOwnDLegQuoResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnDLegQuo.futBscInqOwnDLegQuoResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqOwnDLegQuoResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqOwnDLegQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnDLegQuoRecT getFutExtInqOwnDLegQuoRecT(char* testCaseNum , const char *root) {
	futExtInqOwnDLegQuoRecT vfutExtInqOwnDLegQuoRecT;
	int i;

	vfutExtInqOwnDLegQuoRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqOwnDLegQuoRecT");	return vfutExtInqOwnDLegQuoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnDLegQuoResponseT getFutExtInqOwnDLegQuoResponseT(char* testCaseNum , const char *root) {
	futExtInqOwnDLegQuoResponseT vfutExtInqOwnDLegQuoResponseT;
	int i;
	return vfutExtInqOwnDLegQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnDLegQuoRequestT* getFutInqOwnDLegQuoRequestT(char* testCaseNum) {
	vfutInqOwnDLegQuoRequestT = (futInqOwnDLegQuoRequestT*)malloc(sizeof(futInqOwnDLegQuoRequestT));
	int i;

	vfutInqOwnDLegQuoRequestT->header = getDataHeaderT(testCaseNum, "futInqOwnDLegQuoRequestT");
	vfutInqOwnDLegQuoRequestT->basic = getFutBscInqOwnDLegQuoRequestT(testCaseNum, "futInqOwnDLegQuoRequestT");
	return vfutInqOwnDLegQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnDLegQuoResponseT* getFutInqOwnDLegQuoResponseT(char* testCaseNum) {
	vfutInqOwnDLegQuoResponseT = (futInqOwnDLegQuoResponseT*)malloc(sizeof(futInqOwnDLegQuoResponseT));
	int i;

	vfutInqOwnDLegQuoResponseT->header = getDataHeaderT(testCaseNum, "futInqOwnDLegQuoResponseT");
	vfutInqOwnDLegQuoResponseT->basic = getFutBscInqOwnDLegQuoResponseT(testCaseNum, "futInqOwnDLegQuoResponseT");
	vfutInqOwnDLegQuoResponseT->extension = getFutExtInqOwnDLegQuoResponseT(testCaseNum, "futInqOwnDLegQuoResponseT");
	return vfutInqOwnDLegQuoResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnDLegQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnDLegQuoRequestT));
	futInqOwnDLegQuoRequestT *vfutInqOwnDLegQuoRequestT = getFutInqOwnDLegQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnDLegQuoRequestT), (jbyte*) vfutInqOwnDLegQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnDLegQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnDLegQuoResponseT));
	futInqOwnDLegQuoResponseT *vfutInqOwnDLegQuoResponseT = getFutInqOwnDLegQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnDLegQuoResponseT), (jbyte*) vfutInqOwnDLegQuoResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnDLegQuoGrpT(futBscInqOwnDLegQuoGrpT actual, futBscInqOwnDLegQuoGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoGrpT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnDLegQuoRequestT(futBscInqOwnDLegQuoRequestT actual, futBscInqOwnDLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_OWN_D_LEG_QUO_GRP_MAX;i++) {
		compareFutBscInqOwnDLegQuoGrpT (actual.futBscInqOwnDLegQuoGrp[i],expected.futBscInqOwnDLegQuoGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.quoTimMin, expected.quoTimMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRequestT, quoTimMin not matching. Actual %s but Expected %s", actual.quoTimMin, expected.quoTimMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTimMax, expected.quoTimMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRequestT, quoTimMax not matching. Actual %s but Expected %s", actual.quoTimMax, expected.quoTimMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnDLegQuoRecT(futBscInqOwnDLegQuoRecT actual, futBscInqOwnDLegQuoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimBuy, expected.quoPrioTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, quoPrioTimBuy not matching. Actual %s but Expected %s", actual.quoPrioTimBuy, expected.quoPrioTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimSel, expected.quoPrioTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, quoPrioTimSel not matching. Actual %s but Expected %s", actual.quoPrioTimSel, expected.quoPrioTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatBuy, expected.quoPrioDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, quoPrioDatBuy not matching. Actual %s but Expected %s", actual.quoPrioDatBuy, expected.quoPrioDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatSel, expected.quoPrioDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, quoPrioDatSel not matching. Actual %s but Expected %s", actual.quoPrioDatSel, expected.quoPrioDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatBuy, expected.lstEvntDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, lstEvntDatBuy not matching. Actual %s but Expected %s", actual.lstEvntDatBuy, expected.lstEvntDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimBuy, expected.lstEvntTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, lstEvntTimBuy not matching. Actual %s but Expected %s", actual.lstEvntTimBuy, expected.lstEvntTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, lstEvntTrnIdBuy not matching. Actual %s but Expected %s", actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatSel, expected.lstEvntDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, lstEvntDatSel not matching. Actual %s but Expected %s", actual.lstEvntDatSel, expected.lstEvntDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimSel, expected.lstEvntTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, lstEvntTimSel not matching. Actual %s but Expected %s", actual.lstEvntTimSel, expected.lstEvntTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoRecT, lstEvntTrnIdSel not matching. Actual %s but Expected %s", actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnDLegQuoResponseT(futBscInqOwnDLegQuoResponseT actual, futBscInqOwnDLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegQuoResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_OWN_D_LEG_QUO_REC_MAX;i++) {
		compareFutBscInqOwnDLegQuoRecT (actual.futBscInqOwnDLegQuoRec[i],expected.futBscInqOwnDLegQuoRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnDLegQuoRecT(futExtInqOwnDLegQuoRecT actual, futExtInqOwnDLegQuoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnDLegQuoResponseT(futExtInqOwnDLegQuoResponseT actual, futExtInqOwnDLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_OWN_D_LEG_QUO_REC_MAX;i++) {
		compareFutExtInqOwnDLegQuoRecT (actual.futExtInqOwnDLegQuoRec[i],expected.futExtInqOwnDLegQuoRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnDLegQuoRequestT(futInqOwnDLegQuoRequestT actual, futInqOwnDLegQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnDLegQuoRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnDLegQuoResponseT(futInqOwnDLegQuoResponseT actual, futInqOwnDLegQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnDLegQuoResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqOwnDLegQuoResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnDLegQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnDLegQuoRequestT *actualData = (futInqOwnDLegQuoRequestT *)msgStruct;
	futInqOwnDLegQuoRequestT* expectedData = getFutInqOwnDLegQuoRequestT(testCaseNum);
	compareFutInqOwnDLegQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnDLegQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnDLegQuoResponseT *actualData = (futInqOwnDLegQuoResponseT *)msgStruct;
	futInqOwnDLegQuoResponseT* expectedData = getFutInqOwnDLegQuoResponseT(testCaseNum);
	compareFutInqOwnDLegQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
