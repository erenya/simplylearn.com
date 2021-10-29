package my_files;

import java.io.File;

public class RenameFile {
	
	public static void main(String[] args) {
	      File oldName = new File("abc.txt");
	      File newName = new File("ABC.txt");
	      
	      if(oldName.renameTo(newName)) {
	         System.out.println("renamed");
	      } else {
	         System.out.println("Error");
	      }
	   }

}
