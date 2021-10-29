package my_files;

import java.io.File;

public class CheckFileExists {
   public static void main(String[] args) {
      File file = new File("abc.txt");
      
      if (file.exists()) {
    	  System.out.println("This file exists.");
      }
    	  else {
    		  
    		  System.out.println("This file does not exists.");  
    		  
    	  }
      }
   }
