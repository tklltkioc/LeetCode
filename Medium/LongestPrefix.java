package Leetcode.Medium;

/**
 *
 * Created by tktktkl on 2020/7/22 0:05
 */
public class LongestPrefix {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] strs = {"flower","flowe","floight"};
        String[] strs2 = {"aa","aa"};
        String[] strs3 = {"a"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix2(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int max = strs[0].length() - 1;
        for (int i = 1; i < strs.length; i++) {
            int index = -1;
            while (index < max && index <strs[i].length() - 1) {
                if (strs[0].charAt(index + 1) == strs[i].charAt(index + 1)) {
                    index++;
                } else {
                    break;
                }
            }
            if (index == -1) return "";
            max = index;
        }
        return strs[0].substring(0, max + 1);
    }
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0 ,i);
            }
        }
        return strs[0];
    }
}
