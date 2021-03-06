/* Generated by Xgen from: E120.27.02 SIR 134649 on: 2009-06-30 17:11 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DelEbiBlckTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Delete EBI Block Trade
*
*******************************************************************************/

#ifndef _DELEBIBLCKTRD_HXX_
#define _DELEBIBLCKTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_DEL_EBI_TRD_REQUEST_T_
#define _BSC_DEL_EBI_TRD_REQUEST_T_

typedef struct bscDelEbiTrdRequestTag
{
    char             ebiTrdRefNo     [EBI_TRD_REF_NO_LEN];
    char             prodId          [PROD_ID_LEN];
} bscDelEbiTrdRequestT, *pBscDelEbiTrdRequestT;

#endif  /* _BSC_DEL_EBI_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _DEL_EBI_TRD_REQUEST_T_
#define _DEL_EBI_TRD_REQUEST_T_

typedef struct delEbiTrdRequestTag
{
    dataHeaderT      header;
    bscDelEbiTrdRequestT basic;
} delEbiTrdRequestT, *pDelEbiTrdRequestT;

#endif  /* _DEL_EBI_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _DEL_EBI_TRD_RESPONSE_T_
#define _DEL_EBI_TRD_RESPONSE_T_

typedef struct delEbiTrdResponseTag
{
    dataHeaderT      header;
} delEbiTrdResponseT, *pDelEbiTrdResponseT;

#endif  /* _DEL_EBI_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _DELEBIBLCKTRD_HXX_ */

/******************************************************************************/
/* End of file DelEbiBlckTrd.hxx */
/******************************************************************************/
