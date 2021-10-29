package my_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {  
  public static void main(String[] args) {  
    try {
      File myObj = new File("myfile.txt");
      Scanner scanner = new Scanner(myObj);  
      while (scanner.hasNextLine()) {
        String txt = scanner.nextLine();
        System.out.println(txt);
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("There is a problem.");
      e.printStackTrace();
    } 
  }  
}