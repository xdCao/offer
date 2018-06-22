package DailyPractice.dp;

import java.util.ArrayList;
import java.util.List;

/*最长递增子序列*/
public class LongestIncreasingSeq {

    public static int[] array=new int[]{1,-1,2,3,4,3,6,7,-8};

    public static void main(String[] args) {
        List<Integer> lis = lis(array);
        for (Integer integer:lis){
            System.out.println(integer);
        }
    }

    private static List<Integer> lis(int[] array) {

        int[] dp=new int[array.length];
        dp[0]=1;

        for (int i = 1; i < dp.length; i++) {
            int tempMax=0;
            for (int j = 0; j < i; j++) {
                if (array[j]<array[i]){
                    if (dp[j]>tempMax){
                        tempMax=dp[j];
                    }
                }
            }

            if (tempMax==0){
                dp[i]=0;
            }else {
                dp[i]=tempMax+1;
            }


        }

        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i]+", ");
        }
        System.out.println();

        List<Integer> list=new ArrayList<>();

        int temp=1;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i]==temp){
                list.add(array[i]);
                temp++;
            }
        }

        return list;

    }


}
