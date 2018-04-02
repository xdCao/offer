package CoderGuide.StackAndQueue;

import java.util.Stack;

/**
 * created by xdCao on 2018/3/27
 */

public class SortStack {

    private static Stack<Integer> stack=new Stack<>();
    private static Stack<Integer> stack1=new Stack<>();

    public static void sort(){
        if (stack.isEmpty())
            return;

        int temp=-1;
        while (!stack.isEmpty()){
            temp=stack.pop();
            if (stack1.isEmpty()){
                stack1.push(temp);
            }else {
                if (temp >= stack1.peek()) {
                    stack1.push(temp);
                } else {
                    while (!stack1.isEmpty()&&temp < stack1.peek()) {
                        stack.push(stack1.pop());
                    }
                    stack1.push(temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        sort();
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
    }

}
