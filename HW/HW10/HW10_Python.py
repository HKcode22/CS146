from typing import Optional, List
from collections import deque


class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):

        self.val = val

        self.left = left

        self.right = right

class T2:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        orderlist = []
        self.levelOrder2(root, orderlist, 0)
        return orderlist
        
    def levelOrder2(self, node, orderlist, i):
        if not node:
            return
        
        if len(orderlist) == i:
            orderlist.append([])

        orderlist[i].append(node.val)

        self.levelOrder2(node.left, orderlist, i+1)
        self.levelOrder2(node.right, orderlist, i+1)

def main():
    root = TreeNode(4)
    root.left = TreeNode(3)
    root.left.left = TreeNode(1)
    root.right = TreeNode(8)
    root.right.left = TreeNode(5)
    root.right.right = TreeNode(9)

    order = T2()
    print(order.levelOrder(root))

if __name__ == "__main__":
    main()