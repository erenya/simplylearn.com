package Collections;

import java.util.HashSet;
import java.util.Map;

public class DaySixAs1 {
	
	  public static void main(String[] args) {
	        
		  HashSet<String> L1 = new HashSet<String>();
		    L1.add("Volvo");
		    L1.add("BMW");
		    L1.add("Ford");
		    L1.add("BMW");
		    L1.add("Mazda");
		    System.out.println(L1);
		    
		    
		    HashSet L2 = new HashSet();
		    L2.add("Volvo");
		    L2.add(true);
		    L2.add('A');
		    L2.add(12);
		    L2.add(12.34);
		    System.out.println(L2);
		    
		    
  }
	}