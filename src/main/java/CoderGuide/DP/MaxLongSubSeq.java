package CoderGuide.DP;

import java.util.ArrayList;
import java.util.Collections;

/**
 * created by xdCao on 2018/4/3
 */

public class MaxLongSubSeq {

    public static void main(String[] args) {
        int[] array=new int[]{2,1,5,3,6,4,8,9,7};
        ArrayList<Integer> arrayList=dp(array);
        for (Integer integer:arrayList){
            System.out.println(integer);
        }
    }

    private static ArrayList<Integer> dp(int[] array) {

        int[] dp=new int[array.length];

        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            dp[i]=0;
            for (int j = 0; j < i; j++) {
                if (array[j]<array[i]){
                    if (dp[i]<dp[j]+1){
                        dp[i]=dp[j]+1;
                    }
                }

            }
        }

        int index=0;
        int max=dp[0];
        for (int i = 0; i < dp.length; i++) {
            if (dp[i]>max){
                max=dp[i];
                index=i;
            }
        }

        int temp=index;

        arrayList.add(array[index]);

        for (int i = 0; i < dp[index]; i++) {
            for (int j = temp; j >=0 ; j--) {
                if (array[j]<array[temp]&&dp[j]==(dp[temp]-1)){
                    arrayList.add(array[j]);
                    temp=j;
                    break;
                }
            }
        }

        Collections.reverse(arrayList);

        return arrayList;

    }

}
