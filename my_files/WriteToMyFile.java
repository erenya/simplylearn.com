package my_files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToMyFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("myfile.txt");
      myWriter.write("hi!");
      myWriter.write("My Name is Engin!");
      myWriter.close();
      System.out.println("Successful");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}