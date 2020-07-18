package Leetcode.Easy;

import java.util.Scanner;

/**
 * Integer-To-Roman
 * 输入：1
 * 输出："I"
 * Created by tktktkl on 2020/7/15 23:13
 */
public class IntegerToRoman {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int x = in.nextInt();
            System.out.println(intToRoman(x));
        }
    }
    public static String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] strs = {"M","CM","D","CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >=values[i]){
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }

}
