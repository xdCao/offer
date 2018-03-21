package OfferPractice;

import java.util.*;

/**
 * created by xdCao on 2018/3/12
 */
// todo 之字形打印二叉树
public class ZPrintTree {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<ArrayList<Integer>> ret=new ArrayList<>();

        if (pRoot==null){
            return ret;
        }

        queue.add(pRoot);
        int flag=1;
        while (!queue.isEmpty()){
            int cnt=queue.size();
            ArrayList<Integer> arrayList=new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                TreeNode poll = queue.poll();
                arrayList.add(poll.val);
                if (poll.left!=null){
                    queue.add(poll.left);
                }
                if (poll.right!=null){
                    queue.add(poll.right);
                }
            }

            if (flag%2==0){
                Collections.reverse(arrayList);
            }
            ret.add(arrayList);
            flag++;
        }
        return ret;

    }
}
