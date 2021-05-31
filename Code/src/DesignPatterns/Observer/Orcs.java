package DesignPatterns.Observer;

/**
 * @author wql
 * @desc Orcs
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class Orcs implements  WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        System.out.println("兽人现在面临 " + currentWeather.getDescription() + " 的天气");
    }

}
