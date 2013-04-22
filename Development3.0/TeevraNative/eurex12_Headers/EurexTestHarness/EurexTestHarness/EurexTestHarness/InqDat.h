#include <InqDat.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
inqDatRequestT getInqDatRequestT(char* testCaseNum , const char *root) {
	inqDatRequestT vinqDatRequestT;
	int i;

	vinqDatRequestT.header = getDataHeaderT(testCaseNum, "inqDatRequestT");	return vinqDatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqDatRecT getBscInqDatRecT(char* testCaseNum , const char *root) {
	bscInqDatRecT vbscInqDatRecT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqDatRecT.exchPrvProcDat[i]= ' ';
	}
	char lexchPrvProcDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqDat.bscInqDatRecT.exchPrvProcDat", lexchPrvProcDat);
	memcpy(vbscInqDatRecT.exchPrvProcDat, lexchPrvProcDat, DRIV_DATE_LEN);
	return vbscInqDatRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqDatResponseT getBscInqDatResponseT(char* testCaseNum , const char *root) {
	bscInqDatResponseT vbscInqDatResponseT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqDatResponseT.exchCrtProcDat[i]= ' ';
	}
	char lexchCrtProcDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqDat.bscInqDatResponseT.exchCrtProcDat", lexchCrtProcDat);
	memcpy(vbscInqDatResponseT.exchCrtProcDat, lexchCrtProcDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqDatResponseT.exchNxtProcDat[i]= ' ';
	}
	char lexchNxtProcDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqDat.bscInqDatResponseT.exchNxtProcDat", lexchNxtProcDat);
	memcpy(vbscInqDatResponseT.exchNxtProcDat, lexchNxtProcDat, DRIV_DATE_LEN);
	return vbscInqDatResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqDatResponseT getInqDatResponseT(char* testCaseNum , const char *root) {
	inqDatResponseT vinqDatResponseT;
	int i;

	vinqDatResponseT.header = getDataHeaderT(testCaseNum, "inqDatResponseT");
	vinqDatResponseT.basic = getBscInqDatResponseT(testCaseNum, "inqDatResponseT");	return vinqDatResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqDatRequestT(inqDatRequestT actual, inqDatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqDatRecT(bscInqDatRecT actual, bscInqDatRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.exchPrvProcDat, expected.exchPrvProcDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqDatRecT, exchPrvProcDat not matching. Actual %s but Expected %s", actual.exchPrvProcDat, expected.exchPrvProcDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqDatResponseT(bscInqDatResponseT actual, bscInqDatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.exchCrtProcDat, expected.exchCrtProcDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqDatResponseT, exchCrtProcDat not matching. Actual %s but Expected %s", actual.exchCrtProcDat, expected.exchCrtProcDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchNxtProcDat, expected.exchNxtProcDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqDatResponseT, exchNxtProcDat not matching. Actual %s but Expected %s", actual.exchNxtProcDat, expected.exchNxtProcDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_DAT_REC_MAX;i++) {
		compareBscInqDatRecT (actual.bscInqDatRec[i],expected.bscInqDatRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqDatResponseT(inqDatResponseT actual, inqDatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqDatResponseT (actual.basic,expected.basic, logMsg);
}

