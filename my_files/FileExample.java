package my_files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
   public static void main(String[] args) {
      try {
         String content = "This is an example.";
         File file = new File("abc.txt");
         if (!file.exists()) {
            file.createNewFile();
         } 
         FileWriter fw = new FileWriter(file.getAbsoluteFile());
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write(content);
         bw.close();
         
         System.out.println("Done");
         System.out.println(content + "added.");
      } catch (IOException e) {
         e.printStackTrace();
      } 
   } 
}