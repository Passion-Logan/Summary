package DesignPatterns.Builder;

public enum HairType {

    BALD("光秃秃的"),
    SHORT("短的"),
    CURLY("卷曲的"),
    LONG_STRAIGHT("长直的"),
    LONG_CURLY("长卷的");

    private final String title;

    HairType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
