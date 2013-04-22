/* Generated by Xgen from: E90.07.00 SIR 56439 on: 2006-06-07 16:23 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntEfpIdxTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter EFP-Index Futures Trade
*
*******************************************************************************/

#ifndef _ENTEFPIDXTRD_HXX_
#define _ENTEFPIDXTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_ENT_EFP_IDX_TRD_REQUEST_T_
#define _FUT_BSC_ENT_EFP_IDX_TRD_REQUEST_T_

typedef struct futBscEntEfpIdxTrdRequestTag
{
    char             buyCod;
    futCntrIdGrpT    futCntrIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             opnClsCod;
    char             membCtpyIdCod   [MEMB_CTPY_ID_COD_LEN];
    char             nomVal          [NOM_VAL_LEN];
    char             trdXQty         [DRIV_VOLUME_LEN];
    char             futPrc          [DRIV_PRICE_LEN];
    char             hdgeTyp         [HDGE_TYP_LEN];
    char             setlInst        [SETL_INST_LEN];
    char             cshBsktRefId    [CSH_BSKT_REF_ID_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membExchIdCodTo [DRIV_MEMB_EXCH_ID_COD_TO_LEN];
} futBscEntEfpIdxTrdRequestT, *pFutBscEntEfpIdxTrdRequestT;

#endif  /* _FUT_BSC_ENT_EFP_IDX_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_EFP_IDX_TRD_REQUEST_T_
#define _FUT_ENT_EFP_IDX_TRD_REQUEST_T_

typedef struct futEntEfpIdxTrdRequestTag
{
    dataHeaderT      header;
    futBscEntEfpIdxTrdRequestT basic;
} futEntEfpIdxTrdRequestT, *pFutEntEfpIdxTrdRequestT;

#endif  /* _FUT_ENT_EFP_IDX_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_ENT_EFP_IDX_TRD_RESPONSE_T_
#define _FUT_BSC_ENT_EFP_IDX_TRD_RESPONSE_T_

typedef struct futBscEntEfpIdxTrdResponseTag
{
    char             trnIdNo         [TRN_ID_NO_LEN];
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} futBscEntEfpIdxTrdResponseT, *pFutBscEntEfpIdxTrdResponseT;

#endif  /* _FUT_BSC_ENT_EFP_IDX_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_EFP_IDX_TRD_RESPONSE_T_
#define _FUT_ENT_EFP_IDX_TRD_RESPONSE_T_

typedef struct futEntEfpIdxTrdResponseTag
{
    dataHeaderT      header;
    futBscEntEfpIdxTrdResponseT basic;
} futEntEfpIdxTrdResponseT, *pFutEntEfpIdxTrdResponseT;

#endif  /* _FUT_ENT_EFP_IDX_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTEFPIDXTRD_HXX_ */

/******************************************************************************/
/* End of file EntEfpIdxTrd.hxx */
/******************************************************************************/