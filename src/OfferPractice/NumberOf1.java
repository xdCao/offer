package OfferPractice;

/**
 * created by xdCao on 2018/3/7
 */
// todo 位运算
public class NumberOf1 {

    public static int numberOf1(int n) {
//        int x=0;
////        while ((Math.pow(2,x))<=n){
////            x++;
////        }
////        int count1=0;
////        int count=0;
////        for (int i = x-1; i >= 0; i--) {
////            if ((count+Math.pow(2,i))<=n){
////                count+=Math.pow(2,i);
////                count1++;
////            }
////        }
////        return count1;
        int i=1;
        int count=0;
        for(int k=0;k<32;k++){
            int x = n & i;
            if (x==i){
                count++;
            }
            i=i<<1;
        }
        return count;



    }

    public static void main(String[] args) {
        int i = numberOf1(10);
        System.out.println(i);
    }


}
