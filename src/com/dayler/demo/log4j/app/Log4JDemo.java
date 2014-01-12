/**
 * 
 */
package com.dayler.demo.log4j.app;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.dayler.demo.log4j.audit.AuditLogger;

/**
 * @author asalazar
 *
 */
public class Log4JDemo {
    
    //private static final String LOG4J_XML = "classpath:conf/log4j.xml";
    private static final String LOG4J_XML = "conf/log4j.xml";

    private static Logger logger = Logger.getLogger(Log4JDemo.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("start log4j demo");

        InputStream s = Log4JDemo.class.getResourceAsStream(LOG4J_XML);

        if (s == null) {
            System.out.println("error");
        }

        // Setup log4j.
        DOMConfigurator.configure(LOG4J_XML);

        logger.debug("Here is some DEBUG");
        logger.info("Here is some INFO");
        logger.warn("Here is some WARN");
        logger.error("Here is some ERROR");
        logger.fatal("Here is some FATAL");

        // Audit feature
        Logger.getLogger(Log4JDemo.class).debug("Before audit");
        AuditLogger.debug("ashutosh","accesed", "User edit page");
        Logger.getLogger(Log4JDemo.class).debug("after audit");

        System.out.println("end log4j demo");
    }
}
