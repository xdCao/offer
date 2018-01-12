package chapter1;

import java.util.Stack;

/**
 * created by xdCao on 2018/1/12
 */

public class MinStack<T extends Comparable> {

    private Stack<T> stackData=null;
    private Stack<T> minStack=null;

    public MinStack() {
        this.stackData = new Stack<>();
        this.minStack = new Stack<>();
    }

    public T pop(){
        if (minStack.isEmpty()){
            return null;
        }
        if (minStack.peek().compareTo(stackData.peek())==0){
            minStack.pop();
        }
        return stackData.isEmpty()?null:stackData.pop();
    }

    public void push(T element){
        stackData.push(element);
        if (minStack.isEmpty()){
            minStack.push(element);
        }else if(minStack.peek().compareTo(element) >=0){
            minStack.push(element);
        }
    }


    public T getMin(){
        if (minStack.isEmpty()){
            return null;
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack<Integer> minStack=new MinStack<>();
        minStack.push(5);
        System.out.println(minStack.getMin());
        minStack.push(3);
        System.out.println(minStack.getMin());
        minStack.push(2);
        System.out.println(minStack.getMin());
        minStack.push(1);
        System.out.println(minStack.getMin());
        minStack.push(4);
        System.out.println(minStack.getMin());
        minStack.push(1);
        System.out.println(minStack.getMin());
        minStack.push(3);
        System.out.println(minStack.getMin());
        minStack.push(2);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }



}
