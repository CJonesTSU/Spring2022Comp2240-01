import java.io.*;

public class FileWriter{
  public static void main(String[] args) throws FileNotFoundException{
    PrintWriter myPrintWriter = new PrintWriter("MyExample.txt");
    myPrintWriter.println("This is a new file.");
    myPrintWriter.println();
    for(int i = 0; i < 10; i++){
      myPrintWriter.println("Index is: " + i + " printed just like normal but written to a file");
    }
    myPrintWriter.println("We only live once, so don't screw it up!");
    myPrintWriter.close();
  }
}