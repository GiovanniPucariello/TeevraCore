#include <ModDLegOrdr.hxx>
#define BUFFER_SIZE 1000

futModDLegOrdrRequestT *vfutModDLegOrdrRequestT;
futModDLegOrdrResponseT *vfutModDLegOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModDLegOrdrRequestT getFutBscModDLegOrdrRequestT(char* testCaseNum , const char *root) {
	futBscModDLegOrdrRequestT vfutBscModDLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrRequestT.buyCod", lbuyCod);
	vfutBscModDLegOrdrRequestT.buyCod = lbuyCod[0];

	vfutBscModDLegOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModDLegOrdrRequestT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscModDLegOrdrRequestT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrRequestT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscModDLegOrdrRequestT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscModDLegOrdrRequestT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscModDLegOrdrRequestT");
	vfutBscModDLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscModDLegOrdrRequestT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscModDLegOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscModDLegOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModDLegOrdrRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrRequestT.ordrQty", lordrQty);
	memcpy(vfutBscModDLegOrdrRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModDLegOrdrRequestT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrRequestT.ordrTotQty", lordrTotQty);
	memcpy(vfutBscModDLegOrdrRequestT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModDLegOrdrRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrRequestT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscModDLegOrdrRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrRequestT.ordrResCod", lordrResCod);
	vfutBscModDLegOrdrRequestT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscModDLegOrdrRequestT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrRequestT.ordrExpDat", lordrExpDat);
	memcpy(vfutBscModDLegOrdrRequestT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrRequestT.opnClsCod", lopnClsCod);
	vfutBscModDLegOrdrRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModDLegOrdrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModDLegOrdrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModDLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtModDLegOrdrRequestT getFutExtModDLegOrdrRequestT(char* testCaseNum , const char *root) {
	futExtModDLegOrdrRequestT vfutExtModDLegOrdrRequestT;
	int i;

	vfutExtModDLegOrdrRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtModDLegOrdrRequestT");
	vfutExtModDLegOrdrRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtModDLegOrdrRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtModDLegOrdrRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("ModDLegOrdr.futExtModDLegOrdrRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtModDLegOrdrRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	char lprcRsblChkInd[1] = {""};
	getStrProperty("ModDLegOrdr.futExtModDLegOrdrRequestT.prcRsblChkInd", lprcRsblChkInd);
	vfutExtModDLegOrdrRequestT.prcRsblChkInd = lprcRsblChkInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutExtModDLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("ModDLegOrdr.futExtModDLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vfutExtModDLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return vfutExtModDLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModDLegOrdrResponseT getFutBscModDLegOrdrResponseT(char* testCaseNum , const char *root) {
	futBscModDLegOrdrResponseT vfutBscModDLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscModDLegOrdrResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrResponseT.ordrNo", lordrNo);
	memcpy(vfutBscModDLegOrdrResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModDLegOrdrResponseT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrResponseT.ordrExeQty", lordrExeQty);
	memcpy(vfutBscModDLegOrdrResponseT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModDLegOrdrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModDLegOrdr.futBscModDLegOrdrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModDLegOrdrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModDLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtModDLegOrdrResponseT getFutExtModDLegOrdrResponseT(char* testCaseNum , const char *root) {
	futExtModDLegOrdrResponseT vfutExtModDLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtModDLegOrdrResponseT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModDLegOrdr.futExtModDLegOrdrResponseT.ordrBkQty", lordrBkQty);
	memcpy(vfutExtModDLegOrdrResponseT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtModDLegOrdrResponseT.ordrCnclQty[i]= ' ';
	}
	char lordrCnclQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModDLegOrdr.futExtModDLegOrdrResponseT.ordrCnclQty", lordrCnclQty);
	memcpy(vfutExtModDLegOrdrResponseT.ordrCnclQty, lordrCnclQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtModDLegOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModDLegOrdr.futExtModDLegOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutExtModDLegOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtModDLegOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("ModDLegOrdr.futExtModDLegOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutExtModDLegOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutExtModDLegOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("ModDLegOrdr.futExtModDLegOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutExtModDLegOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutExtModDLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModDLegOrdrRequestT* getFutModDLegOrdrRequestT(char* testCaseNum) {
	vfutModDLegOrdrRequestT = (futModDLegOrdrRequestT*)malloc(sizeof(futModDLegOrdrRequestT));
	int i;

	vfutModDLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "futModDLegOrdrRequestT");
	vfutModDLegOrdrRequestT->basic = getFutBscModDLegOrdrRequestT(testCaseNum, "futModDLegOrdrRequestT");
	vfutModDLegOrdrRequestT->extension = getFutExtModDLegOrdrRequestT(testCaseNum, "futModDLegOrdrRequestT");
	return vfutModDLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModDLegOrdrResponseT* getFutModDLegOrdrResponseT(char* testCaseNum) {
	vfutModDLegOrdrResponseT = (futModDLegOrdrResponseT*)malloc(sizeof(futModDLegOrdrResponseT));
	int i;

	vfutModDLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "futModDLegOrdrResponseT");
	vfutModDLegOrdrResponseT->basic = getFutBscModDLegOrdrResponseT(testCaseNum, "futModDLegOrdrResponseT");
	vfutModDLegOrdrResponseT->extension = getFutExtModDLegOrdrResponseT(testCaseNum, "futModDLegOrdrResponseT");
	return vfutModDLegOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModDLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModDLegOrdrRequestT));
	futModDLegOrdrRequestT *vfutModDLegOrdrRequestT = getFutModDLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModDLegOrdrRequestT), (jbyte*) vfutModDLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModDLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModDLegOrdrResponseT));
	futModDLegOrdrResponseT *vfutModDLegOrdrResponseT = getFutModDLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModDLegOrdrResponseT), (jbyte*) vfutModDLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModDLegOrdrRequestT(futBscModDLegOrdrRequestT actual, futBscModDLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrRequestT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrRequestT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrRequestT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrRequestT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtModDLegOrdrRequestT(futExtModDLegOrdrRequestT actual, futExtModDLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModDLegOrdrRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModDLegOrdrRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModDLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModDLegOrdrResponseT(futBscModDLegOrdrResponseT actual, futBscModDLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrResponseT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModDLegOrdrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtModDLegOrdrResponseT(futExtModDLegOrdrResponseT actual, futExtModDLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModDLegOrdrResponseT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCnclQty, expected.ordrCnclQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModDLegOrdrResponseT, ordrCnclQty not matching. Actual %s but Expected %s", actual.ordrCnclQty, expected.ordrCnclQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModDLegOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModDLegOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModDLegOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModDLegOrdrRequestT(futModDLegOrdrRequestT actual, futModDLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModDLegOrdrRequestT (actual.basic,expected.basic, logMsg);	compareFutExtModDLegOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModDLegOrdrResponseT(futModDLegOrdrResponseT actual, futModDLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModDLegOrdrResponseT (actual.basic,expected.basic, logMsg);	compareFutExtModDLegOrdrResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModDLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModDLegOrdrRequestT *actualData = (futModDLegOrdrRequestT *)msgStruct;
	futModDLegOrdrRequestT* expectedData = getFutModDLegOrdrRequestT(testCaseNum);
	compareFutModDLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModDLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModDLegOrdrResponseT *actualData = (futModDLegOrdrResponseT *)msgStruct;
	futModDLegOrdrResponseT* expectedData = getFutModDLegOrdrResponseT(testCaseNum);
	compareFutModDLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
