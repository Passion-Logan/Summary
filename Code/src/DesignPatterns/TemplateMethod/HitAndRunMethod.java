package DesignPatterns.TemplateMethod;

/**
 * 具体方法
 *
 * @author wql
 * @desc HitAndRunMethod
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class HitAndRunMethod extends StealingMethod {

    @Override
    protected String pickTarget() {
        return "地精老妇人";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println(String.format("从后面接近 %s.", target));
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("拿起手提包，快速逃跑！");
    }

}
