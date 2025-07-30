import java.util.ArrayList;

public class BST {
    
    static class Node{
        int data;
        Node left;
        Node right;
    
        Node(int data){
            this.data = data;
        }
    }

    //Time Complexity O(H)
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        //left subtree
        if(root.data>val){
            root.left = insert(root.left, val);
        }else{//right subtree
            root.right = insert(root.right, val);
        }
        
        return root;
    }

    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        //left subtree
        if(root.data>key){
            return search(root.left, key);
        }else if(root.data == key){
            return true;
        }else{//right subtree
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if(root == null){
            return root;
        }
        //left subtree
        if(root.data>val){
            root.left = delete(root.left, val);
        }else if(root.data<val){//right subtree
            root.right = delete(root.right, val);
        }else{//root.data == val
            //case 1:
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2:
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3:
            Node IS = inorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }
        
        return root;
    }

    public static Node inorderSuccesor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    
    public static void printInRange(Node root,int x, int y){
        if(root == null){
            return;
        }

        if (x <= root.data && y >= root.data) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }else if(y <= root.data){
            printInRange(root.left, x, y);
        }else{
            printInRange(root.right, x, y);
        }
    } 

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        
        path.add(root.data);

        //leaf
        if (root.left == null && root.right == null) {
            printPath(path);
        }else{//non-leaf
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }

        path.remove(path.size()-1);

    }

    public static void main(String args[]){
        int values [] = {8,5,3,6,10,11,14};
        Node root =  null;    
        
        for(int i = 0; i < values.length; i++){
            root = insert(root,values[i]);
        }
        Inorder(root);
        System.out.println();

        if(search(root,7)){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }

        delete(root, 4);
        Inorder(root);
        System.out.println();

        System.out.println("Print in Range: ");
        printInRange(root, 3, 10);
        System.out.println();

        System.out.println("Root to leaf:");
        printRoot2Leaf(root, new ArrayList<>());
    }
}