/**
 * FileName: OctalObserver
 * Author:   lenovo
 * Date:     2019/10/19 10:15
 * Description:
 * History:
 */
package com.tryc.designpattern.behaviortype.observer;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("OctalObserver String:" + Integer.toOctalString(subject.getState()));
    }
}
