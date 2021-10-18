package designPatterns.Flyweight;

/**
 * 非享元角色
 *
 * @author wql
 * @desc UnsharedConcreteFlyweight
 * @date 2021/5/26
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/26
 */
public class UnsharedConcreteFlyweight {

    private String info;

    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
