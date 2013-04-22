#include <InqRecovBcastStat.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqRecovBcastStatRequestT getBscInqRecovBcastStatRequestT(char* testCaseNum , const char *root) {
	bscInqRecovBcastStatRequestT vbscInqRecovBcastStatRequestT;
	int i;

	char lreCovBcastTyp[1] = {""};
	getStrProperty("InqRecovBcastStat.bscInqRecovBcastStatRequestT.reCovBcastTyp", lreCovBcastTyp);
	vbscInqRecovBcastStatRequestT.reCovBcastTyp = lreCovBcastTyp[0];

	for(i=0;i<MEMB_ID_LEN;i++) {
		vbscInqRecovBcastStatRequestT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("InqRecovBcastStat.bscInqRecovBcastStatRequestT.membId", lmembId);
	memcpy(vbscInqRecovBcastStatRequestT.membId, lmembId, MEMB_ID_LEN);
	return vbscInqRecovBcastStatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqRecovBcastStatRequestT getInqRecovBcastStatRequestT(char* testCaseNum , const char *root) {
	inqRecovBcastStatRequestT vinqRecovBcastStatRequestT;
	int i;

	vinqRecovBcastStatRequestT.header = getDataHeaderT(testCaseNum, "inqRecovBcastStatRequestT");
	vinqRecovBcastStatRequestT.basic = getBscInqRecovBcastStatRequestT(testCaseNum, "inqRecovBcastStatRequestT");	return vinqRecovBcastStatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqRecovBcastStatResponseT getBscInqRecovBcastStatResponseT(char* testCaseNum , const char *root) {
	bscInqRecovBcastStatResponseT vbscInqRecovBcastStatResponseT;
	int i;

	char lbcastDataComplInd[1] = {""};
	getStrProperty("InqRecovBcastStat.bscInqRecovBcastStatResponseT.bcastDataComplInd", lbcastDataComplInd);
	vbscInqRecovBcastStatResponseT.bcastDataComplInd = lbcastDataComplInd[0];
	return vbscInqRecovBcastStatResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqRecovBcastStatResponseT getInqRecovBcastStatResponseT(char* testCaseNum , const char *root) {
	inqRecovBcastStatResponseT vinqRecovBcastStatResponseT;
	int i;

	vinqRecovBcastStatResponseT.header = getDataHeaderT(testCaseNum, "inqRecovBcastStatResponseT");
	vinqRecovBcastStatResponseT.basic = getBscInqRecovBcastStatResponseT(testCaseNum, "inqRecovBcastStatResponseT");	return vinqRecovBcastStatResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqRecovBcastStatRequestT(bscInqRecovBcastStatRequestT actual, bscInqRecovBcastStatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.reCovBcastTyp!= expected.reCovBcastTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqRecovBcastStatRequestT, reCovBcastTypnot matching. Actual %d but Expected %d", actual.reCovBcastTyp, expected.reCovBcastTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqRecovBcastStatRequestT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqRecovBcastStatRequestT(inqRecovBcastStatRequestT actual, inqRecovBcastStatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqRecovBcastStatRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqRecovBcastStatResponseT(bscInqRecovBcastStatResponseT actual, bscInqRecovBcastStatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.bcastDataComplInd!= expected.bcastDataComplInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqRecovBcastStatResponseT, bcastDataComplIndnot matching. Actual %d but Expected %d", actual.bcastDataComplInd, expected.bcastDataComplInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqRecovBcastStatResponseT(inqRecovBcastStatResponseT actual, inqRecovBcastStatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqRecovBcastStatResponseT (actual.basic,expected.basic, logMsg);
}

