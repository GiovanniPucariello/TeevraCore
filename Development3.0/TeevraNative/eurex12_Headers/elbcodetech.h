/*######################################################################
#                                                                      #
#               Copyright (c) 1997, 1998, 1999 by                      #
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
#   Deutsche Boerse AG.                                                #
#                                                                      #
########################################################################*/

/****************************************************************************
*
*
*  DESCRIPTION: elbcodetech.h 
*               contains definition of technical completion codes 
*
*
*  MODIFICATION HISTORY:
*
*    DATE      PROG.
*  DD-MMM-YYYY INIT. SIR    MODIFICATION DESCRIPTION
*  ----------- ----- ------ -------------------------------------------------
*  04-JUN-1998 AB      7685 created
*  22-FEB-1999 AB    X06521 change request 221 redesign (binary compatible)
*  24-FEB-1999 AB    X06521 change request 221 (error code mapping)
*  29-MAR-1999 AB    E00987 packed b/c data
*  29-SEP-1999 PPK   E02159 message plausi checks
*  18-OCT-1999 CH    E01841 OsaTextMode tech tags
*  01-DEC-1999 CH    E02924 create unique define identifier
*  17-APR-2000 AB    X07613 detection of GATE unavailability
*  27-MAR-2001 RS    E12811 adaptations to GALAXY replacement
*
* DATE        PROG.
* DD-MMM-YYYY INIT.   SIR    MODIFICATION DESCRIPTION
* ----------- ------- ------ -------------------------------------------------
* 02-APR-2004 DANNOLA  25541 check effective userId on Solaris
*****************************************************************************/

#ifndef _GATE_ELBCODETECH_H_
#define _GATE_ELBCODETECH_H_

#define ELB_TECH_OK                                0     /* ELB_OK */  
#define ELB_TECH_ASSERTION_FAILED	           1     /* ELB_ASSERTION_FAILED */
#define ELB_TECH_STARTUP_SUCCESS	           2     /* ELB_STARTUP_SUCCESS */
#define ELB_TECH_SYSTEM_CALL_FAILED                10    /* ELB_SYSTEM_CALL_FAILED */
#define ELB_TECH_INVALID_REQUEST_ID	           12    /* ELB_INVALID_REQUEST_ID */
#define ELB_TECH_INVALID_MSG_TYPE	           13    /* ELB_INVALID_MSG_TYPE */
#define ELB_TECH_INSUFFICIENT_MEMORY	           14    /* ELB_INSUFFICIENT_MEMORY */
#define ELB_TECH_INVALID_VERSION	           15    /* ELB_INVALID_VERSION */
#define ELB_TECH_NOT_INITIALIZED	           16    /* ELB_NOT_INITIALIZED */
#define ELB_TECH_INVALID_OPERATION	           18    /* ELB_INVALID_OPERATION */
#define ELB_TECH_CHANNEL_CLOSED	                   19    /* ELB_CHANNEL_CLOSED */
#define ELB_TECH_LISTENING_CHANNEL_CLOSED	   20    /* ELB_LISTENING_CHANNEL_CLOSED */
#define ELB_TECH_OUTPUT_QUEUE_LIMIT_REACHED	   21    /* ELB_OUTPUT_QUEUE_LIMT_REACHED */
#define ELB_TECH_INVALID_PARAMETER                 23    /* ELB_INVALID_PARAMETER */
#define ELB_TECH_PGM_CALL_ERROR	                   24    /* ELB_PGM_CALL_ERROR */
#define ELB_TECH_INVALID_CONNECTION_ID	           25    /* ELB_INVALID_CONNECTION_ID */
#define ELB_TECH_INVALID_SEQ_NO	                   26    /* ELB_INVALID_SEQ_NO */
#define ELB_TECH_CHANNEL_NOT_ESTABLISHED	   27    /* ELB_CHANNEL_NOT_ESTABLISHED */
#define ELB_TECH_UNKNOWN_SUBSCRIPTION_ID	   28    /* ELB_UNKNOWN_SUBSCRIPTION_ID */
#define ELB_TECH_CANNOT_DELIVER_BROADCAST	   29    /* ELB_CANNOT_DELIVER_BROADCAST */
#define ELB_TECH_REPEATED_CONNECT	           30    /* ELB_REPEATED_CONNECT */
#define ELB_TECH_CREATE_CHILD_FAILED	           31    /* ELB_CREATE_CHILD_FAILED */
#define ELB_TECH_GETTIME_ERR	                   35    /* ELB_GETTIME_ERR */
#define ELB_TECH_INVALID_MSG_BODY_LENGTH	   37    /* ELB_INVALID_MSG_BODY_LENGTH */
#define ELB_TECH_CONNECTION_LIMIT_REACHED	   38	 /* ELB_CONNECTION_LIMIT_REACHED */
#define ELB_TECH_WRITE_IS_ASYNCHRONOUS	           42    /* ELB_WRITE_IS_ASYNCHRONOUS */
#define ELB_TECH_CREATE_OPEN	                   43    /* ELB_CREATE_OPEN */
#define ELB_TECH_OSAIPC_READ_ERR	           44    /* ELB_OSAIPC_READ_ERR */
#define ELB_TECH_OSAIPC_WRITE_ERR	           45    /* ELB_OSAIPC_WRITE_ERR */
#define ELB_TECH_CREATE_LISTEN	                   46    /* ELB_CREATE_LISTEN */
#define ELB_TECH_MESSAGE_TOO_LONG	           47    /* ELB_MESSAGE_TOO_LONG */
#define ELB_TECH_INVALID_MSG_LENGTH                48    
#define ELB_TECH_EMPTY_LISTEN	                   49    /* ELB_EMPTY_LISTEN */
#define ELB_TECH_INVALID_EFFECTIVE_USER	           59    /* ELB_INVALID_EFFECTIVE_USER */
#define ELB_TECH_INVALID_USER	                   60    /* ELB_INVALID_USER */
#define ELB_TECH_INVALID_PASSWORD	           61    /* ELB_INVALID_PASSWORD */
#define ELB_TECH_INVALID_DOMAIN	                   62    /* ELB_INVALID_DOMAIN */
#define ELB_TECH_INTERNAL_ERROR                    63    /* ELB_INTERNAL_ERROR */
#define ELB_TECH_BADLY_FORMED_PARAMETER	           64    /* ELB_BADLY_FORMED_PARAMETER */
#define ELB_TECH_UNKNOWN_HOST	                   65    /* ELB_UNKNOWN_HOST */
#define ELB_TECH_INVALID_USER_OR_PASSWORD	   69    /* ELB_INVALID_USER_OR_PASSWORD */
#define ELB_TECH_INTERNAL_MEMORY_PROBLEM	   70    /* ELB_INTERNAL_MEMORY_PROBLEM */
#define ELB_TECH_INVALID_CONFIG_ENTRY	           71    /* ELB_INVALID_CONFIG_ENTRY */
#define ELB_TECH_EOF	                           72    /* ELB_EOF */
#define ELB_TECH_TRUNCATED	                   73    /* ELB_TRUNCATED */
#define ELB_TECH_INVALID_FILE_TYPE	           74    /* ELB_INVALID_FILE_TYPE */
#define ELB_TECH_CANNOT_OPEN_FILE	           75    /* ELB_CANNOT_OPEN_FILE */
#define ELB_TECH_INVALID_CONFIG_ENTRY_LENGTH	   76    /* ELB_INVALID_CONFIG_ENTRY_LENGTH */
#define ELB_TECH_REQUEST_READ_FAILED	           77    /* ELB_REQUEST_READ_FAILED */
#define ELB_TECH_REQUEST_WRITE_FAILED	           78    /* ELB_REQUEST_WRITE_FAILED */
#define ELB_TECH_REQUEST_FSEEK_FAILED	           79    /* ELB_REQUEST_FSEEK_FAILED */
#define ELB_TECH_REQUEST_FLUSH_FAILED	           81    /* ELB_REQUEST_FLUSH_FAILED */
#define ELB_TECH_INVALID_RECORD_SIZE	           82    /* ELB_INVALID_RECORD_SIZE */
#define ELB_TECH_BUFFER_NOT_AVAILABLE	           83    /* ELB_BUFFER_NOT_AVAILABLE */
#define ELB_TECH_ARCH_STARTUP_COMPLETE	           90    /* ELB_ARCH_STARTUP_COMPLETE */
#define ELB_TECH_ARCH_STARTUP_TIMEOUT	           91    /* ELB_ARCH_STARTUP_TIMEOUT */
#define ELB_TECH_TECHSRVC_NOT_AVAILABLE            92    /* ELB_ARCH_SHUTDOWN */
#define ELB_TECH_ARCH_SHUTDOWN_REQUEST	           93    /* ELB_ARCH_SHUTDOWN_REQUEST */
#define ELB_TECH_ARCH_PROCESS_LOST	           94    /* ELB_ARCH_PROCESS_LOST */
#define ELB_TECH_START_PROCESS	                   95    /* ELB_START_PROCESS */
#define ELB_TECH_ENFORCE_TERMINATION	           97    /* ELB_ENFORCE_TERMINATION */
#define ELB_TECH_XERVICE_SHUTDOWN_REQUEST	   98    /* ELB_XERVICE_SHUTDOWN_REQUEST */
#define ELB_TECH_XERVICE_AVAILABLE                 119   /* ELB_XETRA_STARTUP */
#define ELB_TECH_XERVICE_NOT_AVAILABLE             120   /* ELB_XETRA_SHUTDOWN */
#define ELB_TECH_INVALID_ENVIRONMENT_VALUE	   201   /* ELB_INVALID_ENVIRONMENT_VALUE */
#define ELB_TECH_SEND_ERR	                   210   /* ELB_SEND_ERR */
#define ELB_TECH_RECEIVE_ERR	                   211   /* ELB_RECEIVE_ERR */
#define ELB_TECH_SEND_TO	                   212   /* ELB_SEND_TO */
#define ELB_TECH_RECEIVE_TO	                   213   /* ELB_RECEIVE_TO */
#define ELB_TECH_SYNC_SOCK_ERR	                   214   /* ELB_SYNC_SOCK_ERR */
#define ELB_TECH_SYNC_CONNECT_ERR	           215   /* ELB_SYNC_CONNECT_ERR */
#define ELB_TECH_ALREADY_CONNECTED                 220   /* ELB_CONNECT_ERR */
#define ELB_TECH_NOT_LOGGED_IN                     221   /* ELB_LOGOUT_ERR */
#define ELB_TECH_NOT_CONNECTED                     222   /* ELB_NOTCONN_ERR */
#define ELB_TECH_ALRLOG_ERR                        223   /* ELB_TECH_ALRLOG_ERR */  
#define ELB_TECH_NOT_SUBSCRIBED                    224   /* ELB_NOTSUBS_ERR */
#define ELB_TECH_STILLOG_ERR                       226   /* ELB_STILLOG_ERR */
#define ELB_TECH_LOGGED_OUT                        228   /* ELB_LOGGED_OUT */
#define ELB_TECH_SUBSCRIPTION_DELETED              229   /* ELB_UNSUBSCRIBED_WAR */
#define ELB_TECH_TOO_MANY_PENDING_REQUESTS         230   /* ELB_ASYNC_QUEUE_FULL */
#define ELB_TECH_MSG_DISCARDED                     231   /* ELB_MSG_DISCARDED */
#define ELB_TECH_SYNC_SEQ_DISC                     232   /* ELB_SYNC_SEQ_DISC */
#define ELB_TECH_PENDING_REQUEST_DELETED           233   /* ELB_PENDREQDEL_WAR */
#define ELB_TECH_WRONG_CF_LENGTH	           301   /* ELB_WRONG_CF_LENGTH */
#define ELB_TECH_NOT_ENOUGH_ARGUMENTS	           303   /* ELB_NOT_ENOUGH_ARGUMENTS */
#define ELB_TECH_CHECKSUM_NOT_OK	           305   /* ELB_CHECKSUM_NOT_OK */
#define ELB_TECH_PACKING_ERROR	                   307   /* ELB_PACKING_ERROR */
#define ELB_TECH_NO_CONNECTION	                   310   /* ELB_NO_CONNECTION */
#define ELB_TECH_INVALID_WSID	                   401   /* ELB_INVALID_WSID */
#define ELB_TECH_INVALID_HOST_ID	           402   /* ELB_INVALID_HOST_ID */
#define ELB_TECH_DUPLICATE_WS	                   404   /* ELB_DUPLICATE_WS */
#define ELB_TECH_WS_NOT_IN_MEMORY	           405   /* ELB_WS_NOT_IN_MEMORY */
#define ELB_TECH_WS_NOT_IN_CONFIG_FILE	           406   /* ELB_WS_NOT_IN_CONFIG_FILE */
#define ELB_TECH_INVALID_WSID_LENGTH	           408   /* ELB_INVALID_WSID_LENGTH */
#define ELB_TECH_NOT_ON_WS	                   423   /* ELB_NOT_ON_WS */
#define ELB_TECH_NO_MISS_IN_CONFIG_FILE	           424   /* ELB_NO_MISS_IN_CONFIG_FILE */
#define ELB_TECH_NO_WS_IN_CONFIG_FILE	           425   /* ELB_NO_WS_IN_CONFIG_FILE */
#define ELB_TECH_NO_HOST_ID_IN_CONFIG_FILE	   426   /* ELB_NO_HOST_ID_IN_CONFIG_FILE */
#define ELB_TECH_INVALID_MISS_HOST_NAME	           432   /* ELB_INVALID_MISS_HOST_NAME */
#define ELB_TECH_INVALID_MISS_ID	           433   /* ELB_INVALID_MISS_ID */
#define ELB_TECH_INVALID_STATE	                   434   /* ELB_INVALID_STATE */
#define ELB_TECH_INVALID_BODY	                   435   /* ELB_INVALID_BODY */
#define ELB_TECH_UNKNOWN_CHANNEL	           436   /* ELB_UNKNOWN_CHANNEL */
#define ELB_TECH_INVALID_SLOT_NO	           437   /* ELB_INVALID_SLOT_NO */
#define ELB_TECH_WS_NOT_IN_WS_TABLE	           438   /* ELB_WS_NOT_IN_WS_TABLE */
#define ELB_TECH_NO_MISS_NAME_IN_CONFIG_FILE	   439   /* ELB_NO_MISS_NAME_IN_CONFIG_FILE */
#define ELB_TECH_NO_MISS_ID_IN_CONFIG_FILE	   440   /* ELB_NO_MISS_ID_IN_CONFIG_FILE */
#define ELB_TECH_NO_WS_NAME_IN_CONFIG_FILE	   441   /* ELB_NO_WS_NAME_IN_CONFIG_FILE */
#define ELB_TECH_NO_WS_ID_IN_CONFIG_FILE	   442   /* ELB_NO_WS_ID_IN_CONFIG_FILE */
#define ELB_TECH_COMPRESSION_FAILED	           473   /* ELB_COMPRESSION_FAILED */
#define ELB_TECH_DECOMPRESSION_FAILED	           474   /* ELB_DECOMPRESSION_FAILED */
#define ELB_TECH_ENCRYPTION_FAILED	           475   /* ELB_ENCRYPTION_FAILED */
#define ELB_TECH_DECRYPTION_FAILED	           476   /* ELB_DECRYPTION_FAILED */
#define ELB_TECH_MESSAGE_TOO_LONG_FOR_COMP_ENCR	   479   /* ELB_MESSAGE_TOO_LONG_FOR_COMP_ENCR */
#define ELB_TECH_MESSAGE_TOO_LONG_FOR_DECOMP_DECR  480   /* ELB_MESSAGE_TOO_LONG_FOR_DECOMP_DECR */
#define ELB_TECH_COMMAND_UNKNOWN	           502   /* ELB_COMMAND_UNKNOWN */
#define ELB_TECH_INVALID_XERVICE_ID	           503   /* ELB_INVALID_XERVICE_ID */
#define ELB_TECH_SEQ_NO_OVERFLOW	           600   /* ELB_SEQ_NO_OVERFLOW */
#define ELB_TECH_MESSAGE_NOT_STORED	           601   /* ELB_MESSAGE_NOT_STORED */
#define ELB_TECH_LIST_OVERFLOW	                   602   /* ELB_LIST_OVERFLOW */
#define ELB_TECH_OUT_OF_SEQUENCE	           603   /* ELB_OUT_OF_SEQUENCE */
#define ELB_TECH_TOOMANY_SUBSCRIPTIONS	           604   /* ELB_TOOMANY_SUBSCRIPTIONS */
#define ELB_TECH_MISS_INDEX_ERROR	           607   /* ELB_MISS_INDEX_ERROR */
#define ELB_TECH_LOST_MESSAGE_ERROR	           608   /* ELB_LOST_MESSAGE_ERROR */
#define ELB_TECH_BRT_NOT_AVAILABLE_YET             651   /* ELB_BRT_NOT_AVAILABLE_YET */
#define ELB_TECH_INVALID_COMPLETION_CODE	   810   /* ELB_INVALID_COMPLETION_CODE */

#define ELB_TECH_REQ_UNSUCCESSFUL                  5001
#define ELB_TECH_LOGIN_NUM_EXCEEDED                5002
#define ELB_TECH_BC_PACKET_SIZE_EXCEEDED           5003
#define ELB_TECH_LOGGED_IN                         5004
#define ELB_TECH_SUBSCRIBED                        5005
#define ELB_TECH_UNSUBSCRIBED                      5006
#define ELB_TECH_NONTRANSPARENT_FAILOVER           5007
#define ELB_TECH_ALREADY_SUBSCRIBED                5008
#define ELB_TECH_INVALID_STREAM_TYPE               5009
#define ELB_TECH_NO_STATUS_DATA                    5010
#define ELB_TECH_ARCH_SHUTDOWN	                   5012
#define ELB_TECH_MULTICAST_OFF                     5013
#define ELB_TECH_WRONG_DEFAULT_MCGROUP             5014
#define ELB_TECH_MCC_PROTOCOL_ERROR                5015
#define ELB_TECH_NO_LINEFEED_FOUND                 5016
#define ELB_TECH_INVALID_INPUT_CHARACTER           5017 
#define ELB_TECH_INCOMPLETE_RECORD                 5019
#define ELB_TECH_MULTICAST_ON                      5020
#define ELB_TECH_LOST_MONIDATA                     5021
#define ELB_TECH_NOT_REENTRANT                     5022
#define ELB_TECH_UNEXPECTED_EVENT                  5023

#define ELB_TECH_FATAL_GLUE_ERROR                  5024
#define ELB_TECH_CONNECTION_FAILED                 5025
#define ELB_TECH_CORRUPT_DATA                      5026
#define ELB_TECH_TIMEOUT                           5027
#define ELB_TECH_RECV_INCOMPLETE                   5028
#define ELB_TECH_NO_DATA                           5029
#define ELB_TECH_NO_BC_PRODUCER_CHANNEL            5030
#define ELB_TECH_NO_BC_CONSUMER_CHANNEL            5031           
#define ELB_TECH_MULTIPLE_DEFINED_MISS_ID          5032           
#define ELB_TECH_NOT_ON_MISS                       5033
#define ELB_TECH_LIMIT_EXCEEDED                    5034
#define ELB_TECH_WRITE_INCOMPLETE                  5035     

#endif
