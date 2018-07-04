package LeetCode;
/*计算二叉树节点个数*/
public class CountTreeNodes {

    public static void main(String[] args) {

        Common.TreeNode root=new Common.TreeNode(1);
        root.left=new Common.TreeNode(2);
        root.right=new Common.TreeNode(3);
        root.left.left=new Common.TreeNode(4);
        root.left.right=new Common.TreeNode(5);
//        root.right.left=new Common.TreeNode(6);

        count(root);

        System.out.println(count);

    }

    private static int count=0;

    private static void count(Common.TreeNode root) {

        if (root!=null){
            count++;
        }else {
            return;
        }

        count(root.left);
        count(root.right);


    }

}
