package LeetCode;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] arr=new String[]{"eat","ate","tea","tan","nat","bat"};

        solution(arr);

    }

    private static void solution(String[] arr) {

        HashMap<String,ArrayList<Integer>> hashMap=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String sort = sort(arr[i]);
            if (hashMap.get(sort)==null){
                ArrayList<Integer> arrayList=new ArrayList<>();
                arrayList.add(i);
                hashMap.put(sort,arrayList);
            }else {
                hashMap.get(sort).add(i);
            }
        }

        for (Map.Entry entry:hashMap.entrySet()){
            ArrayList<Integer> value = (ArrayList<Integer>) entry.getValue();
            for (Integer integer:value){
                System.out.print(arr[integer]+", ");
            }
            System.out.println();
        }

    }

    private static String  sort(String s) {

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);

    }

}
