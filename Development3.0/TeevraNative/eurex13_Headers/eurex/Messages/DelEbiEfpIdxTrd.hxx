/* Generated by Xgen from: E120.27.02 SIR 134649 on: 2009-06-30 17:11 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DelEbiEfpIdxTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Delete EBI EFP-Index Future Trade
*
*******************************************************************************/

#ifndef _DELEBIEFPIDXTRD_HXX_
#define _DELEBIEFPIDXTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_DEL_EBI_EFP_IDX_TRD_REQUEST_T_
#define _FUT_BSC_DEL_EBI_EFP_IDX_TRD_REQUEST_T_

typedef struct futBscDelEbiEfpIdxTrdRequestTag
{
    char             ebiTrdRefNo     [EBI_TRD_REF_NO_LEN];
    char             prodId          [PROD_ID_LEN];
} futBscDelEbiEfpIdxTrdRequestT, *pFutBscDelEbiEfpIdxTrdRequestT;

#endif  /* _FUT_BSC_DEL_EBI_EFP_IDX_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_DEL_EBI_EFP_IDX_TRD_REQUEST_T_
#define _FUT_DEL_EBI_EFP_IDX_TRD_REQUEST_T_

typedef struct futDelEbiEfpIdxTrdRequestTag
{
    dataHeaderT      header;
    futBscDelEbiEfpIdxTrdRequestT basic;
} futDelEbiEfpIdxTrdRequestT, *pFutDelEbiEfpIdxTrdRequestT;

#endif  /* _FUT_DEL_EBI_EFP_IDX_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_DEL_EBI_EFP_IDX_TRD_RESPONSE_T_
#define _FUT_DEL_EBI_EFP_IDX_TRD_RESPONSE_T_

typedef struct futDelEbiEfpIdxTrdResponseTag
{
    dataHeaderT      header;
} futDelEbiEfpIdxTrdResponseT, *pFutDelEbiEfpIdxTrdResponseT;

#endif  /* _FUT_DEL_EBI_EFP_IDX_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _DELEBIEFPIDXTRD_HXX_ */

/******************************************************************************/
/* End of file DelEbiEfpIdxTrd.hxx */
/******************************************************************************/
