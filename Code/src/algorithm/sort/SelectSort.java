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
     * @param arr arr
     * @return int[]
     */
    public static int[] sort(int[] arr) {
        if (arr == null)
            return null;
        int len = arr.length;
        //i控制循环次数，长度为len的数组只需要循环len-1次，i的起始值为0所以i<len-1
        for (int i = 0; i < len - 1; i++) {
            //minIndex 用来保存每次比较后较小数的下标。
            int minIndex = i;
            //j控制比较次数，因为每次循环结束之后最小的数都已经放在了最前面，
            //所以下一次循环的时候就可以跳过这个数，所以j的初始值为i+1而不需要每次循环都从0开始，并且j<len即可
            for (int j = i + 1; j < len; j++) {
                //每比较一次都需要将较小数的下标记录下来
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            //当完成一次循环时，就需要将本次循环选取的最小数移动到本次循环开始的位置。
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            //打印每次循环结束之后数组的排序状态（方便理解）
            System.out.println("第" + (i + 1) + "次循环之后效果：" + Arrays.toString(arr));
        }
        return arr;
    }
}
