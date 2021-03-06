/* Generated by Xgen from: E130.23.01 SIR 153900 on: 2010-04-29 10:15 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   AcptPosnMembTsf.hxx
*
*  DESCRIPTION: Layouts used for
*               Accept Position Member Transfer
*
*******************************************************************************/

#ifndef _ACPTPOSNMEMBTSF_HXX_
#define _ACPTPOSNMEMBTSF_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_ACPT_POSN_MEMB_TSF_REQUEST_T_
#define _BSC_ACPT_POSN_MEMB_TSF_REQUEST_T_

typedef struct bscAcptPosnMembTsfRequestTag
{
    char             trnIdNo         [TRN_ID_NO_LEN];
    char             posTrnTyp       [POS_TRN_TYP_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
    char             confCodMembExchIdTo;
    char             confCodMembClgIdTo;
    char             confCodMembClgIdFrom;
    char             password        [DRIV_LOGIN_MAX_PWDID];
    trdrIdGrpApprT   trdrIdGrpAppr;
    char             posnTsfMode;
} bscAcptPosnMembTsfRequestT, *pBscAcptPosnMembTsfRequestT;

#endif  /* _BSC_ACPT_POSN_MEMB_TSF_REQUEST_T_ */

/******************************************************************************/

#ifndef _ACPT_POSN_MEMB_TSF_REQUEST_T_
#define _ACPT_POSN_MEMB_TSF_REQUEST_T_

typedef struct acptPosnMembTsfRequestTag
{
    dataHeaderT      header;
    bscAcptPosnMembTsfRequestT basic;
} acptPosnMembTsfRequestT, *pAcptPosnMembTsfRequestT;

#endif  /* _ACPT_POSN_MEMB_TSF_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_ACPT_POSN_MEMB_TSF_RESPONSE_T_
#define _BSC_ACPT_POSN_MEMB_TSF_RESPONSE_T_

typedef struct bscAcptPosnMembTsfResponseTag
{
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscAcptPosnMembTsfResponseT, *pBscAcptPosnMembTsfResponseT;

#endif  /* _BSC_ACPT_POSN_MEMB_TSF_RESPONSE_T_ */

/******************************************************************************/

#ifndef _EXT_ACPT_POSN_MEMB_TSF_RESPONSE_T_
#define _EXT_ACPT_POSN_MEMB_TSF_RESPONSE_T_

typedef struct extAcptPosnMembTsfResponseTag
{
    char             confCodMembClgIdFrom;
    char             confCodMembExchIdFrom;
    char             confCodMembClgIdTo;
    char             confCodMembExchIdTo;
} extAcptPosnMembTsfResponseT, *pExtAcptPosnMembTsfResponseT;

#endif  /* _EXT_ACPT_POSN_MEMB_TSF_RESPONSE_T_ */

/******************************************************************************/

#ifndef _ACPT_POSN_MEMB_TSF_RESPONSE_T_
#define _ACPT_POSN_MEMB_TSF_RESPONSE_T_

typedef struct acptPosnMembTsfResponseTag
{
    dataHeaderT      header;
    bscAcptPosnMembTsfResponseT basic;
    extAcptPosnMembTsfResponseT extension;
} acptPosnMembTsfResponseT, *pAcptPosnMembTsfResponseT;

#endif  /* _ACPT_POSN_MEMB_TSF_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ACPTPOSNMEMBTSF_HXX_ */

/******************************************************************************/
/* End of file AcptPosnMembTsf.hxx */
/******************************************************************************/
