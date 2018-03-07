package OfferPractice;

/**
 * created by xdCao on 2018/3/7
 */

public class Eager {

    private static Eager instance=new Eager();

    private Eager() {
    }

    public static Eager getInstance() {
         return instance;
    }
}
