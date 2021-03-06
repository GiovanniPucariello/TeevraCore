/* Generated by Xgen from: E61.02.00 on: 2003-03-12 16:09 */
/*******************************************************************************
* 2003 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqEfpTrd.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _INQEFPTRD_HXX_
#define _INQEFPTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define FUT_BSC_INQ_EFP_TRD_REC_MAX	2
#define FUT_EXT_INQ_EFP_TRD_REC_MAX	2

/******************************************************************************/

#ifndef _FUT_BSC_INQ_EFP_TRD_REQUEST_T_
#define _FUT_BSC_INQ_EFP_TRD_REQUEST_T_

typedef struct futBscInqEfpTrdRequestTag
{
  char trnIdNo[TRN_ID_NO_LEN];
  trdrIdGrpT trdrIdGrp;
} futBscInqEfpTrdRequestT, *pFutBscInqEfpTrdRequestT;


#endif  /* _FUT_BSC_INQ_EFP_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_EFP_TRD_REQUEST_T_
#define _FUT_INQ_EFP_TRD_REQUEST_T_

typedef struct futInqEfpTrdRequestTag
{
  dataHeaderT header;
  futBscInqEfpTrdRequestT basic;
} futInqEfpTrdRequestT, *pFutInqEfpTrdRequestT;


#endif  /* _FUT_INQ_EFP_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_EFP_TRD_REC_T_
#define _FUT_BSC_INQ_EFP_TRD_REC_T_

typedef struct futBscInqEfpTrdRecTag
{
  char opnClsCod;
  char membCtpyIdCod[MEMB_CTPY_ID_COD_LEN];
  trdrIdGrpT trdrIdGrp;
} futBscInqEfpTrdRecT, *pFutBscInqEfpTrdRecT;


#endif  /* _FUT_BSC_INQ_EFP_TRD_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_EFP_TRD_RESPONSE_T_
#define _FUT_BSC_INQ_EFP_TRD_RESPONSE_T_

typedef struct futBscInqEfpTrdResponseTag
{
  char buyCod;
  futCntrIdGrpT futCntrIdGrp;
  char trdNo[TRD_NO_LEN];
  char trdQty[DRIV_VOLUME_LEN];
  char trdMtchPrc[DRIV_PRICE_LEN];
  char currTypCod[CURR_TYP_COD_LEN];
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
  futBscInqEfpTrdRecT futBscInqEfpTrdRec[FUT_BSC_INQ_EFP_TRD_REC_MAX];
} futBscInqEfpTrdResponseT, *pFutBscInqEfpTrdResponseT;


#endif  /* _FUT_BSC_INQ_EFP_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_EFP_TRD_REC_T_
#define _FUT_EXT_INQ_EFP_TRD_REC_T_

typedef struct futExtInqEfpTrdRecTag
{
  acctTypCodGrpT acctTypCodGrp;
  txtGrpT txtGrp;
  char membExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN];
} futExtInqEfpTrdRecT, *pFutExtInqEfpTrdRecT;


#endif  /* _FUT_EXT_INQ_EFP_TRD_REC_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_EFP_TRD_RESPONSE_T_
#define _FUT_EXT_INQ_EFP_TRD_RESPONSE_T_

typedef struct futExtInqEfpTrdResponseTag
{
  futExtInqEfpTrdRecT futExtInqEfpTrdRec[FUT_EXT_INQ_EFP_TRD_REC_MAX];
} futExtInqEfpTrdResponseT, *pFutExtInqEfpTrdResponseT;


#endif  /* _FUT_EXT_INQ_EFP_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_EFP_TRD_RESPONSE_T_
#define _FUT_INQ_EFP_TRD_RESPONSE_T_

typedef struct futInqEfpTrdResponseTag
{
  dataHeaderT header;
  futBscInqEfpTrdResponseT basic;
  futExtInqEfpTrdResponseT extension;
} futInqEfpTrdResponseT, *pFutInqEfpTrdResponseT;


#endif  /* _FUT_INQ_EFP_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQEFPTRD_HXX_ */

/******************************************************************************/
/* End of file InqEfpTrd.hxx */
/******************************************************************************/
