package series;

public class Day71_1 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
    static Node flipTree(Node root) {
        if (root == null)
            return null;

        Node left = flipTree(root.left);
        Node right = flipTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Before Flip: ");
        inorder(root);

        flipTree(root);

        System.out.print("\nAfter Flip: ");
        inorder(root);
    }
}
