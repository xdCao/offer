package JianzhiOffer;

import java.util.ArrayList;

/**
 * created by xdCao on 2018/3/10
 */
// todo 数组中找最小的k个数
public class MinKArray {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        if (input.length==0||k==0||k>input.length){
            return null;
        }

        ArrayList<Integer> arrayList=null;


        for (Integer integer:input){
            if (arrayList.size()>=k){
                Integer max=arrayList.get(0);
                int index=-1;
                for (int i=0;i<arrayList.size();i++){
                    if (arrayList.get(i)>=max){
                        max=arrayList.get(i);
                        index=i;
                    }
                }
                if (index>=0&&integer<max){
                    arrayList.remove(index);
                    arrayList.add(integer);
                }
            }else {
                arrayList.add(integer);
            }
        }

        return arrayList;

    }


    public static void main(String[] args) {
        int[] array=new int[]{1,2,3};
        ArrayList<Integer> arrayList = GetLeastNumbers_Solution(array, 5);
    }

}
