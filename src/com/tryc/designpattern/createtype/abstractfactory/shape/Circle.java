/**
 * FileName: Circle
 * Author:   lenovo
 * Date:     2019/7/21 15:55
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory.shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
