class TreeNode(object):
    
    def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right
         
    def isValidBST(self, root):
        if root == None:
            return None
        self.isValidBST(root.left)
        self.isValidBST(root.right)
        if root.left < root.right & root.right > root.left:
            return True
        else:
            return False