/*######################################################################
#                                                                      #
#                  Copyright (c) 1998 by            		       #
#          Deutsche Boerse AG, Frankfurt, Germany		       #
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
#   Boerse AG.                                  		       #
#                                                                      #
#   Deutsche Boerse AG assumes no responsibility for the use  or       #
#   reliability of its software on equipment which is not certified by #
#   Deutsche Boerse AG.        					       #
#                                                                      #
######################################################################## 

****************************************************************************
*
*  DESCRIPTION: exid.h
*               External xervice IDs.
*
*  MODIFICATION HISTORY:
*
*    DATE      PROG.
*  DD-MMM-YYYY INIT. SIR    MODIFICATION DESCRIPTION
*  ----------- ----- ------ -------------------------------------------------
*  19-JAN-1999 RS    X06407 Changed for common requirements.
*  09-FEB-1999 RS    E00475 Xervice specific software version concept.
*  26-OCT-1999 RS    E02159 CAQ Xervice for Xetra and Xetra WBAG.
*  01-DEC-1999 CH    E02924 create unique define identifier
*  30-MAR-2000 RS    X07573 Introduction of Xervice Classes.
*
* MODIFICATION HISTORY:
*
* DATE PROG.
* DD-MMM-YYYY INIT.   SIR    MODIFICATION DESCRIPTION
* ----------- ------- ------ -------------------------------------------------
* 27-MAR-2002 BRADAXE 18533  CCP introduction
* 11-JUN-2003 BRADAXE  25949 XEUS introduction
* 22-JAN-2004 BRADAXE  28196 remove obsolete GATE_SEC_XCLASS
* 01-AUG-2006 BRADAXE  59924 G35: USFE introduction
****************************************************************************/

#ifndef _GATE_EXID_H_
#define _GATE_EXID_H_

/* Xervice Definitions */

#define XETRA_XID                          6
#define XETRA_RETRANSMISSION_XID           7
#define XETRA_CAQ_XID                      9

#define EUREX_XID                          8
#define EUREX_RETRANSMISSION_XID          10

/*** SIR 59924 BEGIN */
#define USFE_XID                          12
#define USFE_RETRANSMISSION_XID           13
/*** SITR 59924 END */

#define XETRA_WBAG_XID                    15
#define XETRA_WBAG_RETRANSMISSION_XID     16
#define XETRA_WBAG_CAQ_XID                11

#define XEUS_XID                          22
#define XEUS_RETRANSMISSION_XID           23

/*** CCP_XID set to 88 ***/

#define MAX_XERVICE_ID           	 100

/* Xervice Class Definitions */

#define XETRA_TXN_XCLASS                1100
#define XETRA_RETRANSMISSION_XCLASS     1101
#define XETRA_CAQ_XCLASS                1102

#define EUREX_TXN_XCLASS                1200
#define EUREX_RETRANSMISSION_XCLASS     1201

/*** SIR 59924 BEGIN */
#define USFE_TXN_XCLASS                 1300
#define USFE_RETRANSMISSION_XCLASS      1301
/*** SITR 59924 END */

#define XEUS_TXN_XCLASS                 1400
#define XEUS_RETRANSMISSION_XCLASS      1401

#define CCP_TXN_XCLASS                  3000        

#endif
