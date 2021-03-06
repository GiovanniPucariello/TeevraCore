/* Generated by Xgen from: E61.02.00 on: 2003-03-12 16:09 */
/*******************************************************************************
* 2003 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqDelvBon.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _INQDELVBON_HXX_
#define _INQDELVBON_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define FUT_BSC_INQ_DELV_BON_GRP_MAX	100
#define FUT_BSC_INQ_DELV_BON_REC_MAX	19
#define FUT_EXT_INQ_DELV_BON_REC_MAX	19

/******************************************************************************/

#ifndef _FUT_BSC_INQ_DELV_BON_REQUEST_T_
#define _FUT_BSC_INQ_DELV_BON_REQUEST_T_

typedef struct futBscInqDelvBonRequestTag
{
  futCntrIdGrpT futCntrIdGrp[FUT_BSC_INQ_DELV_BON_GRP_MAX];
  char mliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN];
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
} futBscInqDelvBonRequestT, *pFutBscInqDelvBonRequestT;


#endif  /* _FUT_BSC_INQ_DELV_BON_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_DELV_BON_REQUEST_T_
#define _FUT_INQ_DELV_BON_REQUEST_T_

typedef struct futInqDelvBonRequestTag
{
  dataHeaderT header;
  futBscInqDelvBonRequestT basic;
} futInqDelvBonRequestT, *pFutInqDelvBonRequestT;


#endif  /* _FUT_INQ_DELV_BON_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_DELV_BON_REC_T_
#define _FUT_BSC_INQ_DELV_BON_REC_T_

typedef struct futBscInqDelvBonRecTag
{
  futCntrIdGrpT futCntrIdGrp;
  char isinCod[ISIN_COD_LEN];
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} futBscInqDelvBonRecT, *pFutBscInqDelvBonRecT;


#endif  /* _FUT_BSC_INQ_DELV_BON_REC_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_DELV_BON_RESPONSE_T_
#define _FUT_BSC_INQ_DELV_BON_RESPONSE_T_

typedef struct futBscInqDelvBonResponseTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
  char mliRecCtr[DRIV_MLI_REC_CTR_LEN];
  futBscInqDelvBonRecT futBscInqDelvBonRec[FUT_BSC_INQ_DELV_BON_REC_MAX];
} futBscInqDelvBonResponseT, *pFutBscInqDelvBonResponseT;


#endif  /* _FUT_BSC_INQ_DELV_BON_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_DELV_BON_REC_T_
#define _FUT_EXT_INQ_DELV_BON_REC_T_

typedef struct futExtInqDelvBonRecTag
{
  char secuNam[DRIV_SECU_NAM_LEN];
  char cpnRat[DRIV_CPN_RAT_LEN];
  char matuDat[DRIV_DATE_LEN];
  char lstCpnDat[DRIV_DATE_LEN];
  char nxtCpnDat[DRIV_DATE_LEN];
  char convFctrMtd[DRIV_CONV_FCTR_MTD_LEN];
  char convFact[CONV_FACT_LEN];
  char ctdInd;
} futExtInqDelvBonRecT, *pFutExtInqDelvBonRecT;


#endif  /* _FUT_EXT_INQ_DELV_BON_REC_T_ */

/******************************************************************************/

#ifndef _FUT_EXT_INQ_DELV_BON_RESPONSE_T_
#define _FUT_EXT_INQ_DELV_BON_RESPONSE_T_

typedef struct futExtInqDelvBonResponseTag
{
  futExtInqDelvBonRecT futExtInqDelvBonRec[FUT_EXT_INQ_DELV_BON_REC_MAX];
} futExtInqDelvBonResponseT, *pFutExtInqDelvBonResponseT;


#endif  /* _FUT_EXT_INQ_DELV_BON_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_DELV_BON_RESPONSE_T_
#define _FUT_INQ_DELV_BON_RESPONSE_T_

typedef struct futInqDelvBonResponseTag
{
  dataHeaderT header;
  futBscInqDelvBonResponseT basic;
  futExtInqDelvBonResponseT extension;
} futInqDelvBonResponseT, *pFutInqDelvBonResponseT;


#endif  /* _FUT_INQ_DELV_BON_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQDELVBON_HXX_ */

/******************************************************************************/
/* End of file InqDelvBon.hxx */
/******************************************************************************/
