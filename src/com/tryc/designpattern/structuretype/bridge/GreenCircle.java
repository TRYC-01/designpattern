/**
 * FileName: GreenCircle
 * Author:   lenovo
 * Date:     2019/8/6 0:36
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ Color:green,radius:" + radius + ",x:" + x + ", y:" + y + "]");
    }
}
