/**
 * FileName: CommandPatternDemo
 * Author:   lenovo
 * Date:     2019/8/25 0:22
 * Description: 命令模式demo，使用Broker类来接受并执行命令
 * History:
 */
package com.tryc.designpattern.behaviortype.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
