package series;

public class Day72_1 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node findLCA(Node root, int n1, int n2) {
        if (root == null) return null;

        if (root.data == n1 || root.data == n2)
            return root;

        Node leftLCA = findLCA(root.left, n1, n2);
        Node rightLCA = findLCA(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null)
            return root;

        return (leftLCA != null) ? leftLCA : rightLCA;
    }
    static int findDistance(Node root, int target, int dist) {
        if (root == null) return -1;

        if (root.data == target)
            return dist;

        int left = findDistance(root.left, target, dist + 1);
        if (left != -1) return left;

        return findDistance(root.right, target, dist + 1);
    }

    static int distanceBetweenNodes(Node root, int n1, int n2) {
        Node lca = findLCA(root, n1, n2);

        int d1 = findDistance(lca, n1, 0);
        int d2 = findDistance(lca, n2, 0);

        return d1 + d2;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;

        System.out.println("Distance between nodes: " +
                distanceBetweenNodes(root, n1, n2));
    }
}
