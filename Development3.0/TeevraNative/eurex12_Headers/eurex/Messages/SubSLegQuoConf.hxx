/* Generated by Xgen from: E100.04.19 SIR 79062 on: 2007-05-15 09:20 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   SubSLegQuoConf.hxx
*
*  DESCRIPTION: Layouts used for
*               Subscribe Single Leg Quote Confirmation
*
*******************************************************************************/

#ifndef _SUBSLEGQUOCONF_HXX_
#define _SUBSLEGQUOCONF_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_
#define _FUT_BSC_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_

typedef struct futBscSubSLegQuoConfPrivBcastTag
{
    char             buyCod;
    futCntrIdGrpT    futCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             ordrNoBuy       [DRIV_ORDR_NO_LEN];
    char             ordrNoSel       [DRIV_ORDR_NO_LEN];
    char             quoBkQtyBuy     [DRIV_VOLUME_LEN];
    char             quoBkQtySel     [DRIV_VOLUME_LEN];
    char             quoExeQtyBuy    [DRIV_VOLUME_LEN];
    char             quoExeQtySel    [DRIV_VOLUME_LEN];
    char             quoExePrcBuy    [DRIV_PRICE_LEN];
    char             quoExePrcSel    [DRIV_PRICE_LEN];
    char             quoPrioTimBuy   [DRIV_TIME_LEN];
    char             quoPrioTimSel   [DRIV_TIME_LEN];
    char             quoPrioDatBuy   [DRIV_DATE_LEN];
    char             quoPrioDatSel   [DRIV_DATE_LEN];
    char             lstEvntDatBuy   [DRIV_DATE_LEN];
    char             lstEvntTimBuy   [DRIV_TIME_LEN];
    char             lstEvntTrnIdBuy [LST_EVNT_TRN_ID_LEN];
    char             lstEvntDatSel   [DRIV_DATE_LEN];
    char             lstEvntTimSel   [DRIV_TIME_LEN];
    char             lstEvntTrnIdSel [LST_EVNT_TRN_ID_LEN];
    char             trnTypId;
} futBscSubSLegQuoConfPrivBcastT, *pFutBscSubSLegQuoConfPrivBcastT;

#endif  /* _FUT_BSC_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_
#define _FUT_EXT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_

typedef struct futExtSubSLegQuoConfPrivBcastTag
{
    acctTypCodGrpT   acctTypCodGrp;
} futExtSubSLegQuoConfPrivBcastT, *pFutExtSubSLegQuoConfPrivBcastT;

#endif  /* _FUT_EXT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_
#define _FUT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_

typedef struct futSubSLegQuoConfPrivBcastTag
{
    dataHeaderT      header;
    futBscSubSLegQuoConfPrivBcastT basic;
    futExtSubSLegQuoConfPrivBcastT extension;
} futSubSLegQuoConfPrivBcastT, *pFutSubSLegQuoConfPrivBcastT;

#endif  /* _FUT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_SUB_S_LEG_QUO_CONF_SUBJECT_T_
#define _FUT_BSC_SUB_S_LEG_QUO_CONF_SUBJECT_T_

typedef struct futBscSubSLegQuoConfSubjectTag
{
    char             membId          [MEMB_ID_LEN];
    char             prodId          [PROD_ID_LEN];
    char             cntrExpYrDat    [CNTR_EXP_YR_DAT_LEN];
    char             cntrExpMthDat   [CNTR_EXP_MTH_DAT_LEN];
    char             subjFill        [SUBJ_FILL_LEN];
} futBscSubSLegQuoConfSubjectT, *pFutBscSubSLegQuoConfSubjectT;

#endif  /* _FUT_BSC_SUB_S_LEG_QUO_CONF_SUBJECT_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_
#define _OPT_BSC_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_

typedef struct optBscSubSLegQuoConfPrivBcastTag
{
    char             buyCod;
    optCntrIdGrpT    optCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             ordrNoBuy       [DRIV_ORDR_NO_LEN];
    char             ordrNoSel       [DRIV_ORDR_NO_LEN];
    char             quoBkQtyBuy     [DRIV_VOLUME_LEN];
    char             quoBkQtySel     [DRIV_VOLUME_LEN];
    char             quoExeQtyBuy    [DRIV_VOLUME_LEN];
    char             quoExeQtySel    [DRIV_VOLUME_LEN];
    char             quoExePrcBuy    [DRIV_PRICE_LEN];
    char             quoExePrcSel    [DRIV_PRICE_LEN];
    char             quoPrioTimBuy   [DRIV_TIME_LEN];
    char             quoPrioTimSel   [DRIV_TIME_LEN];
    char             quoPrioDatBuy   [DRIV_DATE_LEN];
    char             quoPrioDatSel   [DRIV_DATE_LEN];
    char             lstEvntDatBuy   [DRIV_DATE_LEN];
    char             lstEvntTimBuy   [DRIV_TIME_LEN];
    char             lstEvntTrnIdBuy [LST_EVNT_TRN_ID_LEN];
    char             lstEvntDatSel   [DRIV_DATE_LEN];
    char             lstEvntTimSel   [DRIV_TIME_LEN];
    char             lstEvntTrnIdSel [LST_EVNT_TRN_ID_LEN];
    char             trnTypId;
} optBscSubSLegQuoConfPrivBcastT, *pOptBscSubSLegQuoConfPrivBcastT;

#endif  /* _OPT_BSC_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_
#define _OPT_EXT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_

typedef struct optExtSubSLegQuoConfPrivBcastTag
{
    acctTypCodGrpT   acctTypCodGrp;
} optExtSubSLegQuoConfPrivBcastT, *pOptExtSubSLegQuoConfPrivBcastT;

#endif  /* _OPT_EXT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_
#define _OPT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_

typedef struct optSubSLegQuoConfPrivBcastTag
{
    dataHeaderT      header;
    optBscSubSLegQuoConfPrivBcastT basic;
    optExtSubSLegQuoConfPrivBcastT extension;
} optSubSLegQuoConfPrivBcastT, *pOptSubSLegQuoConfPrivBcastT;

#endif  /* _OPT_SUB_S_LEG_QUO_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_SUB_S_LEG_QUO_CONF_SUBJECT_T_
#define _OPT_BSC_SUB_S_LEG_QUO_CONF_SUBJECT_T_

typedef struct optBscSubSLegQuoConfSubjectTag
{
    char             membId          [MEMB_ID_LEN];
    char             prodId          [PROD_ID_LEN];
    char             cntrExpYrDat    [CNTR_EXP_YR_DAT_LEN];
    char             cntrExpMthDat   [CNTR_EXP_MTH_DAT_LEN];
    char             cntrClasCod;
    char             cntrExerPrc     [CNTR_EXER_PRC_LEN];
    char             cntrVersNo;
} optBscSubSLegQuoConfSubjectT, *pOptBscSubSLegQuoConfSubjectT;

#endif  /* _OPT_BSC_SUB_S_LEG_QUO_CONF_SUBJECT_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _SUBSLEGQUOCONF_HXX_ */

/******************************************************************************/
/* End of file SubSLegQuoConf.hxx */
/******************************************************************************/
