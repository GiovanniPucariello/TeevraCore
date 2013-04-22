/* Generated by Xgen from: E100.04.19 SIR 79062 on: 2007-05-15 09:20 */
/*******************************************************************************
* 2007 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DelAllQuo.hxx
*
*  DESCRIPTION: Layouts used for
*               Delete All Quotes
*
*******************************************************************************/

#ifndef _DELALLQUO_HXX_
#define _DELALLQUO_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_DEL_ALL_QUO_REQUEST_T_
#define _BSC_DEL_ALL_QUO_REQUEST_T_

typedef struct bscDelAllQuoRequestTag
{
    char             prodId          [PROD_ID_LEN];
    trdrIdGrpT       trdrIdGrp;
} bscDelAllQuoRequestT, *pBscDelAllQuoRequestT;

#endif  /* _BSC_DEL_ALL_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _DEL_ALL_QUO_REQUEST_T_
#define _DEL_ALL_QUO_REQUEST_T_

typedef struct delAllQuoRequestTag
{
    dataHeaderT      header;
    bscDelAllQuoRequestT basic;
} delAllQuoRequestT, *pDelAllQuoRequestT;

#endif  /* _DEL_ALL_QUO_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_DEL_ALL_QUO_RESPONSE_T_
#define _BSC_DEL_ALL_QUO_RESPONSE_T_

typedef struct bscDelAllQuoResponseTag
{
    char             delQuoSidCtr    [DEL_QUO_SID_CTR_LEN];
    char             lstEvntDat      [DRIV_DATE_LEN];
    char             lstEvntTim      [DRIV_TIME_LEN];
    char             lstEvntTrnId    [LST_EVNT_TRN_ID_LEN];
} bscDelAllQuoResponseT, *pBscDelAllQuoResponseT;

#endif  /* _BSC_DEL_ALL_QUO_RESPONSE_T_ */

/******************************************************************************/

#ifndef _DEL_ALL_QUO_RESPONSE_T_
#define _DEL_ALL_QUO_RESPONSE_T_

typedef struct delAllQuoResponseTag
{
    dataHeaderT      header;
    bscDelAllQuoResponseT basic;
} delAllQuoResponseT, *pDelAllQuoResponseT;

#endif  /* _DEL_ALL_QUO_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _DELALLQUO_HXX_ */

/******************************************************************************/
/* End of file DelAllQuo.hxx */
/******************************************************************************/