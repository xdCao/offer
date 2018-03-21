package OfferPractice;

import java.util.ArrayList;

/**
 * created by xdCao on 2018/3/12
 */
// todo 判断二叉树是否对称，构造两种遍历
public class IsSymTree {

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    ArrayList<Integer> pre=new ArrayList<>();
    ArrayList<Integer> my=new ArrayList<>();

    boolean isSymmetrical(TreeNode pRoot) {

        if (pRoot==null){
            return true;
        }

        pre.add(pRoot.val);
        my.add(pRoot.val);

        pre(pRoot);
        my(pRoot);

        if (pre.size()!=my.size()){
            return false;
        }else {
            for (int i = 0; i < pre.size(); i++) {
                if (pre.get(i)==null&&my.get(i)==null){

                }else {
                    if (!(pre.get(i)==my.get(i))){
                        return false;
                    }
                }
            }
            return true;
        }

    }

    private void my(TreeNode pRoot) {
        if (pRoot!=null){
//            pre.add(pRoot.val);
            if (pRoot.right!=null){
                my.add(pRoot.right.val);
            }else {
                my.add(null);
            }
            if (pRoot.left!=null){
                my.add(pRoot.left.val);
            }else {
                my.add(null);
            }
            my(pRoot.right);
            my(pRoot.left);

        }
//        else {
//            pre.add(null);
//        }
    }

    private void pre(TreeNode pRoot) {

        if (pRoot!=null){
//            pre.add(pRoot.val);
            if (pRoot.left!=null){
                pre.add(pRoot.left.val);
            }else {
                pre.add(null);
            }

            if (pRoot.right!=null){
                pre.add(pRoot.right.val);
            }else {
                pre.add(null);
            }
            pre(pRoot.left);
            pre(pRoot.right);
        }
//        else {
//            pre.add(null);
//        }


    }

    public static void main(String[] args) {
        IsSymTree isSymTree=new IsSymTree();
        TreeNode root=new TreeNode(8);
        root.left=new TreeNode(6);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(5);
        root.left.right=new TreeNode(7);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(5);
        boolean symmetrical = isSymTree.isSymmetrical(root);
        System.out.println(symmetrical);
    }



}
