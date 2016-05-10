package com.endlessblue.basic.base.util;

import org.apache.log4j.Logger;

/**
 * 系统日志处理公共类
 */
public class LogWriter {
    private static org.apache.log4j.Logger sLogger = null;
	static{
		init(org.apache.log4j.Logger.getLogger("MchntLogger"));
	}
    /**
     * 取得日志实例
     * @return
     */
    public static void init(Logger logger) {
    	sLogger = logger;
        //1、设置不额外输出，避免RootLogger重复输出应用系统的日�?
        if (sLogger != null) {
            sLogger.setAdditivity(false);
        }
        
        //2、初始化RootLogger，避免其它开源软件抛出log4j没有初始化的警告信息
        defaultInitial();
    }
    
    /**
     * 记录调试信息
     * 
     * @param aMsg
     *              调试信息
     */
    public static void debug(String aMsg) {
        if (sLogger == null)
            defaultInitial();
        sLogger.debug(aMsg);
    }
    
    /**
     * 记录调试信息
     * 
     * @param aObject
     *              调试对象
     * @param aMsg
     *              调试信息
     */
    public static void debug(Object aObject, String aMsg) {
        if (sLogger == null)
            defaultInitial();
        sLogger.debug("[" + aObject.getClass().getName() + "]:" + aMsg);
    }
    
    /**
     * 记录调试信息
     * 
     * @param aObject
     *              调试对象
     * @param aMsg
     *              调试信息
     */
    public static void debug(Object aObject, Throwable aThrowable) {
        if (sLogger == null)
            defaultInitial();
        sLogger.debug(aObject, aThrowable);
    }
    
    /**
     * 记录基本信息
     * 
     * @param aMsg
     *              基本信息
     */
    public static void info(String aMsg) {
        if (sLogger == null)
            defaultInitial();
        sLogger.info(aMsg);
    }
    
    /**
     * 记录基本信息
     * 
     * @param aObject
     *              调试对象
     * @param aMsg
     *              基本信息
     */
    public static void info(Object aObject, String aMsg) {
        if (sLogger == null)
            defaultInitial();
        sLogger.info("[" + aObject.getClass().getName() + "]:" + aMsg);
    }
    
    /**
     * 记录警告信息
     * 
     * @param aMsg
     *              警告信息
     */
    public static void warn(String aMsg) {
        if (sLogger == null)
            defaultInitial();
        sLogger.warn(aMsg);
    }
    
    /**
     * 记录警告信息
     * 
     * @param aObject
     *              调试对象
     * @param msg
     *              警告信息
     */
    public static void warn(Object aObject, String aMsg) {
        if (sLogger == null)
            defaultInitial();
        sLogger.warn("[" + aObject.getClass().getName() + "]:" + aMsg);
    }
    
    /**
     * 记录错误信息
     * 
     * @param aMsg
     *              错误信息
     */
    public static void error(String aMsg) {
        if (sLogger == null)
            defaultInitial();
        sLogger.error(aMsg);
    }
    
    /**
     * 记录错误信息
     * 
     * @param aObject
     *              调试对象
     * @param aMsg
     *              错误信息
     */
    public static void error(Object aObject, String aMsg) {
        if (sLogger == null)
            defaultInitial();
        sLogger.error("[" + aObject.getClass().getName() + "]:" + aMsg);
    }
    
    /**
     * 记录调试信息
     * 
     * @param aObject
     *              调试对象
     * @param aMsg
     *              调试信息
     */
    public static void error(Object aObject, Throwable aThrowable) {
        if (sLogger == null)
            defaultInitial();
        sLogger.error(aObject, aThrowable);
    }    
    
    /**
     * 记录失败信息
     * @param aMsg
     *              失败信息   
     */
    public static void fatal(String aMsg) {
        if (sLogger == null)
            defaultInitial();
        sLogger.fatal(aMsg);
    }
    
    /**
     * 记录失败信息
     * @param aObject
     *              调试对象  
     * @param aMsg
     *              失败信息
     */     
    public static void fatal(Object aObject, String aMsg) {
        if (sLogger == null)
            defaultInitial();
        sLogger.fatal("[" + aObject.getClass().getName() + "]:" + aMsg);
    }
    
    /**
     * 系统默认初始化方�?
     */
    private static void defaultInitial() {
//        Logger tLogger = org.apache.log4j.Logger.getRootLogger();
//        tLogger.removeAllAppenders();
//        if (sLogger != null) {
//            //如果应用系统已经初始化log4j的实例，则RootLogger使用相同的配�?
//            Enumeration tAppenders = sLogger.getAllAppenders();
//            while (tAppenders.hasMoreElements())
//                tLogger.addAppender((Appender)tAppenders.nextElement());
//            tLogger.setLevel(sLogger.getLevel());
//        }
//        else {
//            //应用系统未初始化log4j的实例，则RootLogger默认的Console输出
//            PatternLayout tPatternLayout = new PatternLayout();
//            tPatternLayout.setConversionPattern("Default:%d{yy/MM/dd HH:mm:ss.SSS}[%4.4t][%-5p]%m%n");
//            Appender tConsoleAppender = new ConsoleAppender(tPatternLayout, "System.out");
////            log4j.appender.file.Encoding=GBK 
//
//            tConsoleAppender.setName("ConsoleAppender");
//            tLogger.addAppender(tConsoleAppender);
//            tLogger.setLevel(Level.DEBUG);
//            sLogger = tLogger;
//        }
    }
    public static void main(String[] args) {
    	LogWriter.init(org.apache.log4j.Logger.getLogger("MultiMediasLogger"));
    	LogWriter.debug("22");
	}
}
