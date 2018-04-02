package CoderGuide.DP;

/**
 * created by xdCao on 2018/4/2
 */

public class Cow {

    public static void main(String[] args) {
        int num=6;
        int re=cow(num);
        System.out.println(re);
    }

    private static int cow(int num) {

        if (num<1)
            return 0;
        if (num==1||num==2||num==3)
            return num;

        int prepre=1;
        int pre=2;
        int res=3;
        int tempPre;
        for (int i = 4; i <= num; i++) {
            tempPre=pre;
            pre=res;
            res=res+prepre;
            prepre=tempPre;
        }

        return res;
    }

}
