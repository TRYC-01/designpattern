/**
 * FileName: AbstractLogger
 * Author:   lenovo
 * Date:     2019/8/24 19:12
 * Description:
 * 责任链模式:为请求创建一个接收者对象的链。这种模式的给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计
 *            模式属于行为型模式。
 * 意图：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，
 *       直到有对象处理它为止。
 * 主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以
 *          职责链将请求的发送者和请求的处理者解耦了。
 * 何时使用：在处理消息的时候以过滤很多道。
 * 如何解决：拦截的类都实现统一接口。
 * 关键代码：Handler里面聚合它自己，在HandlerRequest里面判断是否合适，如果没达到重要条件则向下传递，向谁传递之前set进去。
 * 应用实例：1、JS中的事件冒泡。2、JAVA WEB中Apache Tomcat对Encoding的处理,Struts2的拦截器，jsp servlet的Filter
 * 优点：1、降低耦合度。它将请求的发送者和接收者解耦。2、简化了对象。使得对象不需要知道链的结构。3、增强给对象指派职责的灵活性。
 *       通过改变链内的成员或者调动它的次序，允许动态地新增或者删除责任。4、增加新的请求处理类很方便。
 * 缺点：1、不能保证请求一定被接收。2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。3、可能不容易
 *       观察运行时的特征，有碍除错。
 * 使用场景：有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。2、在不明确指定接收者的情况下，向多个对象中
 *          的一个提交一个请求。3、可动态指定一组对象处理请求。
 * 注意事项：在JAVA WEB中遇到很多应用。
 * History:
 */
package com.tryc.designpattern.behaviortype.chainofresponsibility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    // 责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);


    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
}
