package chapter1;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * created by xdCao on 2018/1/15
 */

public class SortStack {

    public static void sort(Stack<Integer> stack){

        Stack<Integer> sortStack=new Stack<>();

        while (!stack.isEmpty()){
            Integer pop = stack.pop();
            if (sortStack.isEmpty()){
                sortStack.push(pop);
            }else {
                if (pop<=sortStack.peek()){
                    sortStack.push(pop);
                }else {
                    while (true){
                        if (!sortStack.isEmpty()){
                            if (pop>sortStack.peek()){
                                stack.push(sortStack.pop());
                            }else {
                                sortStack.push(pop);
                                break;
                            }
                        }else{
                            sortStack.push(pop);
                            break;
                        }
                    }
                }
            }
        }

        while (!sortStack.isEmpty()){
            stack.push(sortStack.pop());
        }
    }

    /*优雅*/
    public static void sortGrace(Stack<Integer> stack){
        Stack<Integer> help=new Stack<>();
        while (!stack.isEmpty()){
            int cur=stack.pop();
            while (!help.isEmpty()&&help.peek()<cur){
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.push(6);
        stack.push(90);
        stack.push(11);
        stack.push(23);
        stack.push(22);
        stack.push(332);
        stack.push(1);
        sort(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
