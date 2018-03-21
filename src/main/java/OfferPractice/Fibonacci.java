package OfferPractice;

/**
 * created by xdCao on 2018/3/7
 */

public class Fibonacci {

    public int Fibonacci(int n) {
        if ((n==0)||(n==1)){
            return n;
        }

        int old=0;
        int newNum=1;
        int count=0;

        for (int i = 2; i <=n ; i++) {
            count=old+newNum;
            old=newNum;
            newNum=count;
        }

        return count;

    }
}


