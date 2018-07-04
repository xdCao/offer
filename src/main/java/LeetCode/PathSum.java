package LeetCode;
/*注意陷阱*/
public class PathSum {

    public static void main(String[] args) {
        Common.TreeNode root=new Common.TreeNode(1);
        root.left=new Common.TreeNode(2);
        root.right=new Common.TreeNode(3);
        root.left.left=new Common.TreeNode(4);
        root.left.right=new Common.TreeNode(5);
        root.right.left=new Common.TreeNode(6);

        boolean isExsit=solution(root,7);

        System.out.println(isExsit);

    }

    private static boolean solution(Common.TreeNode root, int sum) {

        if (root==null){
            return false;
        }

        if (root.left==null&&root.right==null&&sum==root.value){
            return true;
        }

        boolean left = solution(root.left, sum - root.value);
        boolean right = solution(root.right, sum - root.value);

        if (left||right){
            return true;
        }else {
            return false;
        }


    }

}
