package OfferPractice;

import java.util.ArrayList;

/**
 * created by xdCao on 2018/3/9
 */

public class ClockMatrix {

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix.length==0){
            return null;
        }

        ArrayList<Integer> arrayList=new ArrayList<>();

        if (matrix[0].length==1){
            for (int i=0;i<matrix.length;i++){
                arrayList.add(matrix[i][0]);
            }
            return arrayList;
        }

        int m=0;
        int n=0;
        int width=matrix[0].length;
        int height=matrix.length;
        while (width>0&&height>0){
            printCircle(matrix, arrayList, m, n, width, height);
            width-=2;
            height-=2;
            m+=1;
            n+=1;
        }
        return arrayList;



    }

    private static void printCircle(int[][] matrix, ArrayList<Integer> arrayList, int m, int n, int width, int height) {

        if (width==1&&height==1){
            arrayList.add(matrix[m][n]);
            return;
        }

        if (width==1){
            for (int i = 0; i < height; i++) {
                arrayList.add(matrix[m][n]);
                m++;
            }
            return;
        }

        if (height==1){
            for (int i = 0; i < width; i++) {
                arrayList.add(matrix[m][n]);
                n++;
            }
            return;
        }

        for (int i = 0; i < 2*width+2*height-4; i++) {
            arrayList.add(matrix[m][n]);
            if (i<width-1){
                n++;
                continue;
            }
            if (i<width+height-2){
                m++;
                continue;
            }
            if (i<2*width+height-3){
                n--;
                continue;
            }
            if (i<2*width+2*height-4){
                m--;
            }

        }
    }

    public static void main(String[] args) {
        int[][] array=new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        ArrayList<Integer> arrayList = printMatrix(array);
        for (Integer integer:arrayList){
            System.out.println(integer);
        }

    }

}
