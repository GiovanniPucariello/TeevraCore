/* Generated by Xgen from: E100.00.01 SIR 68471 on: 2006-11-23 09:55 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   SubBlkAuctConf.hxx
*
*  DESCRIPTION: Layouts used for
*               Subscribe Block Auction Confirmation
*
*******************************************************************************/

#ifndef _SUBBLKAUCTCONF_HXX_
#define _SUBBLKAUCTCONF_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _FUT_BSC_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_
#define _FUT_BSC_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_

typedef struct futBscSubBlkAuctConfPrivBcastTag
{
    futCntrIdGrpT    futCntrIdGrp;
    blkAuctPotPrcGrpT blkAuctPotPrcGrp;
} futBscSubBlkAuctConfPrivBcastT, *pFutBscSubBlkAuctConfPrivBcastT;

#endif  /* _FUT_BSC_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_
#define _FUT_EXT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_

typedef struct futExtSubBlkAuctConfPrivBcastTag
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
} futExtSubBlkAuctConfPrivBcastT, *pFutExtSubBlkAuctConfPrivBcastT;

#endif  /* _FUT_EXT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_
#define _FUT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_

typedef struct futSubBlkAuctConfPrivBcastTag
{
    dataHeaderT      header;
    futBscSubBlkAuctConfPrivBcastT basic;
    futExtSubBlkAuctConfPrivBcastT extension;
} futSubBlkAuctConfPrivBcastT, *pFutSubBlkAuctConfPrivBcastT;

#endif  /* _FUT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_SUB_BLK_AUCT_CONF_SUBJECT_T_
#define _FUT_SUB_BLK_AUCT_CONF_SUBJECT_T_

typedef struct futSubBlkAuctConfSubjectTag
{
    char             membId          [MEMB_ID_LEN];
    char             prodId          [PROD_ID_LEN];
    char             cntrExpMthDat   [CNTR_EXP_MTH_DAT_LEN];
    char             cntrExpYrDat    [CNTR_EXP_YR_DAT_LEN];
    char             subjFill        [SUBJ_FILL_LEN];
} futSubBlkAuctConfSubjectT, *pFutSubBlkAuctConfSubjectT;

#endif  /* _FUT_SUB_BLK_AUCT_CONF_SUBJECT_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_
#define _OPT_BSC_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_

typedef struct optBscSubBlkAuctConfPrivBcastTag
{
    optCntrIdGrpT    optCntrIdGrp;
    blkAuctPotPrcGrpT blkAuctPotPrcGrp;
} optBscSubBlkAuctConfPrivBcastT, *pOptBscSubBlkAuctConfPrivBcastT;

#endif  /* _OPT_BSC_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_
#define _OPT_EXT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_

typedef struct optExtSubBlkAuctConfPrivBcastTag
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
} optExtSubBlkAuctConfPrivBcastT, *pOptExtSubBlkAuctConfPrivBcastT;

#endif  /* _OPT_EXT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_
#define _OPT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_

typedef struct optSubBlkAuctConfPrivBcastTag
{
    dataHeaderT      header;
    optBscSubBlkAuctConfPrivBcastT basic;
    optExtSubBlkAuctConfPrivBcastT extension;
} optSubBlkAuctConfPrivBcastT, *pOptSubBlkAuctConfPrivBcastT;

#endif  /* _OPT_SUB_BLK_AUCT_CONF_PRIV_BCAST_T_ */

/******************************************************************************/

#ifndef _OPT_SUB_BLK_AUCT_CONF_SUBJECT_T_
#define _OPT_SUB_BLK_AUCT_CONF_SUBJECT_T_

typedef struct optSubBlkAuctConfSubjectTag
{
    char             membId          [MEMB_ID_LEN];
    char             prodId          [PROD_ID_LEN];
    char             cntrClasCod;
    char             cntrExpMthDat   [CNTR_EXP_MTH_DAT_LEN];
    char             cntrExpYrDat    [CNTR_EXP_YR_DAT_LEN];
    char             cntrExerPrc     [CNTR_EXER_PRC_LEN];
    char             cntrVersNo;
} optSubBlkAuctConfSubjectT, *pOptSubBlkAuctConfSubjectT;

#endif  /* _OPT_SUB_BLK_AUCT_CONF_SUBJECT_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _SUBBLKAUCTCONF_HXX_ */

/******************************************************************************/
/* End of file SubBlkAuctConf.hxx */
/******************************************************************************/
