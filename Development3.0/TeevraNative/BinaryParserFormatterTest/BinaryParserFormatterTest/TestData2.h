LoginReqDataT *loginReqData;

LoginReqDataT* getLoginReqData() {
	int i, j;
	loginReqData = (LoginReqDataT *)malloc(sizeof(LoginReqDataT));
	
	for(i=0;i<20;i++) {
		loginReqData->userID[i] = '\0';
	}
	strcpy_s(loginReqData->userID, "ARUN");
	loginReqData->closure = 'Y';
	loginReqData->applVersion = 145;
	loginReqData->authorizationDataLength = 4531;
	for(j=0;j<2;j++)
	{
		loginReqData->firstLevel[j].connectionID = -56;
		loginReqData->firstLevel[j].connectionID1 = 156;
		for(i=0;i<20;i++) {
			loginReqData->firstLevel[j].VMQName[i] = ' ';
		}
		strcpy_s(loginReqData->firstLevel[j].VMQName, "TESTING VMQ");
		loginReqData->firstLevel[j].prodMode = 'R';
	}
	loginReqData->x = (float)454.23;
	loginReqData->y = 3485;
	return loginReqData;
}

char* compareLoginReqData(LoginReqDataT actual, LoginReqDataT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env) {
	int success = 1;
	printf("actual: userID=%s, closure=%c, applVersion=%d, x=%f, y=%lf\n", actual.userID, actual.closure, actual.applVersion, actual.x, actual.y);
	printf("expecteduserID=%s, closure=%c, applVersion=%d, x=%f, y=%lf\n", expected.userID, expected.closure, expected.applVersion, expected.x, expected.y);

	logMsg[0] = '\0';
	if (actual.userID != expected.userID) {
		strcat_s(logMsg, 100, "userID not matching.");
		success = 0;
	}

	if (actual.closure != expected.closure) {
		strcat_s(logMsg, 100, "closure not matching.");
		success = 0;
	}

	if (actual.applVersion != expected.applVersion) {
		strcat_s(logMsg, 100, "applVersion not matching.");
		success = 0;
	}
	if (success = 1) {
		strcat_s(logMsg, 100, "true");
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
	return logMsg;
}

jbyteArray getByteArray2(JNIEnv *env) {
	getLoginReqData();
	jbyteArray jdatareq;

	jdatareq = env->NewByteArray(sizeof(LoginReqDataT));;
	env->SetByteArrayRegion(jdatareq, 0, sizeof(LoginReqDataT), (jbyte*) cnctData);
	return jdatareq;
}

char* compareByteArray2(jbyteArray msg, JNIEnv *env) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	LoginReqDataT *loginReqData = (LoginReqData *)msgStruct;
	LoginReqDataT* testData = getLoginReqData();

	return compareLoginReqData(*loginReqData, *testData, msg, msgStruct, env);
}

typedef enum
{
    VCI_FATAL=3,
    VCI_ERROR=2,
    VCI_WARNING=1,
    VCI_SUCCESS=0

}SeverityClassT;

typedef struct EnumStructDataTag {
	short connectionID;
	SeverityClassT complSeverity;
} EnumStructDataT;

EnumStructDataT *enumStructData;

void getEnumStructData() {
	enumStructData = (EnumStructDataT *)malloc(sizeof(EnumStructDataT));
	enumStructData->connectionID = 1;
	enumStructData->complSeverity = VCI_ERROR;
}

jbyteArray getByteArray3(JNIEnv *env) {
	getEnumStructData();
	jbyteArray jdatareq;

	jdatareq = env->NewByteArray(sizeof(EnumStructDataT));;
	env->SetByteArrayRegion(jdatareq, 0, sizeof(EnumStructDataT), (jbyte*) enumStructData);
	return jdatareq;
}
