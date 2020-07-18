package Leetcode.Medium;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 最长连续串
 * 输入：bbabbb
 * 输出：2
 * Created by tktktkl on 2020/7/17 0:00
 */
public class LongestChar {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String s = in.next();
            System.out.println(lengthOfLongestSubstring(s));
        }
    }

    public static int lengthOfLongestSubstring (String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            left = Math.max(left, ( map.containsKey(c) ? map.get(c) + 1 : 0 ));
            max = Math.max(i - left + 1, max);
            map.put(c, i);
        }
        return max;
    }
}
