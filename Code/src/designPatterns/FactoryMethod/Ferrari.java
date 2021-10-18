package designPatterns.FactoryMethod;

/**
 * 具体产品
 *
 * @author wql
 * @desc Ferrari
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public class Ferrari implements Car {

    static final String DESCRIPTION = "This is Ferrari.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
