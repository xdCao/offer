package OfferPractice;

/**
 * created by xdCao on 2018/3/7
 */
// todo 字符串替换
public class SpaceReplace {

    public String replaceSpace(StringBuffer str) {
        int n=str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i)==' ')
                str.append("  ");
        }

        int idxOfOriginal=n-1;
        int idxOfNew=str.length()-1;

        while (idxOfOriginal>=0){
            if (str.charAt(idxOfOriginal)==' '){
                str.setCharAt(idxOfNew--,'0');
                str.setCharAt(idxOfNew--,'2');
                str.setCharAt(idxOfNew--,'%');
            }else {
                str.setCharAt(idxOfNew--,str.charAt(idxOfOriginal));
            }
            idxOfOriginal--;
        }

        return str.toString();

    }

}
