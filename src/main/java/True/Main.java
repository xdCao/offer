package True;

import java.util.Scanner;

/**
 * created by xdCao on 2018/3/22
 */

public class Main {



    public static void main(String[] args) {

//        Scanner cin = new Scanner(System.in);
//        String a, b;
//        while(cin.hasNextLine())
//        {
//            a = cin.nextLine();
//            b = cin.nextLine();
//            System.out.println(countStrDis(a,b));
//        }

        System.out.println(countStrDis("aaaaaaaaaaaa","bb"));

    }


    public static int countStrDis(String s,String t){

        if (s==null)
            return 0;

        if (t==null)
            return s.length();

        int number=s.length()-t.length()+1;
        String[] strings=new String[number];

        for (int i = 0; i < number; i++) {
            strings[i]=s.substring(i,i+t.length());
        }

        int count=0;
        for (String string:strings){
            count+=countStrDisEqual(string,t);
        }
        return count;
    }

    private static int countStrDisEqual(String string, String t) {
        int temp=0;
        char[] chars = string.toCharArray();
        char[] chars1 = t.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!=chars1[i])
                temp++;
        }
        return temp;
    }

}
