package Collections;


import java.util.*;

class Example{
	public static void main(String[] args){
		
		//LinkedHashSet<String> hs=new LinkedHashSet<String>();
		TreeSet ts = new TreeSet();
		
		ts.add("a");
		ts.add("b");
		ts.add("k");
		ts.add("l");
		ts.add("b");
		ts.add("n");
		ts.add("t");
		ts.add('s');
		ts.add(true);
				
		System.out.println("Hashset is "+ts);
		System.out.println("Size of Hashset is "+ ts.size());
		
		System.out.println("Does hashset contains this 'u' element  " + ts.contains("u"));		
		System.out.println("is hashset empty  " + ts.isEmpty());
		System.out.println("remove the element "+ts.remove("i"));
		
		
	    ts.clear();
	    System.out.println("get class  " +ts.getClass());
		
	    System.out.println("is hashset empty  " +ts.isEmpty());
	    
	    
		
	}
}