package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * created by xdCao on 2018/3/22
 */

public class Bumber {

    public static void main(String[] args) {

//        Scanner cin = new Scanner(System.in);
//        String input=cin.next();
        int i = minNum("11");
        System.out.println(i);

    }


    public static int minNum(String input){

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }
        System.out.println();
        int[] array=new int[10];
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case '0':array[0]++;break;
                case '1':array[1]++;break;
                case '2':array[2]++;break;
                case '3':array[3]++;break;
                case '4':array[4]++;break;
                case '5':array[5]++;break;
                case '6':array[6]++;break;
                case '7':array[7]++;break;
                case '8':array[8]++;break;
                case '9':array[9]++;break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        int temp=array[0];
        int index=0;
        int min=0;

        for (int i = 1; i < array.length; i++) {

            if (array[i]<temp){
                temp=array[i];
                index=i;
            }
            if (array[i]==temp){
                if (index==0){
                    temp=array[i];
                    index=i;
                }
            }

        }
        return cal(temp,index);

    }

    private static int cal(int temp, int index) {

        if (index==0){
            int a=1;
            for (int i = 0; i < temp + 1; i++) {
                a=a*10;
            }
            return a;
        } else{

            int a=1;
            if (temp==0){
                return a*index;
            }
            for (int i = 0; i < temp ; i++) {
                a=a*10;
            }
            return (a+1)*index;
        }
    }


}
