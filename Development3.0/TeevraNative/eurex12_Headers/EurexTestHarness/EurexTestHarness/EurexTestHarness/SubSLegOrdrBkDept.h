#include <SubSLegOrdrBkDept.hxx>
#define BUFFER_SIZE 1000

futBscSubSLegOrdrBkDeptSubjectT *vfutBscSubSLegOrdrBkDeptSubjectT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubSLegOrdrBkDeptPubBcastT getFutBscSubSLegOrdrBkDeptPubBcastT(char* testCaseNum , const char *root) {
	futBscSubSLegOrdrBkDeptPubBcastT vfutBscSubSLegOrdrBkDeptPubBcastT;
	int i;
	return vfutBscSubSLegOrdrBkDeptPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futSubSLegOrdrBkDeptPubBcastT getFutSubSLegOrdrBkDeptPubBcastT(char* testCaseNum , const char *root) {
	futSubSLegOrdrBkDeptPubBcastT vfutSubSLegOrdrBkDeptPubBcastT;
	int i;

	vfutSubSLegOrdrBkDeptPubBcastT.header = getDataHeaderT(testCaseNum, "futSubSLegOrdrBkDeptPubBcastT");
	vfutSubSLegOrdrBkDeptPubBcastT.basic = getFutBscSubSLegOrdrBkDeptPubBcastT(testCaseNum, "futSubSLegOrdrBkDeptPubBcastT");	return vfutSubSLegOrdrBkDeptPubBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futBscSubSLegOrdrBkDeptSubjectT* getFutBscSubSLegOrdrBkDeptSubjectT(char* testCaseNum) {
	vfutBscSubSLegOrdrBkDeptSubjectT = (futBscSubSLegOrdrBkDeptSubjectT*)malloc(sizeof(futBscSubSLegOrdrBkDeptSubjectT));
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscSubSLegOrdrBkDeptSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrBkDept.futBscSubSLegOrdrBkDeptSubjectT.prodId", lprodId);
	memcpy(vfutBscSubSLegOrdrBkDeptSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutBscSubSLegOrdrBkDeptSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubSLegOrdrBkDept.futBscSubSLegOrdrBkDeptSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutBscSubSLegOrdrBkDeptSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutBscSubSLegOrdrBkDeptSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubSLegOrdrBkDept.futBscSubSLegOrdrBkDeptSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutBscSubSLegOrdrBkDeptSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<SUBJ_FILL_LEN;i++) {
		vfutBscSubSLegOrdrBkDeptSubjectT->subjFill[i]= ' ';
	}
	char lsubjFill[SUBJ_FILL_LEN] = {""};
	getStrProperty("SubSLegOrdrBkDept.futBscSubSLegOrdrBkDeptSubjectT.subjFill", lsubjFill);
	memcpy(vfutBscSubSLegOrdrBkDeptSubjectT->subjFill, lsubjFill, SUBJ_FILL_LEN);

	return vfutBscSubSLegOrdrBkDeptSubjectT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutBscSubSLegOrdrBkDeptSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futBscSubSLegOrdrBkDeptSubjectT));
	futBscSubSLegOrdrBkDeptSubjectT *vfutBscSubSLegOrdrBkDeptSubjectT = getFutBscSubSLegOrdrBkDeptSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futBscSubSLegOrdrBkDeptSubjectT), (jbyte*) vfutBscSubSLegOrdrBkDeptSubjectT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubSLegOrdrBkDeptPubBcastT(futBscSubSLegOrdrBkDeptPubBcastT actual, futBscSubSLegOrdrBkDeptPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BST_ORDR_GRP_MAX;i++) {
		compareBstOrdrGrpT (actual.bstOrdrGrp[i],expected.bstOrdrGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutSubSLegOrdrBkDeptPubBcastT(futSubSLegOrdrBkDeptPubBcastT actual, futSubSLegOrdrBkDeptPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscSubSLegOrdrBkDeptPubBcastT (actual.basic,expected.basic, logMsg);
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutBscSubSLegOrdrBkDeptSubjectT(futBscSubSLegOrdrBkDeptSubjectT actual, futBscSubSLegOrdrBkDeptSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrBkDeptSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrBkDeptSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrBkDeptSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.subjFill!= expected.subjFill) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrBkDeptSubjectT, subjFillnot matching. Actual %d but Expected %d", actual.subjFill, expected.subjFill);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutBscSubSLegOrdrBkDeptSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futBscSubSLegOrdrBkDeptSubjectT *actualData = (futBscSubSLegOrdrBkDeptSubjectT *)msgStruct;
	futBscSubSLegOrdrBkDeptSubjectT* expectedData = getFutBscSubSLegOrdrBkDeptSubjectT(testCaseNum);
	compareFutBscSubSLegOrdrBkDeptSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
