package DesignPatterns.Command;

/**
 * @author wql
 * @desc Target
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public abstract class Target {

    private Size size;

    private Visibility visibility;


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    /**
     * 打印状态。
     */
    public void printStatus() {
        System.out.println(String.format("%s, [大小=%s] [能见度=%s]", this, getSize(), getVisibility()));
    }

    /**
     * 更改目标的大小。
     */
    public void changeSize() {
        Size oldSize = getSize() == Size.NORMAL ? Size.SMALL : Size.NORMAL;
        setSize(oldSize);
    }

    /**
     * 更改目标的可见性。
     */
    public void changeVisibility() {
        Visibility visible = getVisibility() == Visibility.INVISIBLE
                ? Visibility.VISIBLE : Visibility.INVISIBLE;
        setVisibility(visible);
    }

}
