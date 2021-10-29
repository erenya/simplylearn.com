package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class DaySixAs4_LinkedHashMap {
	
  public static void main(String[] args) {
        
	    Map<Integer, String> Fruits = new LinkedHashMap<Integer, String>();
        
	    Fruits.put(1, new String("Apple"));
	    Fruits.put(2, new String("Melon"));
	    Fruits.put(3, new String("Cherry"));
	    Fruits.put(4, new String("Pear"));
	    Fruits.put(5, new String("Banana"));
	    Fruits.put(6, new String("Mango"));
        
        
        System.out.println(Fruits);
        
        System.out.println("\nThe size of the LinkedHashMap is : " + Fruits.size());
        System.out.println("\nIs the map empty : " + Fruits.isEmpty());
        System.out.println("\nMap contains 5 as key? : " + Fruits.containsKey(5));
        System.out.println("\nLinkedHashMap contains HCL as value? : " + Fruits.containsValue("Banana"));
        Fruits.remove(3); //Removes cherry
        System.out.println("\nContent of LinkedHashMap after removing key 3: " + Fruits);
       
        Fruits.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + Fruits);
        
   
    }
}

// Check the video and make it an assignment.