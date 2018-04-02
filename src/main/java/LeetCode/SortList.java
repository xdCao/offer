package LeetCode;

/**
 * created by xdCao on 2018/3/27
 */


public class SortList {

    public ListNode sortList(ListNode head) {

        if (head==null||head.next==null)
            return head;

        ListNode end=head;
        while (end.next!=null){
            end=end.next;
        }

        ListNode newHead=quickSort(head,end);
        return newHead;

    }

    private ListNode quickSort(ListNode head,ListNode end) {

        if (head==null||head==end)
            return head;

        ListNode index=partition(head,end);
        quickSort(head,index);
        quickSort(index.next,end);

        return head;

    }

    private ListNode partition(ListNode begin, ListNode end) {

        if (begin==null||begin==end)
            return begin;

        ListNode index=begin;
        ListNode cur=begin.next;

        while (cur!=end.next){
            if (cur.val<begin.val){
                index=index.next;
                swap(index,cur);
            }
            cur=cur.next;
        }

        swap(index,begin);

        return index;

    }

    private void swap(ListNode index, ListNode cur) {
        int temp=index.val;
        index.val=cur.val;
        cur.val=temp;
    }

}
