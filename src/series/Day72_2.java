package series;

public class Day72_2 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }
    static Node inorderSuccessor(Node root, Node target) {
        Node successor = null;

        while (root != null) {
            if (target.data < root.data) {
                successor = root;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return successor;
    }

    public static void main(String[] args) {

        Node root = null;
        int[] values = {20, 10, 30, 5, 15};

        for (int val : values)
            root = insert(root, val);

        Node target = root.left.right;

        Node successor = inorderSuccessor(root, target);

        if (successor != null)
            System.out.println("Inorder successor of " +
                    target.data + " is " + successor.data);
        else
            System.out.println("No inorder successor found");
    }
}
