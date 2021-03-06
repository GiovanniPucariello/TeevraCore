/* Generated by Xgen from: E90.08.00 SIR 58337 on: 2006-07-18 10:11 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqBlkAuct.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Block Auction
*
*******************************************************************************/

#ifndef _INQBLKAUCT_HXX_
#define _INQBLKAUCT_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define FUT_BSC_INQ_BLK_AUCT_GRP_MAX             118
#define FUT_INQ_BLK_AUCT_REC_MAX                 40
#define OPT_BSC_INQ_BLK_AUCT_GRP_MAX             118
#define OPT_INQ_BLK_AUCT_REC_MAX                 40

/******************************************************************************/

#ifndef _FUT_BSC_INQ_BLK_AUCT_REQUEST_T_
#define _FUT_BSC_INQ_BLK_AUCT_REQUEST_T_

typedef struct futBscInqBlkAuctRequestTag
{
    futCntrIdGrpT    futCntrIdGrp    [FUT_BSC_INQ_BLK_AUCT_GRP_MAX];
    trdrIdGrpT       trdrIdGrp;
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} futBscInqBlkAuctRequestT, *pFutBscInqBlkAuctRequestT;

#endif  /* _FUT_BSC_INQ_BLK_AUCT_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_BLK_AUCT_REQUEST_T_
#define _FUT_INQ_BLK_AUCT_REQUEST_T_

typedef struct futInqBlkAuctRequestTag
{
    dataHeaderT      header;
    futBscInqBlkAuctRequestT basic;
} futInqBlkAuctRequestT, *pFutInqBlkAuctRequestT;

#endif  /* _FUT_INQ_BLK_AUCT_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_BLK_AUCT_REC_T_
#define _FUT_BSC_INQ_BLK_AUCT_REC_T_

typedef struct futBscInqBlkAuctRecTag
{
    futCntrIdGrpT    futCntrIdGrp;
    char             blkAuctStsCod;
    char             blkAuctStrtTim  [DRIV_TIME_LEN];
    char             blkAuctQty      [DRIV_QUANTITY_LEN];
    blkAuctPotPrcGrpT blkAuctPotPrcGrp;
    char             membRtng        [MBR_RTNG_LEN];
} futBscInqBlkAuctRecT, *pFutBscInqBlkAuctRecT;

#endif  /* _FUT_BSC_INQ_BLK_AUCT_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_BLK_AUCT_RESPONSE_T_
#define _FUT_BSC_INQ_BLK_AUCT_RESPONSE_T_

typedef struct futBscInqBlkAuctResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    futBscInqBlkAuctRecT futBscInqBlkAuctRec [FUT_INQ_BLK_AUCT_REC_MAX];
} futBscInqBlkAuctResponseT, *pFutBscInqBlkAuctResponseT;

#endif  /* _FUT_BSC_INQ_BLK_AUCT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_BLK_AUCT_RESPONSE_T_
#define _FUT_INQ_BLK_AUCT_RESPONSE_T_

typedef struct futInqBlkAuctResponseTag
{
    dataHeaderT      header;
    futBscInqBlkAuctResponseT basic;
} futInqBlkAuctResponseT, *pFutInqBlkAuctResponseT;

#endif  /* _FUT_INQ_BLK_AUCT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_BLK_AUCT_REQUEST_T_
#define _OPT_BSC_INQ_BLK_AUCT_REQUEST_T_

typedef struct optBscInqBlkAuctRequestTag
{
    optCntrIdGrpT    optCntrIdGrp    [OPT_BSC_INQ_BLK_AUCT_GRP_MAX];
    trdrIdGrpT       trdrIdGrp;
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} optBscInqBlkAuctRequestT, *pOptBscInqBlkAuctRequestT;

#endif  /* _OPT_BSC_INQ_BLK_AUCT_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_BLK_AUCT_REQUEST_T_
#define _OPT_INQ_BLK_AUCT_REQUEST_T_

typedef struct optInqBlkAuctRequestTag
{
    dataHeaderT      header;
    optBscInqBlkAuctRequestT basic;
} optInqBlkAuctRequestT, *pOptInqBlkAuctRequestT;

#endif  /* _OPT_INQ_BLK_AUCT_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_BLK_AUCT_REC_T_
#define _OPT_BSC_INQ_BLK_AUCT_REC_T_

typedef struct optBscInqBlkAuctRecTag
{
    optCntrIdGrpT    optCntrIdGrp;
    char             blkAuctStsCod;
    char             blkAuctStrtTim  [DRIV_TIME_LEN];
    char             blkAuctQty      [DRIV_QUANTITY_LEN];
    blkAuctPotPrcGrpT blkAuctPotPrcGrp;
    char             membRtng        [MBR_RTNG_LEN];
} optBscInqBlkAuctRecT, *pOptBscInqBlkAuctRecT;

#endif  /* _OPT_BSC_INQ_BLK_AUCT_REC_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_BLK_AUCT_RESPONSE_T_
#define _OPT_BSC_INQ_BLK_AUCT_RESPONSE_T_

typedef struct optBscInqBlkAuctResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    optBscInqBlkAuctRecT optBscInqBlkAuctRec [OPT_INQ_BLK_AUCT_REC_MAX];
} optBscInqBlkAuctResponseT, *pOptBscInqBlkAuctResponseT;

#endif  /* _OPT_BSC_INQ_BLK_AUCT_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_BLK_AUCT_RESPONSE_T_
#define _OPT_INQ_BLK_AUCT_RESPONSE_T_

typedef struct optInqBlkAuctResponseTag
{
    dataHeaderT      header;
    optBscInqBlkAuctResponseT basic;
} optInqBlkAuctResponseT, *pOptInqBlkAuctResponseT;

#endif  /* _OPT_INQ_BLK_AUCT_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQBLKAUCT_HXX_ */

/******************************************************************************/
/* End of file InqBlkAuct.hxx */
/******************************************************************************/
