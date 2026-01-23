package series;


public class Day59_2 {
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
    static boolean detectLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    static void createLoop() {
        head.next.next.next = head;
    }
    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        System.out.println("Loop detected: " + detectLoop());
        createLoop();
        System.out.println("Loop detected after creating loop: " + detectLoop());
    }
}

