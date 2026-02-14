package series;

import java.util.ArrayList;

public class Day76_2 {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static void printPaths(Node root, ArrayList<Integer> path) {
        if (root == null) return;
        path.add(root.data);
        if (root.left == null && root.right == null) {
            for (int val : path) {
                System.out.print(val + " ");
            }
            System.out.println();
        } else {
            printPaths(root.left, path);
            printPaths(root.right, path);
        }
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println("Root to Leaf Paths:");
        printPaths(root, new ArrayList<>());
    }
}
