package LeetCode;

/* todo 虽然翻转链表非常基础,不过还是值得好好消化*/
public class ReverseList {

    public static void main(String[] args) {

        Common.ListNode listNode = Common.createNodeList(new int[]{1, 2, 3, 4, 5,6});
//
//        Common.ListNode listNode1 = solution1(listNode);
//
//        Common.printNodeList(listNode1);
//
//        Common.ListNode listNode2 = solution2(listNode);
//
//        Common.printNodeList(listNode2);

        Common.ListNode listNode3=solution3(listNode,2,4);

        Common.printNodeList(listNode3);

    }

    /*翻转从m到n的元素*/
    private static Common.ListNode solution3(Common.ListNode listNode, int m, int n) {

        Common.ListNode headPre=listNode;
        for (int i = 1; i < m-1; i++) {
            headPre=headPre.next;
        }

        Common.ListNode head=headPre.next;

        Common.ListNode pre=head;
        Common.ListNode cur=head.next;
        pre.next=null;


        for (int i = 1; i < (n-m)+1 ; i++) {

            Common.ListNode next = cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;

        }

        headPre.next=pre;

        while (pre.next!=null){
            pre=pre.next;
        }
        pre.next=cur;

        return listNode;




    }

    /*递归方式*/
    public static Common.ListNode solution1(Common.ListNode head){

        Common.ListNode pre=null;
        Common.ListNode cur=head;

        Common.ListNode reverse = reverse(head);

        return reverse;


    }

    public static Common.ListNode reverse(Common.ListNode head){

        if (head.next==null)
            return head;

        Common.ListNode next=head.next;
        Common.ListNode newHead = reverse(next);
        next.next=head;
        head.next=null;

        return newHead;
    }

    public static Common.ListNode solution2(Common.ListNode head){

        Common.ListNode pre=null;
        Common.ListNode cur=head;
        Common.ListNode next=cur.next;

        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }

        return pre;

    }

}
