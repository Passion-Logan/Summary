package algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author wql
 * @desc SelectSort
 * @date 2021/10/18
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/10/18
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 3, 5, 2};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));

    }

    /**
     * 1. 从待排序序列中，找到关键字最小的元素；
     * 2. 如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换；
     * 3. 从余下的 N - 1 个元素中，找出关键字最小的元素，重复1、2步，直到排序结束。
     *
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                arr[min] = arr[i] + arr[min];
                arr[i] = arr[min] - arr[i];
                arr[min] = arr[min] - arr[i];
            }
        }
        return arr;
    }
}
