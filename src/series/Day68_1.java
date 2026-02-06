package series;

public class Day68_1 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        int height;
        int diameter;

        Info(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
    static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info left = diameter(root.left);
        Info right = diameter(root.right);

        int height = Math.max(left.height, right.height) + 1;

        int selfDiameter = left.height + right.height + 1;
        int maxDiameter = Math.max(selfDiameter,
                Math.max(left.diameter, right.diameter));

        return new Info(height, maxDiameter);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Info result = diameter(root);
        System.out.println("Diameter of Binary Tree: " + result.diameter);
    }
}
