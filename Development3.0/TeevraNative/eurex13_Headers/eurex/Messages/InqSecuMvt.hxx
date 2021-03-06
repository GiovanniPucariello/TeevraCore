/* Generated by Xgen from: E130.13.01 SIR 150762 on: 2010-03-04 11:39 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqSecuMvt.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Security Movement
*
*******************************************************************************/

#ifndef _INQSECUMVT_HXX_
#define _INQSECUMVT_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_INQ_SECU_MVT_REC_MAX                 15

/******************************************************************************/

#ifndef _BSC_INQ_SECU_MVT_REQUEST_T_
#define _BSC_INQ_SECU_MVT_REQUEST_T_

typedef struct bscInqSecuMvtRequestTag
{
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             collPoolId      [DRIV_COLL_POOL_ID_LEN];
    char             isinCod         [ISIN_COD_LEN];
    char             csdId           [DRIV_CSD_ID_LEN];
    char             csdPldgAcctNo   [CSD_ACCT_NO_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} bscInqSecuMvtRequestT, *pBscInqSecuMvtRequestT;

#endif  /* _BSC_INQ_SECU_MVT_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_SECU_MVT_REQUEST_T_
#define _INQ_SECU_MVT_REQUEST_T_

typedef struct inqSecuMvtRequestTag
{
    dataHeaderT      header;
    bscInqSecuMvtRequestT basic;
} inqSecuMvtRequestT, *pInqSecuMvtRequestT;

#endif  /* _INQ_SECU_MVT_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_SECU_MVT_REC_T_
#define _BSC_INQ_SECU_MVT_REC_T_

typedef struct bscInqSecuMvtRecTag
{
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             isinCod         [ISIN_COD_LEN];
    char             clsPrc          [DRIV_PRICE_LEN];
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             collPoolId      [DRIV_COLL_POOL_ID_LEN];
    char             strtBulk        [DRIV_AMOUNT_LEN];
    char             withBulk        [DRIV_AMOUNT_LEN];
    char             depBulk         [DRIV_AMOUNT_LEN];
    char             pendWithBulk    [DRIV_AMOUNT_LEN];
    char             crtBulk         [DRIV_AMOUNT_LEN];
    char             spcEquCollQty   [DRIV_QUANTITY_LEN];
    char             usedSecQty      [DRIV_QUANTITY_LEN];
    char             mktValFctr      [DRIV_MKT_VAL_FCTR_LEN];
    char             asstPurpCod;
    char             collDispDcml    [DRIV_COLL_DISP_DCML_LEN];
    char             secuTyp         [DRIV_SECU_TYP_LEN];
    char             csdId           [DRIV_CSD_ID_LEN];
    char             csdPldgAcctNo   [CSD_ACCT_NO_LEN];
    char             nonEvalRsn      [NON_EVAL_RSN_LEN];
} bscInqSecuMvtRecT, *pBscInqSecuMvtRecT;

#endif  /* _BSC_INQ_SECU_MVT_REC_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_SECU_MVT_RESPONSE_T_
#define _BSC_INQ_SECU_MVT_RESPONSE_T_

typedef struct bscInqSecuMvtResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscInqSecuMvtRecT bscInqSecuMvtRec [BSC_INQ_SECU_MVT_REC_MAX];
} bscInqSecuMvtResponseT, *pBscInqSecuMvtResponseT;

#endif  /* _BSC_INQ_SECU_MVT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_SECU_MVT_RESPONSE_T_
#define _INQ_SECU_MVT_RESPONSE_T_

typedef struct inqSecuMvtResponseTag
{
    dataHeaderT      header;
    bscInqSecuMvtResponseT basic;
} inqSecuMvtResponseT, *pInqSecuMvtResponseT;

#endif  /* _INQ_SECU_MVT_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQSECUMVT_HXX_ */

/******************************************************************************/
/* End of file InqSecuMvt.hxx */
/******************************************************************************/
