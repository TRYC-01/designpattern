/**
 * FileName: TerminalExpression
 * Author:   lenovo
 * Date:     2019/8/25 15:35
 * Description: 实现了表达式接口的实体类
 * History:
 */
package com.tryc.designpattern.behaviortype.interpreter;

public class TerminalExpression implements Expression {
    private String data;
    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }

    public TerminalExpression(String data) {
        this.data = data;
    }
}
