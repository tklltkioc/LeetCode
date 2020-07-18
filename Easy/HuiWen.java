package Leetcode.Easy;

import java.util.Scanner;

/**
 * PalindromeNumber
 * 输入：121
 * 输出：true
 * Created by tktktkl on 2020/7/14 23:43
 */
public class HuiWen {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x<0 || x!=0 && x % 10==0){
            return false;
        }
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x /=10;
        }
        return (res == x || res / 10 ==x);

    }
}
