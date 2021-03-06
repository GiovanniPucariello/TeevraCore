/* Generated by Xgen from: E130.36.01 SIR 158521 on: 2010-07-13 15:18 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   ModEbiEfsTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Modify EBI EFS Trade
*
*******************************************************************************/

#ifndef _MODEBIEFSTRD_HXX_
#define _MODEBIEFSTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_MOD_EBI_EFP_IDX_TRD_RESP_REC_MAX     30
#define BSC_MOD_EBI_EFS_TRD_REQ_GRP_MAX          30

/******************************************************************************/

#ifndef _FUT_BSC_MOD_EBI_EFS_TRD_REQUEST_T_
#define _FUT_BSC_MOD_EBI_EFS_TRD_REQUEST_T_

typedef struct futBscModEbiEfsTrdRequestTag
{
    char             ebiTrdRefNo     [EBI_TRD_REF_NO_LEN];
    ebiTrdReqGrpT    ebiTrdReqGrp;
    char             setlDat         [DRIV_DATE_LEN];
    char             swapCust1       [SWAP_CUST1_LEN];
    char             swapCust2       [SWAP_CUST2_LEN];
    cshLegEfsGrpT    cshLegEfsGrp;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscModEbiTrdReqGrpT bscModEbiTrdReqGrp [BSC_MOD_EBI_EFS_TRD_REQ_GRP_MAX];
} futBscModEbiEfsTrdRequestT, *pFutBscModEbiEfsTrdRequestT;

#endif  /* _FUT_BSC_MOD_EBI_EFS_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_MOD_EBI_EFS_TRD_REQUEST_T_
#define _FUT_MOD_EBI_EFS_TRD_REQUEST_T_

typedef struct futModEbiEfsTrdRequestTag
{
    dataHeaderT      header;
    futBscModEbiEfsTrdRequestT basic;
} futModEbiEfsTrdRequestT, *pFutModEbiEfsTrdRequestT;

#endif  /* _FUT_MOD_EBI_EFS_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_MOD_EBI_EFS_TRD_RESPONSE_T_
#define _FUT_BSC_MOD_EBI_EFS_TRD_RESPONSE_T_

typedef struct futBscModEbiEfsTrdResponseTag
{
    char             ebiTrdRefNo     [EBI_TRD_REF_NO_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             exchRat         [EXCH_RAT_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscModEbiTrdRespRecT bscModEbiTrdRespRec [BSC_MOD_EBI_EFP_IDX_TRD_RESP_REC_MAX];
} futBscModEbiEfsTrdResponseT, *pFutBscModEbiEfsTrdResponseT;

#endif  /* _FUT_BSC_MOD_EBI_EFS_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_MOD_EBI_EFS_TRD_RESPONSE_T_
#define _FUT_MOD_EBI_EFS_TRD_RESPONSE_T_

typedef struct futModEbiEfsTrdResponseTag
{
    dataHeaderT      header;
    futBscModEbiEfsTrdResponseT basic;
} futModEbiEfsTrdResponseT, *pFutModEbiEfsTrdResponseT;

#endif  /* _FUT_MOD_EBI_EFS_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _MODEBIEFSTRD_HXX_ */

/******************************************************************************/
/* End of file ModEbiEfsTrd.hxx */
/******************************************************************************/
