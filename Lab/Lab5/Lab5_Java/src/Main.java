// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how


        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);

        root.right = new TreeNode(8);
        root.right.right = new TreeNode(9);
        root.right.left = new TreeNode(5);


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(4);

        root2.right = new TreeNode(8);
        root2.right.right = new TreeNode(6);
        root2.right.left = new TreeNode(5);

        TreeNode check = new TreeNode();

        if(check.isValidBST(root)){
            System.out.println("This is a valid binary");
        }
        else{
            System.out.println("This is an invalid binary");
        }


        if(check.isValidBST(root2)){
            System.out.println("This is a valid binary");
        }
        else{
            System.out.println("This is an invalid binary");
        }


    }
}