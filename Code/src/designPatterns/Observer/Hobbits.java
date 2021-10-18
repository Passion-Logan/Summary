package designPatterns.Observer;

/**
 * @author wql
 * @desc Hobbits
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class Hobbits implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        System.out.println(String.format("霍比特人现在面临 %s 的天气", currentWeather.getDescription()));
    }

}
