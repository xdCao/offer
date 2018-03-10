package OfferPractice;

/**
 * created by xdCao on 2018/3/10
 */
// todo 找数组中出现超过一半                                                                                      次数的数
public class MOreThanHalfArray {

    public int MoreThanHalfNum_Solution(int [] array) {
        int cnt=1;
        int num=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num){
                cnt++;
            }else {
                cnt--;
            }
            if (cnt==0){
                num=array[i];
                cnt=1;
            }
        }
        cnt=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num)
                cnt++;
        }
        return cnt>array.length/2?num:0;
    }

}
