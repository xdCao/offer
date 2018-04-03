package JianzhiOffer;

import java.util.ArrayList;

/**
 * created by xdCao on 2018/3/12
 */
// todo 找二叉搜索树中的第k个值
public class KthInTree {

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    TreeNode KthNode(TreeNode pRoot, int k) {

        ArrayList<TreeNode> arrayList=new ArrayList<>();

        if (pRoot==null||k==0){
            return null;
        }

        mid(pRoot,arrayList);

        if (k>arrayList.size()){
            return null;
        }else {
            return arrayList.get(k-1);
        }


    }

    private void mid(TreeNode pRoot, ArrayList<TreeNode> arrayList) {

        if (pRoot!=null){
            if (pRoot.left!=null){
                mid(pRoot.left,arrayList);
            }
            arrayList.add(pRoot);
            if (pRoot.right!=null){
                mid(pRoot.right,arrayList);
            }

        }


    }

}
