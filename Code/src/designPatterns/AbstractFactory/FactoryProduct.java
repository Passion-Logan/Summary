package designPatterns.AbstractFactory;

import java.util.function.Supplier;

/**
 * @File Name: DesignPatterns.AbstractFactory
 * @Author: WQL //作者及
 * @Date: 2019/8/18 11:46//完成日期
 * @Description: // 描述
 * @Version: v0.0.1 // 版本信息
 * @Function List: // 主要函数及其功能
 * @Others: // 其它内容的说明
 * @History: // 历史修改记录
 */
public enum FactoryProduct {

    HerosFactory(HerosFactory::new),
    SkillsFactory(SkillsFactory::new);

    public Supplier<HeroAndSkillFactory> getConstructor() {
        return constructor;
    }

    FactoryProduct(Supplier<HeroAndSkillFactory> constructor) {
        this.constructor = constructor;
    }

    private final Supplier<HeroAndSkillFactory> constructor;

}
