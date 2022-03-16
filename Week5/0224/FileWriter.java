import java.io.*;

public class FileWriter{
  public static void main(String[] args) throws FileNotFoundException{
    PrintWriter myPrintWriter = new PrintWriter("TestFile.txt");
    myPrintWriter.println("Hi there!");
    myPrintWriter.print("Chris");
    myPrintWriter.print(" ");
    myPrintWriter.print("Jones");
    myPrintWriter.println();
    for(int i = 0; i < 10; i++){
      myPrintWriter.println("Index is: " + i + " just like normal but written to a file");
    }
    myPrintWriter.println("We only live once, so don't screw it up!");
    myPrintWriter.close();
  }
}