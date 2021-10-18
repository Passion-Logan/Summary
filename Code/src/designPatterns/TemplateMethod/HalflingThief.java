package designPatterns.TemplateMethod;

/**
 * 钩子方法
 *
 * @author wql
 * @desc HalflingThief
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class HalflingThief {

    private StealingMethod method;

    public HalflingThief(StealingMethod method) {
        this.method = method;
    }

    public void steal() {
        method.steal();
    }

    public void changeMethod(StealingMethod method) {
        this.method = method;
    }

}
