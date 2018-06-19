package DailyPractice;
/*字符串相似度,编辑距离*/
public class StringDistance {

    public static Integer getDistance(String s,String t){

        int sLen = s.length();
        int tLen=t.length();

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Integer[][] array=new Integer[sLen][tLen];

        for (int i = 0; i < sLen; i++) {
            for (int j = 0; j < tLen; j++) {

                if (i==0&&j==0){
                    if (sChars[i]==tChars[j]){
                        array[i][j]=0;
                    }else {
                        array[i][j]=1;
                    }
                    continue;
                }

                if (sChars[i]==tChars[j]){
                    array[i][i]=array[i-1][j-1];
                }else if (i!=0&&j!=0){
                    array[i][j]=Math.min(array[i-1][j-1],Math.min(array[i][j-1],array[i-1][j]))+1;
                }else if (i==0){
                    array[i][j]=array[i][j-1]+1;
                }else{
                    array[i][j]=array[i-1][j]+1;
                }
            }
        }

        return array[sLen-1][tLen-1];


    }


    public static void main(String[] args) {
        Integer instance = getDistance("abc", "xyz");
        System.out.println(instance);
    }


}
