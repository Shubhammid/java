package series;

public class Day107_1 {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int findDistance(TreeNode root, int p, int q) {
        TreeNode lca = findLCA(root, p, q);

        int d1 = findLevel(lca, p, 0);
        int d2 = findLevel(lca, q, 0);

        return d1 + d2;
    }

    private TreeNode findLCA(TreeNode root, int p, int q) {
        if (root == null || root.val == p || root.val == q) {
            return root;
        }

        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

    private int findLevel(TreeNode root, int target, int level) {
        if (root == null) {
            return -1;
        }

        if (root.val == target) {
            return level;
        }

        int left = findLevel(root.left, target, level + 1);

        if (left != -1) {
            return left;
        }

        return findLevel(root.right, target, level + 1);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        Day107_1 obj = new Day107_1();
        int distance = obj.findDistance(root, 4, 7);
        System.out.println("Distance between 4 and 7 = " + distance);
    }
}