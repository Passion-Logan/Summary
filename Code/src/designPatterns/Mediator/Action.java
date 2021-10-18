package designPatterns.Mediator;

public enum Action {

    HUNT("猎杀了一只兔子", "来吃晚饭"),
    TALE("讲故事", "来听"),
    GOLD("发现黄金", "拿走他的那份黄金"),
    ENEMY("发现敌人", "掩护"),
    NONE("", "");

    private final String title;
    private final String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title;
    }

}
