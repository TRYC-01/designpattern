/**
 * FileName: LazySingleton
 * Author:   lenovo
 * Date:     2019/7/21 16:50
 * Description: 懒汉式单例模式 非线程安全
 * History:
 */
package com.tryc.designpattern.createtype.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
