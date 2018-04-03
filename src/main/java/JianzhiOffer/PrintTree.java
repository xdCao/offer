package JianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * created by xdCao on 2018/3/9
 */
// todo 从上到下打印二叉树
public class PrintTree {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    private Queue<TreeNode> queue=new LinkedList<>();

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root==null){
            return null;
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        TreeNode cur=root;
        queue.add(cur);
        while (!queue.isEmpty()){
            printTree(arrayList,queue);
        }
        return arrayList;
    }

    private void printTree(ArrayList<Integer> arrayList, Queue<TreeNode> queue) {
        TreeNode poll = queue.poll();
        arrayList.add(poll.val);
        if (poll.left!=null)
            queue.add(poll.left);
        if (poll.right!=null)
            queue.add(poll.right);

    }


}
