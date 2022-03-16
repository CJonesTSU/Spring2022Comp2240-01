import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class FileReader {
  public static void main(String[] arg)throws IOException{
    ArrayList<String[]> myTokens = new ArrayList<>();
    File myFile = new File("ProteinDataShort.csv");
    Scanner inputFile = new Scanner(myFile);
    // String firstLine = inputFile.nextLine();
    // System.out.println(firstLine);
    // String secondLine = inputFile.nextLine();
    // System.out.println(secondLine);
    while(inputFile.hasNext()){
      String fileLine = inputFile.nextLine();
      //System.out.println(fileLine);
      String[] temp = fileLine.split(",");
      myTokens.add(temp);
      //System.out.println();
    }
    System.out.println(myTokens.size());
    for(String s : myTokens.get(1)){
      System.out.println(s);
    }
    inputFile.close();
  }
}