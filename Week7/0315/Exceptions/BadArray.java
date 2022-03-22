/**
   This program causes an error and crashes.
*/

public class BadArray
{
   public static void main(String[] args)
   {
      // Create an array with 3 elements.
      int[] numbers = { 11, 22, 33 };
      int fail = 0;
      try{
        //fail = 2 / 0;
        for (int i = 0; i <= 3; i++){
          System.out.println(numbers[i]);
        }
        System.out.println("This line won't run.");
      } 
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Got an index out of bounds exception");  
        System.out.println("The error message is: " + e.getMessage());
        System.out.println("The stack trace is: " + e.getStackTrace());
        StackTraceElement[] t = e.getStackTrace();
        System.out.println(t.length);
        System.out.println(t[0]);
      }
      catch(ArithmeticException e){
        System.out.println("Got an Aritmetic exception");
      }
      catch (Exception e){
        System.out.println("General exception.");
      }
      finally{
        System.out.println("Finally always runs");
      }
      
      
      System.out.println("After try block, program exection continues");
   }
}



