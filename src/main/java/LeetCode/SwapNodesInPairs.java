package LeetCode;

import java.util.List;

/*交换链表中的每两个相邻节点*/
public class SwapNodesInPairs {

    public static void main(String[] args) {

        Common.ListNode listNode = Common.createNodeList(new int[]{1, 2, 3, 4, 5, 6, 7});

        Common.ListNode head=solution(listNode);

        Common.printNodeList(head);

    }

    private static Common.ListNode solution(Common.ListNode listNode) {

        Common.ListNode vHead=new Common.ListNode(0);
        vHead.next=listNode;

        Common.ListNode pre=vHead;
        Common.ListNode node1=vHead.next;
        Common.ListNode node2=node1.next;
        Common.ListNode next=node2.next;

        while (true){

            node1.next=next;
            pre.next=node2;
            node2.next=node1;

            pre=node1;
            node1=pre.next;

            if (node1==null)
                break;

            if (node1.next!=null){
                node2=node1.next;
                next=node2.next;
            }else {
                break;
            }

        }

        return vHead.next;

    }

}
