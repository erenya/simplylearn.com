package my_practice;

public class ReverseString
{
   public void reverseStringMethod(String str)
   {

	String[] words = str.split(" ");
	String reversedString = "";
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {

		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
	System.out.println("Before Reversed: " + str);
	System.out.println("After Reversed: " + reversedString);
   }
   public static void main(String[] args) 
   {
	ReverseString obj = new ReverseString();
	obj.reverseStringMethod("I LOVE JAVA");
   }
}