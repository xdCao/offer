package OfferPractice;

/**
 * created by xdCao on 2018/3/12
 */
// todo 二分查找，在排序数组中找出某个数出现的次数
public class CountNumInSortedArray {

    public static void main(String[] args) {

        int[] array=new int[]{1,3,3,3,4,5};

        CountNumInSortedArray countNumInSortedArray=new CountNumInSortedArray();
        int i = countNumInSortedArray.GetNumberOfK(array, 3);
        System.out.println(i);
    }


    public int GetNumberOfK(int [] array , int k) {

        if (array==null||array.length==0){
            return 0;
        }

        int first=findFirstIndex(array,k);
        int last=findLastIndex(array,k);

        if (first==0&&last==0){
            return 0;
        }

        return (last-first+1);

    }

    private int findLastIndex(int[] array, int k) {
        int i=0;
        int j=array.length-1;
        while (i<j){
            if (array[(i+j)/2]<k) {
                i=(i+j)/2;
            }else if (array[(i+j)/2]==k){
                if ((i+j)/2==0){
                    return 0;
                }
                if (array[(i+j)/2+1]!=k){
                    return (i+j)/2;
                }else {
                    i=(i+j)/2;
                }
            }else{
                j=(i+j)/2;
            }
        }
        return 0;
    }

    private int findFirstIndex(int[] array, int k) {
        int i=0;
        int j=array.length-1;
        while (i<j){
            if (array[(i+j)/2]<k) {
                i=(i+j)/2;
            }else if (array[(i+j)/2]==k){
                if ((i+j)/2==0){
                    return 0;
                }
                if (array[(i+j)/2-1]!=k){
                    return (i+j)/2;
                }else {
                    j=(i+j)/2;
                }
            }else{
                j=(i+j)/2;
            }
        }
        return 0;
    }

}
