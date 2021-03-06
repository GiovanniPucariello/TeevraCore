/* Generated by Xgen from: E110.03.01 SIR 100944 on: 2008-02-27 10:13 */
/*******************************************************************************
* 2008 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   ModMembPermCsh.hxx
*
*  DESCRIPTION: Layouts used for
*               Modify Member Permanent Cash
*
*******************************************************************************/

#ifndef _MODMEMBPERMCSH_HXX_
#define _MODMEMBPERMCSH_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_MOD_MEMB_PERM_CSH_GRP_MAX            100
#define BSC_MOD_MEMB_PERM_CSH_REC_MAX            100

/******************************************************************************/

#ifndef _BSC_MOD_MEMB_PERM_CSH_GRP_T_
#define _BSC_MOD_MEMB_PERM_CSH_GRP_T_

typedef struct bscModMembPermCshGrpTag
{
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             permCshAmnt     [DRIV_AMOUNT_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscModMembPermCshGrpT, *pBscModMembPermCshGrpT;

#endif  /* _BSC_MOD_MEMB_PERM_CSH_GRP_T_ */

/******************************************************************************/

#ifndef _BSC_MOD_MEMB_PERM_CSH_REQUEST_T_
#define _BSC_MOD_MEMB_PERM_CSH_REQUEST_T_

typedef struct bscModMembPermCshRequestTag
{
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscModMembPermCshGrpT bscModMembPermCshGrp [BSC_MOD_MEMB_PERM_CSH_GRP_MAX];
} bscModMembPermCshRequestT, *pBscModMembPermCshRequestT;

#endif  /* _BSC_MOD_MEMB_PERM_CSH_REQUEST_T_ */

/******************************************************************************/

#ifndef _MOD_MEMB_PERM_CSH_REQUEST_T_
#define _MOD_MEMB_PERM_CSH_REQUEST_T_

typedef struct modMembPermCshRequestTag
{
    dataHeaderT      header;
    bscModMembPermCshRequestT basic;
} modMembPermCshRequestT, *pModMembPermCshRequestT;

#endif  /* _MOD_MEMB_PERM_CSH_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_MOD_MEMB_PERM_CSH_REC_T_
#define _BSC_MOD_MEMB_PERM_CSH_REC_T_

typedef struct bscModMembPermCshRecTag
{
    char             rtnCod          [RTN_COD_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscModMembPermCshRecT, *pBscModMembPermCshRecT;

#endif  /* _BSC_MOD_MEMB_PERM_CSH_REC_T_ */

/******************************************************************************/

#ifndef _BSC_MOD_MEMB_PERM_CSH_RESPONSE_T_
#define _BSC_MOD_MEMB_PERM_CSH_RESPONSE_T_

typedef struct bscModMembPermCshResponseTag
{
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscModMembPermCshRecT bscModMembPermCshRec [BSC_MOD_MEMB_PERM_CSH_REC_MAX];
} bscModMembPermCshResponseT, *pBscModMembPermCshResponseT;

#endif  /* _BSC_MOD_MEMB_PERM_CSH_RESPONSE_T_ */

/******************************************************************************/

#ifndef _MOD_MEMB_PERM_CSH_RESPONSE_T_
#define _MOD_MEMB_PERM_CSH_RESPONSE_T_

typedef struct modMembPermCshResponseTag
{
    dataHeaderT      header;
    bscModMembPermCshResponseT basic;
} modMembPermCshResponseT, *pModMembPermCshResponseT;

#endif  /* _MOD_MEMB_PERM_CSH_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _MODMEMBPERMCSH_HXX_ */

/******************************************************************************/
/* End of file ModMembPermCsh.hxx */
/******************************************************************************/
