import org.junit.Test;

/**
 * created by xdCao on 2018/3/22
 */

public class Strings {

    /*字符串中单词逆序*/
    @Test
    public void reverseWords(){

        String string = "I'm fine thank you";
        String[] split = string.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (i<split.length-i-1){
                swap(split,i,split.length-i-1);
            }else {
                break;
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (String s:split){
            stringBuilder.append(s+" ");
        }

        System.out.println(stringBuilder.toString());

    }

    private void swap(Object[] split, int i, int j) {
        Object temp=split[i];
        split[i]=split[j];
        split[j]=temp;
    }

    /*判断旋转字符串*/
    @Test
    public void rotateStr(){
        String string1="12345";
        String string2="34512";
        String newS=string1+string1;
        System.out.println(newS.contains(string2));
    }

    /*原地旋转字符串*/
    @Test
    public void changeStr(){
        String string = "ABCDE";
        int i=2;
        char[] chars = string.toCharArray();
        for (int j = 0; j < i + 1; j++) {
            if (j<i-j){
                swap(chars,j,i-j);
            }else {
                break;
            }
        }
        for (int j = i+1; j < chars.length; j++) {
            if (j<chars.length-j+i){
                swap(chars,j,chars.length-j+i);
            }else {
                break;
            }
        }
        for (int j = 0; j < chars.length; j++) {
            if (j<chars.length-j-1){
                swap(chars,j,chars.length-j-1);
            }else {
                break;
            }
        }

        System.out.println(new String(chars));

    }
    private void swap(char[] split, int i, int j) {
        char temp=split[i];
        split[i]=split[j];
        split[j]=temp;
    }


}
