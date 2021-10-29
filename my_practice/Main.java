package my_practice;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> mystack = new Stack();
		for (int i=0; i<10; i++) {
			mystack.push(i);
		}
		
		for (int i : mystack) {
			System.out.print(i +" ");	
		}
	}
}
