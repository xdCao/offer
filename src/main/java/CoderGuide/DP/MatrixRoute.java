package CoderGuide.DP;

/**
 * created by xdCao on 2018/4/2
 */

public class MatrixRoute {

    public static void main(String[] args) {

        int[][] array=new int[][]{
                {1,3,5,9},
                {8,1,3,4},
                {5,0,6,1},
                {8,8,4,0}
        };

        int num=dp(array);
        System.out.println(num);

    }

    private static int dp(int[][] array) {

        int[][] dp=new int[array.length][array[0].length];
        int temp=0;
        for (int i = 0; i < array.length; i++) {
            temp+=array[i][0];
            dp[i][0]=temp;
        }
        temp=0;
        for (int i = 0; i < array[0].length; i++) {
            temp+=array[0][i];
            dp[0][i]=temp;
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[0].length; j++) {
                dp[i][j]=array[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }

        return dp[array.length-1][array[0].length-1];

    }

}
