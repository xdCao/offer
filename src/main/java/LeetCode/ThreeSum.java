package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ThreeSum {

    public static void main(String[] args) {

        int[] arr=new int[]{-1,0,1,2,-1,-4};

        solution(arr);

    }

    private static void solution(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            int target=0-arr[i];

            HashMap<Integer,Integer> hashMap=new HashMap();

            for (int j = i+1; j < arr.length ; j++) {

                hashMap.put(arr[j],j);

            }

            for(Map.Entry entry:hashMap.entrySet()){
                if (hashMap.containsKey(target-(int)entry.getKey())){
                    System.out.println(i+","+(int)entry.getValue()+","+(hashMap.get(target-(int)entry.getKey())));

                }
            }

        }


    }

}
