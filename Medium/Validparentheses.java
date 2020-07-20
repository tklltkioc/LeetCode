package Leetcode.Medium;

import java.util.*;

/**
 * Created by tktktkl on 2020/7/20 23:46
 */
public class Validparentheses {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            System.out.println(isValid(s));
        }
    }
    public static boolean isValid (String s) {
        // write code here
        Stack<Character> stack = new Stack<>();
        char[] strings = s.toCharArray();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == '(') {
                stack.push(')');
            }else if (strings[i] == '[') {
                stack.push(']');
            }else if (strings[i] == '{'){
                stack.push('}');
            }else if (stack.isEmpty() || stack.pop() != strings[i]){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
