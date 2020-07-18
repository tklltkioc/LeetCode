package Leetcode.Easy;

import java.util.Scanner;

/**
 * reverse-integer
 * 输入：-123
 * 输出：-321
 * Created by tktktkl on 2020/7/13 23:36
 */
public class ReversInteger {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.nextInt()));
    }
    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int tail = x % 10;
            int newRes = res * 10 + tail;
            if ((newRes - tail) / 10 != res) {
                return 0;
            }
            res = newRes;
            x = x / 10;
        }
        return res;
    }
}
