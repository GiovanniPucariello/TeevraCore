#ifndef _TESTENTEREXERCISE_H_
#define _TESTENTEREXERCISE_H_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include "EntExer.hxx"

static optEntExerRequestT getoptEntExr();
static optEntExerResponseT getoptEntExerResp();
char* str1;

char* compareEntExercise(char prodLine, jbyte* MsgBodystr)
{
	if(prodLine == 'O')
	{
		optEntExerRequestT rcvEntExr = getoptEntExr();
		//type cast input msg to sub trade confirmation
		optEntExerRequestT* tempStruct = (optEntExerRequestT*) MsgBodystr;
		if(memcmp(tempStruct, &rcvEntExr, sizeof(rcvEntExr)))
		{
			sprintf(str1, "false");
		}
		else {
			sprintf(str1, "true");
		}
	}
	else {
		sprintf(str1, "Error");
	}

	return str;
}

jbyteArray getEntExercise(JNIEnv* env, char prodLine)
{
	jbyteArray jdataresp;
	
	if(prodLine == 'O')
	{
		optEntExerResponseT sendEntExer = getoptEntExerResp();
		
		jdataresp = env->NewByteArray(sizeof(optEntExerResponseT));
		env->SetByteArrayRegion(jdataresp, 0, sizeof(optEntExerResponseT), (jbyte*) &sendEntExer);
	}
	return jdataresp;
}

optEntExerRequestT getoptEntExr()
{
	optEntExerRequestT rcvStruct;
	memcpy(rcvStruct.header.exchApplId, EXCH_APPL_ID_EUREX, EXCH_APPL_ID_LEN);
	memcpy(rcvStruct.header.prodLine, PROD_LINE_OPTION, PROD_LINE_LEN);

	rcvStruct.basic.acctTypCodGrp.acctTypCod = 'A';
	rcvStruct.basic.acctTypCodGrp.acctTypNo = '1';
	memcpy(rcvStruct.basic.exerQty, "+000000000001000", DRIV_QUANTITY_LEN);
	memcpy(rcvStruct.basic.membClgIdCod, "DSA12", MEMB_CLG_ID_COD_LEN);
	memcpy(rcvStruct.basic.membExchIdCod, "AB123", MEMB_EXCH_ID_COD_LEN);
	rcvStruct.basic.optCntrIdGrp.cntrClasCod = CNTR_CLAS_COD_CALL;
	memcpy(rcvStruct.basic.optCntrIdGrp.cntrExerPrc, "666666", CNTR_EXER_PRC_LEN);
	memcpy(rcvStruct.basic.optCntrIdGrp.cntrExpMthDat, "09", CNTR_EXP_MTH_DAT_LEN);
	memcpy(rcvStruct.basic.optCntrIdGrp.cntrExpYrDat, "2009", CNTR_EXP_YR_DAT_LEN);
	rcvStruct.basic.optCntrIdGrp.cntrVersNo = '0';
	memcpy(rcvStruct.basic.optCntrIdGrp.prodId, "ODAX", PROD_ID_LEN);

	rcvStruct.extension.exerAllInd = 'Y';
	rcvStruct.extension.exerOtmWrnInd = 'Y';
	memcpy(rcvStruct.extension.txtGrp.cust, "TestCustomer", CUST_LEN);
	memcpy(rcvStruct.extension.txtGrp.text, "FreeFormText", TEXT_LEN);
	memcpy(rcvStruct.extension.txtGrp.userOrdrNum, "123456789012", USER_ORDR_NUM_LEN);

	return rcvStruct;
}

optEntExerResponseT getoptEntExerResp()
{
	optEntExerResponseT sendStruct;
	memcpy(sendStruct.header.exchApplId, EXCH_APPL_ID_EUREX, EXCH_APPL_ID_LEN);
	memcpy(sendStruct.header.prodLine, PROD_LINE_OPTION, PROD_LINE_LEN);
	memcpy(sendStruct.header.membExchIdCodOboMs, "ASDFG", MEMB_EXCH_ID_COD_OBO_MS_LEN);

	memcpy(sendStruct.basic.crtLngQty, "+000000000001000", DRIV_QUANTITY_LEN);
	memcpy(sendStruct.basic.trnIdNo, "654321", TRN_ID_NO_LEN);

	return sendStruct;
}


#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif