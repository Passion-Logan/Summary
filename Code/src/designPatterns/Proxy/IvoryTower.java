package designPatterns.Proxy;

/**
 * 真实主题
 *
 * @author wql
 * @desc IvoryTower
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public class IvoryTower implements WizardTower {

    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard.toString() + " 进入塔.");
    }

}
