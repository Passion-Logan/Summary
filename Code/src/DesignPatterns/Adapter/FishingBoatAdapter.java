package DesignPatterns.Adapter;

/**
 * 适配器类：
 * 把适配者接口转换成目标接口
 *
 * @author wql
 * @desc FishingBoatAdapter
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public class FishingBoatAdapter implements RowingBoat {

    private final FishingBoat boat = new FishingBoat();

    @Override
    public void row() {
        boat.sail();
    }
}
