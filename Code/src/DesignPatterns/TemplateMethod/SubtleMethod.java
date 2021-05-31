package DesignPatterns.TemplateMethod;

/**
 * 具体方法
 *
 * @author wql
 * @desc SubtleMethod
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class SubtleMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "店主";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println(String.format("流着眼泪走近 %s 并拥抱他！", target));
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println(String.format("在近距离接触时抓住 %s 的钱包。", target));
    }
}
