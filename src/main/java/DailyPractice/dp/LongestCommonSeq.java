package DailyPractice.dp;

import java.util.ArrayList;
import java.util.List;

/*最长公共子序列*/
public class LongestCommonSeq {

    public static void main(String[] args) {

        String str1="abcbdab";
        String str2="bdcaba";
        System.out.println(lcs(str1,str2));

    }

    private static List<Character> lcs(String str1, String str2) {

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        List<Character> list=new ArrayList<>();

        int[][] array=new int[chars1.length+1][chars2.length+1];
        for (int i = 1; i < chars1.length+1; i++) {
            for (int j = 1; j < chars2.length+1; j++) {

                if (i==1&&j==1){
                    if (chars1[i]==chars2[j]){
                        array[i][j]=1;
                    }else {
                        array[i][j]=0;
                    }
                    continue;
                }


                if (chars1[i-1]==chars2[j-1]) {
                    array[i][j] = array[i-1][j-1]+1;
                }else {
                    if (array[i][j-1]>array[i-1][j]){
                        array[i][j]=array[i][j-1];
                    }else {
                        array[i][j]=array[i-1][j];
                    }
                }


            }
        }


        int temp=1;
        for (int i = temp; i < Math.min(chars1.length,chars2.length)+1; i++) {
            if (array[i][i]==temp){
                list.add(chars1[i-1]);
                temp++;
            }
        }

        return list;

    }

}
