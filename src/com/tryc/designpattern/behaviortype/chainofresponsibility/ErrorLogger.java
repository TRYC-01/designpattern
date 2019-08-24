/**
 * FileName: ConsoleLogger
 * Author:   lenovo
 * Date:     2019/8/24 19:48
 * Description:
 * History:
 */
package com.tryc.designpattern.behaviortype.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {

    @Override
    protected void write(String message) {
        System.out.println("Standard Error::Logger: " + message);
    }

    public ErrorLogger(int level) {
        this.level = level;
    }
}
