package DailyPractice.dp;
/*最大连续子序列和*/
public class MaxSeqSum {

    public static int[] array=new int[]{1,-3,7,8,-4,12,-10,6};

    public static void main(String[] args) {

        int sum = getSum(array);
        System.out.println(sum);

    }


    /*这个是遍历的解法*/
    private static int getSum(int[] array) {

        int[][] dp=new int[array.length][array.length];

        dp[0][0]=array[0];

        int temp=0;

        for (int i = 1; i < array.length; i++) {
            dp[0][i]=dp[0][i-1]+array[i];
            if (dp[0][i]>temp){
                temp=dp[0][i];
            }
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (i==j){
                    dp[i][j]=array[i];
                }else {
                    dp[i][j]=dp[i][j-1]+array[j];
                }
                if (dp[i][j]>temp){
                    temp=dp[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(dp[i][j]+",");
            }
            System.out.println();
        }

        return temp;



    }

    /*动态规划解法*/
    public static int maxSubSum5(int[] a) {
        int maxSum = 0;
        int tempSum = 0;
        int begin = 0;

        for (int i = 0; i < a.length; i++) {
            if (tempSum > 0)
                tempSum += a[i];
            else {
                tempSum = a[i];
                begin = i;  //标记
            }

            if (tempSum > maxSum) {
                maxSum = tempSum;
                //可以在这里获取最佳连续子序列和的起点位置begin和重点位置i
            }

        }
        return maxSum;
    }


}
