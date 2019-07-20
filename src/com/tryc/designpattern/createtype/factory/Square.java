/**
 * FileName: Square
 * Author:   lenovo
 * Date:     2019/7/21 0:28
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.factory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
