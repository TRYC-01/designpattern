/**
 * FileName: ColdDrink
 * Author:   lenovo
 * Date:     2019/7/21 17:43
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.builder;

public abstract  class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
