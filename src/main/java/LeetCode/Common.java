package LeetCode;

public class Common {

    static class ListNode {

        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
            next=null;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public static ListNode createNodeList(int[] arr){

        ListNode head=new ListNode(arr[0]);
        ListNode cur=head;
        for (int i = 1; i < arr.length; i++) {
            ListNode listNode =new ListNode(arr[i]);
            cur.next= listNode;
            cur= listNode;
        }

        return head;
    }

    public static void printNodeList(ListNode head){

        while (head!=null){
            System.out.println(head.value);
            head=head.next;
        }

    }

    public static void swap(int[] array,int a,int b){
        int temp;
        temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
