package OfferPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * created by xdCao on 2018/3/8
 */
// todo 冒泡的应用，可以有更高的解法，两个指针同时移动交换数据
public class OddReorder {

    public static void reOrderArray(int [] array) {
        for (int i=0;i<array.length;i++){
            if (array[i]%2!=0){
                swap(array,i);
            }
        }

    }

    private static void swap(int[] array,int i) {
        if (i<1){
            return;
        }
        while (i>0&&array[i-1]%2==0){
            int temp=array[i-1];
            array[i-1]=array[i];
            array[i]=temp;
            i--;
        }
    }


    public static void main(String[] args) {
        int[] array=new int[]{2,4,6,7,3,5,1};
        reOrderArray(array);
        for (Integer integer:array){
            System.out.println(integer);
        }
    }

}
