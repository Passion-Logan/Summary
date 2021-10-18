package designPatterns.Strategy;

/**
 * @author wql
 * @desc DragonSlayer
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class DragonSlayer {

    private DragonSlayingStrategy strategy;

    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToBattle() {
        strategy.execute();
    }

}
