import java.io.*;

/**
   This program opens a binary file and writes the contents
   of an int array to the file.
*/

public class WriteBinaryShortHand{
   public static void main(String[] args) throws IOException{
      // An array to write to the file
      int[] numbers = {12,55};
      
      // Create the binary output objects.
      // FileOutputStream fstream = new FileOutputStream("Numbers.dat", true);
      DataOutputStream outputFile = new DataOutputStream(new FileOutputStream("Numbers.dat", true));
    
      System.out.println("Writing the numbers to the file...");

      // Write the array elements to the file.    
      for (int i = 0; i < numbers.length; i++)
         outputFile.writeInt(numbers[i]);
    
      System.out.println("Done.");
      
      // Close the file.
      outputFile.close();   
   }
}
