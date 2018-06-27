package LeetCode;

public class RemoveDuplicateInArray {

    public static void main(String[] args) {

        int[] array=new int[]{1,1,1,1,2,2,2,3,3,3,3,6,7};

        int[] ints = removeDup(array);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }

    private static int[] removeDup(int[] array) {

        int temp=array[0];
        int count=0;
        int total=0;
        for (int i = 1; i < array.length-1; i++) {
            if (array[i]==temp){
                if (count>=1){
                    //去掉该元素
                    array[i]=0;
                    total++;
                }else {
                    count++;
                }
            }else {
                temp=array[i];
                count=0;
            }
        }


        int[] arr=new int[array.length-total];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0){
                arr[index]=array[i];
                index++;
            }
        }

        return arr;

    }

}
