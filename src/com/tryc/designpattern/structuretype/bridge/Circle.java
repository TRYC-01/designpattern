/**
 * FileName: Circle
 * Author:   lenovo
 * Date:     2019/8/6 0:39
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.bridge;

public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    protected Circle(int x, int y,int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
