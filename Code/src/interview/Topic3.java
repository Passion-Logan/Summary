package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @File Name: interview
 * @Author: WQL //作者及
 * @Date: 2019/8/28 17:54//完成日期
 * @Description: // 描述
 * @Version: v0.0.1 // 版本信息
 * @Function List: // 主要函数及其功能
 * @Others: // 其它内容的说明
 * @History: // 历史修改记录
 */
public class Topic3
{

    public static void main(String[] args)
    {
        /**
         * 两数之和
         * 要求：
         * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
         * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
         * 期望结果：
         * 给定 nums = [2, 7, 11, 15], target = 9
         * 因为 nums[0] + nums[1] = 2 + 7 = 9
         * 所以返回 [0, 1]
         */
        int[] nums = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 17)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        // 思路一 双重for循环
        /*for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (first + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }*/

        // 思路二 使用map
        Map<Integer, Integer> temp = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (temp.containsKey(nums[i])) {
                result[0] = temp.get(nums[i]);
                result[1] = i;
                break;
            }
            temp.put(target - nums[i], i);
        }

        // 思路三 Bit
        /*int volume = 2048;
        int bitMode = volume - 1;
        int[] t = new int[volume];
        for (int i = 0; i < nums.length; i++) {
            int c = (target - nums[i]) & bitMode;
            if (t[c] != 0) return new int[]{t[c] - 1, i};
            t[nums[i] & bitMode] = i + 1;
        }
        return new int[]{-1, -1};*/

        return result;
    }
}
