package series;

public class Day76_1 {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static void printLeaves(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }
        printLeaves(root.left);
        printLeaves(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.print("Leaf nodes: ");
        printLeaves(root);
    }
}
