package designPatterns.Builder;

public enum HairColor {

    WHITE("白色的"),
    BLOND("金色的"),
    RED("红色的"),
    BROWN("棕色的"),
    BLACK("黑色的");

    private final String color;

    HairColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

}
