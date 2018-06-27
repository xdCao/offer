package LeetCode;

public class Common {

    public static void swap(int[] array,int a,int b){
        int temp;
        temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
