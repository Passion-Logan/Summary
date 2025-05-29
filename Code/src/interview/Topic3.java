package interview;

import java.util.ArrayList;
import java.util.List;

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
public class Topic3 {

    public static void main(String[] args) {
        /**
         * 无重复字符的最长子串
         * 要求：
         * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
         *
         * 期望结果：
         * 输入: s = "abcabcbb"
         * 输出: 3
         * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
         * 输入: s = "bbbbb"
         * 输出: 1
         * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
         * 输入: s = ""
         * 输出: 0
         * 输入: s = "pwwkew"
         * 输出: 3
         * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
         *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
         */
        String target = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(target));
    }

    public static int lengthOfLongestSubstring(String target) {
        int result = 0;
        int maxLen = 0;
        int i = 0;
        List<Character> temp = new ArrayList<>(target.length());
        while (i < target.length()) {
            char c = target.charAt(i);

            if (!temp.contains(c)) {
                maxLen += 1;
            }


            i++;
        }

        return result;
    }
}
