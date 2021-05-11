package DesignPatterns.AbstractFactory;

/**
 * 具体产品
 *
 * @Author: WQL //作者及
 * @Date: 2019/8/18 11:36//完成日期
 * @Description: // 描述
 * @Version: v0.0.1 // 版本信息
 * @Function List: // 主要函数及其功能
 * @Others: // 其它内容的说明
 * @History: // 历史修改记录
 */
public class SkillSword implements Skills {
    @Override
    public Object clone() {
        SkillSword skillSword = null;
        try {
            skillSword = (SkillSword) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return skillSword;
    }

    @Override
    public void useSkill() {
        System.out.println("该英雄使用了 - 无极剑道");
    }
}
