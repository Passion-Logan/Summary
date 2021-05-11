package DesignPatterns.FactoryMethod;

import java.util.function.Supplier;

public enum CarType {

    FORD(Ford::new),
    FERRARI(Ferrari::new);

    CarType(Supplier<Car> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Car> getConstructor() {
        return constructor;
    }

    private final Supplier<Car> constructor;

}
