package JianzhiOffer;

import java.util.Stack;

/**
 * created by xdCao on 2018/3/9
 */
// todo 判断入栈出栈序列
public class StackOrder {

    Stack<Integer> stack=new Stack<>();

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int index=0;
        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            if (pushA[i]==popA[index]){
                stack.pop();
                index++;
            }
        }

        for (int i = index; i < popA.length; i++) {
            if (popA[i]!=stack.pop()){
                return false;
            }
        }

        return true;
    }

}
