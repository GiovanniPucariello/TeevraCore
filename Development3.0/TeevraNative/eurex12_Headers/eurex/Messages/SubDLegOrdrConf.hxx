/* Generated by Xgen from: E120.23.01 SIR 132470 on: 2009-06-02 16:47 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   SubDLegOrdrConf.hxx
*
*  DESCRIPTION: Layouts used for
*               Subscribe Double Leg Order Confirmation
*
*******************************************************************************/

#ifndef _SUBDLEGORDRCONF_HXX_
#define _SUBDLEGORDRCONF_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_SUB_D_LEG_ORDR_CONF_SUBJECT_T_
#define _FUT_BSC_SUB_D_LEG_ORDR_CONF_SUBJECT_T_

typedef struct futBscSubDLegOrdrConfSubjectTag
{
    char             membId          [MEMB_ID_LEN];
    char             prodId          [PROD_ID_LEN];
} futBscSubDLegOrdrConfSubjectT, *pFutBscSubDLegOrdrConfSubjectT;

#endif  /* _FUT_BSC_SUB_D_LEG_ORDR_CONF_SUBJECT_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_SUB_D_LEG_ORDR_CONF_PRIV_BCAST_T_
#define _FUT_BSC_SUB_D_LEG_ORDR_CONF_PRIV_BCAST_T_

typedef struct futBscSubDLegOrdrConfPrivBcastTag
{
    char             buyCod;
    futCntrIdGrpT    futCntrIdGrp;
    char             dblLegTyp       [DBL_LEG_TYP_LEN];
    futCntrId2GrpT   futCntrId2Grp;
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
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} futBscSubDLegOrdrConfPrivBcastT, *pFutBscSubDLegOrdrConfPrivBcastT;

#endif  /* _FUT_BSC_SUB_D_LEG_ORDR_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_SUB_D_LEG_ORDR_CONF_PRIV_BCAST_T_
#define _FUT_EXT_SUB_D_LEG_ORDR_CONF_PRIV_BCAST_T_

typedef struct futExtSubDLegOrdrConfPrivBcastTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             ordrNoOld       [DRIV_ORDR_NO_LEN];
    trdIdOboGrpT     trdIdOboGrp;
    char             ordrSts;
    char             ordrPersInd;
    char             userOrdrRef     [USER_ORDR_REF_LEN];
    char             etsSesId        [ETS_SES_ID_LEN];
} futExtSubDLegOrdrConfPrivBcastT, *pFutExtSubDLegOrdrConfPrivBcastT;

#endif  /* _FUT_EXT_SUB_D_LEG_ORDR_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_SUB_D_LEG_ORDR_CONF_PRIV_BCAST_T_
#define _FUT_SUB_D_LEG_ORDR_CONF_PRIV_BCAST_T_

typedef struct futSubDLegOrdrConfPrivBcastTag
{
    futBscDLegSeqNoT seqNo;
    dataHeaderT      header;
    futBscSubDLegOrdrConfPrivBcastT basic;
    futExtSubDLegOrdrConfPrivBcastT extension;
} futSubDLegOrdrConfPrivBcastT, *pFutSubDLegOrdrConfPrivBcastT;

#endif  /* _FUT_SUB_D_LEG_ORDR_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _SUBDLEGORDRCONF_HXX_ */

/******************************************************************************/
/* End of file SubDLegOrdrConf.hxx */
/******************************************************************************/
