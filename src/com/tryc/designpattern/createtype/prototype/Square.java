/**
 * FileName: Square
 * Author:   lenovo
 * Date:     2019/8/2 0:11
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.prototype;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
