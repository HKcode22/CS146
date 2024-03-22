class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):
     
     self.val = val
     
     self.left = left
     
     self.right = right

    def isValidBST(self, root):
       return self.isValidBST2(root, None, None)
    
    def isValidBST2(self, node, lower, upper):
       if node is None:
          return True
       
       if (upper is not None and upper <= node.val) or (lower is not None and lower >= node.val):
            return False
       
       return self.isValidBST2(node.left, lower, node.val) and self.isValidBST2(node.right, node.val, upper)
          

if __name__ == "__main__":
   
   root = TreeNode(4)
   root.left = TreeNode(3)
   root.left.left = TreeNode(1)

   root.right = TreeNode(8)
   root.right.right = TreeNode(9)
   root.right.left = TreeNode(5)


   root2 = TreeNode(1)
   root2.left = TreeNode(2)
   root2.left.left = TreeNode(3)
   root2.left.right = TreeNode(4)

   root2.right = TreeNode(8)
   root2.right.right = TreeNode(6)
   root2.right.left = TreeNode(5)

   check = TreeNode()

   if check.isValidBST(root):
      print("This is a valid binary")
   else:
      print("This is an invalid binary")

   if check.isValidBST(root2):
      print("This is a valid Binary")
   else:
      print("This is an invalid binary")
    

       
