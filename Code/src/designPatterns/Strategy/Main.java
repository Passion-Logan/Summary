package designPatterns.Strategy;

/**
 * 策略模式：
 * 定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。
 * <p>
 * 策略模式的主要优点如下。
 * 多重条件语句不易维护，而使用策略模式可以避免使用多重条件语句，如 if...else 语句、switch...case 语句。
 * 策略模式提供了一系列的可供重用的算法族，恰当使用继承可以把算法族的公共代码转移到父类里面，从而避免重复的代码。
 * 策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的。
 * 策略模式提供了对开闭原则的完美支持，可以在不修改原代码的情况下，灵活增加新算法。
 * 策略模式把算法的使用放到环境类中，而算法的实现移到具体策略类中，实现了二者的分离。
 * <p>
 * 其主要缺点如下。
 * 客户端必须理解所有策略算法的区别，以便适时选择恰当的算法类。
 * 策略模式造成很多的策略类，增加维护难度。
 * <p>
 * 策略模式的主要角色如下。
 * 抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现。
 * 具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现。
 * 环境（Context）类：持有一个策略类的引用，最终给客户端调用。
 *
 * @author wql
 * @desc Main
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class Main {

    public static void main(String[] args) {
        // GoF Strategy pattern
        System.out.println("绿龙在眼前！");
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        System.out.println("红龙现身。");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        System.out.println("黑龙在你面前降落。");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        // Java 8 functional implementation Strategy pattern
        System.out.println("绿龙在眼前！");
        dragonSlayer = new DragonSlayer(
                () -> System.out.println("你用你的神剑斩断了龙的头颅！"));
        dragonSlayer.goToBattle();
        System.out.println("红龙现身。");
        dragonSlayer.changeStrategy(() -> System.out.println("你用魔法弩射龙，它倒在地上死了！"));
        dragonSlayer.goToBattle();
        System.out.println("黑龙在你面前降落。");
        dragonSlayer.changeStrategy(() -> System.out.println("你施展了瓦解咒语，巨龙在一堆尘土中蒸发！"));
        dragonSlayer.goToBattle();

        // Java 8 lambda implementation with enum Strategy pattern
        System.out.println("绿龙在眼前！");
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.MeleeStrategy);
        dragonSlayer.goToBattle();
        System.out.println("红龙现身。");
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.ProjectileStrategy);
        dragonSlayer.goToBattle();
        System.out.println("黑龙在你面前降落。");
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.SpellStrategy);
        dragonSlayer.goToBattle();
    }
}
