package com.tryc.designpattern.behaviortype.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Subject
 * Author:   lenovo
 * Date:     2019/10/19 10:03
 * Description:
 * History:
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer =  observers.get(i);
            observer.update();
        }
    }
}
