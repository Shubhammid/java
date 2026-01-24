package series;

public class Day60_1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node deleteNode(Node head, int key) {
        if (head == null) return null;

        if (head.data == key) {
            return head.next;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data != key) {
            curr = curr.next;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }

        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Before Deletion:");
        printList(head);

        head = deleteNode(head, 30);

        System.out.println("After Deletion:");
        printList(head);
    }
}
