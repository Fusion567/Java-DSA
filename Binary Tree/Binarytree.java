import java.util.*;

class Binarytree{
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    //Preorder Traversal - Uses recursion
    static void preorder(Node root){
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    //Inorder Traversal - Uses recursion 
    static void inorder(Node root){
        if (root== null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    //postorder Traversal - Uses recursion
    static void postorder(Node root){
        if (root== null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    //levelorder Traversal - Uses Iteration
    static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println(" ");
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNode = countOfNodes(root.left);
        int rightNode =  countOfNodes(root.right);

        int totalNode = leftNode + rightNode +1;

        return totalNode;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum =  sumOfNodes(root.right);

        int totalNode = leftSum + rightSum + root.data;

        return totalNode;
    }

    //Height of Tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight =  height(root.right);

        int maxHeight = Math.max(leftHeight,rightHeight) + 1;

        return maxHeight;
    }

    //Diameter of Tree , Time Complexity = O(n^2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int dia1 = diameter(root.left);
        int dia2 =  diameter(root.right);
        int dia3 = height(root.left)+height(root.right)+1;

        int maxDia = Math.max(dia3 ,Math.max(dia1,dia2));

        return maxDia;
    }


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Preorder :");
        preorder(root);
        System.out.println("Inorder :");
        inorder(root);
        System.out.println("Postorder: ");
        postorder(root);
        System.out.println("Levelorder: ");
        levelorder(root);
        System.out.println("Count of Nodes: "+countOfNodes(root));
        System.out.println("Sum of Nodes: "+ sumOfNodes(root));
        System.out.println("Height of Tree: "+ height(root));
        System.out.println("Diameter of Tree: "+ diameter(root));
    }
}