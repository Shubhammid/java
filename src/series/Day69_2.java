package series;

import java.util.*;

public class Day69_2 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static boolean isComplete(Node root) {
        if (root == null)
            return true;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        boolean foundNull = false;

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr == null) {
                foundNull = true;
            } else {
                if (foundNull)
                    return false;

                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        if (isComplete(root)) {
            System.out.println("Tree is Complete");
        } else {
            System.out.println("Tree is NOT Complete");
        }
    }
}
