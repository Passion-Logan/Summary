package DesignPatterns.Interpreter;

/**
 * @author wql
 * @desc Expression
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public abstract class Expression {

    public abstract int interpret();

    @Override
    public abstract String toString();
}
