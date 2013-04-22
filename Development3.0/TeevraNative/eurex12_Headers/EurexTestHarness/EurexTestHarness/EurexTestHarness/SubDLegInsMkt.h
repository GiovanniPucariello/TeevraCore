#include <SubDLegInsMkt.hxx>
#define BUFFER_SIZE 1000

futBscSubDLegInsMktSubjectT *vfutBscSubDLegInsMktSubjectT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubDLegInsMktPubBcastT getFutBscSubDLegInsMktPubBcastT(char* testCaseNum , const char *root) {
	futBscSubDLegInsMktPubBcastT vfutBscSubDLegInsMktPubBcastT;
	int i;

	vfutBscSubDLegInsMktPubBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubDLegInsMktPubBcastT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscSubDLegInsMktPubBcastT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futBscSubDLegInsMktPubBcastT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscSubDLegInsMktPubBcastT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscSubDLegInsMktPubBcastT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscSubDLegInsMktPubBcastT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubDLegInsMktPubBcastT.dblLegBstBidPrc[i]= ' ';
	}
	char ldblLegBstBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futBscSubDLegInsMktPubBcastT.dblLegBstBidPrc", ldblLegBstBidPrc);
	memcpy(vfutBscSubDLegInsMktPubBcastT.dblLegBstBidPrc, ldblLegBstBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscSubDLegInsMktPubBcastT.dblLegBstBidQty[i]= ' ';
	}
	char ldblLegBstBidQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futBscSubDLegInsMktPubBcastT.dblLegBstBidQty", ldblLegBstBidQty);
	memcpy(vfutBscSubDLegInsMktPubBcastT.dblLegBstBidQty, ldblLegBstBidQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubDLegInsMktPubBcastT.dblLegBstAskPrc[i]= ' ';
	}
	char ldblLegBstAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futBscSubDLegInsMktPubBcastT.dblLegBstAskPrc", ldblLegBstAskPrc);
	memcpy(vfutBscSubDLegInsMktPubBcastT.dblLegBstAskPrc, ldblLegBstAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscSubDLegInsMktPubBcastT.dblLegBstAskQty[i]= ' ';
	}
	char ldblLegBstAskQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futBscSubDLegInsMktPubBcastT.dblLegBstAskQty", ldblLegBstAskQty);
	memcpy(vfutBscSubDLegInsMktPubBcastT.dblLegBstAskQty, ldblLegBstAskQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscSubDLegInsMktPubBcastT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futBscSubDLegInsMktPubBcastT.totTrdQty", ltotTrdQty);
	memcpy(vfutBscSubDLegInsMktPubBcastT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);
	return vfutBscSubDLegInsMktPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtSubDLegInsMktPubBcastT getFutExtSubDLegInsMktPubBcastT(char* testCaseNum , const char *root) {
	futExtSubDLegInsMktPubBcastT vfutExtSubDLegInsMktPubBcastT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtSubDLegInsMktPubBcastT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futExtSubDLegInsMktPubBcastT.dlyHghPrc", ldlyHghPrc);
	memcpy(vfutExtSubDLegInsMktPubBcastT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtSubDLegInsMktPubBcastT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futExtSubDLegInsMktPubBcastT.dlyLowPrc", ldlyLowPrc);
	memcpy(vfutExtSubDLegInsMktPubBcastT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtSubDLegInsMktPubBcastT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futExtSubDLegInsMktPubBcastT.lstTrdPrc", llstTrdPrc);
	memcpy(vfutExtSubDLegInsMktPubBcastT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtSubDLegInsMktPubBcastT.lstTrdQty[i]= ' ';
	}
	char llstTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futExtSubDLegInsMktPubBcastT.lstTrdQty", llstTrdQty);
	memcpy(vfutExtSubDLegInsMktPubBcastT.lstTrdQty, llstTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtSubDLegInsMktPubBcastT.trdTim[i]= ' ';
	}
	char ltrdTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futExtSubDLegInsMktPubBcastT.trdTim", ltrdTim);
	memcpy(vfutExtSubDLegInsMktPubBcastT.trdTim, ltrdTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubDLegInsMktPubBcastT.qrAskQty[i]= ' ';
	}
	char lqrAskQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futExtSubDLegInsMktPubBcastT.qrAskQty", lqrAskQty);
	memcpy(vfutExtSubDLegInsMktPubBcastT.qrAskQty, lqrAskQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubDLegInsMktPubBcastT.qrBidQty[i]= ' ';
	}
	char lqrBidQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futExtSubDLegInsMktPubBcastT.qrBidQty", lqrBidQty);
	memcpy(vfutExtSubDLegInsMktPubBcastT.qrBidQty, lqrBidQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubDLegInsMktPubBcastT.crAskQty[i]= ' ';
	}
	char lcrAskQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futExtSubDLegInsMktPubBcastT.crAskQty", lcrAskQty);
	memcpy(vfutExtSubDLegInsMktPubBcastT.crAskQty, lcrAskQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubDLegInsMktPubBcastT.crBidQty[i]= ' ';
	}
	char lcrBidQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futExtSubDLegInsMktPubBcastT.crBidQty", lcrBidQty);
	memcpy(vfutExtSubDLegInsMktPubBcastT.crBidQty, lcrBidQty, DRIV_VOLUME_LEN);
	return vfutExtSubDLegInsMktPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futSubDLegInsMktPubBcastT getFutSubDLegInsMktPubBcastT(char* testCaseNum , const char *root) {
	futSubDLegInsMktPubBcastT vfutSubDLegInsMktPubBcastT;
	int i;

	vfutSubDLegInsMktPubBcastT.header = getDataHeaderT(testCaseNum, "futSubDLegInsMktPubBcastT");
	vfutSubDLegInsMktPubBcastT.basic = getFutBscSubDLegInsMktPubBcastT(testCaseNum, "futSubDLegInsMktPubBcastT");
	vfutSubDLegInsMktPubBcastT.extension = getFutExtSubDLegInsMktPubBcastT(testCaseNum, "futSubDLegInsMktPubBcastT");	return vfutSubDLegInsMktPubBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futBscSubDLegInsMktSubjectT* getFutBscSubDLegInsMktSubjectT(char* testCaseNum) {
	vfutBscSubDLegInsMktSubjectT = (futBscSubDLegInsMktSubjectT*)malloc(sizeof(futBscSubDLegInsMktSubjectT));
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscSubDLegInsMktSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubDLegInsMkt.futBscSubDLegInsMktSubjectT.prodId", lprodId);
	memcpy(vfutBscSubDLegInsMktSubjectT->prodId, lprodId, PROD_ID_LEN);

	return vfutBscSubDLegInsMktSubjectT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutBscSubDLegInsMktSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futBscSubDLegInsMktSubjectT));
	futBscSubDLegInsMktSubjectT *vfutBscSubDLegInsMktSubjectT = getFutBscSubDLegInsMktSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futBscSubDLegInsMktSubjectT), (jbyte*) vfutBscSubDLegInsMktSubjectT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubDLegInsMktPubBcastT(futBscSubDLegInsMktPubBcastT actual, futBscSubDLegInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegInsMktPubBcastT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	if ( memcmp(actual.dblLegBstBidPrc, expected.dblLegBstBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegInsMktPubBcastT, dblLegBstBidPrc not matching. Actual %s but Expected %s", actual.dblLegBstBidPrc, expected.dblLegBstBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dblLegBstBidQty, expected.dblLegBstBidQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegInsMktPubBcastT, dblLegBstBidQty not matching. Actual %s but Expected %s", actual.dblLegBstBidQty, expected.dblLegBstBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dblLegBstAskPrc, expected.dblLegBstAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegInsMktPubBcastT, dblLegBstAskPrc not matching. Actual %s but Expected %s", actual.dblLegBstAskPrc, expected.dblLegBstAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dblLegBstAskQty, expected.dblLegBstAskQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegInsMktPubBcastT, dblLegBstAskQty not matching. Actual %s but Expected %s", actual.dblLegBstAskQty, expected.dblLegBstAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegInsMktPubBcastT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtSubDLegInsMktPubBcastT(futExtSubDLegInsMktPubBcastT actual, futExtSubDLegInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegInsMktPubBcastT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegInsMktPubBcastT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegInsMktPubBcastT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdQty, expected.lstTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegInsMktPubBcastT, lstTrdQty not matching. Actual %s but Expected %s", actual.lstTrdQty, expected.lstTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdTim, expected.trdTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegInsMktPubBcastT, trdTim not matching. Actual %s but Expected %s", actual.trdTim, expected.trdTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.qrAskQty, expected.qrAskQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegInsMktPubBcastT, qrAskQty not matching. Actual %s but Expected %s", actual.qrAskQty, expected.qrAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.qrBidQty, expected.qrBidQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegInsMktPubBcastT, qrBidQty not matching. Actual %s but Expected %s", actual.qrBidQty, expected.qrBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crAskQty, expected.crAskQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegInsMktPubBcastT, crAskQty not matching. Actual %s but Expected %s", actual.crAskQty, expected.crAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crBidQty, expected.crBidQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegInsMktPubBcastT, crBidQty not matching. Actual %s but Expected %s", actual.crBidQty, expected.crBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutSubDLegInsMktPubBcastT(futSubDLegInsMktPubBcastT actual, futSubDLegInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscSubDLegInsMktPubBcastT (actual.basic,expected.basic, logMsg);
	compareFutExtSubDLegInsMktPubBcastT (actual.extension,expected.extension, logMsg);
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutBscSubDLegInsMktSubjectT(futBscSubDLegInsMktSubjectT actual, futBscSubDLegInsMktSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegInsMktSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutBscSubDLegInsMktSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futBscSubDLegInsMktSubjectT *actualData = (futBscSubDLegInsMktSubjectT *)msgStruct;
	futBscSubDLegInsMktSubjectT* expectedData = getFutBscSubDLegInsMktSubjectT(testCaseNum);
	compareFutBscSubDLegInsMktSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
