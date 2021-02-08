public class BalancedBinaryTree110 {
    private static TreeNode root;

    static{
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right= new TreeNode(7);
    }

    public static void main(String[] args) {
        boolean balancedResult = isBalanced(root);
        String result = balancedResult == true ? "yes" : "no";
        System.out.println("Given tree is balanced?  ---> " + result);
    }

    public static boolean isBalanced(TreeNode root) {
        // base case
        if(root == null) return true;


        int leftHeight  = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1) return false;
        else return true && isBalanced(root.left) && isBalanced(root.right);

    }

    private static int calculateHeight(TreeNode root){

        //base case
        if(root == null) return -1;
        //recursive case
        return 1 + Math.max(calculateHeight(root.left),calculateHeight(root.right));
    }
}
