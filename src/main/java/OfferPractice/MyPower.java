package OfferPractice;

/**
 * created by xdCao on 2018/3/7
 */

public class MyPower {

    public static double Power(double base, int exponent) {

        double count=1.0;

        if (exponent==0){
            return 1;
        }

        if (exponent>0){
            for (int i = 0; i < exponent; i++) {
                count=count*base;
            }
        }
        if (exponent<0){
            for (int i = exponent; i < 0; i++) {
                count=count/base;
            }
        }


        return count;

    }


    public static void main(String[] args) {
        System.out.println(Power(2,-3));
    }

}
