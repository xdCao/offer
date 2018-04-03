package JianzhiOffer;

/**
 * created by xdCao on 2018/3/9
 */

public class MergeList {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode Merge(ListNode list1,ListNode list2) {

        ListNode head=null;
        ListNode newNode=null;
        ListNode node1=list1;
        ListNode node2=list2;

        if (node1==null&&node2==null){
            return null;
        }

        if (node1==null){
            return list2;
        }
        if (node2==null){
            return list1;
        }

        if (node1.val<=node2.val){
            newNode=node1;
            head=node1;
            node1=node1.next;
        }else {
            newNode=node2;
            head=node2;
            node2=node2.next;
        }

        while (true){
            if (node1!=null&&node2!=null){
                if (node1.val<=node2.val){
                    newNode.next=node1;
                    newNode=newNode.next;
                    node1=node1.next;
                }else if (node1.val>node2.val){
                    newNode.next=node2;
                    newNode=newNode.next;
                    node2=node2.next;
                }
            }else {
                if (node1==null&&node2==null){
                    break;
                }
                if (node1==null){
                    newNode.next=node2;
                    newNode=newNode.next;
                    node2=node2.next;
                }else {
                    newNode.next=node1;
                    newNode=newNode.next;
                    node1=node1.next;
                }
            }
        }

        return head;


    }

}
