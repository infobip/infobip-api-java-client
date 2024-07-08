package com.infobip.api.util;

public class ResponseStatuses {

    public static final int PENDING_STATUS_GROUP_ID = 1;
    public static final String PENDING_STATUS_GROUP_NAME = "PENDING";
    public static final int PENDING_STATUS_ID = 26;
    public static final int PENDING_WAITING_DELIVERY_ID = 3;
    public static final int PENDING_ENROUTE_ID = 7;
    public static final String PENDING_STATUS_NAME = "MESSAGE_ACCEPTED";
    public static final String PENDING_WAITING_DELIVERY_STATUS_NAME = "PENDING_WAITING_DELIVERY";
    public static final String PENDING_ENROUTE_STATUS_NAME = "PENDING_ENROUTE";
    public static final String PENDING_STATUS_DESCRIPTION = "Message sent to next instance";
    public static final String PENDING_WAITING_DELIVERY_STATUS_DESCRIPTION = "Message sent, waiting for delivery report";

    public static final int DELIVERED_STATUS_GROUP_ID = 3;
    public static final String DELIVERED_STATUS_GROUP_NAME = "DELIVERED";
    public static final int DELIVERED_STATUS_ID = 5;
    public static final String DELIVERED_STATUS_NAME = "DELIVERED_TO_HANDSET";
    public static final String DELIVERED_STATUS_DESCRIPTION = "Message delivered to handset";

    public static final int NO_ERROR_GROUP_ID = 0;
    public static final String NO_ERROR_GROUP_NAME = "OK";
    public static final int NO_ERROR_ID = 0;
    public static final String NO_ERROR_NAME = "NO_ERROR";
    public static final String NO_ERROR_DESCRIPTION = "No Error";
    public static final boolean NO_ERROR_IS_PERMANENT = false;

}
