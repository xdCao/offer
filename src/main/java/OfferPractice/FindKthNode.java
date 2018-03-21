package OfferPractice;

import java.util.List;

/**
 * created by xdCao on 2018/3/8
 */

public class FindKthNode {

    class ListNode{
        int val;
        ListNode next=null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode kNode=head;
        ListNode cur=head;
        int i=0;
        while (cur!=null){
            cur=cur.next;
            if (i>=k){
                kNode=kNode.next;
            }
            i++;
        }

        if (k>i){
            return null;
        }
        return kNode;
    }

}
