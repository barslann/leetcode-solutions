public class SumOfABinaryTree {

    static Node root;

    static{
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
    }


    public static void main(String[] args) {
        int sumofTree = sumTree(root);
        System.out.println("Sum of the given tree is: " + sumofTree);
    }

    public static int sumTree(Node root){
        //base case
        if(root == null) return 0;

        //recursive call
        return root.val + sumTree(root.left) + sumTree(root.right);
    }
}


/*
    Verilen binary treenin elemanlarinin toplamini donen bi kod yazin.


    base case - root == null -> 0
    recursive call -> root.val + recursion(root.left) + recursion(root.right);




    return root.val + root.left.val + root.right.val;
 */