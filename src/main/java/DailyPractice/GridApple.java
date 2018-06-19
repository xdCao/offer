package DailyPractice;

import java.util.ArrayList;
import java.util.List;

/*格子取苹果*/
public class GridApple {

    public static Integer[][] arrays=new Integer[][]{
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5},
            {1,2,3,4,5}
    };

    public static int num=0;


    public static List<Integer> getTrack(){

        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[0].length; j++) {
                if (i==0&&j!=0)
                    arrays[i][j]=arrays[i][j-1]+arrays[i][j];
                if (i!=0&&j==0)
                    arrays[i][j]=arrays[i-1][j]+arrays[i][j];
                if (i!=0&&j!=0){
                    if (arrays[i-1][j]>arrays[i][j-1]){
                        arrays[i][j]=arrays[i-1][j]+arrays[i][j];
                    }else {
                        arrays[i][j]=arrays[i][j-1]+arrays[i][j];
                    }

                }

            }
        }


        list.add(arrays.length-1);
        list.add(arrays[0].length-1);
        list.add(null);

            for (int i = arrays.length-1,j = arrays[0].length-1;;) {
                if (i==0&&j==0)
                    break;
                if (i!=0&&arrays[i-1][j]>arrays[i][j-1]){
                    list.add(i-1);
                    list.add(j);
                    list.add(null);
                    i=i-1;
                }else {
                    list.add(i);
                    list.add(j-1);
                    list.add(null);
                    j=j-1;
                    if (j==0)
                        break;
                }
            }


        num=arrays[arrays.length-1][arrays[0].length-1];

        return list;

    }


    public static void main(String[] args) {
        List<Integer> track = getTrack();
        for (Integer integer:track){
            System.out.println(integer);
        }

        System.out.println("totalNum: "+num);
    }


}
