package designPatterns.Interpreter;

/**
 * @author wql
 * @desc MinusExpression
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class MinusExpression extends Expression {

    private final Expression leftExpression;
    private final Expression rightExpression;

    public MinusExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }

    @Override
    public String toString() {
        return "-";
    }

}
