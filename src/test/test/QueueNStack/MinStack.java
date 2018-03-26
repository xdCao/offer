package QueueNStack;

import java.util.Stack;

/**
 * created by xdCao on 2018/3/25
 */

public class MinStack {

    private static Stack<Integer> stack=new Stack<>();

    private static Stack<Integer> minStack=new Stack<>();

    public void push(Integer integer){
        if (stack.isEmpty()){
            minStack.push(integer);
        }else if(integer<=stack.peek()){
            minStack.push(integer);
        }
        stack.push(integer);
    }

    public Integer pop(){
        if (stack.isEmpty()){
            throw new RuntimeException("stack is empty!");
        }

        if (minStack.peek().equals(stack.peek())){
            minStack.pop();
        }

        return stack.pop();
    }

    public Integer getMin(){
        return minStack.peek();
    }



}
