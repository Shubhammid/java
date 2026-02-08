package series;

public class Day70_1 {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    static boolean isSameTree(Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        return a.data == b.data
                && isSameTree(a.left, b.left)
                && isSameTree(a.right, b.right);
    }
    static boolean isSubtree(Node root, Node subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);
        System.out.println("Is Subtree: " + isSubtree(root, subRoot));
    }
}
