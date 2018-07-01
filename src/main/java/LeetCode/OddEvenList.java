package LeetCode;
/*将链表重新组织,让所有奇数索引的元素在偶数索引的元素前面*/
public class OddEvenList {

    public static void main(String[] args) {

        Common.ListNode listNode = Common.createNodeList(new int[]{1, 2, 3, 4, 5});

        Common.ListNode listNode1=solution(listNode);

        Common.printNodeList(listNode1);

    }

    private static Common.ListNode solution(Common.ListNode listNode) {

        int index=1;

        Common.ListNode cur=listNode.next.next;
        Common.ListNode oddHead=listNode;
        Common.ListNode oddCur=listNode;
        Common.ListNode evenHead=listNode.next;
        Common.ListNode evenCur=listNode.next;


        while (cur!=null){

            if (index%2==1){
                oddCur.next=cur;
                oddCur=cur;
            }else {
                evenCur.next=cur;
                evenCur=cur;
            }


            Common.ListNode next=cur.next;
            cur.next=null;
            cur=next;


            index++;

        }

        oddCur.next=evenHead;

        return oddHead;

    }


}
