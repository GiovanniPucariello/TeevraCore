/* Generated by Xgen from: E100.00.01 SIR 68471 on: 2006-11-23 09:55 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   SubStratBlkAuctConf.hxx
*
*  DESCRIPTION: Layouts used for
*               Subscribe Strategy Block Auction Confirmation
*
*******************************************************************************/

#ifndef _SUBSTRATBLKAUCTCONF_HXX_
#define _SUBSTRATBLKAUCTCONF_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_SUB_STRAT_BLK_AUCT_CONF_PRIV_BCAST_T_
#define _BSC_SUB_STRAT_BLK_AUCT_CONF_PRIV_BCAST_T_

typedef struct bscSubStratBlkAuctConfPrivBcastTag
{
    stratIdGrpT      stratIdGrp;
    blkAuctPotPrcGrpT blkAuctPotPrcGrp;
} bscSubStratBlkAuctConfPrivBcastT, *pBscSubStratBlkAuctConfPrivBcastT;

#endif  /* _BSC_SUB_STRAT_BLK_AUCT_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _EXT_SUB_STRAT_BLK_AUCT_CONF_PRIV_BCAST_T_
#define _EXT_SUB_STRAT_BLK_AUCT_CONF_PRIV_BCAST_T_

typedef struct extSubStratBlkAuctConfPrivBcastTag
{
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
    char             trnTypId;
    char             quoTrnTimBuy    [DRIV_TIME_LEN];
    char             quoTrnTimSel    [DRIV_TIME_LEN];
    char             opnClsCod;
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membExchIdCodTo [DRIV_MEMB_EXCH_ID_COD_TO_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} extSubStratBlkAuctConfPrivBcastT, *pExtSubStratBlkAuctConfPrivBcastT;

#endif  /* _EXT_SUB_STRAT_BLK_AUCT_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _SUB_STRAT_BLK_AUCT_CONF_PRIV_BCAST_T_
#define _SUB_STRAT_BLK_AUCT_CONF_PRIV_BCAST_T_

typedef struct subStratBlkAuctConfPrivBcastTag
{
    dataHeaderT      header;
    bscSubStratBlkAuctConfPrivBcastT basic;
    extSubStratBlkAuctConfPrivBcastT extension;
} subStratBlkAuctConfPrivBcastT, *pSubStratBlkAuctConfPrivBcastT;

#endif  /* _SUB_STRAT_BLK_AUCT_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _SUB_STRAT_BLK_AUCT_CONF_SUBJECT_T_
#define _SUB_STRAT_BLK_AUCT_CONF_SUBJECT_T_

typedef struct subStratBlkAuctConfSubjectTag
{
    char             membId          [MEMB_ID_LEN];
    char             prodId          [PROD_ID_LEN];
} subStratBlkAuctConfSubjectT, *pSubStratBlkAuctConfSubjectT;

#endif  /* _SUB_STRAT_BLK_AUCT_CONF_SUBJECT_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _SUBSTRATBLKAUCTCONF_HXX_ */

/******************************************************************************/
/* End of file SubStratBlkAuctConf.hxx */
/******************************************************************************/
