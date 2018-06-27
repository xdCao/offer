package LeetCode;

public class MoveZeroes {


    public static void main(String[] args) {

        int[] array=new int[]{1,0,3,0,5,0,0,7,7};

        moveZero(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    private static void moveZero(int[] array) {


        int k=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0){
                if (array[k]==0)
                    Common.swap(array,i,k);
                k++;
            }
        }

    }




}
