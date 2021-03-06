/* Generated by Xgen from: E60_baseline on: 2002-02-12 17:59 */
/*******************************************************************************
* 2002 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqExchLis.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _INQEXCHLIS_HXX_
#define _INQEXCHLIS_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define BSC_INQ_EXCH_LIS_REC_MAX	500

/******************************************************************************/

#ifndef _BSC_INQ_EXCH_LIS_REQUEST_T_
#define _BSC_INQ_EXCH_LIS_REQUEST_T_

typedef struct bscInqExchLisRequestTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
} bscInqExchLisRequestT, *pBscInqExchLisRequestT;


#endif  /* _BSC_INQ_EXCH_LIS_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_EXCH_LIS_REQUEST_T_
#define _INQ_EXCH_LIS_REQUEST_T_

typedef struct inqExchLisRequestTag
{
  dataHeaderT header;
  bscInqExchLisRequestT basic;
} inqExchLisRequestT, *pInqExchLisRequestT;


#endif  /* _INQ_EXCH_LIS_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_EXCH_LIS_REC_T_
#define _BSC_INQ_EXCH_LIS_REC_T_

typedef struct bscInqExchLisRecTag
{
  char exchIdCod[DRIV_EXCH_ID_COD_LEN];
} bscInqExchLisRecT, *pBscInqExchLisRecT;


#endif  /* _BSC_INQ_EXCH_LIS_REC_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_EXCH_LIS_RESPONSE_T_
#define _BSC_INQ_EXCH_LIS_RESPONSE_T_

typedef struct bscInqExchLisResponseTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
  char mliRecCtr[DRIV_MLI_REC_CTR_LEN];
  bscInqExchLisRecT bscInqExchLisRec[BSC_INQ_EXCH_LIS_REC_MAX];
} bscInqExchLisResponseT, *pBscInqExchLisResponseT;


#endif  /* _BSC_INQ_EXCH_LIS_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_EXCH_LIS_RESPONSE_T_
#define _INQ_EXCH_LIS_RESPONSE_T_

typedef struct inqExchLisResponseTag
{
  dataHeaderT header;
  bscInqExchLisResponseT basic;
} inqExchLisResponseT, *pInqExchLisResponseT;


#endif  /* _INQ_EXCH_LIS_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQEXCHLIS_HXX_ */

/******************************************************************************/
/* End of file InqExchLis.hxx */
/******************************************************************************/
