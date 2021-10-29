package my_files;
import java.io.File;
import java.io.IOException;

public class CreateFile {
  public static void main(String[] args) {
    try {
      File obj= new File("temp.txt");
      if (obj.createNewFile()) {
        System.out.println("A file with the name " + obj.getName() +" is created.");
      } else {
        System.out.println(obj.getName() + "  already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}