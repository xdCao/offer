package QueueNStack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * created by xdCao on 2018/3/25
 */

public class SortStack {

    private static Stack<Integer> stack=new Stack<>();
    private static Stack<Integer> help=new Stack<>();

    public static void sort(){

        int temp;

        while (!stack.isEmpty()){
            if (help.isEmpty()||stack.peek()<help.peek())
                help.push(stack.pop());
            else {
                temp=stack.pop();
                while (!help.isEmpty()){
                    stack.push(help.pop());
                }
                help.push(temp);
            }
        }

        while (!help.isEmpty()){
            stack.push(help.pop());
        }

    }

    public static void main(String[] args) {
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        sort();
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
