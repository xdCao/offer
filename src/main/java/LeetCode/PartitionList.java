package LeetCode;

public class PartitionList {

    public static void main(String[] args) {

        Common.ListNode listNode = Common.createNodeList(new int[]{1, 4, 3, 2, 5, 2,3,3,3,1,1,1,1,2});

        Common.ListNode listNode1=solution(listNode,3);

        Common.printNodeList(listNode1);
    }

    private static Common.ListNode solution(Common.ListNode listNode,int num) {

        Common.ListNode cur=listNode.next;
        Common.ListNode pre=listNode;
        Common.ListNode head=listNode;

        while (cur!=null){
            if (cur.value==num){
                //将该节点作为标定节点置于头部
                pre.next=cur.next;
                cur.next=listNode;
                head=cur;
                break;
            }else {
                pre=cur;
                cur=cur.next;
            }
        }

        if (head.value==num){
            //开始分组
            pre=head;
            cur=head.next;
            while (cur!=null){
                if (cur.value<num){
                    pre.next=cur.next;
                    cur.next=head;
                    head=cur;
                    cur=pre.next;
                }else {
                    pre=cur;
                    cur=cur.next;
                }
            }

        }else {
            //说明没有该元素
            return head;
        }

        return head;



    }

}
