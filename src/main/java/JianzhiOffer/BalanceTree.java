package JianzhiOffer;



/**
 * created by xdCao on 2018/3/12
 */
// todo 平衡二叉树
public class BalanceTree {

    private boolean isBalanced = true;

    public boolean IsBalanced_Solution(TreeDeepth.TreeNode root) {
        height(root);
        return isBalanced;
    }

    private int height(TreeDeepth.TreeNode root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) isBalanced = false;
        return 1 + Math.max(left, right);
    }

}
