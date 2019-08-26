/**
 * FileName: Originator
 * Author:   lenovo
 * Date:     2019/8/26 22:44
 * Description: 需要被记录的类
 * History:
 */
package com.tryc.designpattern.behaviortype.memento;

public class Originator {

    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
