/**
 * FileName: Memento
 * Author:   lenovo
 * Date:     2019/8/26 22:42
 * Description: 存储原始类内部状态的类
 * History:
 */
package com.tryc.designpattern.behaviortype.memento;

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
