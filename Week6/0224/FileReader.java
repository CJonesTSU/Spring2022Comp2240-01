import java.util.Scanner;
import java.io.*;

public class FileReader {
  public static void main(String[] arg)throws IOException{
    File myFile = new File("TestFile.txt");
    Scanner inputFile = new Scanner(myFile);
    String firstLine = inputFile.nextLine();
    System.out.println(firstLine);
    String secondLine = inputFile.nextLine();
    System.out.println(secondLine);
  }
}