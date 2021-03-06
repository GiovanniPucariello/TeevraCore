/* Generated by Xgen from: E130.23.01 SIR 153900 on: 2010-04-29 10:15 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqMembInfo.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Member Information
*
*******************************************************************************/

#ifndef _INQMEMBINFO_HXX_
#define _INQMEMBINFO_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_INQ_MEMB_INFO_CSH_REC_MAX            20
#define BSC_INQ_MEMB_INFO_GU_REC_MAX             2

/******************************************************************************/

#ifndef _BSC_INQ_MEMB_INFO_REQUEST_T_
#define _BSC_INQ_MEMB_INFO_REQUEST_T_

typedef struct bscInqMembInfoRequestTag
{
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
} bscInqMembInfoRequestT, *pBscInqMembInfoRequestT;

#endif  /* _BSC_INQ_MEMB_INFO_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_MEMB_INFO_REQUEST_T_
#define _INQ_MEMB_INFO_REQUEST_T_

typedef struct inqMembInfoRequestTag
{
    dataHeaderT      header;
    bscInqMembInfoRequestT basic;
} inqMembInfoRequestT, *pInqMembInfoRequestT;

#endif  /* _INQ_MEMB_INFO_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_MEMB_INFO_RESPONSE_T_
#define _BSC_INQ_MEMB_INFO_RESPONSE_T_

typedef struct bscInqMembInfoResponseTag
{
    char             clgMembCurrTypCod [DRIV_CLG_MEMB_CURR_TYP_COD_LEN];
    char             membExchAffilTypCod;
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             iseTrdAlwdInd;
    char             occClgAlwdInd;
    char             membExchLngNam  [DRIV_MEMB_EXCH_LNG_NAM_LEN];
    char             clgMembTypCod;
    char             membAwvCtry     [DRIV_MEMB_AWV_CTRY_LEN];
    trdClgGrpT       trdClgGrp;
    detlGrpT         detlGrp;
    char             cmpyCapCurrTypCod [DRIV_CMPY_CAP_CURR_TYP_COD_LEN];
    char             cmpyCapDat      [DRIV_DATE_LEN];
    char             cmpyCapAmnt     [DRIV_AMOUNT_LEN];
    char             clgHseTypCod;
    char             withStpCmpyCapInd;
    char             withStpMgnCollInd;
    char             withStpClgFunInd;
    givUpCtctGrpT    givUpCtctGrp    [BSC_INQ_MEMB_INFO_GU_REC_MAX];
    cshLimGrpT       cshLimGrp       [BSC_INQ_MEMB_INFO_CSH_REC_MAX];
} bscInqMembInfoResponseT, *pBscInqMembInfoResponseT;

#endif  /* _BSC_INQ_MEMB_INFO_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_MEMB_INFO_RESPONSE_T_
#define _INQ_MEMB_INFO_RESPONSE_T_

typedef struct inqMembInfoResponseTag
{
    dataHeaderT      header;
    bscInqMembInfoResponseT basic;
} inqMembInfoResponseT, *pInqMembInfoResponseT;

#endif  /* _INQ_MEMB_INFO_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQMEMBINFO_HXX_ */

/******************************************************************************/
/* End of file InqMembInfo.hxx */
/******************************************************************************/
