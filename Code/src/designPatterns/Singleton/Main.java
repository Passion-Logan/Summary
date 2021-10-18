package designPatterns.Singleton;

/**
 * 单例模式
 * 某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。
 * <p>
 * 单例模式的优点：
 * 单例模式可以保证内存里只有一个实例，减少了内存的开销。
 * 可以避免对资源的多重占用。
 * 单例模式设置全局访问点，可以优化和共享资源的访问。
 * <p>
 * 单例模式的缺点：
 * 单例模式一般没有接口，扩展困难。如果要扩展，则除了修改原来的代码，没有第二种途径，违背开闭原则。
 * 在并发测试中，单例模式不利于代码调试。在调试过程中，如果单例中的代码没有执行完，也不能模拟生成一个新的对象。
 * 单例模式的功能代码通常写在一个类中，如果功能设计不合理，则很容易违背单一职责原则。
 *
 * @author wql
 * @desc Main
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public class Main {

    public static void main(String[] args) {
        President zt1 = President.getInstance();
        zt1.getName();    //输出总统的名字
        President zt2 = President.getInstance();
        zt2.getName();    //输出总统的名字
        if (zt1 == zt2) {
            System.out.println("他们是同一人！");
        } else {
            System.out.println("他们不是同一人！");
        }
    }

}

class President {
    private static volatile President instance = null;    //保证instance在所有线程中同步

    //private避免类在外部被实例化
    private President() {
        System.out.println("产生一个总统！");
    }

    public static synchronized President getInstance() {
        //在getInstance方法上加同步
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("已经有一个总统，不能产生新总统！");
        }
        return instance;
    }

    public void getName() {
        System.out.println("我是美国总统：特朗普。");
    }
}

/**
 * 懒汉式单例:
 * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。
 */
class LazySingleton {
    private static volatile LazySingleton instance = null;    //保证 instance 在所有线程中同步

    private LazySingleton() {
    }    //private 避免类在外部被实例化

    public static synchronized LazySingleton getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

/**
 * 饿汉式单例:
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 */
class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
