package DesignPatterns.State;

/**
 * @author wql
 * @desc AngryState
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class AngryState implements State {

    private final Mammoth mammoth;

    public AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override
    public void observe() {
        System.out.println(String.format("%s 很生气!", mammoth));
    }

    @Override
    public void onEnterState() {
        System.out.println(String.format("%s 生气了！", mammoth));
    }

}
