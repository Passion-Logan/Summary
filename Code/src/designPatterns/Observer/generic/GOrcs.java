package designPatterns.Observer.generic;

import designPatterns.Observer.WeatherType;

/**
 * @author wql
 * @desc GOrcs
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class GOrcs implements Race {

    @Override
    public void update(GWeather weather, WeatherType weatherType) {
        System.out.println("兽人现在面临 " + weatherType.getDescription() + " 的天气");
    }
}
