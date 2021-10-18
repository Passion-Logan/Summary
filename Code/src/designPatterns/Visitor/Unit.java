package designPatterns.Visitor;

import java.util.Arrays;

/**
 * @author wql
 * @desc Unit
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public abstract class Unit {

    private final Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    /**
     * Accept visitor.
     */
    public void accept(UnitVisitor visitor) {
        Arrays.stream(children).forEach(child -> child.accept(visitor));
    }
}
