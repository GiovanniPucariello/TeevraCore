#include <SubDLegMtchEvnt.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubDLegMtchEvntBcastT getFutBscSubDLegMtchEvntBcastT(char* testCaseNum , const char *root) {
	futBscSubDLegMtchEvntBcastT vfutBscSubDLegMtchEvntBcastT;
	int i;

	vfutBscSubDLegMtchEvntBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubDLegMtchEvntBcastT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscSubDLegMtchEvntBcastT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("SubDLegMtchEvnt.futBscSubDLegMtchEvntBcastT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscSubDLegMtchEvntBcastT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscSubDLegMtchEvntBcastT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscSubDLegMtchEvntBcastT");
	vfutBscSubDLegMtchEvntBcastT.bscMtchEvntGrp = getBscMtchEvntGrpT(testCaseNum, "futBscSubDLegMtchEvntBcastT");	return vfutBscSubDLegMtchEvntBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futSubDLegMtchEvntBcastT getFutSubDLegMtchEvntBcastT(char* testCaseNum , const char *root) {
	futSubDLegMtchEvntBcastT vfutSubDLegMtchEvntBcastT;
	int i;

	vfutSubDLegMtchEvntBcastT.prodSeqNoGrp = getProdSeqNoGrpT(testCaseNum, "futSubDLegMtchEvntBcastT");
	vfutSubDLegMtchEvntBcastT.header = getDataHeaderT(testCaseNum, "futSubDLegMtchEvntBcastT");
	vfutSubDLegMtchEvntBcastT.basic = getFutBscSubDLegMtchEvntBcastT(testCaseNum, "futSubDLegMtchEvntBcastT");
	vfutSubDLegMtchEvntBcastT.extension = getExtMtchEvntGrpT(testCaseNum, "futSubDLegMtchEvntBcastT");	return vfutSubDLegMtchEvntBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futSubDLegMtchEvntSubjectT getFutSubDLegMtchEvntSubjectT(char* testCaseNum , const char *root) {
	futSubDLegMtchEvntSubjectT vfutSubDLegMtchEvntSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vfutSubDLegMtchEvntSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubDLegMtchEvnt.futSubDLegMtchEvntSubjectT.membId", lmembId);
	memcpy(vfutSubDLegMtchEvntSubjectT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutSubDLegMtchEvntSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubDLegMtchEvnt.futSubDLegMtchEvntSubjectT.prodId", lprodId);
	memcpy(vfutSubDLegMtchEvntSubjectT.prodId, lprodId, PROD_ID_LEN);
	return vfutSubDLegMtchEvntSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubDLegMtchEvntBcastT(futBscSubDLegMtchEvntBcastT actual, futBscSubDLegMtchEvntBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegMtchEvntBcastT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareBscMtchEvntGrpT (actual.bscMtchEvntGrp,expected.bscMtchEvntGrp, logMsg);
	for ( i = 0; i < D_LEG_TRD_LEG_MTCH_PRC_GRP_MAX;i++) {
		compareTrdLegMtchGrpT (actual.trdLegMtchGrp[i],expected.trdLegMtchGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutSubDLegMtchEvntBcastT(futSubDLegMtchEvntBcastT actual, futSubDLegMtchEvntBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareProdSeqNoGrpT (actual.prodSeqNoGrp,expected.prodSeqNoGrp, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscSubDLegMtchEvntBcastT (actual.basic,expected.basic, logMsg);
	compareExtMtchEvntGrpT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutSubDLegMtchEvntSubjectT(futSubDLegMtchEvntSubjectT actual, futSubDLegMtchEvntSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futSubDLegMtchEvntSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futSubDLegMtchEvntSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

