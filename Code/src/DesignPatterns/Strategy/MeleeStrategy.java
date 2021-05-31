package DesignPatterns.Strategy;

/**
 * @author wql
 * @desc MeleeStrategy
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class MeleeStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("用你的神剑斩断龙头！");
    }

}
