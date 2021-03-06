/* Generated by Xgen from: E61.02.00 on: 2003-03-12 16:09 */
/*******************************************************************************
* 2003 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   AppVolTrd.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _APPVOLTRD_HXX_
#define _APPVOLTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>


/******************************************************************************/

#ifndef _FUT_BSC_APP_VOL_TRD_REQUEST_T_
#define _FUT_BSC_APP_VOL_TRD_REQUEST_T_

typedef struct futBscAppVolTrdRequestTag
{
  char buyCod;
  char prodId[PROD_ID_LEN];
  char trnIdNo[TRN_ID_NO_LEN];
  trdrIdGrpT trdrIdGrp;
  char opnClsCod;
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} futBscAppVolTrdRequestT, *pFutBscAppVolTrdRequestT;


#endif  /* _FUT_BSC_APP_VOL_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_APP_VOL_TRD_REQUEST_T_
#define _FUT_EXT_APP_VOL_TRD_REQUEST_T_

typedef struct futExtAppVolTrdRequestTag
{
  acctTypCodGrpT acctTypCodGrp;
  txtGrpT txtGrp;
  char membClgIdCod[MEMB_CLG_ID_COD_LEN];
} futExtAppVolTrdRequestT, *pFutExtAppVolTrdRequestT;


#endif  /* _FUT_EXT_APP_VOL_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_APP_VOL_TRD_REQUEST_T_
#define _FUT_APP_VOL_TRD_REQUEST_T_

typedef struct futAppVolTrdRequestTag
{
  dataHeaderT header;
  futBscAppVolTrdRequestT basic;
  futExtAppVolTrdRequestT extension;
} futAppVolTrdRequestT, *pFutAppVolTrdRequestT;


#endif  /* _FUT_APP_VOL_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_APP_VOL_TRD_RESPONSE_T_
#define _FUT_BSC_APP_VOL_TRD_RESPONSE_T_

typedef struct futBscAppVolTrdResponseTag
{
  char trdNo[TRD_NO_LEN];
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} futBscAppVolTrdResponseT, *pFutBscAppVolTrdResponseT;


#endif  /* _FUT_BSC_APP_VOL_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_APP_VOL_TRD_RESPONSE_T_
#define _FUT_APP_VOL_TRD_RESPONSE_T_

typedef struct futAppVolTrdResponseTag
{
  dataHeaderT header;
  futBscAppVolTrdResponseT basic;
} futAppVolTrdResponseT, *pFutAppVolTrdResponseT;


#endif  /* _FUT_APP_VOL_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _APPVOLTRD_HXX_ */

/******************************************************************************/
/* End of file AppVolTrd.hxx */
/******************************************************************************/
