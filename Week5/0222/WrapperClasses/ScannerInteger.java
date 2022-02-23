import java.util.Scanner;

public class ScannerInteger{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    String inputString = keyboard.nextLine();
    System.out.println("inputstring is: " + inputString);
    int inputInt = Integer.parseInt(inputString);
    System.out.println("the integer version of the inputString is: " + inputInt);
  }
}