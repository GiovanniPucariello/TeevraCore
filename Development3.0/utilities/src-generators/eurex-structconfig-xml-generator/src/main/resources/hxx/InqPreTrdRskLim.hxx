/* Generated by Xgen from: E120.16.01 SIR 123595 on: 2009-04-29 10:47 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqPreTrdRskLim.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Pre-Trading Risk Limits
*
*******************************************************************************/

#ifndef _INQPRETRDRSKLIM_HXX_
#define _INQPRETRDRSKLIM_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_INQ_PRE_TRD_RSK_LIM_REC_MAX          15
#define INQ_RSK_LIM_TIM_INTVL_GRP_MAX            2
#define INQ_RSK_LIM_WRK_ORDR_GRP_MAX             2

/******************************************************************************/

#ifndef _BSC_INQ_PRE_TRD_RSK_LIM_REQUEST_T_
#define _BSC_INQ_PRE_TRD_RSK_LIM_REQUEST_T_

typedef struct bscInqPreTrdRskLimRequestTag
{
    char             prodId          [PROD_ID_LEN];
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    trdrIdGrpT       trdrIdGrp;
    acctTypCodGrpT   acctTypCodGrp;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} bscInqPreTrdRskLimRequestT, *pBscInqPreTrdRskLimRequestT;

#endif  /* _BSC_INQ_PRE_TRD_RSK_LIM_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_PRE_TRD_RSK_LIM_REQUEST_T_
#define _INQ_PRE_TRD_RSK_LIM_REQUEST_T_

typedef struct inqPreTrdRskLimRequestTag
{
    dataHeaderT      header;
    bscInqPreTrdRskLimRequestT basic;
} inqPreTrdRskLimRequestT, *pInqPreTrdRskLimRequestT;

#endif  /* _INQ_PRE_TRD_RSK_LIM_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_PRE_TRD_RSK_LIM_REC_T_
#define _BSC_INQ_PRE_TRD_RSK_LIM_REC_T_

typedef struct bscInqPreTrdRskLimRecTag
{
    char             prodId          [PROD_ID_LEN];
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    trdrIdGrpT       trdrIdGrp;
    acctTypCodGrpT   acctTypCodGrp;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             prcsStsValCod   [PRCS_STS_VAL_COD_LEN];
    char             preTrdRiskRndLot [DRIV_VOLUME_LEN];
    char             violCntrLim     [DRIV_QUANTITY_LEN];
    rskLimTimIntvlGrpT rskLimTimIntvlGrp [INQ_RSK_LIM_TIM_INTVL_GRP_MAX];
    rskLimWrkOrdrGrpT rskLimWrkOrdrGrp [INQ_RSK_LIM_WRK_ORDR_GRP_MAX];
    rskLimStsGrpT    rskLimStsGrp;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscInqPreTrdRskLimRecT, *pBscInqPreTrdRskLimRecT;

#endif  /* _BSC_INQ_PRE_TRD_RSK_LIM_REC_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_PRE_TRD_RSK_LIM_RESPONSE_T_
#define _BSC_INQ_PRE_TRD_RSK_LIM_RESPONSE_T_

typedef struct bscInqPreTrdRskLimResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscInqPreTrdRskLimRecT bscInqPreTrdRskLimRec [BSC_INQ_PRE_TRD_RSK_LIM_REC_MAX];
} bscInqPreTrdRskLimResponseT, *pBscInqPreTrdRskLimResponseT;

#endif  /* _BSC_INQ_PRE_TRD_RSK_LIM_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_PRE_TRD_RSK_LIM_RESPONSE_T_
#define _INQ_PRE_TRD_RSK_LIM_RESPONSE_T_

typedef struct inqPreTrdRskLimResponseTag
{
    dataHeaderT      header;
    bscInqPreTrdRskLimResponseT basic;
} inqPreTrdRskLimResponseT, *pInqPreTrdRskLimResponseT;

#endif  /* _INQ_PRE_TRD_RSK_LIM_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQPRETRDRSKLIM_HXX_ */

/******************************************************************************/
/* End of file InqPreTrdRskLim.hxx */
/******************************************************************************/
