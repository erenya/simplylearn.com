package my_practice;

//Java code for stack implementation 

import java.io.*; 
import java.util.*; 

public class StackPushMethod 
{    
 // Pushing element on the top of the stack 
 static void stack_push(Stack<Integer> k, int min, int max) 
 { 
     for(int i = min; i <= max; i++) 
     { 
         if (i%2==0) {
        	 k.push(i);
         }
     }
     
     System.out.println(k);
     System.out.println("Size of the array is: " +k.size());
 } 
   
 

 public static void main (String[] args) 
 { 
     Stack<Integer> stack = new Stack<Integer>(); 
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter min: ");     
     int input1 = sc.nextInt();
     
     System.out.println("Enter max: ");     
     int input2 = sc.nextInt();

     stack_push(stack, input1, input2); 
    
  
 } 
} 
