package series;

public class Day65_1 {

    public static void main(String[] args) {

        SortLinkedList.Node head = new SortLinkedList.Node(4);
        head.next = new SortLinkedList.Node(2);
        head.next.next = new SortLinkedList.Node(1);
        head.next.next.next = new SortLinkedList.Node(3);

        System.out.print("Original List: ");
        SortLinkedList.printList(head);

        head = SortLinkedList.mergeSort(head);

        System.out.print("Sorted List: ");
        SortLinkedList.printList(head);
    }
}

class SortLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }

    static Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return merge(left, right);
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
