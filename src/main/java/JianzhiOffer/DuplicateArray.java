package JianzhiOffer;

/**
 * created by xdCao on 2018/3/7
 */

public class DuplicateArray {

    public static boolean duplicate(Integer[] array,int n){
        int length=array.length;
        if (length<=1){
            return false;
        }
        Integer[] duplicate=new Integer[n];
        for (int i=0;i<length;i++){
            if (duplicate[array[i]]==null){
                duplicate[array[i]]=array[i];
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] array=new Integer[]{1};
        boolean duplicate = duplicate(array,2);
        System.out.println(duplicate);
    }

}
