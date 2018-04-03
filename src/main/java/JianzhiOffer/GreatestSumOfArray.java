package JianzhiOffer;

/**
 * created by xdCao on 2018/3/12
 */
// todo 连续子数组的最大和（考虑全是负数的情况）
public class GreatestSumOfArray {

    public int FindGreatestSumOfSubArray(int[] array) {

        if (array==null||array.length==0){
            return 0;
        }

        int maxCount=0;
        int count=0;

        for (int i = 0; i < array.length; i++) {
            if (count<=0){
                count=array[i];
            } else{
                count+=array[i];
            }
            if (count>maxCount){
                maxCount=count;
            }
        }

        return maxCount;

    }

}
