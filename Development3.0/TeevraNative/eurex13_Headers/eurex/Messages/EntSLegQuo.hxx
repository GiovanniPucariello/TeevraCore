/* Generated by Xgen from: E100.04.19 SIR 79062 on: 2007-05-15 09:20 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntSLegQuo.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Single Leg Quote
*
*******************************************************************************/

#ifndef _ENTSLEGQUO_HXX_
#define _ENTSLEGQUO_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_ENT_S_LEG_QUO_REQUEST_T_
#define _FUT_BSC_ENT_S_LEG_QUO_REQUEST_T_

typedef struct futBscEntSLegQuoRequestTag
{
    futCntrIdGrpT    futCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             quoExePrcBuy    [DRIV_PRICE_LEN];
    char             quoExePrcSel    [DRIV_PRICE_LEN];
    char             quoQtyBuy       [DRIV_VOLUME_LEN];
    char             quoQtySel       [DRIV_VOLUME_LEN];
} futBscEntSLegQuoRequestT, *pFutBscEntSLegQuoRequestT;

#endif  /* _FUT_BSC_ENT_S_LEG_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_ENT_S_LEG_QUO_REQUEST_T_
#define _FUT_EXT_ENT_S_LEG_QUO_REQUEST_T_

typedef struct futExtEntSLegQuoRequestTag
{
    acctTypCodGrpT   acctTypCodGrp;
    char             prcRsblChkInd;
} futExtEntSLegQuoRequestT, *pFutExtEntSLegQuoRequestT;

#endif  /* _FUT_EXT_ENT_S_LEG_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_S_LEG_QUO_REQUEST_T_
#define _FUT_ENT_S_LEG_QUO_REQUEST_T_

typedef struct futEntSLegQuoRequestTag
{
    dataHeaderT      header;
    futBscEntSLegQuoRequestT basic;
    futExtEntSLegQuoRequestT extension;
} futEntSLegQuoRequestT, *pFutEntSLegQuoRequestT;

#endif  /* _FUT_ENT_S_LEG_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_ENT_S_LEG_QUO_RESPONSE_T_
#define _FUT_BSC_ENT_S_LEG_QUO_RESPONSE_T_

typedef struct futBscEntSLegQuoResponseTag
{
    char             ordrNoBuy       [DRIV_ORDR_NO_LEN];
    char             ordrNoSel       [DRIV_ORDR_NO_LEN];
    char             quoBkQtyBuy     [DRIV_VOLUME_LEN];
    char             quoBkQtySel     [DRIV_VOLUME_LEN];
    char             quoExeQtyBuy    [DRIV_VOLUME_LEN];
    char             quoExeQtySel    [DRIV_VOLUME_LEN];
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
} futBscEntSLegQuoResponseT, *pFutBscEntSLegQuoResponseT;

#endif  /* _FUT_BSC_ENT_S_LEG_QUO_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_S_LEG_QUO_RESPONSE_T_
#define _FUT_ENT_S_LEG_QUO_RESPONSE_T_

typedef struct futEntSLegQuoResponseTag
{
    dataHeaderT      header;
    futBscEntSLegQuoResponseT basic;
} futEntSLegQuoResponseT, *pFutEntSLegQuoResponseT;

#endif  /* _FUT_ENT_S_LEG_QUO_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_ENT_S_LEG_QUO_REQUEST_T_
#define _OPT_BSC_ENT_S_LEG_QUO_REQUEST_T_

typedef struct optBscEntSLegQuoRequestTag
{
    optCntrIdGrpT    optCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             quoExePrcBuy    [DRIV_PRICE_LEN];
    char             quoExePrcSel    [DRIV_PRICE_LEN];
    char             quoQtyBuy       [DRIV_VOLUME_LEN];
    char             quoQtySel       [DRIV_VOLUME_LEN];
} optBscEntSLegQuoRequestT, *pOptBscEntSLegQuoRequestT;

#endif  /* _OPT_BSC_ENT_S_LEG_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_ENT_S_LEG_QUO_REQUEST_T_
#define _OPT_EXT_ENT_S_LEG_QUO_REQUEST_T_

typedef struct optExtEntSLegQuoRequestTag
{
    acctTypCodGrpT   acctTypCodGrp;
    char             prcRsblChkInd;
} optExtEntSLegQuoRequestT, *pOptExtEntSLegQuoRequestT;

#endif  /* _OPT_EXT_ENT_S_LEG_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_ENT_S_LEG_QUO_REQUEST_T_
#define _OPT_ENT_S_LEG_QUO_REQUEST_T_

typedef struct optEntSLegQuoRequestTag
{
    dataHeaderT      header;
    optBscEntSLegQuoRequestT basic;
    optExtEntSLegQuoRequestT extension;
} optEntSLegQuoRequestT, *pOptEntSLegQuoRequestT;

#endif  /* _OPT_ENT_S_LEG_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_ENT_S_LEG_QUO_RESPONSE_T_
#define _OPT_BSC_ENT_S_LEG_QUO_RESPONSE_T_

typedef struct optBscEntSLegQuoResponseTag
{
    char             ordrNoBuy       [DRIV_ORDR_NO_LEN];
    char             ordrNoSel       [DRIV_ORDR_NO_LEN];
    char             quoBkQtyBuy     [DRIV_VOLUME_LEN];
    char             quoBkQtySel     [DRIV_VOLUME_LEN];
    char             quoExeQtyBuy    [DRIV_VOLUME_LEN];
    char             quoExeQtySel    [DRIV_VOLUME_LEN];
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
} optBscEntSLegQuoResponseT, *pOptBscEntSLegQuoResponseT;

#endif  /* _OPT_BSC_ENT_S_LEG_QUO_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_ENT_S_LEG_QUO_RESPONSE_T_
#define _OPT_ENT_S_LEG_QUO_RESPONSE_T_

typedef struct optEntSLegQuoResponseTag
{
    dataHeaderT      header;
    optBscEntSLegQuoResponseT basic;
} optEntSLegQuoResponseT, *pOptEntSLegQuoResponseT;

#endif  /* _OPT_ENT_S_LEG_QUO_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTSLEGQUO_HXX_ */

/******************************************************************************/
/* End of file EntSLegQuo.hxx */
/******************************************************************************/
