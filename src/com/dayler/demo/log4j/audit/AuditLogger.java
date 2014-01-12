/**
 * 
 */
package com.dayler.demo.log4j.audit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

/**
 * @author asalazar
 *
 */
public class AuditLogger {

    private static String FQCN =  "com.dayler.demo.log4j.audit.AuditLogger";

    public static void debug(String userId, String activity, String activityDetail) {
        MDC.put("user_id", userId);
        MDC.put("activity", activity);
        Logger.getLogger(AuditLogger.class.getName()).log(FQCN, Level.DEBUG, activityDetail, null);
        MDC.clear();
    }
}
