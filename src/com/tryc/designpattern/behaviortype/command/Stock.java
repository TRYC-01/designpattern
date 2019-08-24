/**
 * FileName: Stock
 * Author:   lenovo
 * Date:     2019/8/24 23:50
 * Description: 请求类
 * 意图：将一个请求封装成一个对象，从而使你可以用不同的请求对客户进行参数化。
 *
 * 主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销、
 *           重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 *
 * 何时使用：在某些场合，比如要对行为进行记录、撤销、重做、事务等处理，这种无法抵御变化的紧耦合是不合适的。在这种
 *           情况下，如何将行为请求者与行为实现者解耦？将一组行为抽象为对象，可以实现二者之间的松耦合。
 *
 * 如何解决：通过调用者调用接受者执行命令，顺序：调用者->接受者->命令
 *
 * 关键代码：定义三个角色：1、received真正的命令执行对象 2、Command 3、invoker使用命令对象的入口
 *
 * 应用实例：struts1中的action核心控制器ActionServlet只有一个，相当于Invoker，而模型层的类会随着不同的应用有不同
 *           模型类，相当于具体的Command。
 *
 * 优点：1、降低了系统的耦合度。2、新的命令可以很容易添加到系统中去。
 *
 * 缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
 *
 * 使用场景：认为是命令的地方都可以使用命令模式，比如：1、GUI中每一个按钮是一条命令。2、模拟CMD
 *
 * 注意事项：系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。
 *
 * History:
 */
package com.tryc.designpattern.behaviortype.command;

public class Stock {
    private String name = "ABC";
    private int qunatity= 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + "Quantity: " + qunatity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + "Quantity: " + qunatity + " ] sold");
    }
}
