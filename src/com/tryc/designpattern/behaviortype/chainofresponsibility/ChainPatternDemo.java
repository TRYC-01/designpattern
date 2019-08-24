/**
 * FileName: ChainPatternDemo
 * Author:   lenovo
 * Date:     2019/8/24 19:52
 * Description: 责任链demo
 * History:
 */
package com.tryc.designpattern.behaviortype.chainofresponsibility;

public class ChainPatternDemo {

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();
        loggerChain.logMessage(AbstractLogger.INFO,"This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is a error level information.");


    }

    private static AbstractLogger getChainOfLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
