/**
 * FileName: BuyStock
 * Author:   lenovo
 * Date:     2019/8/25 0:16
 * Description: 实现了Order接口的类
 * History:
 */
package com.tryc.designpattern.behaviortype.command;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
