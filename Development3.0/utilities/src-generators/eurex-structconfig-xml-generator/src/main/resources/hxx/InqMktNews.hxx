/* Generated by Xgen from: E61.02.00 on: 2003-03-12 16:09 */
/*******************************************************************************
* 2003 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqMktNews.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _INQMKTNEWS_HXX_
#define _INQMKTNEWS_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>


/******************************************************************************/

#ifndef _BSC_INQ_MKT_NEWS_REQUEST_T_
#define _BSC_INQ_MKT_NEWS_REQUEST_T_

typedef struct bscInqMktNewsRequestTag
{
  char newsDat[DRIV_DATE_LEN];
  char newsTim[DRIV_TIME_LEN];
} bscInqMktNewsRequestT, *pBscInqMktNewsRequestT;


#endif  /* _BSC_INQ_MKT_NEWS_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_MKT_NEWS_REQUEST_T_
#define _INQ_MKT_NEWS_REQUEST_T_

typedef struct inqMktNewsRequestTag
{
  dataHeaderT header;
  bscInqMktNewsRequestT basic;
} inqMktNewsRequestT, *pInqMktNewsRequestT;


#endif  /* _INQ_MKT_NEWS_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_MKT_NEWS_RESPONSE_T_
#define _BSC_INQ_MKT_NEWS_RESPONSE_T_

typedef struct bscInqMktNewsResponseTag
{
  char msgShtText[MSG_SHT_TEXT_LEN];
  char newsDtl[DRIV_NEWS_DTL_LEN];
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} bscInqMktNewsResponseT, *pBscInqMktNewsResponseT;


#endif  /* _BSC_INQ_MKT_NEWS_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_MKT_NEWS_RESPONSE_T_
#define _INQ_MKT_NEWS_RESPONSE_T_

typedef struct inqMktNewsResponseTag
{
  dataHeaderT header;
  bscInqMktNewsResponseT basic;
} inqMktNewsResponseT, *pInqMktNewsResponseT;


#endif  /* _INQ_MKT_NEWS_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQMKTNEWS_HXX_ */

/******************************************************************************/
/* End of file InqMktNews.hxx */
/******************************************************************************/
