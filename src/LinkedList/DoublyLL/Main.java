package LinkedList.DoublyLL;

public class Main {
    public static void main(String args[]){
//        System.out.println("Check");
        DLL list= new DLL();
        list.insertAtFirst(12);
        list.insertAtFirst(20);
        list.insertAtFirst(10);

        list.insertAtLast(100);

        list.display();

        list.display_reverse();

        list.inserAfter(50,200);
        list.inserAfter(99,100);

        list.display();
    }
}
