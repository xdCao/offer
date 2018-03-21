package OfferPractice;

/**
 * created by xdCao on 2018/3/12
 */
// todo 删除链表中重复的节点
public class DeleteDuplicateNode {

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;
        if (pHead.next == null) return pHead;
        if (pHead.val == pHead.next.val) {
            ListNode next = pHead.next;
            while (next != null && pHead.val == next.val) {
                next = next.next;
            }
            return deleteDuplication(next);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }


}
