package ixlquiz;

import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Random rand=new Random();
	    
	    int score = 0;
	    int questions_answered = 0;
	    int correct = 0;
	    int incorrect = 0;
	    
	    while (true){
	        
	        int x=rand.nextInt(10);
	        int y=rand.nextInt(10);
	        int operator_index=rand.nextInt(3);
	        String[] list_operator ={"+", "-", "*"};
	        int result;
	        String operator=list_operator[operator_index];
	        
	        String[] grades ={"Brilliant!", "Great Job!", "Fantastic!", "Terrific!", "Awasome!", "Wonderful!"};
	        int grade_index=rand.nextInt(6);
	        String grade =grades[grade_index];
	        
	        if (operator=="+"){
	            result = x + y;
	        }
	        else if (operator=="-"){
	            result = x - y;
	        }
	        else{
	            result = x * y;
	            
	        }
	    
	     Scanner myObj = new Scanner(System.in);
	     System.out.println("What is "+ x + operator +y+"?");
	     int user_answer = myObj.nextInt();
	     
	     if(result==user_answer){
	         if (score>=90 && score<100){
	             score +=2;
	             questions_answered+=1;
	             correct+=1;
	             
	             }
	       
	         
            else {
                score +=10;
                questions_answered+=1;
                 correct+=1;
	       }
	       
	        System.out.println(grade +" Score: "+score);
	         
	     }
        else {
            score -=5;
            questions_answered+=1;
             incorrect+=1;
            System.out.println("Sorry. Score: "+score);
            
        }
        
         if (score>=100){
	             score=100;
	             break;
	         }
	         
	    }
	    System.out.println("You have mastered the skill and earned a gold medal.");
	    System.out.println( "Questions Answered: "+questions_answered);
	    System.out.println( "correct: "+correct);
	    System.out.println( "Incorrect: "+incorrect);
	    System.out.println( "Smart Score: "+score);

	}
}