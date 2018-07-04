package LeetCode;
/*判断两颗二叉树是不是一样*/
public class SameTree {

    public static void main(String[] args) {
        Common.TreeNode root=new Common.TreeNode(1);
        root.left=new Common.TreeNode(2);
        root.right=new Common.TreeNode(3);
        root.left.left=new Common.TreeNode(4);
        root.left.right=new Common.TreeNode(5);
        root.right.left=new Common.TreeNode(6);

        Common.TreeNode root2=new Common.TreeNode(1);
        root2.left=new Common.TreeNode(2);
        root2.right=new Common.TreeNode(3);
        root2.left.left=new Common.TreeNode(4);
        root2.left.right=new Common.TreeNode(5);
        root2.right.left=new Common.TreeNode(7);

        boolean isSame=solution(root,root2);


        System.out.println(isSame);

    }

    private static boolean solution(Common.TreeNode root1, Common.TreeNode root2) {

        if (root1==null&&root2==null)
            return true;

        if (root1==null){
            return false;
        }
        if (root2==null){
            return false;
        }

        boolean left = solution(root1.left, root2.left);
        boolean right = solution(root1.right, root2.right);

        if (left&&right&&(root1.value==root2.value)){
            return true;
        }else {
            return false;
        }


    }

}
