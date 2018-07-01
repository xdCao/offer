package LeetCode;

import org.w3c.dom.NodeList;

public class RemoveDuplicatedInList {

    public static void main(String[] args) {

        Common.ListNode nodeList = Common.createNodeList(new int[]{1,1,1, 2, 2, 2,2, 3, 4, 5, 5, 5});

        Common.ListNode nodeList1=solution(nodeList);

        Common.printNodeList(nodeList1);


    }

    private static Common.ListNode solution(Common.ListNode nodeList) {

        Common.ListNode pre=nodeList;
        Common.ListNode cur=nodeList.next;

        while (cur!=null){

            if (cur.value==pre.value){
                pre.next=cur.next;
                cur=cur.next;
            }else {
                pre=cur;
                cur=cur.next;
            }

        }

        return nodeList;

    }

}
