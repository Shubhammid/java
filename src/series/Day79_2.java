package series;

public class Day79_2 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node prev = null;
    static Node head = null;
    public static void convertToDLL(Node root) {
        if (root == null) return;

        convertToDLL(root.left);

        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }

        prev = root;

        convertToDLL(root.right);
    }

    public static void printDLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.right;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(15);

        convertToDLL(root);

        System.out.print("Doubly Linked List: ");
        printDLL(head);
    }
}
