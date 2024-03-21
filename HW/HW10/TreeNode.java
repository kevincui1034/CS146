import java.util.ArrayList;
import java.util.List;

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        level(0, root, result);
        return result;
    }

    private void level(int depth, TreeNode node, List<List<Integer>> result) {
        if (node == null)
            return;

        if (result.size() <= depth)
            result.add(new ArrayList<>());

        result.get(depth).add(node.val);
        level(depth + 1, node.left, result);
        level(depth + 1, node.right, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        TreeNode levelOrder = new TreeNode(4);
        List<List<Integer>> result = levelOrder.levelOrder(root);
        System.out.println(result);
    }
}