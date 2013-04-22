typedef struct InnerStruct {
	int num;
	char opt;
} InnerStructT;

typedef struct CnctRespData {
	short connectionID;
	unsigned short connectionID1;
	char VMQName[20];
	char prodMode;
} CnctRespDataT;

typedef struct LoginReqData {
	char userID[20];
	char closure;
	int applVersion;
	int authorizationDataLength;
	CnctRespDataT firstLevel[2];
	float x;
	double y;
} LoginReqDataT;

typedef struct ReqCntrl {
	int connectionID;
	long dbApplID;
	char appDescr[20];
	LoginReqDataT secondLevel;
	int reqID;
	int resubmitFlag;
	long resubmitNo;
	char VCIver[20];
	int loginID;
} ReqCntrlT;

typedef struct ComplexStruct {
	int num;
	long num1;
	long num2;
	ReqCntrlT thirdLevel;
	float dummy;
	char name[30];
	int x;
	double y;
	char z;
} ComplexStructT;

