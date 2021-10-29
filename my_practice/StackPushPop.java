package my_practice;

import java.util.Stack;

public class StackPushPop {
	
	static void strPush(Stack<Integer> stack, int n) {
		
		stack.push(n);
		stack.push(n+2);
		
		
		System.out.println(stack);
		
	}
	
	static void strPop(Stack<Integer> stack) {
		
		stack.pop();
		
		System.out.println(stack);
		
	}
	
	static void strAdd(Stack<Integer> stack) {
		
		stack.add(18);
		System.out.println(stack);
		
	}
	
	static void strAddAll(Stack<Integer> stack) {
		
		stack.add(2, 11);
		System.out.println(stack);
		
		stack.addAll(3, stack);
		System.out.println(stack);
		
	}

	public static void main(String[] args) {
		
		Stack stack = new Stack ();
		
		strPush(stack ,12);
		
		strPop(stack);
		strAdd(stack);
		
		strAddAll(stack);

	}

}
