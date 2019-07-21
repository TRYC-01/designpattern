/**
 * FileName: DCLSingleton
 * Author:   lenovo
 * Date:     2019/7/21 17:10
 * Description: 双检锁/双重校验锁，线程安全，lazy初始化
 * History:
 */
package com.tryc.designpattern.createtype.singleton;

public class DCLSingleton {
    private volatile static DCLSingleton instance;
    private DCLSingleton(){};

    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
