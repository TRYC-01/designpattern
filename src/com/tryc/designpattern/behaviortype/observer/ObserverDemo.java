package com.tryc.designpattern.behaviortype.observer;
/**
 * FileName: ObserverDemo
 * Author:   lenovo
 * Date:     2019/10/19 10:17
 * Description: 观察者模式：当对象间存在一对多关系时，则使用观察者模式。比如，当一个对象被修改时，则会自动通知它的依赖对象。
 * 观察者模式属于行为型模式。
 * 意图：定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 主要解决：一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。
 * 何时使用：一个对象(目标对象)的状态发生改变，所有的依赖对象(观察者对象)都将得到通知，进行广播通知。
 * 如何解决：使用面向对象技术，可以将这种依赖关系弱化。
 * 关键代码：在抽象类里面有一个ArrayList存放观察者们。
 * 注意事项：1、JAVA中已经有了对观察者模式的支持类。2、避免循环引用。3、如果顺序执行，某一观察者错误会导致系统卡壳，一般采用
 * 异步方式。
 * 实现：观察者使用三个类 Subject、Observer和Client。Subject对象带有绑定观察者到Client对象和从Client对象解绑观察者的方法。
 * 我们创建Subject类、Observer抽象类和扩展了抽象类Observer的实体类。
 * History:
 */

public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        OctalObserver octalObserver = new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
