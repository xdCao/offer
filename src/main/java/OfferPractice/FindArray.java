package OfferPractice;

/**
 * created by xdCao on 2018/3/7
 */
// todo 数组角落查找
public class FindArray {

    public static boolean find(int target, Integer [][] array) {
        if (array==null||array.length==0||array[0].length==0)
            return false;
        int m=array.length;
        int n=array[0].length;
        int row=0;
        int col=n-1;
        while (row<m&&col>=0){
            if (target==array[row][col])
                return true;
            if (target>array[row][col]){
                row++;
            }
            if (target<array[row][col]){
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[][] array=new Integer[][]{
            {1,3,8,9},
            {2,5,11,12},
            {4,7,12,16},
            {12,13,14,17}
        };

        boolean b = find(0, array);
        System.out.println(b);

    }

}