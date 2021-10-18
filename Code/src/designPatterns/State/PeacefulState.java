package designPatterns.State;

/**
 * @author wql
 * @desc PeacefulState
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class PeacefulState implements State {

    private final Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        System.out.println(String.format("%s 平静而祥和。", mammoth));
    }

    @Override
    public void onEnterState() {
        System.out.println(String.format("%s 冷静下来。", mammoth));
    }
}
