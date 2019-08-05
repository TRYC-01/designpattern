/**
 * FileName: Shape
 * Author:   lenovo
 * Date:     2019/8/6 0:37
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.bridge;

public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract void draw();
}
