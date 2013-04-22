/* Generated by Xgen from: E110.05.02 SIR 110237 on: 2008-06-30 11:08 */
/*******************************************************************************
* 2008 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntFlxCntrTrdSprn.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Flexible Contract Trade Separation
*
*******************************************************************************/

#ifndef _ENTFLXCNTRTRDSPRN_HXX_
#define _ENTFLXCNTRTRDSPRN_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_ENT_FLX_CNTR_TRD_SPRN_GRP_MAX        20
#define BSC_ENT_FLX_CNTR_TRD_SPRN_REC_MAX        20

/******************************************************************************/

#ifndef _BSC_ENT_FLX_CNTR_TRD_SPRN_GRP_T_
#define _BSC_ENT_FLX_CNTR_TRD_SPRN_GRP_T_

typedef struct bscEntFlxCntrTrdSprnGrpTag
{
    char             trnLngQty       [DRIV_QUANTITY_LEN];
    char             trnShtQty       [DRIV_QUANTITY_LEN];
    txtGrpT          txtGrp;
} bscEntFlxCntrTrdSprnGrpT, *pBscEntFlxCntrTrdSprnGrpT;

#endif  /* _BSC_ENT_FLX_CNTR_TRD_SPRN_GRP_T_ */

/******************************************************************************/

#ifndef _BSC_ENT_FLX_CNTR_TRD_SPRN_REQUEST_T_
#define _BSC_ENT_FLX_CNTR_TRD_SPRN_REQUEST_T_

typedef struct bscEntFlxCntrTrdSprnRequestTag
{
    trdrIdGrpT       trdrIdGrp;
    flxCntrTrnIdGrpT flxCntrTrnIdGrp;
    char             buyCod;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscEntFlxCntrTrdSprnGrpT bscEntFlxCntrTrdSprnGrp [BSC_ENT_FLX_CNTR_TRD_SPRN_GRP_MAX];
} bscEntFlxCntrTrdSprnRequestT, *pBscEntFlxCntrTrdSprnRequestT;

#endif  /* _BSC_ENT_FLX_CNTR_TRD_SPRN_REQUEST_T_ */

/******************************************************************************/

#ifndef _ENT_FLX_CNTR_TRD_SPRN_REQUEST_T_
#define _ENT_FLX_CNTR_TRD_SPRN_REQUEST_T_

typedef struct entFlxCntrTrdSprnRequestTag
{
    dataHeaderT      header;
    bscEntFlxCntrTrdSprnRequestT basic;
} entFlxCntrTrdSprnRequestT, *pEntFlxCntrTrdSprnRequestT;

#endif  /* _ENT_FLX_CNTR_TRD_SPRN_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_ENT_FLX_CNTR_TRD_SPRN_REC_T_
#define _BSC_ENT_FLX_CNTR_TRD_SPRN_REC_T_

typedef struct bscEntFlxCntrTrdSprnRecTag
{
    char             trnIdSfxNo      [TRN_ID_SFX_NO_LEN];
} bscEntFlxCntrTrdSprnRecT, *pBscEntFlxCntrTrdSprnRecT;

#endif  /* _BSC_ENT_FLX_CNTR_TRD_SPRN_REC_T_ */

/******************************************************************************/

#ifndef _BSC_ENT_FLX_CNTR_TRD_SPRN_RESPONSE_T_
#define _BSC_ENT_FLX_CNTR_TRD_SPRN_RESPONSE_T_

typedef struct bscEntFlxCntrTrdSprnResponseTag
{
    char             flxCntrTrnIdNo  [FLX_CNTR_TRN_ID_NO_LEN];
    char             buyCod;
    char             flxCntrSynProdId [PROD_ID_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscEntFlxCntrTrdSprnRecT bscEntFlxCntrTrdSprnRec [BSC_ENT_FLX_CNTR_TRD_SPRN_REC_MAX];
} bscEntFlxCntrTrdSprnResponseT, *pBscEntFlxCntrTrdSprnResponseT;

#endif  /* _BSC_ENT_FLX_CNTR_TRD_SPRN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _ENT_FLX_CNTR_TRD_SPRN_RESPONSE_T_
#define _ENT_FLX_CNTR_TRD_SPRN_RESPONSE_T_

typedef struct entFlxCntrTrdSprnResponseTag
{
    dataHeaderT      header;
    bscEntFlxCntrTrdSprnResponseT basic;
} entFlxCntrTrdSprnResponseT, *pEntFlxCntrTrdSprnResponseT;

#endif  /* _ENT_FLX_CNTR_TRD_SPRN_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTFLXCNTRTRDSPRN_HXX_ */

/******************************************************************************/
/* End of file EntFlxCntrTrdSprn.hxx */
/******************************************************************************/