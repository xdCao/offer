package LeetCode;
/*链表的归并排序*/
public class MergeList {

    public static void main(String[] args) {

        Common.ListNode listNode = Common.createNodeList(new int[]{6, 5, 4, 3, 2, 1,3,4});
        Common.ListNode listNode1=solution(listNode);
        Common.printNodeList(listNode1);

    }

    private static Common.ListNode solution(Common.ListNode listNode) {

        if (listNode==null)
            return null;

        if(listNode.next==null){
            return listNode;
        }

        Common.ListNode mid = findMid(listNode);

        Common.ListNode next = mid.next;

        mid.next=null;

        Common.ListNode solution = solution(listNode);

        Common.ListNode solution1 = solution(next);

        Common.ListNode head=merge(solution,solution1);


        return head;


    }

    private static Common.ListNode merge(Common.ListNode a, Common.ListNode b) {


        Common.ListNode dummyHead, curr;
        dummyHead = new Common.ListNode(0);
        curr = dummyHead;
        while (a != null && b != null) {
            if (a.value <= b.value) {
                curr.next = a;
                a = a.next;
            } else {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }
        curr.next = (a == null) ? b : a;
        return dummyHead.next;
    }


    public static Common.ListNode findMid(Common.ListNode listNode){

        if (listNode==null)
            return null;

        Common.ListNode fast=listNode;
        Common.ListNode slow=listNode;

        while (fast.next!=null&&fast.next.next!=null){

            fast=fast.next.next;
            slow=slow.next;

        }

        return slow;

    }


}
