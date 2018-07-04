package LeetCode;

import java.util.ArrayList;

/*打印出从根节点到所有叶子节点的路径*/
public class BinaryTreePath {

    public static void main(String[] args) {

        Common.TreeNode root=new Common.TreeNode(1);
        root.left=new Common.TreeNode(2);
        root.right=new Common.TreeNode(3);
        root.left.left=new Common.TreeNode(4);
        root.left.right=new Common.TreeNode(5);
        root.right.left=new Common.TreeNode(6);

        String[] strings=solution(root);


        for (String s:strings){
            System.out.println(s);
        }

    }

    private static String[] solution(Common.TreeNode root) {

        if (root==null)
            return new String[]{};

        if (root.left==null&&root.right==null)
            return new String[]{""+root.value};

        String[] left = solution(root.left);
        String[] right = solution(root.right);

        String[] re=new String[left.length+right.length];

        for (int i = 0; i < left.length; i++) {
            re[i]=root.value+">"+left[i];
        }

        for (int i = 0; i < right.length; i++) {
            re[i+left.length]=root.value+">"+right[i];
        }

        return re;




    }


}
