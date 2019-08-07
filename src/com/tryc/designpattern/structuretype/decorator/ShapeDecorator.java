/**
 * FileName: ShapeDecorator
 * Author:   lenovo
 * Date:     2019/8/7 23:36
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.decorator;

public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
