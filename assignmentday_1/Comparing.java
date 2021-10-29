package assignmentday_1;

public class Comparing {
 

public static void main(String args[]){ 
	
	String t= "Delhi";   
	String o = "Mumbai"; 
	String k= "delhi";   
	String y= new String ("Mumbai");   
	String l= new String ("delhi");  
	String p = new String("Hello");

if (o.equals(l)){
    System.out.println(true);
}
else {
   System.out.println(false); 
}

if (t.equals(l)){
    System.out.println(true);
}
else {
   System.out.println(false); 
}

if (o.equals(y)){
    System.out.println(true);
}
else {
   System.out.println(false); 
}
if (o ==y){
    System.out.println(true);
}
else {
   System.out.println(false); 
}
if (p ==y){
    System.out.println(true);
}
else {
   System.out.println(false); 
}

}
}