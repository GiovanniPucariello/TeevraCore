/* Generated by Xgen from: E60_baseline on: 2002-02-12 17:59 */
/*******************************************************************************
* 2002 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   RejTakUpOrdr.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _REJTAKUPORDR_HXX_
#define _REJTAKUPORDR_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>


/******************************************************************************/

#ifndef _FUT_BSC_REJ_TAK_UP_ORDR_REQUEST_T_
#define _FUT_BSC_REJ_TAK_UP_ORDR_REQUEST_T_

typedef struct futBscRejTakUpOrdrRequestTag
{
  char membClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN];
  char membExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN];
  futCntrIdGrpT futCntrIdGrp;
  char trnDat[DRIV_DATE_LEN];
  char ordrNo[DRIV_ORDR_NO_LEN];
} futBscRejTakUpOrdrRequestT, *pFutBscRejTakUpOrdrRequestT;


#endif  /* _FUT_BSC_REJ_TAK_UP_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_REJ_TAK_UP_ORDR_REQUEST_T_
#define _FUT_REJ_TAK_UP_ORDR_REQUEST_T_

typedef struct futRejTakUpOrdrRequestTag
{
  dataHeaderT header;
  futBscRejTakUpOrdrRequestT basic;
} futRejTakUpOrdrRequestT, *pFutRejTakUpOrdrRequestT;


#endif  /* _FUT_REJ_TAK_UP_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_REJ_TAK_UP_ORDR_RESPONSE_T_
#define _FUT_REJ_TAK_UP_ORDR_RESPONSE_T_

typedef struct futRejTakUpOrdrResponseTag
{
  dataHeaderT header;
} futRejTakUpOrdrResponseT, *pFutRejTakUpOrdrResponseT;


#endif  /* _FUT_REJ_TAK_UP_ORDR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_REJ_TAK_UP_ORDR_REQUEST_T_
#define _OPT_BSC_REJ_TAK_UP_ORDR_REQUEST_T_

typedef struct optBscRejTakUpOrdrRequestTag
{
  char membClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN];
  char membExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN];
  optCntrIdGrpT optCntrIdGrp;
  char trnDat[DRIV_DATE_LEN];
  char ordrNo[DRIV_ORDR_NO_LEN];
} optBscRejTakUpOrdrRequestT, *pOptBscRejTakUpOrdrRequestT;


#endif  /* _OPT_BSC_REJ_TAK_UP_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_REJ_TAK_UP_ORDR_REQUEST_T_
#define _OPT_REJ_TAK_UP_ORDR_REQUEST_T_

typedef struct optRejTakUpOrdrRequestTag
{
  dataHeaderT header;
  optBscRejTakUpOrdrRequestT basic;
} optRejTakUpOrdrRequestT, *pOptRejTakUpOrdrRequestT;


#endif  /* _OPT_REJ_TAK_UP_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_REJ_TAK_UP_ORDR_RESPONSE_T_
#define _OPT_REJ_TAK_UP_ORDR_RESPONSE_T_

typedef struct optRejTakUpOrdrResponseTag
{
  dataHeaderT header;
} optRejTakUpOrdrResponseT, *pOptRejTakUpOrdrResponseT;


#endif  /* _OPT_REJ_TAK_UP_ORDR_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _REJTAKUPORDR_HXX_ */

/******************************************************************************/
/* End of file RejTakUpOrdr.hxx */
/******************************************************************************/
