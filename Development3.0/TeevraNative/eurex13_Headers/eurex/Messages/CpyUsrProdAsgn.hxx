/* Generated by Xgen from: E61.05.00 on: 2003-06-26 11:11 */
/*******************************************************************************
* 2003 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   CpyUsrProdAsgn.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _CPYUSRPRODASGN_HXX_
#define _CPYUSRPRODASGN_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>


/******************************************************************************/

#ifndef _BSC_CPY_USR_PROD_ASGN_REQUEST_T_
#define _BSC_CPY_USR_PROD_ASGN_REQUEST_T_

typedef struct bscCpyUsrProdAsgnRequestTag
{
  trdrIdGrpFromT trdrIdGrpFrom;
  trdrIdGrpT trdrIdGrp;
} bscCpyUsrProdAsgnRequestT, *pBscCpyUsrProdAsgnRequestT;


#endif  /* _BSC_CPY_USR_PROD_ASGN_REQUEST_T_ */

/******************************************************************************/

#ifndef _CPY_USR_PROD_ASGN_REQUEST_T_
#define _CPY_USR_PROD_ASGN_REQUEST_T_

typedef struct cpyUsrProdAsgnRequestTag
{
  dataHeaderT header;
  bscCpyUsrProdAsgnRequestT basic;
} cpyUsrProdAsgnRequestT, *pCpyUsrProdAsgnRequestT;


#endif  /* _CPY_USR_PROD_ASGN_REQUEST_T_ */

/******************************************************************************/

#ifndef _CPY_USR_PROD_ASGN_RESPONSE_T_
#define _CPY_USR_PROD_ASGN_RESPONSE_T_

typedef struct cpyUsrProdAsgnResponseTag
{
  dataHeaderT header;
} cpyUsrProdAsgnResponseT, *pCpyUsrProdAsgnResponseT;


#endif  /* _CPY_USR_PROD_ASGN_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _CPYUSRPRODASGN_HXX_ */

/******************************************************************************/
/* End of file CpyUsrProdAsgn.hxx */
/******************************************************************************/
