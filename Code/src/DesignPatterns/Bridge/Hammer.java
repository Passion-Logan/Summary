package DesignPatterns.Bridge;

/**
 * @author wql
 * @desc Hammer
 * @date 2021/5/24
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/24
 */
public class Hammer implements Weapon {

    private final Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("锤子被挥舞了。");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("锤子摆动。");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("锤子没有挥舞。");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
