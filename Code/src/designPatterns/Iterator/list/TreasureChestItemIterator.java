package designPatterns.Iterator.list;

import designPatterns.Iterator.Iterator;

import java.util.List;

/**
 * @author wql
 * @desc TreasureChestItemIterator
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class TreasureChestItemIterator implements Iterator<Item> {

    private final TreasureChest chest;
    private int idx;
    private final ItemType type;

    /**
     * Constructor.
     */
    public TreasureChestItemIterator(TreasureChest chest, ItemType type) {
        this.chest = chest;
        this.type = type;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Item next() {
        idx = findNextIdx();
        if (idx != -1) {
            return chest.getItems().get(idx);
        }
        return null;
    }

    private int findNextIdx() {
        List<Item> items = chest.getItems();
        int tempIdx = idx;
        while (true) {
            tempIdx++;
            if (tempIdx >= items.size()) {
                tempIdx = -1;
                break;
            }
            if (type.equals(ItemType.ANY) || items.get(tempIdx).getType().equals(type)) {
                break;
            }
        }
        return tempIdx;
    }
}
