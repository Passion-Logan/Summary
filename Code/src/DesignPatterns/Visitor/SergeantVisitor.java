package DesignPatterns.Visitor;

/**
 * @author wql
 * @desc SergeantVisitor
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class SergeantVisitor implements UnitVisitor {

    @Override
    public void visitSoldier(Soldier soldier) {
        // Do nothing
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        System.out.println(String.format("你好 %s", sergeant));
    }

    @Override
    public void visitCommander(Commander commander) {
        // Do nothing
    }
}
