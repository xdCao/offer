package LeetCode;
/*三路快排的思想*/
public class SortColors {

    public static void main(String[] args) {

        int[] array=new int[]{2,2,1,2,1,0,2,1,0,0,1,1,1};

        sort(array);

        Common.printArray(array);

    }

    private static void sort(int[] array) {

        int zeroIndex=-1;
        int twoIndex=array.length;

        for (int i = 0; i < twoIndex;) {

            if (array[i]==1){
                i++;
            }else if (array[i]==0){
                Common.swap(array,i,++zeroIndex);
                i++;
            }else {
                Common.swap(array,i,--twoIndex);
                /*要注意这一块没有i++*/
            }

        }


    }


}
