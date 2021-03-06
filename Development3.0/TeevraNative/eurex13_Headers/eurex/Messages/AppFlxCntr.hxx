/* Generated by Xgen from: E100.05.02 SIR 82796 on: 2007-06-12 15:43 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   AppFlxCntr.hxx
*
*  DESCRIPTION: Layouts used for
*               Approve Flexible Contract
*
*******************************************************************************/

#ifndef _APPFLXCNTR_HXX_
#define _APPFLXCNTR_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_APP_FLX_CNTR_REQUEST_T_
#define _BSC_APP_FLX_CNTR_REQUEST_T_

typedef struct bscAppFlxCntrRequestTag
{
    flxCntrTrnIdGrpT flxCntrTrnIdGrp;
    char             buyCod;
    trdrIdGrpT       trdrIdGrp;
    char             opnClsCod;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscAppFlxCntrRequestT, *pBscAppFlxCntrRequestT;

#endif  /* _BSC_APP_FLX_CNTR_REQUEST_T_ */

/******************************************************************************/

#ifndef _EXT_APP_FLX_CNTR_REQUEST_T_
#define _EXT_APP_FLX_CNTR_REQUEST_T_

typedef struct extAppFlxCntrRequestTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membExchIdCodTo [DRIV_MEMB_EXCH_ID_COD_TO_LEN];
} extAppFlxCntrRequestT, *pExtAppFlxCntrRequestT;

#endif  /* _EXT_APP_FLX_CNTR_REQUEST_T_ */

/******************************************************************************/

#ifndef _APP_FLX_CNTR_REQUEST_T_
#define _APP_FLX_CNTR_REQUEST_T_

typedef struct appFlxCntrRequestTag
{
    dataHeaderT      header;
    bscAppFlxCntrRequestT basic;
    extAppFlxCntrRequestT extension;
} appFlxCntrRequestT, *pAppFlxCntrRequestT;

#endif  /* _APP_FLX_CNTR_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_APP_FLX_CNTR_RESPONSE_T_
#define _BSC_APP_FLX_CNTR_RESPONSE_T_

typedef struct bscAppFlxCntrResponseTag
{
    char             flxCntrSynProdId [PROD_ID_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscAppFlxCntrResponseT, *pBscAppFlxCntrResponseT;

#endif  /* _BSC_APP_FLX_CNTR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _APP_FLX_CNTR_RESPONSE_T_
#define _APP_FLX_CNTR_RESPONSE_T_

typedef struct appFlxCntrResponseTag
{
    dataHeaderT      header;
    bscAppFlxCntrResponseT basic;
} appFlxCntrResponseT, *pAppFlxCntrResponseT;

#endif  /* _APP_FLX_CNTR_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _APPFLXCNTR_HXX_ */

/******************************************************************************/
/* End of file AppFlxCntr.hxx */
/******************************************************************************/
