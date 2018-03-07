package practice;

import java.util.ArrayList;
import java.util.Stack;

/**
 * created by xdCao on 2018/3/5
 */

public class ReplaceSpace {


     class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }



    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        String replace = s.replace(" ", "%20");
        return replace;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode temp=listNode;
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        if(listNode.next!=null){
            while(temp.next!=null){
                stack.push(temp.val);
                temp=temp.next;
            }
            while (!stack.isEmpty()){
                arrayList.add(stack.pop());
            }
            return arrayList;
        }else{
            return arrayList;
        }
    }

    public static void main(String[] args) {

         ReplaceSpace replaceSpace=new ReplaceSpace();
         replaceSpace.printListFromTailToHead(null);
    }

}
