/* Generated by Xgen from: E120.14.02 SIR 127559 on: 2009-04-03 10:55 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntStratOtcBlkTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Strategy OTC Block Trade
*
*******************************************************************************/

#ifndef _ENTSTRATOTCBLKTRD_HXX_
#define _ENTSTRATOTCBLKTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_ENT_STRAT_OTC_BLK_TRD_REQUEST_T_
#define _BSC_ENT_STRAT_OTC_BLK_TRD_REQUEST_T_

typedef struct bscEntStratOtcBlkTrdRequestTag
{
    char             buyCod;
    stratIdGrpT      stratIdGrp;
    stratEquLegGrpT  stratEquLegGrp;
    trdrIdGrpT       trdrIdGrp;
    char             trdXQty         [DRIV_VOLUME_LEN];
    char             trdMtchPrc      [DRIV_PRICE_LEN];
    char             opnClsCod;
    char             membCtpyIdCod   [MEMB_CTPY_ID_COD_LEN];
} bscEntStratOtcBlkTrdRequestT, *pBscEntStratOtcBlkTrdRequestT;

#endif  /* _BSC_ENT_STRAT_OTC_BLK_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _EXT_ENT_STRAT_OTC_BLK_TRD_REQUEST_T_
#define _EXT_ENT_STRAT_OTC_BLK_TRD_REQUEST_T_

typedef struct extEntStratOtcBlkTrdRequestTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
} extEntStratOtcBlkTrdRequestT, *pExtEntStratOtcBlkTrdRequestT;

#endif  /* _EXT_ENT_STRAT_OTC_BLK_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _ENT_STRAT_OTC_BLK_TRD_REQUEST_T_
#define _ENT_STRAT_OTC_BLK_TRD_REQUEST_T_

typedef struct entStratOtcBlkTrdRequestTag
{
    dataHeaderT      header;
    bscEntStratOtcBlkTrdRequestT basic;
    extEntStratOtcBlkTrdRequestT extension;
} entStratOtcBlkTrdRequestT, *pEntStratOtcBlkTrdRequestT;

#endif  /* _ENT_STRAT_OTC_BLK_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_ENT_STRAT_OTC_BLK_TRD_RESPONSE_T_
#define _BSC_ENT_STRAT_OTC_BLK_TRD_RESPONSE_T_

typedef struct bscEntStratOtcBlkTrdResponseTag
{
    char             trnIdNo         [TRN_ID_NO_LEN];
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscEntStratOtcBlkTrdResponseT, *pBscEntStratOtcBlkTrdResponseT;

#endif  /* _BSC_ENT_STRAT_OTC_BLK_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _ENT_STRAT_OTC_BLK_TRD_RESPONSE_T_
#define _ENT_STRAT_OTC_BLK_TRD_RESPONSE_T_

typedef struct entStratOtcBlkTrdResponseTag
{
    dataHeaderT      header;
    bscEntStratOtcBlkTrdResponseT basic;
} entStratOtcBlkTrdResponseT, *pEntStratOtcBlkTrdResponseT;

#endif  /* _ENT_STRAT_OTC_BLK_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTSTRATOTCBLKTRD_HXX_ */

/******************************************************************************/
/* End of file EntStratOtcBlkTrd.hxx */
/******************************************************************************/
