package designPatterns.Visitor;

/**
 * @author wql
 * @desc UnitVisitor
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public interface UnitVisitor {

    void visitSoldier(Soldier soldier);

    void visitSergeant(Sergeant sergeant);

    void visitCommander(Commander commander);

}
