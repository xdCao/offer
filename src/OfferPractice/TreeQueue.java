package OfferPractice;

/**
 * created by xdCao on 2018/3/10
 */
// todo 二叉树与双向链表，好好理解递归***********
public class TreeQueue {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    private TreeNode pre=null;

    public TreeNode Convert(TreeNode pRootOfTree) {

        if (pRootOfTree==null)
            return null;
        inorder(pRootOfTree);
        while (pRootOfTree.left!=null)
            pRootOfTree=pRootOfTree.left;
        return pRootOfTree;


    }

    public void inorder(TreeNode node){
        if (node==null)
            return;
        inorder(node.left);
        node.left=pre;
        if (pre!=null)
            pre.right=node;
        pre=node;
        inorder(node.right);
    }

}
