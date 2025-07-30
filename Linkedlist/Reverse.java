
class Reverse {
    Node head;
    private int size;

    Reverse(){
        this.size = size;
    }

    class Node{
        
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //addFirst
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add at last
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next =  newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("Head is emoty");
            return;
        }
        size --;
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Head is empty");
            return;
        }
        
        size--;

        //If there is only  1 element in LL
        if(head.next==null){
            head = null;
            return;
        }

        Node secLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secLast = secLast.next;
        }

        secLast.next = null;
    }

    public int getSize(){
        return size;
    }   

    //Iterative way to reverse linked list Time complexity - O(n)       Space complexity - O(1)

    public void reverseIterate(){

        if (head == null|| head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) { 
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nextNode; 
        }
        head.next = null;
        head = prevNode;
    }


    //Recursive Method  Time complexity - O(n)      Space complexity - O(1) 
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head);
        head.next.next = head;
        head.next = null;

        return  newHead;
    }

    public static void main(String[] args) {
        Reverse list = new Reverse();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.reverseIterate();
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

    }
}
