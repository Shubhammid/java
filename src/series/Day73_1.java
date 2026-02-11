package series;

class Day73_1 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static int count = 0;
    static int result = -1;

    public static int kthLargest(Node root, int k) {
        count = 0;
        result = -1;
        reverseInorder(root, k);
        return result;
    }

    private static void reverseInorder(Node root, int k) {
        if (root == null || count >= k)
            return;

        reverseInorder(root.right, k);

        count++;
        if (count == k) {
            result = root.data;
            return;
        }

        reverseInorder(root.left, k);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int k = 3;

        int ans = kthLargest(root, k);
        System.out.println(k + "rd Largest Element: " + ans);
    }
}
