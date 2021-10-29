package strings;

public class ClassP  {
	
	
	public static void main(String[] args) {
		
		//System.out.println("The value of k is: " +new ClassM().x); Since the x is private, it will give an error.
		System.out.println("The value of y is: " +new ClassM().y);
		System.out.println("The value of z is: " +new ClassM().z);
		
		//Printing the variables of the class ClassN
		System.out.println("The value of a is: " +new ClassN().a);
		System.out.println("The value of b is: " +new ClassN().b);	
		System.out.println("The value of c is: " +new ClassN().c);
		

	}
	
	public void methodP() {
		System.out.println("MethodP() from class P");
		
	}		
		

}
