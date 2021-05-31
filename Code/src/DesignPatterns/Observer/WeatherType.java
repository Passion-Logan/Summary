package DesignPatterns.Observer;

public enum WeatherType {

    SUNNY("太阳的"),
    RAINY("多雨的"),
    WINDY("刮风的"),
    COLD("寒冷的");

    private final String description;

    WeatherType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.description;
    }

}
