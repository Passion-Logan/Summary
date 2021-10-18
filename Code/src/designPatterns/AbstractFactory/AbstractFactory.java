package designPatterns.AbstractFactory;

/**
 * 抽象工厂模式,加入了原型模式：
 * 提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。
 * <p>
 * 使用抽象工厂模式一般要满足以下条件。
 * 系统中有多个产品族，每个具体工厂创建同一族但属于不同等级结构的产品。
 * 系统一次只可能消费其中某一族产品，即同族的产品一起使用。
 * <p>
 * 抽象工厂模式除了具有工厂方法模式的优点外，其他主要优点如下。
 * 可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。
 * 当需要产品族时，抽象工厂可以保证客户端始终只使用同一个产品的产品组。
 * 抽象工厂增强了程序的可扩展性，当增加一个新的产品族时，不需要修改原代码，满足开闭原则。
 * <p>
 * 模式的结构与实现
 * 抽象工厂模式同工厂方法模式一样，也是由抽象工厂、具体工厂、抽象产品和具体产品等 4 个要素构成，
 * 但抽象工厂中方法个数不同，抽象产品的个数也不同。现在我们来分析其基本结构和实现方法。
 * 1. 模式的结构
 * 抽象工厂模式的主要角色如下。
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。
 * 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。
 *
 * @Author: WQL //作者及
 * @Date: 2019/8/18 11:49//完成日期
 * @Description: // 描述
 * @Version: v0.0.1 // 版本信息
 * @Function List: // 主要函数及其功能
 * @Others: // 其它内容的说明
 * @History: // 历史修改记录
 */
public class AbstractFactory {
    public static void main(String[] args) {
        HeroAndSkillFactory herosFactory = FactoryProduct.HerosFactory.getConstructor().get();
        Heros ashe = herosFactory.getHeros("Ashe");
        Heros masterYi = herosFactory.getHeros("MasterYi");

        ashe.haveHero();
        masterYi.haveHero();

        System.out.println("-----分割线-----");

        HeroAndSkillFactory skillsFactory = FactoryProduct.SkillsFactory.getConstructor().get();
        Skills arrow = skillsFactory.getSkills("Arrow");
        Skills sword = skillsFactory.getSkills("Sword");

        arrow.useSkill();
        sword.useSkill();
    }
}
