import java.util.*;

class List {
    public static void main(String[] args) {
        LinkedList <String> list  = new LinkedList<String>();

        list.addLast("a");
        list.addFirst("is");

        list.addFirst("This");
        // by default option is last
        list.add("list");

        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ " -> ");
        }

        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}
