/**
 * FileName: Burger
 * Author:   lenovo
 * Date:     2019/7/21 17:42
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.builder;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
