#include <DRIV_common_structs.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
acctTypCodFromGrpT getAcctTypCodFromGrpT(char* testCaseNum , const char *root) {
	acctTypCodFromGrpT vacctTypCodFromGrpT;
	int i;

	char lacctTypCodFrom[1] = {""};
	getStrProperty("DRIV_common_structs.acctTypCodFromGrpT.acctTypCodFrom", lacctTypCodFrom);
	vacctTypCodFromGrpT.acctTypCodFrom = lacctTypCodFrom[0];

	char lacctTypNoFrom[1] = {""};
	getStrProperty("DRIV_common_structs.acctTypCodFromGrpT.acctTypNoFrom", lacctTypNoFrom);
	vacctTypCodFromGrpT.acctTypNoFrom = lacctTypNoFrom[0];
	return vacctTypCodFromGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
acctTypCodGrpT getAcctTypCodGrpT(char* testCaseNum , const char *root) {
	acctTypCodGrpT vacctTypCodGrpT;
	int i;

	char lacctTypCod[1] = {""};
	getStrProperty("DRIV_common_structs.acctTypCodGrpT.acctTypCod", lacctTypCod);
	vacctTypCodGrpT.acctTypCod = lacctTypCod[0];

	char lacctTypNo[1] = {""};
	getStrProperty("DRIV_common_structs.acctTypCodGrpT.acctTypNo", lacctTypNo);
	vacctTypCodGrpT.acctTypNo = lacctTypNo[0];
	return vacctTypCodGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
acctTypCodToGrpT getAcctTypCodToGrpT(char* testCaseNum , const char *root) {
	acctTypCodToGrpT vacctTypCodToGrpT;
	int i;

	char lacctTypCodTo[1] = {""};
	getStrProperty("DRIV_common_structs.acctTypCodToGrpT.acctTypCodTo", lacctTypCodTo);
	vacctTypCodToGrpT.acctTypCodTo = lacctTypCodTo[0];

	char lacctTypNoTo[1] = {""};
	getStrProperty("DRIV_common_structs.acctTypCodToGrpT.acctTypNoTo", lacctTypNoTo);
	vacctTypCodToGrpT.acctTypNoTo = lacctTypNoTo[0];
	return vacctTypCodToGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
acctVatParmRecT getAcctVatParmRecT(char* testCaseNum , const char *root) {
	acctVatParmRecT vacctVatParmRecT;
	int i;

	vacctVatParmRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "acctVatParmRecT");
	for(i=0;i<VAT_PCNT_LEN;i++) {
		vacctVatParmRecT.vatPcntBuy[i]= ' ';
	}
	char lvatPcntBuy[VAT_PCNT_LEN] = {""};
	getStrProperty("DRIV_common_structs.acctVatParmRecT.vatPcntBuy", lvatPcntBuy);
	memcpy(vacctVatParmRecT.vatPcntBuy, lvatPcntBuy, VAT_PCNT_LEN);

	for(i=0;i<VAT_PCNT_LEN;i++) {
		vacctVatParmRecT.vatPcntSell[i]= ' ';
	}
	char lvatPcntSell[VAT_PCNT_LEN] = {""};
	getStrProperty("DRIV_common_structs.acctVatParmRecT.vatPcntSell", lvatPcntSell);
	memcpy(vacctVatParmRecT.vatPcntSell, lvatPcntSell, VAT_PCNT_LEN);
	return vacctVatParmRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
acctVatParmGrpT getAcctVatParmGrpT(char* testCaseNum , const char *root) {
	acctVatParmGrpT vacctVatParmGrpT;
	int i;
	return vacctVatParmGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
blkAuctPotPrcGrpT getBlkAuctPotPrcGrpT(char* testCaseNum , const char *root) {
	blkAuctPotPrcGrpT vblkAuctPotPrcGrpT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vblkAuctPotPrcGrpT.bidExePrc[i]= ' ';
	}
	char lbidExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.blkAuctPotPrcGrpT.bidExePrc", lbidExePrc);
	memcpy(vblkAuctPotPrcGrpT.bidExePrc, lbidExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vblkAuctPotPrcGrpT.bidExeQty[i]= ' ';
	}
	char lbidExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DRIV_common_structs.blkAuctPotPrcGrpT.bidExeQty", lbidExeQty);
	memcpy(vblkAuctPotPrcGrpT.bidExeQty, lbidExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vblkAuctPotPrcGrpT.askExePrc[i]= ' ';
	}
	char laskExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.blkAuctPotPrcGrpT.askExePrc", laskExePrc);
	memcpy(vblkAuctPotPrcGrpT.askExePrc, laskExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vblkAuctPotPrcGrpT.askExeQty[i]= ' ';
	}
	char laskExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DRIV_common_structs.blkAuctPotPrcGrpT.askExeQty", laskExeQty);
	memcpy(vblkAuctPotPrcGrpT.askExeQty, laskExeQty, DRIV_VOLUME_LEN);
	return vblkAuctPotPrcGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bnkCtctGrpT getBnkCtctGrpT(char* testCaseNum , const char *root) {
	bnkCtctGrpT vbnkCtctGrpT;
	int i;

	for(i=0;i<BNK_CTCT_PSN_LEN;i++) {
		vbnkCtctGrpT.bnkCtctPsn[i]= ' ';
	}
	char lbnkCtctPsn[BNK_CTCT_PSN_LEN] = {""};
	getStrProperty("DRIV_common_structs.bnkCtctGrpT.bnkCtctPsn", lbnkCtctPsn);
	memcpy(vbnkCtctGrpT.bnkCtctPsn, lbnkCtctPsn, BNK_CTCT_PSN_LEN);

	for(i=0;i<BNK_CTCT_PSN_PHN_LEN;i++) {
		vbnkCtctGrpT.bnkCtctPsnPhn[i]= ' ';
	}
	char lbnkCtctPsnPhn[BNK_CTCT_PSN_PHN_LEN] = {""};
	getStrProperty("DRIV_common_structs.bnkCtctGrpT.bnkCtctPsnPhn", lbnkCtctPsnPhn);
	memcpy(vbnkCtctGrpT.bnkCtctPsnPhn, lbnkCtctPsnPhn, BNK_CTCT_PSN_PHN_LEN);

	for(i=0;i<BNK_CTCT_PSN_EMAIL_LEN;i++) {
		vbnkCtctGrpT.bnkCtctPsnEMail[i]= ' ';
	}
	char lbnkCtctPsnEMail[BNK_CTCT_PSN_EMAIL_LEN] = {""};
	getStrProperty("DRIV_common_structs.bnkCtctGrpT.bnkCtctPsnEMail", lbnkCtctPsnEMail);
	memcpy(vbnkCtctGrpT.bnkCtctPsnEMail, lbnkCtctPsnEMail, BNK_CTCT_PSN_EMAIL_LEN);
	return vbnkCtctGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntEbiTrdReqGrpT getBscEntEbiTrdReqGrpT(char* testCaseNum , const char *root) {
	bscEntEbiTrdReqGrpT vbscEntEbiTrdReqGrpT;
	int i;

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscEntEbiTrdReqGrpT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscEntEbiTrdReqGrpT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscEntEbiTrdReqGrpT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscEntEbiTrdReqGrpT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscEntEbiTrdReqGrpT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscEntEbiTrdReqGrpT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("DRIV_common_structs.bscEntEbiTrdReqGrpT.buyCod", lbuyCod);
	vbscEntEbiTrdReqGrpT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntEbiTrdReqGrpT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscEntEbiTrdReqGrpT.trdXQty", ltrdXQty);
	memcpy(vbscEntEbiTrdReqGrpT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);
	return vbscEntEbiTrdReqGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntEbiTrdRespRecT getBscEntEbiTrdRespRecT(char* testCaseNum , const char *root) {
	bscEntEbiTrdRespRecT vbscEntEbiTrdRespRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vbscEntEbiTrdRespRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscEntEbiTrdRespRecT.rtnCod", lrtnCod);
	memcpy(vbscEntEbiTrdRespRecT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscEntEbiTrdRespRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscEntEbiTrdRespRecT.trnIdNo", ltrnIdNo);
	memcpy(vbscEntEbiTrdRespRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return vbscEntEbiTrdRespRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqEbiTrdRespRecT getBscInqEbiTrdRespRecT(char* testCaseNum , const char *root) {
	bscInqEbiTrdRespRecT vbscInqEbiTrdRespRecT;
	int i;

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscInqEbiTrdRespRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscInqEbiTrdRespRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscInqEbiTrdRespRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscInqEbiTrdRespRecT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscInqEbiTrdRespRecT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscInqEbiTrdRespRecT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("DRIV_common_structs.bscInqEbiTrdRespRecT.buyCod", lbuyCod);
	vbscInqEbiTrdRespRecT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqEbiTrdRespRecT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscInqEbiTrdRespRecT.trdXQty", ltrdXQty);
	memcpy(vbscInqEbiTrdRespRecT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscInqEbiTrdRespRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscInqEbiTrdRespRecT.trnIdNo", ltrnIdNo);
	memcpy(vbscInqEbiTrdRespRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lebiTrdApprInd[1] = {""};
	getStrProperty("DRIV_common_structs.bscInqEbiTrdRespRecT.ebiTrdApprInd", lebiTrdApprInd);
	vbscInqEbiTrdRespRecT.ebiTrdApprInd = lebiTrdApprInd[0];
	return vbscInqEbiTrdRespRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModEbiTrdReqGrpT getBscModEbiTrdReqGrpT(char* testCaseNum , const char *root) {
	bscModEbiTrdReqGrpT vbscModEbiTrdReqGrpT;
	int i;

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscModEbiTrdReqGrpT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscModEbiTrdReqGrpT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscModEbiTrdReqGrpT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscModEbiTrdReqGrpT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscModEbiTrdReqGrpT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscModEbiTrdReqGrpT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("DRIV_common_structs.bscModEbiTrdReqGrpT.buyCod", lbuyCod);
	vbscModEbiTrdReqGrpT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModEbiTrdReqGrpT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscModEbiTrdReqGrpT.trdXQty", ltrdXQty);
	memcpy(vbscModEbiTrdReqGrpT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscModEbiTrdReqGrpT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscModEbiTrdReqGrpT.trnIdNo", ltrnIdNo);
	memcpy(vbscModEbiTrdReqGrpT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lebiTrdApprInd[1] = {""};
	getStrProperty("DRIV_common_structs.bscModEbiTrdReqGrpT.ebiTrdApprInd", lebiTrdApprInd);
	vbscModEbiTrdReqGrpT.ebiTrdApprInd = lebiTrdApprInd[0];
	return vbscModEbiTrdReqGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModEbiTrdRespRecT getBscModEbiTrdRespRecT(char* testCaseNum , const char *root) {
	bscModEbiTrdRespRecT vbscModEbiTrdRespRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vbscModEbiTrdRespRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscModEbiTrdRespRecT.rtnCod", lrtnCod);
	memcpy(vbscModEbiTrdRespRecT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscModEbiTrdRespRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscModEbiTrdRespRecT.trnIdNo", ltrnIdNo);
	memcpy(vbscModEbiTrdRespRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lebiTrdApprInd[1] = {""};
	getStrProperty("DRIV_common_structs.bscModEbiTrdRespRecT.ebiTrdApprInd", lebiTrdApprInd);
	vbscModEbiTrdRespRecT.ebiTrdApprInd = lebiTrdApprInd[0];
	return vbscModEbiTrdRespRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSeqNoT getBscSeqNoT(char* testCaseNum , const char *root) {
	bscSeqNoT vbscSeqNoT;
	int i;

	for(i=0;i<DRIV_STM_SEQ_NO_LEN;i++) {
		vbscSeqNoT.stmSeqNo[i]= ' ';
	}
	char lstmSeqNo[DRIV_STM_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscSeqNoT.stmSeqNo", lstmSeqNo);
	memcpy(vbscSeqNoT.stmSeqNo, lstmSeqNo, DRIV_STM_SEQ_NO_LEN);

	for(i=0;i<TRN_SEQ_NO_LEN;i++) {
		vbscSeqNoT.trnSeqNo[i]= ' ';
	}
	char ltrnSeqNo[TRN_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.bscSeqNoT.trnSeqNo", ltrnSeqNo);
	memcpy(vbscSeqNoT.trnSeqNo, ltrnSeqNo, TRN_SEQ_NO_LEN);
	return vbscSeqNoT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bstOrdrGrpT getBstOrdrGrpT(char* testCaseNum , const char *root) {
	bstOrdrGrpT vbstOrdrGrpT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbstOrdrGrpT.bstBidPrc[i]= ' ';
	}
	char lbstBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstOrdrGrpT.bstBidPrc", lbstBidPrc);
	memcpy(vbstOrdrGrpT.bstBidPrc, lbstBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbstOrdrGrpT.bstBidQty[i]= ' ';
	}
	char lbstBidQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstOrdrGrpT.bstBidQty", lbstBidQty);
	memcpy(vbstOrdrGrpT.bstBidQty, lbstBidQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbstOrdrGrpT.bstAskPrc[i]= ' ';
	}
	char lbstAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstOrdrGrpT.bstAskPrc", lbstAskPrc);
	memcpy(vbstOrdrGrpT.bstAskPrc, lbstAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbstOrdrGrpT.bstAskQty[i]= ' ';
	}
	char lbstAskQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstOrdrGrpT.bstAskQty", lbstAskQty);
	memcpy(vbstOrdrGrpT.bstAskQty, lbstAskQty, DRIV_QUANTITY_LEN);
	return vbstOrdrGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bstQuoOrdrGrpT getBstQuoOrdrGrpT(char* testCaseNum , const char *root) {
	bstQuoOrdrGrpT vbstQuoOrdrGrpT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbstQuoOrdrGrpT.bstOrdrBidPrc[i]= ' ';
	}
	char lbstOrdrBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstQuoOrdrGrpT.bstOrdrBidPrc", lbstOrdrBidPrc);
	memcpy(vbstQuoOrdrGrpT.bstOrdrBidPrc, lbstOrdrBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbstQuoOrdrGrpT.bstOrdrBidQty[i]= ' ';
	}
	char lbstOrdrBidQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstQuoOrdrGrpT.bstOrdrBidQty", lbstOrdrBidQty);
	memcpy(vbstQuoOrdrGrpT.bstOrdrBidQty, lbstOrdrBidQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbstQuoOrdrGrpT.bstOrdrAskPrc[i]= ' ';
	}
	char lbstOrdrAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstQuoOrdrGrpT.bstOrdrAskPrc", lbstOrdrAskPrc);
	memcpy(vbstQuoOrdrGrpT.bstOrdrAskPrc, lbstOrdrAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbstQuoOrdrGrpT.bstOrdrAskQty[i]= ' ';
	}
	char lbstOrdrAskQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstQuoOrdrGrpT.bstOrdrAskQty", lbstOrdrAskQty);
	memcpy(vbstQuoOrdrGrpT.bstOrdrAskQty, lbstOrdrAskQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbstQuoOrdrGrpT.bstQuoBidPrc[i]= ' ';
	}
	char lbstQuoBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstQuoOrdrGrpT.bstQuoBidPrc", lbstQuoBidPrc);
	memcpy(vbstQuoOrdrGrpT.bstQuoBidPrc, lbstQuoBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbstQuoOrdrGrpT.bstQuoBidQty[i]= ' ';
	}
	char lbstQuoBidQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstQuoOrdrGrpT.bstQuoBidQty", lbstQuoBidQty);
	memcpy(vbstQuoOrdrGrpT.bstQuoBidQty, lbstQuoBidQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbstQuoOrdrGrpT.bstQuoAskPrc[i]= ' ';
	}
	char lbstQuoAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstQuoOrdrGrpT.bstQuoAskPrc", lbstQuoAskPrc);
	memcpy(vbstQuoOrdrGrpT.bstQuoAskPrc, lbstQuoAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbstQuoOrdrGrpT.bstQuoAskQty[i]= ' ';
	}
	char lbstQuoAskQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.bstQuoOrdrGrpT.bstQuoAskQty", lbstQuoAskQty);
	memcpy(vbstQuoOrdrGrpT.bstQuoAskQty, lbstQuoAskQty, DRIV_QUANTITY_LEN);
	return vbstQuoOrdrGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
clgCtctGrpT getClgCtctGrpT(char* testCaseNum , const char *root) {
	clgCtctGrpT vclgCtctGrpT;
	int i;

	for(i=0;i<DRIV_CLG_CTCT_PSN_LEN;i++) {
		vclgCtctGrpT.clgCtctPsn[i]= ' ';
	}
	char lclgCtctPsn[DRIV_CLG_CTCT_PSN_LEN] = {""};
	getStrProperty("DRIV_common_structs.clgCtctGrpT.clgCtctPsn", lclgCtctPsn);
	memcpy(vclgCtctGrpT.clgCtctPsn, lclgCtctPsn, DRIV_CLG_CTCT_PSN_LEN);

	for(i=0;i<DRIV_CLG_CTCT_PSN_PHN_LEN;i++) {
		vclgCtctGrpT.clgCtctPsnPhn[i]= ' ';
	}
	char lclgCtctPsnPhn[DRIV_CLG_CTCT_PSN_PHN_LEN] = {""};
	getStrProperty("DRIV_common_structs.clgCtctGrpT.clgCtctPsnPhn", lclgCtctPsnPhn);
	memcpy(vclgCtctGrpT.clgCtctPsnPhn, lclgCtctPsnPhn, DRIV_CLG_CTCT_PSN_PHN_LEN);

	for(i=0;i<DRIV_CLG_CTCT_PSN_TLX_LEN;i++) {
		vclgCtctGrpT.clgCtctPsnTlx[i]= ' ';
	}
	char lclgCtctPsnTlx[DRIV_CLG_CTCT_PSN_TLX_LEN] = {""};
	getStrProperty("DRIV_common_structs.clgCtctGrpT.clgCtctPsnTlx", lclgCtctPsnTlx);
	memcpy(vclgCtctGrpT.clgCtctPsnTlx, lclgCtctPsnTlx, DRIV_CLG_CTCT_PSN_TLX_LEN);
	return vclgCtctGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
crsCurrHrctGrpT getCrsCurrHrctGrpT(char* testCaseNum , const char *root) {
	crsCurrHrctGrpT vcrsCurrHrctGrpT;
	int i;

	for(i=0;i<CRS_CURR_HRCT_PCNT_LEN;i++) {
		vcrsCurrHrctGrpT.crsCurrHrctPcnt[i]= ' ';
	}
	char lcrsCurrHrctPcnt[CRS_CURR_HRCT_PCNT_LEN] = {""};
	getStrProperty("DRIV_common_structs.crsCurrHrctGrpT.crsCurrHrctPcnt", lcrsCurrHrctPcnt);
	memcpy(vcrsCurrHrctGrpT.crsCurrHrctPcnt, lcrsCurrHrctPcnt, CRS_CURR_HRCT_PCNT_LEN);

	for(i=0;i<ADJ_EXCH_RAT_DBT_LEN;i++) {
		vcrsCurrHrctGrpT.adjExchRatDbt[i]= ' ';
	}
	char ladjExchRatDbt[ADJ_EXCH_RAT_DBT_LEN] = {""};
	getStrProperty("DRIV_common_structs.crsCurrHrctGrpT.adjExchRatDbt", ladjExchRatDbt);
	memcpy(vcrsCurrHrctGrpT.adjExchRatDbt, ladjExchRatDbt, ADJ_EXCH_RAT_DBT_LEN);

	for(i=0;i<ADJ_EXCH_RAT_CRDT_LEN;i++) {
		vcrsCurrHrctGrpT.adjExchRatCrdt[i]= ' ';
	}
	char ladjExchRatCrdt[ADJ_EXCH_RAT_CRDT_LEN] = {""};
	getStrProperty("DRIV_common_structs.crsCurrHrctGrpT.adjExchRatCrdt", ladjExchRatCrdt);
	memcpy(vcrsCurrHrctGrpT.adjExchRatCrdt, ladjExchRatCrdt, ADJ_EXCH_RAT_CRDT_LEN);
	return vcrsCurrHrctGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
cshLegEfpFinGrpT getCshLegEfpFinGrpT(char* testCaseNum , const char *root) {
	cshLegEfpFinGrpT vcshLegEfpFinGrpT;
	int i;

	for(i=0;i<ISS_TXT_LEN;i++) {
		vcshLegEfpFinGrpT.issTxt[i]= ' ';
	}
	char lissTxt[ISS_TXT_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfpFinGrpT.issTxt", lissTxt);
	memcpy(vcshLegEfpFinGrpT.issTxt, lissTxt, ISS_TXT_LEN);

	for(i=0;i<DRIV_CPN_RAT_LEN;i++) {
		vcshLegEfpFinGrpT.cpnRat[i]= ' ';
	}
	char lcpnRat[DRIV_CPN_RAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfpFinGrpT.cpnRat", lcpnRat);
	memcpy(vcshLegEfpFinGrpT.cpnRat, lcpnRat, DRIV_CPN_RAT_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vcshLegEfpFinGrpT.matuDat[i]= ' ';
	}
	char lmatuDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfpFinGrpT.matuDat", lmatuDat);
	memcpy(vcshLegEfpFinGrpT.matuDat, lmatuDat, DRIV_DATE_LEN);

	for(i=0;i<CPN_FREQ_LEN;i++) {
		vcshLegEfpFinGrpT.cpnFreq[i]= ' ';
	}
	char lcpnFreq[CPN_FREQ_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfpFinGrpT.cpnFreq", lcpnFreq);
	memcpy(vcshLegEfpFinGrpT.cpnFreq, lcpnFreq, CPN_FREQ_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vcshLegEfpFinGrpT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfpFinGrpT.currTypCod", lcurrTypCod);
	memcpy(vcshLegEfpFinGrpT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);
	return vcshLegEfpFinGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
cshLegEfsGrpT getCshLegEfsGrpT(char* testCaseNum , const char *root) {
	cshLegEfsGrpT vcshLegEfsGrpT;
	int i;

	for(i=0;i<CPN_FIX_RAT_LEN;i++) {
		vcshLegEfsGrpT.cpnFixRat[i]= ' ';
	}
	char lcpnFixRat[CPN_FIX_RAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfsGrpT.cpnFixRat", lcpnFixRat);
	memcpy(vcshLegEfsGrpT.cpnFixRat, lcpnFixRat, CPN_FIX_RAT_LEN);

	for(i=0;i<CPN_VAR_REF_LEN;i++) {
		vcshLegEfsGrpT.cpnVarRef[i]= ' ';
	}
	char lcpnVarRef[CPN_VAR_REF_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfsGrpT.cpnVarRef", lcpnVarRef);
	memcpy(vcshLegEfsGrpT.cpnVarRef, lcpnVarRef, CPN_VAR_REF_LEN);

	for(i=0;i<CPN_VAR_OFS_LEN;i++) {
		vcshLegEfsGrpT.cpnVarOfs[i]= ' ';
	}
	char lcpnVarOfs[CPN_VAR_OFS_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfsGrpT.cpnVarOfs", lcpnVarOfs);
	memcpy(vcshLegEfsGrpT.cpnVarOfs, lcpnVarOfs, CPN_VAR_OFS_LEN);

	for(i=0;i<CPN_FREQ_LEN;i++) {
		vcshLegEfsGrpT.cpnFreq[i]= ' ';
	}
	char lcpnFreq[CPN_FREQ_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfsGrpT.cpnFreq", lcpnFreq);
	memcpy(vcshLegEfsGrpT.cpnFreq, lcpnFreq, CPN_FREQ_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vcshLegEfsGrpT.swapStrtDat[i]= ' ';
	}
	char lswapStrtDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfsGrpT.swapStrtDat", lswapStrtDat);
	memcpy(vcshLegEfsGrpT.swapStrtDat, lswapStrtDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vcshLegEfsGrpT.swapEndDat[i]= ' ';
	}
	char lswapEndDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfsGrpT.swapEndDat", lswapEndDat);
	memcpy(vcshLegEfsGrpT.swapEndDat, lswapEndDat, DRIV_DATE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vcshLegEfsGrpT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLegEfsGrpT.currTypCod", lcurrTypCod);
	memcpy(vcshLegEfsGrpT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);
	return vcshLegEfsGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
cshLimGrpT getCshLimGrpT(char* testCaseNum , const char *root) {
	cshLimGrpT vcshLimGrpT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vcshLimGrpT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLimGrpT.currTypCod", lcurrTypCod);
	memcpy(vcshLimGrpT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<CSH_MVT_LEN;i++) {
		vcshLimGrpT.cshLim[i]= ' ';
	}
	char lcshLim[CSH_MVT_LEN] = {""};
	getStrProperty("DRIV_common_structs.cshLimGrpT.cshLim", lcshLim);
	memcpy(vcshLimGrpT.cshLim, lcshLim, CSH_MVT_LEN);
	return vcshLimGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
ctctTextGrpT getCtctTextGrpT(char* testCaseNum , const char *root) {
	ctctTextGrpT vctctTextGrpT;
	int i;

	for(i=0;i<DRIV_CTCT_TEXT_LEN;i++) {
		vctctTextGrpT.ctctText[i]= ' ';
	}
	char lctctText[DRIV_CTCT_TEXT_LEN] = {""};
	getStrProperty("DRIV_common_structs.ctctTextGrpT.ctctText", lctctText);
	memcpy(vctctTextGrpT.ctctText, lctctText, DRIV_CTCT_TEXT_LEN);
	return vctctTextGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
dataHeaderT getDataHeaderT(char* testCaseNum , const char *root) {
	dataHeaderT vdataHeaderT;
	int i;

	for(i=0;i<EXCH_APPL_ID_LEN;i++) {
		vdataHeaderT.exchApplId[i]= ' ';
	}
	char lexchApplId[EXCH_APPL_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.dataHeaderT.exchApplId", lexchApplId);
	memcpy(vdataHeaderT.exchApplId, lexchApplId, EXCH_APPL_ID_LEN);

	for(i=0;i<PROD_LINE_LEN;i++) {
		vdataHeaderT.prodLine[i]= ' ';
	}
	char lprodLine[PROD_LINE_LEN] = {""};
	getStrProperty("DRIV_common_structs.dataHeaderT.prodLine", lprodLine);
	memcpy(vdataHeaderT.prodLine, lprodLine, PROD_LINE_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_OBO_MS_LEN;i++) {
		vdataHeaderT.membExchIdCodOboMs[i]= ' ';
	}
	char lmembExchIdCodOboMs[MEMB_EXCH_ID_COD_OBO_MS_LEN] = {""};
	getStrProperty("DRIV_common_structs.dataHeaderT.membExchIdCodOboMs", lmembExchIdCodOboMs);
	memcpy(vdataHeaderT.membExchIdCodOboMs, lmembExchIdCodOboMs, MEMB_EXCH_ID_COD_OBO_MS_LEN);
	return vdataHeaderT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futCntrIdGrpT getFutCntrIdGrpT(char* testCaseNum , const char *root) {
	futCntrIdGrpT vfutCntrIdGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutCntrIdGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrIdGrpT.prodId", lprodId);
	memcpy(vfutCntrIdGrpT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutCntrIdGrpT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrIdGrpT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutCntrIdGrpT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutCntrIdGrpT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrIdGrpT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutCntrIdGrpT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);
	return vfutCntrIdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
trdrIdGrpT getTrdrIdGrpT(char* testCaseNum , const char *root) {
	trdrIdGrpT vtrdrIdGrpT;
	int i;

	for(i=0;i<PART_SUB_GRP_COD_LEN;i++) {
		vtrdrIdGrpT.partSubGrpCod[i]= ' ';
	}
	char lpartSubGrpCod[PART_SUB_GRP_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdrIdGrpT.partSubGrpCod", lpartSubGrpCod);
	memcpy(vtrdrIdGrpT.partSubGrpCod, lpartSubGrpCod, PART_SUB_GRP_COD_LEN);

	for(i=0;i<PART_NO_LEN;i++) {
		vtrdrIdGrpT.partNo[i]= ' ';
	}
	char lpartNo[PART_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdrIdGrpT.partNo", lpartNo);
	memcpy(vtrdrIdGrpT.partNo, lpartNo, PART_NO_LEN);
	return vtrdrIdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
ebiTrdInqRespGrpT getEbiTrdInqRespGrpT(char* testCaseNum , const char *root) {
	ebiTrdInqRespGrpT vebiTrdInqRespGrpT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vebiTrdInqRespGrpT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.ebiTrdInqRespGrpT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vebiTrdInqRespGrpT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	vebiTrdInqRespGrpT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "ebiTrdInqRespGrpT");
	vebiTrdInqRespGrpT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "ebiTrdInqRespGrpT");
	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		vebiTrdInqRespGrpT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.ebiTrdInqRespGrpT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(vebiTrdInqRespGrpT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vebiTrdInqRespGrpT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.ebiTrdInqRespGrpT.futPrc", lfutPrc);
	memcpy(vebiTrdInqRespGrpT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vebiTrdInqRespGrpT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("DRIV_common_structs.ebiTrdInqRespGrpT.nomVal", lnomVal);
	memcpy(vebiTrdInqRespGrpT.nomVal, lnomVal, NOM_VAL_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vebiTrdInqRespGrpT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DRIV_common_structs.ebiTrdInqRespGrpT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vebiTrdInqRespGrpT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vebiTrdInqRespGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
ebiTrdReqGrpT getEbiTrdReqGrpT(char* testCaseNum , const char *root) {
	ebiTrdReqGrpT vebiTrdReqGrpT;
	int i;

	vebiTrdReqGrpT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "ebiTrdReqGrpT");
	vebiTrdReqGrpT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "ebiTrdReqGrpT");
	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		vebiTrdReqGrpT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.ebiTrdReqGrpT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(vebiTrdReqGrpT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vebiTrdReqGrpT.futPrc[i]= ' ';
	}
	char lfutPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.ebiTrdReqGrpT.futPrc", lfutPrc);
	memcpy(vebiTrdReqGrpT.futPrc, lfutPrc, DRIV_PRICE_LEN);

	for(i=0;i<NOM_VAL_LEN;i++) {
		vebiTrdReqGrpT.nomVal[i]= ' ';
	}
	char lnomVal[NOM_VAL_LEN] = {""};
	getStrProperty("DRIV_common_structs.ebiTrdReqGrpT.nomVal", lnomVal);
	memcpy(vebiTrdReqGrpT.nomVal, lnomVal, NOM_VAL_LEN);
	return vebiTrdReqGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extExchRatTrnRecT getExtExchRatTrnRecT(char* testCaseNum , const char *root) {
	extExchRatTrnRecT vextExchRatTrnRecT;
	int i;

	for(i=0;i<CURR_TYP_COD_FROM_LEN;i++) {
		vextExchRatTrnRecT.currTypCodFrom[i]= ' ';
	}
	char lcurrTypCodFrom[CURR_TYP_COD_FROM_LEN] = {""};
	getStrProperty("DRIV_common_structs.extExchRatTrnRecT.currTypCodFrom", lcurrTypCodFrom);
	memcpy(vextExchRatTrnRecT.currTypCodFrom, lcurrTypCodFrom, CURR_TYP_COD_FROM_LEN);

	for(i=0;i<CURR_TYP_COD_TO_LEN;i++) {
		vextExchRatTrnRecT.currTypCodTo[i]= ' ';
	}
	char lcurrTypCodTo[CURR_TYP_COD_TO_LEN] = {""};
	getStrProperty("DRIV_common_structs.extExchRatTrnRecT.currTypCodTo", lcurrTypCodTo);
	memcpy(vextExchRatTrnRecT.currTypCodTo, lcurrTypCodTo, CURR_TYP_COD_TO_LEN);

	char lconvUntExpo[1] = {""};
	getStrProperty("DRIV_common_structs.extExchRatTrnRecT.convUntExpo", lconvUntExpo);
	vextExchRatTrnRecT.convUntExpo = lconvUntExpo[0];

	for(i=0;i<EXCH_RAT_LEN;i++) {
		vextExchRatTrnRecT.exchRat[i]= ' ';
	}
	char lexchRat[EXCH_RAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.extExchRatTrnRecT.exchRat", lexchRat);
	memcpy(vextExchRatTrnRecT.exchRat, lexchRat, EXCH_RAT_LEN);
	return vextExchRatTrnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extSetlPrcTrnRecT getExtSetlPrcTrnRecT(char* testCaseNum , const char *root) {
	extSetlPrcTrnRecT vextSetlPrcTrnRecT;
	int i;

	char lsetlPrcTrnTyp[1] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.setlPrcTrnTyp", lsetlPrcTrnTyp);
	vextSetlPrcTrnRecT.setlPrcTrnTyp = lsetlPrcTrnTyp[0];

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vextSetlPrcTrnRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.currTypCod", lcurrTypCod);
	memcpy(vextSetlPrcTrnRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char ldcmlShft[1] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.dcmlShft", ldcmlShft);
	vextSetlPrcTrnRecT.dcmlShft = ldcmlShft[0];

	for(i=0;i<ISIN_COD_LEN;i++) {
		vextSetlPrcTrnRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.isinCod", lisinCod);
	memcpy(vextSetlPrcTrnRecT.isinCod, lisinCod, ISIN_COD_LEN);

	char lcntrGenNo[1] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.cntrGenNo", lcntrGenNo);
	vextSetlPrcTrnRecT.cntrGenNo = lcntrGenNo[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vextSetlPrcTrnRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.prodId", lprodId);
	memcpy(vextSetlPrcTrnRecT.prodId, lprodId, PROD_ID_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.cntrClasCod", lcntrClasCod);
	vextSetlPrcTrnRecT.cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vextSetlPrcTrnRecT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vextSetlPrcTrnRecT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vextSetlPrcTrnRecT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vextSetlPrcTrnRecT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		vextSetlPrcTrnRecT.cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.cntrExerPrc", lcntrExerPrc);
	memcpy(vextSetlPrcTrnRecT.cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.cntrVersNo", lcntrVersNo);
	vextSetlPrcTrnRecT.cntrVersNo = lcntrVersNo[0];

	char lsetlPrcCod[1] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.setlPrcCod", lsetlPrcCod);
	vextSetlPrcTrnRecT.setlPrcCod = lsetlPrcCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSetlPrcTrnRecT.cntrSetlPrc[i]= ' ';
	}
	char lcntrSetlPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.cntrSetlPrc", lcntrSetlPrc);
	memcpy(vextSetlPrcTrnRecT.cntrSetlPrc, lcntrSetlPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSetlPrcTrnRecT.undrClsPrc[i]= ' ';
	}
	char lundrClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.undrClsPrc", lundrClsPrc);
	memcpy(vextSetlPrcTrnRecT.undrClsPrc, lundrClsPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSetlPrcTrnRecT.undrFinSetlPrc[i]= ' ';
	}
	char lundrFinSetlPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.undrFinSetlPrc", lundrFinSetlPrc);
	memcpy(vextSetlPrcTrnRecT.undrFinSetlPrc, lundrFinSetlPrc, DRIV_PRICE_LEN);

	char lundrFinSetlInd[1] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.undrFinSetlInd", lundrFinSetlInd);
	vextSetlPrcTrnRecT.undrFinSetlInd = lundrFinSetlInd[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSetlPrcTrnRecT.mgnClsPrc[i]= ' ';
	}
	char lmgnClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.mgnClsPrc", lmgnClsPrc);
	memcpy(vextSetlPrcTrnRecT.mgnClsPrc, lmgnClsPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextSetlPrcTrnRecT.cshValDat[i]= ' ';
	}
	char lcshValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.cshValDat", lcshValDat);
	memcpy(vextSetlPrcTrnRecT.cshValDat, lcshValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextSetlPrcTrnRecT.secuValDat[i]= ' ';
	}
	char lsecuValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.secuValDat", lsecuValDat);
	memcpy(vextSetlPrcTrnRecT.secuValDat, lsecuValDat, DRIV_DATE_LEN);

	for(i=0;i<PROD_DISP_DCML_LEN;i++) {
		vextSetlPrcTrnRecT.prodDispDcml[i]= ' ';
	}
	char lprodDispDcml[PROD_DISP_DCML_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.prodDispDcml", lprodDispDcml);
	memcpy(vextSetlPrcTrnRecT.prodDispDcml, lprodDispDcml, PROD_DISP_DCML_LEN);

	char lexerPrcDcml[1] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.exerPrcDcml", lexerPrcDcml);
	vextSetlPrcTrnRecT.exerPrcDcml = lexerPrcDcml[0];

	for(i=0;i<SETL_DISP_DCML_LEN;i++) {
		vextSetlPrcTrnRecT.setlDispDcml[i]= ' ';
	}
	char lsetlDispDcml[SETL_DISP_DCML_LEN] = {""};
	getStrProperty("DRIV_common_structs.extSetlPrcTrnRecT.setlDispDcml", lsetlDispDcml);
	memcpy(vextSetlPrcTrnRecT.setlDispDcml, lsetlDispDcml, SETL_DISP_DCML_LEN);
	return vextSetlPrcTrnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
flxCntrTrnIdClsGrpT getFlxCntrTrnIdClsGrpT(char* testCaseNum , const char *root) {
	flxCntrTrnIdClsGrpT vflxCntrTrnIdClsGrpT;
	int i;

	for(i=0;i<FLX_CNTR_TRN_ID_NO_LEN;i++) {
		vflxCntrTrnIdClsGrpT.flxCntrTrnIdNoCls[i]= ' ';
	}
	char lflxCntrTrnIdNoCls[FLX_CNTR_TRN_ID_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.flxCntrTrnIdClsGrpT.flxCntrTrnIdNoCls", lflxCntrTrnIdNoCls);
	memcpy(vflxCntrTrnIdClsGrpT.flxCntrTrnIdNoCls, lflxCntrTrnIdNoCls, FLX_CNTR_TRN_ID_NO_LEN);

	for(i=0;i<TRN_ID_SFX_NO_LEN;i++) {
		vflxCntrTrnIdClsGrpT.trnIdSfxNoCls[i]= ' ';
	}
	char ltrnIdSfxNoCls[TRN_ID_SFX_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.flxCntrTrnIdClsGrpT.trnIdSfxNoCls", ltrnIdSfxNoCls);
	memcpy(vflxCntrTrnIdClsGrpT.trnIdSfxNoCls, ltrnIdSfxNoCls, TRN_ID_SFX_NO_LEN);
	return vflxCntrTrnIdClsGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
flxCntrTrnIdGrpT getFlxCntrTrnIdGrpT(char* testCaseNum , const char *root) {
	flxCntrTrnIdGrpT vflxCntrTrnIdGrpT;
	int i;

	for(i=0;i<FLX_CNTR_TRN_ID_NO_LEN;i++) {
		vflxCntrTrnIdGrpT.flxCntrTrnIdNo[i]= ' ';
	}
	char lflxCntrTrnIdNo[FLX_CNTR_TRN_ID_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.flxCntrTrnIdGrpT.flxCntrTrnIdNo", lflxCntrTrnIdNo);
	memcpy(vflxCntrTrnIdGrpT.flxCntrTrnIdNo, lflxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN);

	for(i=0;i<TRN_ID_SFX_NO_LEN;i++) {
		vflxCntrTrnIdGrpT.trnIdSfxNo[i]= ' ';
	}
	char ltrnIdSfxNo[TRN_ID_SFX_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.flxCntrTrnIdGrpT.trnIdSfxNo", ltrnIdSfxNo);
	memcpy(vflxCntrTrnIdGrpT.trnIdSfxNo, ltrnIdSfxNo, TRN_ID_SFX_NO_LEN);
	return vflxCntrTrnIdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
flxFutCntrIdGrpT getFlxFutCntrIdGrpT(char* testCaseNum , const char *root) {
	flxFutCntrIdGrpT vflxFutCntrIdGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vflxFutCntrIdGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.flxFutCntrIdGrpT.prodId", lprodId);
	memcpy(vflxFutCntrIdGrpT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vflxFutCntrIdGrpT.cntrExpDat[i]= ' ';
	}
	char lcntrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.flxFutCntrIdGrpT.cntrExpDat", lcntrExpDat);
	memcpy(vflxFutCntrIdGrpT.cntrExpDat, lcntrExpDat, DRIV_DATE_LEN);

	char lcrtSetlTyp[1] = {""};
	getStrProperty("DRIV_common_structs.flxFutCntrIdGrpT.crtSetlTyp", lcrtSetlTyp);
	vflxFutCntrIdGrpT.crtSetlTyp = lcrtSetlTyp[0];
	return vflxFutCntrIdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
flxOptCntrIdGrpT getFlxOptCntrIdGrpT(char* testCaseNum , const char *root) {
	flxOptCntrIdGrpT vflxOptCntrIdGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vflxOptCntrIdGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.flxOptCntrIdGrpT.prodId", lprodId);
	memcpy(vflxOptCntrIdGrpT.prodId, lprodId, PROD_ID_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("DRIV_common_structs.flxOptCntrIdGrpT.cntrClasCod", lcntrClasCod);
	vflxOptCntrIdGrpT.cntrClasCod = lcntrClasCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vflxOptCntrIdGrpT.cntrExpDat[i]= ' ';
	}
	char lcntrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.flxOptCntrIdGrpT.cntrExpDat", lcntrExpDat);
	memcpy(vflxOptCntrIdGrpT.cntrExpDat, lcntrExpDat, DRIV_DATE_LEN);

	for(i=0;i<FLX_OPT_CNTR_EXER_PRC_LEN;i++) {
		vflxOptCntrIdGrpT.flxOptCntrExerPrc[i]= ' ';
	}
	char lflxOptCntrExerPrc[FLX_OPT_CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("DRIV_common_structs.flxOptCntrIdGrpT.flxOptCntrExerPrc", lflxOptCntrExerPrc);
	memcpy(vflxOptCntrIdGrpT.flxOptCntrExerPrc, lflxOptCntrExerPrc, FLX_OPT_CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("DRIV_common_structs.flxOptCntrIdGrpT.cntrVersNo", lcntrVersNo);
	vflxOptCntrIdGrpT.cntrVersNo = lcntrVersNo[0];

	char lexerStylTyp[1] = {""};
	getStrProperty("DRIV_common_structs.flxOptCntrIdGrpT.exerStylTyp", lexerStylTyp);
	vflxOptCntrIdGrpT.exerStylTyp = lexerStylTyp[0];

	char lcrtSetlTyp[1] = {""};
	getStrProperty("DRIV_common_structs.flxOptCntrIdGrpT.crtSetlTyp", lcrtSetlTyp);
	vflxOptCntrIdGrpT.crtSetlTyp = lcrtSetlTyp[0];
	return vflxOptCntrIdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDLegSeqNoT getFutBscDLegSeqNoT(char* testCaseNum , const char *root) {
	futBscDLegSeqNoT vfutBscDLegSeqNoT;
	int i;

	for(i=0;i<DRIV_STM_SEQ_NO_LEN;i++) {
		vfutBscDLegSeqNoT.stmSeqNo[i]= ' ';
	}
	char lstmSeqNo[DRIV_STM_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.futBscDLegSeqNoT.stmSeqNo", lstmSeqNo);
	memcpy(vfutBscDLegSeqNoT.stmSeqNo, lstmSeqNo, DRIV_STM_SEQ_NO_LEN);

	for(i=0;i<PROD_SEQ_NO_LEN;i++) {
		vfutBscDLegSeqNoT.prodSeqNo[i]= ' ';
	}
	char lprodSeqNo[PROD_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.futBscDLegSeqNoT.prodSeqNo", lprodSeqNo);
	memcpy(vfutBscDLegSeqNoT.prodSeqNo, lprodSeqNo, PROD_SEQ_NO_LEN);
	return vfutBscDLegSeqNoT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSeqNoT getFutBscSeqNoT(char* testCaseNum , const char *root) {
	futBscSeqNoT vfutBscSeqNoT;
	int i;

	for(i=0;i<DRIV_STM_SEQ_NO_LEN;i++) {
		vfutBscSeqNoT.stmSeqNo[i]= ' ';
	}
	char lstmSeqNo[DRIV_STM_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.futBscSeqNoT.stmSeqNo", lstmSeqNo);
	memcpy(vfutBscSeqNoT.stmSeqNo, lstmSeqNo, DRIV_STM_SEQ_NO_LEN);

	for(i=0;i<PROD_SEQ_NO_LEN;i++) {
		vfutBscSeqNoT.prodSeqNo[i]= ' ';
	}
	char lprodSeqNo[PROD_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.futBscSeqNoT.prodSeqNo", lprodSeqNo);
	memcpy(vfutBscSeqNoT.prodSeqNo, lprodSeqNo, PROD_SEQ_NO_LEN);

	for(i=0;i<CNTR_SEQ_NO_LEN;i++) {
		vfutBscSeqNoT.cntrSeqNo[i]= ' ';
	}
	char lcntrSeqNo[CNTR_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.futBscSeqNoT.cntrSeqNo", lcntrSeqNo);
	memcpy(vfutBscSeqNoT.cntrSeqNo, lcntrSeqNo, CNTR_SEQ_NO_LEN);
	return vfutBscSeqNoT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futCntrId2GrpT getFutCntrId2GrpT(char* testCaseNum , const char *root) {
	futCntrId2GrpT vfutCntrId2GrpT;
	int i;

	for(i=0;i<CNTR_EXP_MTH_DAT2_LEN;i++) {
		vfutCntrId2GrpT.cntrExpMthDat2[i]= ' ';
	}
	char lcntrExpMthDat2[CNTR_EXP_MTH_DAT2_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrId2GrpT.cntrExpMthDat2", lcntrExpMthDat2);
	memcpy(vfutCntrId2GrpT.cntrExpMthDat2, lcntrExpMthDat2, CNTR_EXP_MTH_DAT2_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT2_LEN;i++) {
		vfutCntrId2GrpT.cntrExpYrDat2[i]= ' ';
	}
	char lcntrExpYrDat2[CNTR_EXP_YR_DAT2_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrId2GrpT.cntrExpYrDat2", lcntrExpYrDat2);
	memcpy(vfutCntrId2GrpT.cntrExpYrDat2, lcntrExpYrDat2, CNTR_EXP_YR_DAT2_LEN);
	return vfutCntrId2GrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futCntrIdGrpFromT getFutCntrIdGrpFromT(char* testCaseNum , const char *root) {
	futCntrIdGrpFromT vfutCntrIdGrpFromT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutCntrIdGrpFromT.prodIdFrom[i]= ' ';
	}
	char lprodIdFrom[PROD_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrIdGrpFromT.prodIdFrom", lprodIdFrom);
	memcpy(vfutCntrIdGrpFromT.prodIdFrom, lprodIdFrom, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutCntrIdGrpFromT.cntrExpMthDatFrom[i]= ' ';
	}
	char lcntrExpMthDatFrom[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrIdGrpFromT.cntrExpMthDatFrom", lcntrExpMthDatFrom);
	memcpy(vfutCntrIdGrpFromT.cntrExpMthDatFrom, lcntrExpMthDatFrom, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutCntrIdGrpFromT.cntrExpYrDatFrom[i]= ' ';
	}
	char lcntrExpYrDatFrom[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrIdGrpFromT.cntrExpYrDatFrom", lcntrExpYrDatFrom);
	memcpy(vfutCntrIdGrpFromT.cntrExpYrDatFrom, lcntrExpYrDatFrom, CNTR_EXP_YR_DAT_LEN);
	return vfutCntrIdGrpFromT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futCntrIdGrpToT getFutCntrIdGrpToT(char* testCaseNum , const char *root) {
	futCntrIdGrpToT vfutCntrIdGrpToT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutCntrIdGrpToT.prodIdTo[i]= ' ';
	}
	char lprodIdTo[PROD_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrIdGrpToT.prodIdTo", lprodIdTo);
	memcpy(vfutCntrIdGrpToT.prodIdTo, lprodIdTo, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutCntrIdGrpToT.cntrExpMthDatTo[i]= ' ';
	}
	char lcntrExpMthDatTo[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrIdGrpToT.cntrExpMthDatTo", lcntrExpMthDatTo);
	memcpy(vfutCntrIdGrpToT.cntrExpMthDatTo, lcntrExpMthDatTo, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutCntrIdGrpToT.cntrExpYrDatTo[i]= ' ';
	}
	char lcntrExpYrDatTo[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrIdGrpToT.cntrExpYrDatTo", lcntrExpYrDatTo);
	memcpy(vfutCntrIdGrpToT.cntrExpYrDatTo, lcntrExpYrDatTo, CNTR_EXP_YR_DAT_LEN);
	return vfutCntrIdGrpToT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futCntrListGrpT getFutCntrListGrpT(char* testCaseNum , const char *root) {
	futCntrListGrpT vfutCntrListGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutCntrListGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrListGrpT.prodId", lprodId);
	memcpy(vfutCntrListGrpT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutCntrListGrpT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrListGrpT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutCntrListGrpT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutCntrListGrpT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.futCntrListGrpT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutCntrListGrpT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	char lcntrStsCod[1] = {""};
	getStrProperty("DRIV_common_structs.futCntrListGrpT.cntrStsCod", lcntrStsCod);
	vfutCntrListGrpT.cntrStsCod = lcntrStsCod[0];
	return vfutCntrListGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
givUpCtctGrpT getGivUpCtctGrpT(char* testCaseNum , const char *root) {
	givUpCtctGrpT vgivUpCtctGrpT;
	int i;

	for(i=0;i<DRIV_GIV_UP_CTCT_PSN_LEN;i++) {
		vgivUpCtctGrpT.givUpCtctPsn[i]= ' ';
	}
	char lgivUpCtctPsn[DRIV_GIV_UP_CTCT_PSN_LEN] = {""};
	getStrProperty("DRIV_common_structs.givUpCtctGrpT.givUpCtctPsn", lgivUpCtctPsn);
	memcpy(vgivUpCtctGrpT.givUpCtctPsn, lgivUpCtctPsn, DRIV_GIV_UP_CTCT_PSN_LEN);

	for(i=0;i<DRIV_GIV_UP_CTCT_PSN_PHN_LEN;i++) {
		vgivUpCtctGrpT.givUpCtctPsnPhn[i]= ' ';
	}
	char lgivUpCtctPsnPhn[DRIV_GIV_UP_CTCT_PSN_PHN_LEN] = {""};
	getStrProperty("DRIV_common_structs.givUpCtctGrpT.givUpCtctPsnPhn", lgivUpCtctPsnPhn);
	memcpy(vgivUpCtctGrpT.givUpCtctPsnPhn, lgivUpCtctPsnPhn, DRIV_GIV_UP_CTCT_PSN_PHN_LEN);

	for(i=0;i<DRIV_GIV_UP_CTCT_PSN_TLX_LEN;i++) {
		vgivUpCtctGrpT.givUpCtctPsnTlx[i]= ' ';
	}
	char lgivUpCtctPsnTlx[DRIV_GIV_UP_CTCT_PSN_TLX_LEN] = {""};
	getStrProperty("DRIV_common_structs.givUpCtctGrpT.givUpCtctPsnTlx", lgivUpCtctPsnTlx);
	memcpy(vgivUpCtctGrpT.givUpCtctPsnTlx, lgivUpCtctPsnTlx, DRIV_GIV_UP_CTCT_PSN_TLX_LEN);
	return vgivUpCtctGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
gutGrpT getGutGrpT(char* testCaseNum , const char *root) {
	gutGrpT vgutGrpT;
	int i;

	for(i=0;i<GUT_CTPY_LEN;i++) {
		vgutGrpT.gutCtpy[i]= ' ';
	}
	char lgutCtpy[GUT_CTPY_LEN] = {""};
	getStrProperty("DRIV_common_structs.gutGrpT.gutCtpy", lgutCtpy);
	memcpy(vgutGrpT.gutCtpy, lgutCtpy, GUT_CTPY_LEN);

	for(i=0;i<GUT_REF_CUST_LEN;i++) {
		vgutGrpT.gutRefCust[i]= ' ';
	}
	char lgutRefCust[GUT_REF_CUST_LEN] = {""};
	getStrProperty("DRIV_common_structs.gutGrpT.gutRefCust", lgutRefCust);
	memcpy(vgutGrpT.gutRefCust, lgutRefCust, GUT_REF_CUST_LEN);

	for(i=0;i<GUT_REF_USER_ORDR_NUM_LEN;i++) {
		vgutGrpT.gutRefUserOrdrNum[i]= ' ';
	}
	char lgutRefUserOrdrNum[GUT_REF_USER_ORDR_NUM_LEN] = {""};
	getStrProperty("DRIV_common_structs.gutGrpT.gutRefUserOrdrNum", lgutRefUserOrdrNum);
	memcpy(vgutGrpT.gutRefUserOrdrNum, lgutRefUserOrdrNum, GUT_REF_USER_ORDR_NUM_LEN);

	for(i=0;i<GUT_REF_TEXT_LEN;i++) {
		vgutGrpT.gutRefText[i]= ' ';
	}
	char lgutRefText[GUT_REF_TEXT_LEN] = {""};
	getStrProperty("DRIV_common_structs.gutGrpT.gutRefText", lgutRefText);
	memcpy(vgutGrpT.gutRefText, lgutRefText, GUT_REF_TEXT_LEN);

	char lgutSts[1] = {""};
	getStrProperty("DRIV_common_structs.gutGrpT.gutSts", lgutSts);
	vgutGrpT.gutSts = lgutSts[0];
	return vgutGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
occCntrIdGrpT getOccCntrIdGrpT(char* testCaseNum , const char *root) {
	occCntrIdGrpT voccCntrIdGrpT;
	int i;

	for(i=0;i<OCC_ROOT_ID_LEN;i++) {
		voccCntrIdGrpT.occRootId[i]= ' ';
	}
	char loccRootId[OCC_ROOT_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.occCntrIdGrpT.occRootId", loccRootId);
	memcpy(voccCntrIdGrpT.occRootId, loccRootId, OCC_ROOT_ID_LEN);

	for(i=0;i<OCC_CFI_LEN;i++) {
		voccCntrIdGrpT.occCfi[i]= ' ';
	}
	char loccCfi[OCC_CFI_LEN] = {""};
	getStrProperty("DRIV_common_structs.occCntrIdGrpT.occCfi", loccCfi);
	memcpy(voccCntrIdGrpT.occCfi, loccCfi, OCC_CFI_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voccCntrIdGrpT.occExpDat[i]= ' ';
	}
	char loccExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.occCntrIdGrpT.occExpDat", loccExpDat);
	memcpy(voccCntrIdGrpT.occExpDat, loccExpDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_OCC_EXER_PRC_DSCR_LEN;i++) {
		voccCntrIdGrpT.occExerPrc[i]= ' ';
	}
	char loccExerPrc[DRIV_OCC_EXER_PRC_DSCR_LEN] = {""};
	getStrProperty("DRIV_common_structs.occCntrIdGrpT.occExerPrc", loccExerPrc);
	memcpy(voccCntrIdGrpT.occExerPrc, loccExerPrc, DRIV_OCC_EXER_PRC_DSCR_LEN);
	return voccCntrIdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscSeqNoT getOptBscSeqNoT(char* testCaseNum , const char *root) {
	optBscSeqNoT voptBscSeqNoT;
	int i;

	for(i=0;i<DRIV_STM_SEQ_NO_LEN;i++) {
		voptBscSeqNoT.stmSeqNo[i]= ' ';
	}
	char lstmSeqNo[DRIV_STM_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.optBscSeqNoT.stmSeqNo", lstmSeqNo);
	memcpy(voptBscSeqNoT.stmSeqNo, lstmSeqNo, DRIV_STM_SEQ_NO_LEN);

	for(i=0;i<PROD_SEQ_NO_LEN;i++) {
		voptBscSeqNoT.prodSeqNo[i]= ' ';
	}
	char lprodSeqNo[PROD_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.optBscSeqNoT.prodSeqNo", lprodSeqNo);
	memcpy(voptBscSeqNoT.prodSeqNo, lprodSeqNo, PROD_SEQ_NO_LEN);

	for(i=0;i<CNTR_SEQ_NO_LEN;i++) {
		voptBscSeqNoT.cntrSeqNo[i]= ' ';
	}
	char lcntrSeqNo[CNTR_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.optBscSeqNoT.cntrSeqNo", lcntrSeqNo);
	memcpy(voptBscSeqNoT.cntrSeqNo, lcntrSeqNo, CNTR_SEQ_NO_LEN);
	return voptBscSeqNoT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optCntrIdGrpT getOptCntrIdGrpT(char* testCaseNum , const char *root) {
	optCntrIdGrpT voptCntrIdGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		voptCntrIdGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.optCntrIdGrpT.prodId", lprodId);
	memcpy(voptCntrIdGrpT.prodId, lprodId, PROD_ID_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("DRIV_common_structs.optCntrIdGrpT.cntrClasCod", lcntrClasCod);
	voptCntrIdGrpT.cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		voptCntrIdGrpT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.optCntrIdGrpT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(voptCntrIdGrpT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		voptCntrIdGrpT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.optCntrIdGrpT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(voptCntrIdGrpT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		voptCntrIdGrpT.cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("DRIV_common_structs.optCntrIdGrpT.cntrExerPrc", lcntrExerPrc);
	memcpy(voptCntrIdGrpT.cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("DRIV_common_structs.optCntrIdGrpT.cntrVersNo", lcntrVersNo);
	voptCntrIdGrpT.cntrVersNo = lcntrVersNo[0];
	return voptCntrIdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optCntrListGrpT getOptCntrListGrpT(char* testCaseNum , const char *root) {
	optCntrListGrpT voptCntrListGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		voptCntrListGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.optCntrListGrpT.prodId", lprodId);
	memcpy(voptCntrListGrpT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		voptCntrListGrpT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.optCntrListGrpT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(voptCntrListGrpT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		voptCntrListGrpT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.optCntrListGrpT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(voptCntrListGrpT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		voptCntrListGrpT.cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("DRIV_common_structs.optCntrListGrpT.cntrExerPrc", lcntrExerPrc);
	memcpy(voptCntrListGrpT.cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("DRIV_common_structs.optCntrListGrpT.cntrVersNo", lcntrVersNo);
	voptCntrListGrpT.cntrVersNo = lcntrVersNo[0];

	char lcntrStsCod[1] = {""};
	getStrProperty("DRIV_common_structs.optCntrListGrpT.cntrStsCod", lcntrStsCod);
	voptCntrListGrpT.cntrStsCod = lcntrStsCod[0];

	char llepoInd[1] = {""};
	getStrProperty("DRIV_common_structs.optCntrListGrpT.lepoInd", llepoInd);
	voptCntrListGrpT.lepoInd = llepoInd[0];
	return voptCntrListGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
origGuTuTrnGrpT getOrigGuTuTrnGrpT(char* testCaseNum , const char *root) {
	origGuTuTrnGrpT vorigGuTuTrnGrpT;
	int i;

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vorigGuTuTrnGrpT.origExchIdCod[i]= ' ';
	}
	char lorigExchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.origGuTuTrnGrpT.origExchIdCod", lorigExchIdCod);
	memcpy(vorigGuTuTrnGrpT.origExchIdCod, lorigExchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<ORIG_TRN_ID_NO_LEN;i++) {
		vorigGuTuTrnGrpT.origTrnIdNo[i]= ' ';
	}
	char lorigTrnIdNo[ORIG_TRN_ID_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.origGuTuTrnGrpT.origTrnIdNo", lorigTrnIdNo);
	memcpy(vorigGuTuTrnGrpT.origTrnIdNo, lorigTrnIdNo, ORIG_TRN_ID_NO_LEN);

	for(i=0;i<ORIG_ORDR_NO_LEN;i++) {
		vorigGuTuTrnGrpT.origOrdrNo[i]= ' ';
	}
	char lorigOrdrNo[ORIG_ORDR_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.origGuTuTrnGrpT.origOrdrNo", lorigOrdrNo);
	memcpy(vorigGuTuTrnGrpT.origOrdrNo, lorigOrdrNo, ORIG_ORDR_NO_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vorigGuTuTrnGrpT.origTrnDat[i]= ' ';
	}
	char lorigTrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.origGuTuTrnGrpT.origTrnDat", lorigTrnDat);
	memcpy(vorigGuTuTrnGrpT.origTrnDat, lorigTrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vorigGuTuTrnGrpT.origTrnDatCet[i]= ' ';
	}
	char lorigTrnDatCet[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.origGuTuTrnGrpT.origTrnDatCet", lorigTrnDatCet);
	memcpy(vorigGuTuTrnGrpT.origTrnDatCet, lorigTrnDatCet, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORIG_CNTR_ID_LEN;i++) {
		vorigGuTuTrnGrpT.origCntrId[i]= ' ';
	}
	char lorigCntrId[DRIV_ORIG_CNTR_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.origGuTuTrnGrpT.origCntrId", lorigCntrId);
	memcpy(vorigGuTuTrnGrpT.origCntrId, lorigCntrId, DRIV_ORIG_CNTR_ID_LEN);
	return vorigGuTuTrnGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
origTrnFiltGrpT getOrigTrnFiltGrpT(char* testCaseNum , const char *root) {
	origTrnFiltGrpT vorigTrnFiltGrpT;
	int i;

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vorigTrnFiltGrpT.origExchIdCod[i]= ' ';
	}
	char lorigExchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnFiltGrpT.origExchIdCod", lorigExchIdCod);
	memcpy(vorigTrnFiltGrpT.origExchIdCod, lorigExchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<ORIG_TRN_ID_NO_LEN;i++) {
		vorigTrnFiltGrpT.origTrnIdNo[i]= ' ';
	}
	char lorigTrnIdNo[ORIG_TRN_ID_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnFiltGrpT.origTrnIdNo", lorigTrnIdNo);
	memcpy(vorigTrnFiltGrpT.origTrnIdNo, lorigTrnIdNo, ORIG_TRN_ID_NO_LEN);

	for(i=0;i<ORIG_ORDR_NO_LEN;i++) {
		vorigTrnFiltGrpT.origOrdrNo[i]= ' ';
	}
	char lorigOrdrNo[ORIG_ORDR_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnFiltGrpT.origOrdrNo", lorigOrdrNo);
	memcpy(vorigTrnFiltGrpT.origOrdrNo, lorigOrdrNo, ORIG_ORDR_NO_LEN);
	return vorigTrnFiltGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
origTrnGrpT getOrigTrnGrpT(char* testCaseNum , const char *root) {
	origTrnGrpT vorigTrnGrpT;
	int i;

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vorigTrnGrpT.origExchIdCod[i]= ' ';
	}
	char lorigExchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnGrpT.origExchIdCod", lorigExchIdCod);
	memcpy(vorigTrnGrpT.origExchIdCod, lorigExchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<ORIG_TRN_ID_NO_LEN;i++) {
		vorigTrnGrpT.origTrnIdNo[i]= ' ';
	}
	char lorigTrnIdNo[ORIG_TRN_ID_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnGrpT.origTrnIdNo", lorigTrnIdNo);
	memcpy(vorigTrnGrpT.origTrnIdNo, lorigTrnIdNo, ORIG_TRN_ID_NO_LEN);

	for(i=0;i<ORIG_ORDR_NO_LEN;i++) {
		vorigTrnGrpT.origOrdrNo[i]= ' ';
	}
	char lorigOrdrNo[ORIG_ORDR_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnGrpT.origOrdrNo", lorigOrdrNo);
	memcpy(vorigTrnGrpT.origOrdrNo, lorigOrdrNo, ORIG_ORDR_NO_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vorigTrnGrpT.origTrnDat[i]= ' ';
	}
	char lorigTrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnGrpT.origTrnDat", lorigTrnDat);
	memcpy(vorigTrnGrpT.origTrnDat, lorigTrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vorigTrnGrpT.origTrnTim[i]= ' ';
	}
	char lorigTrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnGrpT.origTrnTim", lorigTrnTim);
	memcpy(vorigTrnGrpT.origTrnTim, lorigTrnTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vorigTrnGrpT.origTrnDatCet[i]= ' ';
	}
	char lorigTrnDatCet[DRIV_DATE_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnGrpT.origTrnDatCet", lorigTrnDatCet);
	memcpy(vorigTrnGrpT.origTrnDatCet, lorigTrnDatCet, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vorigTrnGrpT.origTrnTimCet[i]= ' ';
	}
	char lorigTrnTimCet[DRIV_TIME_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnGrpT.origTrnTimCet", lorigTrnTimCet);
	memcpy(vorigTrnGrpT.origTrnTimCet, lorigTrnTimCet, DRIV_TIME_LEN);

	for(i=0;i<DRIV_ORIG_CNTR_ID_LEN;i++) {
		vorigTrnGrpT.origCntrId[i]= ' ';
	}
	char lorigCntrId[DRIV_ORIG_CNTR_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.origTrnGrpT.origCntrId", lorigCntrId);
	memcpy(vorigTrnGrpT.origCntrId, lorigCntrId, DRIV_ORIG_CNTR_ID_LEN);
	return vorigTrnGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
pinGrpT getPinGrpT(char* testCaseNum , const char *root) {
	pinGrpT vpinGrpT;
	int i;

	for(i=0;i<PIN_LEN;i++) {
		vpinGrpT.pin[i]= ' ';
	}
	char lpin[PIN_LEN] = {""};
	getStrProperty("DRIV_common_structs.pinGrpT.pin", lpin);
	memcpy(vpinGrpT.pin, lpin, PIN_LEN);

	char lpinProcMis[1] = {""};
	getStrProperty("DRIV_common_structs.pinGrpT.pinProcMis", lpinProcMis);
	vpinGrpT.pinProcMis = lpinProcMis[0];

	char lpinProcTob[1] = {""};
	getStrProperty("DRIV_common_structs.pinGrpT.pinProcTob", lpinProcTob);
	vpinGrpT.pinProcTob = lpinProcTob[0];

	char lpinProcOtc[1] = {""};
	getStrProperty("DRIV_common_structs.pinGrpT.pinProcOtc", lpinProcOtc);
	vpinGrpT.pinProcOtc = lpinProcOtc[0];
	return vpinGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
prcStepTblGrpT getPrcStepTblGrpT(char* testCaseNum , const char *root) {
	prcStepTblGrpT vprcStepTblGrpT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vprcStepTblGrpT.prcUppVald[i]= ' ';
	}
	char lprcUppVald[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.prcStepTblGrpT.prcUppVald", lprcUppVald);
	memcpy(vprcStepTblGrpT.prcUppVald, lprcUppVald, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vprcStepTblGrpT.prcStep[i]= ' ';
	}
	char lprcStep[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.prcStepTblGrpT.prcStep", lprcStep);
	memcpy(vprcStepTblGrpT.prcStep, lprcStep, DRIV_PRICE_LEN);
	return vprcStepTblGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
prodAsgnGrpT getProdAsgnGrpT(char* testCaseNum , const char *root) {
	prodAsgnGrpT vprodAsgnGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vprodAsgnGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DRIV_common_structs.prodAsgnGrpT.prodId", lprodId);
	memcpy(vprodAsgnGrpT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vprodAsgnGrpT.maxOrdrQty[i]= ' ';
	}
	char lmaxOrdrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DRIV_common_structs.prodAsgnGrpT.maxOrdrQty", lmaxOrdrQty);
	memcpy(vprodAsgnGrpT.maxOrdrQty, lmaxOrdrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vprodAsgnGrpT.maxCalSprdQty[i]= ' ';
	}
	char lmaxCalSprdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DRIV_common_structs.prodAsgnGrpT.maxCalSprdQty", lmaxCalSprdQty);
	memcpy(vprodAsgnGrpT.maxCalSprdQty, lmaxCalSprdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vprodAsgnGrpT.maxWhsQty[i]= ' ';
	}
	char lmaxWhsQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DRIV_common_structs.prodAsgnGrpT.maxWhsQty", lmaxWhsQty);
	memcpy(vprodAsgnGrpT.maxWhsQty, lmaxWhsQty, DRIV_VOLUME_LEN);
	return vprodAsgnGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
prodGrpIdGrpT getProdGrpIdGrpT(char* testCaseNum , const char *root) {
	prodGrpIdGrpT vprodGrpIdGrpT;
	int i;

	char lprodGrpUsgTyp[1] = {""};
	getStrProperty("DRIV_common_structs.prodGrpIdGrpT.prodGrpUsgTyp", lprodGrpUsgTyp);
	vprodGrpIdGrpT.prodGrpUsgTyp = lprodGrpUsgTyp[0];

	for(i=0;i<PROD_GRP_NAM_LEN;i++) {
		vprodGrpIdGrpT.prodGrpNam[i]= ' ';
	}
	char lprodGrpNam[PROD_GRP_NAM_LEN] = {""};
	getStrProperty("DRIV_common_structs.prodGrpIdGrpT.prodGrpNam", lprodGrpNam);
	memcpy(vprodGrpIdGrpT.prodGrpNam, lprodGrpNam, PROD_GRP_NAM_LEN);
	return vprodGrpIdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
prodMargDataGrpT getProdMargDataGrpT(char* testCaseNum , const char *root) {
	prodMargDataGrpT vprodMargDataGrpT;
	int i;

	for(i=0;i<MGN_CLAS_COD_LEN;i++) {
		vprodMargDataGrpT.mgnClasCod[i]= ' ';
	}
	char lmgnClasCod[MGN_CLAS_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.prodMargDataGrpT.mgnClasCod", lmgnClasCod);
	memcpy(vprodMargDataGrpT.mgnClasCod, lmgnClasCod, MGN_CLAS_COD_LEN);

	for(i=0;i<HIST_VOL_LEN;i++) {
		vprodMargDataGrpT.histVol[i]= ' ';
	}
	char lhistVol[HIST_VOL_LEN] = {""};
	getStrProperty("DRIV_common_structs.prodMargDataGrpT.histVol", lhistVol);
	memcpy(vprodMargDataGrpT.histVol, lhistVol, HIST_VOL_LEN);

	char lhistVolCod[1] = {""};
	getStrProperty("DRIV_common_structs.prodMargDataGrpT.histVolCod", lhistVolCod);
	vprodMargDataGrpT.histVolCod = lhistVolCod[0];

	char lmgnStylTyp[1] = {""};
	getStrProperty("DRIV_common_structs.prodMargDataGrpT.mgnStylTyp", lmgnStylTyp);
	vprodMargDataGrpT.mgnStylTyp = lmgnStylTyp[0];
	return vprodMargDataGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
prodSeqNoGrpT getProdSeqNoGrpT(char* testCaseNum , const char *root) {
	prodSeqNoGrpT vprodSeqNoGrpT;
	int i;

	for(i=0;i<DRIV_STM_SEQ_NO_LEN;i++) {
		vprodSeqNoGrpT.stmSeqNo[i]= ' ';
	}
	char lstmSeqNo[DRIV_STM_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.prodSeqNoGrpT.stmSeqNo", lstmSeqNo);
	memcpy(vprodSeqNoGrpT.stmSeqNo, lstmSeqNo, DRIV_STM_SEQ_NO_LEN);

	for(i=0;i<PROD_SEQ_NO_LEN;i++) {
		vprodSeqNoGrpT.prodSeqNo[i]= ' ';
	}
	char lprodSeqNo[PROD_SEQ_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.prodSeqNoGrpT.prodSeqNo", lprodSeqNo);
	memcpy(vprodSeqNoGrpT.prodSeqNo, lprodSeqNo, PROD_SEQ_NO_LEN);
	return vprodSeqNoGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
prstGrpT getPrstGrpT(char* testCaseNum , const char *root) {
	prstGrpT vprstGrpT;
	int i;

	char lprstTypeCod[1] = {""};
	getStrProperty("DRIV_common_structs.prstGrpT.prstTypeCod", lprstTypeCod);
	vprstGrpT.prstTypeCod = lprstTypeCod[0];

	for(i=0;i<PRST_TRN_COD_LEN;i++) {
		vprstGrpT.prstTrnCod[i]= ' ';
	}
	char lprstTrnCod[PRST_TRN_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.prstGrpT.prstTrnCod", lprstTrnCod);
	memcpy(vprstGrpT.prstTrnCod, lprstTrnCod, PRST_TRN_COD_LEN);

	char lprstState[1] = {""};
	getStrProperty("DRIV_common_structs.prstGrpT.prstState", lprstState);
	vprstGrpT.prstState = lprstState[0];
	return vprstGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
prvCrsCurrHrctGrpT getPrvCrsCurrHrctGrpT(char* testCaseNum , const char *root) {
	prvCrsCurrHrctGrpT vprvCrsCurrHrctGrpT;
	int i;

	for(i=0;i<CRS_CURR_HRCT_PCNT_LEN;i++) {
		vprvCrsCurrHrctGrpT.prvCrsCurrHrctPcnt[i]= ' ';
	}
	char lprvCrsCurrHrctPcnt[CRS_CURR_HRCT_PCNT_LEN] = {""};
	getStrProperty("DRIV_common_structs.prvCrsCurrHrctGrpT.prvCrsCurrHrctPcnt", lprvCrsCurrHrctPcnt);
	memcpy(vprvCrsCurrHrctGrpT.prvCrsCurrHrctPcnt, lprvCrsCurrHrctPcnt, CRS_CURR_HRCT_PCNT_LEN);

	for(i=0;i<ADJ_EXCH_RAT_DBT_LEN;i++) {
		vprvCrsCurrHrctGrpT.prvAdjExchRatDbt[i]= ' ';
	}
	char lprvAdjExchRatDbt[ADJ_EXCH_RAT_DBT_LEN] = {""};
	getStrProperty("DRIV_common_structs.prvCrsCurrHrctGrpT.prvAdjExchRatDbt", lprvAdjExchRatDbt);
	memcpy(vprvCrsCurrHrctGrpT.prvAdjExchRatDbt, lprvAdjExchRatDbt, ADJ_EXCH_RAT_DBT_LEN);

	for(i=0;i<ADJ_EXCH_RAT_CRDT_LEN;i++) {
		vprvCrsCurrHrctGrpT.prvAdjExchRatCrdt[i]= ' ';
	}
	char lprvAdjExchRatCrdt[ADJ_EXCH_RAT_CRDT_LEN] = {""};
	getStrProperty("DRIV_common_structs.prvCrsCurrHrctGrpT.prvAdjExchRatCrdt", lprvAdjExchRatCrdt);
	memcpy(vprvCrsCurrHrctGrpT.prvAdjExchRatCrdt, lprvAdjExchRatCrdt, ADJ_EXCH_RAT_CRDT_LEN);
	return vprvCrsCurrHrctGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
pstAddGrpT getPstAddGrpT(char* testCaseNum , const char *root) {
	pstAddGrpT vpstAddGrpT;
	int i;

	for(i=0;i<DRIV_ADD_STR1_LEN;i++) {
		vpstAddGrpT.addStr1[i]= ' ';
	}
	char laddStr1[DRIV_ADD_STR1_LEN] = {""};
	getStrProperty("DRIV_common_structs.pstAddGrpT.addStr1", laddStr1);
	memcpy(vpstAddGrpT.addStr1, laddStr1, DRIV_ADD_STR1_LEN);

	for(i=0;i<DRIV_ADD_STR2_LEN;i++) {
		vpstAddGrpT.addStr2[i]= ' ';
	}
	char laddStr2[DRIV_ADD_STR2_LEN] = {""};
	getStrProperty("DRIV_common_structs.pstAddGrpT.addStr2", laddStr2);
	memcpy(vpstAddGrpT.addStr2, laddStr2, DRIV_ADD_STR2_LEN);

	for(i=0;i<DRIV_ADD_CTY_LEN;i++) {
		vpstAddGrpT.addCty[i]= ' ';
	}
	char laddCty[DRIV_ADD_CTY_LEN] = {""};
	getStrProperty("DRIV_common_structs.pstAddGrpT.addCty", laddCty);
	memcpy(vpstAddGrpT.addCty, laddCty, DRIV_ADD_CTY_LEN);

	for(i=0;i<DRIV_ADD_PST_COD_LEN;i++) {
		vpstAddGrpT.addPstCod[i]= ' ';
	}
	char laddPstCod[DRIV_ADD_PST_COD_LEN] = {""};
	getStrProperty("DRIV_common_structs.pstAddGrpT.addPstCod", laddPstCod);
	memcpy(vpstAddGrpT.addPstCod, laddPstCod, DRIV_ADD_PST_COD_LEN);

	for(i=0;i<DRIV_ADD_CTRY_LEN;i++) {
		vpstAddGrpT.addCtry[i]= ' ';
	}
	char laddCtry[DRIV_ADD_CTRY_LEN] = {""};
	getStrProperty("DRIV_common_structs.pstAddGrpT.addCtry", laddCtry);
	memcpy(vpstAddGrpT.addCtry, laddCtry, DRIV_ADD_CTRY_LEN);
	return vpstAddGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
rskLimStsGrpT getRskLimStsGrpT(char* testCaseNum , const char *root) {
	rskLimStsGrpT vrskLimStsGrpT;
	int i;

	char ltimIntvlViolCnt[1] = {""};
	getStrProperty("DRIV_common_structs.rskLimStsGrpT.timIntvlViolCnt", ltimIntvlViolCnt);
	vrskLimStsGrpT.timIntvlViolCnt = ltimIntvlViolCnt[0];

	char lwrkVolLimSts[1] = {""};
	getStrProperty("DRIV_common_structs.rskLimStsGrpT.wrkVolLimSts", lwrkVolLimSts);
	vrskLimStsGrpT.wrkVolLimSts = lwrkVolLimSts[0];

	char ldeltaLngLimSts[1] = {""};
	getStrProperty("DRIV_common_structs.rskLimStsGrpT.deltaLngLimSts", ldeltaLngLimSts);
	vrskLimStsGrpT.deltaLngLimSts = ldeltaLngLimSts[0];

	char ldeltaShtLimSts[1] = {""};
	getStrProperty("DRIV_common_structs.rskLimStsGrpT.deltaShtLimSts", ldeltaShtLimSts);
	vrskLimStsGrpT.deltaShtLimSts = ldeltaShtLimSts[0];

	char lvegaLngLimSts[1] = {""};
	getStrProperty("DRIV_common_structs.rskLimStsGrpT.vegaLngLimSts", lvegaLngLimSts);
	vrskLimStsGrpT.vegaLngLimSts = lvegaLngLimSts[0];

	char lvegaShtLimSts[1] = {""};
	getStrProperty("DRIV_common_structs.rskLimStsGrpT.vegaShtLimSts", lvegaShtLimSts);
	vrskLimStsGrpT.vegaShtLimSts = lvegaShtLimSts[0];
	return vrskLimStsGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
rskLimTimIntvlGrpT getRskLimTimIntvlGrpT(char* testCaseNum , const char *root) {
	rskLimTimIntvlGrpT vrskLimTimIntvlGrpT;
	int i;

	for(i=0;i<TIM_INTVL_SEC_LEN;i++) {
		vrskLimTimIntvlGrpT.timIntvlSec[i]= ' ';
	}
	char ltimIntvlSec[TIM_INTVL_SEC_LEN] = {""};
	getStrProperty("DRIV_common_structs.rskLimTimIntvlGrpT.timIntvlSec", ltimIntvlSec);
	memcpy(vrskLimTimIntvlGrpT.timIntvlSec, ltimIntvlSec, TIM_INTVL_SEC_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vrskLimTimIntvlGrpT.noOfTxnLim[i]= ' ';
	}
	char lnoOfTxnLim[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.rskLimTimIntvlGrpT.noOfTxnLim", lnoOfTxnLim);
	memcpy(vrskLimTimIntvlGrpT.noOfTxnLim, lnoOfTxnLim, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vrskLimTimIntvlGrpT.timVolLimQty[i]= ' ';
	}
	char ltimVolLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.rskLimTimIntvlGrpT.timVolLimQty", ltimVolLimQty);
	memcpy(vrskLimTimIntvlGrpT.timVolLimQty, ltimVolLimQty, DRIV_QUANTITY_LEN);
	return vrskLimTimIntvlGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
rskLimWrkOrdrGrpT getRskLimWrkOrdrGrpT(char* testCaseNum , const char *root) {
	rskLimWrkOrdrGrpT vrskLimWrkOrdrGrpT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vrskLimWrkOrdrGrpT.wrkVolLimQty[i]= ' ';
	}
	char lwrkVolLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.rskLimWrkOrdrGrpT.wrkVolLimQty", lwrkVolLimQty);
	memcpy(vrskLimWrkOrdrGrpT.wrkVolLimQty, lwrkVolLimQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vrskLimWrkOrdrGrpT.deltaLngLimQty[i]= ' ';
	}
	char ldeltaLngLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.rskLimWrkOrdrGrpT.deltaLngLimQty", ldeltaLngLimQty);
	memcpy(vrskLimWrkOrdrGrpT.deltaLngLimQty, ldeltaLngLimQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vrskLimWrkOrdrGrpT.deltaShtLimQty[i]= ' ';
	}
	char ldeltaShtLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.rskLimWrkOrdrGrpT.deltaShtLimQty", ldeltaShtLimQty);
	memcpy(vrskLimWrkOrdrGrpT.deltaShtLimQty, ldeltaShtLimQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vrskLimWrkOrdrGrpT.vegaLngLimQty[i]= ' ';
	}
	char lvegaLngLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.rskLimWrkOrdrGrpT.vegaLngLimQty", lvegaLngLimQty);
	memcpy(vrskLimWrkOrdrGrpT.vegaLngLimQty, lvegaLngLimQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vrskLimWrkOrdrGrpT.vegaShtLimQty[i]= ' ';
	}
	char lvegaShtLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.rskLimWrkOrdrGrpT.vegaShtLimQty", lvegaShtLimQty);
	memcpy(vrskLimWrkOrdrGrpT.vegaShtLimQty, lvegaShtLimQty, DRIV_QUANTITY_LEN);
	return vrskLimWrkOrdrGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
secuTypGrpT getSecuTypGrpT(char* testCaseNum , const char *root) {
	secuTypGrpT vsecuTypGrpT;
	int i;

	char lsecuTypPfx[1] = {""};
	getStrProperty("DRIV_common_structs.secuTypGrpT.secuTypPfx", lsecuTypPfx);
	vsecuTypGrpT.secuTypPfx = lsecuTypPfx[0];

	for(i=0;i<SECU_ID_SFX_LEN;i++) {
		vsecuTypGrpT.secuTypSfx[i]= ' ';
	}
	char lsecuTypSfx[SECU_ID_SFX_LEN] = {""};
	getStrProperty("DRIV_common_structs.secuTypGrpT.secuTypSfx", lsecuTypSfx);
	memcpy(vsecuTypGrpT.secuTypSfx, lsecuTypSfx, SECU_ID_SFX_LEN);
	return vsecuTypGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
sprdLnkRecT getSprdLnkRecT(char* testCaseNum , const char *root) {
	sprdLnkRecT vsprdLnkRecT;
	int i;

	for(i=0;i<SPRD_TBL_STRT_IDX_LEN;i++) {
		vsprdLnkRecT.sprdTblStrtIdx[i]= ' ';
	}
	char lsprdTblStrtIdx[SPRD_TBL_STRT_IDX_LEN] = {""};
	getStrProperty("DRIV_common_structs.sprdLnkRecT.sprdTblStrtIdx", lsprdTblStrtIdx);
	memcpy(vsprdLnkRecT.sprdTblStrtIdx, lsprdTblStrtIdx, SPRD_TBL_STRT_IDX_LEN);

	for(i=0;i<SPRD_TBL_END_IDX_LEN;i++) {
		vsprdLnkRecT.sprdTblEndIdx[i]= ' ';
	}
	char lsprdTblEndIdx[SPRD_TBL_END_IDX_LEN] = {""};
	getStrProperty("DRIV_common_structs.sprdLnkRecT.sprdTblEndIdx", lsprdTblEndIdx);
	memcpy(vsprdLnkRecT.sprdTblEndIdx, lsprdTblEndIdx, SPRD_TBL_END_IDX_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vsprdLnkRecT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.sprdLnkRecT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vsprdLnkRecT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vsprdLnkRecT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("DRIV_common_structs.sprdLnkRecT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vsprdLnkRecT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);
	return vsprdLnkRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
sprdTblGrpT getSprdTblGrpT(char* testCaseNum , const char *root) {
	sprdTblGrpT vsprdTblGrpT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vsprdTblGrpT.sprdBidPrc[i]= ' ';
	}
	char lsprdBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.sprdTblGrpT.sprdBidPrc", lsprdBidPrc);
	memcpy(vsprdTblGrpT.sprdBidPrc, lsprdBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<SPRD_TIC_AMT_LEN;i++) {
		vsprdTblGrpT.sprdTicAmt[i]= ' ';
	}
	char lsprdTicAmt[SPRD_TIC_AMT_LEN] = {""};
	getStrProperty("DRIV_common_structs.sprdTblGrpT.sprdTicAmt", lsprdTicAmt);
	memcpy(vsprdTblGrpT.sprdTicAmt, lsprdTicAmt, SPRD_TIC_AMT_LEN);

	char lsprdAbsPcnt[1] = {""};
	getStrProperty("DRIV_common_structs.sprdTblGrpT.sprdAbsPcnt", lsprdAbsPcnt);
	vsprdTblGrpT.sprdAbsPcnt = lsprdAbsPcnt[0];
	return vsprdTblGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
sprdTblExpGrpT getSprdTblExpGrpT(char* testCaseNum , const char *root) {
	sprdTblExpGrpT vsprdTblExpGrpT;
	int i;

	for(i=0;i<SPRD_TBL_NAM_LEN;i++) {
		vsprdTblExpGrpT.sprdTblNam[i]= ' ';
	}
	char lsprdTblNam[SPRD_TBL_NAM_LEN] = {""};
	getStrProperty("DRIV_common_structs.sprdTblExpGrpT.sprdTblNam", lsprdTblNam);
	memcpy(vsprdTblExpGrpT.sprdTblNam, lsprdTblNam, SPRD_TBL_NAM_LEN);

	for(i=0;i<SPRD_TIM_TO_EXP_LEN;i++) {
		vsprdTblExpGrpT.sprdTimToExp[i]= ' ';
	}
	char lsprdTimToExp[SPRD_TIM_TO_EXP_LEN] = {""};
	getStrProperty("DRIV_common_structs.sprdTblExpGrpT.sprdTimToExp", lsprdTimToExp);
	memcpy(vsprdTblExpGrpT.sprdTimToExp, lsprdTimToExp, SPRD_TIM_TO_EXP_LEN);
	return vsprdTblExpGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
stratEquLegGrpT getStratEquLegGrpT(char* testCaseNum , const char *root) {
	stratEquLegGrpT vstratEquLegGrpT;
	int i;

	char lstratEquLegBuyCod[1] = {""};
	getStrProperty("DRIV_common_structs.stratEquLegGrpT.stratEquLegBuyCod", lstratEquLegBuyCod);
	vstratEquLegGrpT.stratEquLegBuyCod = lstratEquLegBuyCod[0];

	for(i=0;i<STRAT_EQU_LEG_ISIN_LEN;i++) {
		vstratEquLegGrpT.stratEquLegIsin[i]= ' ';
	}
	char lstratEquLegIsin[STRAT_EQU_LEG_ISIN_LEN] = {""};
	getStrProperty("DRIV_common_structs.stratEquLegGrpT.stratEquLegIsin", lstratEquLegIsin);
	memcpy(vstratEquLegGrpT.stratEquLegIsin, lstratEquLegIsin, STRAT_EQU_LEG_ISIN_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vstratEquLegGrpT.stratEquLegPrc[i]= ' ';
	}
	char lstratEquLegPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.stratEquLegGrpT.stratEquLegPrc", lstratEquLegPrc);
	memcpy(vstratEquLegGrpT.stratEquLegPrc, lstratEquLegPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_STRAT_EQU_LEG_VOL_LEN;i++) {
		vstratEquLegGrpT.stratEquLegVol[i]= ' ';
	}
	char lstratEquLegVol[DRIV_STRAT_EQU_LEG_VOL_LEN] = {""};
	getStrProperty("DRIV_common_structs.stratEquLegGrpT.stratEquLegVol", lstratEquLegVol);
	memcpy(vstratEquLegGrpT.stratEquLegVol, lstratEquLegVol, DRIV_STRAT_EQU_LEG_VOL_LEN);
	return vstratEquLegGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
stratLegGrpT getStratLegGrpT(char* testCaseNum , const char *root) {
	stratLegGrpT vstratLegGrpT;
	int i;

	char lstratLegBuyCod[1] = {""};
	getStrProperty("DRIV_common_structs.stratLegGrpT.stratLegBuyCod", lstratLegBuyCod);
	vstratLegGrpT.stratLegBuyCod = lstratLegBuyCod[0];

	vstratLegGrpT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "stratLegGrpT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vstratLegGrpT.stratLegUndrPrc[i]= ' ';
	}
	char lstratLegUndrPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.stratLegGrpT.stratLegUndrPrc", lstratLegUndrPrc);
	memcpy(vstratLegGrpT.stratLegUndrPrc, lstratLegUndrPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vstratLegGrpT.stratLegVol[i]= ' ';
	}
	char lstratLegVol[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DRIV_common_structs.stratLegGrpT.stratLegVol", lstratLegVol);
	memcpy(vstratLegGrpT.stratLegVol, lstratLegVol, DRIV_VOLUME_LEN);
	return vstratLegGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
stratIdGrpT getStratIdGrpT(char* testCaseNum , const char *root) {
	stratIdGrpT vstratIdGrpT;
	int i;

	for(i=0;i<STRAT_TYP_LEN;i++) {
		vstratIdGrpT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("DRIV_common_structs.stratIdGrpT.stratTyp", lstratTyp);
	memcpy(vstratIdGrpT.stratTyp, lstratTyp, STRAT_TYP_LEN);
	return vstratIdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
stratLegTrdNoGrpT getStratLegTrdNoGrpT(char* testCaseNum , const char *root) {
	stratLegTrdNoGrpT vstratLegTrdNoGrpT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		vstratLegTrdNoGrpT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.stratLegTrdNoGrpT.trdNo", ltrdNo);
	memcpy(vstratLegTrdNoGrpT.trdNo, ltrdNo, TRD_NO_LEN);
	return vstratLegTrdNoGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
stratTrdNoGrpT getStratTrdNoGrpT(char* testCaseNum , const char *root) {
	stratTrdNoGrpT vstratTrdNoGrpT;
	int i;
	return vstratTrdNoGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
totTrdQtyHistRecT getTotTrdQtyHistRecT(char* testCaseNum , const char *root) {
	totTrdQtyHistRecT vtotTrdQtyHistRecT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vtotTrdQtyHistRecT.totTrdQtyHist[i]= ' ';
	}
	char ltotTrdQtyHist[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("DRIV_common_structs.totTrdQtyHistRecT.totTrdQtyHist", ltotTrdQtyHist);
	memcpy(vtotTrdQtyHistRecT.totTrdQtyHist, ltotTrdQtyHist, DRIV_QUANTITY_LEN);
	return vtotTrdQtyHistRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
totTrdQtyHistGrpT getTotTrdQtyHistGrpT(char* testCaseNum , const char *root) {
	totTrdQtyHistGrpT vtotTrdQtyHistGrpT;
	int i;
	return vtotTrdQtyHistGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
trdIdOboGrpT getTrdIdOboGrpT(char* testCaseNum , const char *root) {
	trdIdOboGrpT vtrdIdOboGrpT;
	int i;

	for(i=0;i<PART_SUB_GRP_COD_OBO_LEN;i++) {
		vtrdIdOboGrpT.partSubGrpCodObo[i]= ' ';
	}
	char lpartSubGrpCodObo[PART_SUB_GRP_COD_OBO_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdIdOboGrpT.partSubGrpCodObo", lpartSubGrpCodObo);
	memcpy(vtrdIdOboGrpT.partSubGrpCodObo, lpartSubGrpCodObo, PART_SUB_GRP_COD_OBO_LEN);

	for(i=0;i<PART_NO_OBO_LEN;i++) {
		vtrdIdOboGrpT.partNoObo[i]= ' ';
	}
	char lpartNoObo[PART_NO_OBO_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdIdOboGrpT.partNoObo", lpartNoObo);
	memcpy(vtrdIdOboGrpT.partNoObo, lpartNoObo, PART_NO_OBO_LEN);
	return vtrdIdOboGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
trdLegMtchGrpT getTrdLegMtchGrpT(char* testCaseNum , const char *root) {
	trdLegMtchGrpT vtrdLegMtchGrpT;
	int i;

	for(i=0;i<TRD_NO_LEN;i++) {
		vtrdLegMtchGrpT.trdNoLeg[i]= ' ';
	}
	char ltrdNoLeg[TRD_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdLegMtchGrpT.trdNoLeg", ltrdNoLeg);
	memcpy(vtrdLegMtchGrpT.trdNoLeg, ltrdNoLeg, TRD_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vtrdLegMtchGrpT.trdMtchQtyLeg[i]= ' ';
	}
	char ltrdMtchQtyLeg[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdLegMtchGrpT.trdMtchQtyLeg", ltrdMtchQtyLeg);
	memcpy(vtrdLegMtchGrpT.trdMtchQtyLeg, ltrdMtchQtyLeg, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vtrdLegMtchGrpT.trdMtchPrcLeg[i]= ' ';
	}
	char ltrdMtchPrcLeg[DRIV_PRICE_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdLegMtchGrpT.trdMtchPrcLeg", ltrdMtchPrcLeg);
	memcpy(vtrdLegMtchGrpT.trdMtchPrcLeg, ltrdMtchPrcLeg, DRIV_PRICE_LEN);
	return vtrdLegMtchGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
trdrIdGrpApprT getTrdrIdGrpApprT(char* testCaseNum , const char *root) {
	trdrIdGrpApprT vtrdrIdGrpApprT;
	int i;

	for(i=0;i<PART_SUB_GRP_COD_APPR_LEN;i++) {
		vtrdrIdGrpApprT.partSubGrpCodAppr[i]= ' ';
	}
	char lpartSubGrpCodAppr[PART_SUB_GRP_COD_APPR_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdrIdGrpApprT.partSubGrpCodAppr", lpartSubGrpCodAppr);
	memcpy(vtrdrIdGrpApprT.partSubGrpCodAppr, lpartSubGrpCodAppr, PART_SUB_GRP_COD_APPR_LEN);

	for(i=0;i<PART_NO_APPR_LEN;i++) {
		vtrdrIdGrpApprT.partNoAppr[i]= ' ';
	}
	char lpartNoAppr[PART_NO_APPR_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdrIdGrpApprT.partNoAppr", lpartNoAppr);
	memcpy(vtrdrIdGrpApprT.partNoAppr, lpartNoAppr, PART_NO_APPR_LEN);
	return vtrdrIdGrpApprT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
trdrIdGrpFromT getTrdrIdGrpFromT(char* testCaseNum , const char *root) {
	trdrIdGrpFromT vtrdrIdGrpFromT;
	int i;

	for(i=0;i<PART_SUB_GRP_COD_FROM_LEN;i++) {
		vtrdrIdGrpFromT.partSubGrpCodFrom[i]= ' ';
	}
	char lpartSubGrpCodFrom[PART_SUB_GRP_COD_FROM_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdrIdGrpFromT.partSubGrpCodFrom", lpartSubGrpCodFrom);
	memcpy(vtrdrIdGrpFromT.partSubGrpCodFrom, lpartSubGrpCodFrom, PART_SUB_GRP_COD_FROM_LEN);

	for(i=0;i<PART_NO_FROM_LEN;i++) {
		vtrdrIdGrpFromT.partNoFrom[i]= ' ';
	}
	char lpartNoFrom[PART_NO_FROM_LEN] = {""};
	getStrProperty("DRIV_common_structs.trdrIdGrpFromT.partNoFrom", lpartNoFrom);
	memcpy(vtrdrIdGrpFromT.partNoFrom, lpartNoFrom, PART_NO_FROM_LEN);
	return vtrdrIdGrpFromT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
trnIdSfxGrpT getTrnIdSfxGrpT(char* testCaseNum , const char *root) {
	trnIdSfxGrpT vtrnIdSfxGrpT;
	int i;

	for(i=0;i<TRN_ID_SFX_NO_LEN;i++) {
		vtrnIdSfxGrpT.trnIdSfxNo[i]= ' ';
	}
	char ltrnIdSfxNo[TRN_ID_SFX_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.trnIdSfxGrpT.trnIdSfxNo", ltrnIdSfxNo);
	memcpy(vtrnIdSfxGrpT.trnIdSfxNo, ltrnIdSfxNo, TRN_ID_SFX_NO_LEN);

	for(i=0;i<DRIV_TRN_ID_SFX_NO_PNT_LEN;i++) {
		vtrnIdSfxGrpT.trnIdSfxNoPnt[i]= ' ';
	}
	char ltrnIdSfxNoPnt[DRIV_TRN_ID_SFX_NO_PNT_LEN] = {""};
	getStrProperty("DRIV_common_structs.trnIdSfxGrpT.trnIdSfxNoPnt", ltrnIdSfxNoPnt);
	memcpy(vtrnIdSfxGrpT.trnIdSfxNoPnt, ltrnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN);

	char ltrnHistAdjInd[1] = {""};
	getStrProperty("DRIV_common_structs.trnIdSfxGrpT.trnHistAdjInd", ltrnHistAdjInd);
	vtrnIdSfxGrpT.trnHistAdjInd = ltrnHistAdjInd[0];

	char ltrnAdjStsCod[1] = {""};
	getStrProperty("DRIV_common_structs.trnIdSfxGrpT.trnAdjStsCod", ltrnAdjStsCod);
	vtrnIdSfxGrpT.trnAdjStsCod = ltrnAdjStsCod[0];
	return vtrnIdSfxGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
trnIdSfxKeyGrpT getTrnIdSfxKeyGrpT(char* testCaseNum , const char *root) {
	trnIdSfxKeyGrpT vtrnIdSfxKeyGrpT;
	int i;

	for(i=0;i<TRN_ID_SFX_NO_LEN;i++) {
		vtrnIdSfxKeyGrpT.trnIdSfxNo[i]= ' ';
	}
	char ltrnIdSfxNo[TRN_ID_SFX_NO_LEN] = {""};
	getStrProperty("DRIV_common_structs.trnIdSfxKeyGrpT.trnIdSfxNo", ltrnIdSfxNo);
	memcpy(vtrnIdSfxKeyGrpT.trnIdSfxNo, ltrnIdSfxNo, TRN_ID_SFX_NO_LEN);

	char ltrnHistAdjInd[1] = {""};
	getStrProperty("DRIV_common_structs.trnIdSfxKeyGrpT.trnHistAdjInd", ltrnHistAdjInd);
	vtrnIdSfxKeyGrpT.trnHistAdjInd = ltrnHistAdjInd[0];
	return vtrnIdSfxKeyGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
txtGrpT getTxtGrpT(char* testCaseNum , const char *root) {
	txtGrpT vtxtGrpT;
	int i;

	for(i=0;i<CUST_LEN;i++) {
		vtxtGrpT.cust[i]= ' ';
	}
	char lcust[CUST_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpT.cust", lcust);
	memcpy(vtxtGrpT.cust, lcust, CUST_LEN);

	for(i=0;i<USER_ORDR_NUM_LEN;i++) {
		vtxtGrpT.userOrdrNum[i]= ' ';
	}
	char luserOrdrNum[USER_ORDR_NUM_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpT.userOrdrNum", luserOrdrNum);
	memcpy(vtxtGrpT.userOrdrNum, luserOrdrNum, USER_ORDR_NUM_LEN);

	for(i=0;i<TEXT_LEN;i++) {
		vtxtGrpT.text[i]= ' ';
	}
	char ltext[TEXT_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpT.text", ltext);
	memcpy(vtxtGrpT.text, ltext, TEXT_LEN);
	return vtxtGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
txtGrpFiltT getTxtGrpFiltT(char* testCaseNum , const char *root) {
	txtGrpFiltT vtxtGrpFiltT;
	int i;

	for(i=0;i<DRIV_CUST_FILT_LEN;i++) {
		vtxtGrpFiltT.custFilt[i]= ' ';
	}
	char lcustFilt[DRIV_CUST_FILT_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpFiltT.custFilt", lcustFilt);
	memcpy(vtxtGrpFiltT.custFilt, lcustFilt, DRIV_CUST_FILT_LEN);

	for(i=0;i<DRIV_USER_ORDR_NUM_FILT_LEN;i++) {
		vtxtGrpFiltT.userOrdrNumFilt[i]= ' ';
	}
	char luserOrdrNumFilt[DRIV_USER_ORDR_NUM_FILT_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpFiltT.userOrdrNumFilt", luserOrdrNumFilt);
	memcpy(vtxtGrpFiltT.userOrdrNumFilt, luserOrdrNumFilt, DRIV_USER_ORDR_NUM_FILT_LEN);

	for(i=0;i<DRIV_TEXT_FILT_LEN;i++) {
		vtxtGrpFiltT.textFilt[i]= ' ';
	}
	char ltextFilt[DRIV_TEXT_FILT_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpFiltT.textFilt", ltextFilt);
	memcpy(vtxtGrpFiltT.textFilt, ltextFilt, DRIV_TEXT_FILT_LEN);
	return vtxtGrpFiltT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
txtGrpFromT getTxtGrpFromT(char* testCaseNum , const char *root) {
	txtGrpFromT vtxtGrpFromT;
	int i;

	for(i=0;i<DRIV_CUST_FROM_LEN;i++) {
		vtxtGrpFromT.custFrom[i]= ' ';
	}
	char lcustFrom[DRIV_CUST_FROM_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpFromT.custFrom", lcustFrom);
	memcpy(vtxtGrpFromT.custFrom, lcustFrom, DRIV_CUST_FROM_LEN);

	for(i=0;i<DRIV_USER_ORDR_NUM_FROM_LEN;i++) {
		vtxtGrpFromT.userOrdrNumFrom[i]= ' ';
	}
	char luserOrdrNumFrom[DRIV_USER_ORDR_NUM_FROM_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpFromT.userOrdrNumFrom", luserOrdrNumFrom);
	memcpy(vtxtGrpFromT.userOrdrNumFrom, luserOrdrNumFrom, DRIV_USER_ORDR_NUM_FROM_LEN);

	for(i=0;i<DRIV_TEXT_FROM_LEN;i++) {
		vtxtGrpFromT.textFrom[i]= ' ';
	}
	char ltextFrom[DRIV_TEXT_FROM_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpFromT.textFrom", ltextFrom);
	memcpy(vtxtGrpFromT.textFrom, ltextFrom, DRIV_TEXT_FROM_LEN);
	return vtxtGrpFromT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
txtGrpToT getTxtGrpToT(char* testCaseNum , const char *root) {
	txtGrpToT vtxtGrpToT;
	int i;

	for(i=0;i<DRIV_CUST_TO_LEN;i++) {
		vtxtGrpToT.custTo[i]= ' ';
	}
	char lcustTo[DRIV_CUST_TO_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpToT.custTo", lcustTo);
	memcpy(vtxtGrpToT.custTo, lcustTo, DRIV_CUST_TO_LEN);

	for(i=0;i<DRIV_USER_ORDR_NUM_TO_LEN;i++) {
		vtxtGrpToT.userOrdrNumTo[i]= ' ';
	}
	char luserOrdrNumTo[DRIV_USER_ORDR_NUM_TO_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpToT.userOrdrNumTo", luserOrdrNumTo);
	memcpy(vtxtGrpToT.userOrdrNumTo, luserOrdrNumTo, DRIV_USER_ORDR_NUM_TO_LEN);

	for(i=0;i<DRIV_TEXT_TO_LEN;i++) {
		vtxtGrpToT.textTo[i]= ' ';
	}
	char ltextTo[DRIV_TEXT_TO_LEN] = {""};
	getStrProperty("DRIV_common_structs.txtGrpToT.textTo", ltextTo);
	memcpy(vtxtGrpToT.textTo, ltextTo, DRIV_TEXT_TO_LEN);
	return vtxtGrpToT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcctTypCodFromGrpT(acctTypCodFromGrpT actual, acctTypCodFromGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.acctTypCodFrom!= expected.acctTypCodFrom) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In acctTypCodFromGrpT, acctTypCodFromnot matching. Actual %d but Expected %d", actual.acctTypCodFrom, expected.acctTypCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.acctTypNoFrom!= expected.acctTypNoFrom) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In acctTypCodFromGrpT, acctTypNoFromnot matching. Actual %d but Expected %d", actual.acctTypNoFrom, expected.acctTypNoFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcctTypCodGrpT(acctTypCodGrpT actual, acctTypCodGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.acctTypCod!= expected.acctTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In acctTypCodGrpT, acctTypCodnot matching. Actual %d but Expected %d", actual.acctTypCod, expected.acctTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.acctTypNo!= expected.acctTypNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In acctTypCodGrpT, acctTypNonot matching. Actual %d but Expected %d", actual.acctTypNo, expected.acctTypNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcctTypCodToGrpT(acctTypCodToGrpT actual, acctTypCodToGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.acctTypCodTo!= expected.acctTypCodTo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In acctTypCodToGrpT, acctTypCodTonot matching. Actual %d but Expected %d", actual.acctTypCodTo, expected.acctTypCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.acctTypNoTo!= expected.acctTypNoTo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In acctTypCodToGrpT, acctTypNoTonot matching. Actual %d but Expected %d", actual.acctTypNoTo, expected.acctTypNoTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcctVatParmRecT(acctVatParmRecT actual, acctVatParmRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.vatPcntBuy, expected.vatPcntBuy, VAT_PCNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In acctVatParmRecT, vatPcntBuy not matching. Actual %s but Expected %s", actual.vatPcntBuy, expected.vatPcntBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.vatPcntSell, expected.vatPcntSell, VAT_PCNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In acctVatParmRecT, vatPcntSell not matching. Actual %s but Expected %s", actual.vatPcntSell, expected.vatPcntSell);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcctVatParmGrpT(acctVatParmGrpT actual, acctVatParmGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < ACCT_VAT_PARM_MAX;i++) {
		compareAcctVatParmRecT (actual.acctVatParmRec[i],expected.acctVatParmRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBlkAuctPotPrcGrpT(blkAuctPotPrcGrpT actual, blkAuctPotPrcGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.bidExePrc, expected.bidExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In blkAuctPotPrcGrpT, bidExePrc not matching. Actual %s but Expected %s", actual.bidExePrc, expected.bidExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bidExeQty, expected.bidExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In blkAuctPotPrcGrpT, bidExeQty not matching. Actual %s but Expected %s", actual.bidExeQty, expected.bidExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.askExePrc, expected.askExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In blkAuctPotPrcGrpT, askExePrc not matching. Actual %s but Expected %s", actual.askExePrc, expected.askExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.askExeQty, expected.askExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In blkAuctPotPrcGrpT, askExeQty not matching. Actual %s but Expected %s", actual.askExeQty, expected.askExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBnkCtctGrpT(bnkCtctGrpT actual, bnkCtctGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.bnkCtctPsn, expected.bnkCtctPsn, BNK_CTCT_PSN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bnkCtctGrpT, bnkCtctPsn not matching. Actual %s but Expected %s", actual.bnkCtctPsn, expected.bnkCtctPsn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bnkCtctPsnPhn, expected.bnkCtctPsnPhn, BNK_CTCT_PSN_PHN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bnkCtctGrpT, bnkCtctPsnPhn not matching. Actual %s but Expected %s", actual.bnkCtctPsnPhn, expected.bnkCtctPsnPhn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bnkCtctPsnEMail, expected.bnkCtctPsnEMail, BNK_CTCT_PSN_EMAIL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bnkCtctGrpT, bnkCtctPsnEMail not matching. Actual %s but Expected %s", actual.bnkCtctPsnEMail, expected.bnkCtctPsnEMail);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntEbiTrdReqGrpT(bscEntEbiTrdReqGrpT actual, bscEntEbiTrdReqGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdReqGrpT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdReqGrpT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdReqGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdReqGrpT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntEbiTrdRespRecT(bscEntEbiTrdRespRecT actual, bscEntEbiTrdRespRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdRespRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdRespRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqEbiTrdRespRecT(bscInqEbiTrdRespRecT actual, bscInqEbiTrdRespRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRespRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRespRecT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRespRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRespRecT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRespRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ebiTrdApprInd!= expected.ebiTrdApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRespRecT, ebiTrdApprIndnot matching. Actual %d but Expected %d", actual.ebiTrdApprInd, expected.ebiTrdApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModEbiTrdReqGrpT(bscModEbiTrdReqGrpT actual, bscModEbiTrdReqGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdReqGrpT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdReqGrpT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdReqGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdReqGrpT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdReqGrpT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ebiTrdApprInd!= expected.ebiTrdApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdReqGrpT, ebiTrdApprIndnot matching. Actual %d but Expected %d", actual.ebiTrdApprInd, expected.ebiTrdApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModEbiTrdRespRecT(bscModEbiTrdRespRecT actual, bscModEbiTrdRespRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdRespRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdRespRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ebiTrdApprInd!= expected.ebiTrdApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdRespRecT, ebiTrdApprIndnot matching. Actual %d but Expected %d", actual.ebiTrdApprInd, expected.ebiTrdApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSeqNoT(bscSeqNoT actual, bscSeqNoT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.stmSeqNo, expected.stmSeqNo, DRIV_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSeqNoT, stmSeqNo not matching. Actual %s but Expected %s", actual.stmSeqNo, expected.stmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnSeqNo, expected.trnSeqNo, TRN_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSeqNoT, trnSeqNo not matching. Actual %s but Expected %s", actual.trnSeqNo, expected.trnSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBstOrdrGrpT(bstOrdrGrpT actual, bstOrdrGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.bstBidPrc, expected.bstBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstOrdrGrpT, bstBidPrc not matching. Actual %s but Expected %s", actual.bstBidPrc, expected.bstBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstBidQty, expected.bstBidQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstOrdrGrpT, bstBidQty not matching. Actual %s but Expected %s", actual.bstBidQty, expected.bstBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstAskPrc, expected.bstAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstOrdrGrpT, bstAskPrc not matching. Actual %s but Expected %s", actual.bstAskPrc, expected.bstAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstAskQty, expected.bstAskQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstOrdrGrpT, bstAskQty not matching. Actual %s but Expected %s", actual.bstAskQty, expected.bstAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBstQuoOrdrGrpT(bstQuoOrdrGrpT actual, bstQuoOrdrGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.bstOrdrBidPrc, expected.bstOrdrBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstQuoOrdrGrpT, bstOrdrBidPrc not matching. Actual %s but Expected %s", actual.bstOrdrBidPrc, expected.bstOrdrBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstOrdrBidQty, expected.bstOrdrBidQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstQuoOrdrGrpT, bstOrdrBidQty not matching. Actual %s but Expected %s", actual.bstOrdrBidQty, expected.bstOrdrBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstOrdrAskPrc, expected.bstOrdrAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstQuoOrdrGrpT, bstOrdrAskPrc not matching. Actual %s but Expected %s", actual.bstOrdrAskPrc, expected.bstOrdrAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstOrdrAskQty, expected.bstOrdrAskQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstQuoOrdrGrpT, bstOrdrAskQty not matching. Actual %s but Expected %s", actual.bstOrdrAskQty, expected.bstOrdrAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstQuoBidPrc, expected.bstQuoBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstQuoOrdrGrpT, bstQuoBidPrc not matching. Actual %s but Expected %s", actual.bstQuoBidPrc, expected.bstQuoBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstQuoBidQty, expected.bstQuoBidQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstQuoOrdrGrpT, bstQuoBidQty not matching. Actual %s but Expected %s", actual.bstQuoBidQty, expected.bstQuoBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstQuoAskPrc, expected.bstQuoAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstQuoOrdrGrpT, bstQuoAskPrc not matching. Actual %s but Expected %s", actual.bstQuoAskPrc, expected.bstQuoAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstQuoAskQty, expected.bstQuoAskQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bstQuoOrdrGrpT, bstQuoAskQty not matching. Actual %s but Expected %s", actual.bstQuoAskQty, expected.bstQuoAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareClgCtctGrpT(clgCtctGrpT actual, clgCtctGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.clgCtctPsn, expected.clgCtctPsn, DRIV_CLG_CTCT_PSN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In clgCtctGrpT, clgCtctPsn not matching. Actual %s but Expected %s", actual.clgCtctPsn, expected.clgCtctPsn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.clgCtctPsnPhn, expected.clgCtctPsnPhn, DRIV_CLG_CTCT_PSN_PHN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In clgCtctGrpT, clgCtctPsnPhn not matching. Actual %s but Expected %s", actual.clgCtctPsnPhn, expected.clgCtctPsnPhn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.clgCtctPsnTlx, expected.clgCtctPsnTlx, DRIV_CLG_CTCT_PSN_TLX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In clgCtctGrpT, clgCtctPsnTlx not matching. Actual %s but Expected %s", actual.clgCtctPsnTlx, expected.clgCtctPsnTlx);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareCrsCurrHrctGrpT(crsCurrHrctGrpT actual, crsCurrHrctGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.crsCurrHrctPcnt, expected.crsCurrHrctPcnt, CRS_CURR_HRCT_PCNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In crsCurrHrctGrpT, crsCurrHrctPcnt not matching. Actual %s but Expected %s", actual.crsCurrHrctPcnt, expected.crsCurrHrctPcnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.adjExchRatDbt, expected.adjExchRatDbt, ADJ_EXCH_RAT_DBT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In crsCurrHrctGrpT, adjExchRatDbt not matching. Actual %s but Expected %s", actual.adjExchRatDbt, expected.adjExchRatDbt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.adjExchRatCrdt, expected.adjExchRatCrdt, ADJ_EXCH_RAT_CRDT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In crsCurrHrctGrpT, adjExchRatCrdt not matching. Actual %s but Expected %s", actual.adjExchRatCrdt, expected.adjExchRatCrdt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareCshLegEfpFinGrpT(cshLegEfpFinGrpT actual, cshLegEfpFinGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.issTxt, expected.issTxt, ISS_TXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfpFinGrpT, issTxt not matching. Actual %s but Expected %s", actual.issTxt, expected.issTxt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnRat, expected.cpnRat, DRIV_CPN_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfpFinGrpT, cpnRat not matching. Actual %s but Expected %s", actual.cpnRat, expected.cpnRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.matuDat, expected.matuDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfpFinGrpT, matuDat not matching. Actual %s but Expected %s", actual.matuDat, expected.matuDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnFreq, expected.cpnFreq, CPN_FREQ_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfpFinGrpT, cpnFreq not matching. Actual %s but Expected %s", actual.cpnFreq, expected.cpnFreq);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfpFinGrpT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareCshLegEfsGrpT(cshLegEfsGrpT actual, cshLegEfsGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.cpnFixRat, expected.cpnFixRat, CPN_FIX_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfsGrpT, cpnFixRat not matching. Actual %s but Expected %s", actual.cpnFixRat, expected.cpnFixRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnVarRef, expected.cpnVarRef, CPN_VAR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfsGrpT, cpnVarRef not matching. Actual %s but Expected %s", actual.cpnVarRef, expected.cpnVarRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnVarOfs, expected.cpnVarOfs, CPN_VAR_OFS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfsGrpT, cpnVarOfs not matching. Actual %s but Expected %s", actual.cpnVarOfs, expected.cpnVarOfs);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnFreq, expected.cpnFreq, CPN_FREQ_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfsGrpT, cpnFreq not matching. Actual %s but Expected %s", actual.cpnFreq, expected.cpnFreq);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapStrtDat, expected.swapStrtDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfsGrpT, swapStrtDat not matching. Actual %s but Expected %s", actual.swapStrtDat, expected.swapStrtDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapEndDat, expected.swapEndDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfsGrpT, swapEndDat not matching. Actual %s but Expected %s", actual.swapEndDat, expected.swapEndDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLegEfsGrpT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareCshLimGrpT(cshLimGrpT actual, cshLimGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLimGrpT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshLim, expected.cshLim, CSH_MVT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In cshLimGrpT, cshLim not matching. Actual %s but Expected %s", actual.cshLim, expected.cshLim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareCtctTextGrpT(ctctTextGrpT actual, ctctTextGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ctctText, expected.ctctText, DRIV_CTCT_TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In ctctTextGrpT, ctctText not matching. Actual %s but Expected %s", actual.ctctText, expected.ctctText);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDataHeaderT(dataHeaderT actual, dataHeaderT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.exchApplId, expected.exchApplId, EXCH_APPL_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In dataHeaderT, exchApplId not matching. Actual %s but Expected %s", actual.exchApplId, expected.exchApplId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodLine, expected.prodLine, PROD_LINE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In dataHeaderT, prodLine not matching. Actual %s but Expected %s", actual.prodLine, expected.prodLine);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodOboMs, expected.membExchIdCodOboMs, MEMB_EXCH_ID_COD_OBO_MS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In dataHeaderT, membExchIdCodOboMs not matching. Actual %s but Expected %s", actual.membExchIdCodOboMs, expected.membExchIdCodOboMs);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutCntrIdGrpT(futCntrIdGrpT actual, futCntrIdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrIdGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrIdGrpT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrIdGrpT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTrdrIdGrpT(trdrIdGrpT actual, trdrIdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.partSubGrpCod, expected.partSubGrpCod, PART_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdrIdGrpT, partSubGrpCod not matching. Actual %s but Expected %s", actual.partSubGrpCod, expected.partSubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partNo, expected.partNo, PART_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdrIdGrpT, partNo not matching. Actual %s but Expected %s", actual.partNo, expected.partNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEbiTrdInqRespGrpT(ebiTrdInqRespGrpT actual, ebiTrdInqRespGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In ebiTrdInqRespGrpT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In ebiTrdInqRespGrpT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In ebiTrdInqRespGrpT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In ebiTrdInqRespGrpT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In ebiTrdInqRespGrpT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEbiTrdReqGrpT(ebiTrdReqGrpT actual, ebiTrdReqGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In ebiTrdReqGrpT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futPrc, expected.futPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In ebiTrdReqGrpT, futPrc not matching. Actual %s but Expected %s", actual.futPrc, expected.futPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nomVal, expected.nomVal, NOM_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In ebiTrdReqGrpT, nomVal not matching. Actual %s but Expected %s", actual.nomVal, expected.nomVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtExchRatTrnRecT(extExchRatTrnRecT actual, extExchRatTrnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCodFrom, expected.currTypCodFrom, CURR_TYP_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extExchRatTrnRecT, currTypCodFrom not matching. Actual %s but Expected %s", actual.currTypCodFrom, expected.currTypCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCodTo, expected.currTypCodTo, CURR_TYP_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extExchRatTrnRecT, currTypCodTo not matching. Actual %s but Expected %s", actual.currTypCodTo, expected.currTypCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.convUntExpo!= expected.convUntExpo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extExchRatTrnRecT, convUntExponot matching. Actual %d but Expected %d", actual.convUntExpo, expected.convUntExpo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchRat, expected.exchRat, EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extExchRatTrnRecT, exchRat not matching. Actual %s but Expected %s", actual.exchRat, expected.exchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtSetlPrcTrnRecT(extSetlPrcTrnRecT actual, extSetlPrcTrnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.setlPrcTrnTyp!= expected.setlPrcTrnTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, setlPrcTrnTypnot matching. Actual %d but Expected %d", actual.setlPrcTrnTyp, expected.setlPrcTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.dcmlShft!= expected.dcmlShft) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, dcmlShftnot matching. Actual %d but Expected %d", actual.dcmlShft, expected.dcmlShft);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrGenNo!= expected.cntrGenNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, cntrGenNonot matching. Actual %d but Expected %d", actual.cntrGenNo, expected.cntrGenNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExerPrc, expected.cntrExerPrc, CNTR_EXER_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, cntrExerPrc not matching. Actual %s but Expected %s", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.setlPrcCod!= expected.setlPrcCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, setlPrcCodnot matching. Actual %d but Expected %d", actual.setlPrcCod, expected.setlPrcCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrSetlPrc, expected.cntrSetlPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, cntrSetlPrc not matching. Actual %s but Expected %s", actual.cntrSetlPrc, expected.cntrSetlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrClsPrc, expected.undrClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, undrClsPrc not matching. Actual %s but Expected %s", actual.undrClsPrc, expected.undrClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrFinSetlPrc, expected.undrFinSetlPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, undrFinSetlPrc not matching. Actual %s but Expected %s", actual.undrFinSetlPrc, expected.undrFinSetlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.undrFinSetlInd!= expected.undrFinSetlInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, undrFinSetlIndnot matching. Actual %d but Expected %d", actual.undrFinSetlInd, expected.undrFinSetlInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mgnClsPrc, expected.mgnClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, mgnClsPrc not matching. Actual %s but Expected %s", actual.mgnClsPrc, expected.mgnClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshValDat, expected.cshValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, cshValDat not matching. Actual %s but Expected %s", actual.cshValDat, expected.cshValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuValDat, expected.secuValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, secuValDat not matching. Actual %s but Expected %s", actual.secuValDat, expected.secuValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodDispDcml, expected.prodDispDcml, PROD_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, prodDispDcml not matching. Actual %s but Expected %s", actual.prodDispDcml, expected.prodDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcml!= expected.exerPrcDcml) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, exerPrcDcmlnot matching. Actual %d but Expected %d", actual.exerPrcDcml, expected.exerPrcDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDispDcml, expected.setlDispDcml, SETL_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnRecT, setlDispDcml not matching. Actual %s but Expected %s", actual.setlDispDcml, expected.setlDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFlxCntrTrnIdClsGrpT(flxCntrTrnIdClsGrpT actual, flxCntrTrnIdClsGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrTrnIdNoCls, expected.flxCntrTrnIdNoCls, FLX_CNTR_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxCntrTrnIdClsGrpT, flxCntrTrnIdNoCls not matching. Actual %s but Expected %s", actual.flxCntrTrnIdNoCls, expected.flxCntrTrnIdNoCls);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdSfxNoCls, expected.trnIdSfxNoCls, TRN_ID_SFX_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxCntrTrnIdClsGrpT, trnIdSfxNoCls not matching. Actual %s but Expected %s", actual.trnIdSfxNoCls, expected.trnIdSfxNoCls);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFlxCntrTrnIdGrpT(flxCntrTrnIdGrpT actual, flxCntrTrnIdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxCntrTrnIdGrpT, flxCntrTrnIdNo not matching. Actual %s but Expected %s", actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdSfxNo, expected.trnIdSfxNo, TRN_ID_SFX_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxCntrTrnIdGrpT, trnIdSfxNo not matching. Actual %s but Expected %s", actual.trnIdSfxNo, expected.trnIdSfxNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFlxFutCntrIdGrpT(flxFutCntrIdGrpT actual, flxFutCntrIdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxFutCntrIdGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpDat, expected.cntrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxFutCntrIdGrpT, cntrExpDat not matching. Actual %s but Expected %s", actual.cntrExpDat, expected.cntrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.crtSetlTyp!= expected.crtSetlTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxFutCntrIdGrpT, crtSetlTypnot matching. Actual %d but Expected %d", actual.crtSetlTyp, expected.crtSetlTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFlxOptCntrIdGrpT(flxOptCntrIdGrpT actual, flxOptCntrIdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxOptCntrIdGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxOptCntrIdGrpT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpDat, expected.cntrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxOptCntrIdGrpT, cntrExpDat not matching. Actual %s but Expected %s", actual.cntrExpDat, expected.cntrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxOptCntrExerPrc, expected.flxOptCntrExerPrc, FLX_OPT_CNTR_EXER_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxOptCntrIdGrpT, flxOptCntrExerPrc not matching. Actual %s but Expected %s", actual.flxOptCntrExerPrc, expected.flxOptCntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxOptCntrIdGrpT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerStylTyp!= expected.exerStylTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxOptCntrIdGrpT, exerStylTypnot matching. Actual %d but Expected %d", actual.exerStylTyp, expected.exerStylTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.crtSetlTyp!= expected.crtSetlTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In flxOptCntrIdGrpT, crtSetlTypnot matching. Actual %d but Expected %d", actual.crtSetlTyp, expected.crtSetlTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDLegSeqNoT(futBscDLegSeqNoT actual, futBscDLegSeqNoT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.stmSeqNo, expected.stmSeqNo, DRIV_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDLegSeqNoT, stmSeqNo not matching. Actual %s but Expected %s", actual.stmSeqNo, expected.stmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodSeqNo, expected.prodSeqNo, PROD_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDLegSeqNoT, prodSeqNo not matching. Actual %s but Expected %s", actual.prodSeqNo, expected.prodSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSeqNoT(futBscSeqNoT actual, futBscSeqNoT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.stmSeqNo, expected.stmSeqNo, DRIV_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSeqNoT, stmSeqNo not matching. Actual %s but Expected %s", actual.stmSeqNo, expected.stmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodSeqNo, expected.prodSeqNo, PROD_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSeqNoT, prodSeqNo not matching. Actual %s but Expected %s", actual.prodSeqNo, expected.prodSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrSeqNo, expected.cntrSeqNo, CNTR_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSeqNoT, cntrSeqNo not matching. Actual %s but Expected %s", actual.cntrSeqNo, expected.cntrSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutCntrId2GrpT(futCntrId2GrpT actual, futCntrId2GrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.cntrExpMthDat2, expected.cntrExpMthDat2, CNTR_EXP_MTH_DAT2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrId2GrpT, cntrExpMthDat2 not matching. Actual %s but Expected %s", actual.cntrExpMthDat2, expected.cntrExpMthDat2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat2, expected.cntrExpYrDat2, CNTR_EXP_YR_DAT2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrId2GrpT, cntrExpYrDat2 not matching. Actual %s but Expected %s", actual.cntrExpYrDat2, expected.cntrExpYrDat2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutCntrIdGrpFromT(futCntrIdGrpFromT actual, futCntrIdGrpFromT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodIdFrom, expected.prodIdFrom, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrIdGrpFromT, prodIdFrom not matching. Actual %s but Expected %s", actual.prodIdFrom, expected.prodIdFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDatFrom, expected.cntrExpMthDatFrom, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrIdGrpFromT, cntrExpMthDatFrom not matching. Actual %s but Expected %s", actual.cntrExpMthDatFrom, expected.cntrExpMthDatFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDatFrom, expected.cntrExpYrDatFrom, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrIdGrpFromT, cntrExpYrDatFrom not matching. Actual %s but Expected %s", actual.cntrExpYrDatFrom, expected.cntrExpYrDatFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutCntrIdGrpToT(futCntrIdGrpToT actual, futCntrIdGrpToT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodIdTo, expected.prodIdTo, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrIdGrpToT, prodIdTo not matching. Actual %s but Expected %s", actual.prodIdTo, expected.prodIdTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDatTo, expected.cntrExpMthDatTo, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrIdGrpToT, cntrExpMthDatTo not matching. Actual %s but Expected %s", actual.cntrExpMthDatTo, expected.cntrExpMthDatTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDatTo, expected.cntrExpYrDatTo, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrIdGrpToT, cntrExpYrDatTo not matching. Actual %s but Expected %s", actual.cntrExpYrDatTo, expected.cntrExpYrDatTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutCntrListGrpT(futCntrListGrpT actual, futCntrListGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrListGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrListGrpT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrListGrpT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsCod!= expected.cntrStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futCntrListGrpT, cntrStsCodnot matching. Actual %d but Expected %d", actual.cntrStsCod, expected.cntrStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareGivUpCtctGrpT(givUpCtctGrpT actual, givUpCtctGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.givUpCtctPsn, expected.givUpCtctPsn, DRIV_GIV_UP_CTCT_PSN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In givUpCtctGrpT, givUpCtctPsn not matching. Actual %s but Expected %s", actual.givUpCtctPsn, expected.givUpCtctPsn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.givUpCtctPsnPhn, expected.givUpCtctPsnPhn, DRIV_GIV_UP_CTCT_PSN_PHN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In givUpCtctGrpT, givUpCtctPsnPhn not matching. Actual %s but Expected %s", actual.givUpCtctPsnPhn, expected.givUpCtctPsnPhn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.givUpCtctPsnTlx, expected.givUpCtctPsnTlx, DRIV_GIV_UP_CTCT_PSN_TLX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In givUpCtctGrpT, givUpCtctPsnTlx not matching. Actual %s but Expected %s", actual.givUpCtctPsnTlx, expected.givUpCtctPsnTlx);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareGutGrpT(gutGrpT actual, gutGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.gutCtpy, expected.gutCtpy, GUT_CTPY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In gutGrpT, gutCtpy not matching. Actual %s but Expected %s", actual.gutCtpy, expected.gutCtpy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.gutRefCust, expected.gutRefCust, GUT_REF_CUST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In gutGrpT, gutRefCust not matching. Actual %s but Expected %s", actual.gutRefCust, expected.gutRefCust);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.gutRefUserOrdrNum, expected.gutRefUserOrdrNum, GUT_REF_USER_ORDR_NUM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In gutGrpT, gutRefUserOrdrNum not matching. Actual %s but Expected %s", actual.gutRefUserOrdrNum, expected.gutRefUserOrdrNum);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.gutRefText, expected.gutRefText, GUT_REF_TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In gutGrpT, gutRefText not matching. Actual %s but Expected %s", actual.gutRefText, expected.gutRefText);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In gutGrpT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOccCntrIdGrpT(occCntrIdGrpT actual, occCntrIdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.occRootId, expected.occRootId, OCC_ROOT_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In occCntrIdGrpT, occRootId not matching. Actual %s but Expected %s", actual.occRootId, expected.occRootId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.occCfi, expected.occCfi, OCC_CFI_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In occCntrIdGrpT, occCfi not matching. Actual %s but Expected %s", actual.occCfi, expected.occCfi);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.occExpDat, expected.occExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In occCntrIdGrpT, occExpDat not matching. Actual %s but Expected %s", actual.occExpDat, expected.occExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.occExerPrc, expected.occExerPrc, DRIV_OCC_EXER_PRC_DSCR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In occCntrIdGrpT, occExerPrc not matching. Actual %s but Expected %s", actual.occExerPrc, expected.occExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscSeqNoT(optBscSeqNoT actual, optBscSeqNoT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.stmSeqNo, expected.stmSeqNo, DRIV_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSeqNoT, stmSeqNo not matching. Actual %s but Expected %s", actual.stmSeqNo, expected.stmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodSeqNo, expected.prodSeqNo, PROD_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSeqNoT, prodSeqNo not matching. Actual %s but Expected %s", actual.prodSeqNo, expected.prodSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrSeqNo, expected.cntrSeqNo, CNTR_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSeqNoT, cntrSeqNo not matching. Actual %s but Expected %s", actual.cntrSeqNo, expected.cntrSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptCntrIdGrpT(optCntrIdGrpT actual, optCntrIdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdGrpT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdGrpT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdGrpT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExerPrc, expected.cntrExerPrc, CNTR_EXER_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdGrpT, cntrExerPrc not matching. Actual %s but Expected %s", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdGrpT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptCntrListGrpT(optCntrListGrpT actual, optCntrListGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrListGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrListGrpT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrListGrpT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExerPrc, expected.cntrExerPrc, CNTR_EXER_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrListGrpT, cntrExerPrc not matching. Actual %s but Expected %s", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrListGrpT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsCod!= expected.cntrStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrListGrpT, cntrStsCodnot matching. Actual %d but Expected %d", actual.cntrStsCod, expected.cntrStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.lepoInd!= expected.lepoInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrListGrpT, lepoIndnot matching. Actual %d but Expected %d", actual.lepoInd, expected.lepoInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOrigGuTuTrnGrpT(origGuTuTrnGrpT actual, origGuTuTrnGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.origExchIdCod, expected.origExchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origGuTuTrnGrpT, origExchIdCod not matching. Actual %s but Expected %s", actual.origExchIdCod, expected.origExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnIdNo, expected.origTrnIdNo, ORIG_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origGuTuTrnGrpT, origTrnIdNo not matching. Actual %s but Expected %s", actual.origTrnIdNo, expected.origTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origOrdrNo, expected.origOrdrNo, ORIG_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origGuTuTrnGrpT, origOrdrNo not matching. Actual %s but Expected %s", actual.origOrdrNo, expected.origOrdrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnDat, expected.origTrnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origGuTuTrnGrpT, origTrnDat not matching. Actual %s but Expected %s", actual.origTrnDat, expected.origTrnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnDatCet, expected.origTrnDatCet, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origGuTuTrnGrpT, origTrnDatCet not matching. Actual %s but Expected %s", actual.origTrnDatCet, expected.origTrnDatCet);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origCntrId, expected.origCntrId, DRIV_ORIG_CNTR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origGuTuTrnGrpT, origCntrId not matching. Actual %s but Expected %s", actual.origCntrId, expected.origCntrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOrigTrnFiltGrpT(origTrnFiltGrpT actual, origTrnFiltGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.origExchIdCod, expected.origExchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnFiltGrpT, origExchIdCod not matching. Actual %s but Expected %s", actual.origExchIdCod, expected.origExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnIdNo, expected.origTrnIdNo, ORIG_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnFiltGrpT, origTrnIdNo not matching. Actual %s but Expected %s", actual.origTrnIdNo, expected.origTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origOrdrNo, expected.origOrdrNo, ORIG_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnFiltGrpT, origOrdrNo not matching. Actual %s but Expected %s", actual.origOrdrNo, expected.origOrdrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOrigTrnGrpT(origTrnGrpT actual, origTrnGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.origExchIdCod, expected.origExchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnGrpT, origExchIdCod not matching. Actual %s but Expected %s", actual.origExchIdCod, expected.origExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnIdNo, expected.origTrnIdNo, ORIG_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnGrpT, origTrnIdNo not matching. Actual %s but Expected %s", actual.origTrnIdNo, expected.origTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origOrdrNo, expected.origOrdrNo, ORIG_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnGrpT, origOrdrNo not matching. Actual %s but Expected %s", actual.origOrdrNo, expected.origOrdrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnDat, expected.origTrnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnGrpT, origTrnDat not matching. Actual %s but Expected %s", actual.origTrnDat, expected.origTrnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnTim, expected.origTrnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnGrpT, origTrnTim not matching. Actual %s but Expected %s", actual.origTrnTim, expected.origTrnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnDatCet, expected.origTrnDatCet, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnGrpT, origTrnDatCet not matching. Actual %s but Expected %s", actual.origTrnDatCet, expected.origTrnDatCet);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origTrnTimCet, expected.origTrnTimCet, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnGrpT, origTrnTimCet not matching. Actual %s but Expected %s", actual.origTrnTimCet, expected.origTrnTimCet);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.origCntrId, expected.origCntrId, DRIV_ORIG_CNTR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In origTrnGrpT, origCntrId not matching. Actual %s but Expected %s", actual.origCntrId, expected.origCntrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void comparePinGrpT(pinGrpT actual, pinGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.pin, expected.pin, PIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In pinGrpT, pin not matching. Actual %s but Expected %s", actual.pin, expected.pin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.pinProcMis!= expected.pinProcMis) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In pinGrpT, pinProcMisnot matching. Actual %d but Expected %d", actual.pinProcMis, expected.pinProcMis);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.pinProcTob!= expected.pinProcTob) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In pinGrpT, pinProcTobnot matching. Actual %d but Expected %d", actual.pinProcTob, expected.pinProcTob);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.pinProcOtc!= expected.pinProcOtc) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In pinGrpT, pinProcOtcnot matching. Actual %d but Expected %d", actual.pinProcOtc, expected.pinProcOtc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void comparePrcStepTblGrpT(prcStepTblGrpT actual, prcStepTblGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prcUppVald, expected.prcUppVald, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prcStepTblGrpT, prcUppVald not matching. Actual %s but Expected %s", actual.prcUppVald, expected.prcUppVald);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prcStep, expected.prcStep, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prcStepTblGrpT, prcStep not matching. Actual %s but Expected %s", actual.prcStep, expected.prcStep);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareProdAsgnGrpT(prodAsgnGrpT actual, prodAsgnGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodAsgnGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxOrdrQty, expected.maxOrdrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodAsgnGrpT, maxOrdrQty not matching. Actual %s but Expected %s", actual.maxOrdrQty, expected.maxOrdrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxCalSprdQty, expected.maxCalSprdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodAsgnGrpT, maxCalSprdQty not matching. Actual %s but Expected %s", actual.maxCalSprdQty, expected.maxCalSprdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxWhsQty, expected.maxWhsQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodAsgnGrpT, maxWhsQty not matching. Actual %s but Expected %s", actual.maxWhsQty, expected.maxWhsQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareProdGrpIdGrpT(prodGrpIdGrpT actual, prodGrpIdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.prodGrpUsgTyp!= expected.prodGrpUsgTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodGrpIdGrpT, prodGrpUsgTypnot matching. Actual %d but Expected %d", actual.prodGrpUsgTyp, expected.prodGrpUsgTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodGrpNam, expected.prodGrpNam, PROD_GRP_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodGrpIdGrpT, prodGrpNam not matching. Actual %s but Expected %s", actual.prodGrpNam, expected.prodGrpNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareProdMargDataGrpT(prodMargDataGrpT actual, prodMargDataGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mgnClasCod, expected.mgnClasCod, MGN_CLAS_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodMargDataGrpT, mgnClasCod not matching. Actual %s but Expected %s", actual.mgnClasCod, expected.mgnClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.histVol, expected.histVol, HIST_VOL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodMargDataGrpT, histVol not matching. Actual %s but Expected %s", actual.histVol, expected.histVol);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.histVolCod!= expected.histVolCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodMargDataGrpT, histVolCodnot matching. Actual %d but Expected %d", actual.histVolCod, expected.histVolCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.mgnStylTyp!= expected.mgnStylTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodMargDataGrpT, mgnStylTypnot matching. Actual %d but Expected %d", actual.mgnStylTyp, expected.mgnStylTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareProdSeqNoGrpT(prodSeqNoGrpT actual, prodSeqNoGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.stmSeqNo, expected.stmSeqNo, DRIV_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodSeqNoGrpT, stmSeqNo not matching. Actual %s but Expected %s", actual.stmSeqNo, expected.stmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodSeqNo, expected.prodSeqNo, PROD_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prodSeqNoGrpT, prodSeqNo not matching. Actual %s but Expected %s", actual.prodSeqNo, expected.prodSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void comparePrstGrpT(prstGrpT actual, prstGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.prstTypeCod!= expected.prstTypeCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prstGrpT, prstTypeCodnot matching. Actual %d but Expected %d", actual.prstTypeCod, expected.prstTypeCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prstTrnCod, expected.prstTrnCod, PRST_TRN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prstGrpT, prstTrnCod not matching. Actual %s but Expected %s", actual.prstTrnCod, expected.prstTrnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prstState!= expected.prstState) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prstGrpT, prstStatenot matching. Actual %d but Expected %d", actual.prstState, expected.prstState);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void comparePrvCrsCurrHrctGrpT(prvCrsCurrHrctGrpT actual, prvCrsCurrHrctGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prvCrsCurrHrctPcnt, expected.prvCrsCurrHrctPcnt, CRS_CURR_HRCT_PCNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prvCrsCurrHrctGrpT, prvCrsCurrHrctPcnt not matching. Actual %s but Expected %s", actual.prvCrsCurrHrctPcnt, expected.prvCrsCurrHrctPcnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvAdjExchRatDbt, expected.prvAdjExchRatDbt, ADJ_EXCH_RAT_DBT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prvCrsCurrHrctGrpT, prvAdjExchRatDbt not matching. Actual %s but Expected %s", actual.prvAdjExchRatDbt, expected.prvAdjExchRatDbt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvAdjExchRatCrdt, expected.prvAdjExchRatCrdt, ADJ_EXCH_RAT_CRDT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In prvCrsCurrHrctGrpT, prvAdjExchRatCrdt not matching. Actual %s but Expected %s", actual.prvAdjExchRatCrdt, expected.prvAdjExchRatCrdt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void comparePstAddGrpT(pstAddGrpT actual, pstAddGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.addStr1, expected.addStr1, DRIV_ADD_STR1_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In pstAddGrpT, addStr1 not matching. Actual %s but Expected %s", actual.addStr1, expected.addStr1);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.addStr2, expected.addStr2, DRIV_ADD_STR2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In pstAddGrpT, addStr2 not matching. Actual %s but Expected %s", actual.addStr2, expected.addStr2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.addCty, expected.addCty, DRIV_ADD_CTY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In pstAddGrpT, addCty not matching. Actual %s but Expected %s", actual.addCty, expected.addCty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.addPstCod, expected.addPstCod, DRIV_ADD_PST_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In pstAddGrpT, addPstCod not matching. Actual %s but Expected %s", actual.addPstCod, expected.addPstCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.addCtry, expected.addCtry, DRIV_ADD_CTRY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In pstAddGrpT, addCtry not matching. Actual %s but Expected %s", actual.addCtry, expected.addCtry);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareRskLimStsGrpT(rskLimStsGrpT actual, rskLimStsGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.timIntvlViolCnt!= expected.timIntvlViolCnt) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimStsGrpT, timIntvlViolCntnot matching. Actual %d but Expected %d", actual.timIntvlViolCnt, expected.timIntvlViolCnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.wrkVolLimSts!= expected.wrkVolLimSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimStsGrpT, wrkVolLimStsnot matching. Actual %d but Expected %d", actual.wrkVolLimSts, expected.wrkVolLimSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.deltaLngLimSts!= expected.deltaLngLimSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimStsGrpT, deltaLngLimStsnot matching. Actual %d but Expected %d", actual.deltaLngLimSts, expected.deltaLngLimSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.deltaShtLimSts!= expected.deltaShtLimSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimStsGrpT, deltaShtLimStsnot matching. Actual %d but Expected %d", actual.deltaShtLimSts, expected.deltaShtLimSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.vegaLngLimSts!= expected.vegaLngLimSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimStsGrpT, vegaLngLimStsnot matching. Actual %d but Expected %d", actual.vegaLngLimSts, expected.vegaLngLimSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.vegaShtLimSts!= expected.vegaShtLimSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimStsGrpT, vegaShtLimStsnot matching. Actual %d but Expected %d", actual.vegaShtLimSts, expected.vegaShtLimSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareRskLimTimIntvlGrpT(rskLimTimIntvlGrpT actual, rskLimTimIntvlGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.timIntvlSec, expected.timIntvlSec, TIM_INTVL_SEC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimTimIntvlGrpT, timIntvlSec not matching. Actual %s but Expected %s", actual.timIntvlSec, expected.timIntvlSec);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfTxnLim, expected.noOfTxnLim, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimTimIntvlGrpT, noOfTxnLim not matching. Actual %s but Expected %s", actual.noOfTxnLim, expected.noOfTxnLim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timVolLimQty, expected.timVolLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimTimIntvlGrpT, timVolLimQty not matching. Actual %s but Expected %s", actual.timVolLimQty, expected.timVolLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareRskLimWrkOrdrGrpT(rskLimWrkOrdrGrpT actual, rskLimWrkOrdrGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.wrkVolLimQty, expected.wrkVolLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimWrkOrdrGrpT, wrkVolLimQty not matching. Actual %s but Expected %s", actual.wrkVolLimQty, expected.wrkVolLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.deltaLngLimQty, expected.deltaLngLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimWrkOrdrGrpT, deltaLngLimQty not matching. Actual %s but Expected %s", actual.deltaLngLimQty, expected.deltaLngLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.deltaShtLimQty, expected.deltaShtLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimWrkOrdrGrpT, deltaShtLimQty not matching. Actual %s but Expected %s", actual.deltaShtLimQty, expected.deltaShtLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.vegaLngLimQty, expected.vegaLngLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimWrkOrdrGrpT, vegaLngLimQty not matching. Actual %s but Expected %s", actual.vegaLngLimQty, expected.vegaLngLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.vegaShtLimQty, expected.vegaShtLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In rskLimWrkOrdrGrpT, vegaShtLimQty not matching. Actual %s but Expected %s", actual.vegaShtLimQty, expected.vegaShtLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSecuTypGrpT(secuTypGrpT actual, secuTypGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.secuTypPfx!= expected.secuTypPfx) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In secuTypGrpT, secuTypPfxnot matching. Actual %d but Expected %d", actual.secuTypPfx, expected.secuTypPfx);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuTypSfx, expected.secuTypSfx, SECU_ID_SFX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In secuTypGrpT, secuTypSfx not matching. Actual %s but Expected %s", actual.secuTypSfx, expected.secuTypSfx);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSprdLnkRecT(sprdLnkRecT actual, sprdLnkRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.sprdTblStrtIdx, expected.sprdTblStrtIdx, SPRD_TBL_STRT_IDX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In sprdLnkRecT, sprdTblStrtIdx not matching. Actual %s but Expected %s", actual.sprdTblStrtIdx, expected.sprdTblStrtIdx);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.sprdTblEndIdx, expected.sprdTblEndIdx, SPRD_TBL_END_IDX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In sprdLnkRecT, sprdTblEndIdx not matching. Actual %s but Expected %s", actual.sprdTblEndIdx, expected.sprdTblEndIdx);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In sprdLnkRecT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In sprdLnkRecT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSprdTblGrpT(sprdTblGrpT actual, sprdTblGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.sprdBidPrc, expected.sprdBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In sprdTblGrpT, sprdBidPrc not matching. Actual %s but Expected %s", actual.sprdBidPrc, expected.sprdBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.sprdTicAmt, expected.sprdTicAmt, SPRD_TIC_AMT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In sprdTblGrpT, sprdTicAmt not matching. Actual %s but Expected %s", actual.sprdTicAmt, expected.sprdTicAmt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.sprdAbsPcnt!= expected.sprdAbsPcnt) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In sprdTblGrpT, sprdAbsPcntnot matching. Actual %d but Expected %d", actual.sprdAbsPcnt, expected.sprdAbsPcnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSprdTblExpGrpT(sprdTblExpGrpT actual, sprdTblExpGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.sprdTblNam, expected.sprdTblNam, SPRD_TBL_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In sprdTblExpGrpT, sprdTblNam not matching. Actual %s but Expected %s", actual.sprdTblNam, expected.sprdTblNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.sprdTimToExp, expected.sprdTimToExp, SPRD_TIM_TO_EXP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In sprdTblExpGrpT, sprdTimToExp not matching. Actual %s but Expected %s", actual.sprdTimToExp, expected.sprdTimToExp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < SPRD_TBL_GRP_MAX;i++) {
		compareSprdTblGrpT (actual.sprdTblGrp[i],expected.sprdTblGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareStratEquLegGrpT(stratEquLegGrpT actual, stratEquLegGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.stratEquLegBuyCod!= expected.stratEquLegBuyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In stratEquLegGrpT, stratEquLegBuyCodnot matching. Actual %d but Expected %d", actual.stratEquLegBuyCod, expected.stratEquLegBuyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratEquLegIsin, expected.stratEquLegIsin, STRAT_EQU_LEG_ISIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In stratEquLegGrpT, stratEquLegIsin not matching. Actual %s but Expected %s", actual.stratEquLegIsin, expected.stratEquLegIsin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratEquLegPrc, expected.stratEquLegPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In stratEquLegGrpT, stratEquLegPrc not matching. Actual %s but Expected %s", actual.stratEquLegPrc, expected.stratEquLegPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratEquLegVol, expected.stratEquLegVol, DRIV_STRAT_EQU_LEG_VOL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In stratEquLegGrpT, stratEquLegVol not matching. Actual %s but Expected %s", actual.stratEquLegVol, expected.stratEquLegVol);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareStratLegGrpT(stratLegGrpT actual, stratLegGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.stratLegBuyCod!= expected.stratLegBuyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In stratLegGrpT, stratLegBuyCodnot matching. Actual %d but Expected %d", actual.stratLegBuyCod, expected.stratLegBuyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.stratLegUndrPrc, expected.stratLegUndrPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In stratLegGrpT, stratLegUndrPrc not matching. Actual %s but Expected %s", actual.stratLegUndrPrc, expected.stratLegUndrPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratLegVol, expected.stratLegVol, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In stratLegGrpT, stratLegVol not matching. Actual %s but Expected %s", actual.stratLegVol, expected.stratLegVol);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareStratIdGrpT(stratIdGrpT actual, stratIdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In stratIdGrpT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < STRAT_LEG_GRP_MAX;i++) {
		compareStratLegGrpT (actual.stratLegGrp[i],expected.stratLegGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareStratLegTrdNoGrpT(stratLegTrdNoGrpT actual, stratLegTrdNoGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In stratLegTrdNoGrpT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareStratTrdNoGrpT(stratTrdNoGrpT actual, stratTrdNoGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < STRAT_LEG_TRD_NO_GRP_MAX;i++) {
		compareStratLegTrdNoGrpT (actual.stratLegTrdNoGrp[i],expected.stratLegTrdNoGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTotTrdQtyHistRecT(totTrdQtyHistRecT actual, totTrdQtyHistRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.totTrdQtyHist, expected.totTrdQtyHist, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In totTrdQtyHistRecT, totTrdQtyHist not matching. Actual %s but Expected %s", actual.totTrdQtyHist, expected.totTrdQtyHist);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTotTrdQtyHistGrpT(totTrdQtyHistGrpT actual, totTrdQtyHistGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < TOT_TRD_QTY_HIST_MAX;i++) {
		compareTotTrdQtyHistRecT (actual.totTrdQtyHist[i],expected.totTrdQtyHist[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTrdIdOboGrpT(trdIdOboGrpT actual, trdIdOboGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.partSubGrpCodObo, expected.partSubGrpCodObo, PART_SUB_GRP_COD_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdIdOboGrpT, partSubGrpCodObo not matching. Actual %s but Expected %s", actual.partSubGrpCodObo, expected.partSubGrpCodObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partNoObo, expected.partNoObo, PART_NO_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdIdOboGrpT, partNoObo not matching. Actual %s but Expected %s", actual.partNoObo, expected.partNoObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTrdLegMtchGrpT(trdLegMtchGrpT actual, trdLegMtchGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trdNoLeg, expected.trdNoLeg, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdLegMtchGrpT, trdNoLeg not matching. Actual %s but Expected %s", actual.trdNoLeg, expected.trdNoLeg);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchQtyLeg, expected.trdMtchQtyLeg, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdLegMtchGrpT, trdMtchQtyLeg not matching. Actual %s but Expected %s", actual.trdMtchQtyLeg, expected.trdMtchQtyLeg);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrcLeg, expected.trdMtchPrcLeg, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdLegMtchGrpT, trdMtchPrcLeg not matching. Actual %s but Expected %s", actual.trdMtchPrcLeg, expected.trdMtchPrcLeg);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTrdrIdGrpApprT(trdrIdGrpApprT actual, trdrIdGrpApprT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.partSubGrpCodAppr, expected.partSubGrpCodAppr, PART_SUB_GRP_COD_APPR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdrIdGrpApprT, partSubGrpCodAppr not matching. Actual %s but Expected %s", actual.partSubGrpCodAppr, expected.partSubGrpCodAppr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partNoAppr, expected.partNoAppr, PART_NO_APPR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdrIdGrpApprT, partNoAppr not matching. Actual %s but Expected %s", actual.partNoAppr, expected.partNoAppr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTrdrIdGrpFromT(trdrIdGrpFromT actual, trdrIdGrpFromT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.partSubGrpCodFrom, expected.partSubGrpCodFrom, PART_SUB_GRP_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdrIdGrpFromT, partSubGrpCodFrom not matching. Actual %s but Expected %s", actual.partSubGrpCodFrom, expected.partSubGrpCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partNoFrom, expected.partNoFrom, PART_NO_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trdrIdGrpFromT, partNoFrom not matching. Actual %s but Expected %s", actual.partNoFrom, expected.partNoFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTrnIdSfxGrpT(trnIdSfxGrpT actual, trnIdSfxGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdSfxNo, expected.trnIdSfxNo, TRN_ID_SFX_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trnIdSfxGrpT, trnIdSfxNo not matching. Actual %s but Expected %s", actual.trnIdSfxNo, expected.trnIdSfxNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trnIdSfxGrpT, trnIdSfxNoPnt not matching. Actual %s but Expected %s", actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnHistAdjInd!= expected.trnHistAdjInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trnIdSfxGrpT, trnHistAdjIndnot matching. Actual %d but Expected %d", actual.trnHistAdjInd, expected.trnHistAdjInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnAdjStsCod!= expected.trnAdjStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trnIdSfxGrpT, trnAdjStsCodnot matching. Actual %d but Expected %d", actual.trnAdjStsCod, expected.trnAdjStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTrnIdSfxKeyGrpT(trnIdSfxKeyGrpT actual, trnIdSfxKeyGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdSfxNo, expected.trnIdSfxNo, TRN_ID_SFX_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trnIdSfxKeyGrpT, trnIdSfxNo not matching. Actual %s but Expected %s", actual.trnIdSfxNo, expected.trnIdSfxNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnHistAdjInd!= expected.trnHistAdjInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In trnIdSfxKeyGrpT, trnHistAdjIndnot matching. Actual %d but Expected %d", actual.trnHistAdjInd, expected.trnHistAdjInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTxtGrpT(txtGrpT actual, txtGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.cust, expected.cust, CUST_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpT, cust not matching. Actual %s but Expected %s", actual.cust, expected.cust);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrNum, expected.userOrdrNum, USER_ORDR_NUM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpT, userOrdrNum not matching. Actual %s but Expected %s", actual.userOrdrNum, expected.userOrdrNum);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.text, expected.text, TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpT, text not matching. Actual %s but Expected %s", actual.text, expected.text);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTxtGrpFiltT(txtGrpFiltT actual, txtGrpFiltT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.custFilt, expected.custFilt, DRIV_CUST_FILT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpFiltT, custFilt not matching. Actual %s but Expected %s", actual.custFilt, expected.custFilt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrNumFilt, expected.userOrdrNumFilt, DRIV_USER_ORDR_NUM_FILT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpFiltT, userOrdrNumFilt not matching. Actual %s but Expected %s", actual.userOrdrNumFilt, expected.userOrdrNumFilt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.textFilt, expected.textFilt, DRIV_TEXT_FILT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpFiltT, textFilt not matching. Actual %s but Expected %s", actual.textFilt, expected.textFilt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTxtGrpFromT(txtGrpFromT actual, txtGrpFromT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.custFrom, expected.custFrom, DRIV_CUST_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpFromT, custFrom not matching. Actual %s but Expected %s", actual.custFrom, expected.custFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrNumFrom, expected.userOrdrNumFrom, DRIV_USER_ORDR_NUM_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpFromT, userOrdrNumFrom not matching. Actual %s but Expected %s", actual.userOrdrNumFrom, expected.userOrdrNumFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.textFrom, expected.textFrom, DRIV_TEXT_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpFromT, textFrom not matching. Actual %s but Expected %s", actual.textFrom, expected.textFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareTxtGrpToT(txtGrpToT actual, txtGrpToT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.custTo, expected.custTo, DRIV_CUST_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpToT, custTo not matching. Actual %s but Expected %s", actual.custTo, expected.custTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrNumTo, expected.userOrdrNumTo, DRIV_USER_ORDR_NUM_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpToT, userOrdrNumTo not matching. Actual %s but Expected %s", actual.userOrdrNumTo, expected.userOrdrNumTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.textTo, expected.textTo, DRIV_TEXT_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In txtGrpToT, textTo not matching. Actual %s but Expected %s", actual.textTo, expected.textTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

