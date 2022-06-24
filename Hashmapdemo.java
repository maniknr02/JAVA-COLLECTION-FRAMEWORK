import java.util.*;
public class Hashmapdemo {
    public static void main(String args[])
    {
        // Creating an empty HashMap
        Map <String, Integer> hm
            = new HashMap<String, Integer>();
  
        // Inserting pairs in above Map
        // using put() method
        hm.put("a",100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
  
        // Traversing through Map using for-each loop
        for(String k: hm.keySet()){
            System.out.println(k+" "+hm.get(k));
        }
    }
    
}
