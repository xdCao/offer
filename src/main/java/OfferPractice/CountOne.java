package OfferPractice;

/**
 * created by xdCao on 2018/3/12
 */
// todo 1-n中1出现的次数
public class CountOne {

    public static int NumberOf1Between1AndN_Solution(int n) {

        int count=0;

        for (int i = 1; i <= n; i++) {
            if (i==1){
                count++;
                continue;
            }

            for (int j = 1; Math.pow(10,j-1)<=i; j++) {
                if ((int)((i%Math.pow(10,j))/Math.pow(10,j-1))==1){
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int i = NumberOf1Between1AndN_Solution(12);
        System.out.println(i);
    }


}
