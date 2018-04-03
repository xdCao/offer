package JianzhiOffer;

/**
 * created by xdCao on 2018/3/12
 */
// todo 找链表中环的入口节点
public class LoopList {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {

        if (pHead==null){
            return null;
        }
        ListNode p1=pHead;
        ListNode p2=pHead;

        int index=0;
        while (p2.next!=null){
            if (index!=0&&p1==p2){
                break;
            }
            p1=p1.next;
            p2=p2.next;
            if (p2.next!=null){
                p2=p2.next;
            }else {
                break;
            }
            index++;
        }

        if(index==0){
            return null;
        }

        p1=pHead;
        p2=pHead;
        for (int i = 0; i < index; i++) {
            p1=p1.next;
        }

        while(p1!=p2){
            p2=p2.next;
            p1=p1.next;
        }

        return p2;

    }


}
