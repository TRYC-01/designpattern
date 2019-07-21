/**
 * FileName: HungrySingleton
 * Author:   lenovo
 * Date:     2019/7/21 17:07
 * Description: 饿汉式单例，线程安全
 * History:
 */
package com.tryc.designpattern.createtype.singleton;

public class HungrySingleton {
    public static HungrySingleton instance =  new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance() {
        return instance;
    }
}
