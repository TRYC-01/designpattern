/**
 * FileName: BinaryObserver
 * Author:   lenovo
 * Date:     2019/10/19 10:12
 * Description:
 * History:
 */
package com.tryc.designpattern.behaviortype.observer;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String:" + Integer.toBinaryString(subject.getState()));
    }
}
