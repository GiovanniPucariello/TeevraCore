#include <EntDLegCrsReq.hxx>
#define BUFFER_SIZE 1000

futEntDLegCrsReqRequestT *vfutEntDLegCrsReqRequestT;
futEntDLegCrsReqResponseT *vfutEntDLegCrsReqResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntDLegCrsReqRequestT getFutBscEntDLegCrsReqRequestT(char* testCaseNum , const char *root) {
	futBscEntDLegCrsReqRequestT vfutBscEntDLegCrsReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntDLegCrsReq.futBscEntDLegCrsReqRequestT.buyCod", lbuyCod);
	vfutBscEntDLegCrsReqRequestT.buyCod = lbuyCod[0];

	vfutBscEntDLegCrsReqRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntDLegCrsReqRequestT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscEntDLegCrsReqRequestT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("EntDLegCrsReq.futBscEntDLegCrsReqRequestT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscEntDLegCrsReqRequestT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscEntDLegCrsReqRequestT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscEntDLegCrsReqRequestT");
	vfutBscEntDLegCrsReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntDLegCrsReqRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntDLegCrsReqRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntDLegCrsReq.futBscEntDLegCrsReqRequestT.ordrQty", lordrQty);
	memcpy(vfutBscEntDLegCrsReqRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);
	return vfutBscEntDLegCrsReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntDLegCrsReqRequestT* getFutEntDLegCrsReqRequestT(char* testCaseNum) {
	vfutEntDLegCrsReqRequestT = (futEntDLegCrsReqRequestT*)malloc(sizeof(futEntDLegCrsReqRequestT));
	int i;

	vfutEntDLegCrsReqRequestT->header = getDataHeaderT(testCaseNum, "futEntDLegCrsReqRequestT");
	vfutEntDLegCrsReqRequestT->basic = getFutBscEntDLegCrsReqRequestT(testCaseNum, "futEntDLegCrsReqRequestT");
	return vfutEntDLegCrsReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntDLegCrsReqResponseT* getFutEntDLegCrsReqResponseT(char* testCaseNum) {
	vfutEntDLegCrsReqResponseT = (futEntDLegCrsReqResponseT*)malloc(sizeof(futEntDLegCrsReqResponseT));
	int i;

	vfutEntDLegCrsReqResponseT->header = getDataHeaderT(testCaseNum, "futEntDLegCrsReqResponseT");
	return vfutEntDLegCrsReqResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntDLegCrsReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntDLegCrsReqRequestT));
	futEntDLegCrsReqRequestT *vfutEntDLegCrsReqRequestT = getFutEntDLegCrsReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntDLegCrsReqRequestT), (jbyte*) vfutEntDLegCrsReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntDLegCrsReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntDLegCrsReqResponseT));
	futEntDLegCrsReqResponseT *vfutEntDLegCrsReqResponseT = getFutEntDLegCrsReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntDLegCrsReqResponseT), (jbyte*) vfutEntDLegCrsReqResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntDLegCrsReqRequestT(futBscEntDLegCrsReqRequestT actual, futBscEntDLegCrsReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegCrsReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegCrsReqRequestT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntDLegCrsReqRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntDLegCrsReqRequestT(futEntDLegCrsReqRequestT actual, futEntDLegCrsReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntDLegCrsReqRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntDLegCrsReqResponseT(futEntDLegCrsReqResponseT actual, futEntDLegCrsReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutEntDLegCrsReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntDLegCrsReqRequestT *actualData = (futEntDLegCrsReqRequestT *)msgStruct;
	futEntDLegCrsReqRequestT* expectedData = getFutEntDLegCrsReqRequestT(testCaseNum);
	compareFutEntDLegCrsReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntDLegCrsReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntDLegCrsReqResponseT *actualData = (futEntDLegCrsReqResponseT *)msgStruct;
	futEntDLegCrsReqResponseT* expectedData = getFutEntDLegCrsReqResponseT(testCaseNum);
	compareFutEntDLegCrsReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
