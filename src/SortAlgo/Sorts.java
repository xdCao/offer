package SortAlgo;

/**
 * created by xdCao on 2018/3/18
 */

public class Sorts {

    private static int[] array=new int[]{4,3,90,33,22,56,112,78};

    private static int[] aux=null;

    public static void main(String[] args) {

//        selectSort(array);
//        insertSort(array);
        mergeSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /*选择排序*/
    public static void selectSort(int[] array){
        int len=array.length;
        for (int i = 0; i < len; i++) {
            for (int j=i+1;j<len;j++){
                if (array[j]<array[i])
                    swap(array,i,j);
            }
        }
    }

    /*插入排序*/
    public static void insertSort(int[] array){
        int len=array.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j > 0 ; j--) {
                if (array[j]<array[j-1]){
                    swap(array,j,j-1);
                }
            }
        }

    }

    /*归并排序*/
    public static void mergeSort(int[] array){
        aux=new int[array.length];
        sort(array,0,array.length-1);
    }

    private static void sort(int[] array, int low, int high) {

        if (low>=high)
            return;

        int mid=(low+high)/2;
        sort(array,low,mid);
        sort(array,mid+1,high);
        merge(array,low,mid,high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        for (int i = low; i < high+1; i++) {
            aux[i]=array[i];
        }
        int j=low;
        int k=mid+1;
        for (int i = low; i < high+1; i++) {
            if (j>mid)
                array[i]=aux[k++];
            else if (k>high)
                array[i]=aux[j++];
            else if (aux[j]<aux[k])
                array[i]=aux[j++];
            else
                array[i]=aux[k++];

        }
    }

    /*快排*/
    public static void quickSort(int[] array){



    }


    private static void swap(int[] array, int i, int j) {
        int temp;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }




}
