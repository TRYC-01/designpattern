/**
 * FileName: Circle
 * Author:   lenovo
 * Date:     2019/8/7 23:35
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.decorator;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Cirle");
    }
}
