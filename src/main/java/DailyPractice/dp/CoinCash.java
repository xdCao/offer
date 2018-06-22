package DailyPractice.dp;

import java.util.ArrayList;
/*硬币找零问题*/
public class CoinCash {


    public static Integer cashConsist(int total){

        if (total==0)
            return 0;
        if (total==1||total==3||total==5)
            return 1;
        if (total==2||total==4)
            return 2;

        Integer[] array=new Integer[total+1];
        array[0]=0;
        array[1]=1;
        array[2]=2;
        array[3]=1;
        array[4]=2;
        array[5]=1;
        for (int i = 6; i < total+1; i++) {
            array[i]=Math.min(Math.min(array[i-5],array[i-3]),array[i-1])+1;
        }

        return array[total];

    }


    public static void main(String[] args) {

        System.out.println(cashConsist(101));


    }


}
