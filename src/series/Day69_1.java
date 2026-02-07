package series;

public class Day69_1 {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static boolean isBST(Node root, long min, long max) {
        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        if (isBST(root, Long.MIN_VALUE, Long.MAX_VALUE)) {
            System.out.println("Tree is a BST");
        } else {
            System.out.println("Tree is NOT a BST");
        }
    }
}
