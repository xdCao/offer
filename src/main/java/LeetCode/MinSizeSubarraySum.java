package LeetCode;

import java.util.ArrayList;

public class MinSizeSubarraySum {

    public static void main(String[] args) {

        int[] array=new int[]{1,2,3,4,5,6,7,8};

        int size=solution(array,100);

        System.out.println(size);

    }

    private static int solution(int[] array, int sum) {

        int total=0;

        int sizeMin=array.length+1;


        for (int start = 0,end=0; end < array.length;) {
            if (total+array[end]<sum){
                total+=array[end];
            }else if (total+array[end]>=sum){
                total+=array[end];
                for (int i = start; i < end ; i++) {
                    if (total-array[i]>=sum){
                        total-=array[i];
                        start++;
                    }
                }
                if ((end-start+1)<sizeMin){
                    sizeMin=end-start+1;
                }
            }
            end++;
        }

        return sizeMin;


    }


}
