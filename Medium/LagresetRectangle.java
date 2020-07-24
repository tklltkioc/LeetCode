package Leetcode.Medium;

/**
 * 最大矩形
 * Created by tktktkl on 2020/7/24 22:49
 */
public class LagresetRectangle {
    public static void main (String[] args) {
        int[] height = new int[]{2};
        System.out.println(largestRectangleArea(height));
    }

    public static int largestRectangleArea (int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int result = 0;
        int high;
        for (int i = 0; i < height.length; i++) {
            if (!( i < height.length - 1 && height[i] < height[i + 1] )) {
                high = height[i];
                for (int j = i; j >= 0; j--) {
                    high = Math.min(high, height[j]);
                    int temp = high * ( i - j + 1 );
                    result = Math.max(temp, result);
                }
            }
        }
        return result;
    }
}