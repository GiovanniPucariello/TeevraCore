/* Generated by Xgen from: E100.00.01 SIR 68471 on: 2006-11-23 09:55 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqOwnStratBlkAuct.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Own Strategy Block Auction
*
*******************************************************************************/

#ifndef _INQOWNSTRATBLKAUCT_HXX_
#define _INQOWNSTRATBLKAUCT_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_INQ_OWN_STRAT_BLK_AUCT_GRP_MAX       128
#define INQ_OWN_STRAT_BLK_AUCT_REC_MAX           8

/******************************************************************************/

#ifndef _BSC_INQ_OWN_STRAT_BLK_AUCT_GRP_T_
#define _BSC_INQ_OWN_STRAT_BLK_AUCT_GRP_T_

typedef struct bscInqOwnStratBlkAuctGrpTag
{
    char             prodId          [PROD_ID_LEN];
} bscInqOwnStratBlkAuctGrpT, *pBscInqOwnStratBlkAuctGrpT;

#endif  /* _BSC_INQ_OWN_STRAT_BLK_AUCT_GRP_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_OWN_STRAT_BLK_AUCT_REQUEST_T_
#define _BSC_INQ_OWN_STRAT_BLK_AUCT_REQUEST_T_

typedef struct bscInqOwnStratBlkAuctRequestTag
{
    bscInqOwnStratBlkAuctGrpT bscInqOwnStratBlkAuctGrp [BSC_INQ_OWN_STRAT_BLK_AUCT_GRP_MAX];
    trdrIdGrpT       trdrIdGrp;
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} bscInqOwnStratBlkAuctRequestT, *pBscInqOwnStratBlkAuctRequestT;

#endif  /* _BSC_INQ_OWN_STRAT_BLK_AUCT_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_OWN_STRAT_BLK_AUCT_REQUEST_T_
#define _INQ_OWN_STRAT_BLK_AUCT_REQUEST_T_

typedef struct inqOwnStratBlkAuctRequestTag
{
    dataHeaderT      header;
    bscInqOwnStratBlkAuctRequestT basic;
} inqOwnStratBlkAuctRequestT, *pInqOwnStratBlkAuctRequestT;

#endif  /* _INQ_OWN_STRAT_BLK_AUCT_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_OWN_STRAT_BLK_AUCT_REC_T_
#define _BSC_INQ_OWN_STRAT_BLK_AUCT_REC_T_

typedef struct bscInqOwnStratBlkAuctRecTag
{
    stratIdGrpT      stratIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             buyCod;
    char             ordrTypCod;
    char             ordrNoBuy       [DRIV_ORDR_NO_LEN];
    char             ordrNoSel       [DRIV_ORDR_NO_LEN];
    char             quoPrcBuy       [DRIV_PRICE_LEN];
    char             quoPrcSel       [DRIV_PRICE_LEN];
    char             blkAuctQuoQtyBuy [DRIV_VOLUME_LEN];
    char             blkAuctQuoQtySel [DRIV_VOLUME_LEN];
    char             blkAuctQuoExeQtyBuy [DRIV_VOLUME_LEN];
    char             blkAuctQuoExeQtySel [DRIV_VOLUME_LEN];
    char             quoTrnTimBuy    [DRIV_TIME_LEN];
    char             quoTrnTimSel    [DRIV_TIME_LEN];
    char             opnClsCod;
} bscInqOwnStratBlkAuctRecT, *pBscInqOwnStratBlkAuctRecT;

#endif  /* _BSC_INQ_OWN_STRAT_BLK_AUCT_REC_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_OWN_STRAT_BLK_AUCT_RESPONSE_T_
#define _BSC_INQ_OWN_STRAT_BLK_AUCT_RESPONSE_T_

typedef struct bscInqOwnStratBlkAuctResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscInqOwnStratBlkAuctRecT bscInqOwnStratBlkAuctRec [INQ_OWN_STRAT_BLK_AUCT_REC_MAX];
} bscInqOwnStratBlkAuctResponseT, *pBscInqOwnStratBlkAuctResponseT;

#endif  /* _BSC_INQ_OWN_STRAT_BLK_AUCT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _EXT_INQ_OWN_STRAT_BLK_AUCT_REC_T_
#define _EXT_INQ_OWN_STRAT_BLK_AUCT_REC_T_

typedef struct extInqOwnStratBlkAuctRecTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membExchIdCodTo [DRIV_MEMB_EXCH_ID_COD_TO_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} extInqOwnStratBlkAuctRecT, *pExtInqOwnStratBlkAuctRecT;

#endif  /* _EXT_INQ_OWN_STRAT_BLK_AUCT_REC_T_ */

/******************************************************************************/

#ifndef _EXT_INQ_OWN_STRAT_BLK_AUCT_RESPONSE_T_
#define _EXT_INQ_OWN_STRAT_BLK_AUCT_RESPONSE_T_

typedef struct extInqOwnStratBlkAuctResponseTag
{
    extInqOwnStratBlkAuctRecT extInqOwnStratBlkAuctRec [INQ_OWN_STRAT_BLK_AUCT_REC_MAX];
} extInqOwnStratBlkAuctResponseT, *pExtInqOwnStratBlkAuctResponseT;

#endif  /* _EXT_INQ_OWN_STRAT_BLK_AUCT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_OWN_STRAT_BLK_AUCT_RESPONSE_T_
#define _INQ_OWN_STRAT_BLK_AUCT_RESPONSE_T_

typedef struct inqOwnStratBlkAuctResponseTag
{
    dataHeaderT      header;
    bscInqOwnStratBlkAuctResponseT basic;
    extInqOwnStratBlkAuctResponseT extension;
} inqOwnStratBlkAuctResponseT, *pInqOwnStratBlkAuctResponseT;

#endif  /* _INQ_OWN_STRAT_BLK_AUCT_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQOWNSTRATBLKAUCT_HXX_ */

/******************************************************************************/
/* End of file InqOwnStratBlkAuct.hxx */
/******************************************************************************/
