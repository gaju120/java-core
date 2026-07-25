
public class SinglyLInklist {
    static class Node {

        int data; // data part
        Node next; // refrance to next node

        Node(int data) {
            this.data = data; // constructor
            next = null;
        }
    }

    Node head; // it is a head means first node always store outside the class

    // step 2: insert at end

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;

    }
    // step 3 insert at beggining

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void delete(int key) {
        if (head == null) {
            System.out.println("list is Empty");
            return;

        }
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("value not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {

    }
}
