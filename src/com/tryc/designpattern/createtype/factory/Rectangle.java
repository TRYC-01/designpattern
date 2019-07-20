/**
 * FileName: Rectangle
 * Author:   lenovo
 * Date:     2019/7/21 0:27
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.factory;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
