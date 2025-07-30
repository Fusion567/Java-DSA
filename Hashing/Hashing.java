import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();

        //Insert
        set.add(5);
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(2);

        //Size
        System.out.println("Size of set :" + set.size());

        //Search
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set does not contain 6");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain - we deleted 1");
        }

        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        //HasNext, next
        while (it.hasNext()) {
              System.out.println(it.next());
        }
    }
}