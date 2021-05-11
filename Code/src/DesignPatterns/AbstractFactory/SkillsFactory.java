package DesignPatterns.AbstractFactory;

import java.util.HashMap;

/**
 * 具体工厂
 *
 * @Author: WQL //作者及
 * @Date: 2019/8/18 11:44//完成日期
 * @Description: // 描述
 * @Version: v0.0.1 // 版本信息
 * @Function List: // 主要函数及其功能
 * @Others: // 其它内容的说明
 * @History: // 历史修改记录
 */
public class SkillsFactory extends HeroAndSkillFactory {

    private HashMap<String, Skills> map = new HashMap<>();

    SkillsFactory() {
        map.put("Arrow", new SkillArrow());
        map.put("Sword", new SkillSword());
    }

    @Override
    public Heros getHeros(String heroType) {
        return null;
    }

    @Override
    public Skills getSkills(String skillType) {
        return (Skills) map.get(skillType).clone();
    }
}
