package CoderGuide.DP;

/**
 * created by xdCao on 2018/4/2
 */

public class Fibonacci {

    public static void main(String[] args) {
        int num=20;
        int re=fibonacci(num);
        System.out.println(re);
        int i = fi2(num);
        System.out.println(i);
    }

    private static int fibonacci(int n) {
        if (n==0)
            return 0;
        if (n==1||n==2)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);

    }

    private static int fi2(int n){
        if (n<1)
            return 0;
        if (n==1||n==2)
            return 1;

        int res=2;
        int pre=1;
        int temp=0;
        for (int i = 3; i < n; i++) {
            temp=res;
            res=res+pre;
            pre=temp;
        }
        return res;
    }


}
