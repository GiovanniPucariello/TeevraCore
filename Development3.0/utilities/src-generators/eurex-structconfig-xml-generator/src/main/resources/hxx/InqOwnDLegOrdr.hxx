/* Generated by Xgen from: E110.03.01 SIR 100944 on: 2008-02-27 10:13 */
/*******************************************************************************
* 2008 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqOwnDLegOrdr.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Own Double Leg Order
*
*******************************************************************************/

#ifndef _INQOWNDLEGORDR_HXX_
#define _INQOWNDLEGORDR_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define FUT_BSC_INQ_OWN_D_LEG_ORDR_GRP_MAX       78
#define FUT_BSC_INQ_OWN_D_LEG_ORDR_REC_MAX       10
#define FUT_EXT_INQ_OWN_D_LEG_ORDR_REC_MAX       10

/******************************************************************************/

#ifndef _FUT_BSC_INQ_OWN_D_LEG_ORDR_GRP_T_
#define _FUT_BSC_INQ_OWN_D_LEG_ORDR_GRP_T_

typedef struct futBscInqOwnDLegOrdrGrpTag
{
    futCntrIdGrpT    futCntrIdGrp;
    char             dblLegTyp       [DBL_LEG_TYP_LEN];
    futCntrId2GrpT   futCntrId2Grp;
} futBscInqOwnDLegOrdrGrpT, *pFutBscInqOwnDLegOrdrGrpT;

#endif  /* _FUT_BSC_INQ_OWN_D_LEG_ORDR_GRP_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_OWN_D_LEG_ORDR_REQUEST_T_
#define _FUT_BSC_INQ_OWN_D_LEG_ORDR_REQUEST_T_

typedef struct futBscInqOwnDLegOrdrRequestTag
{
    futBscInqOwnDLegOrdrGrpT futBscInqOwnDLegOrdrGrp [FUT_BSC_INQ_OWN_D_LEG_ORDR_GRP_MAX];
    char             buyCod;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    trdrIdGrpT       trdrIdGrp;
    char             userOrdrRef     [USER_ORDR_REF_LEN];
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} futBscInqOwnDLegOrdrRequestT, *pFutBscInqOwnDLegOrdrRequestT;

#endif  /* _FUT_BSC_INQ_OWN_D_LEG_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_OWN_D_LEG_ORDR_REQUEST_T_
#define _FUT_INQ_OWN_D_LEG_ORDR_REQUEST_T_

typedef struct futInqOwnDLegOrdrRequestTag
{
    dataHeaderT      header;
    futBscInqOwnDLegOrdrRequestT basic;
} futInqOwnDLegOrdrRequestT, *pFutInqOwnDLegOrdrRequestT;

#endif  /* _FUT_INQ_OWN_D_LEG_ORDR_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_OWN_D_LEG_ORDR_REC_T_
#define _FUT_BSC_INQ_OWN_D_LEG_ORDR_REC_T_

typedef struct futBscInqOwnDLegOrdrRecTag
{
    char             buyCod;
    futCntrIdGrpT    futCntrIdGrp;
    char             dblLegTyp       [DBL_LEG_TYP_LEN];
    futCntrId2GrpT   futCntrId2Grp;
    trdrIdGrpT       trdrIdGrp;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             ordrBkQty       [DRIV_VOLUME_LEN];
    char             ordrExeQty      [DRIV_VOLUME_LEN];
    char             ordrTotExeQty   [DRIV_VOLUME_LEN];
    char             ordrTotQty      [DRIV_VOLUME_LEN];
    char             ordrTypCod;
    char             ordrExePrc      [DRIV_PRICE_LEN];
    char             ordrExpDat      [DRIV_DATE_LEN];
    char             ordrSts;
    char             opnClsCod;
    char             ordrCreDat      [DRIV_DATE_LEN];
    char             ordrCreTim      [DRIV_TIME_LEN];
    char             ordrPrioDat     [DRIV_DATE_LEN];
    char             ordrPrioTim     [DRIV_TIME_LEN];
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
    char             membExchIdCodObo [MEMB_EXCH_ID_COD_OBO_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} futBscInqOwnDLegOrdrRecT, *pFutBscInqOwnDLegOrdrRecT;

#endif  /* _FUT_BSC_INQ_OWN_D_LEG_ORDR_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_OWN_D_LEG_ORDR_RESPONSE_T_
#define _FUT_BSC_INQ_OWN_D_LEG_ORDR_RESPONSE_T_

typedef struct futBscInqOwnDLegOrdrResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    futBscInqOwnDLegOrdrRecT futBscInqOwnDLegOrdrRec [FUT_BSC_INQ_OWN_D_LEG_ORDR_REC_MAX];
} futBscInqOwnDLegOrdrResponseT, *pFutBscInqOwnDLegOrdrResponseT;

#endif  /* _FUT_BSC_INQ_OWN_D_LEG_ORDR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_OWN_D_LEG_ORDR_REC_T_
#define _FUT_EXT_INQ_OWN_D_LEG_ORDR_REC_T_

typedef struct futExtInqOwnDLegOrdrRecTag
{
    acctTypCodGrpT   acctTypCodGrp;
    txtGrpT          txtGrp;
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    trdIdOboGrpT     trdIdOboGrp;
    char             ordrPersInd;
    char             userOrdrRef     [USER_ORDR_REF_LEN];
    char             etsSesId        [ETS_SES_ID_LEN];
} futExtInqOwnDLegOrdrRecT, *pFutExtInqOwnDLegOrdrRecT;

#endif  /* _FUT_EXT_INQ_OWN_D_LEG_ORDR_REC_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_OWN_D_LEG_ORDR_RESPONSE_T_
#define _FUT_EXT_INQ_OWN_D_LEG_ORDR_RESPONSE_T_

typedef struct futExtInqOwnDLegOrdrResponseTag
{
    futExtInqOwnDLegOrdrRecT futExtInqOwnDLegOrdrRec [FUT_EXT_INQ_OWN_D_LEG_ORDR_REC_MAX];
} futExtInqOwnDLegOrdrResponseT, *pFutExtInqOwnDLegOrdrResponseT;

#endif  /* _FUT_EXT_INQ_OWN_D_LEG_ORDR_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_OWN_D_LEG_ORDR_RESPONSE_T_
#define _FUT_INQ_OWN_D_LEG_ORDR_RESPONSE_T_

typedef struct futInqOwnDLegOrdrResponseTag
{
    dataHeaderT      header;
    futBscInqOwnDLegOrdrResponseT basic;
    futExtInqOwnDLegOrdrResponseT extension;
} futInqOwnDLegOrdrResponseT, *pFutInqOwnDLegOrdrResponseT;

#endif  /* _FUT_INQ_OWN_D_LEG_ORDR_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQOWNDLEGORDR_HXX_ */

/******************************************************************************/
/* End of file InqOwnDLegOrdr.hxx */
/******************************************************************************/