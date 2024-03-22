// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(9);
        root.right.left = new TreeNode(5);

//        int p = 3, q = 1;
//        System.out.println(root.val);

        TreeNode p = root.left;
        TreeNode q = root.left.left;

        TreeNode p2 = root.left.left;
        TreeNode q2 = root.right.left;

        TreeNode lowestCommonAncestor = new TreeNode();
        TreeNode t = lowestCommonAncestor.lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor: " + t.val);


        TreeNode t2 = lowestCommonAncestor.lowestCommonAncestor(root, p2, q2);
        System.out.println("Lowest Common Ancestor: " + t2.val);



    }
}