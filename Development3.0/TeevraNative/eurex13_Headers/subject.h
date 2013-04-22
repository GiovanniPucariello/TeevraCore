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


************************************************************************
*
*
*  DESCRIPTION: subject.h 
*               Includes broadcast structures and constants
*
* Revision History:
*
* Date		Prog.Init.	SIR	Modification
* dd-mmm-yy				Description
* ----------------------------------------------------------------------
*
* 30-APR-97	Xetra Team		Version 1.0 
* 05-NOV-97     Xetra Team              Version 2.4
* 12-MAR-98	Xetra Team		Release 3
* 24-APR-98     Xetra Team              IBIS-R decomission
*
*  MODIFICATION HISTORY:
*
*    DATE      PROG.
*  DD-MMM-YYYY INIT. SIR    MODIFICATION DESCRIPTION
*  ----------- ----- ------ -------------------------------------------------
*  25-JAN-1999 AB    X06521 change request 221
*  22-FEB-1999 AB    X06521 change request 221 (binary compatible)
*  15-SEP-1999 CH    E02159 added gap subject
*  01-DEC-1999 CH    E02924 create unique define identifier
*************************************************************************/


#ifndef _GATE_SUBJECT_H_
#define _GATE_SUBJECT_H_

#if defined (__cplusplus) || defined (c_plusplus)
extern "C" {
#endif

#define SUBJECT_WILDCARD         '*'
#define SUBJECT_GAPINFO          "#GAPINFO"
#define SUBJECT_GAPINFO_VERSION   0

#if defined (__cplusplus) || defined (c_plusplus)
}
#endif

#endif /* _GATE_SUBJECT_H_ */
