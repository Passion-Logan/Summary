package DesignPatterns.Strategy;

/**
 * @author wql
 * @desc ProjectileStrategy
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class ProjectileStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("你用魔法弩射龙，它倒在地上死了！");
    }

}
