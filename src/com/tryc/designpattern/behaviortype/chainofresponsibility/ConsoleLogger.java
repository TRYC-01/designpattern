/**
 * FileName: ConsoleLogger
 * Author:   lenovo
 * Date:     2019/8/24 19:48
 * Description:
 * History:
 */
package com.tryc.designpattern.behaviortype.chainofresponsibility;

public class ConsoleLogger extends AbstractLogger {

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

    public ConsoleLogger(int level) {
        this.level = level;
    }
}
