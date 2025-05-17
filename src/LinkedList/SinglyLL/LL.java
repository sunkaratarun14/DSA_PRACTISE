package LinkedList.SinglyLL;

import org.w3c.dom.Node;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val +"->");
            temp=temp.next;
        }
        System.out.print("end");

    }
    public void inserAtFirst(int val){
        if (tail==null){
            tail=head;
        }
        Node node = new Node(val);
        node.next=head;
        head=node;
        size++;
    }
    public void insertAtLast(int val){
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        if (tail==null){
            inserAtFirst(val);
        }
        size++;


    }
    public void insertAtPOS(){}
    public void deleteAtFirst(){}
    public void deleteAtLast(){}
    public void deleteAtPOS(){}

    private class Node{
        private int val;
        private Node next;

//        constructor
        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


}
