/**
 * FileName: Circle
 * Author:   lenovo
 * Date:     2019/8/9 0:04
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
