package DesignPatterns.Builder;

public enum Armor {

    CLOTHES("衣服"),
    LEATHER("皮革"),
    CHAIN_MAIL("锁子甲"),
    PLATE_MAIL("金甲");

    private final String title;

    Armor(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
