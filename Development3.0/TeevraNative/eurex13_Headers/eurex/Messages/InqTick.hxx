/* Generated by Xgen from: E60_baseline on: 2002-02-12 17:59 */
/*******************************************************************************
* 2002 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqTick.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _INQTICK_HXX_
#define _INQTICK_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define BSC_INQ_TICK_REC_MAX	14
#define EXT_INQ_TICK_REC_MAX	14
#define UNDR_ID_GRP_MAX	118

/******************************************************************************/

#ifndef _UNDR_ID_GRP_T_
#define _UNDR_ID_GRP_T_

typedef struct undrIdGrpTag
{
  char undrIsinCod[UNDR_ISIN_COD_LEN];
  char exchIdCod[DRIV_EXCH_ID_COD_LEN];
} undrIdGrpT, *pUndrIdGrpT;


#endif  /* _UNDR_ID_GRP_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_TICK_REQUEST_T_
#define _BSC_INQ_TICK_REQUEST_T_

typedef struct bscInqTickRequestTag
{
  undrIdGrpT undrIdGrp[UNDR_ID_GRP_MAX];
  char mliUndrDataCtr[MLI_UNDR_DATA_CTR_LEN];
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
} bscInqTickRequestT, *pBscInqTickRequestT;


#endif  /* _BSC_INQ_TICK_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_TICK_REQUEST_T_
#define _INQ_TICK_REQUEST_T_

typedef struct inqTickRequestTag
{
  dataHeaderT header;
  bscInqTickRequestT basic;
} inqTickRequestT, *pInqTickRequestT;


#endif  /* _INQ_TICK_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_TICK_REC_T_
#define _BSC_INQ_TICK_REC_T_

typedef struct bscInqTickRecTag
{
  char undrIsinCod[UNDR_ISIN_COD_LEN];
  char bstBidPrc[DRIV_PRICE_LEN];
  char bstAskPrc[DRIV_PRICE_LEN];
  char lstTrdPrc[DRIV_PRICE_LEN];
  char trnDat[DRIV_DATE_LEN];
  char trnTim[DRIV_TIME_LEN];
  char opnPrc[DRIV_PRICE_LEN];
  char clsPrc[DRIV_PRICE_LEN];
  char currTypCod[CURR_TYP_COD_LEN];
} bscInqTickRecT, *pBscInqTickRecT;


#endif  /* _BSC_INQ_TICK_REC_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_TICK_RESPONSE_T_
#define _BSC_INQ_TICK_RESPONSE_T_

typedef struct bscInqTickResponseTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
  bscInqTickRecT bscInqTickRec[BSC_INQ_TICK_REC_MAX];
} bscInqTickResponseT, *pBscInqTickResponseT;


#endif  /* _BSC_INQ_TICK_RESPONSE_T_ */

/******************************************************************************/

#ifndef _EXT_INQ_TICK_REC_T_
#define _EXT_INQ_TICK_REC_T_

typedef struct extInqTickRecTag
{
  char exchIdCod[DRIV_EXCH_ID_COD_LEN];
  char dlyHghPrc[DRIV_PRICE_LEN];
  char dlyLowPrc[DRIV_PRICE_LEN];
} extInqTickRecT, *pExtInqTickRecT;


#endif  /* _EXT_INQ_TICK_REC_T_ */

/******************************************************************************/

#ifndef _EXT_INQ_TICK_RESPONSE_T_
#define _EXT_INQ_TICK_RESPONSE_T_

typedef struct extInqTickResponseTag
{
  extInqTickRecT extInqTickRec[EXT_INQ_TICK_REC_MAX];
} extInqTickResponseT, *pExtInqTickResponseT;


#endif  /* _EXT_INQ_TICK_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_TICK_RESPONSE_T_
#define _INQ_TICK_RESPONSE_T_

typedef struct inqTickResponseTag
{
  dataHeaderT header;
  bscInqTickResponseT basic;
  extInqTickResponseT extension;
} inqTickResponseT, *pInqTickResponseT;


#endif  /* _INQ_TICK_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQTICK_HXX_ */

/******************************************************************************/
/* End of file InqTick.hxx */
/******************************************************************************/
