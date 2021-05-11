package DesignPatterns.Adapter;

/**
 * 适配者类
 *
 * @author wql
 * @desc Captain
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public class Captain {

    private RowingBoat rowingBoat;

    public Captain() {
    }

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void setRowingBoat(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    void row() {
        rowingBoat.row();
    }

}
