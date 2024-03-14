import java.util.*;

public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {

        this.val = val;

        this.left = left;

        this.right = right;

    }

    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prevNode = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (prevNode != null && root.val <= prevNode.val) {
                return false;
            }
            prevNode = root;
            root = root.right;
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode solution = new TreeNode();

        System.out.println("Test Case 1:");
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(8);
        root1.left.left = new TreeNode(1);
        root1.right.left = new TreeNode(5);
        root1.right.right = new TreeNode(9);
        boolean result1 = solution.isValidBST(root1);
        System.out.println(result1);

        System.out.println("Test Case 2:");
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(8);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.left = new TreeNode(5);
        root2.right.right = new TreeNode(6);
        boolean result2 = solution.isValidBST(root2);
        System.out.println(result2);
    }
}