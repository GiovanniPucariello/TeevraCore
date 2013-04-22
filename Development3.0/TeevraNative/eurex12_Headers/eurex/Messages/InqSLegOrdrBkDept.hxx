/* Generated by Xgen from: E80.03.04 on: 2005-03-07 13:11 */
/*******************************************************************************
* 2005 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqSLegOrdrBkDept.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Single Leg Orderbook Depth
*
*******************************************************************************/

#ifndef _INQSLEGORDRBKDEPT_HXX_
#define _INQSLEGORDRBKDEPT_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_MAX   10
#define OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_MAX   10

/******************************************************************************/

#ifndef _FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_
#define _FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_

typedef struct futBscInqSLegOrdrBkDeptRequestTag
{
  futCntrIdGrpT futCntrIdGrp;
} futBscInqSLegOrdrBkDeptRequestT, *pFutBscInqSLegOrdrBkDeptRequestT;


#endif  /* _FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_
#define _FUT_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_

typedef struct futInqSLegOrdrBkDeptRequestTag
{
  dataHeaderT header;
  futBscInqSLegOrdrBkDeptRequestT basic;
} futInqSLegOrdrBkDeptRequestT, *pFutInqSLegOrdrBkDeptRequestT;


#endif  /* _FUT_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_T_
#define _FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_T_

typedef struct futBscInqSLegOrdrBkDeptRecTag
{
  bstOrdrGrpT bstOrdrGrp;
} futBscInqSLegOrdrBkDeptRecT, *pFutBscInqSLegOrdrBkDeptRecT;


#endif  /* _FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_
#define _FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_

typedef struct futBscInqSLegOrdrBkDeptResponseTag
{
  futBscInqSLegOrdrBkDeptRecT futBscInqSLegOrdrBkDeptRec[FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_MAX];
} futBscInqSLegOrdrBkDeptResponseT, *pFutBscInqSLegOrdrBkDeptResponseT;


#endif  /* _FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_
#define _FUT_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_

typedef struct futInqSLegOrdrBkDeptResponseTag
{
  dataHeaderT header;
  futBscInqSLegOrdrBkDeptResponseT basic;
} futInqSLegOrdrBkDeptResponseT, *pFutInqSLegOrdrBkDeptResponseT;


#endif  /* _FUT_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_
#define _OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_

typedef struct optBscInqSLegOrdrBkDeptRequestTag
{
  optCntrIdGrpT optCntrIdGrp;
} optBscInqSLegOrdrBkDeptRequestT, *pOptBscInqSLegOrdrBkDeptRequestT;


#endif  /* _OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_
#define _OPT_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_

typedef struct optInqSLegOrdrBkDeptRequestTag
{
  dataHeaderT header;
  optBscInqSLegOrdrBkDeptRequestT basic;
} optInqSLegOrdrBkDeptRequestT, *pOptInqSLegOrdrBkDeptRequestT;


#endif  /* _OPT_INQ_S_LEG_ORDR_BK_DEPT_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_T_
#define _OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_T_

typedef struct optBscInqSLegOrdrBkDeptRecTag
{
  char bstBidPrc[DRIV_PRICE_LEN];
  char bstBidQty[DRIV_QUANTITY_LEN];
  char bstAskPrc[DRIV_PRICE_LEN];
  char bstAskQty[DRIV_QUANTITY_LEN];
} optBscInqSLegOrdrBkDeptRecT, *pOptBscInqSLegOrdrBkDeptRecT;


#endif  /* _OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_
#define _OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_

typedef struct optBscInqSLegOrdrBkDeptResponseTag
{
  char mliRecCtr[DRIV_MLI_REC_CTR_LEN];
  optBscInqSLegOrdrBkDeptRecT optBscInqSLegOrdrBkDeptRec[OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_MAX];
} optBscInqSLegOrdrBkDeptResponseT, *pOptBscInqSLegOrdrBkDeptResponseT;


#endif  /* _OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_
#define _OPT_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_

typedef struct optInqSLegOrdrBkDeptResponseTag
{
  dataHeaderT header;
  optBscInqSLegOrdrBkDeptResponseT basic;
} optInqSLegOrdrBkDeptResponseT, *pOptInqSLegOrdrBkDeptResponseT;


#endif  /* _OPT_INQ_S_LEG_ORDR_BK_DEPT_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQSLEGORDRBKDEPT_HXX_ */

/******************************************************************************/
/* End of file InqSLegOrdrBkDept.hxx */
/******************************************************************************/