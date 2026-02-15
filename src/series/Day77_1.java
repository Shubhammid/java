package series;

class Day77_1 {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    static void pathSum(Node root, int k) {
        int[] path = new int[100];
        printPath(root, k, path, 0);
    }
    static void printPath(Node root, int k, int[] path, int len) {
        if (root == null)
            return;
        path[len] = root.data;
        len++;
        if (root.left == null && root.right == null) {
            int sum = 0;
            for (int i = 0; i < len; i++)
                sum += path[i];
            if (sum == k) {
                for (int i = 0; i < len; i++)
                    System.out.print(path[i] + " ");
                System.out.println();
            }
        }
        printPath(root.left, k, path, len);
        printPath(root.right, k, path, len);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(12);
        root.left.left = new Node(4);
        root.left.right = new Node(7);

        int k = 22;

        System.out.println("Paths with sum " + k + ":");
        pathSum(root, k);
    }
}
