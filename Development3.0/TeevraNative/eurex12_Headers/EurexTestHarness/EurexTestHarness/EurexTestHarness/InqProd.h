#include <InqProd.hxx>
#define BUFFER_SIZE 1000

futInqProdRequestT *vfutInqProdRequestT;
futInqProdResponseT *vfutInqProdResponseT;
optInqProdRequestT *voptInqProdRequestT;
optInqProdResponseT *voptInqProdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqProdRequestT getFutBscInqProdRequestT(char* testCaseNum , const char *root) {
	futBscInqProdRequestT vfutBscInqProdRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscInqProdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRequestT.prodId", lprodId);
	memcpy(vfutBscInqProdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<PROD_TYP_ID_LEN;i++) {
		vfutBscInqProdRequestT.prodTypId[i]= ' ';
	}
	char lprodTypId[PROD_TYP_ID_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRequestT.prodTypId", lprodTypId);
	memcpy(vfutBscInqProdRequestT.prodTypId, lprodTypId, PROD_TYP_ID_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqProdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqProdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqProdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqProdRecT getFutBscInqProdRecT(char* testCaseNum , const char *root) {
	futBscInqProdRecT vfutBscInqProdRecT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscInqProdRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.prodId", lprodId);
	memcpy(vfutBscInqProdRecT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vfutBscInqProdRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.isinCod", lisinCod);
	memcpy(vfutBscInqProdRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscInqProdRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.currTypCod", lcurrTypCod);
	memcpy(vfutBscInqProdRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<PROD_SHT_NAM_LEN;i++) {
		vfutBscInqProdRecT.prodShtNam[i]= ' ';
	}
	char lprodShtNam[PROD_SHT_NAM_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.prodShtNam", lprodShtNam);
	memcpy(vfutBscInqProdRecT.prodShtNam, lprodShtNam, PROD_SHT_NAM_LEN);

	char lexchAff[1] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.exchAff", lexchAff);
	vfutBscInqProdRecT.exchAff = lexchAff[0];

	for(i=0;i<MAX_PRC_LEN;i++) {
		vfutBscInqProdRecT.maxPrc[i]= ' ';
	}
	char lmaxPrc[MAX_PRC_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.maxPrc", lmaxPrc);
	memcpy(vfutBscInqProdRecT.maxPrc, lmaxPrc, MAX_PRC_LEN);

	char lquoEqlQtyInd[1] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.quoEqlQtyInd", lquoEqlQtyInd);
	vfutBscInqProdRecT.quoEqlQtyInd = lquoEqlQtyInd[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqProdRecT.quoMinQty[i]= ' ';
	}
	char lquoMinQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.quoMinQty", lquoMinQty);
	memcpy(vfutBscInqProdRecT.quoMinQty, lquoMinQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqProdRecT.fastMktMinQty[i]= ' ';
	}
	char lfastMktMinQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.fastMktMinQty", lfastMktMinQty);
	memcpy(vfutBscInqProdRecT.fastMktMinQty, lfastMktMinQty, DRIV_VOLUME_LEN);

	for(i=0;i<FAST_MKT_PCNT_LEN;i++) {
		vfutBscInqProdRecT.fastMktPcnt[i]= ' ';
	}
	char lfastMktPcnt[FAST_MKT_PCNT_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.fastMktPcnt", lfastMktPcnt);
	memcpy(vfutBscInqProdRecT.fastMktPcnt, lfastMktPcnt, FAST_MKT_PCNT_LEN);

	for(i=0;i<SETL_DISP_DCML_LEN;i++) {
		vfutBscInqProdRecT.setlDispDcml[i]= ' ';
	}
	char lsetlDispDcml[SETL_DISP_DCML_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.setlDispDcml", lsetlDispDcml);
	memcpy(vfutBscInqProdRecT.setlDispDcml, lsetlDispDcml, SETL_DISP_DCML_LEN);

	for(i=0;i<UNDR_DISP_DCML_LEN;i++) {
		vfutBscInqProdRecT.undrDispDcml[i]= ' ';
	}
	char lundrDispDcml[UNDR_DISP_DCML_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.undrDispDcml", lundrDispDcml);
	memcpy(vfutBscInqProdRecT.undrDispDcml, lundrDispDcml, UNDR_DISP_DCML_LEN);

	char lmgnStylTyp[1] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.mgnStylTyp", lmgnStylTyp);
	vfutBscInqProdRecT.mgnStylTyp = lmgnStylTyp[0];

	char loneSidQuoInd[1] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.oneSidQuoInd", loneSidQuoInd);
	vfutBscInqProdRecT.oneSidQuoInd = loneSidQuoInd[0];

	for(i=0;i<PRIM_EXCH_ID_COD_LEN;i++) {
		vfutBscInqProdRecT.primExchIdCod[i]= ' ';
	}
	char lprimExchIdCod[PRIM_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.primExchIdCod", lprimExchIdCod);
	memcpy(vfutBscInqProdRecT.primExchIdCod, lprimExchIdCod, PRIM_EXCH_ID_COD_LEN);

	for(i=0;i<UNDR_ID_LEN;i++) {
		vfutBscInqProdRecT.undrId[i]= ' ';
	}
	char lundrId[UNDR_ID_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.undrId", lundrId);
	memcpy(vfutBscInqProdRecT.undrId, lundrId, UNDR_ID_LEN);

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vfutBscInqProdRecT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.undrIsinCod", lundrIsinCod);
	memcpy(vfutBscInqProdRecT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqProdRecT.ticSiz[i]= ' ';
	}
	char lticSiz[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.ticSiz", lticSiz);
	memcpy(vfutBscInqProdRecT.ticSiz, lticSiz, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIC_VAL_LEN;i++) {
		vfutBscInqProdRecT.ticVal[i]= ' ';
	}
	char lticVal[DRIV_TIC_VAL_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.ticVal", lticVal);
	memcpy(vfutBscInqProdRecT.ticVal, lticVal, DRIV_TIC_VAL_LEN);

	for(i=0;i<PROD_TYP_COD_LEN;i++) {
		vfutBscInqProdRecT.prodTypCod[i]= ' ';
	}
	char lprodTypCod[PROD_TYP_COD_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.prodTypCod", lprodTypCod);
	memcpy(vfutBscInqProdRecT.prodTypCod, lprodTypCod, PROD_TYP_COD_LEN);

	for(i=0;i<PROD_TYP_NAM_LEN;i++) {
		vfutBscInqProdRecT.prodTypNam[i]= ' ';
	}
	char lprodTypNam[PROD_TYP_NAM_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.prodTypNam", lprodTypNam);
	memcpy(vfutBscInqProdRecT.prodTypNam, lprodTypNam, PROD_TYP_NAM_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqProdRecT.ipsOfstPrc[i]= ' ';
	}
	char lipsOfstPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.ipsOfstPrc", lipsOfstPrc);
	memcpy(vfutBscInqProdRecT.ipsOfstPrc, lipsOfstPrc, DRIV_PRICE_LEN);

	for(i=0;i<IPS_RTIO_LEN;i++) {
		vfutBscInqProdRecT.ipsRtio[i]= ' ';
	}
	char lipsRtio[IPS_RTIO_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.ipsRtio", lipsRtio);
	memcpy(vfutBscInqProdRecT.ipsRtio, lipsRtio, IPS_RTIO_LEN);

	for(i=0;i<IPS_RTIO2_LEN;i++) {
		vfutBscInqProdRecT.ipsRtio2[i]= ' ';
	}
	char lipsRtio2[IPS_RTIO2_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.ipsRtio2", lipsRtio2);
	memcpy(vfutBscInqProdRecT.ipsRtio2, lipsRtio2, IPS_RTIO2_LEN);

	for(i=0;i<IPS_PROD_ID_LEN;i++) {
		vfutBscInqProdRecT.ipsProdId[i]= ' ';
	}
	char lipsProdId[IPS_PROD_ID_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.ipsProdId", lipsProdId);
	memcpy(vfutBscInqProdRecT.ipsProdId, lipsProdId, IPS_PROD_ID_LEN);

	for(i=0;i<IPS_PROD_ID2_LEN;i++) {
		vfutBscInqProdRecT.ipsProdId2[i]= ' ';
	}
	char lipsProdId2[IPS_PROD_ID2_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.ipsProdId2", lipsProdId2);
	memcpy(vfutBscInqProdRecT.ipsProdId2, lipsProdId2, IPS_PROD_ID2_LEN);

	for(i=0;i<DRIV_THEO_UNDR_ID_LEN;i++) {
		vfutBscInqProdRecT.theoUndrId[i]= ' ';
	}
	char ltheoUndrId[DRIV_THEO_UNDR_ID_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.theoUndrId", ltheoUndrId);
	memcpy(vfutBscInqProdRecT.theoUndrId, ltheoUndrId, DRIV_THEO_UNDR_ID_LEN);

	char lmtchTypCod[1] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.mtchTypCod", lmtchTypCod);
	vfutBscInqProdRecT.mtchTypCod = lmtchTypCod[0];

	for(i=0;i<PROD_DISP_DCML_LEN;i++) {
		vfutBscInqProdRecT.prodDispDcml[i]= ' ';
	}
	char lprodDispDcml[PROD_DISP_DCML_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.prodDispDcml", lprodDispDcml);
	memcpy(vfutBscInqProdRecT.prodDispDcml, lprodDispDcml, PROD_DISP_DCML_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqProdRecT.preTrdRiskRndLot[i]= ' ';
	}
	char lpreTrdRiskRndLot[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdRecT.preTrdRiskRndLot", lpreTrdRiskRndLot);
	memcpy(vfutBscInqProdRecT.preTrdRiskRndLot, lpreTrdRiskRndLot, DRIV_VOLUME_LEN);
	return vfutBscInqProdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqProdResponseT getFutBscInqProdResponseT(char* testCaseNum , const char *root) {
	futBscInqProdResponseT vfutBscInqProdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqProdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqProdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqProdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqProd.futBscInqProdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqProdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqProdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqProdRequestT getOptBscInqProdRequestT(char* testCaseNum , const char *root) {
	optBscInqProdRequestT voptBscInqProdRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscInqProdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRequestT.prodId", lprodId);
	memcpy(voptBscInqProdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<PROD_TYP_ID_LEN;i++) {
		voptBscInqProdRequestT.prodTypId[i]= ' ';
	}
	char lprodTypId[PROD_TYP_ID_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRequestT.prodTypId", lprodTypId);
	memcpy(voptBscInqProdRequestT.prodTypId, lprodTypId, PROD_TYP_ID_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqProdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqProdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqProdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqProdRecT getOptBscInqProdRecT(char* testCaseNum , const char *root) {
	optBscInqProdRecT voptBscInqProdRecT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscInqProdRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.prodId", lprodId);
	memcpy(voptBscInqProdRecT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		voptBscInqProdRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.isinCod", lisinCod);
	memcpy(voptBscInqProdRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscInqProdRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.currTypCod", lcurrTypCod);
	memcpy(voptBscInqProdRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<PROD_SHT_NAM_LEN;i++) {
		voptBscInqProdRecT.prodShtNam[i]= ' ';
	}
	char lprodShtNam[PROD_SHT_NAM_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.prodShtNam", lprodShtNam);
	memcpy(voptBscInqProdRecT.prodShtNam, lprodShtNam, PROD_SHT_NAM_LEN);

	char lexchAff[1] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.exchAff", lexchAff);
	voptBscInqProdRecT.exchAff = lexchAff[0];

	for(i=0;i<MAX_PRC_LEN;i++) {
		voptBscInqProdRecT.maxPrc[i]= ' ';
	}
	char lmaxPrc[MAX_PRC_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.maxPrc", lmaxPrc);
	memcpy(voptBscInqProdRecT.maxPrc, lmaxPrc, MAX_PRC_LEN);

	char lquoEqlQtyInd[1] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.quoEqlQtyInd", lquoEqlQtyInd);
	voptBscInqProdRecT.quoEqlQtyInd = lquoEqlQtyInd[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqProdRecT.quoMinQty[i]= ' ';
	}
	char lquoMinQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.quoMinQty", lquoMinQty);
	memcpy(voptBscInqProdRecT.quoMinQty, lquoMinQty, DRIV_VOLUME_LEN);

	for(i=0;i<ENT_MAS_QUO_REC_MAX_LEN;i++) {
		voptBscInqProdRecT.entMasQuoRecMax[i]= ' ';
	}
	char lentMasQuoRecMax[ENT_MAS_QUO_REC_MAX_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.entMasQuoRecMax", lentMasQuoRecMax);
	memcpy(voptBscInqProdRecT.entMasQuoRecMax, lentMasQuoRecMax, ENT_MAS_QUO_REC_MAX_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqProdRecT.fastMktMinQty[i]= ' ';
	}
	char lfastMktMinQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.fastMktMinQty", lfastMktMinQty);
	memcpy(voptBscInqProdRecT.fastMktMinQty, lfastMktMinQty, DRIV_VOLUME_LEN);

	for(i=0;i<FAST_MKT_PCNT_LEN;i++) {
		voptBscInqProdRecT.fastMktPcnt[i]= ' ';
	}
	char lfastMktPcnt[FAST_MKT_PCNT_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.fastMktPcnt", lfastMktPcnt);
	memcpy(voptBscInqProdRecT.fastMktPcnt, lfastMktPcnt, FAST_MKT_PCNT_LEN);

	for(i=0;i<SETL_DISP_DCML_LEN;i++) {
		voptBscInqProdRecT.setlDispDcml[i]= ' ';
	}
	char lsetlDispDcml[SETL_DISP_DCML_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.setlDispDcml", lsetlDispDcml);
	memcpy(voptBscInqProdRecT.setlDispDcml, lsetlDispDcml, SETL_DISP_DCML_LEN);

	for(i=0;i<UNDR_DISP_DCML_LEN;i++) {
		voptBscInqProdRecT.undrDispDcml[i]= ' ';
	}
	char lundrDispDcml[UNDR_DISP_DCML_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.undrDispDcml", lundrDispDcml);
	memcpy(voptBscInqProdRecT.undrDispDcml, lundrDispDcml, UNDR_DISP_DCML_LEN);

	char loneSidQuoInd[1] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.oneSidQuoInd", loneSidQuoInd);
	voptBscInqProdRecT.oneSidQuoInd = loneSidQuoInd[0];

	for(i=0;i<PRIM_EXCH_ID_COD_LEN;i++) {
		voptBscInqProdRecT.primExchIdCod[i]= ' ';
	}
	char lprimExchIdCod[PRIM_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.primExchIdCod", lprimExchIdCod);
	memcpy(voptBscInqProdRecT.primExchIdCod, lprimExchIdCod, PRIM_EXCH_ID_COD_LEN);

	for(i=0;i<UNDR_ID_LEN;i++) {
		voptBscInqProdRecT.undrId[i]= ' ';
	}
	char lundrId[UNDR_ID_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.undrId", lundrId);
	memcpy(voptBscInqProdRecT.undrId, lundrId, UNDR_ID_LEN);

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		voptBscInqProdRecT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.undrIsinCod", lundrIsinCod);
	memcpy(voptBscInqProdRecT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	char lexerStylTyp[1] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.exerStylTyp", lexerStylTyp);
	voptBscInqProdRecT.exerStylTyp = lexerStylTyp[0];

	char lmgnStylTyp[1] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.mgnStylTyp", lmgnStylTyp);
	voptBscInqProdRecT.mgnStylTyp = lmgnStylTyp[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqProdRecT.ticSiz[i]= ' ';
	}
	char lticSiz[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.ticSiz", lticSiz);
	memcpy(voptBscInqProdRecT.ticSiz, lticSiz, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIC_VAL_LEN;i++) {
		voptBscInqProdRecT.ticVal[i]= ' ';
	}
	char lticVal[DRIV_TIC_VAL_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.ticVal", lticVal);
	memcpy(voptBscInqProdRecT.ticVal, lticVal, DRIV_TIC_VAL_LEN);

	char lstratMtchTypCod[1] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.stratMtchTypCod", lstratMtchTypCod);
	voptBscInqProdRecT.stratMtchTypCod = lstratMtchTypCod[0];

	for(i=0;i<PROD_TYP_COD_LEN;i++) {
		voptBscInqProdRecT.prodTypCod[i]= ' ';
	}
	char lprodTypCod[PROD_TYP_COD_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.prodTypCod", lprodTypCod);
	memcpy(voptBscInqProdRecT.prodTypCod, lprodTypCod, PROD_TYP_COD_LEN);

	for(i=0;i<PROD_TYP_NAM_LEN;i++) {
		voptBscInqProdRecT.prodTypNam[i]= ' ';
	}
	char lprodTypNam[PROD_TYP_NAM_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.prodTypNam", lprodTypNam);
	memcpy(voptBscInqProdRecT.prodTypNam, lprodTypNam, PROD_TYP_NAM_LEN);

	char lexerPrcDcml[1] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.exerPrcDcml", lexerPrcDcml);
	voptBscInqProdRecT.exerPrcDcml = lexerPrcDcml[0];

	for(i=0;i<DRIV_THEO_UNDR_ID_LEN;i++) {
		voptBscInqProdRecT.theoUndrId[i]= ' ';
	}
	char ltheoUndrId[DRIV_THEO_UNDR_ID_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.theoUndrId", ltheoUndrId);
	memcpy(voptBscInqProdRecT.theoUndrId, ltheoUndrId, DRIV_THEO_UNDR_ID_LEN);

	for(i=0;i<PROD_DISP_DCML_LEN;i++) {
		voptBscInqProdRecT.prodDispDcml[i]= ' ';
	}
	char lprodDispDcml[PROD_DISP_DCML_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.prodDispDcml", lprodDispDcml);
	memcpy(voptBscInqProdRecT.prodDispDcml, lprodDispDcml, PROD_DISP_DCML_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqProdRecT.preTrdRiskRndLot[i]= ' ';
	}
	char lpreTrdRiskRndLot[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.preTrdRiskRndLot", lpreTrdRiskRndLot);
	memcpy(voptBscInqProdRecT.preTrdRiskRndLot, lpreTrdRiskRndLot, DRIV_VOLUME_LEN);

	for(i=0;i<UNDR_ID_LEN;i++) {
		voptBscInqProdRecT.volaStratUndrId[i]= ' ';
	}
	char lvolaStratUndrId[UNDR_ID_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdRecT.volaStratUndrId", lvolaStratUndrId);
	memcpy(voptBscInqProdRecT.volaStratUndrId, lvolaStratUndrId, UNDR_ID_LEN);
	return voptBscInqProdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqProdResponseT getOptBscInqProdResponseT(char* testCaseNum , const char *root) {
	optBscInqProdResponseT voptBscInqProdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqProdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqProdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqProdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqProd.optBscInqProdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqProdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqProdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqProdRequestT* getFutInqProdRequestT(char* testCaseNum) {
	vfutInqProdRequestT = (futInqProdRequestT*)malloc(sizeof(futInqProdRequestT));
	int i;

	vfutInqProdRequestT->header = getDataHeaderT(testCaseNum, "futInqProdRequestT");
	vfutInqProdRequestT->basic = getFutBscInqProdRequestT(testCaseNum, "futInqProdRequestT");
	return vfutInqProdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqProdResponseT* getFutInqProdResponseT(char* testCaseNum) {
	vfutInqProdResponseT = (futInqProdResponseT*)malloc(sizeof(futInqProdResponseT));
	int i;

	vfutInqProdResponseT->header = getDataHeaderT(testCaseNum, "futInqProdResponseT");
	vfutInqProdResponseT->basic = getFutBscInqProdResponseT(testCaseNum, "futInqProdResponseT");
	return vfutInqProdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqProdRequestT* getOptInqProdRequestT(char* testCaseNum) {
	voptInqProdRequestT = (optInqProdRequestT*)malloc(sizeof(optInqProdRequestT));
	int i;

	voptInqProdRequestT->header = getDataHeaderT(testCaseNum, "optInqProdRequestT");
	voptInqProdRequestT->basic = getOptBscInqProdRequestT(testCaseNum, "optInqProdRequestT");
	return voptInqProdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqProdResponseT* getOptInqProdResponseT(char* testCaseNum) {
	voptInqProdResponseT = (optInqProdResponseT*)malloc(sizeof(optInqProdResponseT));
	int i;

	voptInqProdResponseT->header = getDataHeaderT(testCaseNum, "optInqProdResponseT");
	voptInqProdResponseT->basic = getOptBscInqProdResponseT(testCaseNum, "optInqProdResponseT");
	return voptInqProdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqProdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqProdRequestT));
	futInqProdRequestT *vfutInqProdRequestT = getFutInqProdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqProdRequestT), (jbyte*) vfutInqProdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqProdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqProdResponseT));
	futInqProdResponseT *vfutInqProdResponseT = getFutInqProdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqProdResponseT), (jbyte*) vfutInqProdResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqProdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqProdRequestT));
	optInqProdRequestT *voptInqProdRequestT = getOptInqProdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqProdRequestT), (jbyte*) voptInqProdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqProdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqProdResponseT));
	optInqProdResponseT *voptInqProdResponseT = getOptInqProdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqProdResponseT), (jbyte*) voptInqProdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqProdRequestT(futBscInqProdRequestT actual, futBscInqProdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodTypId, expected.prodTypId, PROD_TYP_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRequestT, prodTypId not matching. Actual %s but Expected %s", actual.prodTypId, expected.prodTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqProdRecT(futBscInqProdRecT actual, futBscInqProdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodShtNam, expected.prodShtNam, PROD_SHT_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, prodShtNam not matching. Actual %s but Expected %s", actual.prodShtNam, expected.prodShtNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exchAff!= expected.exchAff) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, exchAffnot matching. Actual %d but Expected %d", actual.exchAff, expected.exchAff);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxPrc, expected.maxPrc, MAX_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, maxPrc not matching. Actual %s but Expected %s", actual.maxPrc, expected.maxPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.quoEqlQtyInd!= expected.quoEqlQtyInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, quoEqlQtyIndnot matching. Actual %d but Expected %d", actual.quoEqlQtyInd, expected.quoEqlQtyInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoMinQty, expected.quoMinQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, quoMinQty not matching. Actual %s but Expected %s", actual.quoMinQty, expected.quoMinQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.fastMktMinQty, expected.fastMktMinQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, fastMktMinQty not matching. Actual %s but Expected %s", actual.fastMktMinQty, expected.fastMktMinQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.fastMktPcnt, expected.fastMktPcnt, FAST_MKT_PCNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, fastMktPcnt not matching. Actual %s but Expected %s", actual.fastMktPcnt, expected.fastMktPcnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_PROD_SPRD_TBL_DATA_GRP_MAX;i++) {
		compareSprdTblGrpT (actual.sprdTblGrp[i],expected.sprdTblGrp[i], logMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_PROD_SPRD_LNK_REC_MAX;i++) {
		compareSprdLnkRecT (actual.sprdLnkRec[i],expected.sprdLnkRec[i], logMsg);
	}
	if ( memcmp(actual.setlDispDcml, expected.setlDispDcml, SETL_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, setlDispDcml not matching. Actual %s but Expected %s", actual.setlDispDcml, expected.setlDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrDispDcml, expected.undrDispDcml, UNDR_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, undrDispDcml not matching. Actual %s but Expected %s", actual.undrDispDcml, expected.undrDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.mgnStylTyp!= expected.mgnStylTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, mgnStylTypnot matching. Actual %d but Expected %d", actual.mgnStylTyp, expected.mgnStylTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.oneSidQuoInd!= expected.oneSidQuoInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, oneSidQuoIndnot matching. Actual %d but Expected %d", actual.oneSidQuoInd, expected.oneSidQuoInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.primExchIdCod, expected.primExchIdCod, PRIM_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, primExchIdCod not matching. Actual %s but Expected %s", actual.primExchIdCod, expected.primExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrId, expected.undrId, UNDR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, undrId not matching. Actual %s but Expected %s", actual.undrId, expected.undrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ticSiz, expected.ticSiz, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, ticSiz not matching. Actual %s but Expected %s", actual.ticSiz, expected.ticSiz);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ticVal, expected.ticVal, DRIV_TIC_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, ticVal not matching. Actual %s but Expected %s", actual.ticVal, expected.ticVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodTypCod, expected.prodTypCod, PROD_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, prodTypCod not matching. Actual %s but Expected %s", actual.prodTypCod, expected.prodTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodTypNam, expected.prodTypNam, PROD_TYP_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, prodTypNam not matching. Actual %s but Expected %s", actual.prodTypNam, expected.prodTypNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ipsOfstPrc, expected.ipsOfstPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, ipsOfstPrc not matching. Actual %s but Expected %s", actual.ipsOfstPrc, expected.ipsOfstPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ipsRtio, expected.ipsRtio, IPS_RTIO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, ipsRtio not matching. Actual %s but Expected %s", actual.ipsRtio, expected.ipsRtio);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ipsRtio2, expected.ipsRtio2, IPS_RTIO2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, ipsRtio2 not matching. Actual %s but Expected %s", actual.ipsRtio2, expected.ipsRtio2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ipsProdId, expected.ipsProdId, IPS_PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, ipsProdId not matching. Actual %s but Expected %s", actual.ipsProdId, expected.ipsProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ipsProdId2, expected.ipsProdId2, IPS_PROD_ID2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, ipsProdId2 not matching. Actual %s but Expected %s", actual.ipsProdId2, expected.ipsProdId2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.theoUndrId, expected.theoUndrId, DRIV_THEO_UNDR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, theoUndrId not matching. Actual %s but Expected %s", actual.theoUndrId, expected.theoUndrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.mtchTypCod!= expected.mtchTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, mtchTypCodnot matching. Actual %d but Expected %d", actual.mtchTypCod, expected.mtchTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodDispDcml, expected.prodDispDcml, PROD_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, prodDispDcml not matching. Actual %s but Expected %s", actual.prodDispDcml, expected.prodDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_PROD_PRC_STEP_TBL_GRP_MAX;i++) {
		comparePrcStepTblGrpT (actual.prcStepTblGrp[i],expected.prcStepTblGrp[i], logMsg);
	}
	if ( memcmp(actual.preTrdRiskRndLot, expected.preTrdRiskRndLot, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdRecT, preTrdRiskRndLot not matching. Actual %s but Expected %s", actual.preTrdRiskRndLot, expected.preTrdRiskRndLot);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqProdResponseT(futBscInqProdResponseT actual, futBscInqProdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqProdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_PROD_REC_MAX;i++) {
		compareFutBscInqProdRecT (actual.futBscInqProdRec[i],expected.futBscInqProdRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqProdRequestT(optBscInqProdRequestT actual, optBscInqProdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodTypId, expected.prodTypId, PROD_TYP_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRequestT, prodTypId not matching. Actual %s but Expected %s", actual.prodTypId, expected.prodTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqProdRecT(optBscInqProdRecT actual, optBscInqProdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodShtNam, expected.prodShtNam, PROD_SHT_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, prodShtNam not matching. Actual %s but Expected %s", actual.prodShtNam, expected.prodShtNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exchAff!= expected.exchAff) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, exchAffnot matching. Actual %d but Expected %d", actual.exchAff, expected.exchAff);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxPrc, expected.maxPrc, MAX_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, maxPrc not matching. Actual %s but Expected %s", actual.maxPrc, expected.maxPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.quoEqlQtyInd!= expected.quoEqlQtyInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, quoEqlQtyIndnot matching. Actual %d but Expected %d", actual.quoEqlQtyInd, expected.quoEqlQtyInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoMinQty, expected.quoMinQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, quoMinQty not matching. Actual %s but Expected %s", actual.quoMinQty, expected.quoMinQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.entMasQuoRecMax, expected.entMasQuoRecMax, ENT_MAS_QUO_REC_MAX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, entMasQuoRecMax not matching. Actual %s but Expected %s", actual.entMasQuoRecMax, expected.entMasQuoRecMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.fastMktMinQty, expected.fastMktMinQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, fastMktMinQty not matching. Actual %s but Expected %s", actual.fastMktMinQty, expected.fastMktMinQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.fastMktPcnt, expected.fastMktPcnt, FAST_MKT_PCNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, fastMktPcnt not matching. Actual %s but Expected %s", actual.fastMktPcnt, expected.fastMktPcnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_PROD_SPRD_TBL_DATA_GRP_MAX;i++) {
		compareSprdTblGrpT (actual.sprdTblGrp[i],expected.sprdTblGrp[i], logMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_PROD_SPRD_LNK_REC_MAX;i++) {
		compareSprdLnkRecT (actual.sprdLnkRec[i],expected.sprdLnkRec[i], logMsg);
	}
	if ( memcmp(actual.setlDispDcml, expected.setlDispDcml, SETL_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, setlDispDcml not matching. Actual %s but Expected %s", actual.setlDispDcml, expected.setlDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrDispDcml, expected.undrDispDcml, UNDR_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, undrDispDcml not matching. Actual %s but Expected %s", actual.undrDispDcml, expected.undrDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.oneSidQuoInd!= expected.oneSidQuoInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, oneSidQuoIndnot matching. Actual %d but Expected %d", actual.oneSidQuoInd, expected.oneSidQuoInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.primExchIdCod, expected.primExchIdCod, PRIM_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, primExchIdCod not matching. Actual %s but Expected %s", actual.primExchIdCod, expected.primExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrId, expected.undrId, UNDR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, undrId not matching. Actual %s but Expected %s", actual.undrId, expected.undrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerStylTyp!= expected.exerStylTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, exerStylTypnot matching. Actual %d but Expected %d", actual.exerStylTyp, expected.exerStylTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.mgnStylTyp!= expected.mgnStylTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, mgnStylTypnot matching. Actual %d but Expected %d", actual.mgnStylTyp, expected.mgnStylTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ticSiz, expected.ticSiz, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, ticSiz not matching. Actual %s but Expected %s", actual.ticSiz, expected.ticSiz);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ticVal, expected.ticVal, DRIV_TIC_VAL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, ticVal not matching. Actual %s but Expected %s", actual.ticVal, expected.ticVal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.stratMtchTypCod!= expected.stratMtchTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, stratMtchTypCodnot matching. Actual %d but Expected %d", actual.stratMtchTypCod, expected.stratMtchTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodTypCod, expected.prodTypCod, PROD_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, prodTypCod not matching. Actual %s but Expected %s", actual.prodTypCod, expected.prodTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodTypNam, expected.prodTypNam, PROD_TYP_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, prodTypNam not matching. Actual %s but Expected %s", actual.prodTypNam, expected.prodTypNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcml!= expected.exerPrcDcml) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, exerPrcDcmlnot matching. Actual %d but Expected %d", actual.exerPrcDcml, expected.exerPrcDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_PROD_PRC_STEP_TBL_GRP_MAX;i++) {
		comparePrcStepTblGrpT (actual.prcStepTblGrp[i],expected.prcStepTblGrp[i], logMsg);
	}
	if ( memcmp(actual.theoUndrId, expected.theoUndrId, DRIV_THEO_UNDR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, theoUndrId not matching. Actual %s but Expected %s", actual.theoUndrId, expected.theoUndrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodDispDcml, expected.prodDispDcml, PROD_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, prodDispDcml not matching. Actual %s but Expected %s", actual.prodDispDcml, expected.prodDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.preTrdRiskRndLot, expected.preTrdRiskRndLot, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, preTrdRiskRndLot not matching. Actual %s but Expected %s", actual.preTrdRiskRndLot, expected.preTrdRiskRndLot);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.volaStratUndrId, expected.volaStratUndrId, UNDR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdRecT, volaStratUndrId not matching. Actual %s but Expected %s", actual.volaStratUndrId, expected.volaStratUndrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqProdResponseT(optBscInqProdResponseT actual, optBscInqProdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqProdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_PROD_REC_MAX;i++) {
		compareOptBscInqProdRecT (actual.optBscInqProdRec[i],expected.optBscInqProdRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqProdRequestT(futInqProdRequestT actual, futInqProdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqProdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqProdResponseT(futInqProdResponseT actual, futInqProdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqProdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqProdRequestT(optInqProdRequestT actual, optInqProdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqProdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqProdResponseT(optInqProdResponseT actual, optInqProdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqProdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqProdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqProdRequestT *actualData = (futInqProdRequestT *)msgStruct;
	futInqProdRequestT* expectedData = getFutInqProdRequestT(testCaseNum);
	compareFutInqProdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqProdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqProdResponseT *actualData = (futInqProdResponseT *)msgStruct;
	futInqProdResponseT* expectedData = getFutInqProdResponseT(testCaseNum);
	compareFutInqProdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqProdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqProdRequestT *actualData = (optInqProdRequestT *)msgStruct;
	optInqProdRequestT* expectedData = getOptInqProdRequestT(testCaseNum);
	compareOptInqProdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqProdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqProdResponseT *actualData = (optInqProdResponseT *)msgStruct;
	optInqProdResponseT* expectedData = getOptInqProdResponseT(testCaseNum);
	compareOptInqProdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
