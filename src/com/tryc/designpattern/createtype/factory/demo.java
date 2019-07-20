/**
 * FileName: demo
 * Author:   lenovo
 * Date:     2019/7/21 0:34
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.factory;

public class demo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
