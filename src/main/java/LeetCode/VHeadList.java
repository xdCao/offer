package LeetCode;
/*将链表中重复的元素全部删除,这里注意虚拟头结点的用法*/
public class VHeadList {

    public static void main(String[] args) {

        Common.ListNode listNode = Common.createNodeList(new int[]{1, 2, 2, 3, 3, 4, 5, 6, 7, 8,8});

        Common.ListNode head=solution(listNode);

        Common.printNodeList(head);
    }

    private static Common.ListNode solution(Common.ListNode listNode) {

        Common.ListNode vHead=new Common.ListNode(0);
        vHead.next=listNode;

        boolean flag=false;

        Common.ListNode pre=vHead;
        Common.ListNode cur=listNode;
        Common.ListNode next=cur.next;
        while (cur!=null){

            if (next!=null){
                if (cur.value==next.value){
                    flag=true;
                    cur.next=next.next;
                    next=next.next;
                }else {

                    if (flag){
                        cur=next;
                        next=cur.next;
                        pre.next=cur;
                        flag=false;
                    }else {
                        pre=cur;
                        cur=next;
                        next=next.next;
                    }

                }
            }else {
                if (flag){
                    pre.next=null;
                    cur=cur.next;
                }else {
                    pre=cur;
                    cur=cur.next;
                }
            }



        }

        return vHead.next;

    }

}
