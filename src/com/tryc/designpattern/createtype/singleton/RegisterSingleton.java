/**
 * FileName: RegisterSingleton
 * Author:   lenovo
 * Date:     2019/7/21 17:17
 * Description: 登记式/静态内部类，线程安全，lazy初始化
 *              这种方式利用classloader机制来保证初始化instance时只有一个线程。
 * History:
 */
package com.tryc.designpattern.createtype.singleton;

public class RegisterSingleton {
    private static class RegisterSingletonHolder{
        private static final RegisterSingleton INSTANCE = new RegisterSingleton();
    }
    private RegisterSingleton(){}

    public static final RegisterSingleton getInstance() {
        return RegisterSingletonHolder.INSTANCE;
    }
}
