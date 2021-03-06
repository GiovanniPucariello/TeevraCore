/* Generated by Xgen from: E110.03.08 SIR 103290 on: 2008-04-02 14:05 */
/*******************************************************************************
* 2008 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntSpcEquColl.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Specific Equity Collateral
*
*******************************************************************************/

#ifndef _ENTSPCEQUCOLL_HXX_
#define _ENTSPCEQUCOLL_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_ENT_SPC_EQU_COLL_REQUEST_T_
#define _BSC_ENT_SPC_EQU_COLL_REQUEST_T_

typedef struct bscEntSpcEquCollRequestTag
{
    char             actnCod;
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    char             isinCod         [ISIN_COD_LEN];
    char             spcEquCollQty   [DRIV_QUANTITY_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             csdId           [DRIV_CSD_ID_LEN];
    char             csdPldgAcctNo   [CSD_ACCT_NO_LEN];
} bscEntSpcEquCollRequestT, *pBscEntSpcEquCollRequestT;

#endif  /* _BSC_ENT_SPC_EQU_COLL_REQUEST_T_ */

/******************************************************************************/

#ifndef _ENT_SPC_EQU_COLL_REQUEST_T_
#define _ENT_SPC_EQU_COLL_REQUEST_T_

typedef struct entSpcEquCollRequestTag
{
    dataHeaderT      header;
    bscEntSpcEquCollRequestT basic;
} entSpcEquCollRequestT, *pEntSpcEquCollRequestT;

#endif  /* _ENT_SPC_EQU_COLL_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_ENT_SPC_EQU_COLL_RESPONSE_T_
#define _BSC_ENT_SPC_EQU_COLL_RESPONSE_T_

typedef struct bscEntSpcEquCollResponseTag
{
    char             avlBulkCollQty  [DRIV_QUANTITY_LEN];
    char             usedSecQty      [DRIV_QUANTITY_LEN];
    char             secEvalPrc      [DRIV_PRICE_LEN];
    char             evalPrcDispDcml [EVAL_PRC_DISP_DCML_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscEntSpcEquCollResponseT, *pBscEntSpcEquCollResponseT;

#endif  /* _BSC_ENT_SPC_EQU_COLL_RESPONSE_T_ */

/******************************************************************************/

#ifndef _ENT_SPC_EQU_COLL_RESPONSE_T_
#define _ENT_SPC_EQU_COLL_RESPONSE_T_

typedef struct entSpcEquCollResponseTag
{
    dataHeaderT      header;
    bscEntSpcEquCollResponseT basic;
} entSpcEquCollResponseT, *pEntSpcEquCollResponseT;

#endif  /* _ENT_SPC_EQU_COLL_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTSPCEQUCOLL_HXX_ */

/******************************************************************************/
/* End of file EntSpcEquColl.hxx */
/******************************************************************************/
