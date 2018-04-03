package JianzhiOffer;

/**
 * created by xdCao on 2018/3/12
 */
// todo 找出两个链表中相同的节点
public class SameListNode {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if (pHead1==null||pHead2==null){
            return null;
        }

        int m=0;
        int n=0;
        ListNode cur=pHead1;
        while (cur!=null){
            cur=cur.next;
            m++;
        }
        ListNode cur2=pHead2;
        while (cur2!=null){
            cur2=cur2.next;
            n++;
        }

        cur=pHead1;
        cur2=pHead2;
        if (m<n){
            for (int i = 0; i <n-m; i++) {
                cur2=cur2.next;
            }
        }else if (m>n){
            for (int i = 0; i <m-n; i++) {
                cur=cur.next;
            }
        }

        while (cur!=null){
            if (cur==cur2){
                return cur;
            }else {
                cur=cur.next;
                cur2=cur2.next;
            }
        }

        return null;



    }

}
