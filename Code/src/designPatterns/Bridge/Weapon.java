package designPatterns.Bridge;

/**
 * 实现化角色
 */
public interface Weapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
