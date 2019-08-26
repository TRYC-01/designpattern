/**
 * FileName: CareTaker
 * Author:   lenovo
 * Date:     2019/8/26 22:47
 * Description: 负责从Memento中恢复状态的类
 * History:
 */
package com.tryc.designpattern.behaviortype.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementos = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
