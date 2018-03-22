package True;

import java.io.IOException;
import java.util.Scanner;

/**
 * created by xdCao on 2018/3/22
 */

public class Ticket {

    public static int doCal(int n) {

        int daySum = 0;
        int sum=0;
        for (int i = 1; daySum <= n; i++) {
            daySum+=i;
            sum=i;
        }

        int count = 0;
        for (int i = 0; i <= sum - 3; i++) {
            count += i;
        }

        daySum=0;
        for (int i = 0; i < sum; i++) {
            daySum+=i;
        }

        int remain=n-daySum;
        return count+remain+1;
    }

    public static void main(String[] args) throws IOException {
        int read=0;
        while ((read=System.in.read())!=-1){
            doCal(read);
        }
    }

}
