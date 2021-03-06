/* Generated by Xgen from: E110.03.08 SIR 103290 on: 2008-04-02 14:05 */
/*******************************************************************************
* 2008 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqDLegInsMkt.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Double Leg Inside Market
*
*******************************************************************************/

#ifndef _INQDLEGINSMKT_HXX_
#define _INQDLEGINSMKT_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define FUT_BSC_INQ_D_LEG_INS_MKT_GRP_MAX        152
#define FUT_BSC_INQ_D_LEG_INS_MKT_REC_MAX        40

/******************************************************************************/

#ifndef _FUT_BSC_INQ_D_LEG_INS_MKT_GRP_T_
#define _FUT_BSC_INQ_D_LEG_INS_MKT_GRP_T_

typedef struct futBscInqDLegInsMktGrpTag
{
    futCntrIdGrpT    futCntrIdGrp;
    char             dblLegTyp       [DBL_LEG_TYP_LEN];
    futCntrId2GrpT   futCntrId2Grp;
} futBscInqDLegInsMktGrpT, *pFutBscInqDLegInsMktGrpT;

#endif  /* _FUT_BSC_INQ_D_LEG_INS_MKT_GRP_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_D_LEG_INS_MKT_REQUEST_T_
#define _FUT_BSC_INQ_D_LEG_INS_MKT_REQUEST_T_

typedef struct futBscInqDLegInsMktRequestTag
{
    futBscInqDLegInsMktGrpT futBscInqDLegInsMktGrp [FUT_BSC_INQ_D_LEG_INS_MKT_GRP_MAX];
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} futBscInqDLegInsMktRequestT, *pFutBscInqDLegInsMktRequestT;

#endif  /* _FUT_BSC_INQ_D_LEG_INS_MKT_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_D_LEG_INS_MKT_REQUEST_T_
#define _FUT_INQ_D_LEG_INS_MKT_REQUEST_T_

typedef struct futInqDLegInsMktRequestTag
{
    dataHeaderT      header;
    futBscInqDLegInsMktRequestT basic;
} futInqDLegInsMktRequestT, *pFutInqDLegInsMktRequestT;

#endif  /* _FUT_INQ_D_LEG_INS_MKT_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_D_LEG_INS_MKT_REC_T_
#define _FUT_BSC_INQ_D_LEG_INS_MKT_REC_T_

typedef struct futBscInqDLegInsMktRecTag
{
    futCntrIdGrpT    futCntrIdGrp;
    char             dblLegTyp       [DBL_LEG_TYP_LEN];
    futCntrId2GrpT   futCntrId2Grp;
    char             dblLegBstBidPrc [DRIV_PRICE_LEN];
    char             dblLegBstBidQty [DRIV_QUANTITY_LEN];
    char             dblLegBstAskPrc [DRIV_PRICE_LEN];
    char             dblLegBstAskQty [DRIV_QUANTITY_LEN];
    char             prcsStsValCod   [PRCS_STS_VAL_COD_LEN];
    char             totTrdQty       [DRIV_QUANTITY_LEN];
    char             dlyHghPrc       [DRIV_PRICE_LEN];
    char             dlyLowPrc       [DRIV_PRICE_LEN];
    char             lstTrdPrc       [DRIV_PRICE_LEN];
    char             lstTrdQty       [DRIV_QUANTITY_LEN];
    char             trdTim          [DRIV_TIME_LEN];
} futBscInqDLegInsMktRecT, *pFutBscInqDLegInsMktRecT;

#endif  /* _FUT_BSC_INQ_D_LEG_INS_MKT_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_D_LEG_INS_MKT_RESPONSE_T_
#define _FUT_BSC_INQ_D_LEG_INS_MKT_RESPONSE_T_

typedef struct futBscInqDLegInsMktResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    futBscInqDLegInsMktRecT futBscInqDLegInsMktRec [FUT_BSC_INQ_D_LEG_INS_MKT_REC_MAX];
} futBscInqDLegInsMktResponseT, *pFutBscInqDLegInsMktResponseT;

#endif  /* _FUT_BSC_INQ_D_LEG_INS_MKT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_D_LEG_INS_MKT_RESPONSE_T_
#define _FUT_INQ_D_LEG_INS_MKT_RESPONSE_T_

typedef struct futInqDLegInsMktResponseTag
{
    dataHeaderT      header;
    futBscInqDLegInsMktResponseT basic;
} futInqDLegInsMktResponseT, *pFutInqDLegInsMktResponseT;

#endif  /* _FUT_INQ_D_LEG_INS_MKT_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQDLEGINSMKT_HXX_ */

/******************************************************************************/
/* End of file InqDLegInsMkt.hxx */
/******************************************************************************/
