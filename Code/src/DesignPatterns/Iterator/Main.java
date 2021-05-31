package DesignPatterns.Iterator;

import DesignPatterns.Iterator.bst.BstIterator;
import DesignPatterns.Iterator.bst.TreeNode;
import DesignPatterns.Iterator.list.Item;
import DesignPatterns.Iterator.list.ItemType;
import DesignPatterns.Iterator.list.TreasureChest;

import static DesignPatterns.Iterator.list.ItemType.*;

/**
 * 迭代器模式：
 * 提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 * <p>
 * 迭代器（Iterator）模式的定义：提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。迭代器模式是一种对象行为型模式，其主要优点如下。
 * 访问一个聚合对象的内容而无须暴露它的内部表示。
 * 遍历任务交由迭代器完成，这简化了聚合类。
 * 它支持以不同方式遍历一个聚合，甚至可以自定义迭代器的子类以支持新的遍历。
 * 增加新的聚合类和迭代器类都很方便，无须修改原有代码。
 * 封装性良好，为遍历不同的聚合结构提供一个统一的接口。
 * <p>
 * 其主要缺点是：增加了类的个数，这在一定程度上增加了系统的复杂性。
 * <p>
 * 迭代器模式主要包含以下角色。
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合对象以及创建迭代器对象的接口。
 * 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 * 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、first()、next() 等方法。
 * 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 *
 * @author wql
 * @desc Main
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class Main {

    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    private static void demonstrateTreasureChestIteratorForType(ItemType itemType) {
        System.out.println("------------------------");
        System.out.println("ItemType " + itemType.getTitle() + " 的项目迭代器: ");
        Iterator<Item> itemIterator = TREASURE_CHEST.iterator(itemType);
        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next().toString());
        }
    }

    private static void demonstrateBstIterator() {
        System.out.println("------------------------");
        System.out.println("BST迭代器：");
        TreeNode<Integer> root = buildIntegerBst();
        BstIterator bstIterator = new BstIterator<>(root);
        while (bstIterator.hasNext()) {
            System.out.println("下一个节点：" + bstIterator.next().getVal());
        }
    }

    private static TreeNode<Integer> buildIntegerBst() {
        TreeNode root = new TreeNode<>(8);

        root.insert(3);
        root.insert(10);
        root.insert(1);
        root.insert(6);
        root.insert(14);
        root.insert(4);
        root.insert(7);
        root.insert(13);

        return root;
    }

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        demonstrateTreasureChestIteratorForType(RING);
        demonstrateTreasureChestIteratorForType(POTION);
        demonstrateTreasureChestIteratorForType(WEAPON);
        demonstrateTreasureChestIteratorForType(ANY);

        demonstrateBstIterator();
    }

}
