/* Generated by Xgen from: E100.04.19 SIR 79062 on: 2007-05-15 09:20 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntMasQuo.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Mass Quote
*
*******************************************************************************/

#ifndef _ENTMASQUO_HXX_
#define _ENTMASQUO_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define OPT_BSC_ENT_MAS_QUO_GRP_MAX              120
#define OPT_BSC_ENT_MAS_QUO_REC_MAX              120

/******************************************************************************/

#ifndef _OPT_BSC_ENT_MAS_QUO_GRP_T_
#define _OPT_BSC_ENT_MAS_QUO_GRP_T_

typedef struct optBscEntMasQuoGrpTag
{
    optCntrIdGrpT    optCntrIdGrp;
    char             quoExePrcBuy    [DRIV_PRICE_LEN];
    char             quoExePrcSel    [DRIV_PRICE_LEN];
    char             quoQtyBuy       [DRIV_VOLUME_LEN];
    char             quoQtySel       [DRIV_VOLUME_LEN];
} optBscEntMasQuoGrpT, *pOptBscEntMasQuoGrpT;

#endif  /* _OPT_BSC_ENT_MAS_QUO_GRP_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_ENT_MAS_QUO_REQUEST_T_
#define _OPT_BSC_ENT_MAS_QUO_REQUEST_T_

typedef struct optBscEntMasQuoRequestTag
{
    trdrIdGrpT       trdrIdGrp;
    acctTypCodGrpT   acctTypCodGrp;
    char             prcRsblChkInd;
    char             suppQuoConfInd;
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    optBscEntMasQuoGrpT optBscEntMasQuoGrp [OPT_BSC_ENT_MAS_QUO_GRP_MAX];
} optBscEntMasQuoRequestT, *pOptBscEntMasQuoRequestT;

#endif  /* _OPT_BSC_ENT_MAS_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_ENT_MAS_QUO_REQUEST_T_
#define _OPT_ENT_MAS_QUO_REQUEST_T_

typedef struct optEntMasQuoRequestTag
{
    dataHeaderT      header;
    optBscEntMasQuoRequestT basic;
} optEntMasQuoRequestT, *pOptEntMasQuoRequestT;

#endif  /* _OPT_ENT_MAS_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_ENT_MAS_QUO_REC_T_
#define _OPT_BSC_ENT_MAS_QUO_REC_T_

typedef struct optBscEntMasQuoRecTag
{
    char             rtnCod          [RTN_COD_LEN];
    optCntrIdGrpT    optCntrIdGrp;
    char             ordrNoBuy       [DRIV_ORDR_NO_LEN];
    char             ordrNoSel       [DRIV_ORDR_NO_LEN];
    char             quoExeQtyBuy    [DRIV_VOLUME_LEN];
    char             quoExeQtySel    [DRIV_VOLUME_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
} optBscEntMasQuoRecT, *pOptBscEntMasQuoRecT;

#endif  /* _OPT_BSC_ENT_MAS_QUO_REC_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_ENT_MAS_QUO_RESPONSE_T_
#define _OPT_BSC_ENT_MAS_QUO_RESPONSE_T_

typedef struct optBscEntMasQuoResponseTag
{
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    optBscEntMasQuoRecT optBscEntMasQuoRec [OPT_BSC_ENT_MAS_QUO_REC_MAX];
} optBscEntMasQuoResponseT, *pOptBscEntMasQuoResponseT;

#endif  /* _OPT_BSC_ENT_MAS_QUO_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_ENT_MAS_QUO_RESPONSE_T_
#define _OPT_ENT_MAS_QUO_RESPONSE_T_

typedef struct optEntMasQuoResponseTag
{
    dataHeaderT      header;
    optBscEntMasQuoResponseT basic;
} optEntMasQuoResponseT, *pOptEntMasQuoResponseT;

#endif  /* _OPT_ENT_MAS_QUO_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTMASQUO_HXX_ */

/******************************************************************************/
/* End of file EntMasQuo.hxx */
/******************************************************************************/
