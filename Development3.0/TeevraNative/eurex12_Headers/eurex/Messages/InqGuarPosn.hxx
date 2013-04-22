/* Generated by Xgen from: E110.07.01 SIR 110523 on: 2008-07-24 10:23 */
/*******************************************************************************
* 2008 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqGuarPosn.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Guarantee Position
*
*******************************************************************************/

#ifndef _INQGUARPOSN_HXX_
#define _INQGUARPOSN_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define EXT_INQ_GUAR_POSN_REC_MAX                27

/******************************************************************************/

#ifndef _BSC_INQ_GUAR_POSN_REQUEST_T_
#define _BSC_INQ_GUAR_POSN_REQUEST_T_

typedef struct bscInqGuarPosnRequestTag
{
    char             guaId           [DRIV_GUA_ID_LEN];
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             asstPurpCod;
} bscInqGuarPosnRequestT, *pBscInqGuarPosnRequestT;

#endif  /* _BSC_INQ_GUAR_POSN_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_GUAR_POSN_REQUEST_T_
#define _INQ_GUAR_POSN_REQUEST_T_

typedef struct inqGuarPosnRequestTag
{
    dataHeaderT      header;
    bscInqGuarPosnRequestT basic;
} inqGuarPosnRequestT, *pInqGuarPosnRequestT;

#endif  /* _INQ_GUAR_POSN_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_GUAR_POSN_RESPONSE_T_
#define _BSC_INQ_GUAR_POSN_RESPONSE_T_

typedef struct bscInqGuarPosnResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
} bscInqGuarPosnResponseT, *pBscInqGuarPosnResponseT;

#endif  /* _BSC_INQ_GUAR_POSN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _EXT_INQ_GUAR_POSN_REC_T_
#define _EXT_INQ_GUAR_POSN_REC_T_

typedef struct extInqGuarPosnRecTag
{
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    char             guarNo          [DRIV_GUAR_NO_LEN];
    char             guaId           [DRIV_GUA_ID_LEN];
    char             guarBegDat      [DRIV_DATE_LEN];
    char             guarExpDat      [DRIV_DATE_LEN];
    char             guarGrsAmnt     [GUAR_GRS_AMNT];
    char             guarCollAmnt    [GUAR_COLL_AMNT];
    char             guarText        [GUAR_TEXT_LEN];
    char             gtorEvalPcnt    [GTOR_EVAL_PCNT_LEN];
    char             asstPurpCod;
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} extInqGuarPosnRecT, *pExtInqGuarPosnRecT;

#endif  /* _EXT_INQ_GUAR_POSN_REC_T_ */

/******************************************************************************/

#ifndef _EXT_INQ_GUAR_POSN_RESPONSE_T_
#define _EXT_INQ_GUAR_POSN_RESPONSE_T_

typedef struct extInqGuarPosnResponseTag
{
    extInqGuarPosnRecT extInqGuarPosnRec [EXT_INQ_GUAR_POSN_REC_MAX];
} extInqGuarPosnResponseT, *pExtInqGuarPosnResponseT;

#endif  /* _EXT_INQ_GUAR_POSN_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_GUAR_POSN_RESPONSE_T_
#define _INQ_GUAR_POSN_RESPONSE_T_

typedef struct inqGuarPosnResponseTag
{
    dataHeaderT      header;
    bscInqGuarPosnResponseT basic;
    extInqGuarPosnResponseT extension;
} inqGuarPosnResponseT, *pInqGuarPosnResponseT;

#endif  /* _INQ_GUAR_POSN_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQGUARPOSN_HXX_ */

/******************************************************************************/
/* End of file InqGuarPosn.hxx */
/******************************************************************************/