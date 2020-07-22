package Leetcode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by tktktkl on 2020/7/22 22:28
 */
public class Combminition {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main (String[] args) {
        int[] num = new int[]{10,1,2,7,6,1,5};
        combinationSum2(num, 8);
        System.out.println();

    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        Arrays.sort(num);
        ArrayList<Integer> list = new ArrayList<>();
        backtrack(num, target, 0, list);
        return res;
    }
    public static void backtrack(int[] num ,int target, int start, ArrayList<Integer> list){
        if (target < 0) return;
        else if (target == 0){
            res.add(new ArrayList<>(list));
            return;
        }else {
            for (int i = start; i < num.length; i++) {
                if (i > start && num[i] == num[i - 1]) continue;
                list.add(num[i]);
                backtrack(num,target - num[i], i + 1, list);
                list.remove(list.size() - 1);
            }
        }

    }


}
