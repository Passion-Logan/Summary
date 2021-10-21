package algorithm.sort;

import java.util.Arrays;

/**
 * 堆排序
 *
 * @author wql
 * @desc HeapSort
 * @date 2021/10/19
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/10/19
 */
public class HeapSort {

    private static int[] array = {23, 11, 7, 29, 33, 59, 20, 3, 3, 2, 6, 10, 44, 83, 28, 5, 1, 0, 36};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        sort();
    }

    /**
     * 将数组构建成大堆二叉树，即所有节点的父节点的值都大于叶子节点的完全二叉树
     * 若叶子节点比父节点大，则交换位置
     * 根节点即为最大值，则将根节点与最后的的一个叶子节点交换位置
     * 重复1，2操作，每次都找最大值则放置最后即可排序完成
     */
    private static void sort() {
        // 先构建一次大堆二叉树，做一个基本的排序
        buildMaxHeap();
        System.out.println("构建过后的:" + Arrays.toString(array));

        for (int i = array.length - 1; i > 0; i--) {
            // 将最大值与最后一个位置的数交换
            exchangeValue(0, i);
            // 重新构建大堆二叉树，从0开始往下检测是否需要重新构建大堆
            maxHeap(i, 0);
            System.out.println("第" + (array.length - i) + "次排序:" + Arrays.toString(array));
        }
        ;
    }

    /**
     * 构建大堆二叉树，从最底层开始往上构建，最底层的父节点则是总长度的一半
     */
    private static void buildMaxHeap() {
        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            maxHeap(length, i);
        }
    }

    /**
     * 构建大堆二叉树的节点，若修改了顺序，则递归重新构建下一层
     *
     * @param length 构建数据数组长度
     * @param node   构建堆排序的父节点
     */
    private static void maxHeap(int length, int node) {
        int left = 2 * node + 1;
        int right = 2 * node + 2;
        // 找到一个节点和他的孩子节点中的最大值下标
        int maxIndex = node;
        if (left < length && array[left] > array[maxIndex]) {
            maxIndex = left;
        }
        if (right < length && array[right] > array[maxIndex]) {
            maxIndex = right;
        }

        // 如果不是父节点最大，则跟最大的孩子节点交换
        if (maxIndex != node) {
            exchangeValue(node, maxIndex);
            maxHeap(length, maxIndex);
        }
    }

    /**
     * 交换两个下标的数值
     *
     * @param first  第一个下标
     * @param second 第二个下标
     */
    private static void exchangeValue(int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
