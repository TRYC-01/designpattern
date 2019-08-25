/**
 * FileName: MediatorPatternDemo
 * Author:   lenovo
 * Date:     2019/8/25 21:07
 * Description:中介者模式(Mediator Pattern)是用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于
 *              维护。中介者模式属于行为型模式。
 * 意图：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显示地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 *
 * 何时使用：多个类相互耦合，形成了网状结构。
 *
 * 如何解决：将上述网状结构分离为星型结构。
 *
 * 关键代码：对象Colleague之间的通信封装到一个类中单独处理。
 *
 * 应用实例：1、中国加入WTO之前是各个国家相互贸易，结构复杂，现在是各个国家通过WTO来互相贸易。2、机场调度系统。3、MVC框架，其中C(控制器)就是M(模型)和V(视图)的中介者。
 *
 * 优点：1、降低了类的复杂度，将一对多转化成了一对一。2、各个类之间的解耦。3、符合迪米特原则。
 *
 * 缺点：中介者会庞大，变得复杂难以维护。
 *
 * 使用场景：1、系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而难以复用该对象。2、想通过一个中间类来封装多个类的行为，而又不想生成太多的子类。
 *
 * 注意事项：不应当在职责混乱的时候使用。
 *
 * History:
 */
package com.tryc.designpattern.behaviortype.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        robert.sendMessage("Hi!John!");
        john.sendMessage("Hi!Robert!");
    }
}
