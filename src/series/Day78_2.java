package series;

public class Day78_2 {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static TreeNode sortedArrayToBST(int[] arr, int start, int end) {

        if (start > end) return null;

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(arr[mid]);

        root.left = sortedArrayToBST(arr, start, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, end);

        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] arr = {-10, -3, 0, 5, 9};

        TreeNode root = sortedArrayToBST(arr, 0, arr.length - 1);

        System.out.print("Inorder: ");
        inorder(root);
    }
}
