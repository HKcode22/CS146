public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){
    }

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int root, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q){
            return root;
        }

        if(p.val > root.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(p.val < root.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else{
            return root;
        }
    }


}
