class DiaTree {
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

    static class diaTree{
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
    
    static class TreeInfo{
        int height;
        int dia;

        TreeInfo(int height,int dia){
            this.height = height;
            this.dia = dia;
        }
    }

    public static TreeInfo Diameter(Node root){

        if(root == null){
            return new TreeInfo (0,0);
        }
        TreeInfo left = Diameter(root.left);
        TreeInfo right = Diameter(root.right);

        int myHeight = Math.max(left.height,right.height)+1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.height + right.height + 1;

        int myDia = Math.max(Math.max(dia1,dia2),dia3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDia);
        
        return myInfo;
    }
       
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = diaTree.buildTree(nodes);
        System.out.println("Diameter of Tree: "+ Diameter(root).dia);
    }
}