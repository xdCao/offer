package OfferPractice;

import java.util.Stack;

/**
 * created by xdCao on 2018/3/9
 */

public class MinStack {

    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    public void push(int node) {
        if (stack.isEmpty()){
            minStack.push(node);
        }
        if (node<=minStack.peek()){
            minStack.push(node);
        }
        stack.push(node);

    }

    public void pop() {
        if (stack.isEmpty()){
            throw new RuntimeException("栈为空");
        }
        if (stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        if (stack.isEmpty()){
            throw new RuntimeException("栈为空");
        }
        return stack.peek();
    }

    public int min() {
        if (stack.isEmpty()){
            throw new RuntimeException("栈为空");
        }
        return minStack.isEmpty()?0:minStack.peek();
    }

}
