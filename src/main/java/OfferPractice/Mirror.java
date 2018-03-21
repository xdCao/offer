package OfferPractice;

/**
 * created by xdCao on 2018/3/9
 */
// todo 镜像二叉树(反转二叉树)
public class Mirror {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public void Mirror(TreeNode root) {
        if (root==null)
            return;
        TreeNode temp=null;
        temp=root.right;
        root.right=root.left;
        root.left=temp;
        Mirror(root.left);
        Mirror(root.right);
    }

}
