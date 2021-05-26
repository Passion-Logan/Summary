package DesignPatterns.Bridge;

/**
 * 具体实现话角色
 *
 * @author wql
 * @desc Sword
 * @date 2021/5/24
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/24
 */
public class Sword implements Weapon {

    private final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("挥舞着剑。");
        enchantment.onActivate();
    }

    @Override
    public void swing() {
        System.out.println("剑摆动。");
        enchantment.apply();
    }

    @Override
    public void unwield() {
        System.out.println("剑未使用。");
        enchantment.onDeactivate();
    }

    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
