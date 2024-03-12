class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right
         
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if not root or root == p or root == q:
            return root
        left = self.lowestCommonAncestor(root.left, p, q)
        right = self.lowestCommonAncestor(root.right, p, q)

        if not left:
            return right
        if not right:
            return left
    
        return root

if __name__ == "__main__":
    root = TreeNode(4)
    root.left = TreeNode(3)
    root.right = TreeNode(8)
    root.left.left = TreeNode(1)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)
    
    p = root.left
    q = root.left.left

    tree_node = TreeNode()
    result = tree_node.lowestCommonAncestor(root, p, q)
    print("Lowest Common Ancestor:", result.val)