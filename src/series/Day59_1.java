package series;

public class Day59_1 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static void insert(int data) {
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
    static boolean findNode(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        int key = 30;
        if (findNode(key)) {
            System.out.println("Node " + key + " found");
        } else {
            System.out.println("Node " + key + " not found");
        }
    }
}
