package series;

public class Day68_2 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        int height;
        boolean isBalanced;

        Info(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }

    static Info isBalanced(Node root) {
        if (root == null) {
            return new Info(0, true);
        }

        Info left = isBalanced(root.left);
        Info right = isBalanced(root.right);

        int height = Math.max(left.height, right.height) + 1;

        boolean balanced = left.isBalanced &&
                right.isBalanced &&
                Math.abs(left.height - right.height) <= 1;

        return new Info(height, balanced);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(5);
        Info result = isBalanced(root);
        System.out.println("Is Binary Tree Balanced: " + result.isBalanced);
    }
}
