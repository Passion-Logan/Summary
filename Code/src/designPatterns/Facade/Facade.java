package designPatterns.Facade;

/**
 * 外观角色
 *
 * @author wql
 * @desc Facade
 * @date 2021/5/26
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/26
 */
public class Facade {

    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();

    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }

}
