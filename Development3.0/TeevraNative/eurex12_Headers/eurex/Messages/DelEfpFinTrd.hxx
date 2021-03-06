/* Generated by Xgen from: E70.03.03 on: 2004-02-09 10:53 */
/*******************************************************************************
* 2004 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DelEfpFinTrd.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _DELEFPFINTRD_HXX_
#define _DELEFPFINTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>


/******************************************************************************/

#ifndef _FUT_BSC_DEL_EFP_FIN_TRD_REQUEST_T_
#define _FUT_BSC_DEL_EFP_FIN_TRD_REQUEST_T_

typedef struct futBscDelEfpFinTrdRequestTag
{
  char trnIdNo[TRN_ID_NO_LEN];
  char prodId[PROD_ID_LEN];
  trdrIdGrpT trdrIdGrp;
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} futBscDelEfpFinTrdRequestT, *pFutBscDelEfpFinTrdRequestT;


#endif  /* _FUT_BSC_DEL_EFP_FIN_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_DEL_EFP_FIN_TRD_REQUEST_T_
#define _FUT_DEL_EFP_FIN_TRD_REQUEST_T_

typedef struct futDelEfpFinTrdRequestTag
{
  dataHeaderT header;
  futBscDelEfpFinTrdRequestT basic;
} futDelEfpFinTrdRequestT, *pFutDelEfpFinTrdRequestT;


#endif  /* _FUT_DEL_EFP_FIN_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_DEL_EFP_FIN_TRD_RESPONSE_T_
#define _FUT_DEL_EFP_FIN_TRD_RESPONSE_T_

typedef struct futDelEfpFinTrdResponseTag
{
  dataHeaderT header;
} futDelEfpFinTrdResponseT, *pFutDelEfpFinTrdResponseT;


#endif  /* _FUT_DEL_EFP_FIN_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _DELEFPFINTRD_HXX_ */

/******************************************************************************/
/* End of file DelEfpFinTrd.hxx */
/******************************************************************************/
