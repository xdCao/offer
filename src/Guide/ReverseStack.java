package Guide;

import java.util.Stack;

/**
 * created by xdCao on 2018/1/12
 */
/*递归的难度还是很高，重点*/
public class ReverseStack {

    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int i=getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    private static int getAndRemoveLastElement(Stack<Integer> stack) {
        int result=stack.pop();
        if (stack.isEmpty()){
            return result;
        }else {
            int last=getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        ReverseStack.reverse(stack);
    }

}
