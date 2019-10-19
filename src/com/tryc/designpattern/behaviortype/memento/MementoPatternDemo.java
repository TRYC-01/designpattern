/**
 * FileName: MementoPatternDem
 * Author:   lenovo
 * Date:     2019/8/26 22:50
 * Description:
 * 意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
 *
 * 主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
 *
 * 何时使用：很多时候我们需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到它原先的状态，使得它有"后悔药"可吃。
 *
 * 如何解决：通过一个备忘录类专门存储对象状态。
 *
 * 关键代码：客户不与备忘录类耦合，与备忘录管理类耦合。
 *
 * 应用实例：1、后悔药。2、打游戏时的存档。3、Windows里的ctrl+z。4、IE中的后退。4、数据库的事务管理。
 *
 * 优点：1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。2、实现了信息的封装，使用用户不需要关心状态的保存细节。
 *
 * 缺点：消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
 *
 * 使用场景：1、需要保存/恢复数据的相关状态场景。2、提供一个可回滚的操作。
 *
 * 注意事项：1、为了符合迪米特原则，还要增加一个管理备忘录的类。2、为了节约内存，可使用原型模式+备忘录模式。
 *
 * History:
 */
package com.tryc.designpattern.behaviortype.memento;

public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");
        System.out.println("Current state:" + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state:" + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state:" + originator.getState());
        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("Third saved state:" + originator.getState());

    }
}