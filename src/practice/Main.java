package practice;

import java.util.*;

/**
 * created by xdCao on 2018/3/6
 */

public class Main {
    /** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    public static void main(String[] args) {

        List<Integer> order = new ArrayList<Integer>();
        Map<String, List<Integer>> boms = new HashMap<String, List<Integer>>();
        order.add(2);
        order.add(3);
        order.add(1);

        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(1);
        list1.add(1);

        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(0);


        List<Integer> list3=new ArrayList<>();
        list3.add(0);
        list3.add(1);
        list3.add(1);

        boms.put("bom1",list1);
        boms.put("bom2",list2);
        boms.put("bom3",list3);

//        Scanner in = new Scanner(System.in);
//        String line = in.nextLine();
//
//        Integer n = Integer.parseInt(line.split(",")[0]);
//        Integer m = Integer.parseInt(line.split(",")[1]);
//
//        line = in.nextLine();
//        String[] itemCnt = line.split(",");
//        for(int i = 0; i < n ; i++){
//            order.add(Integer.parseInt(itemCnt[i]));
//        }
//
//        for(int i = 0; i < m; i++){
//            line = in.nextLine();
//            String[] bomInput = line.split(",");
//            List<Integer> bomDetail = new ArrayList<Integer>();
//
//            for(int j = 1; j <= n; j++ ){
//                bomDetail.add(Integer.parseInt(bomInput[j]));
//            }
//            boms.put(bomInput[0], bomDetail);
//        }
//        in.close();

        Map<String, Integer> res = resolve(order, boms);

        System.out.println("match result:");
        for(String key : res.keySet()){
            System.out.println(key+"*"+res.get(key));
        }
    }

    // write your code here
    public static Map<String, Integer> resolve(List<Integer> order, Map<String, List<Integer>> boms) {

        int m = boms.size();
        List<List<Integer>> allList=new ArrayList<>();

        Set<String> strings = boms.keySet();
        for (String schemeName:strings){
            List<Integer> schemeCnt = boms.get(schemeName);
            allList.add(schemeCnt);
        }

        Map<String ,Integer> result=new HashMap<>();

        for (String schemeName:strings){
            int atMost=doSolve(order,allList);
            result.put(schemeName,atMost);
        }

        return result;


    }

    private static int doSolve(List<Integer> order, List<List<Integer>> allList) {
        int atMost=0;
        for (int i=0;i<order.size();i++){
            if (allList.get(0).get(i)!=0){
                if (order.get(i)/allList.get(0).get(i)>atMost){
                    atMost=order.get(i)/allList.get(0).get(i);
                }
            }
        }
        for (int i=0;i<order.size();i++){
            order.set(i,order.get(i)-atMost*allList.get(0).get(i));
        }
        return atMost;
    }
}
