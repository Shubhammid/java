package series;

import java.util.LinkedList;
import java.util.Queue;

class Day73_2 {

    static class Node {
        int data;
        Node left, right, next;

        Node(int data) {
            this.data = data;
            left = right = next = null;
        }
    }

    public static void connect(Node root) {
        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                if (prev != null) {
                    prev.next = current;
                }

                prev = current;

                if (current.left != null)
                    queue.offer(current.left);

                if (current.right != null)
                    queue.offer(current.right);
            }
            prev.next = null;
        }
    }

    public static void printLevels(Node root) {
        while (root != null) {
            Node current = root;

            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }

            System.out.println("NULL");
            root = root.left;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        connect(root);

        System.out.println("Level Order with Next Pointers:");
        printLevels(root);
    }
}
