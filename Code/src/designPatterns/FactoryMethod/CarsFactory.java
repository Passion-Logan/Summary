package designPatterns.FactoryMethod;

/**
 * 简单工厂
 *
 * @author wql
 * @desc CarsFactory
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public class CarsFactory {

    public static Car getCar(CarType type) {
        return type.getConstructor().get();
    }

}
