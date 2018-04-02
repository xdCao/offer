package CoderGuide.List;

import LeetCode.ListNode;

/**
 * created by xdCao on 2018/4/2
 */

public class ReverseList {


    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        listNode.next.next.next.next.next=new ListNode(6);
        ListNode reverse = reverse(listNode);
        while (reverse!=null){
            System.out.println(reverse.val);
            reverse=reverse.next;
        }
    }

    private static ListNode reverse(ListNode listNode) {

        ListNode pre=null;
        ListNode next=null;

        while (listNode!=null){
            next=listNode.next;
            listNode.next=pre;
            pre=listNode;
            listNode=next;
        }

        return pre;

    }


}
