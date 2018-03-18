package Guide;

import java.util.Stack;

/**
 * created by xdCao on 2018/1/12
 */

public class TwoStackQueue<T> {

    private Stack<T> stack1=null;
    private Stack<T> stack2=null;

    public TwoStackQueue() {
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();
    }

    public void add(T element){
        stack1.push(element);
    }

    public T poll(){
        /*这里需要注意异常，很容易忘掉*/
        if (stack1.isEmpty()&&stack2.isEmpty()){
            return null;
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /*peek函数要注意的，容易漏掉逻辑*/
    public T peek(){
        if (stack1.isEmpty()&&stack2.isEmpty()){
            return null;
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }


    public static void main(String[] args) {
        TwoStackQueue<Integer> queue=new TwoStackQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        queue.add(8);
        queue.add(9);
        queue.add(10);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }


}
