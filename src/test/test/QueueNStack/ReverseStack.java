package QueueNStack;

import java.util.Stack;

/**
 * created by xdCao on 2018/3/25
 */

public class ReverseStack {

    public static Integer getLast(Stack<Integer> stack){
        Integer pop = stack.pop();
        if (stack.isEmpty())
            return pop;
        Integer last = getLast(stack);
        stack.push(pop);
        return last;
    }

    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty())
            return;
        Integer last = getLast(stack);
        reverse(stack);
        stack.push(last);
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
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
