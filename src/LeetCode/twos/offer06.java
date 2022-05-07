package LeetCode.twos;

import LeetCode.Utils.ListNode;

public class offer06 {
    public transient int a;
    public int[] reversePrint(ListNode head) {
        if(head == null) return null;
        // 链表的长度
        int length = 0;
        ListNode tempNode = head;
        while(tempNode != null) {
            length++;
            tempNode = tempNode.next;
        }
        int[] nums = new int[length];
        tempNode = head;
        while(tempNode != null) {
            if(length >= 0)
                length --;
            nums[length] = tempNode.val;
        }
        return nums;
    }
}
