package DailyPractice;

/*链表中删除指定节点*/
public class DeleteList {

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

        Node node=new Node(1);
        node.setNext(new Node(1));
        node.next.setNext(new Node(1));
        node.next.next.setNext(new Node(1));
        node.next.next.next.setNext(new Node(1));
        Node node1 = deleteNode(node,1);
        while (node1!=null){
            System.out.println(node1.value);
            node1=node1.next;
        }

    }

    private static Node deleteNode(Node head,int num) {

        if (head==null)
            return null;

        while (head.value==num){
            head=head.next;
        }

        Node pre=head;
        Node next=head.next;

        while (next!=null){
            if (next.value==num){
                pre.next=next.next;
                next=pre.next;
            }else {
                pre=next;
                next=pre.next;
            }
        }

        return head;

    }


}
