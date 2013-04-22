#include <EntDLegOrdr.hxx>
#define BUFFER_SIZE 1000

futEntDLegOrdrRequestT *vfutEntDLegOrdrRequestT;
futEntDLegOrdrResponseT *vfutEntDLegOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntDLegOrdrRequestT getFutBscEntDLegOrdrRequestT(char* testCaseNum , const char *root) {
	futBscEntDLegOrdrRequestT vfutBscEntDLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntDLegOrdr.futBscEntDLegOrdrRequestT.buyCod", lbuyCod);
	vfutBscEntDLegOrdrRequestT.buyCod = lbuyCod[0];

	vfutBscEntDLegOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntDLegOrdrRequestT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscEntDLegOrdrRequestT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("EntDLegOrdr.futBscEntDLegOrdrRequestT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscEntDLegOrdrRequestT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscEntDLegOrdrRequestT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscEntDLegOrdrRequestT");
	vfutBscEntDLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntDLegOrdrRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntDLegOrdrRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegOrdr.futBscEntDLegOrdrRequestT.ordrQty", lordrQty);
	memcpy(vfutBscEntDLegOrdrRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntDLegOrdrRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntDLegOrdr.futBscEntDLegOrdrRequestT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscEntDLegOrdrRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("EntDLegOrdr.futBscEntDLegOrdrRequestT.ordrResCod", lordrResCod);
	vfutBscEntDLegOrdrRequestT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntDLegOrdrRequestT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntDLegOrdr.futBscEntDLegOrdrRequestT.ordrExpDat", lordrExpDat);
	memcpy(vfutBscEntDLegOrdrRequestT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntDLegOrdr.futBscEntDLegOrdrRequestT.opnClsCod", lopnClsCod);
	vfutBscEntDLegOrdrRequestT.opnClsCod = lopnClsCod[0];
	return vfutBscEntDLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntDLegOrdrRequestT getFutExtEntDLegOrdrRequestT(char* testCaseNum , const char *root) {
	futExtEntDLegOrdrRequestT vfutExtEntDLegOrdrRequestT;
	int i;

	vfutExtEntDLegOrdrRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtEntDLegOrdrRequestT");
	vfutExtEntDLegOrdrRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtEntDLegOrdrRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtEntDLegOrdrRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtEntDLegOrdrRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	char lprcRsblChkInd[1] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrRequestT.prcRsblChkInd", lprcRsblChkInd);
	vfutExtEntDLegOrdrRequestT.prcRsblChkInd = lprcRsblChkInd[0];

	char lordrPersInd[1] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrRequestT.ordrPersInd", lordrPersInd);
	vfutExtEntDLegOrdrRequestT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutExtEntDLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vfutExtEntDLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		vfutExtEntDLegOrdrRequestT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrRequestT.etsSesId", letsSesId);
	memcpy(vfutExtEntDLegOrdrRequestT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return vfutExtEntDLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntDLegOrdrResponseT getFutBscEntDLegOrdrResponseT(char* testCaseNum , const char *root) {
	futBscEntDLegOrdrResponseT vfutBscEntDLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntDLegOrdrResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntDLegOrdr.futBscEntDLegOrdrResponseT.ordrNo", lordrNo);
	memcpy(vfutBscEntDLegOrdrResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntDLegOrdrResponseT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegOrdr.futBscEntDLegOrdrResponseT.ordrExeQty", lordrExeQty);
	memcpy(vfutBscEntDLegOrdrResponseT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntDLegOrdrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntDLegOrdr.futBscEntDLegOrdrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntDLegOrdrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntDLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntDLegOrdrResponseT getFutExtEntDLegOrdrResponseT(char* testCaseNum , const char *root) {
	futExtEntDLegOrdrResponseT vfutExtEntDLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtEntDLegOrdrResponseT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrResponseT.ordrBkQty", lordrBkQty);
	memcpy(vfutExtEntDLegOrdrResponseT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtEntDLegOrdrResponseT.ordrCnclQty[i]= ' ';
	}
	char lordrCnclQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrResponseT.ordrCnclQty", lordrCnclQty);
	memcpy(vfutExtEntDLegOrdrResponseT.ordrCnclQty, lordrCnclQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtEntDLegOrdrResponseT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrResponseT.ordrCreDat", lordrCreDat);
	memcpy(vfutExtEntDLegOrdrResponseT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtEntDLegOrdrResponseT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrResponseT.ordrCreTim", lordrCreTim);
	memcpy(vfutExtEntDLegOrdrResponseT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtEntDLegOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutExtEntDLegOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtEntDLegOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutExtEntDLegOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutExtEntDLegOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("EntDLegOrdr.futExtEntDLegOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutExtEntDLegOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutExtEntDLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntDLegOrdrRequestT* getFutEntDLegOrdrRequestT(char* testCaseNum) {
	vfutEntDLegOrdrRequestT = (futEntDLegOrdrRequestT*)malloc(sizeof(futEntDLegOrdrRequestT));
	int i;

	vfutEntDLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "futEntDLegOrdrRequestT");
	vfutEntDLegOrdrRequestT->basic = getFutBscEntDLegOrdrRequestT(testCaseNum, "futEntDLegOrdrRequestT");
	vfutEntDLegOrdrRequestT->extension = getFutExtEntDLegOrdrRequestT(testCaseNum, "futEntDLegOrdrRequestT");
	return vfutEntDLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntDLegOrdrResponseT* getFutEntDLegOrdrResponseT(char* testCaseNum) {
	vfutEntDLegOrdrResponseT = (futEntDLegOrdrResponseT*)malloc(sizeof(futEntDLegOrdrResponseT));
	int i;

	vfutEntDLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "futEntDLegOrdrResponseT");
	vfutEntDLegOrdrResponseT->basic = getFutBscEntDLegOrdrResponseT(testCaseNum, "futEntDLegOrdrResponseT");
	vfutEntDLegOrdrResponseT->extension = getFutExtEntDLegOrdrResponseT(testCaseNum, "futEntDLegOrdrResponseT");
	return vfutEntDLegOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntDLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntDLegOrdrRequestT));
	futEntDLegOrdrRequestT *vfutEntDLegOrdrRequestT = getFutEntDLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntDLegOrdrRequestT), (jbyte*) vfutEntDLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntDLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntDLegOrdrResponseT));
	futEntDLegOrdrResponseT *vfutEntDLegOrdrResponseT = getFutEntDLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntDLegOrdrResponseT), (jbyte*) vfutEntDLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntDLegOrdrRequestT(futBscEntDLegOrdrRequestT actual, futBscEntDLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegOrdrRequestT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegOrdrRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegOrdrRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegOrdrRequestT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegOrdrRequestT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntDLegOrdrRequestT(futExtEntDLegOrdrRequestT actual, futExtEntDLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrRequestT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrRequestT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntDLegOrdrResponseT(futBscEntDLegOrdrResponseT actual, futBscEntDLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegOrdrResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegOrdrResponseT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegOrdrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntDLegOrdrResponseT(futExtEntDLegOrdrResponseT actual, futExtEntDLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrResponseT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCnclQty, expected.ordrCnclQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrResponseT, ordrCnclQty not matching. Actual %s but Expected %s", actual.ordrCnclQty, expected.ordrCnclQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrResponseT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrResponseT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntDLegOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntDLegOrdrRequestT(futEntDLegOrdrRequestT actual, futEntDLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntDLegOrdrRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntDLegOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntDLegOrdrResponseT(futEntDLegOrdrResponseT actual, futEntDLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntDLegOrdrResponseT (actual.basic,expected.basic, logMsg);	compareFutExtEntDLegOrdrResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntDLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntDLegOrdrRequestT *actualData = (futEntDLegOrdrRequestT *)msgStruct;
	futEntDLegOrdrRequestT* expectedData = getFutEntDLegOrdrRequestT(testCaseNum);
	compareFutEntDLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntDLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntDLegOrdrResponseT *actualData = (futEntDLegOrdrResponseT *)msgStruct;
	futEntDLegOrdrResponseT* expectedData = getFutEntDLegOrdrResponseT(testCaseNum);
	compareFutEntDLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
