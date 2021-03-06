/* Generated by Xgen from: E60_baseline on: 2002-02-12 17:59 */
/*******************************************************************************
* 2002 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqZerCostQty.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _INQZERCOSTQTY_HXX_
#define _INQZERCOSTQTY_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>


/******************************************************************************/

#ifndef _FUT_BSC_INQ_ZER_COST_QTY_REQUEST_T_
#define _FUT_BSC_INQ_ZER_COST_QTY_REQUEST_T_

typedef struct futBscInqZerCostQtyRequestTag
{
  char membClgIdCod[MEMB_CLG_ID_COD_LEN];
  char membExchIdCod[MEMB_EXCH_ID_COD_LEN];
  acctTypCodGrpT acctTypCodGrp;
  futCntrIdGrpT futCntrIdGrp;
} futBscInqZerCostQtyRequestT, *pFutBscInqZerCostQtyRequestT;


#endif  /* _FUT_BSC_INQ_ZER_COST_QTY_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_ZER_COST_QTY_REQUEST_T_
#define _FUT_INQ_ZER_COST_QTY_REQUEST_T_

typedef struct futInqZerCostQtyRequestTag
{
  dataHeaderT header;
  futBscInqZerCostQtyRequestT basic;
} futInqZerCostQtyRequestT, *pFutInqZerCostQtyRequestT;


#endif  /* _FUT_INQ_ZER_COST_QTY_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_ZER_COST_QTY_RESPONSE_T_
#define _FUT_EXT_INQ_ZER_COST_QTY_RESPONSE_T_

typedef struct futExtInqZerCostQtyResponseTag
{
  char crtZerCostQty[DRIV_QUANTITY_LEN];
  char prvZerCostQty[DRIV_QUANTITY_LEN];
} futExtInqZerCostQtyResponseT, *pFutExtInqZerCostQtyResponseT;


#endif  /* _FUT_EXT_INQ_ZER_COST_QTY_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_ZER_COST_QTY_RESPONSE_T_
#define _FUT_INQ_ZER_COST_QTY_RESPONSE_T_

typedef struct futInqZerCostQtyResponseTag
{
  dataHeaderT header;
  futExtInqZerCostQtyResponseT extension;
} futInqZerCostQtyResponseT, *pFutInqZerCostQtyResponseT;


#endif  /* _FUT_INQ_ZER_COST_QTY_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_ZER_COST_QTY_REQUEST_T_
#define _OPT_BSC_INQ_ZER_COST_QTY_REQUEST_T_

typedef struct optBscInqZerCostQtyRequestTag
{
  char membClgIdCod[MEMB_CLG_ID_COD_LEN];
  char membExchIdCod[MEMB_EXCH_ID_COD_LEN];
  acctTypCodGrpT acctTypCodGrp;
  optCntrIdGrpT optCntrIdGrp;
} optBscInqZerCostQtyRequestT, *pOptBscInqZerCostQtyRequestT;


#endif  /* _OPT_BSC_INQ_ZER_COST_QTY_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_ZER_COST_QTY_REQUEST_T_
#define _OPT_INQ_ZER_COST_QTY_REQUEST_T_

typedef struct optInqZerCostQtyRequestTag
{
  dataHeaderT header;
  optBscInqZerCostQtyRequestT basic;
} optInqZerCostQtyRequestT, *pOptInqZerCostQtyRequestT;


#endif  /* _OPT_INQ_ZER_COST_QTY_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_ZER_COST_QTY_RESPONSE_T_
#define _OPT_EXT_INQ_ZER_COST_QTY_RESPONSE_T_

typedef struct optExtInqZerCostQtyResponseTag
{
  char crtZerCostQty[DRIV_QUANTITY_LEN];
  char prvZerCostQty[DRIV_QUANTITY_LEN];
} optExtInqZerCostQtyResponseT, *pOptExtInqZerCostQtyResponseT;


#endif  /* _OPT_EXT_INQ_ZER_COST_QTY_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_ZER_COST_QTY_RESPONSE_T_
#define _OPT_INQ_ZER_COST_QTY_RESPONSE_T_

typedef struct optInqZerCostQtyResponseTag
{
  dataHeaderT header;
  optExtInqZerCostQtyResponseT extension;
} optInqZerCostQtyResponseT, *pOptInqZerCostQtyResponseT;


#endif  /* _OPT_INQ_ZER_COST_QTY_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQZERCOSTQTY_HXX_ */

/******************************************************************************/
/* End of file InqZerCostQty.hxx */
/******************************************************************************/
