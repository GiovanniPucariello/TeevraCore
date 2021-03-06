/* Generated by Xgen from: E120.16.01 SIR 123595 on: 2009-04-29 10:47 */
/*******************************************************************************
* 2009 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DelMasQuo.hxx
*
*  DESCRIPTION: Layouts used for
*               Delete Mass Quote
*
*******************************************************************************/

#ifndef _DELMASQUO_HXX_
#define _DELMASQUO_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define OPT_BSC_DEL_MAS_QUO_GRP_MAX              82
#define OPT_BSC_DEL_MAS_QUO_REC_MAX              82

/******************************************************************************/

#ifndef _OPT_BSC_DEL_MAS_QUO_REQUEST_T_
#define _OPT_BSC_DEL_MAS_QUO_REQUEST_T_

typedef struct optBscDelMasQuoRequestTag
{
    trdrIdGrpT       trdrIdGrp;
    char             suppQuoConfInd;
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    optCntrIdGrpT    optCntrIdGrp    [OPT_BSC_DEL_MAS_QUO_GRP_MAX];
} optBscDelMasQuoRequestT, *pOptBscDelMasQuoRequestT;

#endif  /* _OPT_BSC_DEL_MAS_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_DEL_MAS_QUO_REQUEST_T_
#define _OPT_DEL_MAS_QUO_REQUEST_T_

typedef struct optDelMasQuoRequestTag
{
    dataHeaderT      header;
    optBscDelMasQuoRequestT basic;
} optDelMasQuoRequestT, *pOptDelMasQuoRequestT;

#endif  /* _OPT_DEL_MAS_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_DEL_MAS_QUO_REC_T_
#define _OPT_BSC_DEL_MAS_QUO_REC_T_

typedef struct optBscDelMasQuoRecTag
{
    char             rtnCod          [RTN_COD_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
} optBscDelMasQuoRecT, *pOptBscDelMasQuoRecT;

#endif  /* _OPT_BSC_DEL_MAS_QUO_REC_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_DEL_MAS_QUO_RESPONSE_T_
#define _OPT_BSC_DEL_MAS_QUO_RESPONSE_T_

typedef struct optBscDelMasQuoResponseTag
{
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    optBscDelMasQuoRecT optBscDelMasQuoRec [OPT_BSC_DEL_MAS_QUO_REC_MAX];
} optBscDelMasQuoResponseT, *pOptBscDelMasQuoResponseT;

#endif  /* _OPT_BSC_DEL_MAS_QUO_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_DEL_MAS_QUO_RESPONSE_T_
#define _OPT_DEL_MAS_QUO_RESPONSE_T_

typedef struct optDelMasQuoResponseTag
{
    dataHeaderT      header;
    optBscDelMasQuoResponseT basic;
} optDelMasQuoResponseT, *pOptDelMasQuoResponseT;

#endif  /* _OPT_DEL_MAS_QUO_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _DELMASQUO_HXX_ */

/******************************************************************************/
/* End of file DelMasQuo.hxx */
/******************************************************************************/
