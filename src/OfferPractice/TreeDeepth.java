package OfferPractice;

/**
 * created by xdCao on 2018/3/12
 */
// todo 二叉树深度
public class TreeDeepth {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public int TreeDepth(TreeNode root) {

        if (root==null)
            return 0;

        int nLeft=TreeDepth(root.left);
        int nRight=TreeDepth(root.right);

        return (nLeft>nRight)?(nLeft+1):(nRight+1);

    }

}
