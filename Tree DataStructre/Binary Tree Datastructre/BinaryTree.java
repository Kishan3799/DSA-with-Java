import java.util.*;



class Node {
    int data;
    Node leftNode;
    Node rightNode;

    Node (int data) {
        this.data = data;
        leftNode = null;
        rightNode = null;
    }
}
class BinaryTree {
    Node root;
    
    BinaryTree(int data){
        root = new Node(data);
    }

    BinaryTree(){
        root = null;
    }

    //Inorder traversal
    void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.leftNode);
        System.out.print(root.data + " ");
        inorder(root.rightNode);

    }
    //PreOrder Traversal
     void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.leftNode);
        preorder(root.rightNode);
        
    }
    //PostOrder Traversal
     void postorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.leftNode);
        preorder(root.rightNode);
        System.out.print(root.data + " ");

    }

    //Height of a binary tree
    int heightOfTree(Node root){
        if(root == null){return 0;}

        int height_left_Subtree = heightOfTree(root.leftNode);
        int height_Right_Subtree = heightOfTree(root.rightNode);
        return Math.max(height_left_Subtree, height_Right_Subtree) + 1 ;
    }

    //Size of binary tree {
    int sizeOfTree(Node root){
        if(root == null){
            return 0;
        }

        return sizeOfTree(root.leftNode) + sizeOfTree(root.rightNode) + 1;
    }

    //Maximum value in binary Tree
    int maxValue(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(maxValue(root.leftNode), maxValue(root.rightNode)));
    }

    //Level Order Traversal == O(n2)
    //Function to print level order
    void printLevelOrder(){
        int height = heightOfTree(root);
        for (int i = 1; i<=height; i++){
            printCurrLevel(root, i);
        }
    }
    // function Print currnet level
    void printCurrLevel(Node root , int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.print(root.data + " ");
        }
        else if(level>1){
            printCurrLevel( root.leftNode, level - 1);
            printCurrLevel( root.rightNode, level - 1);

        }
    }

    void printLevelOrder2(Node root)
    {
        if(root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            Node currNode = queue.remove();
            if(currNode == null) {
                System.out.println();

                if(queue.isEmpty()){
                    break;
                }
                else {
                    queue.add(null);
                }

            } else 
            {
                System.out.print(currNode.data + " ");
            
                if(currNode.leftNode != null){
                    queue.add(currNode.leftNode);
                }

                if(currNode.rightNode != null){
                    queue.add(currNode.rightNode);
                }
            }
        }
    }

    public static void main(String[] args) {
       BinaryTree tree = new BinaryTree();

       tree.root = new Node(1);
       tree.root.leftNode = new Node(2);
       tree.root.rightNode = new Node(3);
       tree.root.leftNode.leftNode = new Node(4);
       tree.root.leftNode.rightNode = new Node(5);
       tree.root.rightNode.rightNode = new Node(6);

       System.out.println("Inorder Traversal");
       tree.inorder(tree.root);
       System.out.println();
       
       System.out.println("PreOrder Traversal");
       tree.preorder(tree.root);
       System.out.println();
        
       System.out.println("PostOrder Traversal");
       tree.postorder(tree.root);
        System.out.println();

       System.out.println("Height of tree " + tree.heightOfTree(tree.root));
       System.out.println("Size of tree " + tree.sizeOfTree(tree.root));
       System.out.println("Max Value of tree " + tree.maxValue(tree.root));

       System.out.println("Level order travesal");
       tree.printLevelOrder();
       
       System.out.println("Level order travesal using queue");
       tree.printLevelOrder2(tree.root);
        
    }
}