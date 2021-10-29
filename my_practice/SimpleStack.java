package my_practice;

import java.util.Stack;

public class SimpleStack {

	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<Integer>();
		
		Stack<Integer> stk2 = new Stack<Integer>();
		
		stk2.push(3);
		
		stk.push(12);
		stk.push(15);		
		System.out.println(stk);
		System.out.println(stk.size());
		stk.push(11);
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		stk.add(17);
		System.out.println(stk);
		stk.add(1, 5);
		System.out.println(stk);
		stk.addAll(stk2);
		System.out.println(stk);
		
		stk.addElement(81);
		System.out.println(stk);
		
		//What is capacity?
		int cap = stk.capacity();
		System.out.println(cap);
		
		stk.clear();
		System.out.println(stk);
		
		Stack<Integer> stk3 = new Stack<>();
		
		stk3.add(12);
		stk3.addElement(45);
		stk3.add(2,90);

		
		stk.push(17);
		
		stk.addAll(stk3);
		System.out.println(stk);
		
		stk.clone();
		
		System.out.println(stk);
		
		stk.push(17);
		
		stk.push(11);
		System.out.println(stk);
		
		boolean status = stk.contains(12);
		System.out.println(status);
		
		status = stk.containsAll(stk3);
		
		System.out.println(status);
		

		
		System.out.println(stk.elementAt(2));
		
		System.out.println(stk);
		System.out.println(stk.firstElement());
		System.out.println(stk.lastElement());
		
		//Remove the element at index 3
		System.out.println(stk.remove(3));
		System.out.println(stk);
		
		//removeAll removes  stack(collection) from the stack
		System.out.println(stk.removeAll(stk3));
		System.out.println(stk);
		
		//Add insert a new element. Dosnt replace
		stk.add(1,43);
		System.out.println(stk);
		
		stk.removeElement(17); //Boolean (true:false)
		System.out.println(stk);
		
		
		System.out.println(stk.removeIf(n -> (n % 17 == 0)));		
		System.out.println(stk);
		
		//Search 11 gives us the position of the element from top
		System.out.println(stk.search(11));
		System.out.println(stk.search(43));
		
		stk.clear();
		
		for (int i=0; i<100; i=i+5) {
			stk.add(i);
		}
		System.out.println(stk);
		
		for (int i=0; i<100; i=i+10) {
			stk.pop();
			//stk.remove(i) will give an error because it removes with index
		}
		
		System.out.println(stk);
		
		stk.push(25);
		System.out.println(stk);
		
		System.out.println(stk.indexOf(25)); //It return the first index of 25
		System.out.println(stk.lastIndexOf(25));
		
		//set() method sets the element at index 3 to 12
		stk.set(3, 12);
		System.out.println(stk);
		
		System.out.println("Size before: " + stk.size());
		
		//stk.setSize(12);		
		System.out.println("Size after: " + stk.size());
		
		//get() method returns to element at index 4
		System.out.println(stk.get(4));
		
		System.out.println(stk.getClass());
		
		//System.out.println(stk.toString());
		
		System.out.println(stk.push(12));
		System.out.println(stk);
		System.out.println("Size now: " + stk.size());
		
		System.out.println(stk);
		for (int i : stk) {
            System.out.println("Element at index " +stk.indexOf(i) + " is " +i);
        }	
		
		
		
	}

}
