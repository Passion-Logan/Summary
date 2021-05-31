package DesignPatterns.Command;

public enum Size {

    SMALL("小"),
    NORMAL("正常");

    private final String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
