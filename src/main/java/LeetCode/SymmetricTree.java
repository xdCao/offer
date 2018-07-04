package LeetCode;

public class SymmetricTree {

    public static void main(String[] args) {

        Common.TreeNode root=new Common.TreeNode(1);
        root.left=new Common.TreeNode(2);
        root.right=new Common.TreeNode(3);
        root.left.left=new Common.TreeNode(4);
        root.left.right=new Common.TreeNode(5);
        root.right.left=new Common.TreeNode(5);
        root.right.right=new Common.TreeNode(4);

        boolean isSym=solution(root);

        System.out.println(isSym);
    }

    private static boolean solution(Common.TreeNode root) {

        /*先反转二叉树,然后判断是不是一样就行*/

        return true;

    }

}
