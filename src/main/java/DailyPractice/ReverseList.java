package DailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*翻转链表的递归非递归*/
public class ReverseList {

    static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next=null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {

        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        node1.setNext(node2);
//        node2.setNext(node3);
//        node3.setNext(node4);
//        node4.setNext(node5);

//        Node reverse1 = reverse1(node1);
//        while (reverse1!=null){
//            System.out.println(reverse1.value);
//            reverse1=reverse1.next;
//        }


        Node reverse2 = reverse2(node1);
        while (reverse2!=null){
            System.out.println(reverse2.value);
            reverse2=reverse2.next;
        }
    }

    private static Node reverse2(Node head) {

        if (head==null)
            return null;

        if (head.next==null)
            return head;

        Node pre=null;
        Node cur=head;
        Node next=head.next;


        while (next!=null){

            cur.next=pre;
            pre=cur;
            cur=next;
            next=cur.next;
        }

        cur.next=pre;

        return cur;


    }

    private static Node reverse1(Node head) {

        if (head==null)
            return null;

        if (head.next==null)
            return head;

        Node newHead=reverse1(head.next);
        head.next.setNext(head);
        head.setNext(null);

        return newHead;

    }

}
