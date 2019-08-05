/**
 * FileName: RecCircle
 * Author:   lenovo
 * Date:     2019/8/6 0:34
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.bridge;

public class RecCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ Color:red,radius:" + radius + ",x:" + x + ", y:" + y + "]");
    }
}
