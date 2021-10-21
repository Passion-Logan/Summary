package algorithm.sort;

import java.util.Arrays;

/**
 * 基数排序
 *
 * @author wql
 * @desc RadixSort
 * @date 2021/10/21
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/10/21
 */
public class RadixSort {

    private static int[] array = {23, 11, 7, 29, 33, 59, 8, 20, 9, 3, 2, 6, 10, 44, 83, 28, 5, 1, 0, 36};

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(sort(array)));
        System.out.println(Arrays.toString(countSort(array)));
    }

    /**
     * 基数排序，先按个位将所有数字按照个位的值放入0-9的二维数组中，依次取出之后再按十位
     * 如此循环直至个十百千等等所有位数遍历完为止
     */
    private static int[] sort(int[] arr) {
        // 定义二位数组用来存储每个基数以及基数下的数值
        int[][] temp;

        // 定义一维数组记录基数下保存了几位
        int[] position;

        int radix = 1;

        while (true) {
            position = new int[10];
            temp = new int[10][arr.length];

            for (int i = 0; i < arr.length; i++) {
                int value = (arr[i] / radix) % 10;
                temp[value][position[value]] = arr[i];
                position[value]++;
            }

            // 判断是否所有的数值都在0位上，都在0位上则表示排序完成
            if (position[0] == arr.length) {
                break;
            }

            int index = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < position[i]; j++) {
                    arr[index] = temp[i][j];
                    index++;
                }
            }

            radix = radix * 10;
        }
        return arr;
    }

    public static int[] countSort(int[] arr) {
        if (arr == null)
            return null;
        int len = arr.length;
        //保存待排序数组中的最大值，目的是确定临时数组的长度（必须）
        int maxNum = arr[0];
        //保存待排序数组中的最小值，目的是确定最终遍历临时数组时下标的初始值（非必需，只是这样可以加快速度，减少循环次数）
        int minNum = arr[0];
        //for循环就是为了找到待排序数组的最大值和最小值
        for (int i = 1; i < len; i++) {
            maxNum = maxNum > arr[i] ? maxNum : arr[i];
            minNum = minNum < arr[i] ? minNum : arr[i];
        }
        //创建一个临时数组
        int[] temp = new int[maxNum + 1];
        //for循环是为了记录待排序数组中每个元素出现的次数，并将该次数保存到临时数组中
        for (int i = 0; i < len; i++) {
            temp[arr[i]]++;
        }
        //k=0用来记录待排序数组的下标
        int k = 0;
        //遍历临时数组，重新为待排序数组赋值。
        for (int i = minNum; i < temp.length; i++) {
            while (temp[i] > 0) {
                arr[k++] = i;
                temp[i]--;
            }
        }

        return arr;
    }

}
