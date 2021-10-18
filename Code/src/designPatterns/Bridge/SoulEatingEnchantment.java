package designPatterns.Bridge;

/**
 * @author wql
 * @desc SoulEatingEnchantment
 * @date 2021/5/24
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/24
 */
public class SoulEatingEnchantment implements Enchantment {
    @Override
    public void onActivate() {
        System.out.println("该物品散布嗜血的味道。");
    }

    @Override
    public void apply() {
        System.out.println("该物品吞噬了敌人的灵魂。");
    }

    @Override
    public void onDeactivate() {
        System.out.println("嗜血慢慢消失。");
    }
}
