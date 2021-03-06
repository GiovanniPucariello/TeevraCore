/* Generated by Xgen from: E61.02.00 on: 2003-03-12 16:09 */
/*******************************************************************************
* 2003 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntGivUpTrn.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _ENTGIVUPTRN_HXX_
#define _ENTGIVUPTRN_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>


/******************************************************************************/

#ifndef _FUT_BSC_ENT_GIV_UP_TRN_REQUEST_T_
#define _FUT_BSC_ENT_GIV_UP_TRN_REQUEST_T_

typedef struct futBscEntGivUpTrnRequestTag
{
  char membClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN];
  char membExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN];
  futCntrIdGrpT futCntrIdGrp;
  char trnDat[DRIV_DATE_LEN];
  char ordrNo[DRIV_ORDR_NO_LEN];
  char trnIdNo[TRN_ID_NO_LEN];
  trnIdSfxKeyGrpT trnIdSfxKeyGrp;
  char buyCod;
  char membExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN];
  char opnClsCod;
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} futBscEntGivUpTrnRequestT, *pFutBscEntGivUpTrnRequestT;


#endif  /* _FUT_BSC_ENT_GIV_UP_TRN_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_ENT_GIV_UP_TRN_REQUEST_T_
#define _FUT_EXT_ENT_GIV_UP_TRN_REQUEST_T_

typedef struct futExtEntGivUpTrnRequestTag
{
  txtGrpToT txtGrpTo;
} futExtEntGivUpTrnRequestT, *pFutExtEntGivUpTrnRequestT;


#endif  /* _FUT_EXT_ENT_GIV_UP_TRN_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_GIV_UP_TRN_REQUEST_T_
#define _FUT_ENT_GIV_UP_TRN_REQUEST_T_

typedef struct futEntGivUpTrnRequestTag
{
  dataHeaderT header;
  futBscEntGivUpTrnRequestT basic;
  futExtEntGivUpTrnRequestT extension;
} futEntGivUpTrnRequestT, *pFutEntGivUpTrnRequestT;


#endif  /* _FUT_ENT_GIV_UP_TRN_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_ENT_GIV_UP_TRN_RESPONSE_T_
#define _FUT_BSC_ENT_GIV_UP_TRN_RESPONSE_T_

typedef struct futBscEntGivUpTrnResponseTag
{
  char gutSts;
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} futBscEntGivUpTrnResponseT, *pFutBscEntGivUpTrnResponseT;


#endif  /* _FUT_BSC_ENT_GIV_UP_TRN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_GIV_UP_TRN_RESPONSE_T_
#define _FUT_ENT_GIV_UP_TRN_RESPONSE_T_

typedef struct futEntGivUpTrnResponseTag
{
  dataHeaderT header;
  futBscEntGivUpTrnResponseT basic;
} futEntGivUpTrnResponseT, *pFutEntGivUpTrnResponseT;


#endif  /* _FUT_ENT_GIV_UP_TRN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_ENT_GIV_UP_TRN_REQUEST_T_
#define _OPT_BSC_ENT_GIV_UP_TRN_REQUEST_T_

typedef struct optBscEntGivUpTrnRequestTag
{
  char membClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN];
  char membExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN];
  optCntrIdGrpT optCntrIdGrp;
  char trnDat[DRIV_DATE_LEN];
  char ordrNo[DRIV_ORDR_NO_LEN];
  char trnIdNo[TRN_ID_NO_LEN];
  trnIdSfxKeyGrpT trnIdSfxKeyGrp;
  char buyCod;
  char membExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN];
  char opnClsCod;
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} optBscEntGivUpTrnRequestT, *pOptBscEntGivUpTrnRequestT;


#endif  /* _OPT_BSC_ENT_GIV_UP_TRN_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_ENT_GIV_UP_TRN_REQUEST_T_
#define _OPT_EXT_ENT_GIV_UP_TRN_REQUEST_T_

typedef struct optExtEntGivUpTrnRequestTag
{
  txtGrpToT txtGrpTo;
} optExtEntGivUpTrnRequestT, *pOptExtEntGivUpTrnRequestT;


#endif  /* _OPT_EXT_ENT_GIV_UP_TRN_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_ENT_GIV_UP_TRN_REQUEST_T_
#define _OPT_ENT_GIV_UP_TRN_REQUEST_T_

typedef struct optEntGivUpTrnRequestTag
{
  dataHeaderT header;
  optBscEntGivUpTrnRequestT basic;
  optExtEntGivUpTrnRequestT extension;
} optEntGivUpTrnRequestT, *pOptEntGivUpTrnRequestT;


#endif  /* _OPT_ENT_GIV_UP_TRN_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_ENT_GIV_UP_TRN_RESPONSE_T_
#define _OPT_BSC_ENT_GIV_UP_TRN_RESPONSE_T_

typedef struct optBscEntGivUpTrnResponseTag
{
  char gutSts;
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} optBscEntGivUpTrnResponseT, *pOptBscEntGivUpTrnResponseT;


#endif  /* _OPT_BSC_ENT_GIV_UP_TRN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_ENT_GIV_UP_TRN_RESPONSE_T_
#define _OPT_ENT_GIV_UP_TRN_RESPONSE_T_

typedef struct optEntGivUpTrnResponseTag
{
  dataHeaderT header;
  optBscEntGivUpTrnResponseT basic;
} optEntGivUpTrnResponseT, *pOptEntGivUpTrnResponseT;


#endif  /* _OPT_ENT_GIV_UP_TRN_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTGIVUPTRN_HXX_ */

/******************************************************************************/
/* End of file EntGivUpTrn.hxx */
/******************************************************************************/
