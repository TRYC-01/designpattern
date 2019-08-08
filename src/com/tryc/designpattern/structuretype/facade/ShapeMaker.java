/**
 * FileName: ShapeMaker
 * Author:   lenovo
 * Date:     2019/8/9 0:05
 * Description: 外观类
 * History:
 */
package com.tryc.designpattern.structuretype.facade;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
