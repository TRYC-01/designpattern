/**
 * FileName: Rectangle
 * Author:   lenovo
 * Date:     2019/8/9 0:03
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.facade;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
