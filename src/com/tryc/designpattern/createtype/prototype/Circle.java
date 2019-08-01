/**
 * FileName: Circle
 * Author:   lenovo
 * Date:     2019/8/2 0:14
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.prototype;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
