package series;

import java.util.*;

public class Day74_1 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
    public static void preorder(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.data + " ");
            if (current.right != null)
                stack.push(current.right);
            if (current.left != null)
                stack.push(current.left);
        }
    }
    public static void inorder(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
        }
    }
    public static void postorder(Node root) {
        if (root == null) return;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            if (current.left != null)
                stack1.push(current.left);

            if (current.right != null)
                stack1.push(current.right);
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Preorder Traversal:");
        preorder(root);

        System.out.println("\nInorder Traversal:");
        inorder(root);

        System.out.println("\nPostorder Traversal:");
        postorder(root);
    }
}
