package designPatterns.FactoryMethod;

/**
 * 具体产品
 *
 * @author wql
 * @desc Ford
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public class Ford implements Car {

    static final String DESCRIPTION = "This is Ford.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
