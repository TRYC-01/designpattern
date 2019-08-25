/**
 * FileName: AndExpression
 * Author:   lenovo
 * Date:     2019/8/25 15:41
 * Description:
 * History:
 */
package com.tryc.designpattern.behaviortype.interpreter;

public class AndExpression implements Expression {
    private Expression expr1;
    private Expression expr2;
    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }
}
