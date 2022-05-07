package tx;

public class test01 {
    public ListNode solve (ListNode S) {
        // write code here
        ListNode p = S.next;
        int min = S.val;
        ListNode curNode = S;
        while (p!= null) {
            if (min >= p.val) {
                min = p.val;
                curNode = p;
            }
            p = p.next;
        }
        //q是最后一个节点
        ListNode q = S;
        while (q.next != null) {
            q = q.next;
        }
        q.next = S;
        ListNode head = S;
        while (head.next != curNode) {
            head = head.next;
        }
        head.next = null;
        return curNode;
    }
}
