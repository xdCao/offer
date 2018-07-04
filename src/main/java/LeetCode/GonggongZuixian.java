package LeetCode;

public class GonggongZuixian {

   public static Common.TreeNode solution(Common.TreeNode root,Common.TreeNode p, Common.TreeNode q){

       /*假定p和q不为空*/
       if (root==null)
           return null;

       if (p.value<root.value&&q.value<root.value)
           return solution(root.left,p,q);
       if (p.value>root.value&&q.value>root.value)
          return  solution(root.right,p,q);


//       if ((p.value>=root.value&&q.value<=root.value)||(q.value>=root.value&&p.value<=root.value))
       return root;


   }

}
