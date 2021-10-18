package designPatterns.Bridge;

/**
 * @author wql
 * @desc FlyingEnchantment
 * @date 2021/5/24
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/24
 */
public class FlyingEnchantment implements Enchantment {
    @Override
    public void onActivate() {
        System.out.println("该项目开始微弱地发光。");
    }

    @Override
    public void apply() {
        System.out.println("该物品飞走并击中了敌人，最后又回到了主人的手上。");
    }

    @Override
    public void onDeactivate() {
        System.out.println("该项目的辉光消失。");
    }
}
