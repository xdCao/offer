package LeetCode;

import java.util.ArrayList;

/*java中的优先级队列默认为最小堆*/
public class PriorityQueue {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        Heap heap = new Heap(arr, arr.length);

//        int[] heapMax = heap.buildHeapMax(arr.length);

//        for (int i = 0; i < heapMax.length; i++) {
//            System.out.println(heapMax[i]);
//        }
//        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>();
        /*堆排序*/


        for (int i = 0; i < arr.length; i++) {
            int[] ints = heap.buildHeapMax(arr.length-i);
            arrayList.add(ints[0]);
            Common.swap(ints, 0, arr.length - 1-i);
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " , ");
            }
            System.out.println();
        }

        for (Integer integer:arrayList){
            System.out.println(integer);
        }

    }




    static class Heap{

        private int[] heapInternal =null;

        private int length=0;

        public Heap(int[] arr,int len) {

            heapInternal = arr;
            length=len;

        }

        public int[] getHeapInternal() {
            return heapInternal;
        }

        public int left(int i){
            return 2*i+1;
        }

        public int right(int i){
            return 2*i+2;
        }

        public int parent(int i){
            return (i-1)/2;
        }

        /*保持大根堆性质*/
        public void heapifyMax(int[] a, int i, int heapLength){

            int left=left(i);
            int right=right(i);
            int largest=-1;

            /*以i为父节点的情况下找出三个元素中的最大的,如果i不是最大的元素,将其与最大元素交换位置*/
            if (left<heapLength&&a[i]<a[left]){
                largest=left;
            }else {
                largest=i;
            }

            if (right<heapLength&&a[right]>a[largest]){
                largest=right;
            }

            if (i!=largest){
                Common.swap(a,i,largest);
                heapifyMax(a,largest,heapLength);
            }

        }

        /*保持小根堆性质*/
        public void heapifyMin(int[] a,int i,int heapLength){

            int left=left(i);
            int right=right(i);
            int largest=-1;

            if (left<heapLength&&a[left]>a[i]){
                largest=left;
            }else {
                largest=i;
            }

            if (right<heapLength&&a[right]>largest){
                largest=right;
            }

            if (largest!=i){
                Common.swap(a,i,largest);
                heapifyMin(a,largest,heapLength);
            }

        }


        public int[] buildHeapMax(int newlength){

            int heapLength= newlength;
            /*从第一个非叶子节点开始,向根部遍历并调用heapify方法*/
            for (int i = parent(heapLength-1); i >=0 ; i--) {
                heapifyMax(heapInternal,i,heapLength);
            }

            return heapInternal;

        }



    }

}
