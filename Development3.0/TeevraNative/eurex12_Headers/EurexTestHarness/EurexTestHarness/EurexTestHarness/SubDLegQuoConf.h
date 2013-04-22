#include <SubDLegQuoConf.hxx>
#define BUFFER_SIZE 1000

futSubDLegQuoConfPrivBcastT *vfutSubDLegQuoConfPrivBcastT;
futBscSubDLegQuoConfSubjectT *vfutBscSubDLegQuoConfSubjectT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubDLegQuoConfPrivBcastT getFutBscSubDLegQuoConfPrivBcastT(char* testCaseNum , const char *root) {
	futBscSubDLegQuoConfPrivBcastT vfutBscSubDLegQuoConfPrivBcastT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.buyCod", lbuyCod);
	vfutBscSubDLegQuoConfPrivBcastT.buyCod = lbuyCod[0];

	vfutBscSubDLegQuoConfPrivBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubDLegQuoConfPrivBcastT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscSubDLegQuoConfPrivBcastT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscSubDLegQuoConfPrivBcastT");
	vfutBscSubDLegQuoConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscSubDLegQuoConfPrivBcastT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.ordrNoBuy", lordrNoBuy);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.ordrNoSel", lordrNoSel);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.quoBkQtySel", lquoBkQtySel);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.quoExeQtySel", lquoExeQtySel);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.quoExePrcSel", lquoExePrcSel);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.quoPrioTimBuy[i]= ' ';
	}
	char lquoPrioTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.quoPrioTimBuy", lquoPrioTimBuy);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.quoPrioTimBuy, lquoPrioTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.quoPrioTimSel[i]= ' ';
	}
	char lquoPrioTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.quoPrioTimSel", lquoPrioTimSel);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.quoPrioTimSel, lquoPrioTimSel, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.quoPrioDatBuy[i]= ' ';
	}
	char lquoPrioDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.quoPrioDatBuy", lquoPrioDatBuy);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.quoPrioDatBuy, lquoPrioDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.quoPrioDatSel[i]= ' ';
	}
	char lquoPrioDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.quoPrioDatSel", lquoPrioDatSel);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.quoPrioDatSel, lquoPrioDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.lstEvntDatBuy[i]= ' ';
	}
	char llstEvntDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.lstEvntDatBuy", llstEvntDatBuy);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.lstEvntDatBuy, llstEvntDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.lstEvntTimBuy[i]= ' ';
	}
	char llstEvntTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.lstEvntTimBuy", llstEvntTimBuy);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.lstEvntTimBuy, llstEvntTimBuy, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.lstEvntTrnIdBuy[i]= ' ';
	}
	char llstEvntTrnIdBuy[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.lstEvntTrnIdBuy", llstEvntTrnIdBuy);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.lstEvntTrnIdBuy, llstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.lstEvntDatSel[i]= ' ';
	}
	char llstEvntDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.lstEvntDatSel", llstEvntDatSel);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.lstEvntDatSel, llstEvntDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.lstEvntTimSel[i]= ' ';
	}
	char llstEvntTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.lstEvntTimSel", llstEvntTimSel);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.lstEvntTimSel, llstEvntTimSel, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscSubDLegQuoConfPrivBcastT.lstEvntTrnIdSel[i]= ' ';
	}
	char llstEvntTrnIdSel[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.lstEvntTrnIdSel", llstEvntTrnIdSel);
	memcpy(vfutBscSubDLegQuoConfPrivBcastT.lstEvntTrnIdSel, llstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN);

	char ltrnTypId[1] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfPrivBcastT.trnTypId", ltrnTypId);
	vfutBscSubDLegQuoConfPrivBcastT.trnTypId = ltrnTypId[0];
	return vfutBscSubDLegQuoConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtSubDLegQuoConfPrivBcastT getFutExtSubDLegQuoConfPrivBcastT(char* testCaseNum , const char *root) {
	futExtSubDLegQuoConfPrivBcastT vfutExtSubDLegQuoConfPrivBcastT;
	int i;

	vfutExtSubDLegQuoConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtSubDLegQuoConfPrivBcastT");	return vfutExtSubDLegQuoConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futSubDLegQuoConfPrivBcastT* getFutSubDLegQuoConfPrivBcastT(char* testCaseNum) {
	vfutSubDLegQuoConfPrivBcastT = (futSubDLegQuoConfPrivBcastT*)malloc(sizeof(futSubDLegQuoConfPrivBcastT));
	int i;

	vfutSubDLegQuoConfPrivBcastT->header = getDataHeaderT(testCaseNum, "futSubDLegQuoConfPrivBcastT");
	vfutSubDLegQuoConfPrivBcastT->basic = getFutBscSubDLegQuoConfPrivBcastT(testCaseNum, "futSubDLegQuoConfPrivBcastT");
	vfutSubDLegQuoConfPrivBcastT->extension = getFutExtSubDLegQuoConfPrivBcastT(testCaseNum, "futSubDLegQuoConfPrivBcastT");
	return vfutSubDLegQuoConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futBscSubDLegQuoConfSubjectT* getFutBscSubDLegQuoConfSubjectT(char* testCaseNum) {
	vfutBscSubDLegQuoConfSubjectT = (futBscSubDLegQuoConfSubjectT*)malloc(sizeof(futBscSubDLegQuoConfSubjectT));
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vfutBscSubDLegQuoConfSubjectT->membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfSubjectT.membId", lmembId);
	memcpy(vfutBscSubDLegQuoConfSubjectT->membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscSubDLegQuoConfSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubDLegQuoConf.futBscSubDLegQuoConfSubjectT.prodId", lprodId);
	memcpy(vfutBscSubDLegQuoConfSubjectT->prodId, lprodId, PROD_ID_LEN);

	return vfutBscSubDLegQuoConfSubjectT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutSubDLegQuoConfPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futSubDLegQuoConfPrivBcastT));
	futSubDLegQuoConfPrivBcastT *vfutSubDLegQuoConfPrivBcastT = getFutSubDLegQuoConfPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futSubDLegQuoConfPrivBcastT), (jbyte*) vfutSubDLegQuoConfPrivBcastT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutBscSubDLegQuoConfSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futBscSubDLegQuoConfSubjectT));
	futBscSubDLegQuoConfSubjectT *vfutBscSubDLegQuoConfSubjectT = getFutBscSubDLegQuoConfSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futBscSubDLegQuoConfSubjectT), (jbyte*) vfutBscSubDLegQuoConfSubjectT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubDLegQuoConfPrivBcastT(futBscSubDLegQuoConfPrivBcastT actual, futBscSubDLegQuoConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimBuy, expected.quoPrioTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, quoPrioTimBuy not matching. Actual %s but Expected %s", actual.quoPrioTimBuy, expected.quoPrioTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimSel, expected.quoPrioTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, quoPrioTimSel not matching. Actual %s but Expected %s", actual.quoPrioTimSel, expected.quoPrioTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatBuy, expected.quoPrioDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, quoPrioDatBuy not matching. Actual %s but Expected %s", actual.quoPrioDatBuy, expected.quoPrioDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatSel, expected.quoPrioDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, quoPrioDatSel not matching. Actual %s but Expected %s", actual.quoPrioDatSel, expected.quoPrioDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatBuy, expected.lstEvntDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, lstEvntDatBuy not matching. Actual %s but Expected %s", actual.lstEvntDatBuy, expected.lstEvntDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimBuy, expected.lstEvntTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, lstEvntTimBuy not matching. Actual %s but Expected %s", actual.lstEvntTimBuy, expected.lstEvntTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, lstEvntTrnIdBuy not matching. Actual %s but Expected %s", actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatSel, expected.lstEvntDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, lstEvntDatSel not matching. Actual %s but Expected %s", actual.lstEvntDatSel, expected.lstEvntDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimSel, expected.lstEvntTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, lstEvntTimSel not matching. Actual %s but Expected %s", actual.lstEvntTimSel, expected.lstEvntTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, lstEvntTrnIdSel not matching. Actual %s but Expected %s", actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnTypId!= expected.trnTypId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfPrivBcastT, trnTypIdnot matching. Actual %d but Expected %d", actual.trnTypId, expected.trnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtSubDLegQuoConfPrivBcastT(futExtSubDLegQuoConfPrivBcastT actual, futExtSubDLegQuoConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutSubDLegQuoConfPrivBcastT(futSubDLegQuoConfPrivBcastT actual, futSubDLegQuoConfPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscSubDLegQuoConfPrivBcastT (actual.basic,expected.basic, logMsg);	compareFutExtSubDLegQuoConfPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutBscSubDLegQuoConfSubjectT(futBscSubDLegQuoConfSubjectT actual, futBscSubDLegQuoConfSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.membId!= expected.membId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfSubjectT, membIdnot matching. Actual %d but Expected %d", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegQuoConfSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutSubDLegQuoConfPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futSubDLegQuoConfPrivBcastT *actualData = (futSubDLegQuoConfPrivBcastT *)msgStruct;
	futSubDLegQuoConfPrivBcastT* expectedData = getFutSubDLegQuoConfPrivBcastT(testCaseNum);
	compareFutSubDLegQuoConfPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutBscSubDLegQuoConfSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futBscSubDLegQuoConfSubjectT *actualData = (futBscSubDLegQuoConfSubjectT *)msgStruct;
	futBscSubDLegQuoConfSubjectT* expectedData = getFutBscSubDLegQuoConfSubjectT(testCaseNum);
	compareFutBscSubDLegQuoConfSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
