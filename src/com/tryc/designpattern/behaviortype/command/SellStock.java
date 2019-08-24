/**
 * FileName: SellStock
 * Author:   lenovo
 * Date:     2019/8/25 0:18
 * Description: 实现了Order的类
 * History:
 */
package com.tryc.designpattern.behaviortype.command;

public class SellStock implements Order {
    private Stock abcStock;

    @Override
    public void execute() {
        abcStock.sell();
    }

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }
}
