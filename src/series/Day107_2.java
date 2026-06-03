package series;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Day107_2 {

    static class Node {
        int val;
        List<Node> children;

        Node(int val) {
            this.val = val;
            children = new ArrayList<>();
        }
    }

    public List<Integer> preorder(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node curr = stack.pop();
            result.add(curr.val);

            for (int i = curr.children.size() - 1; i >= 0; i--) {
                stack.push(curr.children.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        root.children.add(node2);
        root.children.add(node3);
        root.children.add(node4);
        node3.children.add(node5);
        node3.children.add(node6);
        Day107_2 obj = new Day107_2();
        List<Integer> preorder = obj.preorder(root);
        System.out.println("Preorder Traversal:");
        System.out.println(preorder);
    }
}