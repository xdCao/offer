package OfferPractice;

/**
 * created by xdCao on 2018/3/7
 */
// todo 旋转数组中找最小值，二分查找
public class MinInArray {

    public int minNumberInRotateArray(int [] array) {
        int length=array.length;
        int index1=0;
        int index2=length-1;
        if (array[0]<array[length-1]){
            return array[0];
        }
        while (index1<index2){
            if (array[(index1+index2)/2]>array[index2]){
                index1=(index1+index2)/2+1;
            }else if (array[(index1+index2)/2]==array[index2]){
                return array[(index1+index2)/2+1];
            }else {
                index2=(index1+index2)/2;
            }
        }
        return array[index1]>array[index2]?array[index2]:array[index1];

    }

}
