package series;

public class Day65_2 {

    public static void main(String[] args) {

        InterleaveLinkedList.Node head = new InterleaveLinkedList.Node(1);
        head.next = new InterleaveLinkedList.Node(2);
        head.next.next = new InterleaveLinkedList.Node(3);
        head.next.next.next = new InterleaveLinkedList.Node(4);
        head.next.next.next.next = new InterleaveLinkedList.Node(5);
        head.next.next.next.next.next = new InterleaveLinkedList.Node(6);

        System.out.print("Original List: ");
        InterleaveLinkedList.printList(head);

        head = InterleaveLinkedList.interleave(head);

        System.out.print("Interleaved List: ");
        InterleaveLinkedList.printList(head);
    }
}

class InterleaveLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node interleave(Node head) {
        if (head == null || head.next == null)
            return head;

        // Find middle
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        slow.next = null;

        Node first = head;

        // Interleave two halves
        while (first != null && second != null) {
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }

        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
