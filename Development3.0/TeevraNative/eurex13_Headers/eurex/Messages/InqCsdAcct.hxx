/* Generated by Xgen from: E130.13.01 SIR 150762 on: 2010-03-04 11:39 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqCsdAcct.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire CSD Account
*
*******************************************************************************/

#ifndef _INQCSDACCT_HXX_
#define _INQCSDACCT_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_INQ_CSD_ACCT_REC_MAX                 24

/******************************************************************************/

#ifndef _BSC_INQ_CSD_ACCT_REQUEST_T_
#define _BSC_INQ_CSD_ACCT_REQUEST_T_

typedef struct bscInqCsdAcctRequestTag
{
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             collPoolOwnrId  [DRIV_COLL_POOL_OWNR_ID_LEN];
    char             collPoolId      [DRIV_COLL_POOL_ID_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} bscInqCsdAcctRequestT, *pBscInqCsdAcctRequestT;

#endif  /* _BSC_INQ_CSD_ACCT_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_CSD_ACCT_REQUEST_T_
#define _INQ_CSD_ACCT_REQUEST_T_

typedef struct inqCsdAcctRequestTag
{
    dataHeaderT      header;
    bscInqCsdAcctRequestT basic;
} inqCsdAcctRequestT, *pInqCsdAcctRequestT;

#endif  /* _INQ_CSD_ACCT_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_CSD_ACCT_REC_T_
#define _BSC_INQ_CSD_ACCT_REC_T_

typedef struct bscInqCsdAcctRecTag
{
    char             collPoolId      [DRIV_COLL_POOL_ID_LEN];
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             collPoolOwnrId  [DRIV_COLL_POOL_OWNR_ID_LEN];
    char             csdId           [DRIV_CSD_ID_LEN];
    char             asstPurpCod;
    char             csdPldgAcctNo   [CSD_ACCT_NO_LEN];
    char             csdCtrAcctNo    [CSD_ACCT_NO_LEN];
    char             csdCustId       [DRIV_CSD_CUST_ID_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscInqCsdAcctRecT, *pBscInqCsdAcctRecT;

#endif  /* _BSC_INQ_CSD_ACCT_REC_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_CSD_ACCT_RESPONSE_T_
#define _BSC_INQ_CSD_ACCT_RESPONSE_T_

typedef struct bscInqCsdAcctResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscInqCsdAcctRecT bscInqCsdAcctRec [BSC_INQ_CSD_ACCT_REC_MAX];
} bscInqCsdAcctResponseT, *pBscInqCsdAcctResponseT;

#endif  /* _BSC_INQ_CSD_ACCT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_CSD_ACCT_RESPONSE_T_
#define _INQ_CSD_ACCT_RESPONSE_T_

typedef struct inqCsdAcctResponseTag
{
    dataHeaderT      header;
    bscInqCsdAcctResponseT basic;
} inqCsdAcctResponseT, *pInqCsdAcctResponseT;

#endif  /* _INQ_CSD_ACCT_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQCSDACCT_HXX_ */

/******************************************************************************/
/* End of file InqCsdAcct.hxx */
/******************************************************************************/