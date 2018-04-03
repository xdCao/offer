package JianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * created by xdCao on 2018/3/12
 */
// todo 按行打印二叉树，和从上往下打印二叉树差不多
public class PrintLinesTree {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }


    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if (pRoot == null) return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            ret.add(list);
        }
        return ret;
    }



}
