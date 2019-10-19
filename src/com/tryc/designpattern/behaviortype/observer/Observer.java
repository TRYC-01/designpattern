/**
 * FileName: Observer
 * Author:   lenovo
 * Date:     2019/10/19 10:09
 * Description:
 * History:
 */
package com.tryc.designpattern.behaviortype.observer;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
