package LeetCode;
/*注意陷阱,深度定义为到叶子节点的距离,当节点有一个子节点为空时,应该返回非空的那个*/
public class MinDepthInBTree {

    public static void main(String[] args) {

        Common.TreeNode root=new Common.TreeNode(1);
        root.left=new Common.TreeNode(2);
        root.right=new Common.TreeNode(3);
        root.left.left=new Common.TreeNode(4);
        root.left.right=new Common.TreeNode(5);
        root.right.left=new Common.TreeNode(6);

        int depth=solution(root);

        System.out.println(depth);
    }

    private static int solution(Common.TreeNode root) {


        if (root==null){
            return 0;
        }

        int leftDepth = solution(root.left);
        int rightDepth=solution(root.right);

        if (leftDepth==0&&rightDepth!=0){
            return rightDepth+1;
        }else if (leftDepth!=0&&rightDepth==0){
            return leftDepth+1;
        }else {
            int depth=leftDepth<rightDepth?leftDepth+1:rightDepth+1;

            return depth;
        }



    }


}
