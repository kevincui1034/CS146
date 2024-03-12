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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null || root == p || root == q)
            return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null){
            return right;
        }
        if  (right == null) {
            return left;
        }
        else 
            return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        // Test case with p = 3 and q = 1
        TreeNode treeNode = new TreeNode();
        TreeNode p = root.left;
        TreeNode q = root.left.left;
        TreeNode result = treeNode.lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor: " + result.val);
    }
}