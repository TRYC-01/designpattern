/**
 * FileName: Rectangle
 * Author:   lenovo
 * Date:     2019/8/7 23:34
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.decorator;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
