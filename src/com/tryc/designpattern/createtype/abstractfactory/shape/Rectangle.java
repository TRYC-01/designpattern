/**
 * FileName: Rectangle
 * Author:   lenovo
 * Date:     2019/7/21 15:46
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
