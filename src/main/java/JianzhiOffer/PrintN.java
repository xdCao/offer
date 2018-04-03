package JianzhiOffer;

/**
 * created by xdCao on 2018/3/8
 */

public class PrintN {

//    public static void print1ToMaxN(int n){
//
//        for (int i = 0; i <Math.pow(10,n)-1; i++) {
//            System.out.println(i+1);
//        }
//    }

    public static void print1ToMaxOfNDigits(int n) {
        if (n < 0) return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, -1);
    }

    private static void print1ToMaxOfNDigits(char[] number, int idx) {
        if (idx == number.length - 1) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[idx + 1] = (char) (i + '0');
            print1ToMaxOfNDigits(number, idx + 1);
        }
    }

    private static void printNumber(char[] number) {
        boolean isBeginWith0 = true;
        for (char c : number) {
            if (isBeginWith0 && c != '0') isBeginWith0 = false;
            if(!isBeginWith0) System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print1ToMaxOfNDigits(3);
    }

}
