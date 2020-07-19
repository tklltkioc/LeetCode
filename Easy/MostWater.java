package Leetcode.Easy;

import java.util.Scanner;

/**
 * container-with-most-water
 * Created by tktktkl on 2020/7/19 22:42
 */
public class MostWater {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] strings = str.substring(1,str.length()-1).split(",");
            int[] height = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                height[i] = Integer.parseInt(strings[i]);
            }
            int max = maxArea(height);
            System.out.println(max);
        }

    }
    public static int maxArea (int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        int temp = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                temp = (right - left) * height[left];
                if (temp > max)
                    max = temp;
                left++;
            }
            else  {
                temp = (right - left) * height[right];
                if (temp > max)
                    max = temp;
                right--;

            }

        }
        return max;
    }

}
