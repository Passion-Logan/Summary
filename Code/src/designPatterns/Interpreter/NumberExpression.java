package designPatterns.Interpreter;

/**
 * @author wql
 * @desc NumberExpression
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class NumberExpression extends Expression {

    private final int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public NumberExpression(String s) {
        this.number = Integer.parseInt(s);
    }

    @Override
    public int interpret() {
        return number;
    }

    @Override
    public String toString() {
        return "number";
    }
}