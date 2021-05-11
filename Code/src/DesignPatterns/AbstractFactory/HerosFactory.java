package DesignPatterns.AbstractFactory;

import java.util.HashMap;

/**
 * 具体工厂
 *
 * @Author: WQL //作者及
 * @Date: 2019/8/18 11:39//完成日期
 * @Description: // 描述
 * @Version: v0.0.1 // 版本信息
 * @Function List: // 主要函数及其功能
 * @Others: // 其它内容的说明
 * @History: // 历史修改记录
 */
public class HerosFactory extends HeroAndSkillFactory {

    private HashMap<String, Heros> herosMap = new HashMap<>();

    HerosFactory() {
        herosMap.put("Ashe", new HeroAshe());
        herosMap.put("MasterYi", new HeroMasterYi());
    }

    @Override
    public Heros getHeros(String heroType) {
        return (Heros) herosMap.get(heroType).clone();
    }

    @Override
    public Skills getSkills(String skillType) {
        return null;
    }
}
