package DesignPatterns.Strategy;

/**
 * @author wql
 * @desc Strategy
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class LambdaStrategy {

    public enum Strategy implements DragonSlayingStrategy {
        MeleeStrategy(() -> System.out.println("你用你的神剑斩断了龙的头颅！")),
        ProjectileStrategy(() -> System.out.println("你用魔法弩射龙，它倒在地上死了！")),
        SpellStrategy(() -> System.out.println("你施展了瓦解咒语，巨龙在一堆尘土中蒸发！"));

        private final DragonSlayingStrategy dragonSlayingStrategy;

        Strategy(DragonSlayingStrategy dragonSlayingStrategy) {
            this.dragonSlayingStrategy = dragonSlayingStrategy;
        }

        @Override
        public void execute() {
            dragonSlayingStrategy.execute();
        }
    }

}
