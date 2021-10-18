package designPatterns.TemplateMethod;

/**
 * 抽象方法
 *
 * @author wql
 * @desc StealingMethod
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    /**
     * Steal.
     */
    public void steal() {
        String target = pickTarget();
        System.out.println(String.format("目标被选为 %s.", target));
        confuseTarget(target);
        stealTheItem(target);
    }
}
