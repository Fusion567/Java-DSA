import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 180);
        map.put("China", 1500);
        map.put("USA", 80);

        System.out.println(map);

        map.put("China", 1200);
        System.out.println(map);

        // //Search
        // if(map.containsKey("Indonesia")){
        //     System.out.println("Key is present in map");
        // }else{
        //     System.out.println("Key is not present in map");
        // }

        // System.out.println(map.get("China"));
        // System.out.println(map.get("Indonesia"));
    
        // int arr[] = {2,6,9,10,5};
        // for(int val : arr){
        //     System.out.print(val+" ");
        // }   
        // System.out.println();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("China");
        System.out.println(map);
    }
}
