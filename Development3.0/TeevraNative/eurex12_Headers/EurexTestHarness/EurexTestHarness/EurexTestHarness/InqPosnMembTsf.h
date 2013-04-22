#include <InqPosnMembTsf.hxx>
#define BUFFER_SIZE 1000

futInqPosnMembTsfRequestT *vfutInqPosnMembTsfRequestT;
futInqPosnMembTsfResponseT *vfutInqPosnMembTsfResponseT;
optInqPosnMembTsfRequestT *voptInqPosnMembTsfRequestT;
optInqPosnMembTsfResponseT *voptInqPosnMembTsfResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqPosnMembTsfRequestT getFutBscInqPosnMembTsfRequestT(char* testCaseNum , const char *root) {
	futBscInqPosnMembTsfRequestT vfutBscInqPosnMembTsfRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscInqPosnMembTsfRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscInqPosnMembTsfRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscInqPosnMembTsfRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscInqPosnMembTsfRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqPosnMembTsfRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqPosnMembTsfRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqPosnMembTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqPosnMembTsfRequestT getFutExtInqPosnMembTsfRequestT(char* testCaseNum , const char *root) {
	futExtInqPosnMembTsfRequestT vfutExtInqPosnMembTsfRequestT;
	int i;

	char lconfCodStsInd[1] = {""};
	getStrProperty("InqPosnMembTsf.futExtInqPosnMembTsfRequestT.confCodStsInd", lconfCodStsInd);
	vfutExtInqPosnMembTsfRequestT.confCodStsInd = lconfCodStsInd[0];
	return vfutExtInqPosnMembTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqPosnMembTsfRecT getFutBscInqPosnMembTsfRecT(char* testCaseNum , const char *root) {
	futBscInqPosnMembTsfRecT vfutBscInqPosnMembTsfRecT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscInqPosnMembTsfRecT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRecT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscInqPosnMembTsfRecT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscInqPosnMembTsfRecT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRecT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscInqPosnMembTsfRecT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscInqPosnMembTsfRecT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRecT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscInqPosnMembTsfRecT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscInqPosnMembTsfRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscInqPosnMembTsfRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqPosnMembTsfRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRecT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqPosnMembTsfRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		vfutBscInqPosnMembTsfRecT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRecT.posTrnTyp", lposTrnTyp);
	memcpy(vfutBscInqPosnMembTsfRecT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	vfutBscInqPosnMembTsfRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqPosnMembTsfRecT");
	vfutBscInqPosnMembTsfRecT.acctTypCodFromGrp = getAcctTypCodFromGrpT(testCaseNum, "futBscInqPosnMembTsfRecT");
	vfutBscInqPosnMembTsfRecT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "futBscInqPosnMembTsfRecT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqPosnMembTsfRecT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRecT.lngQty", llngQty);
	memcpy(vfutBscInqPosnMembTsfRecT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqPosnMembTsfRecT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRecT.shtQty", lshtQty);
	memcpy(vfutBscInqPosnMembTsfRecT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqPosnMembTsfRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqPosnMembTsfRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscInqPosnMembTsfRecT.cshAmntPosnTsf[i]= ' ';
	}
	char lcshAmntPosnTsf[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfRecT.cshAmntPosnTsf", lcshAmntPosnTsf);
	memcpy(vfutBscInqPosnMembTsfRecT.cshAmntPosnTsf, lcshAmntPosnTsf, DRIV_AMOUNT_LEN);

	vfutBscInqPosnMembTsfRecT.txtGrp = getTxtGrpT(testCaseNum, "futBscInqPosnMembTsfRecT");	return vfutBscInqPosnMembTsfRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqPosnMembTsfResponseT getFutBscInqPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	futBscInqPosnMembTsfResponseT vfutBscInqPosnMembTsfResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqPosnMembTsfResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqPosnMembTsfResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqPosnMembTsfResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqPosnMembTsf.futBscInqPosnMembTsfResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqPosnMembTsfResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqPosnMembTsfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqPosnMembTsfRecT getFutExtInqPosnMembTsfRecT(char* testCaseNum , const char *root) {
	futExtInqPosnMembTsfRecT vfutExtInqPosnMembTsfRecT;
	int i;

	char lconfCodMembClgIdFrom[1] = {""};
	getStrProperty("InqPosnMembTsf.futExtInqPosnMembTsfRecT.confCodMembClgIdFrom", lconfCodMembClgIdFrom);
	vfutExtInqPosnMembTsfRecT.confCodMembClgIdFrom = lconfCodMembClgIdFrom[0];

	char lconfCodMembExchIdFrom[1] = {""};
	getStrProperty("InqPosnMembTsf.futExtInqPosnMembTsfRecT.confCodMembExchIdFrom", lconfCodMembExchIdFrom);
	vfutExtInqPosnMembTsfRecT.confCodMembExchIdFrom = lconfCodMembExchIdFrom[0];

	char lconfCodMembClgIdTo[1] = {""};
	getStrProperty("InqPosnMembTsf.futExtInqPosnMembTsfRecT.confCodMembClgIdTo", lconfCodMembClgIdTo);
	vfutExtInqPosnMembTsfRecT.confCodMembClgIdTo = lconfCodMembClgIdTo[0];

	char lconfCodMembExchIdTo[1] = {""};
	getStrProperty("InqPosnMembTsf.futExtInqPosnMembTsfRecT.confCodMembExchIdTo", lconfCodMembExchIdTo);
	vfutExtInqPosnMembTsfRecT.confCodMembExchIdTo = lconfCodMembExchIdTo[0];
	return vfutExtInqPosnMembTsfRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqPosnMembTsfResponseT getFutExtInqPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	futExtInqPosnMembTsfResponseT vfutExtInqPosnMembTsfResponseT;
	int i;
	return vfutExtInqPosnMembTsfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqPosnMembTsfRequestT getOptBscInqPosnMembTsfRequestT(char* testCaseNum , const char *root) {
	optBscInqPosnMembTsfRequestT voptBscInqPosnMembTsfRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscInqPosnMembTsfRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscInqPosnMembTsfRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqPosnMembTsfRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqPosnMembTsfRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqPosnMembTsfRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqPosnMembTsfRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqPosnMembTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqPosnMembTsfRequestT getOptExtInqPosnMembTsfRequestT(char* testCaseNum , const char *root) {
	optExtInqPosnMembTsfRequestT voptExtInqPosnMembTsfRequestT;
	int i;

	char lconfCodStsInd[1] = {""};
	getStrProperty("InqPosnMembTsf.optExtInqPosnMembTsfRequestT.confCodStsInd", lconfCodStsInd);
	voptExtInqPosnMembTsfRequestT.confCodStsInd = lconfCodStsInd[0];
	return voptExtInqPosnMembTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqPosnMembTsfRecT getOptBscInqPosnMembTsfRecT(char* testCaseNum , const char *root) {
	optBscInqPosnMembTsfRecT voptBscInqPosnMembTsfRecT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscInqPosnMembTsfRecT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRecT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscInqPosnMembTsfRecT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscInqPosnMembTsfRecT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRecT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscInqPosnMembTsfRecT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscInqPosnMembTsfRecT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRecT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscInqPosnMembTsfRecT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscInqPosnMembTsfRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscInqPosnMembTsfRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqPosnMembTsfRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRecT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqPosnMembTsfRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		voptBscInqPosnMembTsfRecT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRecT.posTrnTyp", lposTrnTyp);
	memcpy(voptBscInqPosnMembTsfRecT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	voptBscInqPosnMembTsfRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqPosnMembTsfRecT");
	voptBscInqPosnMembTsfRecT.acctTypCodFromGrp = getAcctTypCodFromGrpT(testCaseNum, "optBscInqPosnMembTsfRecT");
	voptBscInqPosnMembTsfRecT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "optBscInqPosnMembTsfRecT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqPosnMembTsfRecT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRecT.lngQty", llngQty);
	memcpy(voptBscInqPosnMembTsfRecT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqPosnMembTsfRecT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRecT.shtQty", lshtQty);
	memcpy(voptBscInqPosnMembTsfRecT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqPosnMembTsfRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqPosnMembTsfRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscInqPosnMembTsfRecT.cshAmntPosnTsf[i]= ' ';
	}
	char lcshAmntPosnTsf[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfRecT.cshAmntPosnTsf", lcshAmntPosnTsf);
	memcpy(voptBscInqPosnMembTsfRecT.cshAmntPosnTsf, lcshAmntPosnTsf, DRIV_AMOUNT_LEN);

	voptBscInqPosnMembTsfRecT.txtGrp = getTxtGrpT(testCaseNum, "optBscInqPosnMembTsfRecT");	return voptBscInqPosnMembTsfRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqPosnMembTsfResponseT getOptBscInqPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	optBscInqPosnMembTsfResponseT voptBscInqPosnMembTsfResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqPosnMembTsfResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqPosnMembTsfResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqPosnMembTsfResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqPosnMembTsf.optBscInqPosnMembTsfResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqPosnMembTsfResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqPosnMembTsfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqPosnMembTsfRecT getOptExtInqPosnMembTsfRecT(char* testCaseNum , const char *root) {
	optExtInqPosnMembTsfRecT voptExtInqPosnMembTsfRecT;
	int i;

	char lconfCodMembClgIdFrom[1] = {""};
	getStrProperty("InqPosnMembTsf.optExtInqPosnMembTsfRecT.confCodMembClgIdFrom", lconfCodMembClgIdFrom);
	voptExtInqPosnMembTsfRecT.confCodMembClgIdFrom = lconfCodMembClgIdFrom[0];

	char lconfCodMembExchIdFrom[1] = {""};
	getStrProperty("InqPosnMembTsf.optExtInqPosnMembTsfRecT.confCodMembExchIdFrom", lconfCodMembExchIdFrom);
	voptExtInqPosnMembTsfRecT.confCodMembExchIdFrom = lconfCodMembExchIdFrom[0];

	char lconfCodMembClgIdTo[1] = {""};
	getStrProperty("InqPosnMembTsf.optExtInqPosnMembTsfRecT.confCodMembClgIdTo", lconfCodMembClgIdTo);
	voptExtInqPosnMembTsfRecT.confCodMembClgIdTo = lconfCodMembClgIdTo[0];

	char lconfCodMembExchIdTo[1] = {""};
	getStrProperty("InqPosnMembTsf.optExtInqPosnMembTsfRecT.confCodMembExchIdTo", lconfCodMembExchIdTo);
	voptExtInqPosnMembTsfRecT.confCodMembExchIdTo = lconfCodMembExchIdTo[0];
	return voptExtInqPosnMembTsfRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqPosnMembTsfResponseT getOptExtInqPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	optExtInqPosnMembTsfResponseT voptExtInqPosnMembTsfResponseT;
	int i;
	return voptExtInqPosnMembTsfResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqPosnMembTsfRequestT* getFutInqPosnMembTsfRequestT(char* testCaseNum) {
	vfutInqPosnMembTsfRequestT = (futInqPosnMembTsfRequestT*)malloc(sizeof(futInqPosnMembTsfRequestT));
	int i;

	vfutInqPosnMembTsfRequestT->header = getDataHeaderT(testCaseNum, "futInqPosnMembTsfRequestT");
	vfutInqPosnMembTsfRequestT->basic = getFutBscInqPosnMembTsfRequestT(testCaseNum, "futInqPosnMembTsfRequestT");
	vfutInqPosnMembTsfRequestT->extension = getFutExtInqPosnMembTsfRequestT(testCaseNum, "futInqPosnMembTsfRequestT");
	return vfutInqPosnMembTsfRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqPosnMembTsfResponseT* getFutInqPosnMembTsfResponseT(char* testCaseNum) {
	vfutInqPosnMembTsfResponseT = (futInqPosnMembTsfResponseT*)malloc(sizeof(futInqPosnMembTsfResponseT));
	int i;

	vfutInqPosnMembTsfResponseT->header = getDataHeaderT(testCaseNum, "futInqPosnMembTsfResponseT");
	vfutInqPosnMembTsfResponseT->basic = getFutBscInqPosnMembTsfResponseT(testCaseNum, "futInqPosnMembTsfResponseT");
	vfutInqPosnMembTsfResponseT->extension = getFutExtInqPosnMembTsfResponseT(testCaseNum, "futInqPosnMembTsfResponseT");
	return vfutInqPosnMembTsfResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqPosnMembTsfRequestT* getOptInqPosnMembTsfRequestT(char* testCaseNum) {
	voptInqPosnMembTsfRequestT = (optInqPosnMembTsfRequestT*)malloc(sizeof(optInqPosnMembTsfRequestT));
	int i;

	voptInqPosnMembTsfRequestT->header = getDataHeaderT(testCaseNum, "optInqPosnMembTsfRequestT");
	voptInqPosnMembTsfRequestT->basic = getOptBscInqPosnMembTsfRequestT(testCaseNum, "optInqPosnMembTsfRequestT");
	voptInqPosnMembTsfRequestT->extension = getOptExtInqPosnMembTsfRequestT(testCaseNum, "optInqPosnMembTsfRequestT");
	return voptInqPosnMembTsfRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqPosnMembTsfResponseT* getOptInqPosnMembTsfResponseT(char* testCaseNum) {
	voptInqPosnMembTsfResponseT = (optInqPosnMembTsfResponseT*)malloc(sizeof(optInqPosnMembTsfResponseT));
	int i;

	voptInqPosnMembTsfResponseT->header = getDataHeaderT(testCaseNum, "optInqPosnMembTsfResponseT");
	voptInqPosnMembTsfResponseT->basic = getOptBscInqPosnMembTsfResponseT(testCaseNum, "optInqPosnMembTsfResponseT");
	voptInqPosnMembTsfResponseT->extension = getOptExtInqPosnMembTsfResponseT(testCaseNum, "optInqPosnMembTsfResponseT");
	return voptInqPosnMembTsfResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqPosnMembTsfRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqPosnMembTsfRequestT));
	futInqPosnMembTsfRequestT *vfutInqPosnMembTsfRequestT = getFutInqPosnMembTsfRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqPosnMembTsfRequestT), (jbyte*) vfutInqPosnMembTsfRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqPosnMembTsfResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqPosnMembTsfResponseT));
	futInqPosnMembTsfResponseT *vfutInqPosnMembTsfResponseT = getFutInqPosnMembTsfResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqPosnMembTsfResponseT), (jbyte*) vfutInqPosnMembTsfResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqPosnMembTsfRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqPosnMembTsfRequestT));
	optInqPosnMembTsfRequestT *voptInqPosnMembTsfRequestT = getOptInqPosnMembTsfRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqPosnMembTsfRequestT), (jbyte*) voptInqPosnMembTsfRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqPosnMembTsfResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqPosnMembTsfResponseT));
	optInqPosnMembTsfResponseT *voptInqPosnMembTsfResponseT = getOptInqPosnMembTsfResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqPosnMembTsfResponseT), (jbyte*) voptInqPosnMembTsfResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqPosnMembTsfRequestT(futBscInqPosnMembTsfRequestT actual, futBscInqPosnMembTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqPosnMembTsfRequestT(futExtInqPosnMembTsfRequestT actual, futExtInqPosnMembTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.confCodStsInd!= expected.confCodStsInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqPosnMembTsfRequestT, confCodStsIndnot matching. Actual %d but Expected %d", actual.confCodStsInd, expected.confCodStsInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqPosnMembTsfRecT(futBscInqPosnMembTsfRecT actual, futBscInqPosnMembTsfRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRecT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRecT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRecT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRecT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareAcctTypCodFromGrpT (actual.acctTypCodFromGrp,expected.acctTypCodFromGrp, logMsg);
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRecT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRecT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshAmntPosnTsf, expected.cshAmntPosnTsf, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfRecT, cshAmntPosnTsf not matching. Actual %s but Expected %s", actual.cshAmntPosnTsf, expected.cshAmntPosnTsf);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqPosnMembTsfResponseT(futBscInqPosnMembTsfResponseT actual, futBscInqPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnMembTsfResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_POSN_MEMB_TSF_REC_MAX;i++) {
		compareFutBscInqPosnMembTsfRecT (actual.futBscInqPosnMembTsfRec[i],expected.futBscInqPosnMembTsfRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqPosnMembTsfRecT(futExtInqPosnMembTsfRecT actual, futExtInqPosnMembTsfRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.confCodMembClgIdFrom!= expected.confCodMembClgIdFrom) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqPosnMembTsfRecT, confCodMembClgIdFromnot matching. Actual %d but Expected %d", actual.confCodMembClgIdFrom, expected.confCodMembClgIdFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.confCodMembExchIdFrom!= expected.confCodMembExchIdFrom) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqPosnMembTsfRecT, confCodMembExchIdFromnot matching. Actual %d but Expected %d", actual.confCodMembExchIdFrom, expected.confCodMembExchIdFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.confCodMembClgIdTo!= expected.confCodMembClgIdTo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqPosnMembTsfRecT, confCodMembClgIdTonot matching. Actual %d but Expected %d", actual.confCodMembClgIdTo, expected.confCodMembClgIdTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.confCodMembExchIdTo!= expected.confCodMembExchIdTo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqPosnMembTsfRecT, confCodMembExchIdTonot matching. Actual %d but Expected %d", actual.confCodMembExchIdTo, expected.confCodMembExchIdTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqPosnMembTsfResponseT(futExtInqPosnMembTsfResponseT actual, futExtInqPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_POSN_MEMB_TSF_REC_MAX;i++) {
		compareFutExtInqPosnMembTsfRecT (actual.futExtInqPosnMembTsfRec[i],expected.futExtInqPosnMembTsfRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqPosnMembTsfRequestT(optBscInqPosnMembTsfRequestT actual, optBscInqPosnMembTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqPosnMembTsfRequestT(optExtInqPosnMembTsfRequestT actual, optExtInqPosnMembTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.confCodStsInd!= expected.confCodStsInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqPosnMembTsfRequestT, confCodStsIndnot matching. Actual %d but Expected %d", actual.confCodStsInd, expected.confCodStsInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqPosnMembTsfRecT(optBscInqPosnMembTsfRecT actual, optBscInqPosnMembTsfRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRecT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRecT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRecT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRecT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareAcctTypCodFromGrpT (actual.acctTypCodFromGrp,expected.acctTypCodFromGrp, logMsg);
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRecT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRecT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshAmntPosnTsf, expected.cshAmntPosnTsf, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfRecT, cshAmntPosnTsf not matching. Actual %s but Expected %s", actual.cshAmntPosnTsf, expected.cshAmntPosnTsf);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqPosnMembTsfResponseT(optBscInqPosnMembTsfResponseT actual, optBscInqPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnMembTsfResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_POSN_MEMB_TSF_REC_MAX;i++) {
		compareOptBscInqPosnMembTsfRecT (actual.optBscInqPosnMembTsfRec[i],expected.optBscInqPosnMembTsfRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqPosnMembTsfRecT(optExtInqPosnMembTsfRecT actual, optExtInqPosnMembTsfRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.confCodMembClgIdFrom!= expected.confCodMembClgIdFrom) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqPosnMembTsfRecT, confCodMembClgIdFromnot matching. Actual %d but Expected %d", actual.confCodMembClgIdFrom, expected.confCodMembClgIdFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.confCodMembExchIdFrom!= expected.confCodMembExchIdFrom) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqPosnMembTsfRecT, confCodMembExchIdFromnot matching. Actual %d but Expected %d", actual.confCodMembExchIdFrom, expected.confCodMembExchIdFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.confCodMembClgIdTo!= expected.confCodMembClgIdTo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqPosnMembTsfRecT, confCodMembClgIdTonot matching. Actual %d but Expected %d", actual.confCodMembClgIdTo, expected.confCodMembClgIdTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.confCodMembExchIdTo!= expected.confCodMembExchIdTo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqPosnMembTsfRecT, confCodMembExchIdTonot matching. Actual %d but Expected %d", actual.confCodMembExchIdTo, expected.confCodMembExchIdTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqPosnMembTsfResponseT(optExtInqPosnMembTsfResponseT actual, optExtInqPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_POSN_MEMB_TSF_REC_MAX;i++) {
		compareOptExtInqPosnMembTsfRecT (actual.optExtInqPosnMembTsfRec[i],expected.optExtInqPosnMembTsfRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqPosnMembTsfRequestT(futInqPosnMembTsfRequestT actual, futInqPosnMembTsfRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqPosnMembTsfRequestT (actual.basic,expected.basic, logMsg);	compareFutExtInqPosnMembTsfRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqPosnMembTsfResponseT(futInqPosnMembTsfResponseT actual, futInqPosnMembTsfResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqPosnMembTsfResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqPosnMembTsfResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqPosnMembTsfRequestT(optInqPosnMembTsfRequestT actual, optInqPosnMembTsfRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqPosnMembTsfRequestT (actual.basic,expected.basic, logMsg);	compareOptExtInqPosnMembTsfRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqPosnMembTsfResponseT(optInqPosnMembTsfResponseT actual, optInqPosnMembTsfResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqPosnMembTsfResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqPosnMembTsfResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqPosnMembTsfRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqPosnMembTsfRequestT *actualData = (futInqPosnMembTsfRequestT *)msgStruct;
	futInqPosnMembTsfRequestT* expectedData = getFutInqPosnMembTsfRequestT(testCaseNum);
	compareFutInqPosnMembTsfRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqPosnMembTsfResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqPosnMembTsfResponseT *actualData = (futInqPosnMembTsfResponseT *)msgStruct;
	futInqPosnMembTsfResponseT* expectedData = getFutInqPosnMembTsfResponseT(testCaseNum);
	compareFutInqPosnMembTsfResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqPosnMembTsfRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqPosnMembTsfRequestT *actualData = (optInqPosnMembTsfRequestT *)msgStruct;
	optInqPosnMembTsfRequestT* expectedData = getOptInqPosnMembTsfRequestT(testCaseNum);
	compareOptInqPosnMembTsfRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqPosnMembTsfResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqPosnMembTsfResponseT *actualData = (optInqPosnMembTsfResponseT *)msgStruct;
	optInqPosnMembTsfResponseT* expectedData = getOptInqPosnMembTsfResponseT(testCaseNum);
	compareOptInqPosnMembTsfResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
