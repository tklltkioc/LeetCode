package Leetcode.Medium;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 三数之和最接近目标值
 * 输入：[0,0,0],1
 * 输出：0
 * Created by tktktkl on 2020/7/18 21:40
 */
public class ThreeSumClosest {
    public static void main (String[] args) {
        int[] num = new int[]{0,1,2};
        int res = threeSumClosest(num,0);
        System.out.println(res);
    }

    public static int threeSumClosest (int[] num, int target) {
        // write code here
        if (num == null || num.length <3) return 0;
        Arrays.sort(num);
        int res = 0;
        int closest = num[0] + num[1] + num[2];
        for (int i = 0; i< num.length - 2; i++){
            int start = i + 1;
            int end = num.length - 1;
            while (start < end) {
                res = num[i] + num[start] + num[end];
                if (res < target) start++;
                else end--;
            }
            if (Math.abs(res - target) < Math.abs(closest - target)) closest = res;
        }
        return closest;
    }

}
