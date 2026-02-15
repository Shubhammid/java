package series;

class Day77_2 {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    static int maxSum = Integer.MIN_VALUE;
    static int maxPath(Node root) {
        if (root == null)
            return 0;
        int left = Math.max(0, maxPath(root.left));
        int right = Math.max(0, maxPath(root.right));
        int currentPath = root.data + left + right;
        maxSum = Math.max(maxSum, currentPath);
        return root.data + Math.max(left, right);
    }

    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        maxPath(root);
        System.out.println("Maximum Path Sum: " + maxSum);
    }
}
