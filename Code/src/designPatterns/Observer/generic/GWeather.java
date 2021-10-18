package designPatterns.Observer.generic;

import designPatterns.Observer.WeatherType;

/**
 * @author wql
 * @desc GWeather
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class GWeather extends Observable<GWeather, Race, WeatherType> {

    private WeatherType currentWeather;

    public GWeather() {
        currentWeather = WeatherType.SUNNY;
    }

    /**
     * 让时间随着天气而流逝。
     */
    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println(String.format("天气更改为 %s。", currentWeather));
        notifyObservers(currentWeather);
    }
}
