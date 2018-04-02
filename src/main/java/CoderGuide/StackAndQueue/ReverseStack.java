package CoderGuide.StackAndQueue;

import java.util.Stack;

/**
 * created by xdCao on 2018/3/27
 */

public class ReverseStack {

    private static Stack<Integer> stack=new Stack<>();

    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty())
            return;
        Integer last=getLast(stack);
        reverse(stack);
        stack.push(last);

    }

    private static Integer getLast(Stack<Integer> stack) {
        if (stack.size()==1){
            return stack.pop();
        }
        int i=stack.pop();
        Integer last = getLast(stack);
        stack.push(i);
        return last;
    }

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        reverse(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }


}
