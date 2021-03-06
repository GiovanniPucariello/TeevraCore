/* Generated by Xgen from: E120.23.01 SIR 132470 on: 2009-06-02 16:47 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   SubSLegOrdrConf.hxx
*
*  DESCRIPTION: Layouts used for
*               Subscribe Single Leg Order Confirmation
*
*******************************************************************************/

#ifndef _SUBSLEGORDRCONF_HXX_
#define _SUBSLEGORDRCONF_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_SUB_S_LEG_ORDR_CONF_SUBJECT_T_
#define _FUT_BSC_SUB_S_LEG_ORDR_CONF_SUBJECT_T_

typedef struct futBscSubSLegOrdrConfSubjectTag
{
    char             membId          [MEMB_ID_LEN];
    char             prodId          [PROD_ID_LEN];
    char             cntrExpYrDat    [CNTR_EXP_YR_DAT_LEN];
    char             cntrExpMthDat   [CNTR_EXP_MTH_DAT_LEN];
    char             subjFill        [SUBJ_FILL_LEN];
} futBscSubSLegOrdrConfSubjectT, *pFutBscSubSLegOrdrConfSubjectT;

#endif  /* _FUT_BSC_SUB_S_LEG_ORDR_CONF_SUBJECT_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_
#define _FUT_BSC_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_

typedef struct futBscSubSLegOrdrConfPrivBcastTag
{
    char             buyCod;
    futCntrIdGrpT    futCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             ordrRmngQty     [DRIV_VOLUME_LEN];
    char             ordrExeQty      [DRIV_VOLUME_LEN];
    char             ordrTotExeQty   [DRIV_VOLUME_LEN];
    char             ordrTotQty      [DRIV_VOLUME_LEN];
    char             ordrTypCod;
    char             ordrExePrc      [DRIV_PRICE_LEN];
    char             ordrTrgPrc      [DRIV_PRICE_LEN];
    char             ordrResCod;
    char             ordrExpDat      [DRIV_DATE_LEN];
    char             opnClsCod;
    char             ordrCreDat      [DRIV_DATE_LEN];
    char             ordrCreTim      [DRIV_TIME_LEN];
    char             ordrPrioDat     [DRIV_DATE_LEN];
    char             ordrPrioTim     [DRIV_TIME_LEN];
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
    char             membExchIdCodObo [MEMB_EXCH_ID_COD_OBO_LEN];
    char             ordrTrnTypId    [ORDR_TRN_TYP_ID_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} futBscSubSLegOrdrConfPrivBcastT, *pFutBscSubSLegOrdrConfPrivBcastT;

#endif  /* _FUT_BSC_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_
#define _FUT_EXT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_

typedef struct futExtSubSLegOrdrConfPrivBcastTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             ordrNoOld       [DRIV_ORDR_NO_LEN];
    trdIdOboGrpT     trdIdOboGrp;
    char             exchIdCod       [DRIV_EXCH_ID_COD_LEN];
    char             isinCod         [ISIN_COD_LEN];
    char             ordrPersInd;
    char             userOrdrRef     [USER_ORDR_REF_LEN];
    char             etsSesId        [ETS_SES_ID_LEN];
} futExtSubSLegOrdrConfPrivBcastT, *pFutExtSubSLegOrdrConfPrivBcastT;

#endif  /* _FUT_EXT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_
#define _FUT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_

typedef struct futSubSLegOrdrConfPrivBcastTag
{
    futBscSeqNoT     seqNo;
    dataHeaderT      header;
    futBscSubSLegOrdrConfPrivBcastT basic;
    futExtSubSLegOrdrConfPrivBcastT extension;
} futSubSLegOrdrConfPrivBcastT, *pFutSubSLegOrdrConfPrivBcastT;

#endif  /* _FUT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_
#define _OPT_BSC_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_

typedef struct optBscSubSLegOrdrConfPrivBcastTag
{
    char             buyCod;
    optCntrIdGrpT    optCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             ordrRmngQty     [DRIV_VOLUME_LEN];
    char             ordrExeQty      [DRIV_VOLUME_LEN];
    char             ordrTotExeQty   [DRIV_VOLUME_LEN];
    char             ordrTotQty      [DRIV_VOLUME_LEN];
    char             ordrTypCod;
    char             ordrExePrc      [DRIV_PRICE_LEN];
    char             ordrResCod;
    char             ordrExpDat      [DRIV_DATE_LEN];
    char             opnClsCod;
    char             ordrCreDat      [DRIV_DATE_LEN];
    char             ordrCreTim      [DRIV_TIME_LEN];
    char             ordrPrioDat     [DRIV_DATE_LEN];
    char             ordrPrioTim     [DRIV_TIME_LEN];
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
    char             membExchIdCodObo [MEMB_EXCH_ID_COD_OBO_LEN];
    char             ordrTrnTypId    [ORDR_TRN_TYP_ID_LEN];
    char             cntrGenNo;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} optBscSubSLegOrdrConfPrivBcastT, *pOptBscSubSLegOrdrConfPrivBcastT;

#endif  /* _OPT_BSC_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_
#define _OPT_EXT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_

typedef struct optExtSubSLegOrdrConfPrivBcastTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             ordrNoOld       [DRIV_ORDR_NO_LEN];
    trdIdOboGrpT     trdIdOboGrp;
    char             exchIdCod       [DRIV_EXCH_ID_COD_LEN];
    char             isinCod         [ISIN_COD_LEN];
    char             ordrPersInd;
    char             userOrdrRef     [USER_ORDR_REF_LEN];
    char             etsSesId        [ETS_SES_ID_LEN];
} optExtSubSLegOrdrConfPrivBcastT, *pOptExtSubSLegOrdrConfPrivBcastT;

#endif  /* _OPT_EXT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_
#define _OPT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_

typedef struct optSubSLegOrdrConfPrivBcastTag
{
    optBscSeqNoT     seqNo;
    dataHeaderT      header;
    optBscSubSLegOrdrConfPrivBcastT basic;
    optExtSubSLegOrdrConfPrivBcastT extension;
} optSubSLegOrdrConfPrivBcastT, *pOptSubSLegOrdrConfPrivBcastT;

#endif  /* _OPT_SUB_S_LEG_ORDR_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_SUB_S_LEG_ORDR_CONF_SUBJECT_T_
#define _OPT_BSC_SUB_S_LEG_ORDR_CONF_SUBJECT_T_

typedef struct optBscSubSLegOrdrConfSubjectTag
{
    char             membId          [MEMB_ID_LEN];
    char             prodId          [PROD_ID_LEN];
    char             cntrExpYrDat    [CNTR_EXP_YR_DAT_LEN];
    char             cntrExpMthDat   [CNTR_EXP_MTH_DAT_LEN];
    char             cntrClasCod;
    char             cntrExerPrc     [CNTR_EXER_PRC_LEN];
    char             cntrVersNo;
} optBscSubSLegOrdrConfSubjectT, *pOptBscSubSLegOrdrConfSubjectT;

#endif  /* _OPT_BSC_SUB_S_LEG_ORDR_CONF_SUBJECT_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _SUBSLEGORDRCONF_HXX_ */

/******************************************************************************/
/* End of file SubSLegOrdrConf.hxx */
/******************************************************************************/
