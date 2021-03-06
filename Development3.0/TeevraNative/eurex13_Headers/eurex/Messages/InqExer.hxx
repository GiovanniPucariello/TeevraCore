/* Generated by Xgen from: E130.08.01 SIR 149794 on: 2010-02-12 15:07 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqExer.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire Exercise
*
*******************************************************************************/

#ifndef _INQEXER_HXX_
#define _INQEXER_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define OPT_BSC_INQ_EXER_GRP_MAX                 117
#define OPT_BSC_INQ_EXER_REC_MAX                 21
#define OPT_EXT_INQ_EXER_REC_MAX                 21

/******************************************************************************/

#ifndef _OPT_BSC_INQ_EXER_REQUEST_T_
#define _OPT_BSC_INQ_EXER_REQUEST_T_

typedef struct optBscInqExerRequestTag
{
    char             membClgIdCod    [MEMB_CLG_ID_COD_LEN];
    char             membExchIdCod   [MEMB_EXCH_ID_COD_LEN];
    acctTypCodGrpT   acctTypCodGrp;
    optCntrIdGrpT    optCntrIdGrp    [OPT_BSC_INQ_EXER_GRP_MAX];
    char             undrPrc         [DRIV_PRICE_LEN];
    char             mliCntrDataCtr  [MLI_CNTR_DATA_CTR_LEN];
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
} optBscInqExerRequestT, *pOptBscInqExerRequestT;

#endif  /* _OPT_BSC_INQ_EXER_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_EXER_REQUEST_T_
#define _OPT_EXT_INQ_EXER_REQUEST_T_

typedef struct optExtInqExerRequestTag
{
    char             exerCntrInd;
} optExtInqExerRequestT, *pOptExtInqExerRequestT;

#endif  /* _OPT_EXT_INQ_EXER_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_EXER_REQUEST_T_
#define _OPT_INQ_EXER_REQUEST_T_

typedef struct optInqExerRequestTag
{
    dataHeaderT      header;
    optBscInqExerRequestT basic;
    optExtInqExerRequestT extension;
} optInqExerRequestT, *pOptInqExerRequestT;

#endif  /* _OPT_INQ_EXER_REQUEST_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_EXER_REC_T_
#define _OPT_BSC_INQ_EXER_REC_T_

typedef struct optBscInqExerRecTag
{
    acctTypCodGrpT   acctTypCodGrp;
    optCntrIdGrpT    optCntrIdGrp;
    char             exerQty         [DRIV_QUANTITY_LEN];
    char             crtLngQty       [DRIV_QUANTITY_LEN];
    char             dsgnOpnLng      [DRIV_QUANTITY_LEN];
    char             trdUntNo        [TRD_UNT_NO_LEN];
    char             undrPrc         [DRIV_PRICE_LEN];
    char             undrPrcInd;
    char             undrDispDcml    [UNDR_DISP_DCML_LEN];
    char             itmPerUnt       [DRIV_AMOUNT_LEN];
} optBscInqExerRecT, *pOptBscInqExerRecT;

#endif  /* _OPT_BSC_INQ_EXER_REC_T_ */

/******************************************************************************/

#ifndef _OPT_BSC_INQ_EXER_RESPONSE_T_
#define _OPT_BSC_INQ_EXER_RESPONSE_T_

typedef struct optBscInqExerResponseTag
{
    char             keyDataCtrlBlk  [KEY_DATA_CTRL_BLK_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    optBscInqExerRecT optBscInqExerRec [OPT_BSC_INQ_EXER_REC_MAX];
} optBscInqExerResponseT, *pOptBscInqExerResponseT;

#endif  /* _OPT_BSC_INQ_EXER_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_EXER_REC_T_
#define _OPT_EXT_INQ_EXER_REC_T_

typedef struct optExtInqExerRecTag
{
    char             undrXetraPrc    [DRIV_PRICE_LEN];
    char             abdnQty         [DRIV_QUANTITY_LEN];
    char             unexerRsnCod;
} optExtInqExerRecT, *pOptExtInqExerRecT;

#endif  /* _OPT_EXT_INQ_EXER_REC_T_ */

/******************************************************************************/

#ifndef _OPT_EXT_INQ_EXER_RESPONSE_T_
#define _OPT_EXT_INQ_EXER_RESPONSE_T_

typedef struct optExtInqExerResponseTag
{
    optExtInqExerRecT optExtInqExerRec [OPT_EXT_INQ_EXER_REC_MAX];
} optExtInqExerResponseT, *pOptExtInqExerResponseT;

#endif  /* _OPT_EXT_INQ_EXER_RESPONSE_T_ */

/******************************************************************************/

#ifndef _OPT_INQ_EXER_RESPONSE_T_
#define _OPT_INQ_EXER_RESPONSE_T_

typedef struct optInqExerResponseTag
{
    dataHeaderT      header;
    optBscInqExerResponseT basic;
    optExtInqExerResponseT extension;
} optInqExerResponseT, *pOptInqExerResponseT;

#endif  /* _OPT_INQ_EXER_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQEXER_HXX_ */

/******************************************************************************/
/* End of file InqExer.hxx */
/******************************************************************************/
