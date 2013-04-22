/* Generated by Xgen from: E120.27.02 SIR 134649 on: 2009-06-30 17:11 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DelEbiEfpFinTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Delete EBI EFP-Fin Trade
*
*******************************************************************************/

#ifndef _DELEBIEFPFINTRD_HXX_
#define _DELEBIEFPFINTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_DEL_EBI_EFP_FIN_TRD_REQUEST_T_
#define _FUT_BSC_DEL_EBI_EFP_FIN_TRD_REQUEST_T_

typedef struct futBscDelEbiEfpFinTrdRequestTag
{
    char             ebiTrdRefNo     [EBI_TRD_REF_NO_LEN];
    char             prodId          [PROD_ID_LEN];
} futBscDelEbiEfpFinTrdRequestT, *pFutBscDelEbiEfpFinTrdRequestT;

#endif  /* _FUT_BSC_DEL_EBI_EFP_FIN_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_DEL_EBI_EFP_FIN_TRD_REQUEST_T_
#define _FUT_DEL_EBI_EFP_FIN_TRD_REQUEST_T_

typedef struct futDelEbiEfpFinTrdRequestTag
{
    dataHeaderT      header;
    futBscDelEbiEfpFinTrdRequestT basic;
} futDelEbiEfpFinTrdRequestT, *pFutDelEbiEfpFinTrdRequestT;

#endif  /* _FUT_DEL_EBI_EFP_FIN_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_DEL_EBI_EFP_FIN_TRD_RESPONSE_T_
#define _FUT_DEL_EBI_EFP_FIN_TRD_RESPONSE_T_

typedef struct futDelEbiEfpFinTrdResponseTag
{
    dataHeaderT      header;
} futDelEbiEfpFinTrdResponseT, *pFutDelEbiEfpFinTrdResponseT;

#endif  /* _FUT_DEL_EBI_EFP_FIN_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _DELEBIEFPFINTRD_HXX_ */

/******************************************************************************/
/* End of file DelEbiEfpFinTrd.hxx */
/******************************************************************************/