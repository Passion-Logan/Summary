package designPatterns.AbstractFactory;

/**
 * 具体产品
 *
 * @Author: WQL //作者及
 * @Date: 2019/8/18 11:32//完成日期
 * @Description: // 描述
 * @Version: v0.0.1 // 版本信息
 * @Function List: // 主要函数及其功能
 * @Others: // 其它内容的说明
 * @History: // 历史修改记录
 */
public class HeroMasterYi implements Heros {
    @Override
    public Object clone() {
        HeroMasterYi heroMasterYi = null;
        try {
            heroMasterYi = (HeroMasterYi) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return heroMasterYi;
    }

    @Override
    public void haveHero() {
        System.out.println("尊敬的召唤师，你已经拥有 无极剑圣-易大师");
    }
}
