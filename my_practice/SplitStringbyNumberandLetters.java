package my_practice;

import java.util.ArrayList;
import java.util.List;

public class SplitStringbyNumberandLetters {
	
	public static void main(String[] args) 
	   {
	
	String s = "C3H20IO";

	char Chem = '-';
	String val = "";
	boolean isFisrt = true;
	List<Character> chemList = new ArrayList<Character>();
	List<Integer> weightList = new ArrayList<Integer>();
	for (char c : s.toCharArray()) {
	    if (Character.isLetter(c)) {
	        if (!isFisrt) {
	            chemList.add(Chem);
	            weightList.add(Integer.valueOf(val.equals("") ? "1" : val));
	            val = "";
	        }
	        Chem = c;
	    } else if (Character.isDigit(c)) {
	        val += c;
	    } 
	    isFisrt = false;
	}
	chemList.add(Chem);
	weightList.add(Integer.valueOf(val.equals("") ? "1" : val));

	System.out.println(chemList);
	System.out.println(weightList);

}}

