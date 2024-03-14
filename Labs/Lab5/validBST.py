class TreeNode(object):
    
    def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right
         
    def isValidBST(self, root):
        stack = []
        prev_node = None
        while root or stack:
            while root:
                stack.append(root)
                root = root.left

            root = stack.pop()
            if prev_node != None and root.val <= prev_node.val:
                return False
            
            prev_node = root
            root = root.right
        return True

if __name__ == "__main__":
    
    print("Test Case 1: ")
    root = TreeNode(4)
    root.left = TreeNode(3)
    root.right = TreeNode(8)
    root.left.left = TreeNode(1)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)
    
    tree_node = TreeNode()
    result = tree_node.isValidBST(root)
    print(result)
    
    print("Test Case 2: ")
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(8)
    root.left.left = TreeNode(3)
    root.left.right = TreeNode(4)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(6)
    
    result = tree_node.isValidBST(root)
    print(result)