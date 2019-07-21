/**
 * FileName: SafeLazySIngleton
 * Author:   lenovo
 * Date:     2019/7/21 16:54
 * Description: 线程安全懒汉式单例
 * History:
 */
package com.tryc.designpattern.createtype.singleton;

public class SafeLazySIngleton {
    private static SafeLazySIngleton instance;
    private SafeLazySIngleton(){}

    public static synchronized SafeLazySIngleton getInstance() {
        if (instance == null) {
            instance = null;
        }
        return instance;
    }
}
