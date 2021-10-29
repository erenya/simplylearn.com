package Collections;

import java.util.Iterator;
import java.util.Stack;

public class DaySixAs5_Stack {
	
	public static void main(String[] args) {
		
		Stack mystack = new Stack();
		
		mystack.push("Gray");
		mystack.push("Red");
		mystack.push("Blue");
		mystack.push("Red");
		mystack.push("White");
		mystack.push(12);
		mystack.push(45);
		mystack.push(12);
		mystack.push(12.24);
		mystack.push(12.08);
		
		Iterator iterator = mystack.iterator();  
		while(iterator.hasNext())  
		{  
		Object values = iterator.next();  
		System.out.println(values);   
		
		
		}
		
		
		System.out.println(mystack.peek()); 
		
	}

}
