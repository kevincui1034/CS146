from typing import List, Optional
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val

        self.left = left

        self.right = right
         
def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
    result = []
    count = 0
    def level(count , root):
        if root == None:
            return 

        if len(result) <= count:
            result.append([])    
        
        result[count].append(root.val)
        count += 1
        level(count , root.left)
        level(count , root.right) 

    level(count , root)
    return result

root = TreeNode(4)
root.left = TreeNode(3)
root.left.left = TreeNode(1)
root.right = TreeNode(8)
root.right.left = TreeNode(5)
root.right.right = TreeNode(9)

print(levelOrder(root))