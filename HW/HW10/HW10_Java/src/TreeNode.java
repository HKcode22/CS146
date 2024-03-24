import java.util.ArrayList;
import java.util.List;
public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {

        this.val = val;

        this.left = left;

        this.right = right;

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> orderlist = new ArrayList<>();
        if(root==null){
            return orderlist;
        }
        levelOrder2(root, orderlist, 0);
        return orderlist;
    }

    public void levelOrder2(TreeNode node, List<List<Integer>> order, int i){

        if(node==null){
            return;
        }
        if(i == order.size()){
            order.add(new ArrayList<>());
        }

        order.get(i).add(node.val);
        levelOrder2(node.left, order,i+1);
        levelOrder2(node.right, order, i+1);

    }


}

