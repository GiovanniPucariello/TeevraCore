#include <SubStratMtchEvnt.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubStratMtchEvntBcastT getBscSubStratMtchEvntBcastT(char* testCaseNum , const char *root) {
	bscSubStratMtchEvntBcastT vbscSubStratMtchEvntBcastT;
	int i;

	vbscSubStratMtchEvntBcastT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscSubStratMtchEvntBcastT");
	vbscSubStratMtchEvntBcastT.stratEquLegGrp = getStratEquLegGrpT(testCaseNum, "bscSubStratMtchEvntBcastT");
	vbscSubStratMtchEvntBcastT.bscMtchEvntGrp = getBscMtchEvntGrpT(testCaseNum, "bscSubStratMtchEvntBcastT");	return vbscSubStratMtchEvntBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subStratMtchEvntBcastT getSubStratMtchEvntBcastT(char* testCaseNum , const char *root) {
	subStratMtchEvntBcastT vsubStratMtchEvntBcastT;
	int i;

	vsubStratMtchEvntBcastT.prodSeqNoGrp = getProdSeqNoGrpT(testCaseNum, "subStratMtchEvntBcastT");
	vsubStratMtchEvntBcastT.header = getDataHeaderT(testCaseNum, "subStratMtchEvntBcastT");
	vsubStratMtchEvntBcastT.basic = getBscSubStratMtchEvntBcastT(testCaseNum, "subStratMtchEvntBcastT");
	vsubStratMtchEvntBcastT.extension = getExtMtchEvntGrpT(testCaseNum, "subStratMtchEvntBcastT");	return vsubStratMtchEvntBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subStratMtchEvntSubjectT getSubStratMtchEvntSubjectT(char* testCaseNum , const char *root) {
	subStratMtchEvntSubjectT vsubStratMtchEvntSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vsubStratMtchEvntSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubStratMtchEvnt.subStratMtchEvntSubjectT.membId", lmembId);
	memcpy(vsubStratMtchEvntSubjectT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vsubStratMtchEvntSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubStratMtchEvnt.subStratMtchEvntSubjectT.prodId", lprodId);
	memcpy(vsubStratMtchEvntSubjectT.prodId, lprodId, PROD_ID_LEN);
	return vsubStratMtchEvntSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubStratMtchEvntBcastT(bscSubStratMtchEvntBcastT actual, bscSubStratMtchEvntBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareStratEquLegGrpT (actual.stratEquLegGrp,expected.stratEquLegGrp, logMsg);
	compareBscMtchEvntGrpT (actual.bscMtchEvntGrp,expected.bscMtchEvntGrp, logMsg);
	for ( i = 0; i < STRAT_TRD_LEG_MTCH_PRC_GRP_MAX;i++) {
		compareTrdLegMtchGrpT (actual.trdLegMtchGrp[i],expected.trdLegMtchGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubStratMtchEvntBcastT(subStratMtchEvntBcastT actual, subStratMtchEvntBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareProdSeqNoGrpT (actual.prodSeqNoGrp,expected.prodSeqNoGrp, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubStratMtchEvntBcastT (actual.basic,expected.basic, logMsg);
	compareExtMtchEvntGrpT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubStratMtchEvntSubjectT(subStratMtchEvntSubjectT actual, subStratMtchEvntSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In subStratMtchEvntSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In subStratMtchEvntSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

