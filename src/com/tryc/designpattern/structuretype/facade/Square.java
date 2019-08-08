/**
 * FileName: Square
 * Author:   lenovo
 * Date:     2019/8/9 0:07
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
