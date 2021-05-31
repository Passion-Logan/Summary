package DesignPatterns.Command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wql
 * @desc Wizard
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class Wizard {

    private final Deque<Runnable> undoStack = new LinkedList<>();
    private final Deque<Runnable> redoStack = new LinkedList<>();

    public Wizard() {
    }

    /**
     * 施法。
     */
    public void castSpell(Runnable runnable) {
        runnable.run();
        undoStack.offerLast(runnable);
    }

    /**
     * 撤消最后一个咒语。
     */
    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Runnable previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);
            previousSpell.run();
        }
    }

    /**
     * 重做最后一个咒语。
     */
    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Runnable previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);
            previousSpell.run();
        }
    }

    @Override
    public String toString() {
        return "巫师";
    }

}
