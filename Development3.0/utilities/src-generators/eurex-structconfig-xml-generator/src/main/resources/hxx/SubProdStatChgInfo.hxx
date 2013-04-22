/* Generated by Xgen from: E80.03.04 on: 2005-03-07 13:11 */
/*******************************************************************************
* 2005 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   SubProdStatChgInfo.hxx
*
*  DESCRIPTION: Layouts used for
*               Subscribe Product State Change Information
*
*******************************************************************************/

#ifndef _SUBPRODSTATCHGINFO_HXX_
#define _SUBPRODSTATCHGINFO_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>


/******************************************************************************/

#ifndef _BSC_SUB_PROD_STAT_CHG_INFO_PUB_BCAST_T_
#define _BSC_SUB_PROD_STAT_CHG_INFO_PUB_BCAST_T_

typedef struct bscSubProdStatChgInfoPubBcastTag
{
  char prodId[PROD_ID_LEN];
  char prcsStsValCod[PRCS_STS_VAL_COD_LEN];
} bscSubProdStatChgInfoPubBcastT, *pBscSubProdStatChgInfoPubBcastT;


#endif  /* _BSC_SUB_PROD_STAT_CHG_INFO_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _SUB_PROD_STAT_CHG_INFO_PUB_BCAST_T_
#define _SUB_PROD_STAT_CHG_INFO_PUB_BCAST_T_

typedef struct subProdStatChgInfoPubBcastTag
{
  dataHeaderT header;
  bscSubProdStatChgInfoPubBcastT basic;
} subProdStatChgInfoPubBcastT, *pSubProdStatChgInfoPubBcastT;


#endif  /* _SUB_PROD_STAT_CHG_INFO_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _BSC_SUB_PROD_STAT_CHG_INFO_SUBJECT_T_
#define _BSC_SUB_PROD_STAT_CHG_INFO_SUBJECT_T_

typedef struct bscSubProdStatChgInfoSubjectTag
{
  char prodId[PROD_ID_LEN];
} bscSubProdStatChgInfoSubjectT, *pBscSubProdStatChgInfoSubjectT;


#endif  /* _BSC_SUB_PROD_STAT_CHG_INFO_SUBJECT_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _SUBPRODSTATCHGINFO_HXX_ */

/******************************************************************************/
/* End of file SubProdStatChgInfo.hxx */
/******************************************************************************/