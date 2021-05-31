package DesignPatterns.State;

/**
 * @author wql
 * @desc Mammoth
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class Mammoth {

    private State state;

    public Mammoth() {
        state = new PeacefulState(this);
    }

    /**
     * Makes time pass for the mammoth.
     */
    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            changeStateTo(new AngryState(this));
        } else {
            changeStateTo(new PeacefulState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.onEnterState();
    }

    @Override
    public String toString() {
        return "猛犸象";
    }

    public void observe() {
        this.state.observe();
    }

}
