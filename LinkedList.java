package linkedlist;

public class LinkedList {

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node n = head;
        if (n != null) {
            while (n.next != null) {
                System.out.println(n.data);
                n = n.next;
            }
            System.out.println(n.data);
        } else {
            System.out.println("Empty List!");
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public int insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        if (index == 0) {
            node.next=head;
            head=node;
        } else {
            for (int i = 0; i < (index - 1); i++) {
                if (n.next == null || n.next.next == null) {
                    return -1;
                }
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }
        return 0;
    }

    public int delete(int data) {
        Node n = head;
        if (n == null) {
            return -1;
        }

        if (n.data == data) {
            head = n.next;
        } else {
            while (n.next != null && n.next.data != data) {
                n = n.next;
            }
            if (n.next != null) {
                n.next = n.next.next;
            } else {
                return -1;
            }

        }
        return 0;
    }

    public int deleteAll(int data) {
        while (delete(4) == 0);
        return 0;
    }

    public int deleteAt(int index) {
        Node node = new Node();
        node.next = null;

        Node n = head;
        if (n == null) {
            return -1;
        }
        if (index == 0) {
            head = n.next;
        } else {
            for (int i = 0; i < (index - 1); i++) {
                if (n.next == null || n.next.next == null) {
                    return -1;
                }
                n = n.next;
            }
        }
        n.next = n.next.next;

        return 0;
    }
}
