package LeetCode;

/**
 * created by xdCao on 2018/3/26
 */

public class MinDepth {

    public int run(TreeNode root) {

        if (root==null)
            return 0;

        int minHeight = getMinHeight(root);

        return minHeight;

    }

    private int getMinHeight(TreeNode root) {

        if (root==null)
            return 0;
        int left = getMinHeight(root.left);
        int right=getMinHeight(root.right);

        return (left==0||right==0)?left+right+1:Math.min(left,right)+1;


    }

}
