/**
 * FileName: ProxyPatternDemo
 * Author:   lenovo
 * Date:     2019/8/24 18:35
 * Description: 代理模式demo
 * History:
 */
package com.tryc.designpattern.structuretype.proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}
