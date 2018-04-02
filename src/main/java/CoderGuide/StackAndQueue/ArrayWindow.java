package CoderGuide.StackAndQueue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * created by xdCao on 2018/3/27
 */

public class ArrayWindow {

    private static int[] array=new int[]{4,3,5,4,3,3,6,7};

    public static ArrayList<Integer> arrayWindow(int[] array){

        Deque<Integer> deque=new LinkedList<>();

        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            while (!deque.isEmpty()&&array[deque.peekLast()]<=array[i]){
                deque.pollLast();
            }
            deque.addLast(i);
            if (deque.peekFirst()==i-3){
                deque.pollFirst();
            }
            if (i>=2){
                arrayList.add(array[deque.peekFirst()]);
            }
        }
        return arrayList;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = arrayWindow(array);
        for (Integer integer:arrayList){
            System.out.println(integer);
        }
    }

}
