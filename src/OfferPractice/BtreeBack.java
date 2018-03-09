package OfferPractice;

/**
 * created by xdCao on 2018/3/9
 */
// todo 判断二叉树的后续遍历
public class BtreeBack {

    static int[] array=new int[]{5,7,6,9,11,10,8};

    public static boolean VerifySquenceOfBST(int [] sequence) {

        int length=sequence.length;
        if (length<1){
            return false;
        }
        int root=sequence[length-1];
        int index=-1;
        for (int i = 0; i < length; i++) {
            if (sequence[i]>=root){
                index=i;
                break;
            }
        }
        for (int i = index; i < length; i++) {
            if (sequence[i]<root){
                return false;
            }
        }
        if (index>0&&(length-index-1)>0){
            int[] left=new int[index];
            int[] right=new int[length-index-1];
            for (int i = 0; i < length-1; i++) {
                if (i<index){
                    left[i]=sequence[i];
                }else {
                    right[i-index]=sequence[i];
                }
            }
            return VerifySquenceOfBST(left)&&VerifySquenceOfBST(right);
        }

        return true;

    }

    public static void main(String[] args) {
        boolean b = VerifySquenceOfBST(array);
        System.out.println(b);
    }


}
