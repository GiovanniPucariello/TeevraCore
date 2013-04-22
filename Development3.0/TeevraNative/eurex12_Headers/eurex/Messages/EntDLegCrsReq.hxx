/* Generated by Xgen from: E80.03.04 on: 2005-03-07 13:11 */
/*******************************************************************************
* 2005 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntDLegCrsReq.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Double Leg Cross Request
*
*******************************************************************************/

#ifndef _ENTDLEGCRSREQ_HXX_
#define _ENTDLEGCRSREQ_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>


/******************************************************************************/

#ifndef _FUT_BSC_ENT_D_LEG_CRS_REQ_REQUEST_T_
#define _FUT_BSC_ENT_D_LEG_CRS_REQ_REQUEST_T_

typedef struct futBscEntDLegCrsReqRequestTag
{
  char buyCod;
  futCntrIdGrpT futCntrIdGrp;
  char dblLegTyp[DBL_LEG_TYP_LEN];
  futCntrId2GrpT futCntrId2Grp;
  trdrIdGrpT trdrIdGrp;
  char ordrQty[DRIV_VOLUME_LEN];
} futBscEntDLegCrsReqRequestT, *pFutBscEntDLegCrsReqRequestT;


#endif  /* _FUT_BSC_ENT_D_LEG_CRS_REQ_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_D_LEG_CRS_REQ_REQUEST_T_
#define _FUT_ENT_D_LEG_CRS_REQ_REQUEST_T_

typedef struct futEntDLegCrsReqRequestTag
{
  dataHeaderT header;
  futBscEntDLegCrsReqRequestT basic;
} futEntDLegCrsReqRequestT, *pFutEntDLegCrsReqRequestT;


#endif  /* _FUT_ENT_D_LEG_CRS_REQ_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_ENT_D_LEG_CRS_REQ_RESPONSE_T_
#define _FUT_ENT_D_LEG_CRS_REQ_RESPONSE_T_

typedef struct futEntDLegCrsReqResponseTag
{
  dataHeaderT header;
} futEntDLegCrsReqResponseT, *pFutEntDLegCrsReqResponseT;


#endif  /* _FUT_ENT_D_LEG_CRS_REQ_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTDLEGCRSREQ_HXX_ */

/******************************************************************************/
/* End of file EntDLegCrsReq.hxx */
/******************************************************************************/