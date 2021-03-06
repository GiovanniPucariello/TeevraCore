/* Generated by Xgen from: E90.02.00 on: 2006-02-16 08:30 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   EntProdSubgrpAsgn.hxx
*
*  DESCRIPTION: Layouts used for
*               Enter Product Subgroup Assignment
*
*******************************************************************************/

#ifndef _ENTPRODSUBGRPASGN_HXX_
#define _ENTPRODSUBGRPASGN_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_ENT_PROD_SUBGRP_ASGN_REQUEST_T_
#define _BSC_ENT_PROD_SUBGRP_ASGN_REQUEST_T_

typedef struct bscEntProdSubgrpAsgnRequestTag
{
    char             partSubGrpCod   [PART_SUB_GRP_COD_LEN];
    prodAsgnGrpT     prodAsgnGrp;
} bscEntProdSubgrpAsgnRequestT, *pBscEntProdSubgrpAsgnRequestT;

#endif  /* _BSC_ENT_PROD_SUBGRP_ASGN_REQUEST_T_ */

/******************************************************************************/

#ifndef _ENT_PROD_SUBGRP_ASGN_REQUEST_T_
#define _ENT_PROD_SUBGRP_ASGN_REQUEST_T_

typedef struct entProdSubgrpAsgnRequestTag
{
    dataHeaderT      header;
    bscEntProdSubgrpAsgnRequestT basic;
} entProdSubgrpAsgnRequestT, *pEntProdSubgrpAsgnRequestT;

#endif  /* _ENT_PROD_SUBGRP_ASGN_REQUEST_T_ */

/******************************************************************************/

#ifndef _ENT_PROD_SUBGRP_ASGN_RESPONSE_T_
#define _ENT_PROD_SUBGRP_ASGN_RESPONSE_T_

typedef struct entProdSubgrpAsgnResponseTag
{
    dataHeaderT      header;
} entProdSubgrpAsgnResponseT, *pEntProdSubgrpAsgnResponseT;

#endif  /* _ENT_PROD_SUBGRP_ASGN_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ENTPRODSUBGRPASGN_HXX_ */

/******************************************************************************/
/* End of file EntProdSubgrpAsgn.hxx */
/******************************************************************************/
