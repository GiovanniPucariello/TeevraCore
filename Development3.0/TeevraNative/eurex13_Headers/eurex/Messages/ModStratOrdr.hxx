/* Generated by Xgen from: E100.04.19 SIR 79062 on: 2007-05-15 09:20 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   ModStratOrdr.hxx
*
*  DESCRIPTION: Layouts used for
*               Modify Strategy Order
*
*******************************************************************************/

#ifndef _MODSTRATORDR_HXX_
#define _MODSTRATORDR_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_MOD_STRAT_ORDR_REQUEST_T_
#define _BSC_MOD_STRAT_ORDR_REQUEST_T_

typedef struct bscModStratOrdrRequestTag
{
    char             buyCod;
    stratIdGrpT      stratIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             ordrQty         [DRIV_VOLUME_LEN];
    char             ordrTotQty      [DRIV_VOLUME_LEN];
    char             ordrExePrc      [DRIV_PRICE_LEN];
    char             ordrResCod;
    char             opnClsCod;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscModStratOrdrRequestT, *pBscModStratOrdrRequestT;

#endif  /* _BSC_MOD_STRAT_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _EXT_MOD_STRAT_ORDR_REQUEST_T_
#define _EXT_MOD_STRAT_ORDR_REQUEST_T_

typedef struct extModStratOrdrRequestTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             prcRsblChkInd;
    char             userOrdrRef     [USER_ORDR_REF_LEN];
} extModStratOrdrRequestT, *pExtModStratOrdrRequestT;

#endif  /* _EXT_MOD_STRAT_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _MOD_STRAT_ORDR_REQUEST_T_
#define _MOD_STRAT_ORDR_REQUEST_T_

typedef struct modStratOrdrRequestTag
{
    dataHeaderT      header;
    bscModStratOrdrRequestT basic;
    extModStratOrdrRequestT extension;
} modStratOrdrRequestT, *pModStratOrdrRequestT;

#endif  /* _MOD_STRAT_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_MOD_STRAT_ORDR_RESPONSE_T_
#define _BSC_MOD_STRAT_ORDR_RESPONSE_T_

typedef struct bscModStratOrdrResponseTag
{
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             ordrExeQty      [DRIV_VOLUME_LEN];
    char             ordrBkQty       [DRIV_VOLUME_LEN];
    char             ordrCnclQty     [DRIV_VOLUME_LEN];
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscModStratOrdrResponseT, *pBscModStratOrdrResponseT;

#endif  /* _BSC_MOD_STRAT_ORDR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _MOD_STRAT_ORDR_RESPONSE_T_
#define _MOD_STRAT_ORDR_RESPONSE_T_

typedef struct modStratOrdrResponseTag
{
    dataHeaderT      header;
    bscModStratOrdrResponseT basic;
} modStratOrdrResponseT, *pModStratOrdrResponseT;

#endif  /* _MOD_STRAT_ORDR_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _MODSTRATORDR_HXX_ */

/******************************************************************************/
/* End of file ModStratOrdr.hxx */
/******************************************************************************/