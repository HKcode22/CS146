class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right
         
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root is None or root == p or root == q:
            return root
        if p.val > root.val and root.val < q.val:
            return self.lowestCommonAncestor(root.right, p, q)
        if p.val < root.val and root.val > q.val:
            return self.lowestCommonAncestor(root.left, p, q)
        else:
            return root
        

root = TreeNode(4)
root.left = TreeNode(3)
root.left.left = TreeNode(1)
root.right = TreeNode(8)
root.right.right = TreeNode(9)
root.right.left = TreeNode(5)

p = root.left
q = root.left.left

p2 = root.left.left
q2 = root.right.left

lowestCommonAncestor = TreeNode()

t = lowestCommonAncestor.lowestCommonAncestor(root, p, q)
print("Lowest Common Ancestor: ", t.val)

t2 = lowestCommonAncestor.lowestCommonAncestor(root, p2, q2)
print("Lowest Common Ancestor ", t2.val)
