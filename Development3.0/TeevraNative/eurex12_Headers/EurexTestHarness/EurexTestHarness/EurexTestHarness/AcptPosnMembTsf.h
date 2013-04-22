#include <AcptPosnMembTsf.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscAcptPosnMembTsfRequestT getBscAcptPosnMembTsfRequestT(char* testCaseNum , const char *root) {
	bscAcptPosnMembTsfRequestT vbscAcptPosnMembTsfRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscAcptPosnMembTsfRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AcptPosnMembTsf.bscAcptPosnMembTsfRequestT.trnIdNo", ltrnIdNo);
	memcpy(vbscAcptPosnMembTsfRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		vbscAcptPosnMembTsfRequestT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("AcptPosnMembTsf.bscAcptPosnMembTsfRequestT.posTrnTyp", lposTrnTyp);
	memcpy(vbscAcptPosnMembTsfRequestT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAcptPosnMembTsfRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptPosnMembTsf.bscAcptPosnMembTsfRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAcptPosnMembTsfRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAcptPosnMembTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
acptPosnMembTsfRequestT getAcptPosnMembTsfRequestT(char* testCaseNum , const char *root) {
	acptPosnMembTsfRequestT vacptPosnMembTsfRequestT;
	int i;

	vacptPosnMembTsfRequestT.header = getDataHeaderT(testCaseNum, "acptPosnMembTsfRequestT");
	vacptPosnMembTsfRequestT.basic = getBscAcptPosnMembTsfRequestT(testCaseNum, "acptPosnMembTsfRequestT");	return vacptPosnMembTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscAcptPosnMembTsfResponseT getBscAcptPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	bscAcptPosnMembTsfResponseT vbscAcptPosnMembTsfResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAcptPosnMembTsfResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptPosnMembTsf.bscAcptPosnMembTsfResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAcptPosnMembTsfResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAcptPosnMembTsfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extAcptPosnMembTsfResponseT getExtAcptPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	extAcptPosnMembTsfResponseT vextAcptPosnMembTsfResponseT;
	int i;

	char lconfCodMembClgIdFrom[1] = {""};
	getStrProperty("AcptPosnMembTsf.extAcptPosnMembTsfResponseT.confCodMembClgIdFrom", lconfCodMembClgIdFrom);
	vextAcptPosnMembTsfResponseT.confCodMembClgIdFrom = lconfCodMembClgIdFrom[0];

	char lconfCodMembExchIdFrom[1] = {""};
	getStrProperty("AcptPosnMembTsf.extAcptPosnMembTsfResponseT.confCodMembExchIdFrom", lconfCodMembExchIdFrom);
	vextAcptPosnMembTsfResponseT.confCodMembExchIdFrom = lconfCodMembExchIdFrom[0];

	char lconfCodMembClgIdTo[1] = {""};
	getStrProperty("AcptPosnMembTsf.extAcptPosnMembTsfResponseT.confCodMembClgIdTo", lconfCodMembClgIdTo);
	vextAcptPosnMembTsfResponseT.confCodMembClgIdTo = lconfCodMembClgIdTo[0];

	char lconfCodMembExchIdTo[1] = {""};
	getStrProperty("AcptPosnMembTsf.extAcptPosnMembTsfResponseT.confCodMembExchIdTo", lconfCodMembExchIdTo);
	vextAcptPosnMembTsfResponseT.confCodMembExchIdTo = lconfCodMembExchIdTo[0];
	return vextAcptPosnMembTsfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
acptPosnMembTsfResponseT getAcptPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	acptPosnMembTsfResponseT vacptPosnMembTsfResponseT;
	int i;

	vacptPosnMembTsfResponseT.header = getDataHeaderT(testCaseNum, "acptPosnMembTsfResponseT");
	vacptPosnMembTsfResponseT.basic = getBscAcptPosnMembTsfResponseT(testCaseNum, "acptPosnMembTsfResponseT");
	vacptPosnMembTsfResponseT.extension = getExtAcptPosnMembTsfResponseT(testCaseNum, "acptPosnMembTsfResponseT");	return vacptPosnMembTsfResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAcptPosnMembTsfRequestT(bscAcptPosnMembTsfRequestT actual, bscAcptPosnMembTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptPosnMembTsfRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptPosnMembTsfRequestT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptPosnMembTsfRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcptPosnMembTsfRequestT(acptPosnMembTsfRequestT actual, acptPosnMembTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAcptPosnMembTsfRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAcptPosnMembTsfResponseT(bscAcptPosnMembTsfResponseT actual, bscAcptPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptPosnMembTsfResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtAcptPosnMembTsfResponseT(extAcptPosnMembTsfResponseT actual, extAcptPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.confCodMembClgIdFrom!= expected.confCodMembClgIdFrom) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extAcptPosnMembTsfResponseT, confCodMembClgIdFromnot matching. Actual %d but Expected %d", actual.confCodMembClgIdFrom, expected.confCodMembClgIdFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.confCodMembExchIdFrom!= expected.confCodMembExchIdFrom) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extAcptPosnMembTsfResponseT, confCodMembExchIdFromnot matching. Actual %d but Expected %d", actual.confCodMembExchIdFrom, expected.confCodMembExchIdFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.confCodMembClgIdTo!= expected.confCodMembClgIdTo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extAcptPosnMembTsfResponseT, confCodMembClgIdTonot matching. Actual %d but Expected %d", actual.confCodMembClgIdTo, expected.confCodMembClgIdTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.confCodMembExchIdTo!= expected.confCodMembExchIdTo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extAcptPosnMembTsfResponseT, confCodMembExchIdTonot matching. Actual %d but Expected %d", actual.confCodMembExchIdTo, expected.confCodMembExchIdTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcptPosnMembTsfResponseT(acptPosnMembTsfResponseT actual, acptPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAcptPosnMembTsfResponseT (actual.basic,expected.basic, logMsg);
	compareExtAcptPosnMembTsfResponseT (actual.extension,expected.extension, logMsg);
}

