class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right
        
        ## Print to check
        print(val)
    
    def invertTree(self, root):
        if not root:
            return root
        self.invertTree(root.left)
        self.invertTree(root.right)

        root.left, root.right = root.right, root.left
        
        ## Print to check
        print(root.val)
        return root

if __name__ == "__main__":
    
    print("Tree: ")
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(8)
    root.left.left = TreeNode(3)
    root.left.right = TreeNode(4)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(6)
print("Tree Inversed: ")
result = root.invertTree(root)
print("Root: " , result.val)