package series;

public class Day60_2 {

    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    static Node deleteEveryKth(Node head, int k) {
        if (head == null || k <= 0) return head;

        Node curr = head;
        int count = 1;

        while (curr != null) {
            Node next = curr.next;

            if (count % k == 0) {
                if (curr.prev != null)
                    curr.prev.next = curr.next;
                else
                    head = curr.next;

                if (curr.next != null)
                    curr.next.prev = curr.prev;
            }
            curr = next;
            count++;
        }
        return head;
    }

    static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = n5;
        n5.prev = n4;

        System.out.println("Original DLL:");
        printDLL(head);

        head = deleteEveryKth(head, 2);

        System.out.println("After deleting every 2nd node:");
        printDLL(head);
    }
}
