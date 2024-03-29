package designPatterns.Memento;

/**
 * @author wql
 * @desc StarType
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public enum StarType {
    SUN("太阳"),
    RED_GIANT("红巨星"),
    WHITE_DWARF("白矮星"),
    SUPERNOVA("超新星"),
    DEAD("死星");

    private final String title;

    StarType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
