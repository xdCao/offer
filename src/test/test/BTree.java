import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * created by xdCao on 2018/3/21
 */

public class BTree {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    TreeNode root;

    @Before
    public void initTree(){
        root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(2);
    }

    /*按行遍历二叉树，分行打印*/
    @Test
    public void printlnTree(){
        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null){
                    queue.add(poll.right);
                }
                System.out.print(poll.val+" ");
            }
            System.out.print("\n");
        }
    }

    /*二叉树序列化反序列化*/
    @Test
    public void permTree(){
        Integer[] array=serialize(root);
        printArray(array);
        TreeNode node = deSerialize(array);
        preTreePrint(node);
    }


    /*序列化二叉树*/
    private Integer[] serialize(TreeNode root) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        preAddTree(root,arrayList);
        Integer[] arr=new Integer[arrayList.size()];
        arrayList.toArray(arr);
        return arr;
    }

    private void preAddTree(TreeNode root, ArrayList<Integer> arrayList) {
        if (root==null){
            arrayList.add(null);
            return;
        }
        arrayList.add(root.val);
        preAddTree(root.left,arrayList);
        preAddTree(root.right,arrayList);

    }
    /*反序列化二叉树*/
    private TreeNode deSerialize(Integer[] array) {
        if (array==null||array.length==0){
            return null;
        }

        Queue<Integer> queue=new Integer();
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }

        deSerialize(queue);

        return null;
    }

    private Integer deSerialize(Queue<Integer> queue) {

        Integer poll = queue.poll();
        if (poll==null)
            return null;

    }

    /*二叉树前序遍历*/
    private void preTreePrint(TreeNode node) {
        if (node==null)
            return;
        System.out.println(node.val);
        preTreePrint(node.left);
        preTreePrint(node.right);
    }

    private void printArray(Integer[] array) {
        for (Integer i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
