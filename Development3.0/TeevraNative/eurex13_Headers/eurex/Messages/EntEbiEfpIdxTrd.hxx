/* Generated by Xgen from: E130.36.01 SIR 158521 on: 2010-07-13 15:18 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntEbiEfpIdxTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter EBI EFP-Index Future Trade
*
*******************************************************************************/

#ifndef _ENTEBIEFPIDXTRD_HXX_
#define _ENTEBIEFPIDXTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_ENT_EBI_EFP_FIN_TRD_REQ_GRP_MAX      30
#define BSC_ENT_EBI_TRD_RESP_REC_MAX             30

/******************************************************************************/

#ifndef _FUT_BSC_ENT_EBI_EFP_IDX_TRD_REQUEST_T_
#define _FUT_BSC_ENT_EBI_EFP_IDX_TRD_REQUEST_T_

typedef struct futBscEntEbiEfpIdxTrdRequestTag
{
    ebiTrdReqGrpT    ebiTrdReqGrp;
    char             hdgeTyp         [HDGE_TYP_LEN];
    char             setlInst        [SETL_INST_LEN];
    char             cshBsktRefId    [CSH_BSKT_REF_ID_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscEntEbiTrdReqGrpT bscEntEbiTrdReqGrp [BSC_ENT_EBI_EFP_FIN_TRD_REQ_GRP_MAX];
} futBscEntEbiEfpIdxTrdRequestT, *pFutBscEntEbiEfpIdxTrdRequestT;

#endif  /* _FUT_BSC_ENT_EBI_EFP_IDX_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_EBI_EFP_IDX_TRD_REQUEST_T_
#define _FUT_ENT_EBI_EFP_IDX_TRD_REQUEST_T_

typedef struct futEntEbiEfpIdxTrdRequestTag
{
    dataHeaderT      header;
    futBscEntEbiEfpIdxTrdRequestT basic;
} futEntEbiEfpIdxTrdRequestT, *pFutEntEbiEfpIdxTrdRequestT;

#endif  /* _FUT_ENT_EBI_EFP_IDX_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_ENT_EBI_EFP_IDX_TRD_RESPONSE_T_
#define _FUT_BSC_ENT_EBI_EFP_IDX_TRD_RESPONSE_T_

typedef struct futBscEntEbiEfpIdxTrdResponseTag
{
    char             ebiTrdRefNo     [EBI_TRD_REF_NO_LEN];
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscEntEbiTrdRespRecT bscEntEbiTrdRespRec [BSC_ENT_EBI_TRD_RESP_REC_MAX];
} futBscEntEbiEfpIdxTrdResponseT, *pFutBscEntEbiEfpIdxTrdResponseT;

#endif  /* _FUT_BSC_ENT_EBI_EFP_IDX_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_EBI_EFP_IDX_TRD_RESPONSE_T_
#define _FUT_ENT_EBI_EFP_IDX_TRD_RESPONSE_T_

typedef struct futEntEbiEfpIdxTrdResponseTag
{
    dataHeaderT      header;
    futBscEntEbiEfpIdxTrdResponseT basic;
} futEntEbiEfpIdxTrdResponseT, *pFutEntEbiEfpIdxTrdResponseT;

#endif  /* _FUT_ENT_EBI_EFP_IDX_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTEBIEFPIDXTRD_HXX_ */

/******************************************************************************/
/* End of file EntEbiEfpIdxTrd.hxx */
/******************************************************************************/