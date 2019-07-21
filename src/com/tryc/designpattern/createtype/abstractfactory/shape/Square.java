/**
 * FileName: Square
 * Author:   lenovo
 * Date:     2019/7/21 15:47
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory.shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
