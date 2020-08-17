package linkedlist;

public class main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.insert(i);
        }
        //list.insertAtStart(25);
        list.insertAt(101, 4);
        /*list.insertAt(5, 4);
        list.insertAt(7, 4);
        list.insertAt(9, 4);
        list.delete(25);
        list.deleteAll(4);*/
        list.deleteAt(0); 
        list.show();
    }

}
