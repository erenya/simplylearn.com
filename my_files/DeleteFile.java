package my_files;

import java.io.File; 

public class DeleteFile {
  public static void main(String[] args) { 
    File obj = new File("temp.txt"); 
    if (obj.delete()) { 
    	System.out.println("A file with the name " + obj.getName() +" is deleted.");
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}