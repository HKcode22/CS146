class TreeNode(object):
    
    def __init__(self, val=0, left=None, right=None):
        
        self.val = val

        self.left = left

        self.right = right
        
    def invertTree(self, root):
        if not root:
            return None
        
        temp = root.left

        root.left = root.right
        root.right = temp

        self.invertTree(root.left)
        self.invertTree(root.right)

        return root
    

def printTree(root):
    if root is None:
        return
    
    printTree(root.left)
    print(root.val, end=" ")
    printTree(root.right)

if __name__ == "__main__":
    print("Testing")

    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(8)
    root.left.left = TreeNode(3)
    root.left.right = TreeNode(4)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(6)

    print("Original Tree: ")
    printTree(root)
    print("\n")

    ir = TreeNode()
    invertTree = ir.invertTree(root)

    print("Inverted Tree: ")
    printTree(invertTree)
    
    print("\n")



        
        

