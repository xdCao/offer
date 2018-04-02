package CoderGuide.StackAndQueue;

import java.util.Stack;

/**
 * created by xdCao on 2018/3/27
 */

public class TwoStackQueue {

    private static Stack<Integer> stackPush=new Stack<>();
    private static Stack<Integer> stackPop=new Stack<>();

    public void push(Integer integer){
        stackPush.push(integer);
    }

    public Integer pop(){
        if (stackPop.isEmpty()&&stackPush.isEmpty())
            throw new RuntimeException("queue is empty");

        if (stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }

        return stackPop.pop();

    }

    public Integer peek(){
        if (stackPop.isEmpty()&&stackPush.isEmpty())
            throw new RuntimeException("queue is empty");

        if (stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }

        return stackPop.peek();
    }

}
