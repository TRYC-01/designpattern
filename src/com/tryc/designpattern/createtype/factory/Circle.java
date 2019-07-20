/**
 * FileName: Circle
 * Author:   lenovo
 * Date:     2019/7/21 0:29
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.factory;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
