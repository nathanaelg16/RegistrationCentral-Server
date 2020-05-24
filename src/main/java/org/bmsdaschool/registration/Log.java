/*
 * Copyright (c) 2018 Dept. of Physics, Andrews University - All Rights Reserved
 *
 * Unauthorized copying, modifying, or distribution of this file via any medium without
 * prior express written consent is strictly prohibited.
 *
 * Proprietary and confidential.
 *
 * Written by Nathanael Gutierrez <gutierrezn@andrews.edu>, 1/2018.
 */
package org.bmsdaschool.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.logging.*;

/**
 * Nathanael Gutierrez
 * March 18, 2017
 * TODO: Add description
 */

public class Log {
    static Logger logger;
    private static Handler fileHandler;
    private static boolean loggingEnabled = false; //Change this to TRUE to enable logging
    Formatter plainText;

    private Log() throws IOException {
        //instance the logger
        logger = Logger.getLogger(Log.class.getName());
        String timeStamp = new SimpleDateFormat("yyyyMMdd HHmmss").format(java.util.Calendar.getInstance().getTime());
        //instance the filehandler
        fileHandler = new FileHandler("." + timeStamp + ".log", true);
        //instance formatter, set formatting, and handler
        plainText = new SimpleFormatter();
        fileHandler.setFormatter(plainText);
        logger.addHandler(fileHandler);
    }

    public static void enableLogging() {
        loggingEnabled = true;
        Log.log("Logging enabled.");
    }

    public static void disableLogging() {
        loggingEnabled = false;
        Log.log("Logging disabled.");
    }

    public static boolean isLoggingEnabled() {
        return loggingEnabled;
    }

    private static Logger getLogger() {
        if (logger == null) {
            try {
                new Log();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return logger;
    }

    public static void log(Level level, String msg) {
        if (loggingEnabled) {
            getLogger().log(level, "{0}\n", msg);
        } else {
            System.out.println(level + " : " + msg);
        }
    }

    public static void log(String msg) {
        log(Level.INFO, msg);
    }

    public static void log(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        log(Level.SEVERE, "Exception caught: " + e.getMessage() + "\n" + sw.toString());
    }

    public static void close() {
        fileHandler.close();
    }

    public static void entering(String sourceClass, String sourceMethod) {
        if (loggingEnabled) {
            getLogger().entering(sourceClass, sourceMethod);
        }
    }

    public static void exiting(String sourceClass, String sourceMethod) {
        if (loggingEnabled) {
            getLogger().exiting(sourceClass, sourceMethod);
        }
    }
}