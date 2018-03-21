package OfferPractice;

/**
 * created by xdCao on 2018/3/7
 */

// todo 查找二叉树的下一个节点

public class BTreeNext {

    static class TreeLinkNode{
        int val;
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode next;

        public TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public static TreeLinkNode findNext(TreeLinkNode node){
        if (node==null){
            return null;
        }
        TreeLinkNode cur=null;
        if (node.right!=null){
            cur=node.right;
            while (cur.left!=null){
                cur=cur.left;
            }
            return cur;
        }else {
            if (node.next!=null){
                if (node==node.next.left){
                    return node.next;
                }else {
                    cur=node.next;
                    while (cur.next!=null){
                        if (cur==cur.next.left){
                            return cur.next;
                        }
                        cur=cur.next;
                    }
                    return null;
                }
            }else {
                return null;
            }
        }
    }


}
