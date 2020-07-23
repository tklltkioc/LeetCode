package Leetcode.Easy;
import java.util.*;

class ListNode {
    int val;
    ListNode next = null;
}

/**
 * 删除相同值链表节点
 * Created by tktktkl on 2020/7/23 22:07
 */
public class RemoveDupListnode {
    public static void main (String[] args) {
        ListNode node = new ListNode();
        node.val = 1;
        ListNode node2 = new ListNode();
        node.next = node2;
        node2.val = 1;
        ListNode node3 = new ListNode();
        node2.next = node3;
        node3.val = 2;
        deleteDuplicates(node);
        System.out.println();
    }
    public static ListNode deleteDuplicates (ListNode head) {
        // write code here
        ListNode cur = head;
        while (cur != null) {
            while (cur.next != null && cur.next.val == cur.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }

}
