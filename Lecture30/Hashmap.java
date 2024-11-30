package Lecture30;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
// import java.util.Map;
// import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        TreeMap<Integer,Integer> tmap=new TreeMap<>();
        LinkedHashMap<Integer,Integer> lmap=new LinkedHashMap<>();

        hmap.put(1, 10);
        hmap.put(10, 20);
        hmap.put(5, 30);
        hmap.put(-5, 10);

        
        tmap.put(1, 10);
        tmap.put(10, 20);
        tmap.put(5, 30);
        tmap.put(-5, 10);

        lmap.put(1, 10);
        lmap.put(10 ,20);
        lmap.put(5,0);
        lmap.put(-5 ,10);

        
        // Set<Integer> set=hmap.keySet();
        // for (Integer i : set) {
        //     System.out.println(i+" : "+ hmap.get(i));
        // }
        // System.out.println();
    
        // Set<Integer> tset=tmap.keySet();
        // for (Integer i : tset) {
        //     System.out.println(i+" : "+ tmap.get(i));
        // }
        // System.out.println();

        // Set<Integer> lset=lmap.keySet();
        // for (Integer i : lset) {
        //     System.out.println(i+" : "+ lmap.get(i));
        // }
        // System.out.println();

        for(Entry<Integer,Integer> e : hmap.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }



    }
}
