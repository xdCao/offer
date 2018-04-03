package JianzhiOffer;

/**
 * created by xdCao on 2018/3/9
 */
// todo 反转链表
public class ReverseList {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {

        if (head==null){
            return null;
        }

        ListNode cur=head;
        ListNode pre=null;
        ListNode next=cur.next;
        while (next!=null){
            cur.next=pre;
            pre=cur;
            cur=next;
            next=next.next;
        }
        cur.next=pre;

        return cur;
    }


}
