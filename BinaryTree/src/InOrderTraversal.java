public class InOrderTraversal {
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
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }

    private static void inOrder(Node root){
        // inorder - left, root, right

        //base case -> root un null olmasi

        if(root == null) return;

        //recursive call
        else{
            inOrder(root.left);
            System.out.print(root.val +"->");
            inOrder(root.right);
        }
    }

    private static void preOrder(Node root){
        // preorder - root, left, right

        //base case -> root un null olmasi

        if(root == null) return;
            //recursive call
        else{
            System.out.print(root.val +"->");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private static void postOrder(Node root){
        // postorder -left, right, root

        //base case -> root un null olmasi

        if(root == null) return;
            //recursive call
        else{
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val +"->");
        }
    }


}
