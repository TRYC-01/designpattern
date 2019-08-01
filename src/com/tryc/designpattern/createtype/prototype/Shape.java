/**
 * FileName: Shape
 * Author:   lenovo
 * Date:     2019/8/1 23:52
 * Description: 实现cloneable接口的抽象类
 * History:
 */
package com.tryc.designpattern.createtype.prototype;

public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
