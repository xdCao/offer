package DailyPractice;
/*01背包问题*/
public class Pack01 {

    public static int[] gain=new int[]{1,2,4,4,5,6,8};
    public static int[] cost=new int[]{1,2,3,4,5,6,7};

    public static void main(String[] args) {

        System.out.println(totalGain(10));

    }

    private static int totalGain(int t) {

        int[][] dp=new int[gain.length+1][t+1];

        for (int i = 1; i < gain.length+1; i++) {
            dp[i][1]=1;
        }

        for (int i = 1; i < t+1; i++) {
            dp[1][i]=1;
        }

        for (int i = 2; i < gain.length+1; i++) {
            for (int j = 2; j <= t; j++) {
                int temp=0;
                for (int k = 0; k < i; k++) {
                    temp+=cost[k];
                }
                if (j>=cost[i-1]&&j<=temp){
                    dp[i][j]=Math.max(dp[i][j-cost[i-1]]+gain[i-1],dp[i-1][j]);
                }else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        for (int i = 1; i < gain.length; i++) {
            for (int j = 1; j <= t; j++) {
                System.out.print(dp[i][j]+",");
            }
            System.out.println();
        }


        return dp[gain.length][t];


    }

}
