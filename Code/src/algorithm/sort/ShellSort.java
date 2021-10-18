package algorithm.sort;

import java.util.Arrays;

/**
 * 希尔排序
 *
 * @author wql
 * @desc ShellSort
 * @date 2021/10/18
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/10/18
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 3, 5, 2};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));
    }

    /**
     * 定义一个增量m，集合的长度为n，则将集合拆分成n/m组，每组内部进行比较排序
     * 每组内比较的方法无要求，可以用插入或者二分法都行
     * 假如要排序一段集合为{4，1，2，3}，定义m为2，则拆分成两组两两比较，即为4和2比，1和3比
     * 因此按照1、2的思路每比较一次都可以将m组内的数值排序
     * 不断变化m的值，多次分组遍历之后即可排序
     *
     * @param arr arr
     * @return int[]
     */
    public static int[] sort(int[] arr) {
        if (arr == null)
            return null;
        int len = arr.length;//数组的长度
        int k = len / 2;//初始的增量为数组长度的一半
        //while循环控制按增量的值来划不同分子序列，每完成一次增量就减少为原来的一半
        //增量的最小值为1，即最后一次对整个数组做直接插入排序
        while (k > 0) {
            //里边其实就是升级版的直接插入排序了，是对每一个子序列进行直接插入排序，
            //所以直接将直接插入排序中的‘1’变为‘k’就可以了。
            for (int i = k; i < len; i++) {
                int j = i;
                int target = arr[i];
                while (j >= k && target < arr[j - k]) {
                    arr[j] = arr[j - k];
                    j -= k;
                }
                arr[j] = target;
            }
            //不同增量排序后的结果
            System.out.println("增量为" + k + "排序之后：" + Arrays.toString(arr));
            k /= 2;
        }
        return arr;
    }
}
