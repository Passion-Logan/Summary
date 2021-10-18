package designPatterns.Builder;

public enum Profession {

    WARRIOR("战士"), THIEF("刺客"), MAGE("法师"), PRIEST("牧师");

    private final String name;

    Profession(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
