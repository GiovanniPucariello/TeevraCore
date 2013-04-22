#include <EntDLegQuoReq.hxx>
#define BUFFER_SIZE 1000

futEntDLegQuoReqRequestT *vfutEntDLegQuoReqRequestT;
futEntDLegQuoReqResponseT *vfutEntDLegQuoReqResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntDLegQuoReqRequestT getFutBscEntDLegQuoReqRequestT(char* testCaseNum , const char *root) {
	futBscEntDLegQuoReqRequestT vfutBscEntDLegQuoReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntDLegQuoReq.futBscEntDLegQuoReqRequestT.buyCod", lbuyCod);
	vfutBscEntDLegQuoReqRequestT.buyCod = lbuyCod[0];

	vfutBscEntDLegQuoReqRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntDLegQuoReqRequestT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscEntDLegQuoReqRequestT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("EntDLegQuoReq.futBscEntDLegQuoReqRequestT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscEntDLegQuoReqRequestT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscEntDLegQuoReqRequestT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscEntDLegQuoReqRequestT");
	vfutBscEntDLegQuoReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntDLegQuoReqRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntDLegQuoReqRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegQuoReq.futBscEntDLegQuoReqRequestT.ordrQty", lordrQty);
	memcpy(vfutBscEntDLegQuoReqRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);
	return vfutBscEntDLegQuoReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntDLegQuoReqRequestT* getFutEntDLegQuoReqRequestT(char* testCaseNum) {
	vfutEntDLegQuoReqRequestT = (futEntDLegQuoReqRequestT*)malloc(sizeof(futEntDLegQuoReqRequestT));
	int i;

	vfutEntDLegQuoReqRequestT->header = getDataHeaderT(testCaseNum, "futEntDLegQuoReqRequestT");
	vfutEntDLegQuoReqRequestT->basic = getFutBscEntDLegQuoReqRequestT(testCaseNum, "futEntDLegQuoReqRequestT");
	return vfutEntDLegQuoReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntDLegQuoReqResponseT* getFutEntDLegQuoReqResponseT(char* testCaseNum) {
	vfutEntDLegQuoReqResponseT = (futEntDLegQuoReqResponseT*)malloc(sizeof(futEntDLegQuoReqResponseT));
	int i;

	vfutEntDLegQuoReqResponseT->header = getDataHeaderT(testCaseNum, "futEntDLegQuoReqResponseT");
	return vfutEntDLegQuoReqResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntDLegQuoReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntDLegQuoReqRequestT));
	futEntDLegQuoReqRequestT *vfutEntDLegQuoReqRequestT = getFutEntDLegQuoReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntDLegQuoReqRequestT), (jbyte*) vfutEntDLegQuoReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntDLegQuoReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntDLegQuoReqResponseT));
	futEntDLegQuoReqResponseT *vfutEntDLegQuoReqResponseT = getFutEntDLegQuoReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntDLegQuoReqResponseT), (jbyte*) vfutEntDLegQuoReqResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntDLegQuoReqRequestT(futBscEntDLegQuoReqRequestT actual, futBscEntDLegQuoReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoReqRequestT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegQuoReqRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntDLegQuoReqRequestT(futEntDLegQuoReqRequestT actual, futEntDLegQuoReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntDLegQuoReqRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntDLegQuoReqResponseT(futEntDLegQuoReqResponseT actual, futEntDLegQuoReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntDLegQuoReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntDLegQuoReqRequestT *actualData = (futEntDLegQuoReqRequestT *)msgStruct;
	futEntDLegQuoReqRequestT* expectedData = getFutEntDLegQuoReqRequestT(testCaseNum);
	compareFutEntDLegQuoReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntDLegQuoReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntDLegQuoReqResponseT *actualData = (futEntDLegQuoReqResponseT *)msgStruct;
	futEntDLegQuoReqResponseT* expectedData = getFutEntDLegQuoReqResponseT(testCaseNum);
	compareFutEntDLegQuoReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
