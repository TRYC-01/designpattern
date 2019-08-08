/**
 * FileName: Demo
 * Author:   lenovo
 * Date:     2019/8/9 0:09
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.facade;

public class Demo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
