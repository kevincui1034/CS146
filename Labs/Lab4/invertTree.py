class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right
    
    def invertTree(self, root):
        left, right = root.left, root.right