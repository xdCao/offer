import org.junit.Test;

/**
 * created by xdCao on 2018/3/21
 */

public class Niuke {

    int[] array=new int[]{9,6,5,7,8,3,4,22,11,2};

    /*选择排序*/
    @Test
    public void SelectSort(){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[i]){
                    swap(array,i,j);
                }
            }
        }

        printArray();

    }



    /*冒泡排序*/
    @Test
    public void bubbleSort(){

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1; j > i; j--) {
                if (array[j]<array[j-1]){
                    swap(array,j,j-1);
                }
            }
        }
        printArray();
    }

    /*插入排序*/
    @Test
    public void insertSort(){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (array[j]<array[j-1]){
                    swap(array,j,j-1);
                }
            }
        }
        printArray();
    }

    /*归并排序*/
    int[] aux=null;
    @Test
    public void mergeSort(){
        aux=new int[array.length];
        mergeSort(array,0,array.length-1);
        printArray();
    }

    private void mergeSort(int[] array, int low, int high) {

        if (low>=high)
            return;

        int mid=(low+high)/2;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);
    }

    private void merge(int[] array, int low, int mid, int high) {
        for (int i = low; i <= high ; i++) {
            aux[i]=array[i];
        }

        int j=low;
        int k=mid+1;
        for (int i = low; i <= high; i++) {
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


    /*快速排序*/
    @Test
    public void quickSort(){

        quickSort(array,0,array.length-1);
        printArray();

    }

    private void quickSort(int[] array, int low, int high) {

        if (low>=high)
            return;

        int j=partition(array,low,high);
        quickSort(array,low,j-1);
        quickSort(array,j+1,high);

    }

    private int partition(int[] array, int low, int high) {

        int i=low;
        int j=high+1;
        while (true){
            while (array[++i]<=array[low]){
                if (i>=high)
                    break;
            }
            while (array[--j]>=array[low]){
                if (j<=low)
                    break;
            }
            if (i>=j)
                break;
            swap(array,i,j);
        }

        swap(array,low,j);
        return j;

    }


    private void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    private void swap(int[] array, int i, int j) {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }


}
