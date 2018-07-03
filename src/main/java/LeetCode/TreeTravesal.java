package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

/*非递归遍历二叉树*/
public class TreeTravesal {


    public static void main(String[] args) {

        Common.TreeNode root=new Common.TreeNode(1);
        root.left=new Common.TreeNode(2);
        root.right=new Common.TreeNode(3);
        root.left.left=new Common.TreeNode(4);
        root.left.right=new Common.TreeNode(5);
        root.right.left=new Common.TreeNode(6);

//        preSolution(root);

//        inSolution(root);

        lineSolution(root);

    }

    static class Command{
        String command;
        Common.TreeNode treeNode;

        public Command(String command, Common.TreeNode treeNode) {
            this.command = command;
            this.treeNode = treeNode;
        }
    }

    private static void preSolution(Common.TreeNode root) {

        Stack<Common.TreeNode> stack=new Stack<>();

        Common.TreeNode cur=root;

        stack.push(cur);

        while (!stack.isEmpty()){
            cur=stack.pop();
            System.out.println(cur.value);
            if (cur.right!=null)
                stack.push(cur.right);
            if (cur.left!=null){
                cur=cur.left;
                stack.push(cur);
            }
        }

    }


    private static void inSolution(Common.TreeNode root){

        Stack<Command> stack=new Stack<>();

        Common.TreeNode cur=root;

        stack.push(new Command("go",root.right));
        stack.push(new Command("print",root));
        stack.push(new Command("go",root.left));

        while (!stack.isEmpty()){

            Command pop = stack.pop();
            if (pop.command.equals("go")){
                cur=pop.treeNode;
                if (cur.right!=null)
                    stack.push(new Command("go",cur.right));
                stack.push(new Command("print",cur));
                if (cur.left!=null)
                    stack.push(new Command("go",cur.left));
            }else if (pop.command.equals("print")){
                System.out.println(pop.treeNode.value);
            }

        }

    }

    private static void lineSolution(Common.TreeNode root){

        Queue<Common.TreeNode> queue=new LinkedList<>();

        queue.add(root);

        boolean flag=false;

        while (!queue.isEmpty()){

            int size = queue.size();
            ArrayList<Integer> arrayList=new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Common.TreeNode poll = queue.poll();
                arrayList.add(poll.value);
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null)
                    queue.add(poll.right);
            }

            if (flag==false){
                for (Integer integer:arrayList){
                    System.out.print(integer+" , ");
                }
                System.out.println();
                flag=true;
            }else {
                Collections.reverse(arrayList);
                for (Integer integer:arrayList){
                    System.out.print(integer+" , ");
                }
                System.out.println();
                flag=false;
            }



        }



    }


}
