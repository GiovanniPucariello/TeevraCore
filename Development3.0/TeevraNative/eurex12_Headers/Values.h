/*######################################################################
#                                                                      #
#                  Copyright (c) 1998, 1999 by                         #
#          Deutsche Boerse AG, Frankfurt, Germany                      #
#                          All rights reserved.                        #
#                                                                      #
#   This software is furnished under a license and may be used and     #
#   copied  only  in accordance with the terms of such license and     #
#   with the  inclusion  of  the  above  copyright  notice.   This     #
#   software  or  any  other copies thereof may not be provided or     #
#   otherwise made available to any other person.  No title to and     #
#   ownership of the software is hereby transferred.                   #
#                                                                      #
#   The information in this software is subject to change  without     #
#   notice  and should not be construed as a commitment by Deutsche    #
#   Boerse AG.                                                         #
#                                                                      #
#   Deutsche Boerse AG assumes no responsibility for the use  or       #
#   reliability of its software on equipment which is not certified by #
#   Deutsche Boerse AG.        			                       #
#                                                                      #
######################################################################## 

************************************************************************
*
*
*  DESCRIPTION: Values.h 
*               Includes declarations of external VALUES API functions and 
*               types
*
* Revision History:
*
* Date		Prog.Init.	SIR	Modification
* dd-mmm-yy				Description
* ---------------------------------------------------------------------------
*
* 30-APR-97	Xetra Team		Version 1.0
* 13-AUG-97     Xetra Team              Version 2.0 
* 05-NOV-97     Xetra Team              Version 2.4
* 12-MAR-98	Xetra Team		Release 3
* 24-APR-98     Xetra Team              IBIS-R decomission
* 27-APR-98     Xetra Team              exid included
* 04-JUN-98     CommonArch Team 7685    Adapted to EUREX/CBOT requirements
*
*  MODIFICATION HISTORY:
*
*    DATE      PROG.
*  DD-MMM-YYYY INIT. SIR    MODIFICATION DESCRIPTION
*  ----------- ----- ------ -------------------------------------------------
*  21-JAN-1999 AB    E00298 version of the call interface.
*  25-JAN-1999 AB    X06521 change request 221
*  22-FEB-1999 AB    X06521 change request 221 (binary compatible)
*  03-MAR-1999 AB    X06647 compatibility layer
*  09-JUN-1999 AB    E02159 remove compatibility layer
*  01-DEC-1999 CH    E02924 create unique define identifier
*  31-MAR-2000 CH    X07573 added XerviceInfoT
*  17-APR-2000 AB    X07613 detection of GATE unavailability
*  02-NOV-2000 AB    E12391 changes due to subscription authorization
*
* DATE        PROG.
* DD-MMM-YYYY INIT.   SIR    MODIFICATION DESCRIPTION
* ----------- ------- ------ -------------------------------------------------
* 24-FEB-2003 BRADAXE  24884 get logout data
* 28-FEB-2003 BRADAXE  23995 resubmission defines added
*****************************************************************************/


#ifndef _GATE_VALUES_H_
#define _GATE_VALUES_H_

#if defined (__cplusplus) || defined (c_plusplus)
extern "C" {
#endif

#define ELB_MAX_STRING       256 /* Error text max length */


/*****************************************************************************
*	Includes
*****************************************************************************/

#include <subject.h>
#include <exid.h>

/*****************************************************************************
*	#Defines
*****************************************************************************/

#define CVN_011         "011"
#define CVN_012         "012"

#define PROCESS_NAME    "Appl:"

#define MAX_REQVER 	20	/* reqVer not longer than 20 chars in
				 * ReqCntrlT		 */
#define MAX_VCIVER 	20	/* VCIver not longer than 20 chars in
				 * ReqCntrlT		 */
#define MAX_COMPLT 	80	/* complText in StatusDataT not longer than
				 * 80 chars	 */

#define MAX_APPID 	40	/* dbApllID in LoginReqDataT/LogoutReqDataT
				 * not longer than 40 chars 	 */
				 
#define MAX_USRID      40	/* userId in VCI_Connect not longer 
				   than 40 chars */
#define MAX_PWDID       40      /* password in VCI_Connect not longer 
				   than 40 chars */

#define LOGIN_MAX_USERID 11
#define SUBS_MAX_USERID  11

#define MAX_APPDSCR 	40	/* appDescr not longer than 40 chars in
				 * ReqCntrlT	 */

#ifndef MAX_VMQNAM
#define MAX_VMQNAM	40	/* VMQname in CnctRespDataT not longer than
				 * 40 chars 	 */
#endif

#define MAX_PROC_NAME   (40 + MAX_USRID)

#define MAX_APPLID     4
#define MAX_DSCRNAME   40

#define VCI_AREA_PROD   'P'
#define VCI_AREA_SIM    'S'
#define VCI_AREA_DEV    'D'

#define RESUBMISSION_PROCESSED     0
#define RESUBMISSION_NOT_PROCESSED 1



/*****************************************************************************
*	Types
*****************************************************************************/


/* commonly used in all API calls: */


    typedef struct ReqCntrlT	/* Request control record 		 */
    {
	int             connectionID;
	int             dbApplID;
	char            appDescr[MAX_APPDSCR];
	int             reqID;
	int    		resubmitFlag;
	unsigned int    resubmitNo;
	char            VCIver[MAX_VCIVER];
        int             loginID;

    }   ReqCntrlT;


typedef struct brdSubject
{
    char    dummy[32];
}   BcastSubjectT;


    typedef struct		/* Callback data block record 		 */
    {
	int             	appRespBlockSize;
	void           		*appRespData;
	int			subsID;
        struct brdSubject       *subject;
	int             	appReqBlockSize;
	void           		*appReqData;
        int                     applVersion;
        int                     streamType;
        void                    *brcSubject;
	
    }   CallBkAppDataT;


/* Error Handling structure for external functions of VALUES API */

typedef enum
{
    VCI_FATAL=3,
    VCI_ERROR=2,
    VCI_WARNING=1,
    VCI_SUCCESS=0

}   SeverityClassT;


typedef struct
{
    SeverityClassT    complSeverity;
    int               complCode;
    char              complText[ELB_MAX_STRING];
    SeverityClassT    techComplSeverity;
    int               techComplCode;
    char              techComplText[ELB_MAX_STRING];

}   StatusDataT; 


/* App. Callback context data block record 	 */
typedef struct		
{
    int             custBlockSize;
    void           *custData;

}   AppCntxtDataT;


typedef void (AppCallbackT) ( ReqCntrlT*,
			      CallBkAppDataT*,
			      AppCntxtDataT*,
			      StatusDataT* );
    

/* used in VCI_Connect only: */

typedef struct		/* Connection request data block */
{
    char            userID[MAX_USRID];
    char            password[MAX_PWDID];
    
}   CnctReqDataT;

typedef struct		/* Connection response data block */
{
    int             connectionID;
    char            VMQname[MAX_VMQNAM];
    char            prodMode;

}   CnctRespDataT;



/* used in VCI_Disconnect only: */

typedef struct
{
    int             connectionID;

}   DiscnctReqDataT;

    /* Disconnection request data block */
    /* reserved, specify NULL */


/* used in VCI_Login only: */


/* Login request data block */
typedef struct
{
    char            userID[LOGIN_MAX_USERID];
    char            closure;
    int             applVersion;
    int             authorizationDataLength;
    void            *authorizationData;
}   LoginReqDataT;


typedef struct
{
    int             funcResult;
    int             loginID;

}   LoginRespDataT;

/* Connection response data block 	 */
/* reserved, specify NULL */


/* used in VCI_Logout only: */

typedef struct
{
    int     dataLength;
    void    *data;

}   LogoutReqDataT;
/* Logout request data block 	 */



typedef struct
{
    int             funcResult;

}   LogoutRespDataT;
/* Logout response data block 	 */
/* reserved, specify NULL */



/* used in VCI_Submit only: */

typedef struct		/* Submit request data block */
{
    int             appReqBlockSize;
    void           *appReq;
    
}   SubmitReqDataT;


/* used in VCI_Subscribe only:*/

typedef struct		/* Subscribe request data block */
{
    struct brdSubject    subsSubject;
    int                  applVersion;
    int                  streamType;
    int                  subjectLength;
    void                 *subject;
    char                 userID[SUBS_MAX_USERID];
    int                  authorizationDataLength;
    void                 *authorizationData;

}   SubsReqDataT;


typedef struct		/* Subscribe request data block */
{
    int             subsID;

}   SubsRespDataT;


/* used in VCI_Unsubscribe only: */

typedef struct		/* Unsubscribe request data block */
{
    int             subsID;
	
}   UnsubsReqDataT;


typedef struct
{
    void           *reserved;
	
}   UnsubsRespDataT;
    /* Unsubscribe response data block */
    /* reserved, specify NULL */

/* used for xervice connection notifications */

typedef struct
{
    int             applClass;
    int             applVersion;
    int             applPrevVersion;
    char            exchApplId[MAX_APPLID];
    char            exchDscrName[MAX_DSCRNAME];

}   XerviceInfoT;

/*****************************************************************************
*	Functions
*****************************************************************************/

/*****************************************************************************
*	Func: VCI_Connect
*	Desc: Initiates and performs linkage of the application with the
*              Technical Services
*
*
*****************************************************************************/

void VCI_Connect( ReqCntrlT     *reqControl,
                  CnctReqDataT  *reqData,
		  AppCallbackT  *callbackFunc,
	          AppCntxtDataT *callbackCntxtData,
	          CnctRespDataT *respData,
		  StatusDataT   *statusDataGlobal );




/*****************************************************************************
*	Func: VCI_Disconnect
*	Desc: Disconnect application from the Technical Services
*
*
*
*****************************************************************************/

void VCI_Disconnect( ReqCntrlT       *reqControl,
	             DiscnctReqDataT *reqData,
		     StatusDataT     *statusDataGlobal );



/*****************************************************************************
*	Func: VCI_Login
*	Desc: Login to backend system
*
*
*
*****************************************************************************/

void VCI_Login( ReqCntrlT      *reqControl,
	        LoginReqDataT  *reqData,
	        AppCallbackT   *callbackFunc,
	        AppCntxtDataT  *callbackCntxtData,
	        LoginRespDataT *respData,
	        StatusDataT    *statusDataGlobal );


/*****************************************************************************
*	Func: VCI_Logout
*	Desc: Logout from backend system
*
*
*
*****************************************************************************/

void VCI_Logout( ReqCntrlT       *reqControl,
                 LogoutReqDataT  *reqData,
	         LogoutRespDataT *respData,
	         StatusDataT     *statusDataGlobal );


/*****************************************************************************
*	Func: VCI_Submit
*	Desc:
*
*
*
*****************************************************************************/

void VCI_Submit( ReqCntrlT      *reqControl,
	         SubmitReqDataT *reqData,
	         AppCallbackT   *callbackFunc,
                 AppCntxtDataT  *callbackCntxtData,
	         StatusDataT    *statusDataGlobal );

/*****************************************************************************
*	Func: VCI_Dispatch
*	Desc:
*
*
*
*****************************************************************************/

void VCI_Dispatch( ReqCntrlT        *reqControl,
		   StatusDataT      *statusDataGlobal );


/*****************************************************************************
*	Func: VCI_Subscribe
*	Desc:
*
*
*
*****************************************************************************/

void VCI_Subscribe( ReqCntrlT     *reqControl,
		    SubsReqDataT  *reqData,
		    AppCallbackT  *callbackFunc,
	            AppCntxtDataT *callbackCntxtData,
	            SubsRespDataT *respData,
		    StatusDataT   *statusDataGlobal );

/*****************************************************************************
*	Func: VCI_Unsubscribe
*	Desc:
*
*
*
*****************************************************************************/

void VCI_Unsubscribe( ReqCntrlT       *reqControl,
		      UnsubsReqDataT  *reqData,
		      UnsubsRespDataT *respData,
		      StatusDataT     *statusDataGlobal );

#if defined (__cplusplus) || defined (c_plusplus)
}
#endif

#endif				/* _GATE_VALUES_H_ */
