/**
 * FileName: Rectangle
 * Author:   lenovo
 * Date:     2019/8/2 0:05
 * Description: 抽象类的实体类
 * History:
 */
package com.tryc.designpattern.createtype.prototype;

public class Rectangle extends Shape{


    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle:: draw() method.");
    }
}
