package OfferPractice;

import javax.swing.tree.TreeNode;

/**
 * created by xdCao on 2018/3/7
 */
// todo 重建二叉树
public class RebuildTree {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        TreeNode root=null;

        if (pre.length!=0){
            root = new TreeNode(pre[0]);
        }else {
            return root;
        }

        if (pre.length>=2){
            int rootIndex=-1;
            for (int i = 0; i < in.length; i++) {
                if (in[i]==pre[0]){
                    rootIndex=i;
                }
            }
            int[] subPreLeft=new int[rootIndex];
            int[] subPreRight=new int[in.length-rootIndex-1];
            int[] subInLeft=new int[rootIndex];
            int[] subInRight=new int[in.length-rootIndex-1];

            for (int i = 0; i < rootIndex; i++) {
                subPreLeft[i]=pre[i+1];
                subInLeft[i]=in[i];
            }
            for (int i = 0; i < in.length-rootIndex-1; i++) {
                subPreRight[i]=pre[i+rootIndex+1];
                subInRight[i]=in[i+rootIndex+1];
            }

            root.left=reConstructBinaryTree(subPreLeft,subInLeft);
            root.right=reConstructBinaryTree(subPreRight,subInRight);

        }
        return root;



    }

    public static void main(String[] args) {
        int[] pre=new int[]{1,2,4,7,3,5,6,8};
        int[] mid=new int[]{4,7,2,1,5,3,8,6};

        reConstructBinaryTree(pre,mid);

    }

}
