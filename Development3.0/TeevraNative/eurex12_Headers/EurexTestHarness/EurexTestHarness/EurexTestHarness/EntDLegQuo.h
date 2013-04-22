#include <EntDLegQuo.hxx>
#define BUFFER_SIZE 1000

futEntDLegQuoRequestT *vfutEntDLegQuoRequestT;
futEntDLegQuoResponseT *vfutEntDLegQuoResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntDLegQuoRequestT getFutBscEntDLegQuoRequestT(char* testCaseNum , const char *root) {
	futBscEntDLegQuoRequestT vfutBscEntDLegQuoRequestT;
	int i;

	vfutBscEntDLegQuoRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntDLegQuoRequestT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscEntDLegQuoRequestT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoRequestT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscEntDLegQuoRequestT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscEntDLegQuoRequestT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscEntDLegQuoRequestT");
	vfutBscEntDLegQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntDLegQuoRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntDLegQuoRequestT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoRequestT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vfutBscEntDLegQuoRequestT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntDLegQuoRequestT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoRequestT.quoExePrcSel", lquoExePrcSel);
	memcpy(vfutBscEntDLegQuoRequestT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntDLegQuoRequestT.quoQtyBuy[i]= ' ';
	}
	char lquoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoRequestT.quoQtyBuy", lquoQtyBuy);
	memcpy(vfutBscEntDLegQuoRequestT.quoQtyBuy, lquoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntDLegQuoRequestT.quoQtySel[i]= ' ';
	}
	char lquoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoRequestT.quoQtySel", lquoQtySel);
	memcpy(vfutBscEntDLegQuoRequestT.quoQtySel, lquoQtySel, DRIV_VOLUME_LEN);
	return vfutBscEntDLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntDLegQuoRequestT getFutExtEntDLegQuoRequestT(char* testCaseNum , const char *root) {
	futExtEntDLegQuoRequestT vfutExtEntDLegQuoRequestT;
	int i;

	vfutExtEntDLegQuoRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtEntDLegQuoRequestT");
	char lprcRsblChkInd[1] = {""};
	getStrProperty("EntDLegQuo.futExtEntDLegQuoRequestT.prcRsblChkInd", lprcRsblChkInd);
	vfutExtEntDLegQuoRequestT.prcRsblChkInd = lprcRsblChkInd[0];
	return vfutExtEntDLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntDLegQuoResponseT getFutBscEntDLegQuoResponseT(char* testCaseNum , const char *root) {
	futBscEntDLegQuoResponseT vfutBscEntDLegQuoResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntDLegQuoResponseT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoResponseT.ordrNoBuy", lordrNoBuy);
	memcpy(vfutBscEntDLegQuoResponseT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntDLegQuoResponseT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoResponseT.ordrNoSel", lordrNoSel);
	memcpy(vfutBscEntDLegQuoResponseT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntDLegQuoResponseT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoResponseT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(vfutBscEntDLegQuoResponseT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntDLegQuoResponseT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoResponseT.quoBkQtySel", lquoBkQtySel);
	memcpy(vfutBscEntDLegQuoResponseT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntDLegQuoResponseT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoResponseT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(vfutBscEntDLegQuoResponseT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntDLegQuoResponseT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoResponseT.quoExeQtySel", lquoExeQtySel);
	memcpy(vfutBscEntDLegQuoResponseT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntDLegQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscEntDLegQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscEntDLegQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscEntDLegQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscEntDLegQuoResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("EntDLegQuo.futBscEntDLegQuoResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscEntDLegQuoResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutBscEntDLegQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntDLegQuoRequestT* getFutEntDLegQuoRequestT(char* testCaseNum) {
	vfutEntDLegQuoRequestT = (futEntDLegQuoRequestT*)malloc(sizeof(futEntDLegQuoRequestT));
	int i;

	vfutEntDLegQuoRequestT->header = getDataHeaderT(testCaseNum, "futEntDLegQuoRequestT");
	vfutEntDLegQuoRequestT->basic = getFutBscEntDLegQuoRequestT(testCaseNum, "futEntDLegQuoRequestT");
	vfutEntDLegQuoRequestT->extension = getFutExtEntDLegQuoRequestT(testCaseNum, "futEntDLegQuoRequestT");
	return vfutEntDLegQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntDLegQuoResponseT* getFutEntDLegQuoResponseT(char* testCaseNum) {
	vfutEntDLegQuoResponseT = (futEntDLegQuoResponseT*)malloc(sizeof(futEntDLegQuoResponseT));
	int i;

	vfutEntDLegQuoResponseT->header = getDataHeaderT(testCaseNum, "futEntDLegQuoResponseT");
	vfutEntDLegQuoResponseT->basic = getFutBscEntDLegQuoResponseT(testCaseNum, "futEntDLegQuoResponseT");
	return vfutEntDLegQuoResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntDLegQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntDLegQuoRequestT));
	futEntDLegQuoRequestT *vfutEntDLegQuoRequestT = getFutEntDLegQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntDLegQuoRequestT), (jbyte*) vfutEntDLegQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntDLegQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntDLegQuoResponseT));
	futEntDLegQuoResponseT *vfutEntDLegQuoResponseT = getFutEntDLegQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntDLegQuoResponseT), (jbyte*) vfutEntDLegQuoResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntDLegQuoRequestT(futBscEntDLegQuoRequestT actual, futBscEntDLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoRequestT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoRequestT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoRequestT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoQtyBuy, expected.quoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoRequestT, quoQtyBuy not matching. Actual %s but Expected %s", actual.quoQtyBuy, expected.quoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoQtySel, expected.quoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoRequestT, quoQtySel not matching. Actual %s but Expected %s", actual.quoQtySel, expected.quoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntDLegQuoRequestT(futExtEntDLegQuoRequestT actual, futExtEntDLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegQuoRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntDLegQuoResponseT(futBscEntDLegQuoResponseT actual, futBscEntDLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoResponseT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoResponseT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoResponseT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoResponseT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoResponseT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoResponseT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntDLegQuoRequestT(futEntDLegQuoRequestT actual, futEntDLegQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntDLegQuoRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntDLegQuoRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntDLegQuoResponseT(futEntDLegQuoResponseT actual, futEntDLegQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntDLegQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntDLegQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntDLegQuoRequestT *actualData = (futEntDLegQuoRequestT *)msgStruct;
	futEntDLegQuoRequestT* expectedData = getFutEntDLegQuoRequestT(testCaseNum);
	compareFutEntDLegQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntDLegQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntDLegQuoResponseT *actualData = (futEntDLegQuoResponseT *)msgStruct;
	futEntDLegQuoResponseT* expectedData = getFutEntDLegQuoResponseT(testCaseNum);
	compareFutEntDLegQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
