package CoderGuide.List;

import LeetCode.ListNode;

/**
 * created by xdCao on 2018/4/2
 */

public class DeleteNode {

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        listNode.next.next.next=new ListNode(4);
        listNode.next.next.next.next=new ListNode(5);
        listNode.next.next.next.next.next=new ListNode(6);
        listNode.next.next.next.next.next.next=new ListNode(7);

        ListNode listNode1 = deleteNode(listNode, 7);
        while (listNode1!=null){
            System.out.println(listNode1.val);
            listNode1=listNode1.next;
        }


    }

    private static ListNode deleteNode(ListNode head, int k) {

        ListNode kth=head;
        int temp=1;
        while (kth!=null&&temp<k){
            kth=kth.next;
            temp++;
        }

        if (kth==null){
            return head;
        }
        if (kth.next==null)
            return head.next;
        else{
            ListNode del=head;
            while (kth.next!=null){
                del=del.next;
                kth=kth.next;
            }
            del.val=del.next.val;
            del.next=del.next.next;
            return head;
        }






    }


}
