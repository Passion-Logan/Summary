package designPatterns.Strategy;

/**
 * @author wql
 * @desc SpellStrategy
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class SpellStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("你施展了瓦解咒语，巨龙在一堆尘土中蒸发！");
    }

}
