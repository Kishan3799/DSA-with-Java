import java.util.*;

//implementation of Binary Search tree

public class BST {
    // class Node of BST 
    class Node {
        int data;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
            left = right = null;
        }
    }

    //root Node of tree 
    Node root;

    BST () {
        root = null;
    }

    //Insert Key in Tree Function
    void insert(int key){
        root = insertNode(root, key);
        System.out.println("Inserted Key is " + key);
    } 
    //Insert Node Function
    Node insertNode(Node root , int item) {
        //root is equal to null
        if(root == null) {
            root = new Node(item);
            return root; 
        }

        //root is not null 
        // Node  is less then root  then set Node in left sub tree 
        if(item < root.data){
            root.left = insertNode(root.left, item);
        }
        //Node is greater then  root then set Node in right sub tree
        else if (item > root.data) {
            root.right = insertNode(root.right, item);
        }

        return root;

    }

    // Search opperation 
    boolean search(Node root, int x) {
        if(root == null) {
            return false;
        }

        if(root.data == x) {
             return true;
        }

        if(root.data > x) {
            return search(root.left, x);
        }
        if(root.data < x) {
            return search(root.right, x);
        }

        return true;
        
    }

    // Delete operation

    Node deleteNode(Node root , int value) {
        if(root == null){
            return null;
        }
        if(value < root.data){
            root.left = deleteNode(root.left, value);
        }
        else if(value > root.data){
            root.right = deleteNode(root.right, value);
        }
        else {
            if ( root.left == null){
                return root.right;
            }
            else if ( root.right == null ) {
                return root.left;
            }
            root.data = minVal(root.right);
            
            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }

    int minVal(Node root) {
        int minv = root.data;
        while(root.left != null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    //check if tree is BST of not\
    boolean isBST(Node root ){
        return isBSTUtil(root , Integer.MIN_VALUE, Integer.MAX_VALUE);
    } 

    boolean isBSTUtil( Node node , int min , int max) {
        if(node == null){
            return true;
        }

        if(node.data < min || node.data > max){
            return false;
        }

        return ( isBSTUtil(node.left, min, node.data -1) && isBSTUtil(node.right, node.data + 1 , max) ); 
    }

    void inorder(Node root){
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
        
    }

    public static void main(String[] args) {
        BST tree = new BST();
        
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        System.out.println("Inorder traversal");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println( tree.search(tree.root, 4));
    
        tree.deleteNode(tree.root, 3);
        System.out.println("Inorder traversal");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println( tree.isBST(tree.root) +  " is Bst ");
    }
}
