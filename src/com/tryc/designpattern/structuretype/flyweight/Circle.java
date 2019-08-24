/**
 * FileName: Circle
 * Author:   lenovo
 * Date:     2019/8/24 17:48
 * Description: 实现shape接口的实体类
 * History:
 */
package com.tryc.designpattern.structuretype.flyweight;

public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override

    public void draw() {
        System.out.println("Circle: Draw() [Color :" + color + ", x:" + x + ",y:" + y + ",radius:" + radius + "]");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
