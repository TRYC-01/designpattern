/**
 * FileName: RedShapeDecorator
 * Author:   lenovo
 * Date:     2019/8/7 23:38
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color:red");
    }
}
