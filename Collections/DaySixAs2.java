package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class DaySixAs2 {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        
        System.out.println("Enter 6 Programming languages: ");
        
        Scanner input = new Scanner(System.in); // comnnad line to take user input
        String l1 = input.nextLine();
        String l2 = input.nextLine();
        String l3 = input.nextLine();
        String l4 = input.nextLine();
        String l5 = input.nextLine();
        String l6 = input.nextLine();
        
        
        treeSet.add(l1);
        treeSet.add(l2);
        treeSet.add(l3);
        treeSet.add(l4);
        treeSet.add(l5);
        treeSet.add(l6);
        
        System.out.println("TreeSet is : " + treeSet);
        System.out.println("Check if TreeSet is empty : " + treeSet.isEmpty());
        
        treeSet.remove(l2);
        treeSet.remove("PHP");
        
        System.out.println(treeSet.contains("PHP"));
        
        System.out.println("Enter 3 MORE  Programming languages: ");
        
        String l7 = input.nextLine();
        String l8 = input.nextLine();
        String l9 = input.nextLine();
        
        treeSet.add(l7);
        treeSet.add(l8);
        treeSet.add(l9);
        System.out.println(treeSet);
        treeSet.clear();
        System.out.println(treeSet);
    }
}