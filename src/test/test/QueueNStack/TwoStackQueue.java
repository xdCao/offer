package QueueNStack;

import java.util.Stack;

/**
 * created by xdCao on 2018/3/25
 */

public class TwoStackQueue {

    private static Stack<Integer> stack1=new Stack<>();
    private static Stack<Integer> stack2=new Stack<>();

    public void add(Integer integer){

        stack1.push(integer);

    }

    public Integer poll(){
        if (stack2.isEmpty()&&stack1.isEmpty())
            throw new RuntimeException("queue is empty");
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public Integer peek(){
        if (stack2.isEmpty()&&stack1.isEmpty())
            throw new RuntimeException("queue is empty");

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();

    }


}
