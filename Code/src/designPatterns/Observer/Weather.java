package designPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wql
 * @desc Weather
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class Weather {

    private WeatherType currentWeather;
    private final List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(WeatherObserver obs) {
        observers.remove(obs);
    }

    /**
     * 让时间随着天气而流逝。
     */
    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println(String.format("天气变成了 %s。", currentWeather));
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver obs : observers) {
            obs.update(currentWeather);
        }
    }

}
