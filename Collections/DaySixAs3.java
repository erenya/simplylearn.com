package Collections;

import java.util.LinkedList;

public class DaySixAs3 {
  public static void main(String[] args) {
    LinkedList<String> L3 = new LinkedList<String>();
    L3.add("January");
    L3.add("February");
    L3.add("March");
    L3.add("April");
    L3.add("May");
    System.out.println(L3);
    
    L3.set(2, "June");
    System.out.println(L3);
    
    System.out.println(L3.getFirst());
    System.out.println(L3.getLast());
    System.out.println(L3.contains("March"));
    
    
    
    
  }
}