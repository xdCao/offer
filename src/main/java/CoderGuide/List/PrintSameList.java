package CoderGuide.List;

import LeetCode.ListNode;

/**
 * created by xdCao on 2018/4/2
 */

public class PrintSameList {

    public static void main(String[] args) {
        ListNode listNode1=new ListNode(1);
        listNode1.next=new ListNode(3);
        listNode1.next.next=new ListNode(4);
        listNode1.next.next.next=new ListNode(5);
        ListNode listNode2=new ListNode(2);
        listNode2.next=new ListNode(1);
        listNode2.next.next=new ListNode(4);
        listNode2.next.next.next=new ListNode(5);
        print(listNode1,listNode2);

    }

    public static void print(ListNode listNode1,ListNode listNode2){

        ListNode cur=listNode1;
        int num1=0;
        while (cur!=null){
            cur=cur.next;
            num1++;
        }
        int num2=0;
        cur=listNode2;
        while (cur!=null){
            cur=cur.next;
            num2++;
        }

        ListNode cur1=listNode1;
        ListNode cur2=listNode2;
        if (num1>=num2){
            cur1=listNode1;
            for (int i = 0; i < num1-num2; i++) {
                cur1=cur1.next;
            }
            while (cur1.val!=cur2.val){
                cur1=cur1.next;
                cur2=cur2.next;
            }
            while (cur1!=null){
                System.out.println(cur1.val);
                cur1=cur1.next;
            }
        }else {
            cur2=listNode2;
            for (int i = 0; i < num2-num1; i++) {
                cur2=cur2.next;
            }
            while (cur1.val!=cur2.val){
                cur1=cur1.next;
                cur2=cur2.next;
            }
            while (cur2!=null){
                System.out.println(cur2.val);
                cur2=cur2.next;
            }
        }


    }


}
