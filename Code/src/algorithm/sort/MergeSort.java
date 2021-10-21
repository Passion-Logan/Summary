package algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author wql
 * @desc MergeSort
 * @date 2021/10/21
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/10/21
 */
public class MergeSort {

    private static int[] array = {23, 11, 7, 29, 33, 59, 8, 20, 9, 3, 2, 6, 10, 44, 83, 28, 5, 1, 0, 36};

    public static void main(String[] args) {
        int[] temp = new int[array.length];
        sort(temp, 0, array.length - 1);
        System.out.println(Arrays.toString(temp));
    }

    /**
     * 查分数组，如果数组不能拆分了，则直接返回，拆分之后合并
     */
    private static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        mergeArray(arr, start, mid + 1, end);
    }

    /**
     * 将数组array，以mid为中心，前后两个数组进行合并
     */
    private static void mergeArray(int[] temp, int start, int mid, int end) {

        // 定义指针下标，记录前后段是够可以继续移动
        int minA = start, minB = mid;
        for (int i = start; i <= end; i++) {
            if (minA >= mid || minB > end) {
                // 如果a或者b用完了，则直接用对方的
                if (minA >= mid) {
                    temp[i] = array[minB];
                    minB++;
                } else {
                    temp[i] = array[minA];
                    minA++;
                }
            } else {
                // 都没用完则比较大小
                if (array[minA] < array[minB]) {
                    temp[i] = array[minA];
                    minA++;
                } else {
                    temp[i] = array[minB];
                    minB++;
                }
            }
        }

        System.arraycopy(temp, start, array, start, end - start + 1);
    }

}
