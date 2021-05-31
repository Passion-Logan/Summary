package DesignPatterns.Iterator.list;

import DesignPatterns.Iterator.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wql
 * @desc TreasureChest
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class TreasureChest {

    private final List<Item> items;

    /**
     * Constructor.
     */
    public TreasureChest() {
        items = Arrays.asList(
                new Item(ItemType.POTION, "勇气药水"),
                new Item(ItemType.RING, "阴影之环"),
                new Item(ItemType.POTION, "智慧药水"),
                new Item(ItemType.POTION, "血药水"),
                new Item(ItemType.WEAPON, "银剑+1"),
                new Item(ItemType.POTION, "铁锈药水"),
                new Item(ItemType.POTION, "治疗药水"),
                new Item(ItemType.RING, "盔甲之戒"),
                new Item(ItemType.WEAPON, "钢戟"),
                new Item(ItemType.WEAPON, "毒之匕首"));
    }

    public Iterator<Item> iterator(ItemType itemType) {
        return new TreasureChestItemIterator(this, itemType);
    }

    /**
     * Get all items.
     */
    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

}
