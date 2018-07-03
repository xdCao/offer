package LeetCode;

import sun.java2d.pipe.OutlineTextRenderer;

import java.util.Stack;

/*逆波兰表达式求值*/
public class ReversePolishNotation {

    public static void main(String[] args) {

        String[] chars=new String[]{"4","13","5","/","+"};

        int result=solution(chars);

        System.out.println(result);

    }

    private static int solution(String[] chars) {

        Stack<Integer> stack=new Stack<>();


        for (String s:chars){
            try {
                int i = Integer.parseInt(s);
                stack.push(i);
            }catch (Exception e){
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                switch (s){
                    case "+":
                        stack.push(pop1+pop2);
                        break;
                    case "-":
                        stack.push(pop2-pop1);
                        break;
                    case "/":
                        stack.push(pop2/pop1);
                        break;
                    case "*":
                        stack.push(pop1*pop2);
                }
            }
        }

        return stack.pop();

    }

}
