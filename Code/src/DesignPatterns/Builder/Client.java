package DesignPatterns.Builder;

/**
 * 建造者模式
 * <p>
 * 该模式的主要优点如下：
 * 封装性好，构建和表示分离。
 * 扩展性好，各个具体的建造者相互独立，有利于系统的解耦。
 * 客户端不必知道产品内部组成的细节，建造者可以对创建过程逐步细化，而不对其它模块产生任何影响，便于控制细节风险。
 * <p>
 * 其缺点如下：
 * 产品的组成部分必须相同，这限制了其使用范围。
 * 如果产品的内部变化复杂，如果产品内部发生变化，则建造者也要同步修改，后期维护成本较大。
 * <p>
 * 建造者（Builder）模式和工厂模式的关注点不同：建造者模式注重零部件的组装过程，而工厂方法模式更注重零部件的创建过程，但两者可以结合使用。
 * <p>
 * 模式的结构与实现
 * 建造者（Builder）模式由产品、抽象建造者、具体建造者、指挥者等 4 个要素构成，现在我们来分析其基本结构和实现方法。
 * 1. 模式的结构
 * 建造者（Builder）模式的主要角色如下。
 * 产品角色（Product）：它是包含多个组成部件的复杂对象，由具体建造者来创建其各个零部件。
 * 抽象建造者（Builder）：它是一个包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法 getResult()。
 * 具体建造者(Concrete Builder）：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
 * 指挥者（Director）：它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息。
 *
 * @Author: WQL //作者及
 * @Date: 2019/8/18 21:04//完成日期
 * @Description: // 描述
 * @Version: v0.0.1 // 版本信息
 * @Function List: // 主要函数及其功能
 * @Others: // 其它内容的说明
 * @History: // 历史修改记录
 */
public class Client {
    public static void main(String[] args) {
//        Builder builder = new ConcreteBuilder();
//        Director director = new Director(builder);
//        Product product = director.construct();
//        product.show();


//        This is a MAGE named Riobard with BLACK hair and wielding a DAGGER.
//        This is a WARRIOR named Amberjill with BLOND LONG_CURLY hair wearing chain mail and wielding a SWORD.
//        This is a thief named Desmond with bald head and wielding a bow.

        Hero mage = new Hero.Builder(Profession.MAGE, " 里奥巴德 ")
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.DAGGER)
                .build();
        System.out.println(mage.toString());

        Hero warrior = new Hero.Builder(Profession.WARRIOR, " 安伯吉尔 ")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD)
                .build();
        System.out.println(warrior.toString());

        Hero thief = new Hero.Builder(Profession.THIEF, " 德斯蒙德 ")
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.BOW)
                .build();
        System.out.println(thief.toString());
    }
}
