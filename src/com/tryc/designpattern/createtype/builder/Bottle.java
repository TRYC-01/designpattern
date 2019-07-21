/**
 * FileName: Bottle
 * Author:   lenovo
 * Date:     2019/7/21 17:40
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.builder;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
