package DesignPatterns.Bridge;

public interface Weapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
