/**
 * FileName: Demo
 * Author:   lenovo
 * Date:     2019/8/7 23:42
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.decorator;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
