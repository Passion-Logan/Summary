package designPatterns.Command;

public enum Visibility {

    VISIBLE("可见"),
    INVISIBLE("看不见的");

    private final String title;

    @Override
    public String toString() {
        return title;
    }

    Visibility(String title) {
        this.title = title;
    }
}
