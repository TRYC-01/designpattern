/**
 * FileName: ProxyImage
 * Author:   lenovo
 * Date:     2019/8/24 18:33
 * Description: 代理类
 * 一个类代表另一个类的功能。为其他对象提供一种代理以控制对这个对象的访问。
 * 主要解决:在直接访问对象时带来的问题，比如说:要访问的对象在远程的机器上。在面向对象系统中，有些对象由于某些
 *          原因(比如对象的创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问)，直接访问会给使用者
 *          或者系统结构带来很多麻烦，我们可以在访问此对象时加上一个对此对象的访问层。
 *何时使用：想在访问一个类时做一些控制。
 * 如何解决：增加中间层。
 * 关键代码：实现与被代理类组合。
 * 优点：1、职责清晰。2、高扩展性。3、智能化。
 * 缺点：1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。
 *       2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。
 * 使用场景：按职责来划分，通常有以下使用场景：1、远程代理。2、虚拟代理。3、Copy-on-Write代理。4、保护(Protect or Acccess)
 *          代理。5、Cache代理。6、防火墙(Firewall)代理。7、同步化(Synchronization)代理。8、智能引用(Smart Reference)代理。
 * 注意事项：1、和适配器模式的区别：适配器模式主要改变所考虑对象的接口，而代理模式不能改变所代理类的接口。
 *          2、和装饰器模式的区别：装饰器模式不能为了增强功能，而代理模式是为了加以控制。
 * History:
 */
package com.tryc.designpattern.structuretype.proxy;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }
}
