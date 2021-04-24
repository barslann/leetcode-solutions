public class HeightOfABinaryTree {
    static Node root;

    static{
        root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        root.left.left.left = new Node(10);

    }

    public static void main(String[] args) {
        int heightofTree = calculateHeight(root);
        System.out.println("Height of the tree is: " + heightofTree);
    }

    public static int calculateHeight(Node root){
        if(root == null) return -1;
        return 1 + Math.max(calculateHeight(root.left),calculateHeight(root.right));
    }



}

/*
       Verilen agacin yuksekligini bulunuz.

       // base case
        -> if(root == null) return -1;



        1.adim -> return 1 + Math.max(calculateHeight(2),calculateHeight(null))
        2.adim ->


 */