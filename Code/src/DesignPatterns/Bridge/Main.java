package DesignPatterns.Bridge;

/**
 * 桥接模式：
 * 将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现的，从而降低了抽象和实现这两个可变维度的耦合度。
 * <p>
 * 桥接（Bridge）模式的优点是：
 * 抽象与实现分离，扩展能力强
 * 符合开闭原则
 * 符合合成复用原则
 * 其实现细节对客户透明
 * <p>
 * 缺点是：由于聚合关系建立在抽象层，要求开发者针对抽象化进行设计与编程，能正确地识别出系统中两个独立变化的维度，这增加了系统的理解与设计难度。
 * <p>
 * 1. 模式的结构
 * 桥接（Bridge）模式包含以下主要角色。
 * 抽象化（Abstraction）角色：定义抽象类，并包含一个对实现化对象的引用。
 * 扩展抽象化（Refined Abstraction）角色：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
 * 实现化（Implementor）角色：定义实现化角色的接口，供扩展抽象化角色调用。
 * 具体实现化（Concrete Implementor）角色：给出实现化角色接口的具体实现。
 *
 * @author wql
 * @desc Main
 * @date 2021/5/24
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/24
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("骑士会收到一把附魔的剑。");
        Sword enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        System.out.println("女武神得到了一个附魔的锤子。");
        Hammer hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
