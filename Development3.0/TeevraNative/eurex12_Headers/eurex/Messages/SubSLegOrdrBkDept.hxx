/* Generated by Xgen from: SIR18977 on: 2002-05-23 13:36 */
/*******************************************************************************
* 2002 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   SubSLegOrdrBkDept.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _SUBSLEGORDRBKDEPT_HXX_
#define _SUBSLEGORDRBKDEPT_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define BST_ORDR_GRP_MAX	10

/******************************************************************************/

#ifndef _FUT_BSC_SUB_S_LEG_ORDR_BK_DEPT_PUB_BCAST_T_
#define _FUT_BSC_SUB_S_LEG_ORDR_BK_DEPT_PUB_BCAST_T_

typedef struct futBscSubSLegOrdrBkDeptPubBcastTag
{
  bstOrdrGrpT bstOrdrGrp[BST_ORDR_GRP_MAX];
} futBscSubSLegOrdrBkDeptPubBcastT, *pFutBscSubSLegOrdrBkDeptPubBcastT;


#endif  /* _FUT_BSC_SUB_S_LEG_ORDR_BK_DEPT_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_SUB_S_LEG_ORDR_BK_DEPT_PUB_BCAST_T_
#define _FUT_SUB_S_LEG_ORDR_BK_DEPT_PUB_BCAST_T_

typedef struct futSubSLegOrdrBkDeptPubBcastTag
{
  dataHeaderT header;
  futBscSubSLegOrdrBkDeptPubBcastT basic;
} futSubSLegOrdrBkDeptPubBcastT, *pFutSubSLegOrdrBkDeptPubBcastT;


#endif  /* _FUT_SUB_S_LEG_ORDR_BK_DEPT_PUB_BCAST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_SUB_S_LEG_ORDR_BK_DEPT_SUBJECT_T_
#define _FUT_BSC_SUB_S_LEG_ORDR_BK_DEPT_SUBJECT_T_

typedef struct futBscSubSLegOrdrBkDeptSubjectTag
{
  char prodId[PROD_ID_LEN];
  char cntrExpYrDat[CNTR_EXP_YR_DAT_LEN];
  char cntrExpMthDat[CNTR_EXP_MTH_DAT_LEN];
  char subjFill[SUBJ_FILL_LEN];
} futBscSubSLegOrdrBkDeptSubjectT, *pFutBscSubSLegOrdrBkDeptSubjectT;


#endif  /* _FUT_BSC_SUB_S_LEG_ORDR_BK_DEPT_SUBJECT_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _SUBSLEGORDRBKDEPT_HXX_ */

/******************************************************************************/
/* End of file SubSLegOrdrBkDept.hxx */
/******************************************************************************/
