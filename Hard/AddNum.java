package Leetcode.Hard;

/**
 * 链表数目之和
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出： 7 -> 0 -> 8
 * Created by tktktkl on 2020/7/17 23:35
 */
class ListNode {
    int val;
    ListNode next = null;
    
}
public class AddNum {

    public static void main (String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 5;
        ListNode l2 =new ListNode();
        l2 =l1.next;
        l2.val = 5;
        ListNode r1 = new ListNode();
        r1.val = 5;
        ListNode r2 = new ListNode();
        r2 = r1.next;
        r2.val = 5;
        addTwoNumbers(l1,l2);
        System.out.println(addTwoNumbers(l1,l2).val);

    }
    public static ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        // write code here
        if (l1 == null && l2 == null){
            return null;
        }
        else if (l1 == null){
            return l2;
        }
        else if (l2 == null){
            return l1;
        }
        else {
            ListNode newHead = new ListNode();
            newHead.val = 0;
            ListNode p = newHead;
            int temp = 0;
            while (l1!=null || l2!= null || temp !=0){
                if (l1!=null){
                    temp +=l1.val;
                    l1=l1.next;
                }
                if (l2!=null){
                    temp +=l2.val;
                    l2=l2.next;
                }
                p.next = new ListNode();
                p.next.val = temp%10;
                temp /= 10;
            }
            return newHead.next;
        }
    }

}
