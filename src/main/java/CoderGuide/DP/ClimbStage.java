package CoderGuide.DP;

/**
 * created by xdCao on 2018/4/2
 */

public class ClimbStage {

    public static void main(String[] args) {
        int n=climb(5);
        System.out.println(n);
    }

    private static int climb(int i) {

        if (i<1)
            return 0;
        if (i==1)
            return 1;
        if (i==2)
            return 2;

        return climb(i-2)+climb(i-1);

    }

}
