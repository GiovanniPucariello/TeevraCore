/* Generated by Xgen from: E61.02.00 on: 2003-03-12 16:09 */
/*******************************************************************************
* 2003 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   ModUsrSecuProf.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _MODUSRSECUPROF_HXX_
#define _MODUSRSECUPROF_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define BSC_MOD_USR_SECU_PROF_REC_MAX	350

/******************************************************************************/

#ifndef _BSC_MOD_USR_SECU_PROF_REQUEST_T_
#define _BSC_MOD_USR_SECU_PROF_REQUEST_T_

typedef struct bscModUsrSecuProfRequestTag
{
  trdrIdGrpT trdrIdGrp;
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} bscModUsrSecuProfRequestT, *pBscModUsrSecuProfRequestT;


#endif  /* _BSC_MOD_USR_SECU_PROF_REQUEST_T_ */

/******************************************************************************/

#ifndef _EXT_MOD_USR_SECU_PROF_REQUEST_T_
#define _EXT_MOD_USR_SECU_PROF_REQUEST_T_

typedef struct extModUsrSecuProfRequestTag
{
  char rsrcAccLvlNo[RSRC_ACC_LVL_NO_LEN];
} extModUsrSecuProfRequestT, *pExtModUsrSecuProfRequestT;


#endif  /* _EXT_MOD_USR_SECU_PROF_REQUEST_T_ */

/******************************************************************************/

#ifndef _MOD_USR_SECU_PROF_REQUEST_T_
#define _MOD_USR_SECU_PROF_REQUEST_T_

typedef struct modUsrSecuProfRequestTag
{
  dataHeaderT header;
  bscModUsrSecuProfRequestT basic;
  extModUsrSecuProfRequestT extension;
} modUsrSecuProfRequestT, *pModUsrSecuProfRequestT;


#endif  /* _MOD_USR_SECU_PROF_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_MOD_USR_SECU_PROF_REC_T_
#define _BSC_MOD_USR_SECU_PROF_REC_T_

typedef struct bscModUsrSecuProfRecTag
{
  char rtnCod[RTN_COD_LEN];
} bscModUsrSecuProfRecT, *pBscModUsrSecuProfRecT;


#endif  /* _BSC_MOD_USR_SECU_PROF_REC_T_ */

/******************************************************************************/

#ifndef _BSC_MOD_USR_SECU_PROF_RESPONSE_T_
#define _BSC_MOD_USR_SECU_PROF_RESPONSE_T_

typedef struct bscModUsrSecuProfResponseTag
{
  bscModUsrSecuProfRecT bscModUsrSecuProfRec[BSC_MOD_USR_SECU_PROF_REC_MAX];
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} bscModUsrSecuProfResponseT, *pBscModUsrSecuProfResponseT;


#endif  /* _BSC_MOD_USR_SECU_PROF_RESPONSE_T_ */

/******************************************************************************/

#ifndef _MOD_USR_SECU_PROF_RESPONSE_T_
#define _MOD_USR_SECU_PROF_RESPONSE_T_

typedef struct modUsrSecuProfResponseTag
{
  dataHeaderT header;
  bscModUsrSecuProfResponseT basic;
} modUsrSecuProfResponseT, *pModUsrSecuProfResponseT;


#endif  /* _MOD_USR_SECU_PROF_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _MODUSRSECUPROF_HXX_ */

/******************************************************************************/
/* End of file ModUsrSecuProf.hxx */
/******************************************************************************/
