package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubString {

    public static void main(String[] args) {
        String s="adobecodebanc";
        String t="abc";

        String re=solution(s,t);

        System.out.println(re);


    }

    private static String solution(String s, String t) {

        char[] source = s.toCharArray();
        char[] terminal = t.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < terminal.length; i++) {
            hashMap.put(terminal[i], 0);
        }

        int minSize = s.length() + 1;
        int index1 = 0;
        int index2 = 0;

        for (int start = 0, end = 0; end < source.length; end++) {

            if (hashMap.get(source[end]) == null) {

            } else if (hashMap.get(source[end]) == 0) {
                hashMap.put(source[end], 1);

                //判断这个时候有没有全包含
                int temp = 0;
                for (Map.Entry entry : hashMap.entrySet()) {
                    temp = temp + (int) entry.getValue();
                }
                if (temp == terminal.length) {
                    for (int i = start; i < end ; i++) {
                        if (hashMap.get(source[i])!=null){
                            break;
                        }
                        start++;
                    }
                    if ((end - start + 1) < minSize) {
                        minSize = end - start + 1;
                        index1 = start;
                        index2 = end;
                    }
                }
            } else {
                for (int i = start; i < end; i++) {
                    if (hashMap.get(source[i])!=null&&hashMap.get(source[i])==1){
                        hashMap.put(source[i],0);
                    }
                    if (source[i] == source[end]) {
                        hashMap.put(source[i],1);
                        start = i + 1;
                        break;
                    }
                }

                //判断有没有全包含
                int temp = 0;
                for (Map.Entry entry : hashMap.entrySet()) {
                    temp = temp + (int) entry.getValue();
                }
                if (temp == terminal.length) {
                    for (int i = start; i < end ; i++) {
                        if (hashMap.get(source[i])!=null){
                            break;
                        }
                        start++;
                    }
                    if ((end - start + 1) < minSize) {
                        minSize = end - start + 1;
                        index1 = start;
                        index2 = end;
                    }
                }
            }

        }


        System.out.println(minSize);
        return s.substring(index1, index2+1);

    }

}
