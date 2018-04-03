package JianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * created by xdCao on 2018/3/7
 */

public class PrintLinked {

    class ListNode{

        int val;
        ListNode next=null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack=new Stack<>();
        while (listNode!=null){
            stack.push(listNode);
            listNode=listNode.next;
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (!stack.isEmpty()){
            arrayList.add(stack.pop().val);
        }
        return arrayList;
    }

}
