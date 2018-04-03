package JianzhiOffer;

/**
 * created by xdCao on 2018/3/10
 */
// todo 复杂链表的复制
public class CloneCompList {

    static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public static RandomListNode Clone(RandomListNode pHead) {

        if (pHead==null){
            return null;
        }

        RandomListNode cloneHead=new RandomListNode(pHead.label);
        cloneHead.random=pHead.random;
        RandomListNode oldCur=pHead.next;
        RandomListNode cur=cloneHead;
        while (oldCur!=null){
            RandomListNode randomListNode=new RandomListNode(oldCur.label);
            randomListNode.random=oldCur.random;
            cur.next=randomListNode;
            cur=randomListNode;
            oldCur=oldCur.next;
        }

        cur=cloneHead;
        while (cur!=null){
            oldCur=pHead;
            RandomListNode ranCur=cloneHead;
            while (oldCur!=cur.random){
                oldCur=oldCur.next;
                ranCur=ranCur.next;
            }
            cur.random=ranCur;
            cur=cur.next;
        }

        return cloneHead;
    }

    public static void main(String[] args) {
        RandomListNode randomListNode=new RandomListNode(1);
        RandomListNode randomListNode1=new RandomListNode(2);
        RandomListNode randomListNode2=new RandomListNode(3);
        randomListNode.next=randomListNode1;
        randomListNode1.next=randomListNode2;
        randomListNode2.next=null;
        RandomListNode clone = Clone(randomListNode);
        RandomListNode cur=clone;
        while (cur!=null){
            System.out.println(cur.label);
            cur=cur.next;
        }
    }


}
